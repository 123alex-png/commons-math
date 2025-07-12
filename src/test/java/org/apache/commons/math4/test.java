package org.apache.commons.math4;


import java.util.HashSet;
import java.util.Set;

import org.apache.commons.math4.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math4.geometry.euclidean.threed.Line;
import org.apache.commons.math4.geometry.euclidean.threed.Plane;
import org.apache.commons.math4.geometry.euclidean.threed.PolyhedronsSet;
import org.apache.commons.math4.geometry.euclidean.threed.SubPlane;
import org.apache.commons.math4.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math4.geometry.euclidean.twod.PolygonsSet;
import org.apache.commons.math4.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math4.geometry.partitioning.Region;
import org.apache.commons.math4.geometry.partitioning.SubHyperplane;
import org.junit.Test;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class test {

    static PolyhedronsSet polyset;
    static double tol = 1e-8;

    public static void createCubeFromTriangles() {
        Vector3D[] verts = new Vector3D[8];
        double xmin = -3, xmax = 3;
        double ymin = -3, ymax = 3;
        double zmin = -3, zmax = 3;
        verts[0] = new Vector3D(xmin, ymin, zmin);
        verts[1] = new Vector3D(xmax, ymin, zmin);
        verts[2] = new Vector3D(xmax, ymax, zmin);
        verts[3] = new Vector3D(xmin, ymax, zmin);
        verts[4] = new Vector3D(xmin, ymin, zmax);
        verts[5] = new Vector3D(xmax, ymin, zmax);
        verts[6] = new Vector3D(xmax, ymax, zmax);
        verts[7] = new Vector3D(xmin, ymax, zmax);
        //
        int[][] faces = new int[12][];
        faces[0] = new int[]{3, 1, 0};    // bottom (-z)
        faces[1] = new int[]{1, 3, 2};    // bottom (-z)
        faces[2] = new int[]{5, 7, 4};    // top (+z)
        faces[3] = new int[]{7, 5, 6};    // top (+z)
        faces[4] = new int[]{2, 5, 1};    // right (+x)
        faces[5] = new int[]{5, 2, 6};    // right (+x)
        faces[6] = new int[]{4, 3, 0};    // left (-x)
        faces[7] = new int[]{3, 4, 7};    // left (-x)
        faces[8] = new int[]{4, 1, 5};    // front (-y)
        faces[9] = new int[]{1, 4, 0};    // front (-y)
        faces[10] = new int[]{3, 6, 2};    // back (+y)
        faces[11] = new int[]{6, 3, 7};    // back (+y)
        //
        Set<SubHyperplane<Euclidean3D>> pset = new HashSet<>();
        for (int f = 0; f < faces.length; f++) {
            int[] vidx = faces[f];
            Plane p = new Plane(verts[vidx[0]], verts[vidx[1]], verts[vidx[2]], tol);
            Vector2D p0 = p.toSubSpace(verts[vidx[0]]);
            Vector2D p1 = p.toSubSpace(verts[vidx[1]]);
            Vector2D p2 = p.toSubSpace(verts[vidx[2]]);
            PolygonsSet lset = new PolygonsSet(tol, p0, p1, p2);
            pset.add(new SubPlane(p, lset));
        }
        polyset = new PolyhedronsSet(pset, tol);
    }
    @Test
    public void testMetamorphicDirectionChange() {
        System.out.println("== Running Metamorphic Direction-Change Test (Randomized) ==");

        createCubeFromTriangles();  // 初始化立方体

        double tol = 1e-8;
        int numTests = 1000;
        int passed = 0;
        int failed = 0;

        for (int i = 0; i < numTests; i++) {

            // Step 1: 原始射线起点和方向
            Vector3D srcOrigin = new Vector3D(0, 0, 0);  // 起点固定，远离立方体
            Vector3D randomDir = new Vector3D(
                    0.5 + Math.random(),
                    Math.random() - 0.5,
                    Math.random() - 0.5).normalize();

            Line srcLine = new Line(srcOrigin, srcOrigin.add(randomDir), tol);
            SubHyperplane<Euclidean3D> srcPlane = polyset.firstIntersection(srcOrigin, srcLine);

            if (srcPlane == null) {
                System.out.println("⚠️ Source ray missed the cube. Skipping this test.");
                continue;
            }

            Plane srcP = (Plane) srcPlane.getHyperplane();
            Vector3D srcNormal = srcP.getNormal();

            // Step 2: 构造 follow-up 射线方向
            double delta = 2 * (randomDir.getX() + randomDir.getY() + randomDir.getZ());
            Vector3D flwDir = randomDir.subtract(new Vector3D(delta, delta, delta)).normalize();
            Vector3D flwOrigin = srcOrigin;

            Line flwLine = new Line(flwOrigin, flwOrigin.add(flwDir), tol);
            SubHyperplane<Euclidean3D> flwPlane = polyset.firstIntersection(flwOrigin, flwLine);

            if (flwPlane == null) {
                System.out.println("✅ Passed MR: follow-up ray missed cube");
                passed++;
                continue;
            }

            Plane flwP = (Plane) flwPlane.getHyperplane();
            Vector3D flwNormal = flwP.getNormal();

            boolean sameNormal = srcNormal.subtract(flwNormal).getNorm() < 1e-8;
            boolean oppositeNormal = srcNormal.add(flwNormal).getNorm() < 1e-8;
            if (sameNormal || oppositeNormal) {
                assertTrue(false);
            }
        }
    }



}