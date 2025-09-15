package org.apache.commons.math3;


//import org.apache.commons.math3.geometry.spherical.oned.Arc;
//import org.apache.commons.math3.geometry.spherical.oned.ArcsSet;
//
//
//import static java.lang.Math.*;
//
//import org.apache.commons.math3.geometry.spherical.oned.*;
//
//import java.util.Random;
//
//public class test {
//
//    private static final Random random = new Random(42); // 固定种子
//    private static double tolerance = 1e-3;
//
//    public static class SplitResult {
//        public final double keptLength;
//        public final double removedLength;
//
//        public SplitResult(double kept, double removed) {
//            this.keptLength = kept;
//            this.removedLength = removed;
//        }
//    }
//
//    /**
//     * 核心测试逻辑方法，传入原始 arc 和 cutter 输入
//     * 若结果不一致，则抛出 AssertionError
//     */
//    public static void testShiftedArcConsistency(double a, double b, double x, double y) {
//        if (a < 0 || b < 0 || x < 0 || y < 0) {
//            return;
//        }
//        // Normalize arc directions
//        if (!isArcPositive(a, b)) {
//            return;
//        }
//        if (!isArcPositive(x, y)) {
//            return;
//        }
//
//        SplitResult srcOut = splitArc(a, b, x, y, tolerance);
//
//        double shift = tolerance / 2.0;
//        double flw_a = a + shift;
//        double flw_b = b + shift;
//
//        SplitResult flwOut = splitArc(flw_a, flw_b, x, y, tolerance);
//
//        double deltaKept = abs(srcOut.keptLength - flwOut.keptLength);
//        double deltaRemoved = abs(srcOut.removedLength - flwOut.removedLength);
//
//        if (deltaKept > tolerance * 1.1) {
//            throw new AssertionError(String.format("Kept length mismatch: %.6f vs %.6f (Δ=%.6g)", srcOut.keptLength, flwOut.keptLength, deltaKept));
//        }
//        if (deltaRemoved > tolerance * 1.1) {
//            throw new AssertionError(String.format("Removed length mismatch: %.6f vs %.6f (Δ=%.6g)", srcOut.removedLength, flwOut.removedLength, deltaRemoved));
//        }
//    }
//
//
//    private static SplitResult splitArc(double a, double b, double x, double y, double tolerance) {
//        ArcsSet mainArc = new ArcsSet(a, b, tolerance);
//        Arc cuttingArc = new Arc(x, y, tolerance);
//        ArcsSet.Split split = mainArc.split(cuttingArc);
//        double kept = (split.getPlus() != null) ? split.getPlus().getSize() : 0.0;
//        double removed = (split.getMinus() != null) ? split.getMinus().getSize() : 0.0;
//        return new SplitResult(kept, removed);
//    }
//
//
//    private static boolean isArcPositive(double a, double b) {
//        double diff = b - a;
//        return diff > 0 && diff < 2 * Math.PI;
//    }
//
//    public static void main(String[] args) {
//        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1, (double) 0, (double) (short) 1);
//    }
//}

import org.apache.commons.math3.geometry.spherical.oned.Arc;
import org.apache.commons.math3.geometry.spherical.oned.ArcsSet;
public class test {

        private static double tolerance = 1e-3;

    // 封装 ArcSet 的 splitArc 方法为静态方法
    private static SplitResult splitArc(double a, double b, double x, double y, double tolerance) {

        // 被测逻辑
        ArcsSet mainArc = new ArcsSet(a, b, tolerance);
        Arc cuttingArc = new Arc(x, y, tolerance);
        ArcsSet.Split split = mainArc.split(cuttingArc);

        double kept = (split.getPlus() != null) ? split.getPlus().getSize() : 0.0;
        double removed = (split.getMinus() != null) ? split.getMinus().getSize() : 0.0;

        // 容差判断
        if (kept < tolerance) kept = 0.0;
        if (removed < tolerance) removed = 0.0;

        return new SplitResult(kept, removed);
    }

    // MR 测试方法
    public static void testMetamorphicMR(double a, double b, double x, double y, double tolerance) {
        if (a < 0 || a >= 2 * Math.PI) return;
        if (b < 0 || b >= 2 * Math.PI) return;
        if (x < 0 || x >= 2 * Math.PI) return;
        if (y < 0 || y >= 2 * Math.PI) return;
        if (tolerance <= 0) return;
        if (!isArcPositive(a, b)) {
            return;
        }
        if (!isArcPositive(x, y)) {
            return;
        }
        // 原输入
        SplitResult src = splitArc(a, b, x, y, tolerance);

        // 派生输入：向内缩 a, b 各 tolerance/2
        SplitResult flw = splitArc(a + tolerance / 2, b + tolerance / 2, x, y, tolerance);

        // MR 断言：kept + removed 总和不变
        if (src != null && flw != null) {
            double sumSrc = src.keptLen + src.removedLen;
            double sumFlw = flw.keptLen + flw.removedLen;

            if (Math.abs(sumSrc - sumFlw) > 1e-6) { // 允许浮点微小误差
                throw new RuntimeException(
                        "Metamorphic relation failed: sum changed from " + sumSrc + " to " + sumFlw
                );
            }
        }
    }

    // SplitResult 类
    public static class SplitResult {
        public final double keptLen;
        public final double removedLen;

        public SplitResult(double kept, double removed) {
            this.keptLen = kept;
            this.removedLen = removed;
        }
    }
        private static boolean isArcPositive(double a, double b) {
        double diff = b - a;
        return diff > 0 && diff < 2 * Math.PI;
    }

    public static void main(String[] args) {
        org.apache.commons.math3.test.testMetamorphicMR(0.0d, (double) 1, (double) 0, (double) (short) 1, tolerance);
    }
}
