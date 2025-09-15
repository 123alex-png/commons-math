package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, 1.0E-15d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass9 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (short) 10, 0.0d, 5.0d);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-0.0d), (double) (-1));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(2.0d, (double) ' ');
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 2.0d + "'", double3 == 2.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0, 0.1d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.1d + "'", double3 == 0.1d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.1d + "'", double4 == 0.1d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.1d + "'", double5 == 0.1d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) ' ');
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (short) 100, 0.001d, (double) (short) -1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(0.70710678d, (double) 100);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.70710678d + "'", double3 == 0.70710678d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.70710678d + "'", double4 == 0.70710678d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.70710678d + "'", double5 == 0.70710678d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.70710678d + "'", double6 == 0.70710678d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(5.0d, 1.0E-15d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 5.0d + "'", double3 == 5.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 5.0d + "'", double4 == 5.0d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, 1.0E-6d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, 0.25d);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (-1.0d));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(42.0d, 512.0d);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), 97.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), 1.0E-6d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, 10000.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10000.0d + "'", double3 == 10000.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10000.0d + "'", double4 == 10000.0d);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 0.0d, (-100.0d), 0.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) '4');
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 0.0d, 0.0d, (double) 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 97.0d, 256.0d, 0.0d);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.math3.test.testShiftedArcConsistency(0.5d, (double) ' ', (double) 1L, 1.0E10d);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0E8d, 35.0d);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (byte) 0, 100.0d, 100.0d);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0E10d), 1024.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, 1.0E10d);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1000000.0d, (double) (short) -1);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0E-15d, 1024.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1024.0d + "'", double3 == 1024.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-15d + "'", double4 == 1.0E-15d);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) 10.0f);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

