package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        double[] doubleArray1 = new double[] { (-0.0d) };
        double[] doubleArray5 = new double[] { (byte) 1, (-1.0d), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        double[] doubleArray5 = new double[] { 100.0d, 0, 0.01d, 1, (byte) 10 };
        double[] doubleArray11 = new double[] { (short) 100, 1L, (byte) -1, (short) -1, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 0.01d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 1.0d, (-1.0d), (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        double[] doubleArray4 = new double[] { (-10.0d), (-1.0d), (byte) 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), (-1.0d), 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.0f, 1.0E10d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        double[] doubleArray3 = new double[] { (short) 1, 1.0E-15d, 1.0E-8d };
        double[] doubleArray5 = new double[] { 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-15d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d }, 1.0E-15);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        double[] doubleArray3 = new double[] { 1.0d, (byte) 100, '4' };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        double[] doubleArray2 = new double[] { 256.0d, 0L };
        double[] doubleArray8 = new double[] { 0.001d, (-1.0d), ' ', 100.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 256.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d, (-1.0d), 32.0d, 100.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        double[] doubleArray2 = new double[] { (byte) 10, 0 };
        double[] doubleArray8 = new double[] { 0, 1000000.0d, 0.5d, 1.0E-15d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1000000.0d, 0.5d, 1.0E-15d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        double[] doubleArray3 = new double[] { 10000.0d, 10000.0d, 100 };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        double[] doubleArray3 = new double[] { 0L, 0.1d, 10000.0d };
        double[] doubleArray10 = new double[] { 256.0d, (byte) -1, 100, 1.0E-4d, 0.0f, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.1d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, (-1.0d), 100.0d, 1.0E-4d, 0.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        double[] doubleArray4 = new double[] { 100.0d, (short) 100, (-100.0d), (-100.0d) };
        double[] doubleArray8 = new double[] { (-1L), 0.25d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, (-100.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.25d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        double[] doubleArray6 = new double[] { (-1.0E10d), (byte) 100, '#', 1.0E8d, (byte) 0, 100.0d };
        double[] doubleArray8 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 100.0d, 35.0d, 1.0E8d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        double[] doubleArray6 = new double[] { (byte) 10, 1.0E-10d, 1.0E10d, 100.0d, 1.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-10d, 1.0E10d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, (-1.0d), 1000000.0d, 10.0d, 0.1d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 1000000.0d, 10.0d, 0.1d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        double[] doubleArray2 = new double[] { (byte) 100, 1.0E10d };
        double[] doubleArray4 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        double[] doubleArray4 = new double[] { 100L, 1.0E-4d, 1.0d, 0 };
        double[] doubleArray6 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-4d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        double[] doubleArray6 = new double[] { (-1L), (short) 1, (-1.0d), 512.0d, (-1.0d), 100 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, (-1.0d), 512.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        double[] doubleArray6 = new double[] { 0.3333333d, 10L, 0.3333333d, 1.0E-15d, 1.0f, (short) 100 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 10.0d, 0.3333333d, 1.0E-15d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 10.0f, (short) 100, (-1.0f), 10.0d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 10.0d, 100.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        double[] doubleArray3 = new double[] { 0, 0.0d, (-1.0d) };
        double[] doubleArray6 = new double[] { (short) 0, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray3 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.70710678d, (-1), (-1L), 256.0d, (-1.0E10d), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, (-1.0d), (-1.0d), 256.0d, (-1.0E10d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        double[] doubleArray2 = new double[] { 0.9d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        double[] doubleArray6 = new double[] { 100.0d, (-0.0d), 1024.0d, 0.0d, (-1.0d), 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-0.0d), 1024.0d, 0.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray8 = new double[] { '#', 1.0E10d, 1.0E10d, (short) -1, (-1.0d), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, 1.0E10d, 1.0E10d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        double[] doubleArray4 = new double[] { (-100.0d), 0.01d, 0.0d, 10.0d };
        double[] doubleArray8 = new double[] { 100.0f, 0.1d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 0.01d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.1d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        double[] doubleArray2 = new double[] { (short) 10, (byte) 0 };
        double[] doubleArray6 = new double[] { 0.001d, 5.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 5.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        double[] doubleArray6 = new double[] { 0.01d, 1.0E-12d, 0.5d, 1.0E-15d, (byte) 0, 42.0d };
        double[] doubleArray10 = new double[] { (-1.0d), 2.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 1.0E-12d, 0.5d, 1.0E-15d, 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 2.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray3 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray3 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        double[] doubleArray2 = new double[] { 1.0E-6d, 1.0E-12d };
        double[] doubleArray5 = new double[] { (-1.0d), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double[] doubleArray6 = new double[] { 1024.0d, (byte) 1, 1.0f, 10.0f, (short) 10, 1.0E-12d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 1.0d, 1.0d, 10.0d, 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        double[] doubleArray2 = new double[] { (short) 10, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        double[] doubleArray3 = new double[] { 10.0d, 0.9d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.9d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        double[] doubleArray2 = new double[] { 1.0E-4d, 0.9d };
        double[] doubleArray5 = new double[] { (-0.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        double[] doubleArray5 = new double[] { (-1L), 2.0d, 0.001d, (-1), 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 2.0d, 0.001d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray3 = new double[] { 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        double[] doubleArray1 = new double[] { 1000000.0d };
        double[] doubleArray8 = new double[] { (-1), 0.0d, (byte) 10, 1.0E10d, (-1), 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 10.0d, 1.0E10d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        double[] doubleArray2 = new double[] { 0.3333333d, (-100.0d) };
        double[] doubleArray4 = new double[] { (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        double[] doubleArray4 = new double[] { 100.0d, 100, 10.0d, 5.0d };
        double[] doubleArray8 = new double[] { 'a', 0.0f, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        double[] doubleArray5 = new double[] { 1.0E-8d, (-1.0f), (-1.0f), (-100.0d), 'a' };
        double[] doubleArray8 = new double[] { (-1L), 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, (-1.0d), (-1.0d), (-100.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        double[] doubleArray2 = new double[] { 0.1d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        double[] doubleArray3 = new double[] { (short) -1, 10L, (short) -1 };
        double[] doubleArray7 = new double[] { 0.9d, (-1.0E10d), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9d, (-1.0E10d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        double[] doubleArray2 = new double[] { 100.0d, 10000.0d };
        double[] doubleArray7 = new double[] { 1.0E-15d, 10L, (byte) 1, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-15d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray7 = new double[] { 0.1d, 256.0d, 10.0d, 0.3333333d, (byte) 100 };
        double[] doubleArray13 = new double[] { 2.0d, 1.0E10d, 1.0f, 'a', 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray13);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.1d, 256.0d, 10.0d, 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 1.0E10d, 1.0d, 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        double[] doubleArray4 = new double[] { 100.0f, (-1.0d), (-1L), (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        double[] doubleArray4 = new double[] { 512.0d, 1.0E-12d, ' ', 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0E-12d, 32.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        double[] doubleArray5 = new double[] { (-1.0f), 0.0d, 1024.0d, 10, 256.0d };
        double[] doubleArray9 = new double[] { 1.0d, 10L, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, 1024.0d, 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 10.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double[] doubleArray6 = new double[] { 0.0d, (short) 100, 1.0f, '4', 0.1d, 'a' };
        double[] doubleArray10 = new double[] { (-100.0d), (-1.0E10d), 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 1.0d, 52.0d, 0.1d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-100.0d), (-1.0E10d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        double[] doubleArray3 = new double[] { 'a', (short) 0, 1.0E-6d };
        double[] doubleArray5 = new double[] { '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        double[] doubleArray5 = new double[] { '#', (byte) 100, ' ', 1.0E-12d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 100.0d, 32.0d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        double[] doubleArray5 = new double[] { 1.0E-8d, (short) 0, 1.0E10d, 0.3333333d, 1.0E-15d };
        double[] doubleArray7 = new double[] { 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 0.0d, 1.0E10d, 0.3333333d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        double[] doubleArray6 = new double[] { 1.0E10d, (short) -1, (short) -1, 1.0E10d, 0.01d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, (-1.0d), (-1.0d), 1.0E10d, 0.01d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        double[] doubleArray2 = new double[] { 1.0d, 2.0d };
        double[] doubleArray8 = new double[] { (short) 10, 0.25d, (short) 0, (short) 1, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.25d, 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        double[] doubleArray4 = new double[] { 10000.0d, ' ', 0.01d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 32.0d, 0.01d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        double[] doubleArray2 = new double[] { (byte) 0, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        double[] doubleArray6 = new double[] { 1.0E-12d, 1.0E-12d, 100L, 'a', 1.0E10d, 1.0f };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-12d, 1.0E-12d, 100.0d, 97.0d, 1.0E10d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1.0d };
        double[] doubleArray7 = new double[] { (-1.0d), 0, 0.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        double[] doubleArray2 = new double[] { 1.0E-10d, 0.0f };
        double[] doubleArray7 = new double[] { 10.0d, (-100.0d), 5.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-100.0d), 5.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        double[] doubleArray3 = new double[] { 10.0f, 'a', (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        double[] doubleArray3 = new double[] { 10L, (byte) 100, 0.0f };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        double[] doubleArray6 = new double[] { 0.9d, 1.0E-10d, 42.0d, (-10.0d), 'a', (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 1.0E-10d, 42.0d, (-10.0d), 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        double[] doubleArray4 = new double[] { (-1.0d), (short) 1, 100.0d, 100.0f };
        double[] doubleArray11 = new double[] { 1.0d, 1.0E-8d, 0.9d, 1L, 0, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0E-8d, 0.9d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        double[] doubleArray2 = new double[] { 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        double[] doubleArray5 = new double[] { (-100.0d), (short) 10, 1.0d, 0L, 0.70710678d };
        double[] doubleArray12 = new double[] { ' ', 0.001d, (-1L), '#', 256.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 10.0d, 1.0d, 0.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 0.001d, (-1.0d), 35.0d, 256.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        double[] doubleArray6 = new double[] { 10000.0d, 100.0f, 256.0d, 0.70710678d, 512.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 100.0d, 256.0d, 0.70710678d, 512.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        double[] doubleArray3 = new double[] { 10.0d, 100.0f, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        double[] doubleArray5 = new double[] { (byte) 0, '#', 1.0E-15d, 0.25d, 1.0E-15d };
        double[] doubleArray7 = new double[] { '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 35.0d, 1.0E-15d, 0.25d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 52.0d }, 1.0E-15);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray6 = new double[] { ' ', 100, 1024.0d, (-1) };
        double[] doubleArray11 = new double[] { (short) -1, (-1.0d), 'a', (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 100.0d, 1024.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), 97.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        double[] doubleArray5 = new double[] { 2.0d, (byte) 0, (-0.0d), 0.0d, 1.0E-4d };
        double[] doubleArray11 = new double[] { (-1), 1.0d, (byte) 0, 100.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 0.0d, (-0.0d), 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        double[] doubleArray4 = new double[] { 0.9d, (short) 100, 1.0E-12d, 10L };
        double[] doubleArray8 = new double[] { 5.0d, 1.0E-4d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d, 100.0d, 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 5.0d, 1.0E-4d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray4 = new double[] { 42.0d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        double[] doubleArray12 = new double[] { 1.0d, 1.0d, 'a', 1000000.0d, 42.0d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 1.0d, 97.0d, 1000000.0d, 42.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        double[] doubleArray2 = new double[] { (-1.0d), (-10.0d) };
        double[] doubleArray7 = new double[] { 1.0d, 2.0d, 0.25d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 2.0d, 0.25d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, (byte) 0, 1000000.0d, (byte) -1, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 1000000.0d, (-1.0d), 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        double[] doubleArray4 = new double[] { 10, 1.0E-12d, (-10.0d), 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-12d, (-10.0d), 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double[] doubleArray2 = new double[] { (-1.0f), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        double[] doubleArray6 = new double[] { 1.0E-15d, '4', '4', (-1L), 1000000.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 52.0d, 52.0d, (-1.0d), 1000000.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        double[] doubleArray5 = new double[] { (short) 1, (short) 100, 0.0f, 1.0E-4d, 100.0f };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 0.0d, 1.0E-4d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        double[] doubleArray6 = new double[] { 100.0f, (-10.0d), 1.0d, (byte) -1, 1.0E-12d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-10.0d), 1.0d, (-1.0d), 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        double[] doubleArray3 = new double[] { 100.0d, 0.5d, 10.0d };
        double[] doubleArray9 = new double[] { 0.0d, (byte) 10, 100.0f, '#', (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 10.0d, 100.0d, 35.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 1.0f, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        double[] doubleArray5 = new double[] { (-100.0d), 1000000.0d, (-1), 10000.0d, (short) -1 };
        double[] doubleArray8 = new double[] { (-1.0d), 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 1000000.0d, (-1.0d), 10000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        double[] doubleArray6 = new double[] { 42.0d, 1.0E10d, 0.0f, 5.0d, 1.0E8d, 1L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 1.0E10d, 0.0d, 5.0d, 1.0E8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        double[] doubleArray2 = new double[] { 100.0f, 100 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        double[] doubleArray5 = new double[] { 1.0E8d, 100, 1.0E-10d, 0.1d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, 100.0d, 1.0E-10d, 0.1d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        double[] doubleArray3 = new double[] { 100.0d, 10.0f, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.01d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        double[] doubleArray5 = new double[] { 0.01d, (-1.0E10d), '#', 0.01d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, (-1.0E10d), 35.0d, 0.01d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray8 = new double[] { 100, 10.0d, 1.0E8d, 0.1d, (-0.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0E8d, 0.1d, (-0.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray4 = new double[] { 1.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        double[] doubleArray3 = new double[] { 100, 1.0E-6d, 0.5d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-6d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        double[] doubleArray4 = new double[] { (short) 10, 2.0d, (short) 1, 5.0d };
        double[] doubleArray11 = new double[] { 1, '4', (-1.0f), (byte) 100, '4', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 2.0d, 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 52.0d, (-1.0d), 100.0d, 52.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double[] doubleArray5 = new double[] { 100, 0.0d, 0.01d, 1.0d, 100.0d };
        double[] doubleArray11 = new double[] { 1.0E-12d, 1.0E-15d, 10000.0d, (-1), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 0.01d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, 1.0E-15d, 10000.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        double[] doubleArray2 = new double[] { 1.0E-8d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        double[] doubleArray1 = new double[] { (-10.0d) };
        double[] doubleArray3 = new double[] { ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        double[] doubleArray6 = new double[] { 100.0f, 100.0d, 1.0E-6d, 10.0f, 100.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d, 1.0E-6d, 10.0d, 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '4', 0.70710678d, 1.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 0.70710678d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        double[] doubleArray5 = new double[] { ' ', 10L, '4', 'a', (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 10.0d, 52.0d, 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        double[] doubleArray5 = new double[] { 0.3333333d, 100.0f, 1.0E-15d, 1, 0.0d };
        double[] doubleArray7 = new double[] { 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, 100.0d, 1.0E-15d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        double[] doubleArray5 = new double[] { 0.0d, 'a', 100.0f, (-100.0d), 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 97.0d, 100.0d, (-100.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        double[] doubleArray4 = new double[] { '4', (byte) 0, (-1.0f), 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        double[] doubleArray4 = new double[] { 10000.0d, 10.0f, 0.001d, 1.0E-10d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 10.0d, 0.001d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        double[] doubleArray5 = new double[] { (-10.0d), 2.0d, 1024.0d, 0.001d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 2.0d, 1024.0d, 0.001d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        double[] doubleArray3 = new double[] { 1.0E-10d, 1.0E-8d, 0.3333333d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 1.0E-8d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray6 = new double[] { 10000.0d, 0, 0.0f, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 0.0d, 0.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        double[] doubleArray3 = new double[] { 1.0E8d, 10000.0d, 100.0d };
        double[] doubleArray7 = new double[] { (-1.0d), (-10.0d), (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-10.0d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        double[] doubleArray6 = new double[] { 100.0d, 1.0d, (byte) -1, 0.70710678d, 0.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        double[] doubleArray14 = new double[] { 1.0E-4d, 1L, (-1), 10L, 0.9d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, (-1.0d), 0.70710678d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-4d, 1.0d, (-1.0d), 10.0d, 0.9d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        double[] doubleArray2 = new double[] { (short) 10, 256.0d };
        double[] doubleArray5 = new double[] { (-10.0d), 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray4 = new double[] { 10L, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray3 = new double[] { (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        double[] doubleArray3 = new double[] { 10.0f, 1.0d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double[] doubleArray6 = new double[] { 1.0E-8d, (short) 10, (short) 10, 5.0d, 1, 10000.0d };
        double[] doubleArray11 = new double[] { 0.01d, 0.01d, 0.01d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 10.0d, 10.0d, 5.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.01d, 0.01d, 0.01d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        double[] doubleArray5 = new double[] { 1.0E-10d, (short) 100, 10.0d, (-1.0f), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 100.0d, 10.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        double[] doubleArray6 = new double[] { 100.0f, (-10.0d), 1.0d, (byte) -1, 1.0E-12d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-10.0d), 1.0d, (-1.0d), 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        double[] doubleArray6 = new double[] { (short) 0, 10.0d, (-1.0f), '#', 0.5d, 10.0d };
        double[] doubleArray9 = new double[] { (-100.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, (-1.0d), 35.0d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        double[] doubleArray5 = new double[] { (byte) 10, (short) 10, 1024.0d, 0.1d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 1024.0d, 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        double[] doubleArray6 = new double[] { (short) -1, (byte) 10, (-0.0d), 1.0E-4d, '4', ' ' };
        double[] doubleArray11 = new double[] { 1, 1, 0.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, (-0.0d), 1.0E-4d, 52.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        double[] doubleArray3 = new double[] { 0, 1.0d, 0.01d };
        double[] doubleArray10 = new double[] { 0.3333333d, 1.0d, 1000000.0d, 10L, 1.0E-12d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.3333333d, 1.0d, 1000000.0d, 10.0d, 1.0E-12d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        double[] doubleArray6 = new double[] { (short) 100, 1.0E10d, 10.0d, 0.01d, 0.1d, (-1) };
        double[] doubleArray10 = new double[] { (short) 1, 10.0f, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0E10d, 10.0d, 0.01d, 0.1d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double[] doubleArray4 = new double[] { 100L, 0.3333333d, 0.01d, 100L };
        double[] doubleArray11 = new double[] { (-1), (-1.0d), (-0.0d), 1.0d, (short) 0, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.3333333d, 0.01d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-0.0d), 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 1.0E-8d, 0.0d, 42.0d, 1.0f, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-8d, 0.0d, 42.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        double[] doubleArray6 = new double[] { (-0.0d), 100.0d, (short) 0, 100.0d, 0.1d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 100.0d, 0.0d, 100.0d, 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        double[] doubleArray6 = new double[] { 10000.0d, 1L, 0.70710678d, 1.0E-12d, 1.0E-6d, 100.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 1.0d, 0.70710678d, 1.0E-12d, 1.0E-6d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        double[] doubleArray2 = new double[] { 5.0d, (byte) 1 };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 10, (-1), 1.0f, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 1.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        double[] doubleArray6 = new double[] { (short) 100, (short) -1, 1.0d, (-10.0d), 0.0d, 'a' };
        double[] doubleArray8 = new double[] { 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 1.0d, (-10.0d), 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        double[] doubleArray6 = new double[] { 10.0f, (short) 0, 1000000.0d, (byte) 1, 'a', 0.1d };
        double[] doubleArray13 = new double[] { '4', 10.0f, (byte) 1, 100L, 10.0d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray13, doubleArray13);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 1000000.0d, 1.0d, 97.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 52.0d, 10.0d, 1.0d, 100.0d, 10.0d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        double[] doubleArray2 = new double[] { (short) -1, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        double[] doubleArray5 = new double[] { 1024.0d, (short) 1, 0L, 1.0f, 1.0d };
        double[] doubleArray12 = new double[] { '4', 100L, 'a', 10.0d, '4', 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 1.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 100.0d, 97.0d, 10.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        double[] doubleArray5 = new double[] { (byte) 1, (byte) 100, 1000000.0d, 10L, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1000000.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-1.0d), (byte) 1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        double[] doubleArray5 = new double[] { 0, 10.0d, 100.0d, 5.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 100.0d, 5.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray3 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        double[] doubleArray2 = new double[] { 0.25d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        double[] doubleArray6 = new double[] { (short) 100, 0.0d, 1.0E-10d, (byte) 10, 42.0d, 1.0E8d };
        double[] doubleArray9 = new double[] { 1000000.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, 1.0E-10d, 10.0d, 42.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1000000.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        double[] doubleArray5 = new double[] { 0.1d, (-1.0f), 0.5d, ' ', (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, (-1.0d), 0.5d, 32.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        double[] doubleArray2 = new double[] { 1.0E10d, (-1.0d) };
        double[] doubleArray7 = new double[] { 'a', (-1), 100, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 97.0d, (-1.0d), 100.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        double[] doubleArray3 = new double[] { 1.0E-12d, (-1.0f), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        double[] doubleArray2 = new double[] { 0.0d, 0.0d };
        double[] doubleArray7 = new double[] { 512.0d, 1.0E-8d, 1000000.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 512.0d, 1.0E-8d, 1000000.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        double[] doubleArray4 = new double[] { 1.0E-6d, 1.0d, (short) -1, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        double[] doubleArray6 = new double[] { '4', 0.1d, 10, (byte) 1, 1000000.0d, 1.0E-4d };
        double[] doubleArray11 = new double[] { (byte) 100, (-1.0d), 10.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 0.1d, 10.0d, 1.0d, 1000000.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 10.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        double[] doubleArray5 = new double[] { 1000000.0d, 1L, 0.0d, 1.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0d, 0.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        double[] doubleArray3 = new double[] { 'a', (byte) 10, 2.0d };
        double[] doubleArray10 = new double[] { 1.0E-8d, 10.0d, 512.0d, (byte) -1, 100L, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, 10.0d, 512.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        double[] doubleArray6 = new double[] { 1, 100, (-0.0d), 0.001d, ' ', 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, (-0.0d), 0.001d, 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        double[] doubleArray5 = new double[] { 1.0E-4d, 10.0d, 10.0d, 'a', 10.0d };
        double[] doubleArray9 = new double[] { (short) -1, 0, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 10.0d, 10.0d, 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1L), 1.0E10d, (-1.0E10d), (-10.0d), 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0E10d, (-1.0E10d), (-10.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        double[] doubleArray6 = new double[] { '#', 1.0f, (short) 1, 0.25d, (-1L), 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 1.0d, 1.0d, 0.25d, (-1.0d), 0.25d }, 1.0E-15);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        double[] doubleArray3 = new double[] { 1.0d, (-1), 10000.0d };
        double[] doubleArray6 = new double[] { (short) 10, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        double[] doubleArray5 = new double[] { 100, 1.0E-15d, (byte) 100, 1.0E10d, 10L };
        double[] doubleArray7 = new double[] { 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-15d, 100.0d, 1.0E10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 2.0d }, 1.0E-15);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        double[] doubleArray4 = new double[] { 10.0d, 2.0d, 0L, (-1.0d) };
        double[] doubleArray10 = new double[] { (byte) 100, 100.0d, 1.0E10d, (-1L), 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 2.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d, 1.0E10d, (-1.0d), 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 1.0E-12d, 1L, 'a', 0.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, 1.0d, 97.0d, 0.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1, 1.0d, (short) 10, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 10.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] { 1024.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        double[] doubleArray3 = new double[] { 10000.0d, 1.0E10d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 1.0E10d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        double[] doubleArray6 = new double[] { 1.0d, (-1.0d), 256.0d, 10.0d, (-10.0d), 'a' };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 256.0d, 10.0d, (-10.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        double[] doubleArray4 = new double[] { 0.01d, (-1.0f), 100L, 1.0E-10d };
        double[] doubleArray8 = new double[] { 0.0d, 1.0E-12d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, (-1.0d), 100.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0E-12d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        double[] doubleArray4 = new double[] { 10.0d, (byte) 100, 10.0d, (short) 100 };
        double[] doubleArray8 = new double[] { 1000000.0d, 100.0f, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1000000.0d, 100.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        double[] doubleArray6 = new double[] { 'a', 0.0d, 1.0f, 100.0d, 0.9d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 0.0d, 1.0d, 100.0d, 0.9d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        double[] doubleArray3 = new double[] { (byte) -1, (byte) 1, (byte) 0 };
        double[] doubleArray7 = new double[] { 0.9d, 0.0d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9d, 0.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        double[] doubleArray4 = new double[] { 1, (byte) 10, 10.0f, 0 };
        double[] doubleArray7 = new double[] { 1000000.0d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1000000.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        double[] doubleArray3 = new double[] { 10, 1.0f, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray9 = new double[] { 100.0d, 1.0f, 5.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1.0d, 5.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        double[] doubleArray3 = new double[] { 10.0d, 1.0E8d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0E8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        double[] doubleArray5 = new double[] { (-1.0E10d), 100L, 256.0d, 0.3333333d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 100.0d, 256.0d, 0.3333333d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { '4', 1.0E10d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-6d, 0.3333333d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-6d, 0.3333333d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        double[] doubleArray4 = new double[] { 100L, 0.0d, 10L, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.0d, 10.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray6 = new double[] { 0L, 1.0E10d, 1.0E-4d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E10d, 1.0E-4d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray6 = new double[] { 1.0E8d, (byte) -1, 1.0E8d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, (-1.0d), 1.0E8d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        double[] doubleArray5 = new double[] { (-1.0f), (short) -1, 0.5d, 0L, 100.0d };
        double[] doubleArray12 = new double[] { 1.0E-8d, (byte) 0, (-10.0d), 0.0d, 1.0E8d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 0.5d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 0.0d, (-10.0d), 0.0d, 1.0E8d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        double[] doubleArray2 = new double[] { 10.0f, 1.0E-4d };
        double[] doubleArray5 = new double[] { 100.0d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        double[] doubleArray2 = new double[] { 0.9d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        double[] doubleArray6 = new double[] { 1, 0.01d, '4', 0.0d, (byte) 100, 100.0d };
        double[] doubleArray9 = new double[] { 1.0E-12d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.01d, 52.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        double[] doubleArray3 = new double[] { 1.0E-15d, (short) 100, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        double[] doubleArray4 = new double[] { 42.0d, 1.0E-6d, 0.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 1.0E-6d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        double[] doubleArray6 = new double[] { 0.0d, 0.0d, 0.3333333d, 2.0d, (short) -1, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.3333333d, 2.0d, (-1.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray5 = new double[] { 0.01d, 10000.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 10000.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        double[] doubleArray3 = new double[] { 0.0f, 42.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-6d, 0.3333333d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-6d, 0.3333333d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray7 = new double[] { 0.9d, 1.0E-4d, 1.0d, (byte) 1, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9d, 1.0E-4d, 1.0d, 1.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        double[] doubleArray2 = new double[] { 0.9d, 1.0E-4d };
        double[] doubleArray8 = new double[] { 1, (-100.0d), 512.0d, 10.0f, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-100.0d), 512.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        double[] doubleArray6 = new double[] { 10000.0d, 256.0d, 0.0d, 'a', 0, 1 };
        double[] doubleArray8 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 256.0d, 0.0d, 97.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        double[] doubleArray6 = new double[] { (short) 10, 1.0E8d, 0.0f, 1L, 10.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E8d, 0.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        double[] doubleArray3 = new double[] { (byte) 1, (-100.0d), (-1.0E10d) };
        double[] doubleArray6 = new double[] { (byte) -1, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-100.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        double[] doubleArray2 = new double[] { 100.0d, 0.25d };
        double[] doubleArray8 = new double[] { 0.0d, 0L, 0.0d, (-100.0d), (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d, (-100.0d), (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        double[] doubleArray5 = new double[] { 0.01d, (-1L), '#', (-1L), 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, (-1.0d), 35.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        double[] doubleArray4 = new double[] { 1.0f, 1, 0.5d, 0.70710678d };
        double[] doubleArray8 = new double[] { 1.0E-12d, 0.25d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 0.5d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-12d, 0.25d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        double[] doubleArray2 = new double[] { (byte) 0, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        double[] doubleArray3 = new double[] { (-0.0d), 0.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray4 = new double[] { 0.0f, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        double[] doubleArray2 = new double[] { 100L, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        double[] doubleArray3 = new double[] { (short) 10, 100.0d, (byte) 10 };
        double[] doubleArray5 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        double[] doubleArray4 = new double[] { 0.1d, 0.3333333d, (short) 10, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 0.3333333d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        double[] doubleArray6 = new double[] { 0.01d, 0.0d, (byte) 1, (-1.0d), 1.0E-10d, (short) -1 };
        double[] doubleArray9 = new double[] { 1, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.0d, 1.0d, (-1.0d), 1.0E-10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 0.3333333d, (byte) 10, 1.0E-10d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 10.0d, 1.0E-10d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        double[] doubleArray6 = new double[] { 1L, (-100.0d), (-1.0d), ' ', 1.0f, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-100.0d), (-1.0d), 32.0d, 1.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        double[] doubleArray6 = new double[] { (-10.0d), 1L, 1.0E-12d, 100.0d, '4', 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d), 1.0d, 1.0E-12d, 100.0d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        double[] doubleArray5 = new double[] { (byte) 0, 42.0d, 1, 10, (short) 0 };
        double[] doubleArray10 = new double[] { '4', 0.3333333d, 10.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        double[] doubleArray16 = new double[] { 100.0f, 100.0f, 1.0E-4d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 42.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 0.3333333d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d, 1.0E-4d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        double[] doubleArray3 = new double[] { 10.0d, 100.0f, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        double[] doubleArray5 = new double[] { 100, 0.5d, (short) 100, 0.9d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.5d, 100.0d, 0.9d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray8 = new double[] { 100.0d, 0.9d, 10.0d, 2.0d, (short) 10, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.9d, 10.0d, 2.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0f, (-1.0d), (-100.0d), 1.0E-8d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), (-100.0d), 1.0E-8d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        double[] doubleArray5 = new double[] { 100.0d, 2.0d, 10.0f, 1.0f, (-10.0d) };
        double[] doubleArray8 = new double[] { (-100.0d), (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 2.0d, 10.0d, 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        double[] doubleArray6 = new double[] { (short) -1, 100.0d, 1.0E-6d, 1.0f, 1024.0d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, 1.0E-6d, 1.0d, 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        double[] doubleArray3 = new double[] { (short) 100, 0.0f, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (byte) 10, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        double[] doubleArray3 = new double[] { 0.25d, '#', 1.0E-15d };
        double[] doubleArray10 = new double[] { (-1), 10L, 1.0E-10d, 1, (short) -1, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.25d, 35.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 10.0d, 1.0E-10d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { 1.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        double[] doubleArray3 = new double[] { 1.0d, 0.1d, 1.0f };
        double[] doubleArray6 = new double[] { (-0.0d), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        double[] doubleArray6 = new double[] { 100.0d, 0.1d, 1.0E10d, (short) -1, 10, 1 };
        double[] doubleArray9 = new double[] { (byte) 0, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.1d, 1.0E10d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        double[] doubleArray2 = new double[] { 2.0d, 1.0E-10d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        double[] doubleArray2 = new double[] { (-1L), 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.001d, 'a', 1.0E10d, 100.0d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        double[] doubleArray9 = new double[] { 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 97.0d, 1.0E10d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray7 = new double[] { 100.0d, 1.0E-10d, 1000000.0d, (-1.0E10d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-10d, 1000000.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        double[] doubleArray5 = new double[] { 256.0d, (-1L), 0.9d, 0.01d, 100L };
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, (-1.0d), 0.9d, 0.01d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        double[] doubleArray4 = new double[] { 10000.0d, (short) 0, 42.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 0.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        double[] doubleArray4 = new double[] { 1024.0d, '#', 0.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, 35.0d, 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        double[] doubleArray4 = new double[] { 10L, 2.0d, 1.0f, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 2.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        double[] doubleArray2 = new double[] { 1.0f, 10 };
        double[] doubleArray4 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        double[] doubleArray5 = new double[] { 1.0E-8d, 0, (-1), 0.5d, 1.0E-15d };
        double[] doubleArray10 = new double[] { 512.0d, (-100.0d), (-1.0d), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 0.0d, (-1.0d), 0.5d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 512.0d, (-100.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double[] doubleArray4 = new double[] { 'a', 0.01d, 1.0E-12d, (-100.0d) };
        double[] doubleArray11 = new double[] { (short) -1, 1.0E-8d, 1.0E-6d, 0.9d, (short) 100, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 0.01d, 1.0E-12d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0E-8d, 1.0E-6d, 0.9d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        double[] doubleArray6 = new double[] { 0.0d, (short) -1, 42.0d, 100, 10, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), 42.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        double[] doubleArray3 = new double[] { (short) -1, (byte) -1, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (-1.0E10d), (-1.0E10d), 42.0d, 0.9d, (-1.0f), 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), (-1.0E10d), 42.0d, 0.9d, (-1.0d), 5.0d }, 1.0E-15);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        double[] doubleArray2 = new double[] { 100.0f, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        double[] doubleArray6 = new double[] { '4', 1024.0d, 10000.0d, 0.0d, '#', 1024.0d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 1024.0d, 10000.0d, 0.0d, 35.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        double[] doubleArray2 = new double[] { 0.0f, 1.0E8d };
        double[] doubleArray4 = new double[] { 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        double[] doubleArray2 = new double[] { 0.0f, 0.25d };
        double[] doubleArray5 = new double[] { (-1.0d), 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        double[] doubleArray4 = new double[] { 10L, 0.1d, 10000.0d, 100.0f };
        double[] doubleArray7 = new double[] { (-100.0d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.1d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        double[] doubleArray4 = new double[] { 0.5d, 0L, 100L, 512.0d };
        double[] doubleArray10 = new double[] { 1, 1.0E-12d, 1.0E-6d, (short) 0, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.0d, 100.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0E-12d, 1.0E-6d, 0.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        double[] doubleArray5 = new double[] { '4', (byte) 100, (-0.0d), 1.0E-8d, (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0f, '#', 512.0d, 5.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 100.0d, (-0.0d), 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 35.0d, 512.0d, 5.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        double[] doubleArray6 = new double[] { 1L, (-100.0d), 'a', 1.0f, 1.0E10d, 512.0d };
        double[] doubleArray13 = new double[] { 10, 10L, (-0.0d), 1.0f, 0.01d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-100.0d), 97.0d, 1.0d, 1.0E10d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 10.0d, (-0.0d), 1.0d, 0.01d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 10.0f, 100.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 100.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        double[] doubleArray2 = new double[] { 0.3333333d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        double[] doubleArray5 = new double[] { 'a', 1L, 1.0E10d, 1.0d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 1.0d, 1.0E10d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        double[] doubleArray3 = new double[] { 1.0f, 0.1d, 0.0d };
        double[] doubleArray5 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray8 = new double[] { 10000.0d, (short) 0, (short) 0, (-1.0d), 100L, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10000.0d, 0.0d, 0.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        double[] doubleArray6 = new double[] { 10, 1, 5.0d, (-1.0d), 1.0E-15d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        double[] doubleArray10 = new double[] { (-10.0d), 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 5.0d, (-1.0d), 1.0E-15d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-10.0d), 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        double[] doubleArray5 = new double[] { 1.0E-12d, 1.0E-8d, 10000.0d, (byte) 100, 1.0d };
        double[] doubleArray12 = new double[] { 0L, 0.9d, 100.0d, (-0.0d), 100.0d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 1.0E-8d, 10000.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.9d, 100.0d, (-0.0d), 100.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        double[] doubleArray5 = new double[] { 100L, (-1), (byte) 100, 0.5d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 100.0d, 0.5d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        double[] doubleArray2 = new double[] { '4', 0.001d };
        double[] doubleArray8 = new double[] { (-10.0d), 10.0d, 0.0d, ' ', 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-10.0d), 10.0d, 0.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        double[] doubleArray3 = new double[] { 0, (byte) -1, 1.0d };
        double[] doubleArray7 = new double[] { 1L, (byte) 1, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        double[] doubleArray2 = new double[] { '4', (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        double[] doubleArray4 = new double[] { 0.25d, 1.0E10d, 1.0E-12d, 10L };
        double[] doubleArray10 = new double[] { 1024.0d, (-0.0d), 0, 10.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 1.0E10d, 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, (-0.0d), 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        double[] doubleArray2 = new double[] { '4', 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        double[] doubleArray1 = new double[] { (-10.0d) };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        double[] doubleArray4 = new double[] { 1.0E-4d, 1.0E10d, 0.0f, (-0.0d) };
        double[] doubleArray9 = new double[] { 1.0E8d, (-0.0d), 0.0f, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-4d, 1.0E10d, 0.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E8d, (-0.0d), 0.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        double[] doubleArray2 = new double[] { 0.0d, 0.0d };
        double[] doubleArray6 = new double[] { 0, 10L, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        double[] doubleArray5 = new double[] { 0.0f, 0.3333333d, 0L, 0.5d, (-1) };
        double[] doubleArray8 = new double[] { 10L, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.3333333d, 0.0d, 0.5d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 0.0d, 1.0E-4d };
        double[] doubleArray11 = new double[] { 10.0f, (-1.0d), 256.0d, 1000000.0d, 0.0d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, (-1.0d), 256.0d, 1000000.0d, 0.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        double[] doubleArray3 = new double[] { (short) 10, (-1.0d), 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray8 = new double[] { 0.001d, 100.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d, 100.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        double[] doubleArray2 = new double[] { (byte) 1, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        double[] doubleArray3 = new double[] { (-1.0d), 1.0E-6d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0E-6d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray7 = new double[] { (short) -1, 0.70710678d, 0.5d, '#', 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.70710678d, 0.5d, 35.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        double[] doubleArray3 = new double[] { (-0.0d), 42.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        double[] doubleArray5 = new double[] { 10.0d, 0L, 1000000.0d, 0.001d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 1000000.0d, 0.001d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        double[] doubleArray4 = new double[] { (-1.0d), 100.0d, (short) 1, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        double[] doubleArray6 = new double[] { 0.0f, (-1L), (-1), 1.0f, (short) 1, (-1) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), (-1.0d), 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        double[] doubleArray6 = new double[] { 0.0f, (short) 1, 1.0d, (short) 100, 10L, (byte) 10 };
        double[] doubleArray13 = new double[] { (-1.0d), (short) -1, 0.0d, (-1.0E10d), 100, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 1.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), (-1.0d), 0.0d, (-1.0E10d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        double[] doubleArray6 = new double[] { 0.9d, (-1.0f), 0L, (-1.0f), 0.0f, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, (-1.0d), 0.0d, (-1.0d), 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        double[] doubleArray3 = new double[] { 42.0d, 0.1d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        double[] doubleArray2 = new double[] { 5.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        double[] doubleArray2 = new double[] { (byte) 100, 1.0E8d };
        double[] doubleArray7 = new double[] { (byte) 10, 2.0d, 1000000.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 2.0d, 1000000.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        double[] doubleArray5 = new double[] { (byte) 1, 0.0f, '#', (byte) 10, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 35.0d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        double[] doubleArray3 = new double[] { 1.0E-8d, (-1), 100.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        double[] doubleArray4 = new double[] { 0.1d, 1L, 100.0f, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        double[] doubleArray2 = new double[] { 1, '4' };
        double[] doubleArray5 = new double[] { (-1.0E10d), 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        double[] doubleArray6 = new double[] { 0.1d, 10, 0.70710678d, 10.0f, 'a', (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 10.0d, 0.70710678d, 10.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        double[] doubleArray3 = new double[] { (byte) -1, 0.25d, (-1.0d) };
        double[] doubleArray6 = new double[] { (-1), 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray8 = new double[] { 2.0d, 0.1d, 10.0f, (byte) -1, '#', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, 0.1d, 10.0d, (-1.0d), 35.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        double[] doubleArray4 = new double[] { 100.0f, (short) 10, ' ', 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 10.0d, 32.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        double[] doubleArray5 = new double[] { 1.0E-12d, (short) -1, 1, 1.0E10d, 100 };
        double[] doubleArray11 = new double[] { 1.0E-6d, (-1.0d), (byte) 1, (byte) -1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, (-1.0d), 1.0d, 1.0E10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, (-1.0d), 1.0d, (-1.0d), 0.001d }, 1.0E-15);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        double[] doubleArray5 = new double[] { 1.0E-4d, 0L, 512.0d, 10.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 0.0d, 512.0d, 10.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        double[] doubleArray4 = new double[] { (-1), 0.25d, 1L, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.25d, 1.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        double[] doubleArray6 = new double[] { 0.1d, 1.0f, 10.0f, ' ', 256.0d, (-100.0d) };
        double[] doubleArray11 = new double[] { (-1L), (-1.0d), (-1.0f), 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        double[] doubleArray14 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 1.0d, 10.0d, 32.0d, 256.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 'a', 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E-12d, 1.0E-6d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 1.0E-6d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        double[] doubleArray3 = new double[] { (-100.0d), 100.0d, (byte) 100 };
        double[] doubleArray8 = new double[] { 100.0d, (byte) 100, 10.0d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 10.0d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 0, (byte) 100, 1.0E8d, 1.0f, '#' };
        double[] doubleArray12 = new double[] { (byte) -1, 100L, (short) 1, (byte) 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 1.0E8d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 100.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        double[] doubleArray2 = new double[] { 1.0d, 1.0E-4d };
        double[] doubleArray4 = new double[] { (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        double[] doubleArray4 = new double[] { (-1L), 0.3333333d, (short) 100, 1.0d };
        double[] doubleArray10 = new double[] { 0, (-1.0f), (short) 10, (-1), 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.3333333d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0d), 10.0d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        double[] doubleArray6 = new double[] { (-100.0d), (short) 100, 10000.0d, (short) 10, (-1L), (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 100.0d, 10000.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        double[] doubleArray5 = new double[] { 1.0d, (-100.0d), ' ', (-1.0d), (short) 10 };
        double[] doubleArray10 = new double[] { 1.0E10d, 1, 1.0E-10d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-100.0d), 32.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E10d, 1.0d, 1.0E-10d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        double[] doubleArray3 = new double[] { 1.0E-4d, 'a', 0.25d };
        double[] doubleArray8 = new double[] { 0L, 1.0E-12d, 2.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d, 97.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0E-12d, 2.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        double[] doubleArray2 = new double[] { 100L, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        double[] doubleArray10 = new double[] { 1, (-10.0d), 1.0d, 0.25d, (-10.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-10.0d), 1.0d, 0.25d, (-10.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        double[] doubleArray5 = new double[] { 10.0d, 0.25d, 1.0f, 1.0f, 'a' };
        double[] doubleArray10 = new double[] { 0.0f, (-1.0E10d), 1.0E-10d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.25d, 1.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0E10d), 1.0E-10d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { 0.0f, 0.001d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.001d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        double[] doubleArray6 = new double[] { 10.0f, 1.0E10d, 0.001d, 10, (byte) 100, (short) 10 };
        double[] doubleArray13 = new double[] { (byte) 1, (short) 10, 1.0d, (byte) 0, '#', (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E10d, 0.001d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 10.0d, 1.0d, 0.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 1, 1.0E-6d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-6d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        double[] doubleArray6 = new double[] { 10.0f, 1.0E8d, ' ', 10000.0d, (-0.0d), 1000000.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E8d, 32.0d, 10000.0d, (-0.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        double[] doubleArray5 = new double[] { 0, 10.0d, 5.0d, (-10.0d), (-1.0E10d) };
        double[] doubleArray11 = new double[] { 0.3333333d, 1.0f, 1.0d, (-10.0d), (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 5.0d, (-10.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.3333333d, 1.0d, 1.0d, (-10.0d), (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        double[] doubleArray5 = new double[] { 2.0d, (byte) 1, 0.001d, 1.0E-8d, 512.0d };
        double[] doubleArray7 = new double[] { 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 1.0d, 0.001d, 1.0E-8d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        double[] doubleArray3 = new double[] { 0L, 1.0E-6d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        double[] doubleArray4 = new double[] { '4', 2.0d, 5.0d, 0.01d };
        double[] doubleArray9 = new double[] { 0.9d, 1.0E10d, 1, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 2.0d, 5.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.9d, 1.0E10d, 1.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        double[] doubleArray3 = new double[] { (short) 10, (short) -1, 100 };
        double[] doubleArray6 = new double[] { (-1.0d), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        double[] doubleArray4 = new double[] { 1.0E8d, (byte) 10, 1.0E-6d, 0.3333333d };
        double[] doubleArray8 = new double[] { 0.70710678d, (short) 10, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 10.0d, 1.0E-6d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.70710678d, 10.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        double[] doubleArray4 = new double[] { 1.0d, 512.0d, 0.5d, 100.0f };
        double[] doubleArray11 = new double[] { 0L, 1.0E8d, 100, (-1.0d), 100L, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 512.0d, 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1.0E8d, 100.0d, (-1.0d), 100.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        double[] doubleArray4 = new double[] { 0.0f, 10.0d, ' ', (-10.0d) };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 10.0d, 32.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        double[] doubleArray2 = new double[] { 1.0d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 2.0d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        double[] doubleArray4 = new double[] { 5.0d, 0.25d, 1.0E-6d, 42.0d };
        double[] doubleArray11 = new double[] { 1.0d, (-1), 1, 0.9d, 1000000.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 0.25d, 1.0E-6d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), 1.0d, 0.9d, 1000000.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        double[] doubleArray4 = new double[] { (byte) 0, 0.3333333d, 1.0E-4d, (-10.0d) };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.3333333d, 1.0E-4d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        double[] doubleArray3 = new double[] { 0.01d, (byte) 0, (byte) 0 };
        double[] doubleArray5 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        double[] doubleArray6 = new double[] { 256.0d, '#', 0L, 0.9d, 1.0E-10d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 35.0d, 0.0d, 0.9d, 1.0E-10d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        double[] doubleArray1 = new double[] { '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        double[] doubleArray6 = new double[] { (-1.0d), 10.0d, 10000.0d, (byte) -1, (short) 1, 1.0E-6d };
        double[] doubleArray13 = new double[] { (byte) 1, 0.01d, 1.0d, 0.70710678d, 0.25d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 10000.0d, (-1.0d), 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 0.01d, 1.0d, 0.70710678d, 0.25d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        double[] doubleArray5 = new double[] { (byte) -1, 100.0d, (byte) 10, '#', 1.0E-10d };
        double[] doubleArray10 = new double[] { (-1.0d), 256.0d, 1.0E-4d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        double[] doubleArray12 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, 35.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 256.0d, 1.0E-4d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        double[] doubleArray2 = new double[] { 0.70710678d, 1.0d };
        double[] doubleArray7 = new double[] { 0.3333333d, '#', 100, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.3333333d, 35.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray8 = new double[] { 0.01d, (byte) 1, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.01d, 1.0d, 0.0d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        double[] doubleArray3 = new double[] { (byte) 1, 1.0E-8d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-8d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray3 = new double[] { (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        double[] doubleArray2 = new double[] { 10.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        double[] doubleArray6 = new double[] { 1.0E-8d, 1, 100, 100.0f, 10L, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 1.0d, 100.0d, 100.0d, 10.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        double[] doubleArray4 = new double[] { 1.0E-6d, 1000000.0d, 0.3333333d, ' ' };
        double[] doubleArray10 = new double[] { 10.0d, 256.0d, 10000.0d, (-1.0E10d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1000000.0d, 0.3333333d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 256.0d, 10000.0d, (-1.0E10d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        double[] doubleArray5 = new double[] { 256.0d, 0.70710678d, 1.0E-8d, 0.1d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 0.70710678d, 1.0E-8d, 0.1d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        double[] doubleArray6 = new double[] { 100, 1.0d, 1.0E-4d, (-1.0f), 10.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 1.0E-4d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        double[] doubleArray2 = new double[] { (short) 100, 0.25d };
        double[] doubleArray5 = new double[] { 1.0E-8d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        double[] doubleArray2 = new double[] { 1.0f, 1024.0d };
        double[] doubleArray6 = new double[] { 100, (-0.0d), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-0.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        double[] doubleArray4 = new double[] { 0.01d, 1, 256.0d, 1.0E-8d };
        double[] doubleArray8 = new double[] { 0L, 512.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 1.0d, 256.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 512.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 10.0f, 512.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 512.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        double[] doubleArray5 = new double[] { 0.001d, (byte) 10, 10.0d, ' ', (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 10.0d, 10.0d, 32.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        double[] doubleArray3 = new double[] { '#', '#', 100L };
        double[] doubleArray10 = new double[] { 1.0d, (byte) 1, (byte) 1, 0.0f, 1024.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0d, 1.0d, 0.0d, 1024.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        double[] doubleArray6 = new double[] { (-100.0d), 2.0d, 1.0E-8d, (-0.0d), (-1L), (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 2.0d, 1.0E-8d, (-0.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        double[] doubleArray3 = new double[] { (short) -1, 0.70710678d, 1 };
        double[] doubleArray5 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.70710678d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        double[] doubleArray2 = new double[] { (byte) 10, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        double[] doubleArray6 = new double[] { 512.0d, '4', 0.0d, 1.0E-15d, 0.0d, 1L };
        double[] doubleArray8 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 52.0d, 0.0d, 1.0E-15d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d }, 1.0E-15);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        double[] doubleArray4 = new double[] { 256.0d, 10.0f, 0.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 10.0d, 0.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        double[] doubleArray3 = new double[] { (byte) 1, 1.0f, 0.01d };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        double[] doubleArray3 = new double[] { '#', (-10.0d), 1.0E-8d };
        double[] doubleArray7 = new double[] { (short) 10, 1.0E-6d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, (-10.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0E-6d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        double[] doubleArray4 = new double[] { 0.01d, (byte) 1, 1.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        double[] doubleArray8 = new double[] { (byte) 100, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 1.0d, 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        double[] doubleArray4 = new double[] { 100.0f, 1.0E-12d, 1.0E-8d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-12d, 1.0E-8d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        double[] doubleArray3 = new double[] { 0.1d, (byte) -1, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, (-1.0d), 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        double[] doubleArray6 = new double[] { 0L, (byte) 1, (-100.0d), 0.1d, (byte) 0, 42.0d };
        double[] doubleArray11 = new double[] { (-1.0f), (short) 0, 0.25d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, (-100.0d), 0.1d, 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d, 0.25d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        double[] doubleArray2 = new double[] { 10.0f, 1.0f };
        double[] doubleArray9 = new double[] { (-10.0d), '4', 1.0d, 1, 0.1d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        double[] doubleArray16 = new double[] { (short) -1, (byte) 1, (-100.0d), '4', 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-10.0d), 52.0d, 1.0d, 1.0d, 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 1.0d, (-100.0d), 52.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        double[] doubleArray6 = new double[] { 0L, (short) 1, 0.3333333d, ' ', 1.0E-8d, 1.0f };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 0.3333333d, 32.0d, 1.0E-8d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        double[] doubleArray6 = new double[] { 1.0E-10d, 100L, (-1L), '4', (byte) 0, 1.0f };
        double[] doubleArray12 = new double[] { 0.001d, (-1.0E10d), (-1L), 0.25d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, 100.0d, (-1.0d), 52.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.001d, (-1.0E10d), (-1.0d), 0.25d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray4 = new double[] { 1.0E-10d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray6 = new double[] { 0.01d, 0, (-0.0d), 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.0d, (-0.0d), 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        double[] doubleArray4 = new double[] { 1.0d, 1.0E-15d, (-1.0d), (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-15d, (-1.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        double[] doubleArray4 = new double[] { (-1.0f), ' ', 0.5d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 32.0d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        double[] doubleArray6 = new double[] { 1L, (short) 10, 100L, (short) 1, (-1.0d), (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 100.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        double[] doubleArray4 = new double[] { 1.0d, 0.0d, 1.0E-15d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        double[] doubleArray6 = new double[] { (-1.0f), ' ', 1.0E-15d, 10.0f, 10.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 32.0d, 1.0E-15d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray7 = new double[] { 10L, 1.0E10d, 0.001d, 5.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0E10d, 0.001d, 5.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        double[] doubleArray6 = new double[] { (byte) 1, 0.01d, (short) 1, (-1), 1.0E-4d, 0.0d };
        double[] doubleArray10 = new double[] { (short) 10, (-0.0d), 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.01d, 1.0d, (-1.0d), 1.0E-4d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-0.0d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        double[] doubleArray6 = new double[] { 0.0d, 0, (-1.0E10d), (-1), 0L, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, (-1.0E10d), (-1.0d), 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        double[] doubleArray4 = new double[] { (byte) 100, 1.0E-10d, (byte) -1, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-10d, (-1.0d), 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        double[] doubleArray4 = new double[] { 0.5d, 1.0f, (short) -1, (-1.0d) };
        double[] doubleArray6 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        double[] doubleArray6 = new double[] { 256.0d, 1.0E-10d, 10.0f, (byte) -1, (byte) 0, 100.0f };
        double[] doubleArray11 = new double[] { 42.0d, 1.0E-4d, '4', 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 1.0E-10d, 10.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 42.0d, 1.0E-4d, 52.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray3 = new double[] { 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double[] doubleArray4 = new double[] { 0.3333333d, 10, 1, 10.0d };
        double[] doubleArray9 = new double[] { (-1.0d), 100L, 0, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.3333333d, 10.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 100.0d, 0.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        double[] doubleArray3 = new double[] { 'a', 5.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 5.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        double[] doubleArray3 = new double[] { 10.0f, 0.0d, (-100.0d) };
        double[] doubleArray7 = new double[] { 10L, 100.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        double[] doubleArray5 = new double[] { (-1), (byte) 0, (-1.0d), 10.0f, 0.5d };
        double[] doubleArray9 = new double[] { 0.01d, (-1.0f), (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, (-1.0d), 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.01d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        double[] doubleArray5 = new double[] { 0.25d, '4', (-1), 1.0E-6d, 2.0d };
        double[] doubleArray12 = new double[] { 10000.0d, 1.0E-8d, 0.9d, 1.0E-15d, (-0.0d), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 52.0d, (-1.0d), 1.0E-6d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10000.0d, 1.0E-8d, 0.9d, 1.0E-15d, (-0.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        double[] doubleArray6 = new double[] { (byte) 100, 0.01d, (-0.0d), (-1L), (-1L), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.01d, (-0.0d), (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        double[] doubleArray5 = new double[] { 1.0d, '4', (short) -1, 1.0d, 10000.0d };
        double[] doubleArray9 = new double[] { 1L, 0.25d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 52.0d, (-1.0d), 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.25d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        double[] doubleArray2 = new double[] { (-1.0f), 0.001d };
        double[] doubleArray5 = new double[] { 10.0f, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        double[] doubleArray4 = new double[] { (-10.0d), 42.0d, (byte) 10, 10L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 42.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray4 = new double[] { 0.25d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray5 = new double[] { 1.0E8d, (-1L), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        double[] doubleArray4 = new double[] { 0, 0.70710678d, 512.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.70710678d, 512.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.25d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.25d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        double[] doubleArray4 = new double[] { 1000000.0d, (-1), (short) 1, ' ' };
        double[] doubleArray7 = new double[] { (-0.0d), 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, (-1.0d), 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-0.0d), 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        double[] doubleArray3 = new double[] { 1.0E10d, 1.0d, 1000000.0d };
        double[] doubleArray7 = new double[] { 0.0f, '4', 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 52.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        double[] doubleArray4 = new double[] { 0.001d, 0.70710678d, (byte) 1, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 0.70710678d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        double[] doubleArray5 = new double[] { (short) 100, 1.0d, (short) 0, 256.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d, 0.0d, 256.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.25d, (-1.0d), 1.0E-4d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, (-1.0d), 1.0E-4d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        double[] doubleArray5 = new double[] { (short) 1, 1.0E10d, '4', 1L, 1.0E-6d };
        double[] doubleArray11 = new double[] { (-1.0E10d), 0.3333333d, 10000.0d, 512.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E10d, 52.0d, 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0E10d), 0.3333333d, 10000.0d, 512.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        double[] doubleArray5 = new double[] { 0.01d, 100L, 42.0d, 0.9d, 100.0d };
        double[] doubleArray7 = new double[] { 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 100.0d, 42.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        double[] doubleArray1 = new double[] { 1.0E-8d };
        double[] doubleArray5 = new double[] { '#', 100.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        double[] doubleArray3 = new double[] { 1000000.0d, 10, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, 10.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        double[] doubleArray2 = new double[] { 1.0E-8d, (byte) 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        double[] doubleArray6 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d }, 1.0E-15);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        double[] doubleArray6 = new double[] { 0.70710678d, 42.0d, 100L, 1.0E-15d, 0.5d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 42.0d, 100.0d, 1.0E-15d, 0.5d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        double[] doubleArray3 = new double[] { (short) 0, 1.0E-15d, 1.0E-6d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0E-15d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        double[] doubleArray6 = new double[] { 10000.0d, 1.0f, 1.0d, 100.0d, 100, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 1.0d, 1.0d, 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 'a', (byte) 100, (byte) 10, (-1.0f), (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 100.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        double[] doubleArray6 = new double[] { 1.0d, ' ', 100.0f, (short) 1, 0.25d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 32.0d, 100.0d, 1.0d, 0.25d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        double[] doubleArray4 = new double[] { 10000.0d, 1.0d, (short) 0, 1024.0d };
        double[] doubleArray7 = new double[] { 512.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 1.0d, 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 512.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        double[] doubleArray6 = new double[] { 0.0d, (short) 100, 0.001d, (byte) 10, (byte) -1, 1.0d };
        double[] doubleArray10 = new double[] { 1.0E-12d, 0.1d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 0.001d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 0.1d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { (-100.0d), 100.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        double[] doubleArray6 = new double[] { 0.01d, 0.0d, 1.0E-15d, 1.0E10d, 0L, 2.0d };
        double[] doubleArray13 = new double[] { 1.0E-10d, (-100.0d), 1.0f, (-1L), (byte) 10, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.0d, 1.0E-15d, 1.0E10d, 0.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-10d, (-100.0d), 1.0d, (-1.0d), 10.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        double[] doubleArray5 = new double[] { 0.3333333d, 10, (byte) 100, 0, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, 10.0d, 100.0d, 0.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0, 0.5d, (-10.0d), (-1), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.5d, (-10.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        double[] doubleArray4 = new double[] { 1.0E-8d, (byte) -1, (byte) 0, 1.0E-12d };
        double[] doubleArray9 = new double[] { 1.0E-8d, 1.0E-10d, 0.70710678d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-8d, (-1.0d), 0.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-8d, 1.0E-10d, 0.70710678d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        double[] doubleArray3 = new double[] { 1, 0.5d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.5d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        double[] doubleArray2 = new double[] { (short) 0, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { (short) 0, 256.0d, 1.0E-6d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 256.0d, 1.0E-6d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        double[] doubleArray6 = new double[] { 1000000.0d, 1.0E-12d, 100.0f, 1.0f, 1.0E-12d, 256.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 1.0E-12d, 100.0d, 1.0d, 1.0E-12d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        double[] doubleArray2 = new double[] { 10, (-10.0d) };
        double[] doubleArray9 = new double[] { 1.0d, ' ', 0.0f, 10, 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 32.0d, 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        double[] doubleArray5 = new double[] { 42.0d, 0.01d, 256.0d, 1.0E10d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        double[] doubleArray10 = new double[] { 0.25d, 1024.0d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.01d, 256.0d, 1.0E10d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.25d, 1024.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        double[] doubleArray4 = new double[] { 5.0d, '4', 1.0E-4d, 0.5d };
        double[] doubleArray8 = new double[] { (-1.0d), 0.9d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 52.0d, 1.0E-4d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.9d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        double[] doubleArray4 = new double[] { (short) 0, '#', 0.0f, 1024.0d };
        double[] doubleArray10 = new double[] { (byte) -1, (short) 1, (-10.0d), 1.0E-15d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 35.0d, 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, (-10.0d), 1.0E-15d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        double[] doubleArray3 = new double[] { 0.0f, 10000.0d, (byte) 100 };
        double[] doubleArray10 = new double[] { 1024.0d, 100.0f, (short) 0, 0.0f, 1.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 100.0d, 0.0d, 0.0d, 1.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        double[] doubleArray5 = new double[] { 'a', (byte) 100, 100.0d, (byte) 100, 1024.0d };
        double[] doubleArray10 = new double[] { 1024.0d, 1024.0d, 42.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 100.0d, 100.0d, 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 1024.0d, 42.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0d, 100.0f, (byte) 10, (byte) 100, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        double[] doubleArray6 = new double[] { (short) 100, (-1.0d), 1.0d, 1.0E-12d, 1.0E-4d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 1.0d, 1.0E-12d, 1.0E-4d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        double[] doubleArray6 = new double[] { 10.0f, (short) 100, '4', 42.0d, 0.001d, (byte) 100 };
        double[] doubleArray9 = new double[] { (-1.0E10d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 52.0d, 42.0d, 0.001d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0E10d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        double[] doubleArray5 = new double[] { 10000.0d, (byte) -1, 0.9d, (-0.0d), 0.01d };
        double[] doubleArray10 = new double[] { 0.9d, 512.0d, (byte) 10, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, (-1.0d), 0.9d, (-0.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9d, 512.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        double[] doubleArray5 = new double[] { 'a', (byte) -1, (-10.0d), (-1.0d), 0.0f };
        double[] doubleArray12 = new double[] { 1L, (short) -1, 1.0E-6d, 10.0f, (short) 10, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, (-1.0d), (-10.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, (-1.0d), 1.0E-6d, 10.0d, 10.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        double[] doubleArray3 = new double[] { (short) 1, 100.0d, 256.0d };
        double[] doubleArray5 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        double[] doubleArray6 = new double[] { (-1.0d), 0.5d, 1.0E-6d, 1.0E-10d, 0.001d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.5d, 1.0E-6d, 1.0E-10d, 0.001d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        double[] doubleArray4 = new double[] { 1, (-1.0d), (-1.0d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        double[] doubleArray2 = new double[] { (-1.0f), 1.0E-4d };
        double[] doubleArray6 = new double[] { 10, 100.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        double[] doubleArray3 = new double[] { 10.0d, (-10.0d), (-1.0E10d) };
        double[] doubleArray7 = new double[] { 0, 1.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        double[] doubleArray15 = new double[] { 10000.0d, (-1.0d), '#', (short) 1, '4', 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-10.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10000.0d, (-1.0d), 35.0d, 1.0d, 52.0d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-4d, 1.0E-6d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-4d, 1.0E-6d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        double[] doubleArray4 = new double[] { (byte) 100, (-1.0d), 0.25d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        double[] doubleArray2 = new double[] { 1, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        double[] doubleArray5 = new double[] { 1.0E-10d, 1L, 2.0d, 0L, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 1.0d, 2.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, 'a', 0.0d, (byte) 100, 1.0E-6d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 97.0d, 0.0d, 100.0d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        double[] doubleArray4 = new double[] { 100.0d, 1L, '#', 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        double[] doubleArray4 = new double[] { 512.0d, 0.0d, '#', (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 0.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1000000.0d, 2.0d, 1.0E8d, (byte) 100, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 2.0d, 1.0E8d, 100.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        double[] doubleArray3 = new double[] { (short) 1, 0.9d, 100.0d };
        double[] doubleArray8 = new double[] { 1.0d, 10.0d, 10L, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 10.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        double[] doubleArray5 = new double[] { '#', (-0.0d), 10.0d, 0.3333333d, 0.0d };
        double[] doubleArray8 = new double[] { (byte) 1, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, (-0.0d), 10.0d, 0.3333333d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        double[] doubleArray5 = new double[] { (byte) 1, (byte) 100, (byte) 100, 1.0E-15d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 100.0d, 1.0E-15d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        double[] doubleArray3 = new double[] { 100.0f, 1.0d, 0.0d };
        double[] doubleArray5 = new double[] { (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        double[] doubleArray2 = new double[] { (-1.0d), 1024.0d };
        double[] doubleArray6 = new double[] { 1.0E-4d, (-10.0d), 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, (-10.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        double[] doubleArray2 = new double[] { (byte) 10, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        double[] doubleArray5 = new double[] { (byte) -1, ' ', 1.0E-12d, 0.1d, 1 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 32.0d, 1.0E-12d, 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        double[] doubleArray5 = new double[] { 0.001d, 0L, (-1L), (short) 1, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 0.0d, (-1.0d), 1.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-100.0d), (-1.0f), (-1.0f), (byte) 100, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), (-1.0d), (-1.0d), 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        double[] doubleArray4 = new double[] { (-0.0d), 1.0E-8d, 1, 512.0d };
        double[] doubleArray9 = new double[] { 100.0f, (byte) 0, (byte) 100, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-0.0d), 1.0E-8d, 1.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0, 0.01d, 10L, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.01d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        double[] doubleArray1 = new double[] { 0.25d };
        double[] doubleArray5 = new double[] { (byte) 1, 'a', 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        double[] doubleArray3 = new double[] { 0.5d, (-1L), (-1.0d) };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        double[] doubleArray6 = new double[] { (short) -1, 100.0d, ' ', 1.0d, (short) -1, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, 32.0d, 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        double[] doubleArray3 = new double[] { 0.9d, 100.0d, (byte) 100 };
        double[] doubleArray5 = new double[] { ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        double[] doubleArray5 = new double[] { 1.0E8d, 1.0f, '#', (-1.0f), 1.0E-6d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, 1.0d, 35.0d, (-1.0d), 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        double[] doubleArray4 = new double[] { (byte) -1, 0.0f, 5.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 5.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        double[] doubleArray5 = new double[] { 0.9d, (-100.0d), (byte) 0, 1.0E-4d, (-1L) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, (-100.0d), 0.0d, 1.0E-4d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        double[] doubleArray5 = new double[] { 'a', (-1.0d), 42.0d, 0.70710678d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, (-1.0d), 42.0d, 0.70710678d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        double[] doubleArray2 = new double[] { (-1.0f), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        double[] doubleArray4 = new double[] { 0.01d, (byte) 1, 1.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 1.0d, 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        double[] doubleArray4 = new double[] { 1.0E-10d, 0.0f, 1000000.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 0.0d, 1000000.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        double[] doubleArray2 = new double[] { (byte) 0, (byte) 1 };
        double[] doubleArray7 = new double[] { 1.0E-12d, (-100.0d), 1.0E8d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, (-100.0d), 1.0E8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        double[] doubleArray4 = new double[] { 0.01d, 100, 10000.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 100.0d, 10000.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        double[] doubleArray2 = new double[] { 10, 100 };
        double[] doubleArray4 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        double[] doubleArray3 = new double[] { (byte) 1, 2.0d, 0.0f };
        double[] doubleArray8 = new double[] { (short) 10, (short) 1, 1.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray8 = new double[] { (short) 100, (short) 10, 1.0E-8d, 100L, (-1), 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0E-8d, 100.0d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0.0d, (short) 1, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        double[] doubleArray2 = new double[] { 10.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        double[] doubleArray5 = new double[] { 1.0E-4d, 0.0d, 0.9d, '4', 256.0d };
        double[] doubleArray9 = new double[] { 10.0d, ' ', (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 0.0d, 0.9d, 52.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        double[] doubleArray3 = new double[] { (-1), 10, 100L };
        double[] doubleArray6 = new double[] { 10L, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        double[] doubleArray3 = new double[] { 0.01d, 10, (-1.0E10d) };
        double[] doubleArray9 = new double[] { 0.3333333d, 0.1d, 1.0E-12d, 0.5d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 10.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.3333333d, 0.1d, 1.0E-12d, 0.5d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        double[] doubleArray6 = new double[] { 0.9d, 5.0d, (-1.0f), ' ', 10, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 5.0d, (-1.0d), 32.0d, 10.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        double[] doubleArray4 = new double[] { '#', 1, 1.0E-15d, (byte) 100 };
        double[] doubleArray10 = new double[] { 1, 0.5d, 1000000.0d, 100, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 1.0d, 1.0E-15d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.5d, 1000000.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        double[] doubleArray3 = new double[] { (byte) 10, 1.0E-8d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0E-8d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        double[] doubleArray5 = new double[] { (-1.0f), 1L, 1.0E-6d, (short) -1, (-10.0d) };
        double[] doubleArray11 = new double[] { '#', (short) 1, (-0.0d), 100L, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 1.0E-6d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d, 1.0d, (-0.0d), 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.9d, 42.0d, 512.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 42.0d, 512.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        double[] doubleArray3 = new double[] { 100.0d, 1024.0d, 0L };
        double[] doubleArray7 = new double[] { 5.0d, (-100.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        double[] doubleArray11 = new double[] { (byte) -1, 1L };
        double[] doubleArray12 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray12);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1024.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d, (-100.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray4 = new double[] { 1.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        double[] doubleArray3 = new double[] { 1L, (short) 0, (short) -1 };
        double[] doubleArray6 = new double[] { 1.0E-12d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-12d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) 10, 0.9d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.9d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        double[] doubleArray2 = new double[] { 512.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        double[] doubleArray6 = new double[] { (short) -1, 10.0f, 0.0f, 10.0d, 10L, 1.0d };
        double[] doubleArray13 = new double[] { 0.1d, (-1L), 10000.0d, '#', 1.0E-6d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 0.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.1d, (-1.0d), 10000.0d, 35.0d, 1.0E-6d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray8 = new double[] { (byte) 100, (short) 100, 10, (byte) 10, 1.0d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 10.0d, 10.0d, 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { '4', 100L, 1000000.0d, (short) 10, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 100.0d, 1000000.0d, 10.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        double[] doubleArray4 = new double[] { ' ', 0.0d, 10.0f, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 0.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        double[] doubleArray4 = new double[] { 100.0d, (-10.0d), (-0.0d), (byte) -1 };
        double[] doubleArray9 = new double[] { 256.0d, (short) 1, 1.0E-15d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-10.0d), (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 1.0d, 1.0E-15d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        double[] doubleArray2 = new double[] { '4', 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        double[] doubleArray6 = new double[] { (short) -1, (-0.0d), 42.0d, 1.0E-10d, 2.0d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-0.0d), 42.0d, 1.0E-10d, 2.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray3 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        double[] doubleArray6 = new double[] { (-1.0d), (-10.0d), 1000000.0d, 0.0f, 0.0d, ' ' };
        double[] doubleArray11 = new double[] { 0.70710678d, 10.0d, 10L, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-10.0d), 1000000.0d, 0.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.70710678d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        double[] doubleArray3 = new double[] { 1000000.0d, 1.0E8d, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, 1.0E8d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        double[] doubleArray2 = new double[] { (short) 0, 5.0d };
        double[] doubleArray8 = new double[] { 1.0E10d, 1.0E-12d, 100, (-1.0f), (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, 1.0E-12d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0d), 1.0E-12d, 1.0E-8d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-12d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        double[] doubleArray6 = new double[] { 1.0E8d, 10.0d, 100.0d, 100.0d, 10L, 10L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 10.0d, 100.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        double[] doubleArray2 = new double[] { 0.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray6 = new double[] { (byte) 100, 0.01d, 10000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.01d, 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 100, (-1), ' ', (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-1.0d), 32.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        double[] doubleArray4 = new double[] { (-1.0d), 1024.0d, (short) 100, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1024.0d, 100.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        double[] doubleArray2 = new double[] { (-0.0d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        double[] doubleArray2 = new double[] { 512.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        double[] doubleArray4 = new double[] { 'a', (-1.0d), 5.0d, 0.3333333d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, (-1.0d), 5.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.70710678d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.70710678d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray5 = new double[] { 1.0E-10d, 0L, 0.1d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 0.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray4 = new double[] { 2.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        double[] doubleArray2 = new double[] { 0.5d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray5 = new double[] { 10.0d, 1.0E-15d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        double[] doubleArray2 = new double[] { (short) -1, 10.0d };
        double[] doubleArray6 = new double[] { 100L, 1.0d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        double[] doubleArray10 = new double[] { 10, 5.0d, 0.5d, '#', 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 5.0d, 0.5d, 35.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        double[] doubleArray4 = new double[] { 'a', 0.25d, (short) 1, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 0.25d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        double[] doubleArray3 = new double[] { 42.0d, 10.0d, (-1) };
        double[] doubleArray6 = new double[] { 0.001d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        double[] doubleArray5 = new double[] { 2.0d, 0L, 1000000.0d, 42.0d, (-1L) };
        double[] doubleArray11 = new double[] { 0.0f, (byte) 100, (byte) 1, (-100.0d), 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 0.0d, 1000000.0d, 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, 1.0d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

