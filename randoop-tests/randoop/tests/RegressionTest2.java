package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        double[] doubleArray6 = new double[] { 42.0d, 0.0d, 2.0d, 512.0d, 0.01d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 0.0d, 2.0d, 512.0d, 0.01d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        double[] doubleArray3 = new double[] { 1.0E-8d, 10.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        double[] doubleArray5 = new double[] { ' ', 10.0d, (-1.0E10d), 10.0f, 256.0d };
        double[] doubleArray8 = new double[] { 512.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 10.0d, (-1.0E10d), 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        double[] doubleArray5 = new double[] { 10L, (-100.0d), 100L, 1000000.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-100.0d), 100.0d, 1000000.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        double[] doubleArray6 = new double[] { (short) 1, (byte) 1, 0.70710678d, (-100.0d), (short) -1, 0.25d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 0.70710678d, (-100.0d), (-1.0d), 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 2.0d, (-100.0d), 10000.0d, 100L, 1.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, (-100.0d), 10000.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray4 = new double[] { (-1.0d), 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 2.0d }, 1.0E-15);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1024.0d, 10.0f, 0.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 10.0d, 0.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        double[] doubleArray2 = new double[] { 1000000.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray6 = new double[] { (byte) 100, 100, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        double[] doubleArray3 = new double[] { 10.0d, (-1.0d), (short) 100 };
        double[] doubleArray9 = new double[] { (-1.0E10d), (-1.0d), (-0.0d), 0.3333333d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0E10d), (-1.0d), (-0.0d), 0.3333333d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        double[] doubleArray3 = new double[] { (-1L), (byte) 1, 100.0f };
        double[] doubleArray5 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        double[] doubleArray3 = new double[] { 1.0E-8d, 0.0f, 0.0d };
        double[] doubleArray5 = new double[] { 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        double[] doubleArray3 = new double[] { 1.0E-4d, 1, 1000000.0d };
        double[] doubleArray7 = new double[] { (-1), 2.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        double[] doubleArray5 = new double[] { (short) -1, 1.0E8d, 1L, (byte) -1, 10.0d };
        double[] doubleArray12 = new double[] { 1.0E-4d, 0.0f, (short) 10, '4', 1000000.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E8d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-4d, 0.0d, 10.0d, 52.0d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0L, (-100.0d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        double[] doubleArray6 = new double[] { 1.0E-4d, 10.0d, 0.001d, ' ', (byte) 10, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, 10.0d, 0.001d, 32.0d, 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        double[] doubleArray2 = new double[] { 1L, (-100.0d) };
        double[] doubleArray7 = new double[] { 1.0E10d, (short) -1, 0.9d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, (-1.0d), 0.9d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        double[] doubleArray1 = new double[] { 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        double[] doubleArray3 = new double[] { (-1.0d), 100.0f, 0.0f };
        double[] doubleArray5 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d }, 1.0E-15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        double[] doubleArray4 = new double[] { 100L, 0.001d, (-1.0d), 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.001d, (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double[] doubleArray6 = new double[] { 100, 1.0f, (byte) 0, 1, 1.0E10d, 10.0d };
        double[] doubleArray9 = new double[] { '#', 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 0.0d, 1.0d, 1.0E10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        double[] doubleArray5 = new double[] { 1.0E8d, 1.0E-4d, 1.0f, '#', 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, 1.0E-4d, 1.0d, 35.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        double[] doubleArray1 = new double[] { 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        double[] doubleArray1 = new double[] { (-1.0E10d) };
        double[] doubleArray4 = new double[] { 10.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray5 = new double[] { 0, 0.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        double[] doubleArray3 = new double[] { 1.0E-15d, 0.25d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        double[] doubleArray6 = new double[] { (byte) 10, 1.0d, (byte) 0, 100.0d, 1.0E-12d, 100.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.0d, 100.0d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        double[] doubleArray3 = new double[] { 1.0E8d, 0.9d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, 0.9d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        double[] doubleArray6 = new double[] { 1L, 0.001d, (short) 100, (short) 1, 10000.0d, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.001d, 100.0d, 1.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        double[] doubleArray3 = new double[] { 10.0d, 0.25d, 0.001d };
        double[] doubleArray8 = new double[] { 1, (byte) 0, 100.0d, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.25d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0E10d), (short) 10, 0.01d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d, 0.01d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.1d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        double[] doubleArray5 = new double[] { ' ', 0, 1.0d, 1.0E10d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d, 1.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        double[] doubleArray2 = new double[] { (byte) -1, 10.0f };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        double[] doubleArray4 = new double[] { 1.0d, 10.0d, 0.70710678d, 0.0d };
        double[] doubleArray6 = new double[] { (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d, 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        double[] doubleArray3 = new double[] { (-1.0d), (-1), '#' };
        double[] doubleArray7 = new double[] { 1.0E-15d, 0, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-15d, 0.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        double[] doubleArray1 = new double[] { 256.0d };
        double[] doubleArray7 = new double[] { 1.0E-10d, 'a', 1.0E-6d, (-1.0d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 97.0d, 1.0E-6d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        double[] doubleArray2 = new double[] { (byte) 100, 100.0d };
        double[] doubleArray7 = new double[] { 1.0E-12d, 1.0E-10d, 0L, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, 1.0E-10d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        double[] doubleArray3 = new double[] { 'a', (short) 100, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        double[] doubleArray3 = new double[] { (byte) -1, 1.0d, 2.0d };
        double[] doubleArray5 = new double[] { 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        double[] doubleArray2 = new double[] { 0.25d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        double[] doubleArray4 = new double[] { 100.0f, (short) 1, (short) 10, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        double[] doubleArray5 = new double[] { 10L, (-1.0d), 'a', (-0.0d), 1.0d };
        double[] doubleArray9 = new double[] { 1.0E10d, 0.1d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 97.0d, (-0.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E10d, 0.1d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        double[] doubleArray5 = new double[] { 100L, 0.0d, (-10.0d), 1L, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, (-10.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        double[] doubleArray2 = new double[] { 0, (short) 0 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        double[] doubleArray4 = new double[] { 1.0d, (-100.0d), 100.0d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-100.0d), 100.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        double[] doubleArray4 = new double[] { 1.0E-6d, 5.0d, 0L, (byte) 0 };
        double[] doubleArray10 = new double[] { 512.0d, 0.0d, (-1.0E10d), 1024.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 5.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 512.0d, 0.0d, (-1.0E10d), 1024.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        double[] doubleArray1 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        double[] doubleArray6 = new double[] { 256.0d, 0.5d, 1.0E-8d, 256.0d, 100.0f, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 0.5d, 1.0E-8d, 256.0d, 100.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        double[] doubleArray2 = new double[] { (-1.0d), (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        double[] doubleArray3 = new double[] { 1000000.0d, (short) 1, 0.9d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, 1.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { '4', (byte) 100, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        double[] doubleArray3 = new double[] { ' ', 0.01d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, 0.01d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray6 = new double[] { 10.0d, 0L, (-1.0E10d), 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        double[] doubleArray3 = new double[] { 1.0E-12d, 1.0d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        double[] doubleArray5 = new double[] { (short) 100, ' ', (byte) 0, 0, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 32.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        double[] doubleArray2 = new double[] { 100.0d, (-1.0d) };
        double[] doubleArray4 = new double[] { (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { (-1.0d), 10.0d, 1.0E-10d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 1.0E-10d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        double[] doubleArray2 = new double[] { 5.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        double[] doubleArray2 = new double[] { 1.0E-6d, 0.0f };
        double[] doubleArray8 = new double[] { 1.0E-4d, 1.0E-4d, 1.0E-6d, 5.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 1.0E-4d, 1.0E-6d, 5.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        double[] doubleArray2 = new double[] { 1.0E-10d, 'a' };
        double[] doubleArray4 = new double[] { 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-10d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        double[] doubleArray2 = new double[] { (-1L), 1.0E10d };
        double[] doubleArray7 = new double[] { 0.01d, 0.3333333d, 0.9d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.01d, 0.3333333d, 0.9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        double[] doubleArray2 = new double[] { 10000.0d, (short) 1 };
        double[] doubleArray7 = new double[] { (-1.0f), 42.0d, ' ', 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 42.0d, 32.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        double[] doubleArray2 = new double[] { 0.0f, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        double[] doubleArray4 = new double[] { 10, 0.001d, 1000000.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.001d, 1000000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        double[] doubleArray2 = new double[] { (-10.0d), (-10.0d) };
        double[] doubleArray6 = new double[] { 1.0E8d, 1.0E-15d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-10.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 1.0E-15d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        double[] doubleArray2 = new double[] { 0.3333333d, 1.0E-10d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        double[] doubleArray1 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        double[] doubleArray2 = new double[] { 1.0E-8d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { ' ', (byte) 0, ' ', (short) 100, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 0.0d, 32.0d, 100.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        double[] doubleArray3 = new double[] { 1L, 1.0E-4d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E-4d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        double[] doubleArray4 = new double[] { (-10.0d), '4', 1.0E-6d, 100L };
        double[] doubleArray8 = new double[] { (byte) 10, 2.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 52.0d, 1.0E-6d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 2.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        double[] doubleArray3 = new double[] { (-1.0f), 1.0E10d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0E10d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        double[] doubleArray3 = new double[] { 10000.0d, 1.0f, 0.01d };
        double[] doubleArray9 = new double[] { 2.0d, 0.3333333d, (byte) -1, (short) 0, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.0d, 0.3333333d, (-1.0d), 0.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray3 = new double[] { ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        double[] doubleArray2 = new double[] { 0.01d, (-10.0d) };
        double[] doubleArray7 = new double[] { (byte) -1, 1.0E8d, 1.0E10d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1.0E8d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        double[] doubleArray4 = new double[] { (-1.0E10d), 0.3333333d, 512.0d, (short) 1 };
        double[] doubleArray8 = new double[] { 100.0d, 1000000.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 0.3333333d, 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1000000.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        double[] doubleArray6 = new double[] { 1.0E-6d, (-1), 1L, 5.0d, '4', 0.001d };
        double[] doubleArray12 = new double[] { 0.25d, 2.0d, 1024.0d, 1.0E10d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, (-1.0d), 1.0d, 5.0d, 52.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.25d, 2.0d, 1024.0d, 1.0E10d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        double[] doubleArray2 = new double[] { (-1.0E10d), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        double[] doubleArray3 = new double[] { (byte) 100, (short) 1, 42.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        double[] doubleArray2 = new double[] { 0.001d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        double[] doubleArray3 = new double[] { 1000000.0d, 1.0d, 0.001d };
        double[] doubleArray9 = new double[] { 256.0d, (short) 1, (-1.0d), 0.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1000000.0d, 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 1.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        double[] doubleArray3 = new double[] { (short) 1, (-10.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray8 = new double[] { 0, 10, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-10.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        double[] doubleArray6 = new double[] { 0.5d, (-100.0d), 1.0f, (short) 0, 10000.0d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, (-100.0d), 1.0d, 0.0d, 10000.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        double[] doubleArray2 = new double[] { 100, ' ' };
        double[] doubleArray5 = new double[] { 512.0d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d }, 1.0E-15);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        double[] doubleArray3 = new double[] { 10L, (short) 1, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0d, 0.0f, 1.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        double[] doubleArray4 = new double[] { 1.0E10d, 100.0f, 10.0d, 1.0E-4d };
        double[] doubleArray6 = new double[] { '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 100.0d, 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        double[] doubleArray5 = new double[] { 10000.0d, (-100.0d), 10.0d, 1.0E-15d, 0.3333333d };
        double[] doubleArray9 = new double[] { (-1.0E10d), 10000.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, (-100.0d), 10.0d, 1.0E-15d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0E10d), 10000.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        double[] doubleArray5 = new double[] { 1.0E-8d, 'a', 10, 10L, 1L };
        double[] doubleArray11 = new double[] { 'a', (-1.0d), 10.0f, 1000000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 97.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 97.0d, (-1.0d), 10.0d, 1000000.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { (short) 10, 42.0d, (byte) 10, (byte) 1, 1.0E10d, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 42.0d, 10.0d, 1.0d, 1.0E10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray8 = new double[] { 0.3333333d, ' ', (-1L), 0, 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 32.0d, (-1.0d), 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        double[] doubleArray1 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        double[] doubleArray6 = new double[] { 0.0d, (-1.0d), 512.0d, 0.5d, 0, 0.70710678d };
        double[] doubleArray13 = new double[] { 1.0f, 0L, (short) 1, (-1.0E10d), (byte) 100, 10L };
        double[] doubleArray18 = new double[] { (-0.0d), 1.0E-12d, 100.0d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray13, doubleArray18);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), 512.0d, 0.5d, 0.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 0.0d, 1.0d, (-1.0E10d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-0.0d), 1.0E-12d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        double[] doubleArray2 = new double[] { 0.3333333d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        double[] doubleArray3 = new double[] { 0.001d, 0L, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        double[] doubleArray3 = new double[] { 1L, 0, (-1.0d) };
        double[] doubleArray9 = new double[] { (byte) 10, (-1), 0.1d, (-1.0f), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), 0.1d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        double[] doubleArray4 = new double[] { 10.0f, 1.0E8d, 1.0E10d, (-1) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray8 = new double[] { 0.1d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E8d, 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.1d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        double[] doubleArray3 = new double[] { '4', 0.0d, 1.0E-6d };
        double[] doubleArray10 = new double[] { 0.0f, 0, (byte) 1, 0.5d, 1.0f, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, 1.0d, 0.5d, 1.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        double[] doubleArray4 = new double[] { (-10.0d), 1.0E-6d, (short) -1, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 1.0E-6d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10000.0d, 512.0d, 0.9d, (short) 0, 0.5d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10000.0d, 512.0d, 0.9d, 0.0d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        double[] doubleArray4 = new double[] { 'a', 10.0d, 1000000.0d, 1.0d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 10.0d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        double[] doubleArray2 = new double[] { (byte) 100, (-1.0E10d) };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        double[] doubleArray5 = new double[] { 1.0E-4d, (byte) -1, 100.0f, 1.0E-8d, 1.0E-15d };
        double[] doubleArray7 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, (-1.0d), 100.0d, 1.0E-8d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        double[] doubleArray2 = new double[] { ' ', 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        double[] doubleArray4 = new double[] { (short) 0, 0.01d, 0.70710678d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.01d, 0.70710678d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        double[] doubleArray2 = new double[] { 0.001d, (-10.0d) };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        double[] doubleArray1 = new double[] { (-0.0d) };
        double[] doubleArray7 = new double[] { (-1.0d), (-1.0E10d), 512.0d, 100, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0E10d), 512.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        double[] doubleArray3 = new double[] { 0.1d, 10L, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        double[] doubleArray5 = new double[] { (short) 10, (short) 1, 1.0f, (byte) -1, (byte) 1 };
        double[] doubleArray8 = new double[] { (byte) 1, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        double[] doubleArray3 = new double[] { 0.0d, 10000.0d, 1.0d };
        double[] doubleArray8 = new double[] { (-1), 2.0d, 5.0d, 10.0f };
        double[] doubleArray14 = new double[] { (byte) -1, 42.0d, 0.5d, 256.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray14);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 2.0d, 5.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 42.0d, 0.5d, 256.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        double[] doubleArray2 = new double[] { 1.0E-4d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        double[] doubleArray2 = new double[] { (-1), (byte) 1 };
        double[] doubleArray5 = new double[] { (byte) 10, (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        double[] doubleArray5 = new double[] { (-1L), (-1.0E10d), 1, 1L, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0E10d), 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        double[] doubleArray5 = new double[] { 1024.0d, 0.0d, 0.0d, 100.0d, 10 };
        double[] doubleArray7 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 0.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        double[] doubleArray5 = new double[] { ' ', 0, 1.0d, 1.0E10d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        double[] doubleArray9 = new double[] { (-0.0d), (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d, 1.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-0.0d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        double[] doubleArray4 = new double[] { 0.70710678d, (short) 100, 100, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        double[] doubleArray3 = new double[] { 1, 1L, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        double[] doubleArray3 = new double[] { 1.0d, 0.001d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.001d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        double[] doubleArray5 = new double[] { 10.0d, 10.0d, 10.0f, 1, 100L };
        double[] doubleArray9 = new double[] { 1.0E-12d, 'a', 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 97.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        double[] doubleArray2 = new double[] { 1.0E-6d, (-1.0d) };
        double[] doubleArray8 = new double[] { (byte) 100, 10, 1.0E-6d, 1.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0E-6d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        double[] doubleArray5 = new double[] { 100.0d, 1000000.0d, 1L, 0.1d, 100.0d };
        double[] doubleArray8 = new double[] { 1L, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1000000.0d, 1.0d, 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        double[] doubleArray2 = new double[] { 1.0f, (-100.0d) };
        double[] doubleArray5 = new double[] { 1.0E-6d, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        double[] doubleArray5 = new double[] { 1.0d, 100.0d, 1.0f, (byte) 0, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { (-100.0d), 10, 42.0d, (-1.0d), '#', 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-100.0d), 10.0d, 42.0d, (-1.0d), 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 5.0d, 0.25d, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 0.25d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        double[] doubleArray6 = new double[] { 0.9d, 0.0d, 100L, 1.0E-12d, 0.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 0.0d, 100.0d, 1.0E-12d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        double[] doubleArray2 = new double[] { 1L, '#' };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10000.0d, (short) -1, (byte) -1, 0.9d, 1.0f, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10000.0d, (-1.0d), (-1.0d), 0.9d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        double[] doubleArray5 = new double[] { 1.0d, (short) 0, (short) 100, 0.0d, 0.001d };
        double[] doubleArray9 = new double[] { 100, (-1.0E10d), (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 100.0d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray5 = new double[] { 256.0d, 1.0E-12d, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 1.0E-12d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, 10L, ' ', 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 32.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        double[] doubleArray6 = new double[] { 1.0E-12d, 1.0d, 'a', 10.0d, 1.0E-12d, 10.0d };
        double[] doubleArray13 = new double[] { 10.0d, 1.0E-10d, 0.0d, 1000000.0d, 100.0f, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-12d, 1.0d, 97.0d, 10.0d, 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0E-10d, 0.0d, 1000000.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        double[] doubleArray4 = new double[] { 10L, 0.9d, 100, 1.0E-8d };
        double[] doubleArray6 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.9d, 100.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        double[] doubleArray5 = new double[] { 0.70710678d, 2.0d, (-1.0f), 1.0E8d, (-0.0d) };
        double[] doubleArray10 = new double[] { (short) 10, (short) 100, 0.3333333d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.70710678d, 2.0d, (-1.0d), 1.0E8d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 100.0d, 0.3333333d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray4 = new double[] { (-1.0d), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        double[] doubleArray6 = new double[] { 0.25d, 0.1d, (-100.0d), 10.0f, (-0.0d), 0.3333333d };
        double[] doubleArray8 = new double[] { 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 0.1d, (-100.0d), 10.0d, (-0.0d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        double[] doubleArray5 = new double[] { 0L, (-1.0d), 0.001d, 10.0f, 1.0E-6d };
        double[] doubleArray8 = new double[] { 1.0E-6d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 0.001d, 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-6d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        double[] doubleArray3 = new double[] { 5.0d, 0.5d, (-1.0d) };
        double[] doubleArray10 = new double[] { 1, 0.9d, 5.0d, (-0.0d), 1024.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 0.5d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.9d, 5.0d, (-0.0d), 1024.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        double[] doubleArray2 = new double[] { 1.0E-8d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        double[] doubleArray3 = new double[] { (-1L), 1.0d, (short) 0 };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        double[] doubleArray5 = new double[] { 0.1d, (byte) 10, (-1), (-0.0d), 100 };
        double[] doubleArray10 = new double[] { 1000000.0d, (byte) 1, (byte) 0, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 10.0d, (-1.0d), (-0.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1000000.0d, 1.0d, 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        double[] doubleArray5 = new double[] { 2.0d, 0.70710678d, 0, 256.0d, (short) 100 };
        double[] doubleArray12 = new double[] { (short) 0, 10.0d, 1000000.0d, (-1.0f), 1.0E8d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 0.70710678d, 0.0d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 1000000.0d, (-1.0d), 1.0E8d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        double[] doubleArray4 = new double[] { 0.0d, 100.0d, 1, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        double[] doubleArray4 = new double[] { (-1.0d), 1.0f, (-100.0d), ' ' };
        double[] doubleArray8 = new double[] { 0.25d, 100L, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, (-100.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.25d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        double[] doubleArray6 = new double[] { 10.0d, (-100.0d), 5.0d, 0.0f, (byte) 0, 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-100.0d), 5.0d, 0.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray3 = new double[] { 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d }, 1.0E-15);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        double[] doubleArray2 = new double[] { 0, 1.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        double[] doubleArray3 = new double[] { 0.01d, 0, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray4 = new double[] { 42.0d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        double[] doubleArray2 = new double[] { 10.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        double[] doubleArray5 = new double[] { 100L, 1.0E-15d, 10.0f, (-100.0d), (byte) -1 };
        double[] doubleArray7 = new double[] { (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-15d, 10.0d, (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        double[] doubleArray2 = new double[] { 10, 1.0E-10d };
        double[] doubleArray7 = new double[] { (-10.0d), (byte) 0, 1024.0d, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-10.0d), 0.0d, 1024.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        double[] doubleArray2 = new double[] { 100.0d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        double[] doubleArray3 = new double[] { 10L, 100.0d, 5.0d };
        double[] doubleArray10 = new double[] { 1000000.0d, 100.0d, (short) 100, ' ', 100.0d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1000000.0d, 100.0d, 100.0d, 32.0d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        double[] doubleArray6 = new double[] { 100.0d, 512.0d, 1.0f, 10L, (short) 100, (-1.0f) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 512.0d, 1.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        double[] doubleArray6 = new double[] { (byte) 0, 1.0d, 1.0E-8d, 10000.0d, 100.0d, 1.0E-6d };
        double[] doubleArray9 = new double[] { 0.1d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 1.0E-8d, 10000.0d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.1d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        double[] doubleArray6 = new double[] { 0.5d, 1.0E8d, 0.5d, (short) 100, 1.0E-15d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 1.0E8d, 0.5d, 100.0d, 1.0E-15d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        double[] doubleArray4 = new double[] { 512.0d, 1.0d, (-1.0d), (byte) 100 };
        double[] doubleArray6 = new double[] { 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        double[] doubleArray4 = new double[] { (short) 10, 0.0f, (-0.0d), 1.0E-10d };
        double[] doubleArray8 = new double[] { (-1.0E10d), 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, (-0.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0E10d), 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        double[] doubleArray3 = new double[] { (byte) 100, (short) 1, 42.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray8 = new double[] { 0.01d, (byte) 1, 0.0d, 10.0d, 1.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray8, doubleArray8);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.01d, 1.0d, 0.0d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        double[] doubleArray2 = new double[] { 0.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        double[] doubleArray2 = new double[] { (-0.0d), 0.70710678d };
        double[] doubleArray4 = new double[] { 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        double[] doubleArray2 = new double[] { 1.0E-12d, (-1L) };
        double[] doubleArray5 = new double[] { 0, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-12d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        double[] doubleArray2 = new double[] { (-0.0d), 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        double[] doubleArray6 = new double[] { 1.0E-12d, 0L, 42.0d, 1.0E-12d, (short) -1, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-12d, 0.0d, 42.0d, 1.0E-12d, (-1.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        double[] doubleArray5 = new double[] { 10.0f, 5.0d, '#', 1000000.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 5.0d, 35.0d, 1000000.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        double[] doubleArray5 = new double[] { (-1.0f), (-1L), 0.5d, (-1.0f), 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 0.5d, (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        double[] doubleArray6 = new double[] { 1.0d, (byte) 10, 1.0E10d, 1024.0d, (-1.0E10d), (short) 1 };
        double[] doubleArray13 = new double[] { '4', 1.0E10d, (-100.0d), (-1.0E10d), 1.0E-15d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 1.0E10d, 1024.0d, (-1.0E10d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 52.0d, 1.0E10d, (-100.0d), (-1.0E10d), 1.0E-15d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        double[] doubleArray1 = new double[] { '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        double[] doubleArray5 = new double[] { (byte) 1, (-10.0d), (-1.0d), 0L, 10.0d };
        double[] doubleArray12 = new double[] { 1.0E-10d, 1.0E-8d, (byte) 10, (-1.0f), 5.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-10.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-10d, 1.0E-8d, 10.0d, (-1.0d), 5.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        double[] doubleArray5 = new double[] { 512.0d, 1.0E-8d, 0.01d, 0.0f, 100 };
        double[] doubleArray7 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray7);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 1.0E-8d, 0.01d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        double[] doubleArray3 = new double[] { 100, (short) 10, 0.70710678d };
        double[] doubleArray5 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray5);
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        double[] doubleArray2 = new double[] { 0.0d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        double[] doubleArray6 = new double[] { 1.0E-6d, 1L, (byte) 100, 0.5d, (-1.0d), (-1) };
        double[] doubleArray13 = new double[] { 1000000.0d, (byte) 10, 10L, 1L, 0, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 1.0d, 100.0d, 0.5d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1000000.0d, 10.0d, 10.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0E10d, 0.1d, 1000000.0d, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, 0.1d, 1000000.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        double[] doubleArray5 = new double[] { 256.0d, (short) 10, (short) -1, 0.25d, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 10.0d, (-1.0d), 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        double[] doubleArray1 = new double[] { 0.3333333d };
        double[] doubleArray4 = new double[] { 10, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        double[] doubleArray5 = new double[] { 0.25d, (-1.0d), 10, 0.1d, 1.0E10d };
        double[] doubleArray8 = new double[] { 2.0d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, (-1.0d), 10.0d, 0.1d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 2.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1L, 0.9d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.9d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        double[] doubleArray3 = new double[] { 1.0E10d, (-1L), (short) 1 };
        double[] doubleArray7 = new double[] { 10.0d, (short) -1, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        double[] doubleArray4 = new double[] { 10, (short) 100, 0.0d, (byte) 0 };
        double[] doubleArray10 = new double[] { (byte) 1, 0.1d, 2.0d, '4', (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.1d, 2.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        double[] doubleArray1 = new double[] { 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        double[] doubleArray1 = new double[] { 256.0d };
        double[] doubleArray7 = new double[] { ' ', 256.0d, 10, 512.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 32.0d, 256.0d, 10.0d, 512.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        double[] doubleArray3 = new double[] { 1L, (-1.0d), (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-1.0f), (short) -1, 0, (short) -1, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), 0.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        double[] doubleArray6 = new double[] { 1.0d, 5.0d, 0.01d, 10.0d, (-1L), 1L };
        double[] doubleArray11 = new double[] { 1.0E10d, 100.0d, 100.0d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 5.0d, 0.01d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E10d, 100.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        double[] doubleArray3 = new double[] { 1.0d, 100.0d, 0.70710678d };
        double[] doubleArray8 = new double[] { 10.0f, (-1.0d), 0.0f, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        double[] doubleArray3 = new double[] { 1.0f, 1.0f, 0.5d };
        double[] doubleArray10 = new double[] { 1.0E10d, (short) 10, 5.0d, 10.0f, 1.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E10d, 10.0d, 5.0d, 10.0d, 1.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        double[] doubleArray4 = new double[] { 1.0E-6d, 100, (-1.0E10d), (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 100.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        double[] doubleArray6 = new double[] { 10000.0d, 1.0E-12d, 1.0E-10d, 0.0f, 0.70710678d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 1.0E-12d, 1.0E-10d, 0.0d, 0.70710678d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        double[] doubleArray6 = new double[] { 0L, 'a', 1.0d, 0.3333333d, (short) 10, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 97.0d, 1.0d, 0.3333333d, 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        double[] doubleArray6 = new double[] { 1.0d, 0L, 100.0f, 1.0E8d, (-1), 1.0f };
        double[] doubleArray8 = new double[] { 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 100.0d, 1.0E8d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        double[] doubleArray6 = new double[] { 10L, 1L, '4', 0.0f, (-1.0d), 0.1d };
        double[] doubleArray13 = new double[] { 10.0f, 0.9d, (short) 100, (-1.0d), 0.25d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 52.0d, 0.0d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.9d, 100.0d, (-1.0d), 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        double[] doubleArray2 = new double[] { ' ', (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0E10d), 0, 0L, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 0.0d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        double[] doubleArray6 = new double[] { 1.0E-12d, (byte) 100, (byte) 0, (-100.0d), (-100.0d), 1.0E-4d };
        double[] doubleArray9 = new double[] { 0.001d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-12d, 100.0d, 0.0d, (-100.0d), (-100.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        double[] doubleArray4 = new double[] { (-100.0d), (-1.0d), (-1.0E10d), 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), (-1.0d), (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, (short) 0, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        double[] doubleArray6 = new double[] { 1.0E-8d, 100.0f, 1024.0d, '#', 100.0f, 0.3333333d };
        double[] doubleArray8 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 100.0d, 1024.0d, 35.0d, 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray3 = new double[] { 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 0L, 0L, 0.70710678d, 10.0d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 0.70710678d, 10.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        double[] doubleArray5 = new double[] { (byte) 1, '4', 0.25d, (byte) -1, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 52.0d, 0.25d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        double[] doubleArray2 = new double[] { (byte) -1, 1.0E-6d };
        double[] doubleArray4 = new double[] { 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        double[] doubleArray3 = new double[] { 'a', 10L, (-1) };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray8 = new double[] { 0.3333333d, 2.0d, 1.0f, 0.001d, (byte) 0, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 2.0d, 1.0d, 0.001d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray7 = new double[] { (-0.0d), (byte) 1, 1.0d, 0.70710678d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-0.0d), 1.0d, 1.0d, 0.70710678d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        double[] doubleArray2 = new double[] { 100, 'a' };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        double[] doubleArray3 = new double[] { 10L, 256.0d, 1.0E-6d };
        double[] doubleArray8 = new double[] { 1.0E-4d, 0.1d, 0.9d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 0.1d, 0.9d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        double[] doubleArray6 = new double[] { 0.9d, 0.01d, (-0.0d), (-1), 5.0d, (short) 1 };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 0.01d, (-0.0d), (-1.0d), 5.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray4 = new double[] { (-1.0d), 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        double[] doubleArray1 = new double[] { 1.0E-8d };
        double[] doubleArray7 = new double[] { (short) -1, 2.0d, 0.0d, 0.1d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 2.0d, 0.0d, 0.1d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { 0.0f, (short) -1, 10.0f, 1.0E-4d, (byte) 100, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 10.0d, 1.0E-4d, 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        double[] doubleArray5 = new double[] { 2.0d, 'a', 1.0E10d, 100L, ' ' };
        double[] doubleArray12 = new double[] { 0.01d, 10L, 256.0d, 10.0d, 1.0d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 97.0d, 1.0E10d, 100.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.01d, 10.0d, 256.0d, 10.0d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        double[] doubleArray2 = new double[] { '#', (byte) 10 };
        double[] doubleArray7 = new double[] { 512.0d, 1.0E-12d, 1, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 512.0d, 1.0E-12d, 1.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        double[] doubleArray3 = new double[] { 10.0f, 10, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        double[] doubleArray6 = new double[] { '#', 100L, 10L, (short) 0, 0.70710678d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 100.0d, 10.0d, 0.0d, 0.70710678d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        double[] doubleArray4 = new double[] { 1.0d, 'a', (short) 0, 1.0E-12d };
        double[] doubleArray7 = new double[] { 1.0E-10d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 97.0d, 0.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        double[] doubleArray6 = new double[] { (short) 10, 1.0E-8d, 1.0E10d, 0.3333333d, 512.0d, 10000.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray13 = new double[] { 0.70710678d, 10000.0d, (byte) 1, 256.0d, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray13);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-8d, 1.0E10d, 0.3333333d, 512.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.70710678d, 10000.0d, 1.0d, 256.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        double[] doubleArray1 = new double[] { 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        double[] doubleArray6 = new double[] { (byte) 100, (byte) -1, 'a', (short) 1, 5.0d, 1.0E8d };
        double[] doubleArray9 = new double[] { (-1.0E10d), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 97.0d, 1.0d, 5.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0E10d), 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        double[] doubleArray3 = new double[] { '4', (byte) 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        double[] doubleArray5 = new double[] { 100, 0.1d, (short) 10, 10.0f, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.1d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        double[] doubleArray2 = new double[] { 1.0d, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        double[] doubleArray3 = new double[] { 256.0d, 10.0f, 10000.0d };
        double[] doubleArray8 = new double[] { 10, 1.0E-10d, (byte) 0, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 10.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0E-10d, 0.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        double[] doubleArray5 = new double[] { 10.0f, 0, 10.0d, (byte) -1, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        double[] doubleArray5 = new double[] { (short) -1, 10.0f, (short) -1, 256.0d, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, (-1.0d), 256.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray7 = new double[] { 0L, 1L, 0.0d, (short) -1, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, 0.0d, (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        double[] doubleArray6 = new double[] { 2.0d, 100.0d, 1, 2.0d, 10, 0.70710678d };
        double[] doubleArray8 = new double[] { 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 100.0d, 1.0d, 2.0d, 10.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        double[] doubleArray6 = new double[] { (-1.0d), (short) 0, 1, 0.0d, 0.25d, 10.0d };
        double[] doubleArray12 = new double[] { 10000.0d, 1000000.0d, 0.25d, 10L, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 1.0d, 0.0d, 0.25d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10000.0d, 1000000.0d, 0.25d, 10.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        double[] doubleArray6 = new double[] { 10.0d, 10.0d, 100L, 0, 512.0d, 0L };
        double[] doubleArray10 = new double[] { (-1.0d), (short) 100, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 100.0d, 0.0d, 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        double[] doubleArray2 = new double[] { 1.0E10d, 100.0d };
        double[] doubleArray8 = new double[] { 1.0d, (byte) 100, (-100.0d), 1L, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 100.0d, (-100.0d), 1.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        double[] doubleArray3 = new double[] { 5.0d, (-0.0d), (byte) -1 };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        double[] doubleArray2 = new double[] { 1.0E8d, 256.0d };
        double[] doubleArray4 = new double[] { 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E8d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        double[] doubleArray1 = new double[] { 1.0E8d };
        double[] doubleArray3 = new double[] { 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        double[] doubleArray2 = new double[] { 1.0E10d, (-1.0E10d) };
        double[] doubleArray4 = new double[] { (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        double[] doubleArray2 = new double[] { 0.001d, 10.0d };
        double[] doubleArray7 = new double[] { 0L, 1.0d, 1.0d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray7, doubleArray7);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        double[] doubleArray6 = new double[] { (-1.0d), 10000.0d, 100, 2.0d, (byte) 100, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10000.0d, 100.0d, 2.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        double[] doubleArray6 = new double[] { (-100.0d), 10L, 1.0E-6d, (-1.0d), 1.0d, (-100.0d) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 10.0d, 1.0E-6d, (-1.0d), 1.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        double[] doubleArray2 = new double[] { 1.0E-12d, 10.0d };
        double[] doubleArray6 = new double[] { (byte) -1, '4', (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        double[] doubleArray4 = new double[] { (byte) 0, 1.0E-4d, (-1.0f), 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0E-4d, (-1.0d), 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        double[] doubleArray2 = new double[] { 5.0d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray5 = new double[] { 5.0d, 0L, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d, 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        double[] doubleArray2 = new double[] { 0L, 0L };
        double[] doubleArray6 = new double[] { 1024.0d, 42.0d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1024.0d, 100, (-100.0d), 2.0d, (-1.0E10d), 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, 100.0d, (-100.0d), 2.0d, (-1.0E10d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        double[] doubleArray4 = new double[] { 1.0d, 1.0E-12d, 0L, 'a' };
        double[] doubleArray10 = new double[] { (-100.0d), 100.0d, (-1.0d), (byte) 100, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-12d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-100.0d), 100.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-0.0d), (byte) 0, 1.0E-15d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 0.0d, 1.0E-15d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        double[] doubleArray4 = new double[] { 1.0d, 256.0d, (-1.0E10d), (byte) -1 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 256.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        double[] doubleArray2 = new double[] { 100.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        double[] doubleArray4 = new double[] { ' ', (-10.0d), 0.9d, (short) -1 };
        double[] doubleArray8 = new double[] { 1.0E-10d, (byte) 10, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, (-10.0d), 0.9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        double[] doubleArray5 = new double[] { 0.1d, (-1L), 42.0d, 100.0f, (-1.0d) };
        double[] doubleArray7 = new double[] { 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, (-1.0d), 42.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        double[] doubleArray6 = new double[] { 1000000.0d, '4', 1, 100L, 1.0E-8d, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 52.0d, 1.0d, 100.0d, 1.0E-8d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        double[] doubleArray2 = new double[] { (byte) -1, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        double[] doubleArray3 = new double[] { (byte) -1, 1.0f, 512.0d };
        double[] doubleArray7 = new double[] { 1.0E-8d, 100L, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-8d, 100.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        double[] doubleArray2 = new double[] { 1.0E-6d, 1.0E-4d };
        double[] doubleArray4 = new double[] { 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d }, 1.0E-15);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        double[] doubleArray6 = new double[] { 1.0E-6d, 100L, 5.0d, (short) 1, (byte) 1, (short) 1 };
        double[] doubleArray11 = new double[] { 1.0E-15d, (-1.0E10d), 1.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 100.0d, 5.0d, 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-15d, (-1.0E10d), 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        double[] doubleArray6 = new double[] { 0.001d, (short) 1, 256.0d, 1.0E-8d, 10000.0d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0d, 256.0d, 1.0E-8d, 10000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        double[] doubleArray4 = new double[] { 100L, 100, (byte) -1, 1.0E-12d };
        double[] doubleArray10 = new double[] { 1.0E8d, 0.0f, 1.0E-10d, 10, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E8d, 0.0d, 1.0E-10d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        double[] doubleArray5 = new double[] { 1.0E-15d, (-1.0f), (-1.0E10d), ' ', (-1.0d) };
        double[] doubleArray9 = new double[] { 1.0f, 1.0E8d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, (-1.0d), (-1.0E10d), 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0E8d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        double[] doubleArray3 = new double[] { (byte) 1, 100L, 0.5d };
        double[] doubleArray6 = new double[] { 0.0f, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        double[] doubleArray3 = new double[] { (short) 10, 10, 10000.0d };
        double[] doubleArray10 = new double[] { 100, (-1.0d), 10000.0d, 0.70710678d, 1.0E-4d, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 10000.0d, 0.70710678d, 1.0E-4d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        double[] doubleArray2 = new double[] { (-1.0E10d), 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        double[] doubleArray6 = new double[] { 100.0d, (-10.0d), 1.0E-6d, 10, 0.9d, 100.0d };
        double[] doubleArray9 = new double[] { 1.0E-4d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-10.0d), 1.0E-6d, 10.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray6 = new double[] { 10.0d, 0L, (-1.0E10d), 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-8d, 512.0d, 42.0d, 1.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-8d, 512.0d, 42.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        double[] doubleArray5 = new double[] { (-100.0d), 2.0d, (byte) 100, 1, (-1.0d) };
        double[] doubleArray12 = new double[] { 5.0d, 1.0E-12d, 2.0d, (-0.0d), 10000.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 2.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 5.0d, 1.0E-12d, 2.0d, (-0.0d), 10000.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        double[] doubleArray4 = new double[] { (short) 10, (byte) 100, (-100.0d), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        double[] doubleArray5 = new double[] { 0L, 1.0f, (-1.0d), 100, 1.0E8d };
        double[] doubleArray10 = new double[] { 0.0f, 1.0E-15d, 0.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, (-1.0d), 100.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0E-15d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        double[] doubleArray6 = new double[] { 42.0d, 100.0f, (-1), 1024.0d, 10, (short) -1 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 100.0d, (-1.0d), 1024.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        double[] doubleArray3 = new double[] { (-1.0d), 0, 42.0d };
        double[] doubleArray9 = new double[] { (byte) 0, 1.0E-6d, 256.0d, (short) 10, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray9, doubleArray9);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-6d, 256.0d, 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        double[] doubleArray2 = new double[] { 1.0E-6d, (byte) 100 };
        double[] doubleArray4 = new double[] { 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        double[] doubleArray6 = new double[] { (byte) 1, 0L, (-1.0d), 100.0d, 0.3333333d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, (-1.0d), 100.0d, 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        double[] doubleArray1 = new double[] { 1.0E-15d };
        double[] doubleArray3 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        double[] doubleArray1 = new double[] { 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        double[] doubleArray3 = new double[] { (-1.0d), (-1.0f), 10.0d };
        double[] doubleArray10 = new double[] { 10.0d, 0.5d, '4', (-1L), ' ', 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.5d, 52.0d, (-1.0d), 32.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray3 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        double[] doubleArray6 = new double[] { (-10.0d), 10.0d, (-1.0d), 256.0d, (short) -1, 0.1d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d), 10.0d, (-1.0d), 256.0d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        double[] doubleArray5 = new double[] { (-100.0d), 2.0d, (byte) 100, 1, (-1.0d) };
        double[] doubleArray12 = new double[] { 5.0d, 1.0E-12d, 2.0d, (-0.0d), 10000.0d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 2.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 5.0d, 1.0E-12d, 2.0d, (-0.0d), 10000.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        double[] doubleArray3 = new double[] { (short) 10, 1.0E10d, (short) 1 };
        double[] doubleArray8 = new double[] { 0L, 1.0E-15d, (byte) -1, 0.3333333d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0E-15d, (-1.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        double[] doubleArray6 = new double[] { (short) 1, (-1.0d), 10000.0d, (-1L), 0.70710678d, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 10000.0d, (-1.0d), 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        double[] doubleArray5 = new double[] { 10, (short) -1, 1.0f, 0.01d, (short) 0 };
        double[] doubleArray11 = new double[] { 10.0d, 100.0f, 10L, (-10.0d), 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 1.0d, 0.01d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 100.0d, 10.0d, (-10.0d), 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 100, 256.0d, 256.0d, (-1.0d), (short) 100 };
        double[] doubleArray11 = new double[] { 0, 0.70710678d, 100.0f, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 256.0d, 256.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 0.70710678d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        double[] doubleArray5 = new double[] { (byte) -1, 2.0d, 1.0E-12d, 1.0E-6d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 2.0d, 1.0E-12d, 1.0E-6d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        double[] doubleArray6 = new double[] { 42.0d, 1.0E10d, 256.0d, (short) 10, 0L, 1000000.0d };
        double[] doubleArray13 = new double[] { 'a', 1, 100L, (-100.0d), 0.0d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 1.0E10d, 256.0d, 10.0d, 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 97.0d, 1.0d, 100.0d, (-100.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        double[] doubleArray4 = new double[] { 100.0d, 1.0E10d, (short) 100, 1.0E-10d };
        double[] doubleArray9 = new double[] { 0L, 0.5d, 1024.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E10d, 100.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.5d, 1024.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        double[] doubleArray5 = new double[] { 256.0d, 1024.0d, ' ', 100.0d, (-1.0d) };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 1024.0d, 32.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        double[] doubleArray3 = new double[] { 5.0d, (byte) 100, 'a' };
        double[] doubleArray10 = new double[] { 256.0d, 1.0E10d, 100.0d, (short) 0, 1.0E-4d, 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, 1.0E10d, 100.0d, 0.0d, 1.0E-4d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        double[] doubleArray6 = new double[] { 0.5d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        double[] doubleArray1 = new double[] { 1.0E-15d };
        double[] doubleArray5 = new double[] { 1.0E-4d, (short) -1, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray8 = new double[] { (byte) -1, 100L, 5.0d, 100L, 0L, (-1) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 100.0d, 5.0d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] { 10.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        double[] doubleArray4 = new double[] { '4', 512.0d, (byte) 0, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 512.0d, 0.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 100, 1000000.0d, 1000000.0d, (-1), (byte) 1, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1000000.0d, 1000000.0d, (-1.0d), 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        double[] doubleArray6 = new double[] { 2.0d, (-100.0d), ' ', 100L, 10000.0d, 0.001d };
        double[] doubleArray9 = new double[] { 1.0d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, (-100.0d), 32.0d, 100.0d, 10000.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        double[] doubleArray2 = new double[] { 512.0d, 0.0f };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        double[] doubleArray6 = new double[] { (-1.0d), 0, (short) 1, 1.0E-8d, (-100.0d), 100L };
        double[] doubleArray11 = new double[] { 1.0E-6d, (short) 1, (short) 100, (short) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 1.0d, 1.0E-8d, (-100.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        double[] doubleArray2 = new double[] { '4', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        double[] doubleArray6 = new double[] { (-0.0d), 512.0d, 0.1d, 10.0f, 100.0d, 5.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 512.0d, 0.1d, 10.0d, 100.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        double[] doubleArray4 = new double[] { (-100.0d), 1, 1.0d, 0.5d };
        double[] doubleArray9 = new double[] { 1, (-100.0d), 1L, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 1.0d, 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-100.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1.0E-15d };
        double[] doubleArray9 = new double[] { 0.0d, 10.0d, 1.0E10d, (-10.0d), 1.0E-12d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 10.0d, 1.0E10d, (-10.0d), 1.0E-12d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-10.0d), 1.0d, 1024.0d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 1.0d, 1024.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        double[] doubleArray6 = new double[] { 1.0d, 'a', 0L, 10000.0d, 10, (byte) -1 };
        double[] doubleArray12 = new double[] { (short) 0, 0.1d, 0.9d, 0.9d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 97.0d, 0.0d, 10000.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.1d, 0.9d, 0.9d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        double[] doubleArray4 = new double[] { (-0.0d), 0.1d, 100.0d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-0.0d), 0.1d, 100.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        double[] doubleArray4 = new double[] { 10.0d, 0.1d, 1.0E8d, (short) 100 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.1d, 1.0E8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray4 = new double[] { 0.1d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        double[] doubleArray3 = new double[] { (-1.0E10d), 0.25d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 0.25d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        double[] doubleArray5 = new double[] { (short) 1, (byte) 100, (-0.0d), 42.0d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, (-0.0d), 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        double[] doubleArray4 = new double[] { 100.0d, 0.01d, 512.0d, 1.0d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.01d, 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        double[] doubleArray2 = new double[] { 0.1d, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        double[] doubleArray5 = new double[] { 0.1d, 0.25d, 0.01d, (-1), 2.0d };
        double[] doubleArray9 = new double[] { 100.0d, 0.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 0.25d, 0.01d, (-1.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        double[] doubleArray5 = new double[] { (-1.0E10d), 10.0d, 10.0d, (byte) -1, '#' };
        double[] doubleArray11 = new double[] { 10, 0.9d, (-1L), 10.0d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d, 10.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.9d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        double[] doubleArray3 = new double[] { 10000.0d, 1.0E-10d, 42.0d };
        double[] doubleArray8 = new double[] { 1.0d, 2.0d, 0.5d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 1.0E-10d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 2.0d, 0.5d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        double[] doubleArray2 = new double[] { 5.0d, 1.0E-6d };
        double[] doubleArray7 = new double[] { (-100.0d), 1.0f, 10000.0d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-100.0d), 1.0d, 10000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-100.0d), (short) 100, 10L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        double[] doubleArray6 = new double[] { 1, 2.0d, 0.3333333d, (byte) 0, 2.0d, 2.0d };
        double[] doubleArray8 = new double[] { (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 2.0d, 0.3333333d, 0.0d, 2.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        double[] doubleArray5 = new double[] { 0.0f, 0.25d, (-100.0d), 100.0f, (-10.0d) };
        double[] doubleArray8 = new double[] { 1.0E-4d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.25d, (-100.0d), 100.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { 1.0f, 0.9d, (-1.0d), 1.0E-12d, 1000000.0d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.9d, (-1.0d), 1.0E-12d, 1000000.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        double[] doubleArray3 = new double[] { 10, 10.0d, 1.0E-15d };
        double[] doubleArray10 = new double[] { (-0.0d), 0.01d, 1.0E10d, 100.0d, 1L, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-0.0d), 0.01d, 1.0E10d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        double[] doubleArray2 = new double[] { '#', 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        double[] doubleArray3 = new double[] { 1.0d, 0.001d, (-1.0d) };
        double[] doubleArray10 = new double[] { 10.0d, 1.0E-12d, (byte) 10, 100L, (-1.0E10d), (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0E-12d, 10.0d, 100.0d, (-1.0E10d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        double[] doubleArray2 = new double[] { 100L, 10L };
        double[] doubleArray7 = new double[] { 100.0d, 1.0f, 10000.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0d, 10000.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        double[] doubleArray2 = new double[] { (-1.0f), 5.0d };
        double[] doubleArray8 = new double[] { 10.0d, (byte) 10, 10.0f, 256.0d, 100L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d, 10.0d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        double[] doubleArray4 = new double[] { '#', 0.25d, 1.0E-12d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 0.25d, 1.0E-12d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        double[] doubleArray6 = new double[] { 0.25d, 1.0E-6d, 10.0d, (short) 1, (short) 10, 10000.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 1.0E-6d, 10.0d, 1.0d, 10.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 1, 42.0d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        double[] doubleArray5 = new double[] { (short) 10, 'a', 1.0E8d, 2.0d, 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 1.0E8d, 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        double[] doubleArray5 = new double[] { 1.0f, (-1.0E10d), 10, 1.0f, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0E10d), 10.0d, 1.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray7 = new double[] { 0.5d, 1.0E-6d, 1.0f, (-100.0d), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, 1.0E-6d, 1.0d, (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        double[] doubleArray2 = new double[] { 0.1d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        double[] doubleArray3 = new double[] { 100.0f, (byte) -1, 1.0E-4d };
        double[] doubleArray10 = new double[] { (-10.0d), 0.0f, (-100.0d), 256.0d, 1.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-10.0d), 0.0d, (-100.0d), 256.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0E10d), 10, 1.0d, 1.0E-8d, 2.0d, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), 10.0d, 1.0d, 1.0E-8d, 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        double[] doubleArray6 = new double[] { 0.001d, 1.0E-6d, (short) 1, (short) 100, (byte) 1, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0E-6d, 1.0d, 100.0d, 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, 1.0E-10d, 0.0f, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-10d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 42.0d, 10.0f, 1.0E10d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 10.0d, 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray5 = new double[] { 1.0d, (short) 10, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        double[] doubleArray6 = new double[] { 10.0d, 42.0d, (byte) 1, 0.9d, 1.0E-10d, (short) 1 };
        double[] doubleArray11 = new double[] { 0.01d, 100L, 0.70710678d, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 42.0d, 1.0d, 0.9d, 1.0E-10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.01d, 100.0d, 0.70710678d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        double[] doubleArray5 = new double[] { '4', (short) 0, (byte) 1, 1.0E-10d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 0.0d, 1.0d, 1.0E-10d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        double[] doubleArray2 = new double[] { 0.001d, 10000.0d };
        double[] doubleArray9 = new double[] { 0.70710678d, 1, (-1.0d), (byte) 10, 1, '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 1.0d, (-1.0d), 10.0d, 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        double[] doubleArray4 = new double[] { 10.0d, 1.0d, 1.0E-12d, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray6 = new double[] { 1.0E-15d, 0L, 1.0E-4d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d, 0.0d, 1.0E-4d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        double[] doubleArray4 = new double[] { (-1.0d), 1.0E8d, 0.5d, 0.9d };
        double[] doubleArray7 = new double[] { 'a', 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0E8d, 0.5d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 97.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        double[] doubleArray4 = new double[] { 100.0d, 100, 10.0d, 5.0d };
        double[] doubleArray8 = new double[] { 'a', 0.0f, 1.0E-10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        double[] doubleArray3 = new double[] { 1, 1.0f, 100.0d };
        double[] doubleArray9 = new double[] { 100L, 0.25d, 256.0d, (short) 0, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.25d, 256.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        double[] doubleArray3 = new double[] { 10.0d, 256.0d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        double[] doubleArray3 = new double[] { 256.0d, 0.3333333d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 0.3333333d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        double[] doubleArray4 = new double[] { ' ', 1.0d, 1.0E-6d, 0.9d };
        double[] doubleArray10 = new double[] { 1.0E-10d, 1.0E10d, 0.9d, (byte) 0, 42.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1.0d, 1.0E-6d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 1.0E10d, 0.9d, 0.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        double[] doubleArray3 = new double[] { (-1.0d), 0.3333333d, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.3333333d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        double[] doubleArray6 = new double[] { 42.0d, (short) -1, (-1L), 512.0d, 1.0f, 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, (-1.0d), (-1.0d), 512.0d, 1.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E8d, 0.70710678d, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 0.70710678d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.5d, 1.0E10d, 10000.0d, 0.5d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 1.0E10d, 10000.0d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1L, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, (byte) 0, 1000000.0d, (byte) -1, 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, 1000000.0d, (-1.0d), 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        double[] doubleArray4 = new double[] { 0.25d, (byte) 0, ' ', '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 0.0d, 32.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        double[] doubleArray6 = new double[] { 0.01d, (-1), 1.0E-6d, (short) 10, (short) 0, 0.5d };
        double[] doubleArray11 = new double[] { (-1.0E10d), 42.0d, 100.0f, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, (-1.0d), 1.0E-6d, 10.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0E10d), 42.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray7 = new double[] { 1.0E-10d, ' ', (-1.0E10d), 1.0E10d, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 32.0d, (-1.0E10d), 1.0E10d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        double[] doubleArray3 = new double[] { 1.0E-15d, (byte) -1, 1.0E-12d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        double[] doubleArray6 = new double[] { (short) -1, 0.25d, 5.0d, (short) 1, 1, (byte) 10 };
        double[] doubleArray10 = new double[] { ' ', 1024.0d, 1.0E-15d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.25d, 5.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 1024.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        double[] doubleArray6 = new double[] { 1.0E10d, 100.0f, (-1.0E10d), 10000.0d, 'a', (short) 10 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 100.0d, (-1.0E10d), 10000.0d, 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        double[] doubleArray4 = new double[] { 0.3333333d, (-1.0d), 1024.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.3333333d, (-1.0d), 1024.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        double[] doubleArray5 = new double[] { 1.0E8d, 0.1d, 0.1d, 1, 10000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, 0.1d, 0.1d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0f, 0.25d, (-10.0d), 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.25d, (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        double[] doubleArray3 = new double[] { 256.0d, 1024.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 1024.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        double[] doubleArray6 = new double[] { '#', 0, (byte) 1, 5.0d, 10, (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d, 1.0d, 5.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0E8d, (short) 10, '4', (byte) 1, (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 10.0d, 52.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        double[] doubleArray4 = new double[] { 10.0d, (-1L), 10L, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        double[] doubleArray3 = new double[] { (short) 1, 1, 1.0E-6d };
        double[] doubleArray7 = new double[] { 0.0d, 1024.0d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1024.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        double[] doubleArray5 = new double[] { (-1.0f), (-1L), 0L, 0.01d, (byte) 0 };
        double[] doubleArray9 = new double[] { (short) -1, 0.5d, 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 0.0d, 0.01d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.5d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        double[] doubleArray2 = new double[] { (-100.0d), 1.0E-10d };
        double[] doubleArray9 = new double[] { 1L, (byte) 1, 256.0d, 1.0d, (short) -1, (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 1.0d, 256.0d, 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        double[] doubleArray6 = new double[] { (byte) 1, 1.0E-4d, 1024.0d, 100.0d, '#', (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0E-4d, 1024.0d, 100.0d, 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        double[] doubleArray3 = new double[] { 256.0d, 1.0E-15d, 5.0d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 1.0E-15d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 100L, 42.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 42.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        double[] doubleArray6 = new double[] { (short) 0, (-0.0d), 10, (-1.0d), (short) 10, (-1) };
        double[] doubleArray13 = new double[] { 100.0d, 1.0E-6d, 1.0d, 1024.0d, 1000000.0d, 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-0.0d), 10.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 1.0E-6d, 1.0d, 1024.0d, 1000000.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        double[] doubleArray2 = new double[] { 100.0f, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.5d, 1.0E10d, 10000.0d, 0.5d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 1.0E10d, 10000.0d, 0.5d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        double[] doubleArray2 = new double[] { '4', (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        double[] doubleArray5 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        double[] doubleArray2 = new double[] { 1024.0d, (byte) 100 };
        double[] doubleArray5 = new double[] { 0.1d, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        double[] doubleArray2 = new double[] { 0.01d, (-1.0E10d) };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0E8d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0E8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        double[] doubleArray6 = new double[] { 0.70710678d, 100, (-1.0E10d), 0.0d, 0.0d, (-1L) };
        double[] doubleArray10 = new double[] { 42.0d, 0.70710678d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.70710678d, 100.0d, (-1.0E10d), 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 42.0d, 0.70710678d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        double[] doubleArray4 = new double[] { ' ', 'a', 100.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 97.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        double[] doubleArray5 = new double[] { 10.0d, 1.0E-12d, (-1.0d), 1.0E-8d, (-1.0E10d) };
        double[] doubleArray11 = new double[] { 42.0d, (byte) 0, ' ', '#', 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-12d, (-1.0d), 1.0E-8d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 42.0d, 0.0d, 32.0d, 35.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        double[] doubleArray6 = new double[] { 0.3333333d, (-1), (-0.0d), (-10.0d), (byte) 10, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, (-1.0d), (-0.0d), (-10.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        double[] doubleArray1 = new double[] { 0.5d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        double[] doubleArray5 = new double[] { 100L, 10, 100.0d, 1.0E-12d, 1.0E-8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 100.0d, 1.0E-12d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0E-10d, (short) 100, 1.0E-6d, 0L, 100.0d, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 100.0d, 1.0E-6d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        double[] doubleArray4 = new double[] { 'a', (-1.0E10d), (-1.0E10d), 10000.0d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, (-1.0E10d), (-1.0E10d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        double[] doubleArray2 = new double[] { 512.0d, 0L };
        double[] doubleArray6 = new double[] { (short) -1, (byte) 10, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        double[] doubleArray3 = new double[] { '4', (byte) 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        double[] doubleArray2 = new double[] { 0.9d, 0L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        double[] doubleArray3 = new double[] { (-1), 0L, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        double[] doubleArray3 = new double[] { 1.0E-15d, (-1L), 0.3333333d };
        double[] doubleArray9 = new double[] { (-1.0d), 1.0E-15d, 1.0E8d, 0.25d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, (-1.0d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 1.0E-15d, 1.0E8d, 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        double[] doubleArray6 = new double[] { 42.0d, 1.0E-12d, ' ', 100.0d, 1, 0L };
        double[] doubleArray12 = new double[] { 1.0E-15d, 10.0f, 1.0E-15d, 10.0f, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 1.0E-12d, 32.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-15d, 10.0d, 1.0E-15d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        double[] doubleArray2 = new double[] { (-1.0d), 1.0E-15d };
        double[] doubleArray9 = new double[] { 100.0f, 42.0d, 1.0f, 1L, 1000000.0d, 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 42.0d, 1.0d, 1.0d, 1000000.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray5 = new double[] { 0.70710678d, 42.0d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.70710678d, 42.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        double[] doubleArray4 = new double[] { 1.0E10d, (byte) 0, (byte) 0, '4' };
        double[] doubleArray9 = new double[] { '4', 1.0E-6d, 1, 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 0.0d, 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 1.0E-6d, 1.0d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        double[] doubleArray1 = new double[] { 1024.0d };
        double[] doubleArray8 = new double[] { 1L, 0L, 1L, 0.0d, 100, 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, 1.0d, 0.0d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        double[] doubleArray3 = new double[] { (byte) 1, 100.0d, (-100.0d) };
        double[] doubleArray9 = new double[] { 1.0E-4d, 1.0E10d, 0.3333333d, (-100.0d), 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, 1.0E10d, 0.3333333d, (-100.0d), 0.1d }, 1.0E-15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.5d, 0.3333333d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.3333333d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 512.0d, (byte) 0, 1.0E10d, 2.0d, 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 0.0d, 1.0E10d, 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        double[] doubleArray6 = new double[] { 1.0E-6d, 10L, 42.0d, 10.0f, (-0.0d), (-100.0d) };
        double[] doubleArray13 = new double[] { 0.25d, (-1.0d), 1.0E-12d, (short) 0, 2.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 10.0d, 42.0d, 10.0d, (-0.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.25d, (-1.0d), 1.0E-12d, 0.0d, 2.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        double[] doubleArray5 = new double[] { 10.0d, 1.0E-12d, (-1.0d), 1.0E-8d, (-1.0E10d) };
        double[] doubleArray11 = new double[] { 42.0d, (byte) 0, ' ', '#', 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-12d, (-1.0d), 1.0E-8d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 42.0d, 0.0d, 32.0d, 35.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-15d, 1000000.0d, 1.0E10d, (byte) -1 };
        double[] doubleArray7 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-15d, 1000000.0d, 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        double[] doubleArray5 = new double[] { 1.0E10d, (-1.0f), 1.0E-4d, (short) -1, 1.0E-12d };
        double[] doubleArray12 = new double[] { (-1L), (byte) 1, 0, 10000.0d, (-1.0d), (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, (-1.0d), 1.0E-4d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 0.0d, 10000.0d, (-1.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        double[] doubleArray1 = new double[] { 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray8 = new double[] { (byte) 0, 256.0d, (byte) 10, (byte) -1, 100L, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 256.0d, 10.0d, (-1.0d), 100.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        double[] doubleArray5 = new double[] { 100.0d, 1000000.0d, 'a', (-1.0f), 1024.0d };
        double[] doubleArray7 = new double[] { 0.70710678d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1000000.0d, 97.0d, (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-4d, 1024.0d, 1024.0d, (short) 100, 1.0f, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-4d, 1024.0d, 1024.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) 0, ' ', 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        double[] doubleArray3 = new double[] { 1, 1.0E10d, 1.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0E10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 512.0d, 0.01d, 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 0.01d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        double[] doubleArray6 = new double[] { 1.0E-8d, 1.0E-8d, '#', (-1.0E10d), 0.1d, 1.0E-8d };
        double[] doubleArray10 = new double[] { 5.0d, (short) 0, 0.001d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 1.0E-8d, 35.0d, (-1.0E10d), 0.1d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 5.0d, 0.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        double[] doubleArray2 = new double[] { 0.0d, ' ' };
        double[] doubleArray6 = new double[] { 1.0f, 0.70710678d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.70710678d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        double[] doubleArray3 = new double[] { (-0.0d), 10L, 10L };
        double[] doubleArray9 = new double[] { 0.70710678d, 1.0E-12d, (-1L), 1.0E-12d, 1.0E-6d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 1.0E-12d, (-1.0d), 1.0E-12d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        double[] doubleArray5 = new double[] { 1024.0d, 0.25d, 1.0E-4d, 1, (-1.0d) };
        double[] doubleArray7 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 0.25d, 1.0E-4d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        double[] doubleArray2 = new double[] { 10L, 10000.0d };
        double[] doubleArray8 = new double[] { 1.0d, (-1), 1.0E8d, 1.0E-4d, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 1.0E8d, 1.0E-4d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        double[] doubleArray3 = new double[] { (short) 100, (short) 0, (byte) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.0d, ' ', 0.70710678d, 0.3333333d, (byte) 0, 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 32.0d, 0.70710678d, 0.3333333d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        double[] doubleArray3 = new double[] { 1L, 10, (-1L) };
        double[] doubleArray6 = new double[] { 10.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        double[] doubleArray5 = new double[] { 10.0f, 1, 0.0f, 100, '4' };
        double[] doubleArray7 = new double[] { 1.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 0.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0d, (-0.0d), (short) 0, 100.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-0.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        double[] doubleArray5 = new double[] { 'a', (-1L), 0.1d, 256.0d, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 0, 0.9d, 0.0d, (-1), 1000000.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, (-1.0d), 0.1d, 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.9d, 0.0d, (-1.0d), 1000000.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        double[] doubleArray3 = new double[] { 1L, (-1.0E10d), 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0E10d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        double[] doubleArray4 = new double[] { 0, 0.01d, 0.0f, (byte) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.01d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        double[] doubleArray4 = new double[] { 512.0d, ' ', 512.0d, 1.0E-6d };
        double[] doubleArray11 = new double[] { (byte) 100, 512.0d, 10.0d, (-0.0d), 0.0d, 1L };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 32.0d, 512.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 512.0d, 10.0d, (-0.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        double[] doubleArray5 = new double[] { 42.0d, 0.01d, 256.0d, 1.0E10d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 0.01d, 256.0d, 1.0E10d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        double[] doubleArray4 = new double[] { 100.0f, (short) 1, 0.0d, (-1L) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double[] doubleArray6 = new double[] { (-1L), 10.0d, (byte) 0, 10.0f, 5.0d, 10.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 0.0d, 10.0d, 5.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        double[] doubleArray5 = new double[] { 1.0E-12d, (short) 100, 'a', 100.0f, (byte) 100 };
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 100.0d, 97.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        double[] doubleArray1 = new double[] { 0.70710678d };
        double[] doubleArray6 = new double[] { 1000000.0d, (-1.0E10d), 10L, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, (-1.0E10d), 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        double[] doubleArray2 = new double[] { (-1.0E10d), 512.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        double[] doubleArray1 = new double[] { 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 256.0d }, 1.0E-15);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        double[] doubleArray6 = new double[] { 100.0f, 1.0d, 1.0E-15d, 100.0f, 42.0d, 0.0f };
        double[] doubleArray9 = new double[] { 1, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 1.0E-15d, 100.0d, 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        double[] doubleArray4 = new double[] { (short) -1, (-0.0d), (byte) 0, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-0.0d), 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        double[] doubleArray5 = new double[] { '#', 10, 0.5d, 0, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 10.0d, 0.5d, 0.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        double[] doubleArray3 = new double[] { (short) -1, 1000000.0d, (byte) 0 };
        double[] doubleArray9 = new double[] { 0.001d, '#', 1.0f, 10.0d, 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1000000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 35.0d, 1.0d, 10.0d, 0.5d }, 1.0E-15);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        double[] doubleArray6 = new double[] { 0.25d, '#', 1, 0.3333333d, 1, (byte) 1 };
        double[] doubleArray13 = new double[] { 0.0f, 100.0d, (-1), 0.5d, 1.0E-8d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 35.0d, 1.0d, 0.3333333d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 100.0d, (-1.0d), 0.5d, 1.0E-8d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        double[] doubleArray4 = new double[] { 0.5d, 0.01d, 1.0d, 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.01d, 1.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        double[] doubleArray3 = new double[] { '4', 1.0E-6d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 1.0E-6d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        double[] doubleArray3 = new double[] { 1.0E-10d, (byte) 0, 1.0E10d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 0.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        double[] doubleArray6 = new double[] { 0.001d, 10.0d, 1.0E-12d, (-1.0d), 10000.0d, '4' };
        double[] doubleArray9 = new double[] { (byte) 10, (byte) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 10.0d, 1.0E-12d, (-1.0d), 10000.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        double[] doubleArray6 = new double[] { 256.0d, (short) 0, 0.70710678d, 1.0f, '4', 1.0E-8d };
        double[] doubleArray9 = new double[] { (byte) 10, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 0.0d, 0.70710678d, 1.0d, 52.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { 0.5d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        double[] doubleArray4 = new double[] { 2.0d, 0.5d, (short) 100, 0.70710678d };
        double[] doubleArray8 = new double[] { 100.0d, (byte) 1, '#' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 0.5d, 100.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        double[] doubleArray6 = new double[] { (byte) -1, 10.0f, '4', (-1.0E10d), '#', 0.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 52.0d, (-1.0E10d), 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        double[] doubleArray5 = new double[] { (short) 0, 1L, 0.5d, (-1.0d), 1L };
        double[] doubleArray10 = new double[] { 0.001d, 10.0d, (short) -1, 0.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 0.5d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.001d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        double[] doubleArray3 = new double[] { (short) -1, 1.0E-6d, (-100.0d) };
        double[] doubleArray9 = new double[] { (byte) 100, 42.0d, 1.0E-15d, 100.0d, 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0E-6d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 42.0d, 1.0E-15d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        double[] doubleArray6 = new double[] { 0.001d, 1.0E-10d, 100.0f, 100, (byte) 1, (byte) 0 };
        double[] doubleArray9 = new double[] { 10.0d, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0E-10d, 100.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        double[] doubleArray3 = new double[] { 1.0f, 0.0d, (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        double[] doubleArray2 = new double[] { 10L, 0.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        double[] doubleArray5 = new double[] { '#', 1L, 1.0E-10d, 512.0d, 1000000.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 1.0d, 1.0E-10d, 512.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        double[] doubleArray6 = new double[] { (-100.0d), 10000.0d, (byte) -1, 10.0f, (-1), 0.5d };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 10000.0d, (-1.0d), 10.0d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { (short) 10, (-100.0d), 10, (byte) -1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-100.0d), 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        double[] doubleArray5 = new double[] { 100L, 0.01d, 0.01d, 10.0f, (-10.0d) };
        double[] doubleArray8 = new double[] { (-1), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.01d, 0.01d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.01d, 0.1d, 1.0d, (-1.0d), 100.0f };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.1d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray6 = new double[] { (-1L), 100.0f, (-10.0d), '4' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d, (-10.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        double[] doubleArray2 = new double[] { (-1.0d), 0.01d };
        double[] doubleArray6 = new double[] { 1.0d, 1, ' ' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        double[] doubleArray6 = new double[] { 256.0d, 5.0d, 'a', 1.0E-6d, 0.3333333d, 1.0E8d };
        double[] doubleArray11 = new double[] { 0, 'a', 0.25d, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 5.0d, 97.0d, 1.0E-6d, 0.3333333d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 97.0d, 0.25d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        double[] doubleArray4 = new double[] { 100L, '4', 10.0d, 256.0d };
        double[] doubleArray10 = new double[] { 0, 0.01d, 0L, 1.0d, 0.01d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 52.0d, 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.01d, 0.0d, 1.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        double[] doubleArray5 = new double[] { 100L, 0.01d, 0.01d, 10.0f, (-10.0d) };
        double[] doubleArray8 = new double[] { (-1), (-1.0f) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.01d, 0.01d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray6 = new double[] { 0.9d, 1.0E-4d, 0.001d, 1.0E10d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 1.0E-4d, 0.001d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        double[] doubleArray6 = new double[] { 42.0d, (-1.0E10d), (short) -1, 0.01d, 0, 0.1d };
        double[] doubleArray8 = new double[] { (short) 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, (-1.0E10d), (-1.0d), 0.01d, 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        double[] doubleArray5 = new double[] { 10000.0d, 1L, 1.0E-10d, 5.0d, (short) -1 };
        double[] doubleArray8 = new double[] { 0.0d, 5.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, 1.0d, 1.0E-10d, 5.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        double[] doubleArray3 = new double[] { 'a', 2.0d, 10L };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        double[] doubleArray2 = new double[] { (short) 0, '#' };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        double[] doubleArray1 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        double[] doubleArray6 = new double[] { 0.3333333d, (byte) 0, 1024.0d, 100L, 10.0d, 1.0E8d };
        double[] doubleArray12 = new double[] { 0.001d, 0.0d, (byte) 100, 0.001d, (-100.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, 0.0d, 1024.0d, 100.0d, 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.001d, 0.0d, 100.0d, 0.001d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        double[] doubleArray5 = new double[] { 0.0d, 5.0d, 1.0d, 0.25d, 0.5d };
        double[] doubleArray9 = new double[] { (byte) 1, 0.70710678d, 10 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 5.0d, 1.0d, 0.25d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0d, '#', ' ', 0.1d, (-1.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 35.0d, 32.0d, 0.1d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        double[] doubleArray5 = new double[] { 0, 1, (-10.0d), 42.0d, 0.25d };
        double[] doubleArray11 = new double[] { 2.0d, 100L, 10, 1.0E-8d, (byte) 0 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, (-10.0d), 42.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 100.0d, 10.0d, 1.0E-8d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        double[] doubleArray6 = new double[] { (-1.0E10d), 'a', 1.0d, 0.0d, (short) 1, 1.0E-12d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 97.0d, 1.0d, 0.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        double[] doubleArray6 = new double[] { (byte) 10, 2.0d, (-1.0d), 10000.0d, (-10.0d), (short) 1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 2.0d, (-1.0d), 10000.0d, (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        double[] doubleArray6 = new double[] { 10.0d, ' ', (byte) 1, 1, (-0.0d), 1.0E-10d };
        double[] doubleArray13 = new double[] { 1.0d, 1, 1.0E-8d, 1.0E8d, '#', (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 32.0d, 1.0d, 1.0d, (-0.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d, 1.0E-8d, 1.0E8d, 35.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        double[] doubleArray3 = new double[] { (-1), 0.70710678d, 0.9d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        double[] doubleArray10 = new double[] { 'a', 1.0E-10d, 1.0E10d, 512.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.70710678d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 97.0d, 1.0E-10d, 1.0E10d, 512.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        double[] doubleArray4 = new double[] { 100L, (byte) 1, ' ', 'a' };
        double[] doubleArray11 = new double[] { 2.0d, 0.9d, 10.0d, 1024.0d, (-100.0d), (short) 100 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 32.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 2.0d, 0.9d, 10.0d, 1024.0d, (-100.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        double[] doubleArray5 = new double[] { 1.0E-10d, 1.0E10d, 1.0d, (-10.0d), (-1.0E10d) };
        double[] doubleArray11 = new double[] { 1.0E10d, 1.0d, ' ', (-0.0d), 1.0E-4d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 1.0E10d, 1.0d, (-10.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E10d, 1.0d, 32.0d, (-0.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        double[] doubleArray2 = new double[] { 100L, (-0.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        double[] doubleArray3 = new double[] { 1.0E-12d, (-1.0d), 1.0E8d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        double[] doubleArray6 = new double[] { 0.0d, 0.3333333d, 10.0d, (short) 100, 100, 1.0E-12d };
        double[] doubleArray8 = new double[] { 256.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.3333333d, 10.0d, 100.0d, 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        double[] doubleArray2 = new double[] { 1.0d, (short) 0 };
        double[] doubleArray4 = new double[] { 'a' };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        double[] doubleArray4 = new double[] { 10.0f, (short) 0, 1L, (-10.0d) };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        double[] doubleArray4 = new double[] { 10.0f, 1.0E8d, (short) 1, 0.1d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E8d, 1.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        double[] doubleArray4 = new double[] { 0.5d, (-1.0d), 0.70710678d, (byte) 10 };
        double[] doubleArray9 = new double[] { 10.0d, 100, (short) 0, 0.25d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, (-1.0d), 0.70710678d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d, 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (byte) -1, 256.0d, 2.0d };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 256.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        double[] doubleArray3 = new double[] { 1.0d, (byte) 100, 2.0d };
        double[] doubleArray9 = new double[] { (-10.0d), (byte) 1, (-1.0E10d), 1024.0d, (short) -1 };
        org.apache.commons.math3.test.testConvexHullWithPoints(doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-10.0d), 1.0d, (-1.0E10d), 1024.0d, (-1.0d) }, 1.0E-15);
    }
}

