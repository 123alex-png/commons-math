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
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0E-10d, '4', (-100.0d), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 52.0d, (-100.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray6 = new double[] { (byte) 100, (byte) -1, (byte) 100, 0.1d, (-100.0d), 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 100.0d, 0.1d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray2 = new double[] { 42.0d, 10000.0d };
        double[] doubleArray4 = new double[] { 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d }, 1.0E-15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray6 = new double[] { 0.25d, 1.0f, (short) 0, 0.001d, 10, 0.01d };
        double[] doubleArray13 = new double[] { 10000.0d, 1.0E-15d, 10.0f, 2.0d, 0.70710678d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 1.0d, 0.0d, 0.001d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10000.0d, 1.0E-15d, 10.0d, 2.0d, 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.1d, 2.0d, 2.0d, (byte) 1, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 2.0d, 2.0d, 1.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray5 = new double[] { 0.9d, 0.5d, (short) 10, (short) 10, 2.0d };
        double[] doubleArray10 = new double[] { (-1), 10.0d, (short) 100, 10000.0d };
        double[] doubleArray16 = new double[] { 1.0E-8d, 10000.0d, 0.3333333d, 1L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray16);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray16);
        java.lang.Class<?> wildcardClass19 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 0.5d, 10.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 10.0d, 100.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0E-8d, 10000.0d, 0.3333333d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray2 = new double[] { 512.0d, 1.0d };
        double[] doubleArray5 = new double[] { 0.25d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        double[] doubleArray6 = new double[] { 1.0d, 0.3333333d, (-10.0d), 0.70710678d, 1.0E-6d, 1.0E-15d };
        double[] doubleArray12 = new double[] { 10000.0d, (short) 10, 0.70710678d, 42.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.3333333d, (-10.0d), 0.70710678d, 1.0E-6d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10000.0d, 10.0d, 0.70710678d, 42.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray4 = new double[] { (-1.0d), 100.0f, 1, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 100.0d, 1.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray4 = new double[] { 1.0E-4d, (short) 10, 2.0d, 100.0f };
        double[] doubleArray6 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-4d, 10.0d, 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray2 = new double[] { 0.5d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.5d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray2 = new double[] { 0.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray6 = new double[] { 10.0f, 0.70710678d, 0, 42.0d, (byte) 100, (byte) 100 };
        double[] doubleArray12 = new double[] { 1000000.0d, (-1L), 1.0E8d, (byte) 1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.70710678d, 0.0d, 42.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1000000.0d, (-1.0d), 1.0E8d, 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray2 = new double[] { 10.0f, (short) 100 };
        double[] doubleArray9 = new double[] { 0.70710678d, (short) 1, 10.0d, 100, 2.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 1.0d, 10.0d, 100.0d, 2.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0, 0.0f, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray5 = new double[] { 1.0E-8d, 100, 10, '4', (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 100.0d, 10.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray5 = new double[] { 0.1d, (-1.0f), (byte) 10, 1.0d, 10000.0d };
        double[] doubleArray11 = new double[] { 1.0d, 1.0E10d, (short) 100, (-1.0f), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, (-1.0d), 10.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0E10d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray6 = new double[] { 1000000.0d, 1.0d, 0.01d, ' ', 0.001d, (byte) 0 };
        double[] doubleArray10 = new double[] { 0.01d, (byte) 10, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 1.0d, 0.01d, 32.0d, 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.01d, 10.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray4 = new double[] { 10000.0d, 512.0d, 0.9d, 1000000.0d };
        double[] doubleArray11 = new double[] { 100.0d, 1.0d, 0L, 0.0d, (short) 10, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 512.0d, 0.9d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 1.0d, 0.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) 1, 1.0d, 2.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 2.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray2 = new double[] { 512.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray4 = new double[] { 256.0d, 1.0E-12d, (byte) 1, 10L };
        double[] doubleArray8 = new double[] { 1.0E8d, (short) 1, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 1.0E-12d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray4 = new double[] { 1.0E-6d, 1000000.0d, 42.0d, 10 };
        double[] doubleArray7 = new double[] { 0.0f, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1000000.0d, 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray5 = new double[] { '#', 1000000.0d, 0.9d, 1.0E-15d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 1000000.0d, 0.9d, 1.0E-15d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0E-10d, (-1.0d), 1.0E-10d, 100L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, (-1.0d), 1.0E-10d, 100.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        double[] doubleArray2 = new double[] { (byte) 100, 10.0d };
        double[] doubleArray4 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray3 = new double[] { 1.0E-15d, (-1L), (byte) 100 };
        double[] doubleArray9 = new double[] { 10L, (-10.0d), (short) 1, 1.0E-12d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-10.0d), 1.0d, 1.0E-12d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray2 = new double[] { (byte) -1, 100L };
        double[] doubleArray9 = new double[] { 1.0E10d, (byte) 0, (short) 100, 0.9d, 0, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E10d, 0.0d, 100.0d, 0.9d, 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray2 = new double[] { (short) 1, 0.1d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray2 = new double[] { 2.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 0, 1.0d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray3 = new double[] { (-0.0d), (byte) 10, 5.0d };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray3 = new double[] { 0.0d, '4', 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 52.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray4 = new double[] { (byte) 10, (-1.0d), (-1L), (short) 10 };
        double[] doubleArray10 = new double[] { (short) 100, 0.001d, (byte) 0, 512.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.001d, 0.0d, 512.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray3 = new double[] { 0.5d, (short) -1, (-1) };
        double[] doubleArray9 = new double[] { (short) 100, 'a', 10.0d, '4', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 97.0d, 10.0d, 52.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray5 = new double[] { 100.0d, 0.001d, 0.0f, 0.5d, (-1) };
        double[] doubleArray7 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.001d, 0.0d, 0.5d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray6 = new double[] { 0.001d, 10.0f, 1.0E-6d, 1.0d, (short) 100, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 10.0d, 1.0E-6d, 1.0d, 100.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray4 = new double[] { (short) -1, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray5 = new double[] { 100, 1.0d, (byte) 0, (-10.0d), 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d, 0.0d, (-10.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray4 = new double[] { (-1), 5.0d, 0, 42.0d };
        double[] doubleArray10 = new double[] { (-100.0d), 5.0d, 0.5d, (-0.0d), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 5.0d, 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-100.0d), 5.0d, 0.5d, (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray8 = new double[] { 100.0d, 0.9d, 10.0d, 2.0d, (short) 10, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.9d, 10.0d, 2.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray5 = new double[] { 10.0d, 1.0d, (-1.0f), 0.1d, (-0.0d) };
        double[] doubleArray10 = new double[] { 10.0d, 1.0E-12d, (byte) -1, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, (-1.0d), 0.1d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0E-12d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-15d, 0.9d, 256.0d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-15d, 0.9d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray2 = new double[] { 1.0E8d, (byte) 10 };
        double[] doubleArray6 = new double[] { 0.3333333d, 1.0E-15d, 42.0d };
        double[] doubleArray10 = new double[] { 0.0f, '4', 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 1.0E-15d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray2 = new double[] { 1L, 0.3333333d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0f), (byte) 1, 1.0E-15d, 100.0f };
        double[] doubleArray9 = new double[] { 0.001d, 0L, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0E-15d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray6 = new double[] { 1.0E-4d, 1.0f, 1000000.0d, 10L, (-10.0d), (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, 1.0d, 1000000.0d, 10.0d, (-10.0d), (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1.0E-15d, 1.0d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray5 = new double[] { 0.3333333d, (-1.0f), 1.0E-4d, 100.0d, 0.25d };
        double[] doubleArray12 = new double[] { 10.0f, 10.0d, 5.0d, 1.0E10d, 0.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, (-1.0d), 1.0E-4d, 100.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 5.0d, 1.0E10d, 0.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0d), (-1), 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray5 = new double[] { 10.0f, 1, 0.25d, 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 0.25d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray4 = new double[] { 0.25d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0E8d, 0.3333333d, 10, 100L, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 0.3333333d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray3 = new double[] { (-1), 10, 1.0E-15d };
        double[] doubleArray8 = new double[] { (-100.0d), 10L, (short) 1, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-100.0d), 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray1 = new double[] { 0.25d };
        double[] doubleArray5 = new double[] { 0, (short) -1, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray5 = new double[] { 256.0d, (short) 10, (short) -1, 0.25d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 10.0d, (-1.0d), 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray2 = new double[] { 0L, 1.0E8d };
        double[] doubleArray9 = new double[] { 0.1d, ' ', 100L, 0.01d, 0.9d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.1d, 32.0d, 100.0d, 0.01d, 0.9d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray6 = new double[] { (short) 10, 'a', 10.0d, (short) -1, (short) 0, 10.0d };
        double[] doubleArray10 = new double[] { (-0.0d), (-1), (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 97.0d, 10.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-0.0d), (-1.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray5 = new double[] { 1000000.0d, 1.0E10d, 0L, 1.0f, 0.1d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0E10d, 0.0d, 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray4 = new double[] { (byte) 10, (short) 1, (-1.0d), 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, (-1.0d), 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double[] doubleArray3 = new double[] { (-1.0d), 1.0f, 0.1d };
        double[] doubleArray7 = new double[] { 100.0d, 10.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double[] doubleArray5 = new double[] { 0, 1.0d, (short) 1, 0.0d, 100.0d };
        double[] doubleArray11 = new double[] { 0L, 0.25d, (short) 1, (short) 100, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.25d, 1.0d, 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray3 = new double[] { (byte) 0, (-1L), 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d), 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        double[] doubleArray3 = new double[] { (-1), (byte) 10, 1L };
        double[] doubleArray10 = new double[] { 0, 0.70710678d, 1.0E10d, 'a', 1.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.70710678d, 1.0E10d, 97.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray6 = new double[] { (byte) 10, '4', (byte) 1, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 52.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray5 = new double[] { 100, (byte) 10, 1.0f, 1024.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 1.0d, 1024.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray3 = new double[] { 10, (-1.0f), (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray3 = new double[] { 100.0d, 1.0E-10d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-10d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double[] doubleArray5 = new double[] { 1.0f, (-10.0d), '#', 0L, 0.5d };
        double[] doubleArray8 = new double[] { ' ', 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-10.0d), 35.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        double[] doubleArray6 = new double[] { 100.0f, 0.0d, ' ', 10.0d, (short) 10, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, 32.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double[] doubleArray2 = new double[] { 0.0d, 1.0d };
        double[] doubleArray4 = new double[] { 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray7 = new double[] { 1.0E-6d, (short) -1, (short) -1, 256.0d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-6d, (-1.0d), (-1.0d), 256.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        double[] doubleArray5 = new double[] { 1.0E-15d, 0.5d, 0.0d, 1.0E-12d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 0.5d, 0.0d, 1.0E-12d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray2 = new double[] { 10, (-10.0d) };
        double[] doubleArray9 = new double[] { 1.0d, ' ', 0.0f, 10, 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 32.0d, 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray3 = new double[] { 0.9d, 1000000.0d, '#' };
        double[] doubleArray9 = new double[] { '4', 1024.0d, (-100.0d), 0, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 1000000.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 1024.0d, (-100.0d), 0.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0.25d, 10000.0d, 2.0d, 1.0E8d, 0.25d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d, 10000.0d, 2.0d, 1.0E8d, 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        double[] doubleArray3 = new double[] { 100.0d, 10.0d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double[] doubleArray5 = new double[] { (byte) 10, (-1), 0.25d, (-10.0d), 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 0.25d, (-10.0d), 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100L, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        double[] doubleArray5 = new double[] { 'a', 100.0d, (-0.0d), 1.0E10d, 0.70710678d };
        double[] doubleArray12 = new double[] { 42.0d, 1.0E-15d, ' ', (short) 0, 1.0E-6d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 100.0d, (-0.0d), 1.0E10d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 42.0d, 1.0E-15d, 32.0d, 0.0d, 1.0E-6d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray3 = new double[] { (short) 0, '4', 0.001d };
        double[] doubleArray7 = new double[] { 100L, 1, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 52.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray7 = new double[] { 1024.0d, 1.0E8d, 1.0d, 100.0d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, 1.0E8d, 1.0d, 100.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double[] doubleArray1 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double[] doubleArray2 = new double[] { 512.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        double[] doubleArray7 = new double[] { 1.0d, 0.5d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 0.5d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray1 = new double[] { 1000000.0d };
        double[] doubleArray5 = new double[] { 1024.0d, (-1L), 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, (-1.0d), 0.5d }, 1.0E-15);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0d, 1.0E-8d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-8d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        double[] doubleArray2 = new double[] { 100L, '4' };
        double[] doubleArray6 = new double[] { 100.0d, (-1.0d), 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 0.25d }, 1.0E-15);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double[] doubleArray3 = new double[] { (short) -1, 1.0f, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-4d, 1024.0d, 1024.0d, (short) 100, 1.0f, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-4d, 1024.0d, 1024.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray4 = new double[] { 10000.0d, (short) 100, 1, 1024.0d };
        double[] doubleArray7 = new double[] { (byte) 100, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 100.0d, 1.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        double[] doubleArray4 = new double[] { 0.70710678d, (byte) 1, 100, 10.0f };
        double[] doubleArray8 = new double[] { 1000000.0d, 1.0E-12d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, 1.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1000000.0d, 1.0E-12d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray3 = new double[] { (-1.0d), (-1L), 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double[] doubleArray2 = new double[] { 1.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        double[] doubleArray4 = new double[] { (-10.0d), 10.0f, 1.0E-4d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 10.0d, 1.0E-4d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 100, 100, 0.0d, (short) 10, (-1.0E10d), ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d, 0.0d, 10.0d, (-1.0E10d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double[] doubleArray5 = new double[] { 10.0f, 0.0d, 10, 0.1d, 2.0d };
        double[] doubleArray11 = new double[] { (byte) 1, 1.0E-8d, (byte) 10, 10000.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 10.0d, 0.1d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0E-8d, 10.0d, 10000.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double[] doubleArray4 = new double[] { 100.0d, 1L, 100L, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray2 = new double[] { (short) 1, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        double[] doubleArray4 = new double[] { 10.0d, (byte) -1, (byte) 10, 10000.0d };
        double[] doubleArray8 = new double[] { (-1), (short) 1, 10.0d };
        double[] doubleArray13 = new double[] { 1.0E-4d, 0L, 100.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray13);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 10.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-4d, 0.0d, 100.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray5 = new double[] { (byte) 10, 0.1d, '#', 5.0d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.1d, 35.0d, 5.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double[] doubleArray6 = new double[] { '#', (-1L), 1, 100.0d, ' ', (byte) 1 };
        double[] doubleArray8 = new double[] { (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, (-1.0d), 1.0d, 100.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double[] doubleArray3 = new double[] { 1.0f, (-1.0E10d), (-1.0d) };
        double[] doubleArray5 = new double[] { (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        double[] doubleArray5 = new double[] { 42.0d, '#', 0.25d, 0, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 35.0d, 0.25d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double[] doubleArray2 = new double[] { 512.0d, 0.01d };
        double[] doubleArray9 = new double[] { 1.0d, 1.0E8d, (-1.0d), 0.1d, 0.0f, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0E8d, (-1.0d), 0.1d, 0.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double[] doubleArray2 = new double[] { 0, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double[] doubleArray2 = new double[] { 10, (-1.0d) };
        double[] doubleArray9 = new double[] { (short) 10, 100L, 1.0E10d, 2.0d, 1, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d, 1.0E10d, 2.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        double[] doubleArray5 = new double[] { '#', 42.0d, 10.0d, 10.0d, 10.0f };
        double[] doubleArray7 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 42.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double[] doubleArray3 = new double[] { 1.0f, 1.0E-15d, 512.0d };
        double[] doubleArray9 = new double[] { 1.0E-4d, 1.0E-6d, 512.0d, 0.9d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-15d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, 1.0E-6d, 512.0d, 0.9d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double[] doubleArray6 = new double[] { 2.0d, 1.0E-8d, 1.0E10d, (byte) 0, 0.3333333d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 1.0E-8d, 1.0E10d, 0.0d, 0.3333333d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0d), 1.0E-12d, 1.0E-8d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-12d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double[] doubleArray2 = new double[] { 0.70710678d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double[] doubleArray4 = new double[] { 1.0E-6d, (short) 10, '#', 1 };
        double[] doubleArray8 = new double[] { 10.0d, 1000000.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1000000.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        double[] doubleArray6 = new double[] { 0.0f, 0.9d, (-1.0d), (short) 1, 1.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.9d, (-1.0d), 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double[] doubleArray1 = new double[] { 0.3333333d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double[] doubleArray2 = new double[] { 2.0d, (short) 10 };
        double[] doubleArray7 = new double[] { 0.0d, 0.01d, (short) 10, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.01d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double[] doubleArray6 = new double[] { 10.0d, 1, 1.0E10d, 1024.0d, 1000000.0d, 0L };
        double[] doubleArray9 = new double[] { 1.0E-8d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 1.0E10d, 1024.0d, 1000000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-8d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double[] doubleArray5 = new double[] { 42.0d, 0.01d, '#', (short) 0, 0L };
        double[] doubleArray8 = new double[] { (-0.0d), 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.01d, 35.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-0.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray4 = new double[] { 5.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double[] doubleArray3 = new double[] { 0.1d, (-1.0E10d), 256.0d };
        double[] doubleArray9 = new double[] { (short) 100, ' ', (byte) 0, 0, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, (-1.0E10d), 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 32.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double[] doubleArray4 = new double[] { 10000.0d, 512.0d, 100, 1.0E-15d };
        double[] doubleArray9 = new double[] { 0.001d, 256.0d, '4', 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 512.0d, 100.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 256.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double[] doubleArray3 = new double[] { (-0.0d), 0.3333333d, 0.1d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 0.3333333d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1L), 'a', 0.25d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 97.0d, 0.25d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray6 = new double[] { 1024.0d, 1.0f, 42.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 1.0d, 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { (-1), (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        double[] doubleArray2 = new double[] { 42.0d, 100.0d };
        double[] doubleArray5 = new double[] { 100L, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        double[] doubleArray3 = new double[] { (-1), 0.5d, 1.0E-12d };
        double[] doubleArray7 = new double[] { (-1.0E10d), (-1.0d), (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.5d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        double[] doubleArray4 = new double[] { (-100.0d), (byte) 0, 0, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        double[] doubleArray2 = new double[] { 'a', (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double[] doubleArray4 = new double[] { 10.0f, (byte) 10, 1, 1.0d };
        double[] doubleArray11 = new double[] { 0, (short) 100, '#', 10L, 0.0f, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, 35.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double[] doubleArray4 = new double[] { 100L, (-1.0d), 42.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 42.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, (byte) -1, 1.0f, 1.0E-12d, 100L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, (-1.0d), 1.0d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double[] doubleArray5 = new double[] { 1024.0d, 0, 10, 100.0d, 10.0d };
        double[] doubleArray9 = new double[] { (-1.0f), 0.5d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 0.0d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.5d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        double[] doubleArray3 = new double[] { '4', (-1.0d), 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        double[] doubleArray4 = new double[] { (-1.0d), 0.5d, (short) 10, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.5d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double[] doubleArray4 = new double[] { 0.01d, 1024.0d, (-1.0d), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 1024.0d, (-1.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double[] doubleArray6 = new double[] { 1, 100.0f, (-0.0d), 'a', (-1.0d), 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, (-0.0d), 97.0d, (-1.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        double[] doubleArray2 = new double[] { (-1.0d), 0.0d };
        double[] doubleArray9 = new double[] { ' ', 1, 0.0d, 1.0E-4d, (-1.0f), 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 1.0d, 0.0d, 1.0E-4d, (-1.0d), 0.1d }, 1.0E-15);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double[] doubleArray3 = new double[] { '4', (byte) 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray8 = new double[] { 100.0d, 1, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double[] doubleArray2 = new double[] { 10.0d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        double[] doubleArray5 = new double[] { (-1), (-1.0E10d), (byte) 0, 256.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0E10d), 0.0d, 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double[] doubleArray3 = new double[] { 0.0f, 1000000.0d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1000000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray7 = new double[] { 0, 0.70710678d, 5.0d, 100, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.70710678d, 5.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        double[] doubleArray3 = new double[] { 0.01d, 0.0d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100.0f, 0.3333333d, (-1.0f), 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.3333333d, (-1.0d), 0.01d }, 1.0E-15);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray7 = new double[] { 1000000.0d, (short) 100, (-1), 10.0d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1000000.0d, 100.0d, (-1.0d), 10.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double[] doubleArray2 = new double[] { ' ', 1.0d };
        double[] doubleArray7 = new double[] { 1.0d, 100, (byte) -1, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 100.0d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double[] doubleArray4 = new double[] { 5.0d, '4', 0.5d, (byte) -1 };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 52.0d, 0.5d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray4 = new double[] { (-1.0d), 10.0d, 0.25d, (-1.0d) };
        double[] doubleArray10 = new double[] { 1024.0d, 1L, 1024.0d, 0.70710678d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 1.0d, 1024.0d, 0.70710678d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        double[] doubleArray3 = new double[] { 256.0d, 0.0f, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        double[] doubleArray6 = new double[] { 0.0d, (-0.0d), 0.1d, (byte) 100, (byte) 1, (-1.0d) };
        double[] doubleArray13 = new double[] { 1.0E10d, 1L, 100L, 1L, (byte) 1, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-0.0d), 0.1d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E10d, 1.0d, 100.0d, 1.0d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray8 = new double[] { (byte) 100, 0, (-10.0d), 0.0d, 0.70710678d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, (-10.0d), 0.0d, 0.70710678d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double[] doubleArray5 = new double[] { 1.0E10d, 5.0d, 0.01d, 10.0d, 1.0E-12d };
        double[] doubleArray8 = new double[] { (-1.0f), 1.0d };
        double[] doubleArray15 = new double[] { 0.9d, 0.001d, 1.0d, 10000.0d, 10, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray15);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, 5.0d, 0.01d, 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.9d, 0.001d, 1.0d, 10000.0d, 10.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        double[] doubleArray6 = new double[] { '#', 1.0E-6d, 10L, 0.0d, 10.0f, (byte) 10 };
        double[] doubleArray12 = new double[] { 1.0E-12d, 1.0E10d, 10.0d, (-100.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 1.0E-6d, 10.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-12d, 1.0E10d, 10.0d, (-100.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double[] doubleArray6 = new double[] { (-1), ' ', 0.1d, ' ', 1, 0.1d };
        double[] doubleArray11 = new double[] { (byte) 0, 10.0d, 0.70710678d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 32.0d, 0.1d, 32.0d, 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 10.0d, 0.70710678d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray4 = new double[] { (byte) -1, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 512.0d, (short) 10, 0.25d, 1.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 10.0d, 0.25d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double[] doubleArray4 = new double[] { (byte) -1, 1.0f, (-1.0d), 42.0d };
        double[] doubleArray11 = new double[] { 0.0d, (short) 100, 0.01d, 0.0d, (byte) 1, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, (-1.0d), 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 100.0d, 0.01d, 0.0d, 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double[] doubleArray3 = new double[] { 1.0E-4d, (short) 0, 0.01d };
        double[] doubleArray7 = new double[] { '#', 1.0E-8d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d, 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 1.0E-8d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double[] doubleArray3 = new double[] { 1.0E10d, 100.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray8 = new double[] { 1.0E-8d, 10, 0.5d, (-1.0f), (byte) 0, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-8d, 10.0d, 0.5d, (-1.0d), 0.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double[] doubleArray5 = new double[] { 'a', 100.0d, (-1), '4', (short) -1 };
        double[] doubleArray10 = new double[] { 1, (-1), (short) 10, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 100.0d, (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 10.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        double[] doubleArray4 = new double[] { 10L, 1.0E-15d, 2.0d, (byte) 10 };
        double[] doubleArray7 = new double[] { 1.0E-12d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-15d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        double[] doubleArray3 = new double[] { (-100.0d), (byte) 100, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 100.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double[] doubleArray3 = new double[] { 0L, 0.25d, 0.01d };
        double[] doubleArray6 = new double[] { 1.0E-8d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.25d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double[] doubleArray5 = new double[] { 1.0d, 256.0d, 0.5d, 0.01d, 1024.0d };
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 256.0d, 0.5d, 0.01d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        double[] doubleArray4 = new double[] { 42.0d, (-1.0d), 10, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double[] doubleArray4 = new double[] { (byte) -1, 5.0d, (byte) -1, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 5.0d, (-1.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double[] doubleArray3 = new double[] { 1.0E-12d, 0.70710678d, 100.0f };
        double[] doubleArray5 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double[] doubleArray2 = new double[] { 1.0E-8d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        double[] doubleArray5 = new double[] { (byte) 0, 1, 1.0E-8d, 1.0E-6d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 1.0E-8d, 1.0E-6d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        double[] doubleArray4 = new double[] { (byte) 0, (short) 100, (byte) 0, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double[] doubleArray5 = new double[] { 1.0E-15d, 0L, 10.0d, (byte) 10, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 0.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        double[] doubleArray4 = new double[] { 100.0d, (-10.0d), (-0.0d), (byte) -1 };
        double[] doubleArray9 = new double[] { 256.0d, (short) 1, 1.0E-15d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-10.0d), (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 1.0d, 1.0E-15d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        double[] doubleArray3 = new double[] { (-10.0d), (-100.0d), 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d), (-100.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 0.0d, (-1.0E10d), 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0E10d), 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        double[] doubleArray5 = new double[] { 512.0d, 0L, 1.0d, 1.0E8d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 0.0d, 1.0d, 1.0E8d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        double[] doubleArray6 = new double[] { 0.001d, '#', (-10.0d), (-0.0d), 42.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        double[] doubleArray11 = new double[] { 5.0d, 10L, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 35.0d, (-10.0d), (-0.0d), 42.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 5.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        double[] doubleArray6 = new double[] { (-1), 0.0d, (short) 100, 10.0d, (-1.0d), (-100.0d) };
        double[] doubleArray8 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 100.0d, 10.0d, (-1.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double[] doubleArray4 = new double[] { 0.001d, 1.0E8d, 1000000.0d, 0.70710678d };
        double[] doubleArray7 = new double[] { (-1), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 1.0E8d, 1000000.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray7 = new double[] { 0.0d, 1.0E10d, 100L, 1.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E10d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        double[] doubleArray3 = new double[] { '4', 1.0E-15d, 10.0d };
        double[] doubleArray6 = new double[] { (-1.0f), 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        double[] doubleArray3 = new double[] { 1.0d, 0, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        double[] doubleArray2 = new double[] { (byte) 0, 10.0d };
        double[] doubleArray5 = new double[] { (-0.0d), 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray3 = new double[] { 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        double[] doubleArray8 = new double[] { 1.0E-12d, 10000.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-12d, 10000.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        double[] doubleArray5 = new double[] { 0.0f, (-0.0d), 0.5d, 0.001d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-0.0d), 0.5d, 0.001d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        double[] doubleArray6 = new double[] { 0.70710678d, 0.3333333d, 2.0d, (-0.0d), 'a', 0.25d };
        double[] doubleArray8 = new double[] { 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 0.3333333d, 2.0d, (-0.0d), 97.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        double[] doubleArray4 = new double[] { 1.0f, 1.0E10d, 1.0E-6d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E10d, 1.0E-6d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        double[] doubleArray5 = new double[] { (-1.0d), 1.0f, 42.0d, (-1.0d), 1.0E-10d };
        double[] doubleArray9 = new double[] { 2.0d, (byte) 100, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 42.0d, (-1.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        double[] doubleArray3 = new double[] { 100, (short) -1, 1.0f };
        double[] doubleArray6 = new double[] { 1.0E-8d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { '#', 10.0d, 0.0d, 1.0d, '#', (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, 10.0d, 0.0d, 1.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray5 = new double[] { 0.0d, (-1L), 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        double[] doubleArray5 = new double[] { ' ', 1.0f, (-100.0d), (short) -1, (byte) 10 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 1.0d, (-100.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        double[] doubleArray2 = new double[] { (short) 100, 1L };
        double[] doubleArray6 = new double[] { 10.0d, (-10.0d), 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-10.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        double[] doubleArray2 = new double[] { 100L, (-1L) };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        double[] doubleArray3 = new double[] { (short) -1, 0.001d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.001d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        double[] doubleArray6 = new double[] { 100.0d, (-10.0d), 1.0E10d, 512.0d, 1.0E-15d, 0.9d };
        double[] doubleArray10 = new double[] { 1.0E-12d, (-10.0d), (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-10.0d), 1.0E10d, 512.0d, 1.0E-15d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, (-10.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        double[] doubleArray3 = new double[] { 1.0E-15d, 1.0E10d, (short) 0 };
        double[] doubleArray9 = new double[] { (short) 0, '4', (-1), (byte) -1, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 52.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray5 = new double[] { 100.0d, 0.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        double[] doubleArray6 = new double[] { (short) 1, (short) 100, 0.9d, 0.3333333d, 10.0f, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 0.9d, 0.3333333d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (byte) -1, 1.0E-6d, 0L, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-6d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        double[] doubleArray5 = new double[] { 1.0f, 0.25d, 1000000.0d, 1.0d, 1.0f };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.25d, 1000000.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        double[] doubleArray3 = new double[] { (-10.0d), (-100.0d), 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray8 = new double[] { (short) 100, 100.0d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d), (-100.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        double[] doubleArray2 = new double[] { (-1.0E10d), (-1.0d) };
        double[] doubleArray4 = new double[] { 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        double[] doubleArray2 = new double[] { 1.0E-6d, 10.0d };
        double[] doubleArray9 = new double[] { 1, 0.0f, 0L, 0.01d, 0.70710678d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.0d, 0.0d, 0.01d, 0.70710678d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        double[] doubleArray4 = new double[] { 100L, (short) -1, 1.0E-10d, 0.9d };
        double[] doubleArray7 = new double[] { 0.3333333d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0E-10d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.3333333d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        double[] doubleArray3 = new double[] { 10000.0d, (-1L), (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.1d, 1, 10L, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 1.0d, 10.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        double[] doubleArray3 = new double[] { 1, (byte) 10, 1 };
        double[] doubleArray6 = new double[] { 10.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray6 = new double[] { 1.0E-6d, 0.5d, (-1L), (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 0.5d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        double[] doubleArray6 = new double[] { 256.0d, 0.5d, (byte) 0, (-1.0f), (byte) 100, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 0.5d, 0.0d, (-1.0d), 100.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        double[] doubleArray4 = new double[] { 0L, (-1.0E10d), (byte) 10, (-1) };
        double[] doubleArray10 = new double[] { 100, (short) 10, (short) -1, 1.0E-15d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0E10d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 10.0d, (-1.0d), 1.0E-15d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        double[] doubleArray3 = new double[] { 1.0E8d, 42.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, 42.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        double[] doubleArray4 = new double[] { '#', 0, 256.0d, 1.0E-10d };
        double[] doubleArray10 = new double[] { (byte) 10, (short) 1, 0.3333333d, ' ', 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 0.0d, 256.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 0.3333333d, 32.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        double[] doubleArray5 = new double[] { 1L, 10.0d, 2.0d, 1.0f, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, 2.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        double[] doubleArray4 = new double[] { (-10.0d), '4', 10L, 10.0d };
        double[] doubleArray10 = new double[] { (byte) 10, 256.0d, 100L, 1.0f, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 52.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 256.0d, 100.0d, 1.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        double[] doubleArray3 = new double[] { 1024.0d, 0.25d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1024.0d, 0.25d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        double[] doubleArray3 = new double[] { 0.70710678d, 1.0E-15d, (byte) 0 };
        double[] doubleArray9 = new double[] { 0L, 1000000.0d, 1.0E-15d, (byte) -1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.70710678d, 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1000000.0d, 1.0E-15d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        double[] doubleArray5 = new double[] { 0.0d, (short) -1, 100L, 1.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 100.0d, 1.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        double[] doubleArray3 = new double[] { 1.0E-8d, 10L, '4' };
        double[] doubleArray9 = new double[] { 0.3333333d, 0.25d, 100.0d, (-1.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.3333333d, 0.25d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        double[] doubleArray2 = new double[] { (short) 10, 1.0E-15d };
        double[] doubleArray5 = new double[] { (byte) 100, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100L, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        double[] doubleArray2 = new double[] { 10.0d, (byte) -1 };
        double[] doubleArray4 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        double[] doubleArray5 = new double[] { 5.0d, 1024.0d, 0.0d, (-1.0d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d, 1024.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        double[] doubleArray6 = new double[] { (short) 10, 0.001d, (-1.0d), (-1), 1.0E-6d, (-1.0f) };
        double[] doubleArray9 = new double[] { 0.5d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.001d, (-1.0d), (-1.0d), 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        double[] doubleArray5 = new double[] { 10, 100.0d, 100, 10000.0d, 100.0d };
        double[] doubleArray8 = new double[] { 10, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 100.0d, 100.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        double[] doubleArray3 = new double[] { (-1L), 100.0f, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        double[] doubleArray3 = new double[] { 1.0E-6d, 1024.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-6d, 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        double[] doubleArray6 = new double[] { 0.5d, 2.0d, 1.0f, 100.0d, 10L, 1000000.0d };
        double[] doubleArray9 = new double[] { 10.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 2.0d, 1.0d, 100.0d, 10.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0f, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        double[] doubleArray6 = new double[] { 2.0d, 0.1d, 10, 0.5d, (-1.0d), 100 };
        double[] doubleArray8 = new double[] { 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 0.1d, 10.0d, 0.5d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        double[] doubleArray4 = new double[] { (-1.0f), 'a', (-100.0d), (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 97.0d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        double[] doubleArray4 = new double[] { 10000.0d, 0.5d, 0.5d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 0.5d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        double[] doubleArray3 = new double[] { 100.0d, (short) 1, 0.01d };
        double[] doubleArray6 = new double[] { '#', 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        double[] doubleArray3 = new double[] { 512.0d, 0.5d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 512.0d, 0.5d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        double[] doubleArray6 = new double[] { ' ', 1.0E-12d, 0.01d, 2.0d, (-1.0f), 0.9d };
        double[] doubleArray8 = new double[] { 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 1.0E-12d, 0.01d, 2.0d, (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        double[] doubleArray4 = new double[] { 1.0E-6d, 256.0d, 1024.0d, 1.0E-4d };
        double[] doubleArray11 = new double[] { (-1.0E10d), (-0.0d), 10L, 1.0f, (-1.0d), 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 256.0d, 1024.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0E10d), (-0.0d), 10.0d, 1.0d, (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        double[] doubleArray6 = new double[] { 10.0d, 0.9d, 5.0d, 1.0E-6d, 2.0d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.9d, 5.0d, 1.0E-6d, 2.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 10, (-0.0d), 1.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-0.0d), 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        double[] doubleArray6 = new double[] { (-1), 5.0d, 10, 0.0d, (-1.0f), 0.01d };
        double[] doubleArray8 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 5.0d, 10.0d, 0.0d, (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        double[] doubleArray5 = new double[] { 0.001d, (byte) -1, 0.5d, 1, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, (-1.0d), 0.5d, 1.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        double[] doubleArray5 = new double[] { (-100.0d), 1.0E-10d, 1.0E10d, 0L, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 1.0E-10d, 1.0E10d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        double[] doubleArray1 = new double[] { 1000000.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        double[] doubleArray6 = new double[] { 10.0f, 0.001d, (-100.0d), 0, 0L, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.001d, (-100.0d), 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        double[] doubleArray3 = new double[] { 0.001d, 100.0d, (short) 10 };
        double[] doubleArray10 = new double[] { (-1.0f), 1.0E-12d, 0.001d, (short) 10, 100.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0E-12d, 0.001d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        double[] doubleArray4 = new double[] { (short) 1, 10.0d, 0.9d, (byte) -1 };
        double[] doubleArray8 = new double[] { 1.0E-15d, 0.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d, 0.9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-15d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        double[] doubleArray2 = new double[] { '4', 0.0d };
        double[] doubleArray8 = new double[] { (byte) 1, (-1.0d), 1.0E-4d, 512.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 1.0E-4d, 512.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        double[] doubleArray5 = new double[] { 100.0d, 1, '4', 1.0E10d, (byte) 1 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d, 52.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        double[] doubleArray4 = new double[] { 100.0d, 0.3333333d, 1.0E-6d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.3333333d, 1.0E-6d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        double[] doubleArray4 = new double[] { 0.5d, (short) 1, 1.0E-8d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 1.0d, 1.0E-8d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        double[] doubleArray5 = new double[] { 1.0E-15d, (byte) -1, (-10.0d), 0.0d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, (-1.0d), (-10.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        double[] doubleArray3 = new double[] { (-1), 100, (byte) 10 };
        double[] doubleArray5 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        double[] doubleArray2 = new double[] { 0.70710678d, 10L };
        double[] doubleArray4 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0.0f, 0.0d };
        double[] doubleArray5 = new double[] { 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        double[] doubleArray4 = new double[] { 0.001d, 100.0d, 1.0f, 100 };
        double[] doubleArray7 = new double[] { 100.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        double[] doubleArray6 = new double[] { 10.0d, 1.0E-6d, 1.0E8d, 10, 0L, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-6d, 1.0E8d, 10.0d, 0.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0E10d, 10.0f, (-1), 1.0E8d, (-0.0d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, 10.0d, (-1.0d), 1.0E8d, (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d }, 1.0E-15);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        double[] doubleArray4 = new double[] { (short) -1, 256.0d, 0.9d, 0.9d };
        double[] doubleArray7 = new double[] { 0, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 256.0d, 0.9d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray3 = new double[] { 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        double[] doubleArray2 = new double[] { '#', 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        double[] doubleArray3 = new double[] { 0.1d, 1, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        double[] doubleArray3 = new double[] { 0, 1.0E-4d, 1.0E-4d };
        double[] doubleArray8 = new double[] { 10.0f, 0.0d, 512.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0E-4d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 512.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        double[] doubleArray5 = new double[] { (-1.0E10d), (short) 1, 0.9d, (-1.0d), 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0d, 0.9d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        double[] doubleArray5 = new double[] { 1.0E-12d, 1.0E-4d, (-10.0d), (-0.0d), 100L };
        double[] doubleArray9 = new double[] { 1.0E-12d, 1.0E-10d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 1.0E-4d, (-10.0d), (-0.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 1.0E-10d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        double[] doubleArray2 = new double[] { 0.001d, 10.0d };
        double[] doubleArray4 = new double[] { 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        double[] doubleArray5 = new double[] { 10.0d, 1, 1024.0d, (byte) 10, 10 };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 1024.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        double[] doubleArray2 = new double[] { 1000000.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        double[] doubleArray2 = new double[] { (-1.0E10d), (byte) 1 };
        double[] doubleArray8 = new double[] { 0.0d, (short) 1, 1.0E-15d, 100.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0d, 1.0E-15d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        double[] doubleArray4 = new double[] { (short) -1, (-1.0d), 1.0E8d, 0 };
        double[] doubleArray10 = new double[] { 0.1d, 1.0E-8d, 0.0f, 0.001d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 1.0E8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.1d, 1.0E-8d, 0.0d, 0.001d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        double[] doubleArray5 = new double[] { 0.0d, 100L, 100.0d, 'a', 0.5d };
        double[] doubleArray7 = new double[] { (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 100.0d, 100.0d, 97.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray8 = new double[] { 0.3333333d, 0.5d, (-10.0d), 0.0d, 0.0f, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 0.5d, (-10.0d), 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-100.0d), 'a', 10L, (short) -1, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 97.0d, 10.0d, (-1.0d), 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        double[] doubleArray1 = new double[] { 1.0E10d };
        double[] doubleArray8 = new double[] { 1.0f, 1000000.0d, (-100.0d), 1.0E-6d, 1.0E-6d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1000000.0d, (-100.0d), 1.0E-6d, 1.0E-6d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        double[] doubleArray6 = new double[] { 0.001d, 0.5d, 1.0E8d, 100.0f, (-0.0d), 100.0d };
        double[] doubleArray10 = new double[] { 0.5d, (short) -1, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 0.5d, 1.0E8d, 100.0d, (-0.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.5d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        double[] doubleArray5 = new double[] { 100.0d, 0.5d, (byte) 1, 0.5d, (byte) 100 };
        double[] doubleArray9 = new double[] { 0.25d, '4', 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.5d, 1.0d, 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.25d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        double[] doubleArray2 = new double[] { 10L, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 1, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0d, 1.0f, 2.0d, 10000.0d, (-1.0E10d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0d, 2.0d, 10000.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        double[] doubleArray2 = new double[] { 1.0E10d, 0.3333333d };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        double[] doubleArray6 = new double[] { (short) 100, 1L, (-1), 1024.0d, 1.0E-4d, 1L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, (-1.0d), 1024.0d, 1.0E-4d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        double[] doubleArray6 = new double[] { 1.0E-8d, 10000.0d, '4', 1.0E-15d, 1.0E-8d, 1000000.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 10000.0d, 52.0d, 1.0E-15d, 1.0E-8d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-12d, 10.0f, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-12d, 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        double[] doubleArray1 = new double[] { 1.0E-15d };
        double[] doubleArray5 = new double[] { 1.0E-4d, (short) -1, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        double[] doubleArray6 = new double[] { 100L, 0.25d, (short) -1, ' ', '#', '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.25d, (-1.0d), 32.0d, 35.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        double[] doubleArray4 = new double[] { 1.0E-10d, 0.01d, 1.0d, 10 };
        double[] doubleArray6 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 0.01d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-10.0d), 1024.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 1024.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        double[] doubleArray2 = new double[] { 10, 1024.0d };
        double[] doubleArray8 = new double[] { '4', (byte) 100, (-0.0d), 1.0E-8d, (byte) 10 };
        double[] doubleArray14 = new double[] { 10.0f, '#', 512.0d, 5.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray14);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 52.0d, 100.0d, (-0.0d), 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 35.0d, 512.0d, 5.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        double[] doubleArray6 = new double[] { (byte) 10, 10.0d, 'a', 5.0d, (-10.0d), (byte) 1 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 97.0d, 5.0d, (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        double[] doubleArray6 = new double[] { (short) 100, (-100.0d), 10.0d, '4', 1024.0d, (byte) 100 };
        double[] doubleArray11 = new double[] { 1.0E-12d, (-1L), (-1), 1 };
        double[] doubleArray14 = new double[] { 512.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray14);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-100.0d), 10.0d, 52.0d, 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 512.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        double[] doubleArray3 = new double[] { (byte) 0, 0.9d, (-0.0d) };
        double[] doubleArray10 = new double[] { 0.01d, 1.0E8d, (-1L), 0.5d, 1000000.0d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.9d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.01d, 1.0E8d, (-1.0d), 0.5d, 1000000.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        double[] doubleArray6 = new double[] { 0.9d, 512.0d, 0.70710678d, 0.9d, 0.1d, 0.9d };
        double[] doubleArray9 = new double[] { 1.0E-4d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 512.0d, 0.70710678d, 0.9d, 0.1d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0d), 100.0d, 1.0E-12d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 1.0E-12d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        double[] doubleArray6 = new double[] { 100, 0.3333333d, 10, (short) 0, 0.3333333d, 'a' };
        double[] doubleArray13 = new double[] { 0, 0L, 1000000.0d, 0L, (short) -1, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.3333333d, 10.0d, 0.0d, 0.3333333d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 1000000.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '4', 10.0d, (-10.0d), (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, (-10.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, 0.70710678d };
        double[] doubleArray8 = new double[] { 10.0f, (-1.0d), 0.0f, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-10.0d), 10, 1000000.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 10.0d, 1000000.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        double[] doubleArray3 = new double[] { 0.0d, 0L, '#' };
        double[] doubleArray9 = new double[] { (byte) 0, 2.0d, (-100.0d), (short) -1, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 2.0d, (-100.0d), (-1.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0E8d, (short) 100, 0L, '4', 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 100.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        double[] doubleArray6 = new double[] { (short) 1, (-1.0d), 0.9d, 0.001d, 1024.0d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 0.9d, 0.001d, 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        double[] doubleArray3 = new double[] { 10.0d, (-0.0d), 1.0d };
        double[] doubleArray7 = new double[] { 10, 'a', 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-0.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 97.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (byte) -1, 10.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        double[] doubleArray5 = new double[] { 0.25d, '4', 1.0E8d, 1.0E-15d, 0.0f };
        double[] doubleArray12 = new double[] { (-1L), 0, (short) 1, 5.0d, (byte) 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 52.0d, 1.0E8d, 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 0.0d, 1.0d, 5.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        double[] doubleArray3 = new double[] { 10.0d, (short) 100, 0L };
        double[] doubleArray10 = new double[] { 1.0f, (-1.0d), (-1.0d), 1.0f, ' ', (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), (-1.0d), 1.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        double[] doubleArray6 = new double[] { 0.3333333d, 10.0d, 1, 5.0d, (-10.0d), 0.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 10.0d, 1.0d, 5.0d, (-10.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        double[] doubleArray4 = new double[] { (short) 0, (-1L), (-1L), (byte) 0 };
        double[] doubleArray8 = new double[] { 10.0d, 1.0E-8d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0E-8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        double[] doubleArray6 = new double[] { 10000.0d, 1.0d, 10L, 1.0f, 256.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 1.0d, 10.0d, 1.0d, 256.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { (byte) 100, 0.1d, 0.5d, 0.1d, 0.3333333d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.1d, 0.5d, 0.1d, 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        double[] doubleArray4 = new double[] { 1.0E8d, (short) 0, (-10.0d), 1.0E-4d };
        double[] doubleArray6 = new double[] { 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 0.0d, (-10.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        double[] doubleArray6 = new double[] { 1.0E-10d, 1.0E-10d, (-1.0d), 256.0d, 100.0f, 0.0f };
        double[] doubleArray10 = new double[] { (-1.0d), 42.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, 1.0E-10d, (-1.0d), 256.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 42.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        double[] doubleArray3 = new double[] { 1000000.0d, (-100.0d), 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, (-100.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        double[] doubleArray6 = new double[] { (byte) 1, (-100.0d), (-100.0d), 'a', 1L, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-100.0d), (-100.0d), 97.0d, 1.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        double[] doubleArray6 = new double[] { 1.0f, (-1.0f), 0.9d, 0.70710678d, 1024.0d, 0 };
        double[] doubleArray12 = new double[] { 100.0f, 0.3333333d, 512.0d, 1000000.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 0.9d, 0.70710678d, 1024.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.3333333d, 512.0d, 1000000.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        double[] doubleArray2 = new double[] { 0.70710678d, '4' };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        double[] doubleArray2 = new double[] { 100L, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        double[] doubleArray1 = new double[] { 1.0E-8d };
        double[] doubleArray6 = new double[] { (byte) 100, (short) 0, (short) 10, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, 10.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        double[] doubleArray5 = new double[] { (-1.0d), 0.70710678d, (-1.0E10d), 1.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.70710678d, (-1.0E10d), 1.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        double[] doubleArray5 = new double[] { (-1.0E10d), (short) -1, (byte) 100, 0.25d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), (-1.0d), 100.0d, 0.25d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { 1.0E-10d, 10000.0d, 2.0d, 1L, (byte) -1, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, 10000.0d, 2.0d, 1.0d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        double[] doubleArray6 = new double[] { (-1.0f), (byte) 1, 1.0E-10d, 0.3333333d, 1.0E-8d, 0.9d };
        double[] doubleArray11 = new double[] { 1.0E-6d, 1.0E-6d, 1.0E-6d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 1.0E-10d, 0.3333333d, 1.0E-8d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 1.0E-6d, 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        double[] doubleArray5 = new double[] { '4', 10000.0d, (short) 1, 100.0f, (-1L) };
        double[] doubleArray12 = new double[] { 0.5d, 0.5d, 10.0d, 1000000.0d, 1.0d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10000.0d, 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.5d, 0.5d, 10.0d, 1000000.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        double[] doubleArray6 = new double[] { 256.0d, 'a', 0.3333333d, 42.0d, 512.0d, 1.0E8d };
        double[] doubleArray12 = new double[] { 0.1d, 100, 1.0f, 100.0f, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 97.0d, 0.3333333d, 42.0d, 512.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.1d, 100.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        double[] doubleArray2 = new double[] { (-1.0d), (short) 0 };
        double[] doubleArray7 = new double[] { 0.0d, (byte) 1, (-0.0d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        double[] doubleArray5 = new double[] { 10000.0d, 0L, 10.0d, (short) 0, ' ' };
        double[] doubleArray10 = new double[] { 100, (-1.0E10d), 100.0f, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, 0.0d, 10.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0E10d), 100.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        double[] doubleArray4 = new double[] { 0L, 1.0d, 'a', 1 };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0f, 10.0d, 0.3333333d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 10.0d, 0.3333333d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        double[] doubleArray4 = new double[] { 2.0d, (byte) 100, (byte) 10, (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0E-10d, 1000000.0d, 1.0E-10d, 1.0E-10d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 100.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 1000000.0d, 1.0E-10d, 1.0E-10d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        double[] doubleArray2 = new double[] { (-1), (byte) -1 };
        double[] doubleArray4 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        double[] doubleArray2 = new double[] { 512.0d, 1.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        double[] doubleArray5 = new double[] { (byte) 100, '4', '#', (byte) -1, 10.0f };
        double[] doubleArray9 = new double[] { (short) 0, 1.0E-10d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 35.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        double[] doubleArray6 = new double[] { 1000000.0d, 'a', 100L, 1.0d, (byte) 10, 'a' };
        double[] doubleArray11 = new double[] { 1024.0d, (byte) -1, 0.70710678d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 97.0d, 100.0d, 1.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1024.0d, (-1.0d), 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        double[] doubleArray4 = new double[] { 1.0E-8d, 0.1d, 100, (-1.0f) };
        double[] doubleArray8 = new double[] { 0L, 10.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-8d, 0.1d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        double[] doubleArray6 = new double[] { 0.0f, 1.0d, 100L, 'a', 10.0d, (byte) 10 };
        double[] doubleArray13 = new double[] { 1.0d, 1L, 100.0d, 5.0d, (byte) 0, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 100.0d, 97.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d, 100.0d, 5.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        double[] doubleArray4 = new double[] { (byte) 0, (-1L), 0.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        double[] doubleArray1 = new double[] { 1024.0d };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1024.0d }, 1.0E-15);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        double[] doubleArray5 = new double[] { 1.0d, (-100.0d), 1.0E-15d, 1.0E-8d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-100.0d), 1.0E-15d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double[] doubleArray6 = new double[] { 0.9d, (short) 10, 0.0d, 0.0f, 1.0f, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 10.0d, 0.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray5 = new double[] { ' ', 256.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 256.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        double[] doubleArray3 = new double[] { 42.0d, 1L, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        double[] doubleArray4 = new double[] { (-1.0d), 100.0f, 2.0d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 100.0d, 2.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        double[] doubleArray6 = new double[] { 1.0E8d, 0.001d, 1000000.0d, 100.0f, 0L, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 0.001d, 1000000.0d, 100.0d, 0.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        double[] doubleArray6 = new double[] { 0.9d, 2.0d, 1.0E-15d, 'a', (short) 100, 100L };
        double[] doubleArray11 = new double[] { 1.0d, 0.0d, 0.5d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 2.0d, 1.0E-15d, 97.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.0d, 0.5d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        double[] doubleArray3 = new double[] { 2.0d, (-1L), 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.0d, (-1.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        double[] doubleArray2 = new double[] { 1.0E-15d, (byte) 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        double[] doubleArray7 = new double[] { '#', 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        double[] doubleArray3 = new double[] { 0.0f, (-1), 1.0E-15d };
        double[] doubleArray6 = new double[] { 1.0E-4d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d), 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        double[] doubleArray6 = new double[] { 0.70710678d, 1.0d, (byte) 100, 1.0d, 0.5d, 100 };
        double[] doubleArray10 = new double[] { 256.0d, (-100.0d), (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 1.0d, 100.0d, 1.0d, 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, (-100.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray7 = new double[] { 1.0f, 10000.0d, (byte) 0, 100.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10000.0d, 0.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        double[] doubleArray5 = new double[] { (-0.0d), 2.0d, 42.0d, 0L, 0.0d };
        double[] doubleArray11 = new double[] { 1, 1.0d, 1.0E10d, 1.0f, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 2.0d, 42.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1.0d, 1.0E10d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        double[] doubleArray5 = new double[] { 1024.0d, 'a', 1.0E-4d, 1.0E-10d, 10.0f };
        double[] doubleArray10 = new double[] { 1.0E-8d, (-100.0d), (-1), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 97.0d, 1.0E-4d, 1.0E-10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, (-100.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        double[] doubleArray1 = new double[] { (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        double[] doubleArray5 = new double[] { 0.01d, (-1L), 10.0d, 0.01d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, (-1.0d), 10.0d, 0.01d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        double[] doubleArray5 = new double[] { (-1.0E10d), (-1), (-1.0E10d), 0, 100.0f };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), (-1.0d), (-1.0E10d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        double[] doubleArray2 = new double[] { 1.0E10d, (-100.0d) };
        double[] doubleArray8 = new double[] { 10L, 10000.0d, 0.5d, 1.0E-12d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10000.0d, 0.5d, 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        double[] doubleArray3 = new double[] { 1L, (-1.0E10d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0E10d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        double[] doubleArray5 = new double[] { '#', 10.0f, 0.0d, 10, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 10.0d, 0.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) -1 };
        double[] doubleArray9 = new double[] { (byte) -1, 1.0d, 2.0d, 0.70710678d, 0L, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d, 2.0d, 0.70710678d, 0.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        double[] doubleArray4 = new double[] { 10000.0d, 1.0E10d, (-0.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d, 1.0E10d, (-0.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        double[] doubleArray3 = new double[] { (-1.0d), 1, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        double[] doubleArray4 = new double[] { 1.0d, (-1.0d), (-1.0d), 100.0f };
        double[] doubleArray7 = new double[] { (byte) 100, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        double[] doubleArray2 = new double[] { (-0.0d), (-1L) };
        double[] doubleArray6 = new double[] { 1.0E-8d, 0.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray8 = new double[] { 10000.0d, ' ', (-1), 1.0E10d, 100.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10000.0d, 32.0d, (-1.0d), 1.0E10d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        double[] doubleArray3 = new double[] { (-10.0d), 0L, 1.0E-10d };
        double[] doubleArray9 = new double[] { 10.0f, (-1.0d), (byte) 0, 0.01d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d), 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 0.0d, 0.01d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { '#', 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        double[] doubleArray2 = new double[] { (-1.0f), 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        double[] doubleArray5 = new double[] { 0.3333333d, (byte) 1, 0.0d, '#', 0.0f };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, 1.0d, 0.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        double[] doubleArray2 = new double[] { 1.0E10d, (-1.0d) };
        double[] doubleArray8 = new double[] { ' ', 1.0E-12d, (short) 100, (short) 10, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 1.0E-12d, 100.0d, 10.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        double[] doubleArray2 = new double[] { 0.0d, 0.0f };
        double[] doubleArray5 = new double[] { 1.0E-6d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        double[] doubleArray4 = new double[] { 1024.0d, 10.0f, ' ', 512.0d };
        double[] doubleArray10 = new double[] { (short) 1, 1000000.0d, (short) 1, (short) 0, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, 10.0d, 32.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1000000.0d, 1.0d, 0.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        double[] doubleArray4 = new double[] { 100.0d, 512.0d, (-1L), 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 512.0d, (-1.0d), 0.5d }, 1.0E-15);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        double[] doubleArray5 = new double[] { '4', (short) 1, 100L, 1.0E-10d, 0 };
        double[] doubleArray12 = new double[] { (byte) -1, 10, (-1.0f), 0.70710678d, 10.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 1.0d, 100.0d, 1.0E-10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 10.0d, (-1.0d), 0.70710678d, 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        double[] doubleArray5 = new double[] { (-1.0E10d), 1.0E-8d, ' ', (-1L), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0E-8d, 32.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        double[] doubleArray6 = new double[] { (byte) 0, 100.0f, (short) 0, 1.0E-12d, (short) 100, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 0.0d, 1.0E-12d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1024.0d, 0.01d, 'a', 100.0f, 1.0E-15d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, 0.01d, 97.0d, 100.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        double[] doubleArray3 = new double[] { 1024.0d, 0, 1.0d };
        double[] doubleArray8 = new double[] { (short) 10, 'a', (short) -1, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1024.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 97.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        double[] doubleArray4 = new double[] { (-1.0E10d), 1.0f, '4', (byte) 100 };
        double[] doubleArray10 = new double[] { (byte) 100, 42.0d, 0.25d, 1.0E8d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 1.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 42.0d, 0.25d, 1.0E8d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        double[] doubleArray3 = new double[] { 5.0d, 0.5d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 0.5d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        double[] doubleArray6 = new double[] { (-1L), 0.01d, 1000000.0d, (-1.0f), 256.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.01d, 1000000.0d, (-1.0d), 256.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        double[] doubleArray6 = new double[] { (-1.0f), (-100.0d), (-1.0d), 10.0f, 0.25d, 1.0E-6d };
        double[] doubleArray8 = new double[] { 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-100.0d), (-1.0d), 10.0d, 0.25d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        double[] doubleArray2 = new double[] { '4', (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        double[] doubleArray2 = new double[] { (-1.0d), 10.0f };
        double[] doubleArray7 = new double[] { 0.0d, (byte) 100, 100.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        double[] doubleArray11 = new double[] { 512.0d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 512.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 0, '#', 10, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 35.0d, 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray8 = new double[] { 1.0E-12d, 100.0d, 0.01d, 1.0E-10d, 0, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-12d, 100.0d, 0.01d, 1.0E-10d, 0.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        double[] doubleArray5 = new double[] { 1.0E-4d, 1.0E-15d, '4', 0.5d, 0.9d };
        double[] doubleArray11 = new double[] { 0.1d, 0.0d, '4', 1.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 1.0E-15d, 52.0d, 0.5d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.1d, 0.0d, 52.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        double[] doubleArray6 = new double[] { 0.001d, 1.0E-6d, (short) 0, (short) 100, '4', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0E-6d, 0.0d, 100.0d, 52.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray4 = new double[] { 1.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        double[] doubleArray6 = new double[] { (-1.0f), 1.0E-12d, 0L, (-10.0d), 10.0d, 0.9d };
        double[] doubleArray9 = new double[] { (byte) 10, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0E-12d, 0.0d, (-10.0d), 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        double[] doubleArray2 = new double[] { 10.0d, (-1L) };
        double[] doubleArray9 = new double[] { 100L, 42.0d, 100.0f, 1000000.0d, 0.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 42.0d, 100.0d, 1000000.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        double[] doubleArray2 = new double[] { 0.1d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 0, 10, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 0, 0, 1, 1.0E-4d, 10L, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, 1.0d, 1.0E-4d, 10.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100L, (-1.0f), ' ', 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        double[] doubleArray5 = new double[] { (byte) 100, (-1.0E10d), 10L, 0.5d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0E10d), 10.0d, 0.5d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        double[] doubleArray6 = new double[] { (byte) 0, 1.0E8d, 1.0E-12d, (byte) -1, 0.25d, 100.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E8d, 1.0E-12d, (-1.0d), 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        double[] doubleArray4 = new double[] { 10.0f, 256.0d, 1L, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 256.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        double[] doubleArray2 = new double[] { (-1.0d), 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        double[] doubleArray5 = new double[] { (short) 0, 10, 1024.0d, 1.0E-15d, 0.70710678d };
        double[] doubleArray8 = new double[] { 256.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1024.0d, 1.0E-15d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 256.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        double[] doubleArray6 = new double[] { 1.0E-6d, (byte) 100, 512.0d, (byte) 1, 0.0f, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 100.0d, 512.0d, 1.0d, 0.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        double[] doubleArray1 = new double[] { (-0.0d) };
        double[] doubleArray3 = new double[] { 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        double[] doubleArray5 = new double[] { (byte) -1, 1.0E-12d, 0L, (-100.0d), (byte) 1 };
        double[] doubleArray11 = new double[] { 10L, 10, 10L, 0L, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-12d, 0.0d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 10.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        double[] doubleArray6 = new double[] { 256.0d, 1L, (byte) 10, 1.0E-4d, 10.0f, 0.01d };
        double[] doubleArray10 = new double[] { (-1.0d), (short) 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 1.0d, 10.0d, 1.0E-4d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        double[] doubleArray3 = new double[] { 10000.0d, 10.0f, 0.70710678d };
        double[] doubleArray9 = new double[] { (-100.0d), (-100.0d), 1.0f, 0, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 10.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), (-100.0d), 1.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray7 = new double[] { 42.0d, 0L, 1.0E8d, 100, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 42.0d, 0.0d, 1.0E8d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        double[] doubleArray5 = new double[] { 1.0d, (-1.0E10d), (short) 100, 1.0E-12d, 0.1d };
        double[] doubleArray12 = new double[] { (byte) 10, (byte) -1, 0.0d, 0, 100.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0E10d), 100.0d, 1.0E-12d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 0.0d, 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        double[] doubleArray4 = new double[] { 0L, (short) 10, (-10.0d), (byte) 10 };
        double[] doubleArray7 = new double[] { 10.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 10.0d, (-10.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        double[] doubleArray3 = new double[] { 42.0d, 10.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        double[] doubleArray2 = new double[] { 1.0E-6d, 1L };
        double[] doubleArray7 = new double[] { (short) 1, 1, 'a', 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0d, 97.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        double[] doubleArray6 = new double[] { 0.70710678d, (short) -1, (-100.0d), 1024.0d, 1.0E-10d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, (-1.0d), (-100.0d), 1024.0d, 1.0E-10d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        double[] doubleArray3 = new double[] { 0L, 1L, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        double[] doubleArray6 = new double[] { 1000000.0d, 42.0d, 0.3333333d, '4', 5.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 42.0d, 0.3333333d, 52.0d, 5.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray5 = new double[] { 42.0d, 0.9d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.9d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        double[] doubleArray2 = new double[] { (-1.0E10d), ' ' };
        double[] doubleArray8 = new double[] { 5.0d, (short) 0, 100L, 1.0E-6d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 5.0d, 0.0d, 100.0d, 1.0E-6d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        double[] doubleArray4 = new double[] { 0.1d, 0.3333333d, (short) -1, 0.9d };
        double[] doubleArray10 = new double[] { 1.0E-10d, (byte) 0, (short) 100, 1.0E-6d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 0.3333333d, (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 0.0d, 100.0d, 1.0E-6d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        double[] doubleArray5 = new double[] { (short) 10, 10L, (byte) -1, 10.0d, 1024.0d };
        double[] doubleArray11 = new double[] { 100.0f, 0.0f, 0.3333333d, 1.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, (-1.0d), 10.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 0.0d, 0.3333333d, 1.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        double[] doubleArray2 = new double[] { 10.0d, 1.0E8d };
        double[] doubleArray6 = new double[] { 1000000.0d, 256.0d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 256.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        double[] doubleArray5 = new double[] { 1L, 0.01d, (byte) 1, 1.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.01d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        double[] doubleArray2 = new double[] { (short) 10, 0.5d };
        double[] doubleArray7 = new double[] { 10000.0d, 10.0f, (short) 0, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10000.0d, 10.0d, 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (-1L), 1024.0d, (short) 100, '4', (-1.0E10d), 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1024.0d, 100.0d, 52.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        double[] doubleArray2 = new double[] { 100.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        double[] doubleArray8 = new double[] { (short) 100, 1.0E-8d, 1.0E-6d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1.0E-8d, 1.0E-6d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        double[] doubleArray5 = new double[] { 100.0f, 1.0E-4d, 0.1d, 1000000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-4d, 0.1d, 1000000.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        double[] doubleArray4 = new double[] { 1.0d, (-0.0d), 1.0f, (-10.0d) };
        double[] doubleArray7 = new double[] { 0.0f, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        double[] doubleArray10 = new double[] { (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-0.0d), 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        double[] doubleArray1 = new double[] { 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        double[] doubleArray6 = new double[] { (short) 0, 1.0E-6d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-6d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 0, 1.0E-15d, 0L, 100.0f, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-15d, 0.0d, 100.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        double[] doubleArray6 = new double[] { 2.0d, 0.0d, '4', 2.0d, (-1), (short) 0 };
        double[] doubleArray9 = new double[] { (-0.0d), 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 0.0d, 52.0d, 2.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-0.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0L, 0, (-1.0E10d), 10, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, (-1.0E10d), 10.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        double[] doubleArray4 = new double[] { (-100.0d), (-1.0d), 1000000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), (-1.0d), 1000000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        double[] doubleArray3 = new double[] { 0.70710678d, 1.0E-6d, 10.0d };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { (-1.0d), (-0.0d), 1.0d, (-1.0f), 0.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.70710678d, 1.0E-6d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-0.0d), 1.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        double[] doubleArray6 = new double[] { 100L, (-1), 0L, (short) 1, 1, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        double[] doubleArray11 = new double[] { 1.0E-6d, 256.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 0.0d, 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 256.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        double[] doubleArray5 = new double[] { 42.0d, 0.3333333d, 100, (byte) -1, 256.0d };
        double[] doubleArray10 = new double[] { 1.0d, (byte) 0, 1.0E8d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.3333333d, 100.0d, (-1.0d), 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.0d, 1.0E8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        double[] doubleArray6 = new double[] { 0.25d, (short) -1, 10L, 1.0d, (byte) -1, 0.0d };
        double[] doubleArray8 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, (-1.0d), 10.0d, 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        double[] doubleArray2 = new double[] { 10000.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        double[] doubleArray6 = new double[] { 0.0d, 1.0E-6d, 100.0f, 100L, 1, (-0.0d) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-6d, 100.0d, 100.0d, 1.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0d, 1, (-1.0E10d), 0.9d };
        double[] doubleArray8 = new double[] { 1.0E-10d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 100.0d, 1.0d, (-1.0E10d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        double[] doubleArray5 = new double[] { 1, 42.0d, (byte) 1, (byte) 0, (-1) };
        double[] doubleArray8 = new double[] { 2.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 42.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        double[] doubleArray5 = new double[] { 1024.0d, 0.1d, 1.0E-10d, (short) 0, 100L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 0.1d, 1.0E-10d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        double[] doubleArray6 = new double[] { 1000000.0d, 10L, 100.0f, 1.0E-4d, (short) 100, (byte) 10 };
        double[] doubleArray13 = new double[] { 1.0d, 1.0E-10d, 10.0d, 100.0d, (short) 1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 10.0d, 100.0d, 1.0E-4d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0E-10d, 10.0d, 100.0d, 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        double[] doubleArray6 = new double[] { (short) 10, 1, 0.5d, 1.0E10d, (short) -1, 0 };
        double[] doubleArray9 = new double[] { (short) 0, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.5d, 1.0E10d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        double[] doubleArray5 = new double[] { 0.0f, 1.0E10d, 0.0d, 100, '4' };
        double[] doubleArray9 = new double[] { 0.0d, 1.0E-15d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E10d, 0.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-15d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        double[] doubleArray3 = new double[] { (short) 100, 0, (short) 10 };
        double[] doubleArray6 = new double[] { (byte) 100, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        double[] doubleArray3 = new double[] { 'a', (byte) 100, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        double[] doubleArray6 = new double[] { 42.0d, (-0.0d), 1.0d, 'a', 42.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, (-0.0d), 1.0d, 97.0d, 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        double[] doubleArray5 = new double[] { (short) 100, 0.0d, 0.9d, 0.0d, 1.0E-10d };
        double[] doubleArray7 = new double[] { (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 0.9d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        double[] doubleArray2 = new double[] { (-100.0d), (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        double[] doubleArray6 = new double[] { 0.01d, (-1), 1.0d, 0.001d, (-1.0d), 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, (-1.0d), 1.0d, 0.001d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        double[] doubleArray6 = new double[] { 0.1d, (short) -1, 1.0d, 0.0d, 1L, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, (-1.0d), 1.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        double[] doubleArray5 = new double[] { 1.0E-4d, '#', 10.0d, 1.0f, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 35.0d, 10.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        double[] doubleArray2 = new double[] { 0.5d, 1000000.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.5d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-10.0d), (-10.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), (-10.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        double[] doubleArray6 = new double[] { 0.5d, 1.0E-10d, 1.0E-6d, (byte) -1, 5.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 1.0E-10d, 1.0E-6d, (-1.0d), 5.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        double[] doubleArray2 = new double[] { 0, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        double[] doubleArray6 = new double[] { 1.0d, 2.0d, 2.0d, (-1.0d), (byte) 100, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        double[] doubleArray11 = new double[] { 0.0f, 'a', (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 2.0d, 2.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        double[] doubleArray2 = new double[] { 100.0d, (-1) };
        double[] doubleArray6 = new double[] { 1, (short) 10, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        double[] doubleArray4 = new double[] { 1.0d, 'a', 1L, (byte) 0 };
        double[] doubleArray8 = new double[] { 100.0f, (-1.0d), (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 97.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        double[] doubleArray4 = new double[] { '4', 0, 0.0f, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.0d, 0.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        double[] doubleArray2 = new double[] { (byte) -1, 5.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        double[] doubleArray6 = new double[] { 0.9d, 0.5d, 100, (short) 100, 1.0E10d, 256.0d };
        double[] doubleArray10 = new double[] { 1.0f, (short) 10, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 0.5d, 100.0d, 100.0d, 1.0E10d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        double[] doubleArray3 = new double[] { 1024.0d, 10, 0.01d };
        double[] doubleArray10 = new double[] { 0.0f, 1.0E-15d, 10, 10.0f, (short) 10, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1024.0d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0E-15d, 10.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        double[] doubleArray5 = new double[] { (-1.0d), 'a', (-1.0d), (short) 100, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 97.0d, (-1.0d), 100.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        double[] doubleArray3 = new double[] { 0.5d, 100.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        double[] doubleArray2 = new double[] { (short) 10, (short) 1 };
        double[] doubleArray8 = new double[] { 0.0f, 100.0d, 1.0E-6d, 0.1d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 100.0d, 1.0E-6d, 0.1d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        double[] doubleArray3 = new double[] { (-1.0E10d), (byte) 10, 1.0f };
        double[] doubleArray10 = new double[] { 0.0d, 0, (-1.0E10d), 0.3333333d, (-10.0d), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, (-1.0E10d), 0.3333333d, (-10.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        double[] doubleArray5 = new double[] { (-1.0d), 10L, 1L, (-10.0d), (short) 100 };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 1.0d, (-10.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        double[] doubleArray3 = new double[] { 0.0d, 512.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 512.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        double[] doubleArray2 = new double[] { 1.0E-4d, (byte) 1 };
        double[] doubleArray4 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        double[] doubleArray3 = new double[] { 1.0E-10d, (-100.0d), 10.0f };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray4 = new double[] { (-1.0f), 0.0f };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        double[] doubleArray5 = new double[] { (byte) 0, 0.0d, 0L, '4', (-1.0d) };
        double[] doubleArray8 = new double[] { 0.3333333d, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1.0E-4d, 1.0E-10d, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-4d, 1.0E-10d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        double[] doubleArray4 = new double[] { (byte) 10, (-10.0d), (-10.0d), 0.01d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-10.0d), (-10.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        double[] doubleArray5 = new double[] { 100.0f, 100, 0.1d, (short) 100, 1.0E-15d };
        double[] doubleArray12 = new double[] { (byte) -1, 1, (short) 10, (byte) 0, (byte) 1, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 0.1d, 100.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 10.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        double[] doubleArray5 = new double[] { (-0.0d), '#', 0.5d, (-1.0E10d), 1024.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 35.0d, 0.5d, (-1.0E10d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        double[] doubleArray1 = new double[] { 256.0d };
        double[] doubleArray7 = new double[] { 1.0E-6d, 1000000.0d, 42.0d, 0.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-6d, 1000000.0d, 42.0d, 0.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        double[] doubleArray4 = new double[] { 1.0f, 1.0E-10d, 1L, (-100.0d) };
        double[] doubleArray10 = new double[] { (byte) 1, (-1L), 1.0d, 1.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-10d, 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 1.0d, 1.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        double[] doubleArray2 = new double[] { (byte) 0, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        double[] doubleArray4 = new double[] { 1, (-1L), 0.0f, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0d), 0.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10.0d, 1, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        double[] doubleArray5 = new double[] { 1.0E-12d, 100.0d, 1.0E-10d, 0.9d, 10L };
        double[] doubleArray9 = new double[] { '4', (short) 100, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 100.0d, 1.0E-10d, 0.9d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 100.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        double[] doubleArray5 = new double[] { 512.0d, 0.0d, 0.01d, 1, (-1) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 0.0d, 0.01d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        double[] doubleArray6 = new double[] { (-10.0d), (byte) -1, (-1.0d), (-10.0d), 1.0E-4d, (byte) 0 };
        double[] doubleArray13 = new double[] { (-0.0d), 0.001d, (-10.0d), '4', 100.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d), (-1.0d), (-1.0d), (-10.0d), 1.0E-4d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-0.0d), 0.001d, (-10.0d), 52.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        double[] doubleArray3 = new double[] { (-1.0f), 1.0E10d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray9 = new double[] { 0.001d, (-1.0E10d), 100, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0E10d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, (-1.0E10d), 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        double[] doubleArray1 = new double[] { 1.0E-6d };
        double[] doubleArray5 = new double[] { ' ', 1.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        double[] doubleArray2 = new double[] { 'a', '#' };
        double[] doubleArray6 = new double[] { 0, (-10.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-10.0d), 100.0d }, 1.0E-15);
    }
}

