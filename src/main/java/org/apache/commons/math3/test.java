package org.apache.commons.math3;

import java.util.*;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.ConvexHull2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.ConvexHullGenerator2D;
import org.apache.commons.math3.geometry.euclidean.twod.hull.MonotoneChain;
import org.apache.commons.math3.exception.ConvergenceException;

public class test {

    private static final Random rand = new Random(42);
    private static final double RATIO = 1e-14;

//    public static void main(String[] args) {
//        int maxAttempts = 10000;
//        int failureCount = 0;
//
//        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
//            List<Vector2D> pts = generateFixedABCase();
//
//            try {
//                testConvexHullWithPoints(pts);
//            } catch (ConvergenceException e) {
//                failureCount++;
//                System.out.println("第 " + attempt + " 次尝试中复现 ConvergenceException！");
//                System.out.println("点集顺序及坐标（第 0 个点即为新生成的近似共线点 d）：");
//                for (int i = 0; i < pts.size(); i++) {
//                    System.out.printf("  [%d] %s%n", i, pts.get(i));
//                }
//                e.printStackTrace();
//            }
//        }
//
//        if (failureCount == 0) {
//            System.out.println("在 " + maxAttempts + " 次随机测试中未复现失败。");
//        } else {
//            System.out.println("共发现 " + failureCount + " 次失败。");
//        }
//    }

    /**
     * 该方法接收点集，生成凸包并检测异常。
     * 失败时直接抛出 ConvergenceException。
     * @param pts 输入点集
     * @throws ConvergenceException 若生成凸包失败
     */
    public static void testConvexHullWithPoints(List<Vector2D> pts) throws ConvergenceException {
        ConvexHullGenerator2D generator = new MonotoneChain();
        ConvexHull2D hull = generator.generate(pts);
        if (hull.getVertices().length < 3) {
            System.err.println("警告：顶点不足 3 个 → 可能异常");
        }
    }

//    private static List<Vector2D> generateFixedABCase() {
//        Vector2D a, b, cOriginal;
//        do {
//            a = randomIntPoint();
//            b = randomIntPoint();
//            cOriginal = randomIntPoint();
//        } while (areColinear(a, b, cOriginal));
//
//        Vector2D ba = a.subtract(b);
//        int id = rand.nextInt(2);
//        double k = new double[]{0.5, 1}[id];
//        double dx = b.getX() + k * (ba.getX());
//        double dy = b.getY() + k * (ba.getY());
//        Vector2D d0 = new Vector2D(dx, dy);
//
//        Vector2D normal = new Vector2D(-ba.getY(), ba.getX()).normalize();
//        double eps = ba.getNorm() * RATIO;
//        Vector2D d = d0.add(normal.scalarMultiply(eps));
//
//        List<Vector2D> pts = new ArrayList<>();
//        if (id == 1) {
//            pts.add(d);
//        }
//        pts.add(a);
//        if (id == 0) {
//            pts.add(d);
//        }
//        pts.add(b);
//        pts.add(cOriginal);
//
//        return pts;
//    }

//    private static Vector2D randomIntPoint() {
//        int x = rand.nextInt(10) * 2;
//        int y = rand.nextInt(10) * 2;
//        return new Vector2D(x, y);
//    }

//    private static boolean areColinear(Vector2D p1, Vector2D p2, Vector2D p3) {
//        double cross =
//                (p2.getX() - p1.getX()) * (p3.getY() - p1.getY())
//                        - (p2.getY() - p1.getY()) * (p3.getX() - p1.getX());
//        return Math.abs(cross) < 1e-9;
//    }
}
