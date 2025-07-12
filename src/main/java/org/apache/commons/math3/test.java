package org.apache.commons.math3;

import org.apache.commons.math3.geometry.euclidean.oned.IntervalsSet;
import org.apache.commons.math3.geometry.euclidean.twod.*;
import org.apache.commons.math3.geometry.partitioning.RegionFactory;
import org.apache.commons.math3.geometry.partitioning.SubHyperplane;

import java.util.ArrayList;

public class test {

    private static final double EPSILON = 1e-8;

//    public static void main(String[] args) {
//        int testCount = 100;
//        for (int t = 0; t < testCount; t++) {
//            Vector2D[][] polygon1 = randomPolygons(10);
//            Vector2D[][] polygon2 = randomPolygons(10);
//            Vector2D offset = new Vector2D(randomDouble(-50, 50), randomDouble(-50, 50));
//
//            try {
//                testDifferenceOffsetPreservation(polygon1, polygon2, offset);
//            } catch (AssertionError e) {
//                System.err.println("❌ Test failed at iteration #" + t);
//                System.err.println("Offset: " + offset);
//                e.printStackTrace();
//                System.exit(1);
//            }
//        }
//
//        System.out.println("✅ All tests passed.");
//    }

    /** 封装的核心测试逻辑，偏移前后的差集结构应一致。 */
    public static void testDifferenceOffsetPreservation(Vector2D[][] vertices1, Vector2D[][] vertices2, Vector2D offset) {
        RegionFactory<Euclidean2D> factory = new RegionFactory<>();
        PolygonsSet set1 = buildSet(vertices1);
        PolygonsSet set2 = buildSet(vertices2);
        PolygonsSet diffOriginal = (PolygonsSet) factory.difference(set1, set2);

        Vector2D[][] offset1 = translateVertices(vertices1, offset);
        Vector2D[][] offset2 = translateVertices(vertices2, offset);
        PolygonsSet diffOffset = (PolygonsSet) factory.difference(buildSet(offset1), buildSet(offset2));

        Vector2D[][] originalVerts = diffOriginal.getVertices();
        Vector2D[][] offsetVerts = diffOffset.getVertices();

        if (originalVerts.length != offsetVerts.length) {
            throw new AssertionError("Polygon ring count mismatch");
        }

        for (int i = 0; i < originalVerts.length; i++) {
            if (originalVerts[i].length != offsetVerts[i].length) {
                throw new AssertionError("Vertex count mismatch in ring " + i);
            }
            for (int j = 0; j < originalVerts[i].length; j++) {
                Vector2D expected = originalVerts[i][j].add(offset);
                Vector2D actual = offsetVerts[i][j];
                if (expected.distance(actual) > EPSILON) {
                    throw new AssertionError(String.format(
                        "Mismatch at ring %d, vertex %d: expected %s, actual %s",
                        i, j, expected, actual
                    ));
                }
            }
        }
    }

    /** 构建 PolygonsSet */
    private static PolygonsSet buildSet(Vector2D[][] vertices) {
        ArrayList<SubHyperplane<Euclidean2D>> edges = new ArrayList<>();
        for (Vector2D[] ring : vertices) {
            int n = ring.length;
            for (int i = 0; i < n; i++) {
                edges.add(buildSegment(ring[i], ring[(i + 1) % n]));
            }
        }
        return new PolygonsSet(edges);
    }

    private static SubHyperplane<Euclidean2D> buildSegment(Vector2D start, Vector2D end) {
        Line line = new Line(start, end);
        double lower = line.toSubSpace(start).getX();
        double upper = line.toSubSpace(end).getX();
        return new SubLine(line, new IntervalsSet(lower, upper));
    }

    private static Vector2D[][] translateVertices(Vector2D[][] original, Vector2D offset) {
        Vector2D[][] result = new Vector2D[original.length][];
        for (int i = 0; i < original.length; i++) {
            Vector2D[] ring = original[i];
            Vector2D[] translated = new Vector2D[ring.length];
            for (int j = 0; j < ring.length; j++) {
                translated[j] = ring[j].add(offset);
            }
            result[i] = translated;
        }
        return result;
    }
}
