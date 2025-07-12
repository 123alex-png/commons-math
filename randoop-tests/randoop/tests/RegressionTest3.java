package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        double[] doubleArray4 = new double[] { 1L, (byte) 1, 10.0d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        double[] doubleArray4 = new double[] { 512.0d, 0L, (-0.0d), 0 };
        double[] doubleArray6 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 0.0d, (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        double[] doubleArray6 = new double[] { 1000000.0d, (-100.0d), (byte) 1, (-0.0d), 1.0E10d, (-100.0d) };
        double[] doubleArray12 = new double[] { 1.0E-8d, 256.0d, 0.70710678d, (-0.0d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, (-100.0d), 1.0d, (-0.0d), 1.0E10d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, 256.0d, 0.70710678d, (-0.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 1.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        double[] doubleArray6 = new double[] { 1.0d, 1.0E-15d, (-1.0d), 10L, (-0.0d), (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0E-15d, (-1.0d), 10.0d, (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        double[] doubleArray2 = new double[] { 1.0E-10d, (short) 1 };
        double[] doubleArray9 = new double[] { (-1.0f), 0.9d, 1000000.0d, 0.3333333d, 1L, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.9d, 1000000.0d, 0.3333333d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        double[] doubleArray6 = new double[] { (short) 1, (byte) 100, (-1.0f), (byte) 100, 0.3333333d, 10000.0d };
        double[] doubleArray10 = new double[] { 0.9d, 10.0f, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, (-1.0d), 100.0d, 0.3333333d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        double[] doubleArray2 = new double[] { 256.0d, 1.0f };
        double[] doubleArray6 = new double[] { 1.0E-6d, 1L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        double[] doubleArray5 = new double[] { 0.01d, '4', (byte) 0, 1.0f, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 52.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        double[] doubleArray2 = new double[] { 1, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        double[] doubleArray5 = new double[] { (byte) -1, 1.0d, 1.0E10d, (-1L), (-10.0d) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 1.0E10d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        double[] doubleArray6 = new double[] { 0.25d, 0.9d, 256.0d, 1.0d, (-10.0d), 'a' };
        double[] doubleArray8 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 0.9d, 256.0d, 1.0d, (-10.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        double[] doubleArray6 = new double[] { (-0.0d), 1.0E-8d, 1.0E10d, 10000.0d, 42.0d, (-1L) };
        double[] doubleArray13 = new double[] { 1.0E-10d, 1.0E-8d, (-100.0d), 0.1d, 1.0E-4d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 1.0E-8d, 1.0E10d, 10000.0d, 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-10d, 1.0E-8d, (-100.0d), 0.1d, 1.0E-4d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        double[] doubleArray4 = new double[] { '4', 0.70710678d, 10000.0d, 100 };
        double[] doubleArray6 = new double[] { 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.70710678d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        double[] doubleArray3 = new double[] { 256.0d, 1024.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 1024.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        double[] doubleArray4 = new double[] { (-1), 1.0f, 10, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        double[] doubleArray4 = new double[] { 0.25d, 0.9d, 1.0E-12d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 0.9d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 100, (short) 0, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        double[] doubleArray4 = new double[] { '4', (-10.0d), 10.0d, (short) -1 };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0E8d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, (-10.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0E8d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        double[] doubleArray6 = new double[] { 100L, 0.3333333d, 1.0E-8d, 10000.0d, 0.3333333d, 5.0d };
        double[] doubleArray8 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.3333333d, 1.0E-8d, 10000.0d, 0.3333333d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        double[] doubleArray3 = new double[] { (byte) 10, 0.0f, 1.0E-6d };
        double[] doubleArray7 = new double[] { (-1.0E10d), 1000000.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), 1000000.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        double[] doubleArray4 = new double[] { 1.0d, (-1.0E10d), (-1.0f), 1000000.0d };
        double[] doubleArray11 = new double[] { (-100.0d), 100.0d, (-10.0d), 10, 1.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-1.0E10d), (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-100.0d), 100.0d, (-10.0d), 10.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        double[] doubleArray3 = new double[] { (byte) 100, (short) 100, 100.0d };
        double[] doubleArray9 = new double[] { (-1), (-1.0E10d), 1.0E8d, 0.5d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-1.0E10d), 1.0E8d, 0.5d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        double[] doubleArray2 = new double[] { (-0.0d), 5.0d };
        double[] doubleArray8 = new double[] { 10, 1.0f, 0.3333333d, 0.25d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 0.3333333d, 0.25d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.70710678d, (-1L), (short) -1, 1.0f, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, (-1.0d), (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        double[] doubleArray3 = new double[] { 42.0d, 100.0f, 1.0E-15d };
        double[] doubleArray9 = new double[] { 0.0d, 0L, 10L, 0.25d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 100.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 10.0d, 0.25d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        double[] doubleArray2 = new double[] { 0, 1.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        double[] doubleArray2 = new double[] { 42.0d, '#' };
        double[] doubleArray4 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        double[] doubleArray3 = new double[] { 256.0d, 100L, (-1.0d) };
        double[] doubleArray6 = new double[] { 1024.0d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        double[] doubleArray5 = new double[] { 100L, '#', 10.0f, 100.0f, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 35.0d, 10.0d, 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        double[] doubleArray2 = new double[] { 1.0E10d, 'a' };
        double[] doubleArray4 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d }, 1.0E-15);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        double[] doubleArray3 = new double[] { 10.0d, (-1L), (-1.0d) };
        double[] doubleArray9 = new double[] { 1.0d, 1.0E-4d, 10L, (-100.0d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0E-4d, 10.0d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        double[] doubleArray6 = new double[] { 10, 1, 5.0d, (-1.0d), 1.0E-15d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 5.0d, (-1.0d), 1.0E-15d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        double[] doubleArray6 = new double[] { 0.0f, 512.0d, 0.1d, 10.0d, 0.0d, 100L };
        double[] doubleArray11 = new double[] { 0.0f, 256.0d, 1000000.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 512.0d, 0.1d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 256.0d, 1000000.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        double[] doubleArray6 = new double[] { 0.70710678d, '#', 1024.0d, (short) 100, 2.0d, (byte) 0 };
        double[] doubleArray12 = new double[] { 1000000.0d, 10.0f, 0.001d, (-100.0d), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 35.0d, 1024.0d, 100.0d, 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1000000.0d, 10.0d, 0.001d, (-100.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        double[] doubleArray3 = new double[] { 0.0d, 10, '4' };
        double[] doubleArray10 = new double[] { (-1.0d), 5.0d, (short) 100, 0.25d, 1.0E-10d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 5.0d, 100.0d, 0.25d, 1.0E-10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        double[] doubleArray4 = new double[] { (byte) 10, 1000000.0d, 0.3333333d, 0.3333333d };
        double[] doubleArray6 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1000000.0d, 0.3333333d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        double[] doubleArray6 = new double[] { 0.70710678d, 1024.0d, 100, 10.0d, 42.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 1024.0d, 100.0d, 10.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        double[] doubleArray4 = new double[] { 512.0d, 1L, 0.70710678d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0d, 0.70710678d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        double[] doubleArray6 = new double[] { '4', 10.0f, (byte) 1, 100L, 10.0d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 10.0d, 1.0d, 100.0d, 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        double[] doubleArray4 = new double[] { 0.1d, 10L, 512.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 10.0d, 512.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        double[] doubleArray3 = new double[] { 0.70710678d, (short) 1, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.70710678d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        double[] doubleArray5 = new double[] { '4', 10.0d, 1024.0d, (-1.0E10d), (-1.0f) };
        double[] doubleArray7 = new double[] { 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 1024.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        double[] doubleArray2 = new double[] { 10.0d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        double[] doubleArray5 = new double[] { 1.0f, 1.0E8d, 0.5d, 10, 100.0d };
        double[] doubleArray12 = new double[] { 100, 1.0E-12d, 100L, 0.0d, 2.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E8d, 0.5d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0E-12d, 100.0d, 0.0d, 2.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        double[] doubleArray4 = new double[] { 256.0d, (short) 100, 1.0E10d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 100.0d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        double[] doubleArray5 = new double[] { 10L, 0.5d, 0.001d, (short) 0, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.5d, 0.001d, 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        double[] doubleArray2 = new double[] { 100, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        double[] doubleArray5 = new double[] { 100.0f, 100, 1.0f, 0L, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 1.0d, 0.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        double[] doubleArray3 = new double[] { (-100.0d), 10L, (-1.0d) };
        double[] doubleArray7 = new double[] { 1.0E-8d, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray7);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-8d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        double[] doubleArray6 = new double[] { 10L, 10, 10L, 1.0E8d, 100.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 10.0d, 1.0E8d, 100.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        double[] doubleArray1 = new double[] { 1.0E-8d };
        double[] doubleArray7 = new double[] { (-1L), (byte) 0, 0.0f, 1.0E-10d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 0.0d, 1.0E-10d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0f, (-1.0E10d), 1L, 256.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        double[] doubleArray13 = new double[] { (byte) 10, 0.5d, 1, 10.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0E10d), 1.0d, 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.5d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray4 = new double[] { (byte) 10, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        double[] doubleArray2 = new double[] { 1.0d, 100.0d };
        double[] doubleArray9 = new double[] { 0.5d, 1.0E-15d, 0.5d, 0.001d, '#', (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, 1.0E-15d, 0.5d, 0.001d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        double[] doubleArray2 = new double[] { 5.0d, 1.0E-6d };
        double[] doubleArray7 = new double[] { 0.25d, (byte) 0, (-100.0d), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d, 0.0d, (-100.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.25d, '#', 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 35.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        double[] doubleArray4 = new double[] { (short) 10, (short) 1, 0, (byte) 10 };
        double[] doubleArray8 = new double[] { 0L, 10.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0d), (-0.0d), 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        double[] doubleArray10 = new double[] { (-1.0E10d), 256.0d, 0.1d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-0.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0E10d), 256.0d, 0.1d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        double[] doubleArray5 = new double[] { 1.0E-15d, 0.3333333d, (-1.0f), 0.0d, 0.5d };
        double[] doubleArray11 = new double[] { 0.0d, 1.0E-12d, ' ', (short) 10, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 0.3333333d, (-1.0d), 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1.0E-12d, 32.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        double[] doubleArray2 = new double[] { (-1.0d), 0L };
        double[] doubleArray7 = new double[] { 100, (byte) 0, 0.0f, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        double[] doubleArray4 = new double[] { 1024.0d, 0.0f, (-1.0E10d), 'a' };
        double[] doubleArray6 = new double[] { (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, 0.0d, (-1.0E10d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        double[] doubleArray4 = new double[] { 'a', 1.0E-6d, (-1.0E10d), 0.001d };
        double[] doubleArray9 = new double[] { 0L, 0.01d, (-1.0d), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 1.0E-6d, (-1.0E10d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.01d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        double[] doubleArray6 = new double[] { (-10.0d), (-0.0d), (-1.0d), 512.0d, 0.70710678d, 10.0d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d), (-0.0d), (-1.0d), 512.0d, 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray6 = new double[] { 5.0d, 0.01d, (-10.0d), 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 0.01d, (-10.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        double[] doubleArray6 = new double[] { 0.01d, (short) 100, 0.3333333d, '4', 1.0E-10d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 100.0d, 0.3333333d, 52.0d, 1.0E-10d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        double[] doubleArray4 = new double[] { 5.0d, 2.0d, 0.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 2.0d, 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        double[] doubleArray5 = new double[] { 42.0d, 100.0d, 0.001d, 0.001d, (-1.0d) };
        double[] doubleArray9 = new double[] { 1.0E-12d, 10.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 100.0d, 0.001d, 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        double[] doubleArray2 = new double[] { 0.0f, 100.0d };
        double[] doubleArray6 = new double[] { 0.001d, (-1L), 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, (-1.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray3 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        double[] doubleArray6 = new double[] { 10.0d, 1000000.0d, 1.0E10d, (-100.0d), (-1L), 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1000000.0d, 1.0E10d, (-100.0d), (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        double[] doubleArray6 = new double[] { 10L, (byte) 10, 1.0E-6d, 1, (-1.0E10d), 100 };
        double[] doubleArray10 = new double[] { 1.0d, (-1), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 1.0E-6d, 1.0d, (-1.0E10d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        double[] doubleArray5 = new double[] { 100.0d, (byte) -1, 1, 0.01d, (-100.0d) };
        double[] doubleArray12 = new double[] { 1.0f, 0L, 42.0d, 512.0d, 1.0E-4d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 1.0d, 0.01d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, 42.0d, 512.0d, 1.0E-4d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        double[] doubleArray3 = new double[] { 100.0f, 'a', 0.25d };
        double[] doubleArray7 = new double[] { (-1), (-1.0f), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 97.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        double[] doubleArray3 = new double[] { (-1), 0.5d, 0.3333333d };
        double[] doubleArray6 = new double[] { 100.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.5d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        double[] doubleArray1 = new double[] { 42.0d };
        double[] doubleArray7 = new double[] { 100, 10L, 1.0E-15d, 100.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 1.0E-15d, 100.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        double[] doubleArray4 = new double[] { '4', (-0.0d), (-1), (short) 100 };
        double[] doubleArray8 = new double[] { 0.0d, 1.0f, (byte) -1 };
        double[] doubleArray14 = new double[] { (-1.0d), (-1.0E10d), 0.3333333d, 0L, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray14);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, (-0.0d), (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-1.0E10d), 0.3333333d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        double[] doubleArray2 = new double[] { (-1.0f), 0.0f };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.70710678d, 10000.0d, (byte) 1, 256.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 10000.0d, 1.0d, 256.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        double[] doubleArray3 = new double[] { 10.0d, 256.0d, '4' };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 10, 0.0f, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        double[] doubleArray4 = new double[] { 1.0E8d, 1.0E10d, 1024.0d, 1.0E-8d };
        double[] doubleArray7 = new double[] { 10.0d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 1.0E10d, 1024.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        double[] doubleArray3 = new double[] { 1.0E-8d, 10, 100L };
        double[] doubleArray10 = new double[] { (short) 100, (short) 10, (short) -1, 1024.0d, (short) 1, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 10.0d, (-1.0d), 1024.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        double[] doubleArray3 = new double[] { (-0.0d), 0, (byte) 1 };
        double[] doubleArray8 = new double[] { 0L, (byte) -1, 'a', 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        double[] doubleArray3 = new double[] { 10.0d, 0L, (-1.0f) };
        double[] doubleArray8 = new double[] { 0.001d, 0.0d, (-0.0d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d, 0.0d, (-0.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 256.0d, 1.0E-12d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 1.0E-12d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        double[] doubleArray2 = new double[] { 0.0f, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        double[] doubleArray5 = new double[] { (-1.0E10d), 1.0E-8d, ' ', (-1L), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0E-8d, 32.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        double[] doubleArray6 = new double[] { 0.01d, (short) 1, 42.0d, 100L, 1.0E-6d, (-100.0d) };
        double[] doubleArray12 = new double[] { 0.5d, (-1L), (short) 1, 0.01d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 1.0d, 42.0d, 100.0d, 1.0E-6d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.5d, (-1.0d), 1.0d, 0.01d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        double[] doubleArray5 = new double[] { (short) -1, 5.0d, 1.0E10d, 0.5d, (-1.0f) };
        double[] doubleArray11 = new double[] { (-0.0d), 1, 0.0f, 512.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 5.0d, 1.0E10d, 0.5d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 1.0d, 0.0d, 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        double[] doubleArray3 = new double[] { 1.0E-15d, (short) 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray7 = new double[] { 0.3333333d, (-0.0d), 1000000.0d, 0.25d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.3333333d, (-0.0d), 1000000.0d, 0.25d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        double[] doubleArray4 = new double[] { (-1.0E10d), 512.0d, 1L, 100.0f };
        double[] doubleArray8 = new double[] { 100L, 0.70710678d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 512.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.70710678d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        double[] doubleArray1 = new double[] { 1.0E-8d };
        double[] doubleArray8 = new double[] { 100.0d, (byte) 0, 0.0f, 100.0d, 1.0f, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, 0.0d, 100.0d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.001d, 1L, (short) 0, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        double[] doubleArray3 = new double[] { 0.01d, (byte) 0, (byte) 0 };
        double[] doubleArray5 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        double[] doubleArray5 = new double[] { 100.0d, '#', 1.0E-10d, 10L, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 35.0d, 1.0E-10d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        double[] doubleArray5 = new double[] { (-1.0f), 0.01d, 0.1d, (-1), 1.0E-10d };
        double[] doubleArray8 = new double[] { (-10.0d), 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.01d, 0.1d, (-1.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        double[] doubleArray5 = new double[] { 10, 10.0d, (short) 10, (-100.0d), 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 10.0d, (-100.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0d, (short) 1, 1.0E-4d, (-1.0f), (-10.0d), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0d, 1.0E-4d, (-1.0d), (-10.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        double[] doubleArray6 = new double[] { 0.5d, (byte) 100, (byte) -1, 1.0E-12d, (-1.0f), 1000000.0d };
        double[] doubleArray8 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 100.0d, (-1.0d), 1.0E-12d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        double[] doubleArray5 = new double[] { 1.0E-8d, (short) -1, 1.0E-10d, (-1), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, (-1.0d), 1.0E-10d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        double[] doubleArray4 = new double[] { 0.0f, (short) -1, (-10.0d), 10.0d };
        double[] doubleArray10 = new double[] { 1.0E-15d, 1.0E-6d, 2.0d, 1.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), (-10.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-15d, 1.0E-6d, 2.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        double[] doubleArray1 = new double[] { 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        double[] doubleArray6 = new double[] { 1.0E-10d, 0.9d, 100.0d, 0.01d, 1.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, 0.9d, 100.0d, 0.01d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        double[] doubleArray4 = new double[] { 10.0d, 10, 1, 1.0E-4d };
        double[] doubleArray7 = new double[] { 1.0f, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 1.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        double[] doubleArray2 = new double[] { 0.0d, 100L };
        double[] doubleArray7 = new double[] { 2.0d, 1.0E10d, (short) 1, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 2.0d, 1.0E10d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        double[] doubleArray5 = new double[] { 100L, (-0.0d), 1.0E-10d, 1.0E8d, 100L };
        double[] doubleArray10 = new double[] { 0.9d, (byte) -1, (-1.0d), ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-0.0d), 1.0E-10d, 1.0E8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9d, (-1.0d), (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray8 = new double[] { 0.3333333d, ' ', (-1L), 0, 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 32.0d, (-1.0d), 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        double[] doubleArray2 = new double[] { '4', 100.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray3 = new double[] { 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        double[] doubleArray3 = new double[] { '4', (short) 100, 42.0d };
        double[] doubleArray7 = new double[] { (short) 100, 10.0f, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d }, 1.0E-15);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        double[] doubleArray3 = new double[] { 1.0E-10d, (short) 10, 0.9d };
        double[] doubleArray5 = new double[] { 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        double[] doubleArray2 = new double[] { 1, 0.001d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        double[] doubleArray2 = new double[] { (byte) 0, 0.5d };
        double[] doubleArray9 = new double[] { 1.0d, 10.0d, 0, (byte) 0, (-1.0d), 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 10.0d, 0.0d, 0.0d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        double[] doubleArray3 = new double[] { (byte) 100, 0.0f, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        double[] doubleArray1 = new double[] { (-10.0d) };
        double[] doubleArray7 = new double[] { 100, 0.9d, 0.0f, 100.0d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.9d, 0.0d, 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        double[] doubleArray3 = new double[] { (byte) 10, 0.0d, (byte) 1 };
        double[] doubleArray10 = new double[] { 10.0d, '#', 1.0E10d, (short) 100, 1.0E-15d, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 35.0d, 1.0E10d, 100.0d, 1.0E-15d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray4 = new double[] { 10.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        double[] doubleArray3 = new double[] { 1.0E-10d, 0L, 0.1d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray8 = new double[] { 0.1d, 10.0f, (-1.0d), 0.001d, '4', 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.1d, 10.0d, (-1.0d), 0.001d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        double[] doubleArray3 = new double[] { (-1), 0.01d, (-1.0d) };
        double[] doubleArray7 = new double[] { '4', 'a', 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.01d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 52.0d, 97.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        double[] doubleArray4 = new double[] { 2.0d, (-1.0d), 2.0d, 100.0d };
        double[] doubleArray8 = new double[] { 0.001d, (-1.0f), 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, (-1.0d), 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d, (-1.0d), 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        double[] doubleArray5 = new double[] { 10.0f, (-1.0f), 100L, 1.0E-10d, (-0.0d) };
        double[] doubleArray11 = new double[] { 2.0d, 10L, 512.0d, (-1.0d), '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 100.0d, 1.0E-10d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 10.0d, 512.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        double[] doubleArray2 = new double[] { 100.0f, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        double[] doubleArray4 = new double[] { 1.0E-12d, 1.0E-10d, 1.0f, (-1.0d) };
        double[] doubleArray9 = new double[] { 42.0d, (-1), 42.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 1.0E-10d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 42.0d, (-1.0d), 42.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        double[] doubleArray4 = new double[] { (byte) 100, '#', 0.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 35.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        double[] doubleArray2 = new double[] { 10.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        double[] doubleArray5 = new double[] { 100.0d, (-1.0d), 1.0E8d, 1.0E-4d, 1.0d };
        double[] doubleArray9 = new double[] { 0.001d, (short) -1, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 1.0E8d, 1.0E-4d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        double[] doubleArray2 = new double[] { 0.0d, 1.0E-15d };
        double[] doubleArray6 = new double[] { '#', (byte) -1, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, (-1.0d), 2.0d }, 1.0E-15);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        double[] doubleArray2 = new double[] { (-1L), 0.3333333d };
        double[] doubleArray7 = new double[] { 0.70710678d, (short) -1, 0.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        double[] doubleArray6 = new double[] { (byte) 10, 0.5d, 0, 42.0d, 10.0d, 10.0f };
        double[] doubleArray8 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.5d, 0.0d, 42.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        double[] doubleArray6 = new double[] { (-1.0E10d), 1L, (short) -1, 1.0E-6d, (short) -1, 1000000.0d };
        double[] doubleArray12 = new double[] { 0, 42.0d, (-1.0d), (short) 100, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 1.0d, (-1.0d), 1.0E-6d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 42.0d, (-1.0d), 100.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        double[] doubleArray6 = new double[] { 5.0d, (byte) 100, 42.0d, 1.0E-6d, 10L, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 100.0d, 42.0d, 1.0E-6d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        double[] doubleArray4 = new double[] { 'a', (byte) 100, 10000.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray3 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        double[] doubleArray5 = new double[] { 1000000.0d, 1, 100.0f, 0, 100L };
        double[] doubleArray11 = new double[] { 1.0E-12d, 0.9d, 1.0E8d, 1.0d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, 0.9d, 1.0E8d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        double[] doubleArray6 = new double[] { 1.0E-15d, 1.0E-6d, 2.0d, 1.0E-8d, (byte) 100, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 1.0E-6d, 2.0d, 1.0E-8d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        double[] doubleArray5 = new double[] { (-100.0d), 1.0E-10d, (-1.0d), 0.001d, 512.0d };
        double[] doubleArray8 = new double[] { 0.70710678d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 1.0E-10d, (-1.0d), 0.001d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.70710678d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        double[] doubleArray3 = new double[] { 1.0E-10d, 100, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        double[] doubleArray5 = new double[] { 256.0d, 'a', '4', 0.01d, (-10.0d) };
        double[] doubleArray9 = new double[] { 10L, 0.001d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 97.0d, 52.0d, 0.01d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.001d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        double[] doubleArray6 = new double[] { (byte) 100, 10L, 512.0d, 5.0d, 1.0E-8d, (-10.0d) };
        double[] doubleArray11 = new double[] { 1L, (byte) 10, 1.0E-12d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 512.0d, 5.0d, 1.0E-8d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d, 1.0E-12d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        double[] doubleArray6 = new double[] { 1.0E-15d, 1.0d, 0.0d, 0, 1.0E-12d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 1.0d, 0.0d, 0.0d, 1.0E-12d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        double[] doubleArray3 = new double[] { 10, 256.0d, 0.001d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        double[] doubleArray4 = new double[] { (-1L), 0, 1, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        double[] doubleArray6 = new double[] { 0L, 100.0f, (byte) 100, 0.0d, (-1.0d), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 100.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        double[] doubleArray2 = new double[] { (byte) -1, 10.0f };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        double[] doubleArray3 = new double[] { 1.0E-15d, (byte) 0, 10000.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        double[] doubleArray4 = new double[] { 1.0E-12d, (-1L), (-1), 1 };
        double[] doubleArray7 = new double[] { 512.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        double[] doubleArray5 = new double[] { 1.0E-10d, '4', ' ', 512.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 52.0d, 32.0d, 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        double[] doubleArray5 = new double[] { '4', 42.0d, 256.0d, (-0.0d), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 42.0d, 256.0d, (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        double[] doubleArray5 = new double[] { 0.1d, (short) 100, 10, 0L, (-1L) };
        double[] doubleArray9 = new double[] { ' ', 1L, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 100.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, 1.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        double[] doubleArray3 = new double[] { (-10.0d), 10L, (byte) -1 };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        double[] doubleArray5 = new double[] { 10.0f, (-1.0d), (-1), 1000000.0d, 'a' };
        double[] doubleArray7 = new double[] { 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), (-1.0d), 1000000.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        double[] doubleArray4 = new double[] { 0.25d, 1, (short) 1, 1.0E-12d };
        double[] doubleArray10 = new double[] { (-10.0d), 0.0d, (-1L), 10, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 1.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-10.0d), 0.0d, (-1.0d), 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray7 = new double[] { (short) 1, 1.0E-12d, (-10.0d), 0.0f, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0E-12d, (-10.0d), 0.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        double[] doubleArray2 = new double[] { (-1.0d), 1000000.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        double[] doubleArray4 = new double[] { (-1.0d), (-1.0d), 10L, (byte) 10 };
        double[] doubleArray9 = new double[] { 1.0f, 1.0E10d, 0.01d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0E10d, 0.01d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        double[] doubleArray2 = new double[] { 10.0d, 1.0E-12d };
        double[] doubleArray6 = new double[] { (byte) 1, 0.1d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (byte) 10, 100.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        double[] doubleArray3 = new double[] { 'a', 1.0E-12d, 1.0E-8d };
        double[] doubleArray9 = new double[] { 0.0f, 1.0f, 1.0E8d, (-0.0d), 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 1.0E-12d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0d, 1.0E8d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        double[] doubleArray3 = new double[] { 'a', 0.01d, 10 };
        double[] doubleArray5 = new double[] { 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.01d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        double[] doubleArray2 = new double[] { 0.9d, (byte) 1 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 0.9d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0L, 0.3333333d, (byte) -1, (byte) 100, 0L, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.3333333d, (-1.0d), 100.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        double[] doubleArray5 = new double[] { 0.01d, 100L, 42.0d, 0.9d, 100.0d };
        double[] doubleArray7 = new double[] { 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 100.0d, 42.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray7 = new double[] { (short) 1, 0.0d, 0.5d, 10000.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 0.0d, 0.5d, 10000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        double[] doubleArray1 = new double[] { 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        double[] doubleArray3 = new double[] { 1.0E-10d, 1.0d, 0.0d };
        double[] doubleArray10 = new double[] { 0.70710678d, 1.0E-8d, 0.1d, (-1L), 1.0E-10d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.70710678d, 1.0E-8d, 0.1d, (-1.0d), 1.0E-10d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        double[] doubleArray5 = new double[] { (short) 10, 10.0d, 0, 10, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 0.0d, 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0d, 100.0d, 1.0f, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        double[] doubleArray3 = new double[] { 0L, 1, 0.25d };
        double[] doubleArray6 = new double[] { 10.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        double[] doubleArray6 = new double[] { 0.5d, (byte) 0, (byte) 0, (short) 1, (-1.0d), 1.0d };
        double[] doubleArray11 = new double[] { 1L, 10L, 0.9d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 0.0d, 0.0d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d, 0.9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        double[] doubleArray2 = new double[] { 0.1d, 1.0f };
        double[] doubleArray6 = new double[] { 0.0d, 0.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        double[] doubleArray3 = new double[] { 42.0d, 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 1.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        double[] doubleArray2 = new double[] { 'a', 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-10d, 1.0E-15d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-10d, 1.0E-15d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray5 = new double[] { 10.0f, 0.01d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.01d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        double[] doubleArray2 = new double[] { 1.0E-10d, 0.01d };
        double[] doubleArray5 = new double[] { 42.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-10d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        double[] doubleArray4 = new double[] { (-1L), (-1.0d), '#', 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 35.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        double[] doubleArray6 = new double[] { (byte) 10, 1.0d, (byte) 0, 100.0d, 1.0E-12d, 100.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.0d, 100.0d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        double[] doubleArray1 = new double[] { (-0.0d) };
        double[] doubleArray5 = new double[] { (-1.0E10d), (short) 100, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 100.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        double[] doubleArray1 = new double[] { (-1.0E10d) };
        double[] doubleArray5 = new double[] { (byte) 0, 1, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        double[] doubleArray2 = new double[] { (byte) 100, 10.0d };
        double[] doubleArray4 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        double[] doubleArray4 = new double[] { (-10.0d), (byte) 10, 1.0f, (short) 0 };
        double[] doubleArray11 = new double[] { 100, 10L, 1.0f, 1L, (-1), 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 10.0d, 1.0d, 1.0d, (-1.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        double[] doubleArray6 = new double[] { 1.0E10d, (-1.0d), 5.0d, 0L, 0.3333333d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, (-1.0d), 5.0d, 0.0d, 0.3333333d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        double[] doubleArray4 = new double[] { 0.1d, (-1L), 100.0d, 0 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        double[] doubleArray4 = new double[] { 0, 1.0d, 1.0E-8d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 1.0E-8d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        double[] doubleArray3 = new double[] { 0.0f, 0.25d, 42.0d };
        double[] doubleArray5 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.25d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { '4', 5.0d };
        double[] doubleArray8 = new double[] { 1.0E-15d, 0, 0.70710678d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-15d, 0.0d, 0.70710678d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        double[] doubleArray5 = new double[] { (-1.0E10d), (-1L), 1.0E10d, (byte) 0, (-10.0d) };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), (-1.0d), 1.0E10d, 0.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        double[] doubleArray3 = new double[] { (byte) 1, 1L, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        double[] doubleArray5 = new double[] { 1.0E-12d, 100.0f, (-1.0d), 1.0d, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 100.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        double[] doubleArray5 = new double[] { 100.0f, (byte) 100, 0.0f, 1, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 0.0d, 1.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        double[] doubleArray5 = new double[] { (byte) 1, (-1.0d), 1.0d, 0.9d, 1.0E8d };
        double[] doubleArray12 = new double[] { '#', 100.0d, 100L, 1.0E-6d, 42.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 1.0d, 0.9d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 100.0d, 100.0d, 1.0E-6d, 42.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        double[] doubleArray5 = new double[] { 0.25d, 0.0d, 100, (-100.0d), (short) 10 };
        double[] doubleArray7 = new double[] { 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 0.0d, 100.0d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray8 = new double[] { 100.0d, 0.9d, 10.0d, 2.0d, (short) 10, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.9d, 10.0d, 2.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        double[] doubleArray3 = new double[] { 0.9d, 0.5d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 0.5d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        double[] doubleArray4 = new double[] { 42.0d, (-100.0d), (short) 10, 1.0E-10d };
        double[] doubleArray8 = new double[] { 1.0E8d, (-1), 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, (-100.0d), 10.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        double[] doubleArray2 = new double[] { (-1.0E10d), (-1.0E10d) };
        double[] doubleArray5 = new double[] { 42.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        double[] doubleArray2 = new double[] { 1, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        double[] doubleArray4 = new double[] { (byte) -1, 0.9d, (byte) 10, 10.0f };
        double[] doubleArray11 = new double[] { 2.0d, 0, (byte) 0, 0.9d, (-0.0d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.9d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 0.0d, 0.0d, 0.9d, (-0.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray8 = new double[] { 10.0f, 1.0E-8d, 1.0E-10d, (byte) 10, 1.0E-15d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0E-8d, 1.0E-10d, 10.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        double[] doubleArray5 = new double[] { 10000.0d, (-1.0f), 10.0d, 256.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, (-1.0d), 10.0d, 256.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        double[] doubleArray4 = new double[] { (-10.0d), 42.0d, (short) -1, 0.9d };
        double[] doubleArray11 = new double[] { 1024.0d, 0, 0.25d, 100.0d, 0.9d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 42.0d, (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1024.0d, 0.0d, 0.25d, 100.0d, 0.9d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        double[] doubleArray6 = new double[] { (short) 10, (-1.0E10d), 512.0d, (short) 100, 0.70710678d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0E10d), 512.0d, 100.0d, 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        double[] doubleArray6 = new double[] { '4', (byte) -1, 0.0f, 5.0d, 10.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, (-1.0d), 0.0d, 5.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 42.0d, (short) 100, 10000.0d, 2.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 100.0d, 10000.0d, 2.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        double[] doubleArray2 = new double[] { 0.001d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        double[] doubleArray5 = new double[] { 1.0E-12d, 100.0f, 1.0E8d, 0.1d, (-10.0d) };
        double[] doubleArray8 = new double[] { (short) -1, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 100.0d, 1.0E8d, 0.1d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        double[] doubleArray3 = new double[] { 1.0f, '#', (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 35.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        double[] doubleArray6 = new double[] { (short) 10, 0.001d, (-1.0d), (-1), 1.0E-6d, (-1.0f) };
        double[] doubleArray9 = new double[] { 0.5d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.001d, (-1.0d), (-1.0d), 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        double[] doubleArray3 = new double[] { (byte) 100, (byte) 100, (-1.0d) };
        double[] doubleArray7 = new double[] { ' ', '#', 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        double[] doubleArray4 = new double[] { (-1.0f), 512.0d, 1.0E-12d, 0 };
        double[] doubleArray7 = new double[] { (short) -1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 512.0d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.001d }, 1.0E-15);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        double[] doubleArray5 = new double[] { 100.0f, (-10.0d), 0.25d, 0.01d, '4' };
        double[] doubleArray11 = new double[] { (short) 100, 0.70710678d, 'a', 1.0E-4d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-10.0d), 0.25d, 0.01d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 0.70710678d, 97.0d, 1.0E-4d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        double[] doubleArray4 = new double[] { 10.0d, 2.0d, 10000.0d, 0L };
        double[] doubleArray10 = new double[] { 0.0f, ' ', 10L, (-10.0d), 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 2.0d, 10000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 32.0d, 10.0d, (-10.0d), 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double[] doubleArray4 = new double[] { (short) -1, 0.0d, (-100.0d), (byte) 1 };
        double[] doubleArray9 = new double[] { 1.0E8d, (byte) 1, 0, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E8d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        double[] doubleArray4 = new double[] { 1.0d, 1L, 100.0f, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 100.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray4 = new double[] { 1.0E10d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1.0d, 0, 100.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        double[] doubleArray2 = new double[] { 10000.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10000.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        double[] doubleArray4 = new double[] { 1.0E10d, 0.1d, (-0.0d), 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 0.1d, (-0.0d), 42.0d }, 1.0E-15);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        double[] doubleArray3 = new double[] { (byte) 10, 0.25d, (short) 100 };
        double[] doubleArray8 = new double[] { 2.0d, (byte) -1, 1.0E8d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, (-1.0d), 1.0E8d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        double[] doubleArray6 = new double[] { 0.5d, (byte) 100, (byte) -1, 1.0E-12d, (-1.0f), 1000000.0d };
        double[] doubleArray8 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 100.0d, (-1.0d), 1.0E-12d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray4 = new double[] { (short) 0, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        double[] doubleArray5 = new double[] { '4', 10L, 1.0d, 0, 0L };
        double[] doubleArray12 = new double[] { 1.0E10d, 10.0d, 1.0E-12d, '4', 1.0E-8d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E10d, 10.0d, 1.0E-12d, 52.0d, 1.0E-8d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray5 = new double[] { 2.0d, (byte) -1, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        double[] doubleArray3 = new double[] { (-1.0E10d), 10.0f, 100.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 0, 0.70710678d, 0.3333333d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.70710678d, 0.3333333d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        double[] doubleArray5 = new double[] { 10, 1.0E-6d, 0.01d, 512.0d, 1.0E-10d };
        double[] doubleArray12 = new double[] { (short) 1, (byte) 100, 1.0E8d, (-1.0E10d), (-0.0d), (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-6d, 0.01d, 512.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, 1.0E8d, (-1.0E10d), (-0.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        double[] doubleArray1 = new double[] { 1.0E-6d };
        double[] doubleArray8 = new double[] { 0.0d, (-10.0d), 1.0E8d, (byte) 0, 1.0E-10d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-10.0d), 1.0E8d, 0.0d, 1.0E-10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        double[] doubleArray5 = new double[] { 42.0d, 5.0d, 0.0d, (-0.0d), 1.0E-4d };
        double[] doubleArray8 = new double[] { 'a', (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 5.0d, 0.0d, (-0.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (-1.0E10d), (short) 0, ' ', (-1.0d), (short) 100, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), 0.0d, 32.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        double[] doubleArray6 = new double[] { 1.0E-15d, 42.0d, 0.0d, 1.0d, 10, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 42.0d, 0.0d, 1.0d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        double[] doubleArray4 = new double[] { (-1.0E10d), (byte) 1, 512.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 1.0d, 512.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        double[] doubleArray5 = new double[] { 0.0d, 1.0E8d, 0.0d, (byte) 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E8d, 0.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        double[] doubleArray4 = new double[] { 0.01d, 0.0d, (byte) 100, 0.70710678d };
        double[] doubleArray6 = new double[] { 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 0.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d }, 1.0E-15);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        double[] doubleArray5 = new double[] { 1, 42.0d, 0.70710678d, (byte) 0, 0.0f };
        double[] doubleArray9 = new double[] { '4', 10000.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 42.0d, 0.70710678d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 10000.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        double[] doubleArray2 = new double[] { ' ', (byte) -1 };
        double[] doubleArray6 = new double[] { 10L, 10L, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray8 = new double[] { (-1.0f), 0.5d, 0.9d, 0.001d, (short) 10, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.5d, 0.9d, 0.001d, 10.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        double[] doubleArray2 = new double[] { (byte) 1, 10.0d };
        double[] doubleArray9 = new double[] { (short) 0, 0.1d, 0.0d, 100.0d, 1000000.0d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.1d, 0.0d, 100.0d, 1000000.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        double[] doubleArray6 = new double[] { 0, 256.0d, 1.0d, (byte) 1, 1.0f, 100.0f };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 256.0d, 1.0d, 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        double[] doubleArray3 = new double[] { 1.0d, (byte) 100, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0E10d), 10L, 100L, 0.70710678d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 10.0d, 100.0d, 0.70710678d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        double[] doubleArray6 = new double[] { (-1L), 0.25d, 512.0d, 1.0E-4d, (-0.0d), 0.0f };
        double[] doubleArray10 = new double[] { (short) 10, 0.001d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.25d, 512.0d, 1.0E-4d, (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.001d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        double[] doubleArray1 = new double[] { 1.0E-6d };
        double[] doubleArray3 = new double[] { 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray7 = new double[] { 1.0E10d, 0.01d, 0.70710678d, 42.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, 0.01d, 0.70710678d, 42.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray3 = new double[] { (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray6 = new double[] { (-0.0d), 100.0d, 1.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 100.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        double[] doubleArray6 = new double[] { 1.0d, 0.25d, 1.0E-6d, 'a', 1.0E-10d, 1.0E-15d };
        double[] doubleArray10 = new double[] { (byte) 1, 10000.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.25d, 1.0E-6d, 97.0d, 1.0E-10d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10000.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        double[] doubleArray6 = new double[] { (-1.0d), (-10.0d), (byte) 10, 1.0E-4d, (-1L), '#' };
        double[] doubleArray9 = new double[] { (byte) -1, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-10.0d), 10.0d, 1.0E-4d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        double[] doubleArray2 = new double[] { 1.0E-12d, 1.0d };
        double[] doubleArray8 = new double[] { 1.0E10d, 1.0E10d, 1.0E-6d, (short) 10, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-12d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, 1.0E10d, 1.0E-6d, 10.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 100, 10000.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 100.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0, 5.0d, (short) 100, (-1.0E10d) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 5.0d, 100.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        double[] doubleArray4 = new double[] { 10L, 1.0E-15d, 2.0d, (byte) 10 };
        double[] doubleArray7 = new double[] { 1.0E-12d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-15d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        double[] doubleArray2 = new double[] { ' ', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        double[] doubleArray6 = new double[] { 100.0d, 1.0d, (byte) -1, 0.70710678d, 0.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, (-1.0d), 0.70710678d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        double[] doubleArray3 = new double[] { 2.0d, ' ', (short) 1 };
        double[] doubleArray5 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        double[] doubleArray6 = new double[] { (-0.0d), 256.0d, 0.9d, 1.0E-6d, 1.0E-12d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 256.0d, 0.9d, 1.0E-6d, 1.0E-12d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray4 = new double[] { 256.0d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, 1.0E-10d, 0.0f, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-10d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        double[] doubleArray3 = new double[] { (short) 100, 1.0d, ' ' };
        double[] doubleArray5 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        double[] doubleArray5 = new double[] { 10.0d, 0, 0.001d, 1, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 0.001d, 1.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        double[] doubleArray2 = new double[] { 1024.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        double[] doubleArray3 = new double[] { (short) 100, 1.0E10d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        double[] doubleArray4 = new double[] { 100.0f, 0.5d, 2.0d, (byte) -1 };
        double[] doubleArray9 = new double[] { 1.0E-4d, 0.01d, (byte) 1, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.5d, 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, 0.01d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        double[] doubleArray3 = new double[] { '4', 100.0d, (short) 1 };
        double[] doubleArray8 = new double[] { 100.0f, (short) 1, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        double[] doubleArray6 = new double[] { 2.0d, 100L, 0L, '4', (-1.0f), 0.0d };
        double[] doubleArray12 = new double[] { 10.0d, 10, (short) 10, 0.70710678d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 100.0d, 0.0d, 52.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 10.0d, 0.70710678d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10.0d, 512.0d, 1.0E8d, (byte) -1, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 512.0d, 1.0E8d, (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        double[] doubleArray2 = new double[] { 0.70710678d, (-0.0d) };
        double[] doubleArray4 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        double[] doubleArray5 = new double[] { '4', (byte) 10, 0.0f, 100L, 100.0d };
        double[] doubleArray11 = new double[] { 0.0f, 0.001d, 1.0E-12d, (-0.0d), 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.001d, 1.0E-12d, (-0.0d), 0.001d }, 1.0E-15);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        double[] doubleArray5 = new double[] { (byte) -1, (short) 100, (short) 100, 5.0d, 512.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 100.0d, 5.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        double[] doubleArray6 = new double[] { 'a', 256.0d, 0.0d, (-10.0d), 1, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 256.0d, 0.0d, (-10.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        double[] doubleArray2 = new double[] { (-1.0d), 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        double[] doubleArray5 = new double[] { (-10.0d), (byte) -1, 100, 512.0d, 0.3333333d };
        double[] doubleArray8 = new double[] { 1.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), (-1.0d), 100.0d, 512.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        double[] doubleArray2 = new double[] { 0.9d, 2.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        double[] doubleArray5 = new double[] { 1.0d, 0.70710678d, 100.0d, 1024.0d, 'a' };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.70710678d, 100.0d, 1024.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        double[] doubleArray4 = new double[] { 1.0f, 0.25d, (-1.0d), (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.25d, (-1.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        double[] doubleArray2 = new double[] { (-1), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        double[] doubleArray5 = new double[] { 100.0d, '#', (-0.0d), (short) 10, (short) 10 };
        double[] doubleArray8 = new double[] { (byte) 10, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 35.0d, (-0.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        double[] doubleArray6 = new double[] { 1.0E8d, 100, (short) 1, 1L, (byte) 1, 0 };
        double[] doubleArray10 = new double[] { 1.0E-8d, 10.0d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 100.0d, 1.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0L, 1.0E8d, (byte) 10, 10.0f, (-1L), 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E8d, 10.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        double[] doubleArray2 = new double[] { 10.0d, 1.0E-12d };
        double[] doubleArray6 = new double[] { (byte) 1, 0.1d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        double[] doubleArray3 = new double[] { '4', 0.0d, 100 };
        double[] doubleArray7 = new double[] { 100.0d, (-0.0d), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-0.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        double[] doubleArray2 = new double[] { 0.001d, 10000.0d };
        double[] doubleArray9 = new double[] { 0.70710678d, 1, (-1.0d), (byte) 10, 1, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 1.0d, (-1.0d), 10.0d, 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        double[] doubleArray3 = new double[] { 100.0d, 0.25d, 1.0E-8d };
        double[] doubleArray6 = new double[] { 1000000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.25d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.5d, 1.0f, 1.0f, (short) -1, 10.0f, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, 1.0d, 1.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        double[] doubleArray4 = new double[] { 0.70710678d, (short) 100, 100, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        double[] doubleArray10 = new double[] { 0.9d, (-1.0d), 512.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9d, (-1.0d), 512.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        double[] doubleArray2 = new double[] { '4', 0.1d };
        double[] doubleArray4 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        double[] doubleArray3 = new double[] { (short) 100, 1.0E10d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0f, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-8d, (-1.0d), 0.001d, 0.9d };
        double[] doubleArray12 = new double[] { 'a', 100, 100L, 0.25d, (short) -1, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-8d, (-1.0d), 0.001d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 97.0d, 100.0d, 100.0d, 0.25d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        double[] doubleArray2 = new double[] { (-1.0f), 100L };
        double[] doubleArray8 = new double[] { 2.0d, 0.0d, (-1.0d), 100.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, 0.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        double[] doubleArray1 = new double[] { 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        double[] doubleArray5 = new double[] { 0.9d, 0.1d, 0.70710678d, (-10.0d), 0.001d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 0.1d, 0.70710678d, (-10.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        double[] doubleArray6 = new double[] { 1.0E10d, 100.0d, 512.0d, 10.0f, 1.0E10d, 512.0d };
        double[] doubleArray11 = new double[] { (-100.0d), 0.3333333d, (-1.0f), 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 100.0d, 512.0d, 10.0d, 1.0E10d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-100.0d), 0.3333333d, (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        double[] doubleArray3 = new double[] { '4', 0, 100.0d };
        double[] doubleArray7 = new double[] { 1L, (byte) 1, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        double[] doubleArray5 = new double[] { 1000000.0d, 1.0E10d, 0L, 1.0f, 0.1d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0E10d, 0.0d, 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        double[] doubleArray4 = new double[] { (-1.0d), (-1), 0.0d, 1.0E8d };
        double[] doubleArray9 = new double[] { (short) 100, 0.70710678d, 1024.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 0.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.70710678d, 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 42.0d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        double[] doubleArray4 = new double[] { 0.3333333d, 10.0d, 10L, 1.0E-12d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.3333333d, 10.0d, 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        double[] doubleArray4 = new double[] { (short) 100, 10, (-1.0d), 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 10.0d, (-1.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        double[] doubleArray2 = new double[] { 100.0d, 0.001d };
        double[] doubleArray5 = new double[] { 1024.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        double[] doubleArray4 = new double[] { 0.9d, 100, 0.0f, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d, 100.0d, 0.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        double[] doubleArray5 = new double[] { (-1.0E10d), 1.0E-4d, 1.0E-15d, '4', (-1L) };
        double[] doubleArray10 = new double[] { 2.0d, 1.0d, 1.0E-6d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0E-4d, 1.0E-15d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.0d, 1.0d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        double[] doubleArray2 = new double[] { 512.0d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        double[] doubleArray6 = new double[] { 100.0f, 0, 0.9d, 100L, (-1.0d), 1 };
        double[] doubleArray8 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, 0.9d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        double[] doubleArray4 = new double[] { 1.0d, 1.0d, 42.0d, 1.0E-12d };
        double[] doubleArray6 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 42.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        double[] doubleArray5 = new double[] { 0.25d, (-1L), 0.0f, (-1.0f), 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, (-1.0d), 0.0d, (-1.0d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        double[] doubleArray4 = new double[] { (-1.0f), (short) 10, 0.0d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        double[] doubleArray3 = new double[] { 1.0d, (-1L), (-1.0d) };
        double[] doubleArray9 = new double[] { ' ', (-1.0E10d), (-1.0d), 1.0E-15d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 32.0d, (-1.0E10d), (-1.0d), 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        double[] doubleArray3 = new double[] { 10.0d, 1, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        double[] doubleArray2 = new double[] { 0.25d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        double[] doubleArray5 = new double[] { (byte) 0, 0.0d, 0L, '4', (-1.0d) };
        double[] doubleArray8 = new double[] { 0.3333333d, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 0.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 10, 1L, 100.0d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        double[] doubleArray6 = new double[] { (-1.0d), (-1.0d), (short) 0, (byte) 100, (short) 0, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), 0.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        double[] doubleArray3 = new double[] { 100L, 1.0E-15d, 1.0f };
        double[] doubleArray8 = new double[] { 1.0E-10d, 1.0E-6d, 100.0d, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-15d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, 1.0E-6d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        double[] doubleArray6 = new double[] { (-1L), 1.0E8d, 0.0d, 0.0d, '4', (-1.0d) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0E8d, 0.0d, 0.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        double[] doubleArray2 = new double[] { 'a', ' ' };
        double[] doubleArray4 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray8 = new double[] { (short) 1, 1L, 2.0d, (-1L), '4', (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 2.0d, (-1.0d), 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        double[] doubleArray6 = new double[] { 0L, 0.001d, 2.0d, 0.0f, (byte) 0, 0.1d };
        double[] doubleArray10 = new double[] { 1024.0d, (-1.0f), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.001d, 2.0d, 0.0d, 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 42.0d, (-1.0f), (-100.0d), 0, (byte) 1, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 42.0d, (-1.0d), (-100.0d), 0.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        double[] doubleArray3 = new double[] { 10, 100L, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        double[] doubleArray4 = new double[] { (-0.0d), (short) 1, 'a', 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-0.0d), 1.0d, 97.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 10L, 0.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        double[] doubleArray4 = new double[] { 'a', 100.0d, (byte) 100, 1L };
        double[] doubleArray8 = new double[] { 1.0d, (byte) 10, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 100.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        double[] doubleArray5 = new double[] { 0.001d, 1.0f, (-1.0f), 0.1d, 1.0E-8d };
        double[] doubleArray10 = new double[] { 1.0E8d, (byte) 0, (-1), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 1.0d, (-1.0d), 0.1d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E8d, 0.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        double[] doubleArray6 = new double[] { 0.1d, 1.0f, 10.0f, ' ', 256.0d, (-100.0d) };
        double[] doubleArray11 = new double[] { (-1L), (-1.0d), (-1.0f), 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 1.0d, 10.0d, 32.0d, 256.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray5 = new double[] { 100.0d, (byte) -1, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 5.0d }, 1.0E-15);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        double[] doubleArray6 = new double[] { 10.0d, 10.0f, (-0.0d), (short) -1, (-1.0d), '#' };
        double[] doubleArray12 = new double[] { (-1), '4', (-0.0d), 0.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, (-0.0d), (-1.0d), (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 52.0d, (-0.0d), 0.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        double[] doubleArray6 = new double[] { 100, 0.01d, (byte) 10, 1.0E8d, (-1.0E10d), (-1.0f) };
        double[] doubleArray12 = new double[] { 10.0d, 42.0d, (-1.0f), 100L, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.01d, 10.0d, 1.0E8d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 42.0d, (-1.0d), 100.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        double[] doubleArray6 = new double[] { 0.0d, 0.3333333d, (-1.0d), 1.0d, (byte) 100, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.3333333d, (-1.0d), 1.0d, 100.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        double[] doubleArray5 = new double[] { 0, ' ', 1.0E-4d, (-1.0d), (-1.0E10d) };
        double[] doubleArray7 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, 1.0E-4d, (-1.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        double[] doubleArray5 = new double[] { 1L, (-1L), (byte) 0, 5.0d, 0.0d };
        double[] doubleArray7 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 0.0d, 5.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        double[] doubleArray2 = new double[] { 42.0d, 0.9d };
        double[] doubleArray8 = new double[] { 0.3333333d, 0.001d, 0.70710678d, 5.0d, 0.3333333d };
        double[] doubleArray14 = new double[] { 1.0d, (short) -1, 0.001d, 1.0E8d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray14);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 0.001d, 0.70710678d, 5.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, (-1.0d), 0.001d, 1.0E8d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        double[] doubleArray5 = new double[] { 'a', (byte) 100, (-1.0d), 1000000.0d, (short) 100 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 100.0d, (-1.0d), 1000000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        double[] doubleArray5 = new double[] { 1024.0d, (byte) 1, 42.0d, 0.0f, '#' };
        double[] doubleArray11 = new double[] { 1.0E10d, 10.0f, 1.0f, 0.0d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 1.0d, 42.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E10d, 10.0d, 1.0d, 0.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        double[] doubleArray4 = new double[] { 0.01d, 0.70710678d, (-1.0d), 1.0f };
        double[] doubleArray11 = new double[] { 0.5d, (short) 10, (byte) 0, 'a', 1.0E-6d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 0.70710678d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.5d, 10.0d, 0.0d, 97.0d, 1.0E-6d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        double[] doubleArray2 = new double[] { 5.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 0.70710678d, 42.0d, 1024.0d, 1.0E-8d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 42.0d, 1024.0d, 1.0E-8d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        double[] doubleArray5 = new double[] { 1.0d, (-1L), (-1.0E10d), 0.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0E10d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        double[] doubleArray6 = new double[] { 256.0d, (-1.0f), 42.0d, 1024.0d, (byte) 0, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, (-1.0d), 42.0d, 1024.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        double[] doubleArray4 = new double[] { ' ', (short) 0, (byte) 1, 0.1d };
        double[] doubleArray7 = new double[] { (byte) 100, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 0.0d, 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        double[] doubleArray3 = new double[] { 1.0d, (-0.0d), 0.01d };
        double[] doubleArray7 = new double[] { 1.0E-15d, (-1.0f), 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-0.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-15d, (-1.0d), 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        double[] doubleArray6 = new double[] { (-1.0f), 1.0E-15d, 0.1d, 0.3333333d, 100.0f, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0E-15d, 0.1d, 0.3333333d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        double[] doubleArray6 = new double[] { 0.3333333d, (short) 10, 0.3333333d, 512.0d, 10, 1.0E8d };
        double[] doubleArray12 = new double[] { (-0.0d), 1.0f, (-1.0E10d), 256.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 10.0d, 0.3333333d, 512.0d, 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-0.0d), 1.0d, (-1.0E10d), 256.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        double[] doubleArray3 = new double[] { 100.0d, 256.0d, 10.0f };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 256.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        double[] doubleArray2 = new double[] { 1.0E-15d, (byte) 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { 42.0d, 1.0f, 1024.0d, (-100.0d), 512.0d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 42.0d, 1.0d, 1024.0d, (-100.0d), 512.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0L, 10.0d, 0L, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        double[] doubleArray4 = new double[] { 1.0E-8d, 'a', 1L, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-8d, 97.0d, 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        double[] doubleArray4 = new double[] { 100L, (-1), 1.0f, (-10.0d) };
        double[] doubleArray10 = new double[] { 256.0d, 0.0f, 0.1d, (short) -1, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray10, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, 0.0d, 0.1d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        double[] doubleArray5 = new double[] { 1.0E-6d, 'a', 0.9d, (-1.0d), 0.0d };
        double[] doubleArray10 = new double[] { 512.0d, 1.0d, (-1L), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, 97.0d, 0.9d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 512.0d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        double[] doubleArray3 = new double[] { (-0.0d), (byte) -1, 1024.0d };
        double[] doubleArray8 = new double[] { 0.001d, 0.1d, (-1.0E10d), 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.001d, 0.1d, (-1.0E10d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        double[] doubleArray5 = new double[] { (short) 100, 100.0d, 'a', 100L, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 97.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        double[] doubleArray5 = new double[] { 100.0d, 0.25d, 2.0d, (byte) 10, 0.0f };
        double[] doubleArray12 = new double[] { 0.0f, 1.0E8d, 100.0f, 'a', (byte) 10, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.25d, 2.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0E8d, 100.0d, 97.0d, 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        double[] doubleArray5 = new double[] { 1.0E-10d, (byte) 10, '#', 1.0d, 10000.0d };
        double[] doubleArray12 = new double[] { 1.0d, 0.5d, 0.5d, 1.0E10d, 5.0d, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 10.0d, 35.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.5d, 0.5d, 1.0E10d, 5.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        double[] doubleArray6 = new double[] { 0.01d, 1L, 1.0E10d, 1.0d, 0, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 1.0d, 1.0E10d, 1.0d, 0.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        double[] doubleArray4 = new double[] { 1.0E-15d, 0.0f, (short) 100, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 0.0d, 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        double[] doubleArray4 = new double[] { 0, 10000.0d, 0.0d, (short) 10 };
        double[] doubleArray9 = new double[] { (-1L), 0.0d, 1.0E-10d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 10000.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 1.0E-10d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        double[] doubleArray3 = new double[] { 1.0E-15d, 0.3333333d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.3333333d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        double[] doubleArray6 = new double[] { 0.3333333d, (-0.0d), 0.0d, 10000.0d, 1, (short) 10 };
        double[] doubleArray10 = new double[] { (byte) 10, 5.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, (-0.0d), 0.0d, 10000.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 5.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        double[] doubleArray2 = new double[] { 0.001d, 1.0E-8d };
        double[] doubleArray4 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        double[] doubleArray4 = new double[] { (short) 0, 1.0E-4d, 0.001d, (byte) 0 };
        double[] doubleArray10 = new double[] { 1.0E-12d, ' ', 42.0d, 1.0E-8d, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0E-4d, 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 32.0d, 42.0d, 1.0E-8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        double[] doubleArray2 = new double[] { '4', (-1.0d) };
        double[] doubleArray6 = new double[] { (short) 10, 1.0E-6d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-6d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { 1L, 0.001d, 10.0d, 1.0E10d, ' ', (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.001d, 10.0d, 1.0E10d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        double[] doubleArray5 = new double[] { 0.3333333d, 1.0E-15d, 1024.0d, (-1), 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, 1.0E-15d, 1024.0d, (-1.0d), 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        double[] doubleArray2 = new double[] { 100.0f, 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double[] doubleArray4 = new double[] { 1.0E-15d, 0.5d, 0.0d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 0.5d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        double[] doubleArray2 = new double[] { (-10.0d), 1.0f };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        double[] doubleArray2 = new double[] { 1.0E-4d, 1.0E-10d };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, (byte) 0, (-0.0d), 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 0.0d, (-0.0d), 0.25d }, 1.0E-15);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        double[] doubleArray4 = new double[] { 0.70710678d, 100, (byte) 100, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, 100.0d, 100.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        double[] doubleArray5 = new double[] { (-10.0d), 1.0E8d, 0.0d, ' ', (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 1.0E8d, 0.0d, 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        double[] doubleArray3 = new double[] { (-1.0f), 10, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        double[] doubleArray5 = new double[] { (-100.0d), '4', (short) 10, 0.25d, 1.0E-12d };
        double[] doubleArray11 = new double[] { 1000000.0d, ' ', 0.3333333d, 0.5d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 52.0d, 10.0d, 0.25d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1000000.0d, 32.0d, 0.3333333d, 0.5d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray7 = new double[] { (-1), 'a', (short) 1, 1000000.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 97.0d, 1.0d, 1000000.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        double[] doubleArray6 = new double[] { (short) 10, 10L, 10, 1.0E-4d, 0.9d, 1.0E-15d };
        double[] doubleArray12 = new double[] { (short) 100, 1.0d, 0.9d, 1.0E-4d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 10.0d, 1.0E-4d, 0.9d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 0.9d, 1.0E-4d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        double[] doubleArray3 = new double[] { 0, 0.0d, (short) 0 };
        double[] doubleArray5 = new double[] { 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 2.0d, 1.0f, 1L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 1.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        double[] doubleArray4 = new double[] { 0.70710678d, (short) -1, 1.0d, 0.3333333d };
        double[] doubleArray11 = new double[] { 1.0E-10d, 0.5d, 10.0f, 1.0E-10d, (short) 0, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, (-1.0d), 1.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-10d, 0.5d, 10.0d, 1.0E-10d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0, 1.0E10d, 0.1d, (-1.0E10d), '4', 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E10d, 0.1d, (-1.0E10d), 52.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        double[] doubleArray5 = new double[] { 0.0f, 100L, 100.0f, (-1.0f), 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 100.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        double[] doubleArray4 = new double[] { 100, 1.0E10d, (-1.0f), 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E10d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        double[] doubleArray6 = new double[] { 1.0E-4d, (-0.0d), 5.0d, 10, 10000.0d, 2.0d };
        double[] doubleArray13 = new double[] { 0L, 10.0d, 0, 1.0E8d, 100, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, (-0.0d), 5.0d, 10.0d, 10000.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d, 0.0d, 1.0E8d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        double[] doubleArray2 = new double[] { (-1L), 0.9d };
        double[] doubleArray8 = new double[] { 100.0f, 10L, 1, 1.0d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0d, 1.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        double[] doubleArray4 = new double[] { (-1.0f), (byte) 100, 1.0f, 256.0d };
        double[] doubleArray6 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        double[] doubleArray13 = new double[] { 256.0d, 512.0d, 1024.0d, 1.0E-15d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray13, doubleArray13);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 100.0d, 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 256.0d, 512.0d, 1024.0d, 1.0E-15d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray8 = new double[] { (short) 100, (short) 10, 1.0E-8d, 100L, (-1), 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0E-8d, 100.0d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        double[] doubleArray2 = new double[] { (short) 1, 0.0d };
        double[] doubleArray9 = new double[] { 100.0f, 10L, 100.0d, (short) 1, 100L, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10.0d, 100.0d, 1.0d, 100.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        double[] doubleArray5 = new double[] { 1.0E-4d, (byte) 0, (-100.0d), (short) 1, 0.1d };
        double[] doubleArray10 = new double[] { 0L, 10.0d, (short) 0, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 0.0d, (-100.0d), 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        double[] doubleArray5 = new double[] { 1000000.0d, 1, 1.0E10d, (byte) 10, ' ' };
        double[] doubleArray8 = new double[] { (-1.0E10d), 100 };
        double[] doubleArray10 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0d, 1.0E10d, 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0E10d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        double[] doubleArray3 = new double[] { 1, (short) 1, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.0d, 10000.0d, 5.0d, 1.0E-6d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10000.0d, 5.0d, 1.0E-6d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray6 = new double[] { 1.0E10d, (short) 100, (byte) 10, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 100.0d, 10.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        double[] doubleArray2 = new double[] { 2.0d, 1.0E-8d };
        double[] doubleArray4 = new double[] { 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        double[] doubleArray3 = new double[] { 1.0E-4d, 100.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d, 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        double[] doubleArray6 = new double[] { 100L, 0.5d, 0.0d, 10.0d, (short) -1, 0.1d };
        double[] doubleArray9 = new double[] { 0.001d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.5d, 0.0d, 10.0d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray6 = new double[] { (byte) 1, (short) 0, 1024.0d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 1024.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0d, (-10.0d), 512.0d, 10, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-10.0d), 512.0d, 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        double[] doubleArray6 = new double[] { 0.0d, 0.0d, 1.0E-6d, 100.0d, 1L, (-100.0d) };
        double[] doubleArray13 = new double[] { 1.0d, 42.0d, (byte) 1, 10000.0d, 0.0f, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 1.0E-6d, 100.0d, 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 42.0d, 1.0d, 10000.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        double[] doubleArray6 = new double[] { 10.0d, 0.1d, '#', (-0.0d), 100.0d, (short) -1 };
        double[] doubleArray8 = new double[] { (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.1d, 35.0d, (-0.0d), 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 10, 100.0d, 10L };
        double[] doubleArray9 = new double[] { 10.0d, 10000.0d, (-0.0d), 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10000.0d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        double[] doubleArray2 = new double[] { 100.0f, (byte) -1 };
        double[] doubleArray8 = new double[] { (-1.0d), 10.0d, 1.0E10d, ' ', 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 10.0d, 1.0E10d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        double[] doubleArray5 = new double[] { 0.0d, (-10.0d), 512.0d, (short) 10, 0.9d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-10.0d), 512.0d, 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray8 = new double[] { 1.0d, 10.0d, 1024.0d, 1.0E-6d, 1.0E-8d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, 1024.0d, 1.0E-6d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        double[] doubleArray5 = new double[] { 1000000.0d, 'a', 10L, (short) 100, 1.0E-12d };
        double[] doubleArray10 = new double[] { '4', 1.0E10d, 1.0E-12d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 97.0d, 10.0d, 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 1.0E10d, 1.0E-12d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        double[] doubleArray4 = new double[] { (-10.0d), 100, 5.0d, 1.0f };
        double[] doubleArray7 = new double[] { 1.0E-10d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 100.0d, 5.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        double[] doubleArray3 = new double[] { 10.0d, 256.0d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        double[] doubleArray2 = new double[] { 0.1d, 1000000.0d };
        double[] doubleArray9 = new double[] { (short) 0, 100.0d, (byte) 100, (-10.0d), 100.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 100.0d, 100.0d, (-10.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        double[] doubleArray3 = new double[] { (byte) 1, 42.0d, 100 };
        double[] doubleArray10 = new double[] { 0.9d, 0.70710678d, (short) 0, 'a', 0.3333333d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.9d, 0.70710678d, 0.0d, 97.0d, 0.3333333d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        double[] doubleArray3 = new double[] { 0.1d, 42.0d, 1.0E-8d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, 42.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        double[] doubleArray2 = new double[] { 'a', ' ' };
        double[] doubleArray4 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        double[] doubleArray6 = new double[] { 1.0d, 1000000.0d, 10000.0d, (byte) 10, 10000.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1000000.0d, 10000.0d, 10.0d, 10000.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        double[] doubleArray2 = new double[] { 100, (-1.0f) };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        double[] doubleArray5 = new double[] { 'a', (-1.0f), 1.0E-6d, 0.0f, (byte) 100 };
        double[] doubleArray7 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, (-1.0d), 1.0E-6d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d }, 1.0E-15);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        double[] doubleArray6 = new double[] { 100.0f, 10000.0d, 0.0f, (-1.0d), 0.5d, 0.0d };
        double[] doubleArray8 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10000.0d, 0.0d, (-1.0d), 0.5d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        double[] doubleArray6 = new double[] { 'a', (-1.0E10d), (-1.0d), 100.0f, 1.0E-15d, 'a' };
        double[] doubleArray13 = new double[] { (byte) 1, (short) 10, 10.0d, 0.3333333d, 0.01d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, (-1.0E10d), (-1.0d), 100.0d, 1.0E-15d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 10.0d, 10.0d, 0.3333333d, 0.01d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        double[] doubleArray4 = new double[] { 1.0E8d, 0.0f, 0.0d, 10L };
        double[] doubleArray11 = new double[] { 0.001d, '#', 10.0d, 1.0E-8d, 10.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.001d, 35.0d, 10.0d, 1.0E-8d, 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        double[] doubleArray5 = new double[] { 100, (short) 10, 1.0E-8d, 100.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 1.0E-8d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        double[] doubleArray4 = new double[] { (-1.0d), 10L, (short) -1, (-10.0d) };
        double[] doubleArray6 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        double[] doubleArray2 = new double[] { 100L, 0.3333333d };
        double[] doubleArray6 = new double[] { 1.0f, 1.0E-8d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0E-8d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        double[] doubleArray3 = new double[] { 10.0f, ' ', 1.0f };
        double[] doubleArray5 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        double[] doubleArray4 = new double[] { 42.0d, (short) 100, 10.0d, 1L };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        double[] doubleArray1 = new double[] { (-1.0E10d) };
        double[] doubleArray7 = new double[] { 100.0d, 0.0d, 1.0E10d, 100, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.0d, 1.0E10d, 100.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        double[] doubleArray2 = new double[] { (byte) 10, 1000000.0d };
        double[] doubleArray5 = new double[] { (short) 0, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        double[] doubleArray4 = new double[] { 0.25d, 10.0d, 0.0f, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.70710678d, (-1), 0.3333333d, 1000000.0d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, (-1.0d), 0.3333333d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        double[] doubleArray3 = new double[] { 256.0d, (-1.0f), (-1L) };
        double[] doubleArray6 = new double[] { 10.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        double[] doubleArray4 = new double[] { (-1), 1.0d, (short) 100, 0.001d };
        double[] doubleArray9 = new double[] { 1L, (-10.0d), 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-10.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        double[] doubleArray2 = new double[] { '4', 2.0d };
        double[] doubleArray8 = new double[] { 1.0E-6d, 10.0f, (-0.0d), (short) -1, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-6d, 10.0d, (-0.0d), (-1.0d), 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        double[] doubleArray5 = new double[] { 0.0f, 10L, (-100.0d), 1.0E-15d, (short) 0 };
        double[] doubleArray8 = new double[] { (byte) 0, 0.0d };
        double[] doubleArray10 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray10);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, (-100.0d), 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        double[] doubleArray3 = new double[] { '#', (-10.0d), 0.9d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, (-10.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        double[] doubleArray5 = new double[] { (byte) 10, 0, 10.0d, 5.0d, 0.01d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 10.0d, 5.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0, 1.0E-8d };
        double[] doubleArray5 = new double[] { 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        double[] doubleArray6 = new double[] { 1000000.0d, 'a', 2.0d, 256.0d, 1000000.0d, 0.3333333d };
        double[] doubleArray11 = new double[] { 0.0f, 1.0d, 0.3333333d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 97.0d, 2.0d, 256.0d, 1000000.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1.0d, 0.3333333d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        double[] doubleArray2 = new double[] { '4', (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100.0d, (-1), (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        double[] doubleArray5 = new double[] { 1.0E-15d, 10.0d, 0.0d, 0.9d, (byte) 100 };
        double[] doubleArray10 = new double[] { 1.0E-10d, 1.0E-12d, 1.0E-12d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 10.0d, 0.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 1.0E-12d, 1.0E-12d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        double[] doubleArray4 = new double[] { 100, 1, 1.0E10d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 1.0E10d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        double[] doubleArray6 = new double[] { 1.0d, 1000000.0d, 5.0d, 0.70710678d, 0.25d, 42.0d };
        double[] doubleArray9 = new double[] { 0L, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1000000.0d, 5.0d, 0.70710678d, 0.25d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        double[] doubleArray4 = new double[] { (byte) 10, '4', 1.0d, 1.0E-12d };
        double[] doubleArray7 = new double[] { 10.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 0.9d, 1.0E-15d, 1.0E-6d, 100, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 1.0E-15d, 1.0E-6d, 100.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        double[] doubleArray5 = new double[] { (-1.0E10d), 10.0d, 512.0d, 0.01d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d, 512.0d, 0.01d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0.9d, 1.0d };
        double[] doubleArray7 = new double[] { (-1.0d), 10L, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 10.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        double[] doubleArray6 = new double[] { 1.0E-6d, 0, 1.0f, 256.0d, 1.0E8d, (short) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 0.0d, 1.0d, 256.0d, 1.0E8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        double[] doubleArray5 = new double[] { 10.0d, 1.0E-12d, (byte) 10, 1.0E-4d, 5.0d };
        double[] doubleArray12 = new double[] { 0.5d, (byte) -1, 0.3333333d, 1L, 1.0E-8d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-12d, 10.0d, 1.0E-4d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.5d, (-1.0d), 0.3333333d, 1.0d, 1.0E-8d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        double[] doubleArray3 = new double[] { 1.0E8d, 1.0E-10d, 100 };
        double[] doubleArray10 = new double[] { (-1.0d), 0L, 0.0f, (byte) 0, 1.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, 1.0E-10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, 0.0d, 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        double[] doubleArray4 = new double[] { 10.0d, 1L, 0.5d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 0.5d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray7 = new double[] { 100.0d, 1.0E-15d, 1.0E-8d, (short) 10, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-15d, 1.0E-8d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        double[] doubleArray5 = new double[] { '4', 1.0E-10d, (byte) 1, 0.25d, 0.70710678d };
        double[] doubleArray10 = new double[] { (-1.0E10d), 1.0E8d, 0.01d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 1.0E-10d, 1.0d, 0.25d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0E10d), 1.0E8d, 0.01d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        double[] doubleArray5 = new double[] { (byte) 1, 1.0d, 1.0d, 1.0f, 1.0E-15d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 1.0d, 1.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        double[] doubleArray5 = new double[] { 1000000.0d, (-1), (byte) 1, 0, 1.0E-15d };
        double[] doubleArray11 = new double[] { (-1.0f), 1.0E10d, (short) 0, (short) 1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, (-1.0d), 1.0d, 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0E10d, 0.0d, 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        double[] doubleArray1 = new double[] { 0.25d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        double[] doubleArray3 = new double[] { (short) 0, (-1.0d), (byte) -1 };
        double[] doubleArray10 = new double[] { (byte) 10, ' ', 42.0d, 1, 1024.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 32.0d, 42.0d, 1.0d, 1024.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        double[] doubleArray5 = new double[] { 1.0E8d, (-1.0E10d), 1.0d, (short) 10, 0.01d };
        double[] doubleArray7 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, (-1.0E10d), 1.0d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        double[] doubleArray3 = new double[] { 0.3333333d, (-1.0E10d), 1.0f };
        double[] doubleArray10 = new double[] { (short) -1, 0.0d, 10L, (byte) 100, (-1.0f), 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3333333d, (-1.0E10d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, 10.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        double[] doubleArray3 = new double[] { 10.0d, 1.0E-8d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0E-8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        double[] doubleArray6 = new double[] { 1L, 0.25d, 10.0f, (-1), (-1.0d), '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.25d, 10.0d, (-1.0d), (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        double[] doubleArray3 = new double[] { 0.3333333d, 1.0E10d, (-1) };
        double[] doubleArray5 = new double[] { 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3333333d, 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        double[] doubleArray2 = new double[] { (-10.0d), (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-10.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        double[] doubleArray6 = new double[] { 1000000.0d, 'a', 2.0d, 256.0d, 1000000.0d, 0.3333333d };
        double[] doubleArray11 = new double[] { 0.0f, 1.0d, 0.3333333d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 97.0d, 2.0d, 256.0d, 1000000.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1.0d, 0.3333333d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray7 = new double[] { 10L, 1.0E10d, 10, (short) -1, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0E10d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0.0f, (short) -1, 10.0f, 1.0E-4d, (byte) 100, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, (-1.0d), 10.0d, 1.0E-4d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        double[] doubleArray5 = new double[] { 1.0E-10d, (short) 100, 100.0d, (short) 1, (-0.0d) };
        double[] doubleArray7 = new double[] { 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 100.0d, 100.0d, 1.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        double[] doubleArray5 = new double[] { (byte) -1, '4', 2.0d, 1.0E-15d, 10.0f };
        double[] doubleArray9 = new double[] { 0.01d, 1.0E-12d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 52.0d, 2.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.01d, 1.0E-12d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        double[] doubleArray4 = new double[] { 512.0d, 1.0E-8d, (-1L), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0E-8d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        double[] doubleArray4 = new double[] { 10.0d, 1.0d, 0.0f, '#' };
        double[] doubleArray8 = new double[] { 1.0E-4d, 'a', (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 97.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        double[] doubleArray4 = new double[] { 0.0f, (-1.0E10d), 1.0E-10d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0E10d), 1.0E-10d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        double[] doubleArray5 = new double[] { (-1L), (byte) -1, (short) 0, 100, (short) -1 };
        double[] doubleArray7 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        double[] doubleArray4 = new double[] { (byte) -1, 0.70710678d, (short) 100, 0 };
        double[] doubleArray9 = new double[] { (-100.0d), ' ', 1.0E-10d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.70710678d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), 32.0d, 1.0E-10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        double[] doubleArray3 = new double[] { (byte) 1, 1.0E-10d, (-1.0d) };
        double[] doubleArray9 = new double[] { 1L, 1024.0d, 100.0f, (byte) 10, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1024.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 0, '#', (-1), (short) 1, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 35.0d, (-1.0d), 1.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        double[] doubleArray5 = new double[] { 1.0E-6d, 100.0d, 1.0E-4d, 1.0E-10d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, 100.0d, 1.0E-4d, 1.0E-10d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray5 = new double[] { (short) 1, (byte) 1, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        double[] doubleArray5 = new double[] { 1.0E-4d, '#', 10.0d, 1.0f, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        double[] doubleArray9 = new double[] { (-1.0d), 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 35.0d, 10.0d, 1.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.1d }, 1.0E-15);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        double[] doubleArray6 = new double[] { 10L, 1.0E10d, 1024.0d, ' ', 1.0E-10d, (-1) };
        double[] doubleArray11 = new double[] { 256.0d, 0.70710678d, 10000.0d, 0L };
        double[] doubleArray15 = new double[] { 1.0E-10d, (-0.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray11, doubleArray15);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E10d, 1024.0d, 32.0d, 1.0E-10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 256.0d, 0.70710678d, 10000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-10d, (-0.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        double[] doubleArray3 = new double[] { 100.0d, 0.0f, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        double[] doubleArray3 = new double[] { (-0.0d), 1.0E-6d, (-1.0f) };
        double[] doubleArray9 = new double[] { 2.0d, (byte) -1, 0.0f, 1000000.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        double[] doubleArray16 = new double[] { 100.0d, 0.3333333d, 0.70710678d, (byte) 0, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.0d, (-1.0d), 0.0d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 0.3333333d, 0.70710678d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        double[] doubleArray3 = new double[] { (byte) 1, 0.70710678d, 100.0d };
        double[] doubleArray8 = new double[] { 1.0E-15d, 1000000.0d, 1L, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-15d, 1000000.0d, 1.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        double[] doubleArray4 = new double[] { 10, (short) 0, 0.001d, (-10.0d) };
        double[] doubleArray8 = new double[] { '#', (short) -1, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 0.001d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, (-1.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        double[] doubleArray3 = new double[] { 10L, 1024.0d, 100.0d };
        double[] doubleArray5 = new double[] { (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        double[] doubleArray5 = new double[] { (short) 0, 1000000.0d, (short) 10, (-1.0f), 0 };
        double[] doubleArray7 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1000000.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        double[] doubleArray5 = new double[] { 10, 1.0d, 1.0E-4d, 1.0E10d, (short) 1 };
        double[] doubleArray11 = new double[] { 0.0f, (byte) -1, (byte) 0, (byte) 100, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 1.0E-4d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, (-1.0d), 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        double[] doubleArray4 = new double[] { 10.0d, 1.0d, 1.0E-8d, 512.0d };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0E10d), 10.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 1.0E-8d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0E10d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        double[] doubleArray5 = new double[] { 0.70710678d, 100.0d, 10, 1.0E-12d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.70710678d, 100.0d, 10.0d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

