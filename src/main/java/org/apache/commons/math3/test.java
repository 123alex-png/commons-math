package org.apache.commons.math3;

import org.apache.commons.math3.exception.MathInternalError;
import org.apache.commons.math3.geometry.enclosing.EnclosingBall;
import org.apache.commons.math3.geometry.enclosing.WelzlEncloser;
import org.apache.commons.math3.geometry.euclidean.threed.SphereGenerator;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.random.UnitSphereRandomVectorGenerator;
import org.apache.commons.math3.random.Well1024a;

import java.util.ArrayList;
import java.util.List;

public class test {

    private static final Well1024a rng = new Well1024a();
    private static final UnitSphereRandomVectorGenerator generator = new UnitSphereRandomVectorGenerator(3, rng);

    /**
     * 以给定的点集为基础，测试添加一些外部点后包围球半径是否变大
     * @param originalPoints 原始点集
     * @throws AssertionError 测试失败时抛出
     * @throws MathInternalError 计算失败时抛出
     */
    public static void testAddOuterPointEffect(List<Vector3D> originalPoints) throws MathInternalError {
        WelzlEncloser<Euclidean3D, Vector3D> encloser = new WelzlEncloser<>(1e-10, 2, new SphereGenerator());

        EnclosingBall<Euclidean3D, Vector3D> ball1 = encloser.enclose(originalPoints);

        // 构造包含原球外部点的扩展点集
        List<Vector3D> extendedPoints = new ArrayList<>(originalPoints);
        for (int j = 0; j < 10; j++) {
            Vector3D outerPoint = computeOuterPoint(ball1.getCenter(), ball1.getRadius());
            extendedPoints.add(outerPoint);
        }

        EnclosingBall<Euclidean3D, Vector3D> ball2 = encloser.enclose(extendedPoints);

        if (!(ball1.getRadius() < ball2.getRadius())) {
            throw new AssertionError("包围球半径未增加，测试失败。原半径: " + ball1.getRadius() + " 新半径: " + ball2.getRadius());
        }
    }

//    public static void main(String[] args) {
//        test tester = new test();
//
//        int testCount = 1000;
//        for (int i = 0; i < testCount; i++) {
//            try {
//                List<Vector3D> pts = tester.generateRandomPointsInsideSphere(10, 10.0);
//                tester.testAddOuterPointEffect(pts);
//            } catch (MathInternalError e) {
//                // 这里直接跳过失败的内部计算异常
//                System.out.println("第 " + i + " 次测试跳过，计算异常: " + e.getMessage());
//                continue;
//            } catch (AssertionError e) {
//                System.err.println("第 " + i + " 次测试失败: " + e.getMessage());
//                e.printStackTrace();
//                System.exit(1);
//            }
//        }
//
//        System.out.println("全部测试通过，共计 " + testCount + " 次。");
//    }

    private static Vector3D computeOuterPoint(Vector3D center, double radius) {
        double[] direction = generator.nextVector();
        Vector3D dirVector = new Vector3D(direction);
        double distance = radius * (1.0 + 0.1 * Math.random());
        return center.add(dirVector.scalarMultiply(distance));
    }

//    private List<Vector3D> generateRandomPointsInsideSphere(int count, double radius) {
//        List<Vector3D> points = new ArrayList<>();
//        Vector3D center = Vector3D.ZERO;
//        for (int i = 0; i < count; i++) {
//            points.add(randomPointInsideSphere(center, radius));
//        }
//        return points;
//    }

//    private Vector3D randomPointInsideSphere(Vector3D center, double radius) {
//        double r = Math.cbrt(Math.random()) * radius;
//        double[] direction = generator.nextVector();
//        Vector3D dirVector = new Vector3D(direction);
//        return center.add(dirVector.scalarMultiply(r));
//    }
}
