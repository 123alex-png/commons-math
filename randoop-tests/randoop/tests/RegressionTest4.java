package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, (double) 0L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) (byte) 10);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) (byte) 1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', (double) 'a');
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) 10.0f);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) (short) 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1), (double) (byte) 100);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100L, (double) (byte) 100);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(35.0d, (double) 10L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 100.0d, 100.0d, 0.0d, 1.0d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1), (double) (-1L));
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) (short) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) 10.0f);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, (double) (-1));
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0, (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (short) 10, (double) (short) 0, (double) (-1L), 10.0d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 100L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, (double) (byte) 1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) 1.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 100L);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, 1.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 1.0f, (double) 100, (double) 1, (double) 100);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) ' ', (double) '4', (double) 1L, (double) 10.0f);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, (double) 100);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', (double) 100L);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(0.0d, (double) 0.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) (short) -1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (byte) 1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) (byte) -1);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) (short) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, (double) '#');
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(0.0d, 97.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        double double8 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass9 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (byte) 10);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (byte) -1, (double) 0, (double) 0.0f, (double) '4');
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10, (double) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) 1L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) 1);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10, (double) (-1L));
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 1, (double) 1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 10.0d, (double) 100.0f, (double) 100, (double) ' ');
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (double) 10L);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (double) 1);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) (short) 10);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1), (double) '#');
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 'a');
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (short) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        double double8 = splitResult2.removedLength;
        double double9 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (-1L));
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) 0L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) (-1.0f));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', (-1.0d));
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, (double) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 1, 10.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, (-1.0d));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10, (double) (byte) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0, (double) 'a');
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 1, (double) (byte) 1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) 1L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, 0.0d);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (-1.0d));
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, 1.0d);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) (short) -1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1.0f, (double) 1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass7 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) 1L);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '4', 0.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1.0f), (double) 100);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass7 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 'a', (double) 10.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, 32.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 'a', (double) (short) -1, 0.0d, 1.0d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100L, (double) 1L);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, (double) 0L);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) 100);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) '#');
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) 'a');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) 10, (double) 1, (double) (short) 1, 100.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) 'a');
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1.0f, 1.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, (double) 'a');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass6 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) (byte) 1);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (byte) -1, 0.0d, (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) ' ');
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, (double) 10.0f);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, 97.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass6 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 'a', (double) 10L, (double) 10.0f, (double) 1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) (byte) 1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (byte) 1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 'a', 0.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) (short) 100);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, (double) (-1L));
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, 0.0d);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) 1L);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1, (double) 10.0f, 0.0d, (double) 10.0f);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) (short) 100);
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', (double) 100);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (byte) -1, (double) 0.0f, (-1.0d), 97.0d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) 1L);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, 32.0d);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, 52.0d);
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) 0, 35.0d, (double) 0L, 35.0d);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), (double) (byte) 10);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) 0L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, 52.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, (double) '#');
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) 0.0f);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) 10L);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, (double) 0.0f);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) (-1L));
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 100, (double) 'a');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', (double) 10.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, 1.0d);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) (byte) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, (-1.0d));
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, 100.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', 0.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) (-1.0f));
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', (double) 100);
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (short) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (short) 100);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) ' ');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass6 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 32.0d + "'", double5 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (double) 'a');
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) (-1.0f));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, (double) 100.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) (byte) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (double) ' ');
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) -1, (double) (short) 100, (double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) '#');
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1.0f), (double) (short) 100);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (short) 10, 52.0d, (double) (byte) 1, (double) ' ');
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 0.0d, 35.0d, (double) 0, (double) 1.0f);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 'a', (double) (short) 100);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', (double) (short) -1);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) 10);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) 1L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, (double) 0L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, 35.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass7 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, 100.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (-1.0d));
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (byte) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) 0.0f);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, 0.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, (double) 100.0f);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (byte) 10);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100L, (double) (short) 1);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) 100L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), 35.0d);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) 1L);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, (double) 0.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(0.0d, (double) 1.0f);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) (byte) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1), 0.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) (byte) 0, (double) 100.0f, 97.0d, (double) 100.0f);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100L, 97.0d);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, 100.0d);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) 10.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (short) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.removedLength;
        double double9 = splitResult2.keptLength;
        double double10 = splitResult2.keptLength;
        double double11 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass12 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, (double) (short) 100);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, (double) (byte) -1);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, (double) (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) '4');
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, (double) (byte) 0);
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, (double) (byte) -1);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, (double) (-1));
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 10L, (double) 0.0f, (double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, (double) (byte) 1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass6 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) (short) 100);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0, (-1.0d));
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, 0.0d, (double) (short) 100, 0.0d, 97.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 100, 0.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 0.0d, (double) 0, (double) (-1), (double) (short) 0);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) (byte) 10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(97.0d, (double) (byte) 0);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass9 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 100L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, 35.0d);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, (double) 0);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, (double) 10.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass6 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, (double) (short) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.removedLength;
        double double8 = splitResult2.removedLength;
        double double9 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, 35.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, 97.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(35.0d, (double) 10L);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) -1, (double) '#');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 1, (double) (byte) 10);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 'a', (double) 10L);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1.0f), 0.0d);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), (double) (short) 10);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 10, 32.0d);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1), (double) (-1L));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, (double) ' ');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 32.0d + "'", double3 == 32.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', (double) (byte) -1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) ' ', 52.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) 100);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 100, (double) ' ');
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, 35.0d);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 1.0d, (double) 100L, 10.0d, (double) (byte) 100);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', 100.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), 10.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 0, 100.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass7 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), 0.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '#', (double) (short) 100);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 10L);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) (-1.0f));
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1.0f, (double) (short) 10);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, 100.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, 100.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(35.0d, (double) '#');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 35.0d + "'", double5 == 35.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100.0f, 0.0d);
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) -1, (double) 0L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (short) 0, (double) (byte) 10, (double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100, 10.0d);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) 'a');
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 97.0d + "'", double3 == 97.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 97.0d + "'", double5 == 97.0d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), (double) 0.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) (-1));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) (-1.0f));
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(1.0d, 10.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, 100.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1, 0.0d);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0L, (double) (short) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass8 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 1, (double) 1.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, 35.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 97.0d, (double) (short) 100, (double) (short) -1, 10.0d);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10.0f, (double) 0);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 100, (double) (short) 100);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) 100.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        double double8 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10, (double) (-1.0f));
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(35.0d, (double) 10L);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 10.0f, (double) (short) -1, (-1.0d), 10.0d);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) 1);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (byte) 100, (double) 0);
        double double3 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0.0f, (double) 100.0f);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) (byte) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(0.0d, (double) (short) 0);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), (double) (byte) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        java.lang.Class<?> wildcardClass7 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) 10, (double) 1L, (double) 0, (double) 10L);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), (double) (byte) -1);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 100L, (double) ' ');
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 0, (double) 0.0f);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 10L, (double) (byte) 10);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass5 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 10.0d + "'", double3 == 10.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) (short) 100);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(10.0d, (double) 1.0f);
        double double3 = splitResult2.removedLength;
        java.lang.Class<?> wildcardClass4 = splitResult2.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0d + "'", double3 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) 1.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.removedLength;
        double double6 = splitResult2.removedLength;
        double double7 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 1L, (double) 1.0f);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) '4', (double) 1.0f);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (-1L), 35.0d);
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 35.0d + "'", double4 == 35.0d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((-1.0d), (double) (short) 100);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 0, (double) (short) 0);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) ' ');
        double double3 = splitResult2.keptLength;
        double double4 = splitResult2.removedLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.removedLength;
        double double8 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 100.0d + "'", double3 == 100.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 10L, (double) 100.0f, (double) 1, (double) 'a');
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) (byte) 0);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.keptLength;
        double double5 = splitResult2.keptLength;
        double double6 = splitResult2.keptLength;
        double double7 = splitResult2.keptLength;
        double double8 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(100.0d, (double) (byte) 0);
        double double3 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (byte) 1, (double) (-1L), (double) (byte) 0, (double) 1L);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(32.0d, (double) (byte) -1);
        double double3 = splitResult2.removedLength;
        double double4 = splitResult2.removedLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + (-1.0d) + "'", double3 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) 'a', (double) 1);
        java.lang.Class<?> wildcardClass3 = splitResult2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult((double) (short) 10, (double) ' ');
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        org.apache.commons.math3.test.SplitResult splitResult2 = new org.apache.commons.math3.test.SplitResult(52.0d, (double) ' ');
        double double3 = splitResult2.keptLength;
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 10.0d, 97.0d, (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 0.0d, (double) (byte) 1, 0.0d, (double) (short) 100);
    }
}

