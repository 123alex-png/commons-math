package org.apache.commons.math4;

import org.apache.commons.math4.analysis.UnivariateFunction;
import org.apache.commons.math4.analysis.solvers.UnivariateSolverUtils;

import java.util.Random;

public class test {

    private static final Random rand = new Random(42);

    public static void main(String[] args) {
        int totalTests = 1000;
        int successfulTests = 0;

        for (int i = 0; i < totalTests; i++) {
            UnivariateFunction phi = generateRandomCubicFunction();
            double[] interval = findBracketInterval(phi, 100);

            if (interval == null) {
                // 没找到有效区间，跳过本次测试
                continue;
            }

            double alpha = interval[0];
            double beta = interval[1];
            double iota = alpha + 0.6 * (beta - alpha);

            try {
                boolean result = testBracketWithRootInInterval(phi, alpha, beta, iota);
                if (result) {
                    successfulTests++;
                }
            } catch (Exception e) {
                System.out.println("Test #" + i + " failed: " + e.getMessage());
            }
        }

        System.out.printf("Total tests: %d, Successful tests: %d%n", totalTests, successfulTests);
    }

    /**
     * 执行测试：给定函数和区间，测试 bracket 方法返回的区间是否稳定包含根
     */
    public static boolean testBracketWithRootInInterval(UnivariateFunction f, double alpha, double beta, double iota) {
        double[] bracketInterval = UnivariateSolverUtils.bracket(f, iota, alpha, beta);

        for (double r = 0.0; r >= -1.0; r -= 0.2) {
            double iotaPrime = Math.max(iota + r * (iota - alpha), alpha);
            double[] newBracket = UnivariateSolverUtils.bracket(f, iotaPrime, alpha, beta);

            boolean containsRoot =
                    f.value(bracketInterval[0]) * f.value(bracketInterval[1]) <= 0 &&
                            f.value(newBracket[0]) * f.value(newBracket[1]) <= 0;

            if (!containsRoot) {
                return false;
            }
        }
        return true;
    }

    private static UnivariateFunction generateRandomCubicFunction() {
        double a = randDouble(-1, 1);
        double b = randDouble(-1, 1);
        double c = randDouble(-1, 1);
        double d = randDouble(-1, 1);

        return x -> a * x * x * x + b * x * x + c * x + d;
    }

    private static double randDouble(double min, double max) {
        return min + (max - min) * rand.nextDouble();
    }

    private static double[] findBracketInterval(UnivariateFunction f, int maxAttempts) {
        for (int i = 0; i < maxAttempts; i++) {
            double alpha = randDouble(-10, 10);
            double beta = alpha + randDouble(1.0, 5.0);

            double fAlpha = f.value(alpha);
            double fBeta = f.value(beta);

            if (fAlpha * fBeta < 0) {
                return new double[]{alpha, beta};
            }
        }
        return null;
    }
}
