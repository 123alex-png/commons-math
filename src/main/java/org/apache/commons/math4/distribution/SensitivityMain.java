package org.apache.commons.math4.distribution;

import org.apache.commons.math4.distribution.NormalDistribution;

import java.util.Random;

public class SensitivityMain {

    private static final double EPSILON = 1e-5;
    public static void checkSensitivityToSigma(double mu, double sigma, double x) {
        NormalDistribution src = new NormalDistribution(mu, sigma);
        NormalDistribution disturbed = new NormalDistribution(mu, sigma + EPSILON);

        double p1 = src.cumulativeProbability(x);
        double p2 = disturbed.cumulativeProbability(x);

        if (Math.abs(x - mu) > 1e-3) {
            double delta = p1 - p2;

            if (!(delta > 0)) {
                throw new IllegalStateException(String.format(
                        "Expected P1 > P2 but got: P1=%.8f, P2=%.8f, delta=%.8f", p1, p2, delta));
            }
        }
    }

    private static double randomDouble(Random r, double min, double max) {
        return min + (max - min) * r.nextDouble();
    }
}
