package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        double[] doubleArray5 = new double[] { 256.0d, 1.0E-8d, (-0.0d), 5.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 1.0E-8d, (-0.0d), 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        double[] doubleArray5 = new double[] { 1.0d, (short) 0, (short) 100, 0.0d, 0.001d };
        double[] doubleArray9 = new double[] { 100, (-1.0E10d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 100.0d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        double[] doubleArray3 = new double[] { (-1), 100.0d, '4' };
        double[] doubleArray9 = new double[] { (-1), 1, 1.0E-12d, 0.001d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d, 1.0E-12d, 0.001d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        double[] doubleArray6 = new double[] { (byte) 10, 1.0E-8d, (-10.0d), 1.0d, (-1.0f), 10.0d };
        double[] doubleArray13 = new double[] { 1.0d, 0.0f, 1.0d, 0.25d, (byte) 100, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-8d, (-10.0d), 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 0.0d, 1.0d, 0.25d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        double[] doubleArray3 = new double[] { 100, 1.0E-12d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-12d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        double[] doubleArray4 = new double[] { 1000000.0d, 512.0d, (short) 1, 1.0d };
        double[] doubleArray7 = new double[] { 1.0E8d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 512.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E8d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        double[] doubleArray5 = new double[] { 1.0E-15d, (byte) -1, 100, 1.0d, 0.25d };
        double[] doubleArray8 = new double[] { (short) 100, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, (-1.0d), 100.0d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        double[] doubleArray5 = new double[] { 0.9d, (byte) 1, 256.0d, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 1.0d, 256.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        double[] doubleArray3 = new double[] { 1.0E-15d, 0.3333333d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray9 = new double[] { 1.0f, (-1.0f), 1.0E8d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.3333333d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), 1.0E8d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        double[] doubleArray5 = new double[] { 1.0E-4d, 100, 1.0E-4d, 1.0E-12d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 100.0d, 1.0E-4d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0d), 1000000.0d, (-1L), 100.0d, (-1.0f), 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1000000.0d, (-1.0d), 100.0d, (-1.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        double[] doubleArray4 = new double[] { 2.0d, (byte) 100, (byte) -1, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        double[] doubleArray2 = new double[] { 1.0f, 1.0E-12d };
        double[] doubleArray8 = new double[] { (-1.0d), 100L, 1.0E-10d, (-1.0f), (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 100.0d, 1.0E-10d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        double[] doubleArray5 = new double[] { 0.5d, 1.0E-8d, 100, 1000000.0d, (short) -1 };
        double[] doubleArray12 = new double[] { 100.0f, (short) 1, 1000000.0d, 100.0f, 100, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 1.0E-8d, 100.0d, 1000000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 1000000.0d, 100.0d, 100.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        double[] doubleArray2 = new double[] { (-1L), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        double[] doubleArray6 = new double[] { 0.001d, 10, 0L, 10.0f, 1, (short) 100 };
        double[] doubleArray10 = new double[] { 10000.0d, (byte) -1, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 10.0d, 0.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10000.0d, (-1.0d), 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        double[] doubleArray6 = new double[] { 256.0d, (-1.0f), 42.0d, 1024.0d, (byte) 0, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, (-1.0d), 42.0d, 1024.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        double[] doubleArray6 = new double[] { 1, 10.0d, (byte) 1, 100.0d, 1.0E-15d, 42.0d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 1.0d, 100.0d, 1.0E-15d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 100, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0E-15d, 0L, 10.0d, (byte) 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.01d, 100, 0.0f, 1.0f, 'a', 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.01d, 100.0d, 0.0d, 1.0d, 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        double[] doubleArray2 = new double[] { 1.0E-15d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        double[] doubleArray5 = new double[] { 1000000.0d, 10.0d, 0L, 1.0E8d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 10.0d, 0.0d, 1.0E8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        double[] doubleArray4 = new double[] { 2.0d, 1.0E-10d, 10000.0d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 1.0E-10d, 10000.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        double[] doubleArray3 = new double[] { 10L, 0.25d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.25d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        double[] doubleArray4 = new double[] { (short) 10, 100.0f, 1.0d, 10.0d };
        double[] doubleArray8 = new double[] { 2.0d, (-1.0d), 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        double[] doubleArray3 = new double[] { 10, 42.0d, 1.0E10d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 42.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        double[] doubleArray3 = new double[] { 1.0E-15d, 0.001d, 'a' };
        double[] doubleArray10 = new double[] { 10.0f, (short) 10, 10000.0d, 0.1d, 42.0d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.001d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 10000.0d, 0.1d, 42.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0E10d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        double[] doubleArray3 = new double[] { 1000000.0d, 10L, (-1.0E10d) };
        double[] doubleArray6 = new double[] { (byte) 1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, 10.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        double[] doubleArray4 = new double[] { 1L, 512.0d, 0.70710678d, 10L };
        double[] doubleArray7 = new double[] { '#', (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 512.0d, 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        double[] doubleArray2 = new double[] { 2.0d, 0.3333333d };
        double[] doubleArray5 = new double[] { 1.0E-10d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        double[] doubleArray5 = new double[] { (short) 1, 0.25d, 1.0d, (byte) 0, (-1.0E10d) };
        double[] doubleArray7 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.25d, 1.0d, 0.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        double[] doubleArray6 = new double[] { 100.0f, 1.0E-6d, '#', (-1.0E10d), 10, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0E-6d, 35.0d, (-1.0E10d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        double[] doubleArray3 = new double[] { 0, (-100.0d), (-1.0E10d) };
        double[] doubleArray10 = new double[] { 2.0d, 0.01d, 0.01d, (short) 1, 1.0f, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-100.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.0d, 0.01d, 0.01d, 1.0d, 1.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        double[] doubleArray6 = new double[] { 1000000.0d, 0, 100.0f, 0.70710678d, 0.001d, 256.0d };
        double[] doubleArray8 = new double[] { 1.0E-10d };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 0.0d, 100.0d, 0.70710678d, 0.001d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        double[] doubleArray6 = new double[] { (-1L), 1.0d, 1.0E-8d, 1.0E-6d, 10.0f, 42.0d };
        double[] doubleArray8 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 1.0E-8d, 1.0E-6d, 10.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        double[] doubleArray3 = new double[] { (-1L), 1.0f, 0.0d };
        double[] doubleArray7 = new double[] { 0.70710678d, (-1), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        double[] doubleArray4 = new double[] { (short) 10, (short) 100, 1.0f, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 1.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        double[] doubleArray4 = new double[] { 1.0d, (byte) -1, (short) -1, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), (-1.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        double[] doubleArray6 = new double[] { 100, '#', 0.0d, 0.3333333d, (short) 100, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 35.0d, 0.0d, 0.3333333d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        double[] doubleArray3 = new double[] { 100, (byte) 1, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        double[] doubleArray6 = new double[] { 5.0d, 100.0f, 0.0d, 0, 1, (-0.0d) };
        double[] doubleArray9 = new double[] { (-100.0d), 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 100.0d, 0.0d, 0.0d, 1.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1024.0d, (-1), (byte) 100, (byte) 10, 0, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, (-1.0d), 100.0d, 10.0d, 0.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-4d, (-1L), 1.0d, 1.0E10d, 0L, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-4d, (-1.0d), 1.0d, 1.0E10d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        double[] doubleArray6 = new double[] { (short) 0, (-1.0E10d), 0.0d, 1.0E-6d, (short) 100, 1.0E-12d };
        double[] doubleArray10 = new double[] { (-1), (byte) 10, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0E10d), 0.0d, 1.0E-6d, 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        double[] doubleArray5 = new double[] { (short) -1, 5.0d, 1.0E10d, 0.5d, (-1.0f) };
        double[] doubleArray11 = new double[] { (-0.0d), 1, 0.0f, 512.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 5.0d, 1.0E10d, 0.5d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 1.0d, 0.0d, 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        double[] doubleArray5 = new double[] { 10000.0d, 1.0f, 0.0d, 0.001d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, 1.0d, 0.0d, 0.001d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        double[] doubleArray5 = new double[] { 10.0f, 1, 0.0f, 100, '4' };
        double[] doubleArray7 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 0.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        double[] doubleArray6 = new double[] { 100.0f, (-1.0f), 0.70710678d, 1024.0d, (byte) 10, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 0.70710678d, 1024.0d, 10.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        double[] doubleArray5 = new double[] { '#', 0.001d, (byte) 0, 0.001d, (-1.0f) };
        double[] doubleArray7 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 0.001d, 0.0d, 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        double[] doubleArray2 = new double[] { 0.70710678d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        double[] doubleArray3 = new double[] { 0.0f, (byte) 1, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        double[] doubleArray2 = new double[] { 0.01d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        double[] doubleArray5 = new double[] { 0.5d, (byte) 1, 256.0d, 10.0f, 5.0d };
        double[] doubleArray12 = new double[] { 100, 100.0d, 5.0d, (byte) 1, 10.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 1.0d, 256.0d, 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d, 5.0d, 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        double[] doubleArray2 = new double[] { ' ', 0.70710678d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        double[] doubleArray2 = new double[] { 42.0d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        double[] doubleArray4 = new double[] { (short) 0, 2.0d, 0.1d, 1.0E-15d };
        double[] doubleArray7 = new double[] { 0.01d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 2.0d, 0.1d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.01d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1 };
        double[] doubleArray9 = new double[] { (-1.0d), 10, (byte) 1, (byte) 10, (-1.0f), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 10.0d, 1.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        double[] doubleArray4 = new double[] { 10.0d, 10000.0d, (-1.0d), 10L };
        double[] doubleArray6 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10000.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        double[] doubleArray5 = new double[] { ' ', 5.0d, 0.5d, 'a', 10 };
        double[] doubleArray8 = new double[] { 1.0E8d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 5.0d, 0.5d, 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        double[] doubleArray4 = new double[] { 10, '4', 100.0d, (-1.0f) };
        double[] doubleArray7 = new double[] { (byte) -1, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray5 = new double[] { (byte) 0, (byte) 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        double[] doubleArray5 = new double[] { 0, 0, (byte) 100, 1000000.0d, 10.0f };
        double[] doubleArray11 = new double[] { 256.0d, '#', (short) 1, 1.0E10d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 100.0d, 1000000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 256.0d, 35.0d, 1.0d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        double[] doubleArray2 = new double[] { (-0.0d), 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), 1024.0d }, 1.0E-15);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        double[] doubleArray6 = new double[] { 1.0d, 100L, 1.0d, 1.0E-6d, 256.0d, 1.0E-6d };
        double[] doubleArray13 = new double[] { 1.0f, 100, 1.0E-12d, 0.0d, 0L, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 1.0d, 1.0E-6d, 256.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 100.0d, 1.0E-12d, 0.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray8 = new double[] { 10.0f, 0.001d, (-100.0d), 0, 0L, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.001d, (-100.0d), 0.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        double[] doubleArray4 = new double[] { 10.0f, (-10.0d), 1.0E-12d, (short) -1 };
        double[] doubleArray9 = new double[] { (-0.0d), 10L, 10.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-10.0d), 1.0E-12d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-0.0d), 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray6 = new double[] { 10.0d, (byte) 100, 0L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 0.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        double[] doubleArray5 = new double[] { 0.5d, ' ', (byte) 100, 1.0E-10d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        double[] doubleArray10 = new double[] { 1.0E-4d, (-1L), 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 32.0d, 100.0d, 1.0E-10d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-4d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray4 = new double[] { 1.0f, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        double[] doubleArray4 = new double[] { 0.5d, 100.0d, 1.0d, (short) 0 };
        double[] doubleArray11 = new double[] { 1.0E8d, 0.25d, 10.0d, (byte) -1, 1L, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E8d, 0.25d, 10.0d, (-1.0d), 1.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        double[] doubleArray2 = new double[] { 10, 1.0E10d };
        double[] doubleArray9 = new double[] { 1.0E-12d, (byte) 1, (-1.0d), 1.0E-15d, 1024.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 1.0d, (-1.0d), 1.0E-15d, 1024.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        double[] doubleArray6 = new double[] { '#', (-1L), 1000000.0d, 1.0E-15d, 100.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, (-1.0d), 1000000.0d, 1.0E-15d, 100.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        double[] doubleArray3 = new double[] { 0L, ' ', (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 32.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        double[] doubleArray5 = new double[] { 1.0E8d, (-1), 0.25d, 10.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, (-1.0d), 0.25d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        double[] doubleArray2 = new double[] { 100L, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        double[] doubleArray3 = new double[] { 1.0d, 1.0E-10d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-10d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        double[] doubleArray3 = new double[] { 0.01d, 100.0d, 1.0E-10d };
        double[] doubleArray8 = new double[] { (short) 0, (-1.0f), 0.9d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 100.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 0.9d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        double[] doubleArray6 = new double[] { 0.0d, 10.0d, (-1.0d), (-1.0f), (byte) 0, 0.0f };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, (-1.0d), (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        double[] doubleArray6 = new double[] { 0.3333333d, (-0.0d), 5.0d, (-1.0d), 0.1d, 256.0d };
        double[] doubleArray8 = new double[] { 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, (-0.0d), 5.0d, (-1.0d), 0.1d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        double[] doubleArray6 = new double[] { 0.3333333d, 100.0f, 10L, 10.0d, (-1.0E10d), 1.0d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 100.0d, 10.0d, 10.0d, (-1.0E10d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        double[] doubleArray3 = new double[] { 1, (-1.0f), 0 };
        double[] doubleArray6 = new double[] { (-1), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        double[] doubleArray4 = new double[] { (byte) 1, 5.0d, 5.0d, 0.1d };
        double[] doubleArray8 = new double[] { 10, 1.0E8d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 5.0d, 5.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0E8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        double[] doubleArray4 = new double[] { 0.0f, 0.5d, 10.0d, 2.0d };
        double[] doubleArray10 = new double[] { (byte) 1, 1.0E-10d, 1000000.0d, 0.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.5d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0E-10d, 1000000.0d, 0.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        double[] doubleArray5 = new double[] { 5.0d, (short) 0, 10L, 0.0f, 0.1d };
        double[] doubleArray8 = new double[] { 100, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d, 0.0d, 10.0d, 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        double[] doubleArray5 = new double[] { 0.0f, 0.5d, (-1.0E10d), (-1L), 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.5d, (-1.0E10d), (-1.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        double[] doubleArray2 = new double[] { (-1L), 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.9d }, 1.0E-15);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        double[] doubleArray2 = new double[] { (-1.0f), 0.5d };
        double[] doubleArray4 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        double[] doubleArray3 = new double[] { 1.0E-6d, 512.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-6d, 512.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        double[] doubleArray3 = new double[] { (-100.0d), (-10.0d), 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), (-10.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        double[] doubleArray6 = new double[] { 1.0E-15d, 0.3333333d, 1, 5.0d, 1.0E-12d, 0.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 0.3333333d, 1.0d, 5.0d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        double[] doubleArray6 = new double[] { 1.0f, 100, (byte) 0, 0.70710678d, 0.0d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 0.0d, 0.70710678d, 0.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        double[] doubleArray4 = new double[] { (-100.0d), 0.01d, 0.0d, 10.0d };
        double[] doubleArray8 = new double[] { 100.0f, 0.1d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 0.01d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.1d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        double[] doubleArray6 = new double[] { 1.0f, 0, 100L, 42.0d, (-1), 1.0E-4d };
        double[] doubleArray9 = new double[] { (-1.0f), 1.0d };
        double[] doubleArray16 = new double[] { 0.9d, 0.001d, 1.0d, 10000.0d, 10, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray16);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 100.0d, 42.0d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.9d, 0.001d, 1.0d, 10000.0d, 10.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        double[] doubleArray4 = new double[] { ' ', 'a', 1.0E-15d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 97.0d, 1.0E-15d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        double[] doubleArray5 = new double[] { 2.0d, 0.0d, (-1.0d), (byte) -1, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 0.0d, (-1.0d), (-1.0d), 0.01d }, 1.0E-15);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        double[] doubleArray6 = new double[] { 1.0E-10d, 0.0d, (byte) 1, 100L, 256.0d, 0L };
        double[] doubleArray12 = new double[] { 1.0d, (short) 1, 10000.0d, 100, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, 0.0d, 1.0d, 100.0d, 256.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 1.0d, 10000.0d, 100.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        double[] doubleArray2 = new double[] { 100L, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        double[] doubleArray1 = new double[] { 0.25d };
        double[] doubleArray4 = new double[] { 0L, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray5 = new double[] { 0.0d, (byte) 10, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        double[] doubleArray2 = new double[] { (short) 1, (-100.0d) };
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        double[] doubleArray5 = new double[] { (short) 100, 0.0f, (byte) 0, 'a', 512.0d };
        double[] doubleArray10 = new double[] { 10000.0d, (-1.0E10d), 10.0f, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 0.0d, 97.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10000.0d, (-1.0E10d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        double[] doubleArray5 = new double[] { 1.0d, (byte) -1, (byte) -1, (byte) -1, 1.0E-15d };
        double[] doubleArray11 = new double[] { 0.1d, 'a', 0.0d, 0.1d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.1d, 97.0d, 0.0d, 0.1d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        double[] doubleArray5 = new double[] { 10.0f, 10.0d, ' ', 0.0f, 1.0d };
        double[] doubleArray11 = new double[] { 0, 100.0f, (-1L), 5.0d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 32.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, (-1.0d), 5.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        double[] doubleArray4 = new double[] { 1024.0d, (-1L), '4', (-1) };
        double[] doubleArray10 = new double[] { 1.0d, (byte) 1, (short) 100, 5.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0d, 100.0d, 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        double[] doubleArray3 = new double[] { 1.0d, 1, 0L };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        double[] doubleArray3 = new double[] { 10000.0d, 1024.0d, 1.0E-12d };
        double[] doubleArray8 = new double[] { 1.0E10d, (-1.0E10d), 0.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 1024.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, (-1.0E10d), 0.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        double[] doubleArray4 = new double[] { (-1), (-1.0f), (short) 1, 1.0E8d };
        double[] doubleArray9 = new double[] { (-0.0d), (byte) 1, 1.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-0.0d), 1.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        double[] doubleArray5 = new double[] { 42.0d, 10L, (byte) 1, 10.0f, 1.0E-4d };
        double[] doubleArray7 = new double[] { 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 10.0d, 1.0d, 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.1d }, 1.0E-15);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        double[] doubleArray5 = new double[] { (-1.0f), (-100.0d), (byte) 1, 10.0d, 42.0d };
        double[] doubleArray12 = new double[] { 0.0f, (-1.0f), 0.01d, 0.25d, (-100.0d), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-100.0d), 1.0d, 10.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 0.01d, 0.25d, (-100.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        double[] doubleArray3 = new double[] { (byte) 0, 10.0d, 1.0f };
        double[] doubleArray10 = new double[] { 1.0E8d, 10.0d, (-1), 1.0E-15d, 10.0d, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E8d, 10.0d, (-1.0d), 1.0E-15d, 10.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        double[] doubleArray5 = new double[] { 42.0d, 1.0E-6d, 1.0E8d, 1, 0.25d };
        double[] doubleArray9 = new double[] { 100L, 1000000.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 1.0E-6d, 1.0E8d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        double[] doubleArray5 = new double[] { (-1), (byte) 0, 10.0d, (short) 0, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        double[] doubleArray6 = new double[] { '4', 100.0f, 0.0d, 5.0d, 10, 10 };
        double[] doubleArray11 = new double[] { 0.0d, (short) 100, 1.0E-6d, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 100.0d, 0.0d, 5.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, 1.0E-6d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        double[] doubleArray2 = new double[] { (-10.0d), (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-10.0d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        double[] doubleArray3 = new double[] { 1.0E-12d, 10000.0d, 1L };
        double[] doubleArray5 = new double[] { (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray7 = new double[] { 2.0d, 0, 'a', 1024.0d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 2.0d, 0.0d, 97.0d, 1024.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0E8d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0E8d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray7 = new double[] { 256.0d, (-1.0E10d), 'a', (byte) -1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 256.0d, (-1.0E10d), 97.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        double[] doubleArray1 = new double[] { 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        double[] doubleArray6 = new double[] { 10L, 10.0d, 2.0d, 0.0d, 1.0E-4d, (short) 0 };
        double[] doubleArray13 = new double[] { 1024.0d, 0.01d, 1.0E-10d, 10L, 'a', 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 2.0d, 0.0d, 1.0E-4d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1024.0d, 0.01d, 1.0E-10d, 10.0d, 97.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        double[] doubleArray4 = new double[] { 1, 100.0d, 1.0f, 0.3333333d };
        double[] doubleArray7 = new double[] { (-1.0d), 100 };
        double[] doubleArray12 = new double[] { 1.0E10d, 0.5d, 1.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray12);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 100.0d, 1.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E10d, 0.5d, 1.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        double[] doubleArray5 = new double[] { (byte) -1, 0.5d, 1000000.0d, 0.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.5d, 1000000.0d, 0.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        double[] doubleArray6 = new double[] { (-1.0d), 100.0d, 1024.0d, 5.0d, (short) 100, (-1.0d) };
        double[] doubleArray8 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, 1024.0d, 5.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.001d, 0, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        double[] doubleArray5 = new double[] { 100.0d, 1000000.0d, 1L, 0.1d, 100.0d };
        double[] doubleArray8 = new double[] { 1L, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1000000.0d, 1.0d, 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        double[] doubleArray2 = new double[] { (short) 10, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.70710678d }, 1.0E-15);
    }
}

