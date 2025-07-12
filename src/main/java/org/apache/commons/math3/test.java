package org.apache.commons.math3;

import static java.lang.Math.*;

import org.apache.commons.math3.geometry.spherical.oned.*;

import java.util.Random;

public class test {

    private static final Random random = new Random(42); // 固定种子
    private static double tolerance = 1e-3;
    public static class SplitResult {
        public final double keptLength;
        public final double removedLength;

        public SplitResult(double kept, double removed) {
            this.keptLength = kept;
            this.removedLength = removed;
        }
    }

    /**
     * 核心测试逻辑方法，传入原始 arc 和 cutter 输入
     * 若结果不一致，则抛出 AssertionError
     */
    public static void testShiftedArcConsistency(double a, double b, double x, double y) {
        // Normalize arc directions
        if (!isArcPositive(a, b)) {
            double tmp = a;
            a = b;
            b = tmp;
        }
        if (!isArcPositive(x, y)) {
            double tmp = x;
            x = y;
            y = tmp;
        }

        SplitResult srcOut = splitArc(a, b, x, y, tolerance);

        double shift = tolerance / 2.0;
        double flw_a = a + shift;
        double flw_b = b + shift;

        SplitResult flwOut = splitArc(flw_a, flw_b, x, y, tolerance);

        double deltaKept = abs(srcOut.keptLength - flwOut.keptLength);
        double deltaRemoved = abs(srcOut.removedLength - flwOut.removedLength);

        if (deltaKept > tolerance * 1.1) {
            throw new AssertionError(String.format("Kept length mismatch: %.6f vs %.6f (Δ=%.6g)", srcOut.keptLength, flwOut.keptLength, deltaKept));
        }
        if (deltaRemoved > tolerance * 1.1) {
            throw new AssertionError(String.format("Removed length mismatch: %.6f vs %.6f (Δ=%.6g)", srcOut.removedLength, flwOut.removedLength, deltaRemoved));
        }
    }

//    public static void main(String[] args) {
//        int trials = 10_000;
//        double tolerance = 1e-3;
//        int passed = 0;
//
//        for (int i = 0; i < trials; i++) {
//            double a = randomAngle();
//            double b = randomAngle();
//            while (a == b) b = randomAngle();
//
//            double x = randomAngle();
//            double y = randomAngle();
//            while (x == y) y = randomAngle();
//
//            try {
//                testShiftedArcConsistency(a, b, x, y, tolerance);
//                passed++;
//            } catch (AssertionError e) {
//                System.err.println("Trial " + i + " failed:");
//                System.err.printf("  Arc     [%.6f, %.6f]%n", a, b);
//                System.err.printf("  Cutter  [%.6f, %.6f]%n", x, y);
//                System.err.println("  " + e.getMessage());
//                System.exit(1); // 立即退出
//            }
//        }
//
//        System.out.println("All tests passed: " + passed + " trials.");
//    }

    private static SplitResult splitArc(double a, double b, double x, double y, double tolerance) {
        ArcsSet mainArc = new ArcsSet(a, b, tolerance);
        Arc cuttingArc = new Arc(x, y, tolerance);
        ArcsSet.Split split = mainArc.split(cuttingArc);
        double kept = (split.getPlus() != null) ? split.getPlus().getSize() : 0.0;
        double removed = (split.getMinus() != null) ? split.getMinus().getSize() : 0.0;
        return new SplitResult(kept, removed);
    }

//    private static double randomAngle() {
//        return random.nextDouble() * 2 * Math.PI;
//    }

    private static boolean isArcPositive(double a, double b) {
        double diff = b - a;
        return diff > 0 && diff < 2 * Math.PI;
    }
}
