package org.apache.commons.math3;

import org.apache.commons.math3.distribution.EnumeratedRealDistribution;

import java.util.Arrays;

public class test {

//    public static void main(String[] args) {
//        try {
//            double[] samples = {10.0, 20.0, 30.0};
//            double[] probs = {0.2, 0.5, 0.3};
//            double[] ps = {0.3, 0.65, 0.9};
//            double scaleFactor = 2.0;
//
//            testAdditivePerturbationEffect(samples, probs, ps, scaleFactor);
//            System.out.println("Test passed.");
//        } catch (AssertionError e) {
//            System.err.println("Test failed: " + e.getMessage());
//            e.printStackTrace();
//            System.exit(1);
//        }
//    }

    /**
     * 核心测试方法：对原始样本和概率进行缩放扰动后，验证逆累积分布行为是否一致。
     * 如果输出不一致，则抛出 AssertionError。
     */
    public static void testAdditivePerturbationEffect(double[] samples, double[] probs, double[] testProbs, double k) {
        EnumeratedRealDistribution srcDist = new EnumeratedRealDistribution(samples, probs);

        // 计算原始分布在指定概率点的逆累积分布输出
        double[] srcOuts = new double[testProbs.length];
        for (int i = 0; i < testProbs.length; i++) {
            srcOuts[i] = srcDist.inverseCumulativeProbability(testProbs[i]);
        }

        // 构造扰动后的分布（样本乘以 k）
        double[] scaledSamples = new double[samples.length];
        for (int i = 0; i < samples.length; i++) {
            scaledSamples[i] = samples[i] * k;
        }

        // 注意：概率保持不变，但重新归一化是多余的（它们已经和为1），不过保留以示结构一致性
        double[] flwProbs = Arrays.copyOf(probs, probs.length);
        normalize(flwProbs);

        EnumeratedRealDistribution flwDist = new EnumeratedRealDistribution(scaledSamples, flwProbs);

        // 检查输出：扰动后结果应该是原始结果 * k
        for (int i = 0; i < testProbs.length; i++) {
            double expected = srcOuts[i] * k;
            double actual = flwDist.inverseCumulativeProbability(testProbs[i]);
            double delta = Math.abs(expected - actual);
            if (delta > 1e-9) {
                throw new AssertionError(String.format(
                        "Mismatch at p=%.3f: expected %.10f, but got %.10f (delta=%.3g)",
                        testProbs[i], expected, actual, delta));
            }
        }
    }

    // Normalize a probability vector in-place
    private static void normalize(double[] arr) {
        double sum = Arrays.stream(arr).sum();
        if (sum == 0) throw new IllegalArgumentException("Cannot normalize zero-sum array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] /= sum;
        }
    }
}
