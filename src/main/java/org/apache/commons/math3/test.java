package org.apache.commons.math3;

import org.apache.commons.math3.distribution.LogNormalDistribution;

import java.util.Random;

public class test {

    private static final int NUM_TESTS = 100_000;
    private static final double EPSILON = 1e-12;
    private static final Random random = new Random(42);

//    public static void main(String[] args) {
//        int passed = 0;
//
//        for (int i = 0; i < NUM_TESTS; i++) {
//            double scale = 0.1 + 10.0 * random.nextDouble(); // ∈ [0.1, 10.1]
//            double shape1 = 1e-10 + (2.0 - 1e-10) * random.nextDouble(); // shape1 ∈ (0, 2]
//
//            try {
//                testVarianceIncreasesWithShape(scale, shape1);
//                passed++;
//            } catch (AssertionError e) {
//                System.err.println("❌ Test failed at iteration " + i);
//                System.err.printf("  scale = %.10f%n", scale);
//                System.err.printf("  shape1 = %.10f%n", shape1);
//                System.err.println("  " + e.getMessage());
//                System.exit(1); // 立即退出
//            }
//        }
//
//        System.out.println("✅ All tests passed: " + passed + " cases.");
//    }

    /**
     * 测试 LogNormal 分布在 shape 增大时，方差是否严格增大。
     * 失败时抛出 AssertionError。
     */
    public static void testVarianceIncreasesWithShape(double scale, double shape1) {
        double delta = 0.1 + 0.4 * random.nextDouble();  // ∈ [0.1, 0.5]
        double shape2 = shape1 * (1.0 + delta);          // shape2 > shape1

        double var1 = getVariance(scale, shape1);
        double var2 = getVariance(scale, shape2);

        if (!Double.isFinite(var1) || !Double.isFinite(var2)) {
            return; // 跳过非法数值
        }

        if (!(var2 > var1 + EPSILON)) {
            throw new AssertionError(String.format(
                    "Variance did not increase as expected: var1 = %.12f, var2 = %.12f (delta = %.3g)",
                    var1, var2, var2 - var1));
        }
    }

    private static double getVariance(double scale, double shape) {
        LogNormalDistribution dist = new LogNormalDistribution(scale, shape);
        return dist.getNumericalVariance();
    }
}
