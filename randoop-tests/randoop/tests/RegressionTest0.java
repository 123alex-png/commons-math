package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.commons.math3.test test0 = new org.apache.commons.math3.test();
        java.lang.Class<?> wildcardClass1 = test0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        double[] doubleArray4 = new double[] { (-1L), 512.0d, 1L, (-1.0d) };
        double[] doubleArray9 = new double[] { 10000.0d, 1, 1.0E-6d, 10.0f };
// flaky "1) test003(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 512.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10000.0d, 1.0d, 1.0E-6d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        double[] doubleArray3 = new double[] { (-1.0d), 0.01d, 10.0d };
        double[] doubleArray9 = new double[] { (-1), '4', 10L, 42.0d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.01d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 52.0d, 10.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 0, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        double[] doubleArray2 = new double[] { 512.0d, (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        double[] doubleArray3 = new double[] { 5.0d, (short) 100, 'a' };
        double[] doubleArray4 = null;
        double[] doubleArray7 = new double[] { 5.0d, 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        double[] doubleArray3 = new double[] { 0.9d, 1.0d, 1.0E8d };
        double[] doubleArray9 = new double[] { 1.0E-15d, 1.0E10d, 100L, (-1.0E10d), (byte) 100 };
        double[] doubleArray16 = new double[] { 0.25d, 10, 0L, 0.1d, 256.0d, 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray9, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 1.0E10d, 100.0d, (-1.0E10d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.25d, 10.0d, 0.0d, 0.1d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        double[] doubleArray5 = new double[] { (short) 10, 'a', 0.25d, (byte) 1, 1.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 0.25d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        double[] doubleArray4 = new double[] { (byte) 1, 0.70710678d, 0.25d, 0.001d };
        double[] doubleArray11 = new double[] { (-0.0d), (byte) 100, 1.0E-6d, 10L, 1000000.0d, (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.70710678d, 0.25d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 100.0d, 1.0E-6d, 10.0d, 1000000.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        double[] doubleArray1 = new double[] { 512.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        double[] doubleArray3 = new double[] { 0.001d, 'a', 1.0E-15d };
        double[] doubleArray8 = new double[] { 0.25d, 1.0E10d, 0.1d, 10000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, 97.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.25d, 1.0E10d, 0.1d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        double[] doubleArray2 = new double[] { 10L, (-1.0f) };
        double[] doubleArray8 = new double[] { (-10.0d), 0.001d, 10.0f, 1.0E-10d, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-10.0d), 0.001d, 10.0d, 1.0E-10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        double[] doubleArray3 = new double[] { 0.9d, 1.0d, 1.0E8d };
        double[] doubleArray9 = new double[] { 1.0E-15d, 1.0E10d, 100L, (-1.0E10d), (byte) 100 };
        double[] doubleArray16 = new double[] { 0.25d, 10, 0L, 0.1d, 256.0d, 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray9, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 1.0E10d, 100.0d, (-1.0E10d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.25d, 10.0d, 0.0d, 0.1d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        double[] doubleArray2 = new double[] { 0.3333333d, 100.0d };
        double[] doubleArray9 = new double[] { 'a', (-10.0d), 0.70710678d, (byte) 0, 1.0d, (short) 0 };
        double[] doubleArray14 = new double[] { 1000000.0d, (-100.0d), ' ', 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 97.0d, (-10.0d), 0.70710678d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1000000.0d, (-100.0d), 32.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        double[] doubleArray6 = new double[] { 0.01d, 0.5d, 10.0f, 10000.0d, (-1.0f), 0 };
        double[] doubleArray11 = new double[] { 1.0E-15d, (short) 1, (-1.0d), 0.3333333d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.5d, 10.0d, 10000.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-15d, 1.0d, (-1.0d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E-10d, 0L, 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        double[] doubleArray2 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray5 = new double[] { '4', 1.0E-15d };
        double[] doubleArray10 = new double[] { 1000000.0d, 0.9d, 10, (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1000000.0d, 0.9d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        double[] doubleArray4 = new double[] { (-1), 0.9d, 1000000.0d, 0.25d };
        double[] doubleArray7 = new double[] { 5.0d, 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.9d, 1000000.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        double[] doubleArray5 = new double[] { (short) 10, 'a', 0.25d, (byte) 1, 1.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 0.25d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { 100L, 1.0E8d, 'a', 256.0d, (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E8d, 97.0d, 256.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        double[] doubleArray2 = new double[] { (byte) -1, 1L };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        double[] doubleArray4 = new double[] { (-1.0d), (-1.0d), 1.0f, 1.0E-12d };
        double[] doubleArray11 = new double[] { (byte) -1, (-1L), 2.0d, (-100.0d), 0.0d, 1L };
        double[] doubleArray17 = new double[] { 0, 1.0E-15d, 0.0d, 0.001d, (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), 2.0d, (-100.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, 1.0E-15d, 0.0d, 0.001d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        double[] doubleArray3 = new double[] { (-1.0d), 0.01d, 10.0d };
        double[] doubleArray9 = new double[] { (-1), '4', 10L, 42.0d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.01d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 52.0d, 10.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        double[] doubleArray4 = new double[] { 512.0d, 0.25d, (short) -1, ' ' };
        double[] doubleArray9 = new double[] { 0L, 1.0d, (byte) 10, 1 };
// flaky "2) test026(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 0.25d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray4 = new double[] { 2.0d, (byte) 10 };
        double[] doubleArray7 = new double[] { 1024.0d, 256.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        double[] doubleArray5 = new double[] { (-1.0d), 0.001d, 0.01d, 0.25d, 1.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.001d, 0.01d, 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1, (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E-15d, (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        double[] doubleArray6 = new double[] { 10.0d, (-1.0d), 0, '#', 0.1d, 10.0d };
        double[] doubleArray9 = new double[] { 1.0E-10d, 0.001d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 35.0d, 0.1d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-10d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        double[] doubleArray2 = new double[] { 1.0E-6d, (byte) 10 };
        double[] doubleArray5 = new double[] { 100L, 'a' };
        double[] doubleArray7 = new double[] { 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        double[] doubleArray1 = new double[] { 0.9d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 2.0d, (short) -1 };
        double[] doubleArray10 = new double[] { (-1.0E10d), 0.0d, 512.0d, 10L, (byte) -1, 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0E10d), 0.0d, 512.0d, 10.0d, (-1.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        double[] doubleArray1 = new double[] { 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        double[] doubleArray4 = new double[] { (-1L), (byte) -1, 1024.0d, 'a' };
        double[] doubleArray11 = new double[] { (-1), 42.0d, 100.0f, (-1.0d), 10L, 256.0d };
        double[] doubleArray17 = new double[] { 10.0d, (short) 100, 2.0d, 512.0d, 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), 1024.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 42.0d, 100.0d, (-1.0d), 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, 2.0d, 512.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        double[] doubleArray5 = new double[] { (-1.0d), 0.001d, 0.01d, 0.25d, 1.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.001d, 0.01d, 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        double[] doubleArray3 = new double[] { 'a', 1024.0d, 1.0E8d };
        double[] doubleArray5 = new double[] { (short) 0 };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 1024.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        double[] doubleArray2 = new double[] { 0.3333333d, 0.1d };
        double[] doubleArray5 = new double[] { 0.0d, 42.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray2);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        double[] doubleArray6 = new double[] { 10.0d, (-1.0d), 0, '#', 0.1d, 10.0d };
        double[] doubleArray9 = new double[] { 1.0E-10d, 0.001d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 35.0d, 0.1d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-10d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        double[] doubleArray2 = new double[] { 0.01d, 1.0d };
        double[] doubleArray6 = new double[] { 10.0d, 0.25d, 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray2);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.25d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        double[] doubleArray6 = new double[] { 256.0d, 0.3333333d, (-1L), 0.25d, 10L, 0.0f };
        double[] doubleArray10 = new double[] { (-0.0d), 0.70710678d, 1.0E8d };
        double[] doubleArray12 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 256.0d, 0.3333333d, (-1.0d), 0.25d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-0.0d), 0.70710678d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        double[] doubleArray3 = new double[] { 0.0d, 42.0d, (-1.0d) };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        double[] doubleArray10 = new double[] { 1L, 42.0d, (byte) 1, 2.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 42.0d, 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        double[] doubleArray2 = new double[] { 0.0f, 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        double[] doubleArray4 = new double[] { 10.0d, 1L, 5.0d, 100.0d };
        double[] doubleArray8 = new double[] { (byte) 0, 10.0d, 10.0d };
        double[] doubleArray14 = new double[] { 1.0d, 10000.0d, 256.0d, (-1L), 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10000.0d, 256.0d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.0d, 1, 0.0f, 10.0f, 1.0d, (-0.0d) };
        double[] doubleArray9 = new double[] { 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, 0.0d, 10.0d, 1.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        double[] doubleArray4 = new double[] { 10.0d, 1L, 10.0d, 1.0d };
        double[] doubleArray9 = new double[] { 1.0E-10d, 0.0f, (-0.0d), 'a' };
// flaky "3) test049(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-10d, 0.0d, (-0.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        double[] doubleArray5 = new double[] { 0.5d, (-1), 'a', (byte) 0, (-1.0d) };
        double[] doubleArray9 = new double[] { 0.5d, 1.0E-10d, '4' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, (-1.0d), 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, 1.0E-10d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray0);
        java.lang.Class<?> wildcardClass2 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        double[] doubleArray1 = new double[] { 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        double[] doubleArray5 = new double[] { 1.0E-4d, 1.0E8d, 10.0d, 0, 100L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 1.0E8d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        double[] doubleArray6 = new double[] { (byte) 0, 1L, 1.0E10d, '#', (byte) 0, 0.5d };
        double[] doubleArray8 = new double[] { (byte) 0 };
        double[] doubleArray15 = new double[] { (-1L), (-1.0d), 0, 100.0f, (-10.0d), 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray8, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray15.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 1.0E10d, 35.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), 0.0d, 100.0d, (-10.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        double[] doubleArray2 = new double[] { (-100.0d), (-1.0d) };
        double[] doubleArray8 = new double[] { 42.0d, (-1.0d), 0.70710678d, (short) 0, 1.0E-4d };
        double[] doubleArray13 = new double[] { ' ', 0.5d, 5.0d, ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 42.0d, (-1.0d), 0.70710678d, 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 32.0d, 0.5d, 5.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        double[] doubleArray1 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        double[] doubleArray6 = new double[] { 0.25d, 0.5d, 100.0d, 1.0d, (short) 0, (byte) 1 };
        double[] doubleArray9 = new double[] { 0.25d, 10.0d };
        double[] doubleArray15 = new double[] { 0.70710678d, (-1.0f), ' ', 0.0f, ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 0.5d, 100.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.25d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.70710678d, (-1.0d), 32.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        double[] doubleArray2 = new double[] { 1.0E-15d, 0.001d };
        double[] doubleArray6 = new double[] { 10L, 1.0E8d, 0.5d };
        double[] doubleArray12 = new double[] { 100.0f, 1.0d, (short) 1, 100L, 0.9d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E8d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 1.0d, 100.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        double[] doubleArray1 = new double[] { 1000000.0d };
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 10, (-10.0d), (byte) 100, 0.001d, (byte) 10 };
        double[] doubleArray14 = new double[] { 'a', 0.70710678d, 0.0d, 0.1d, 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray8, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 10.0d, (-10.0d), 100.0d, 0.001d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 97.0d, 0.70710678d, 0.0d, 0.1d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        double[] doubleArray3 = new double[] { 1.0E-10d, 0.0d, (byte) 0 };
        double[] doubleArray5 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        double[] doubleArray5 = new double[] { '#', (-1L), 512.0d, 1.0E-4d, 10.0d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, (-1.0d), 512.0d, 1.0E-4d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        double[] doubleArray6 = new double[] { (byte) -1, 0.25d, 10L, 10, (-10.0d), 0.01d };
        double[] doubleArray10 = new double[] { 512.0d, 0L, 100L };
        double[] doubleArray13 = new double[] { 100.0d, (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.25d, 10.0d, 10.0d, (-10.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 512.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0d, (short) 0, 0.5d, 10.0d, (-0.0d), (byte) 10 };
        double[] doubleArray11 = new double[] { 0.5d, 100.0f, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 0.0d, 0.5d, 10.0d, (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.5d, 100.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        double[] doubleArray5 = new double[] { 1L, 512.0d, 100.0f, 10.0f, 1.0f };
        double[] doubleArray12 = new double[] { 0.70710678d, (-10.0d), (byte) 10, (byte) 1, 256.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 512.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.70710678d, (-10.0d), 10.0d, 1.0d, 256.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        double[] doubleArray1 = new double[] { (byte) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        double[] doubleArray6 = new double[] { 0.1d, 0.3333333d, ' ', 0.1d, 0.01d, 42.0d };
        double[] doubleArray11 = new double[] { 100.0d, (byte) 10, 10000.0d, (short) -1 };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray11, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 0.3333333d, 32.0d, 0.1d, 0.01d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 10.0d, 10000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        double[] doubleArray1 = new double[] { 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray0);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray7 = new double[] { 0.0f, 100, (short) 100, 0.5d, 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 100.0d, 100.0d, 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        double[] doubleArray2 = new double[] { 2.0d, (byte) 100 };
        double[] doubleArray5 = new double[] { 1.0E-8d, ' ' };
        double[] doubleArray7 = new double[] { 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.01d }, 1.0E-15);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        double[] doubleArray6 = new double[] { 1.0f, (-1), 2.0d, 5.0d, 10.0f, 0.9d };
        double[] doubleArray11 = new double[] { 42.0d, 0.5d, 256.0d, 512.0d };
        double[] doubleArray16 = new double[] { 1000000.0d, 1024.0d, 1L, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray11, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 2.0d, 5.0d, 10.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 42.0d, 0.5d, 256.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1000000.0d, 1024.0d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        double[] doubleArray4 = new double[] { '4', 10.0d, 0.3333333d, 1.0f };
        double[] doubleArray9 = new double[] { 1.0E-15d, 0.25d, 100, 1 };
        double[] doubleArray16 = new double[] { 1.0E-4d, 512.0d, 0.01d, 1024.0d, 1.0E-6d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 10.0d, 0.3333333d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 0.25d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0E-4d, 512.0d, 0.01d, 1024.0d, 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { '4', 1L, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 1.0d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        double[] doubleArray6 = new double[] { 10.0f, 1.0E-4d, 10.0d, 1.0E-6d, 0.01d, 1000000.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray10 = new double[] { 10L, 42.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray7, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E-4d, 10.0d, 1.0E-6d, 0.01d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        double[] doubleArray4 = new double[] { 10.0d, 1L, 10.0d, 1.0d };
        double[] doubleArray9 = new double[] { 1.0E-10d, 0.0f, (-0.0d), 'a' };
// flaky "1) test076(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-10d, 0.0d, (-0.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        double[] doubleArray2 = new double[] { 1.0E-10d, 1.0E10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-10d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 0, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        double[] doubleArray3 = new double[] { 0.0f, 1024.0d, 10.0d };
        double[] doubleArray6 = new double[] { 100, 1.0E10d };
        double[] doubleArray9 = new double[] { '#', 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1024.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        double[] doubleArray2 = new double[] { 1000000.0d, 1L };
        double[] doubleArray6 = new double[] { 1.0E-8d, 100.0d, 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        double[] doubleArray2 = new double[] { 1.0d, 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray4 = new double[] { 1.0E10d, 10.0d };
        double[] doubleArray10 = new double[] { 100.0f, 42.0d, 1.0E-10d, 0L, 100L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 42.0d, 1.0E-10d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        double[] doubleArray5 = new double[] { (byte) 0, 10.0d, 1.0E-6d, 0.001d, 0.1d };
        double[] doubleArray6 = null;
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1.0E-6d, 0.001d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        double[] doubleArray4 = new double[] { 1.0E-12d, 0, 512.0d, 1.0d };
        double[] doubleArray11 = new double[] { (-1L), 42.0d, (-1.0f), 0.001d, (short) -1, (byte) 0 };
        double[] doubleArray17 = new double[] { 100.0d, (-1.0d), 10000.0d, 100, 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray17);
        java.lang.Class<?> wildcardClass19 = doubleArray17.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 0.0d, 512.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 42.0d, (-1.0d), 0.001d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, (-1.0d), 10000.0d, 100.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        double[] doubleArray4 = new double[] { (-1.0E10d), 1, 0.70710678d, 256.0d };
        double[] doubleArray6 = new double[] { (-100.0d) };
        double[] doubleArray13 = new double[] { (byte) 1, 1.0E-4d, 100L, 10.0d, (-1L), 10000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 1.0d, 0.70710678d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0E-4d, 100.0d, 10.0d, (-1.0d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        double[] doubleArray2 = new double[] { (byte) 10, 1.0E-10d };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray2);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        double[] doubleArray1 = new double[] { 0.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        double[] doubleArray5 = new double[] { 0.01d, 512.0d, 0.0d, 1.0E-6d, 100L };
        double[] doubleArray7 = new double[] { 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 512.0d, 0.0d, 1.0E-6d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (-1.0E10d), 1, 0.0d, (-10.0d), 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray3, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0E10d), 1.0d, 0.0d, (-10.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        double[] doubleArray3 = new double[] { (-1.0E10d), 0.001d, (short) 1 };
        double[] doubleArray5 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 0.001d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        double[] doubleArray2 = new double[] { 512.0d, '#' };
        double[] doubleArray9 = new double[] { 100.0d, 1.0E-4d, 0.25d, (byte) 100, (byte) 100, 0 };
        double[] doubleArray13 = new double[] { 2.0d, 256.0d, 2.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1.0E-4d, 0.25d, 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 2.0d, 256.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        double[] doubleArray2 = new double[] { (short) 100, 1.0f };
        double[] doubleArray7 = new double[] { 0.0f, 0.3333333d, 1.0E-8d, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray7, doubleArray2);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.3333333d, 1.0E-8d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        double[] doubleArray2 = new double[] { 100, 1.0E-15d };
        double[] doubleArray5 = new double[] { 0.0d, (short) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray0);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        double[] doubleArray2 = new double[] { 2.0d, 0.0d };
        double[] doubleArray9 = new double[] { (short) 0, 100.0f, (-1.0d), (-100.0d), 1.0E-8d, (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 100.0d, (-1.0d), (-100.0d), 1.0E-8d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        double[] doubleArray4 = new double[] { (byte) 1, 0.70710678d, 0.25d, 0.001d };
        double[] doubleArray11 = new double[] { (-0.0d), (byte) 100, 1.0E-6d, 10L, 1000000.0d, (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.70710678d, 0.25d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 100.0d, 1.0E-6d, 10.0d, 1000000.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        double[] doubleArray1 = new double[] { 1024.0d };
        double[] doubleArray3 = new double[] { 1.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        double[] doubleArray3 = new double[] { (-1.0E10d), 0.001d, (short) 1 };
        double[] doubleArray5 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 0.001d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        double[] doubleArray3 = new double[] { 1.0E-10d, 0.0d, (byte) 0 };
        double[] doubleArray5 = new double[] { (byte) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0.1d, '4', 0.25d, ' ', 2.0d, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.1d, 52.0d, 0.25d, 32.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        double[] doubleArray2 = new double[] { 10.0d, 1024.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray2, doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 10.0d, (short) 10, 100.0d, 100L };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 10, '4', 10, 0.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray0);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 52.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        double[] doubleArray2 = new double[] { 1000000.0d, 1L };
        double[] doubleArray6 = new double[] { 1.0E-8d, 100.0d, 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        double[] doubleArray2 = new double[] { 1.0E-4d, (byte) -1 };
        double[] doubleArray4 = new double[] { 1024.0d };
        double[] doubleArray6 = new double[] { (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        double[] doubleArray4 = new double[] { 10.0d, 1.0E-15d, ' ', '#' };
        double[] doubleArray7 = new double[] { 0.5d, (short) 10 };
        double[] doubleArray9 = new double[] { 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray7, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-15d, 32.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        double[] doubleArray1 = new double[] { 1.0E10d };
        double[] doubleArray8 = new double[] { 0.0d, 0.25d, 0.25d, (-1), 100L, 0.0d };
        double[] doubleArray11 = new double[] { 1.0E8d, 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray8, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.25d, 0.25d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        double[] doubleArray6 = new double[] { (byte) 100, (short) 10, (byte) 100, (short) 10, 1.0E-10d, (byte) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 100.0d, 10.0d, 1.0E-10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        double[] doubleArray3 = new double[] { 100.0d, 0, 1.0d };
        double[] doubleArray7 = new double[] { 100.0d, 1.0E-4d, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray7, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-4d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        double[] doubleArray5 = new double[] { 1.0E-8d, 0.3333333d, (short) 100, 100L, 0.25d };
        double[] doubleArray8 = new double[] { 1024.0d, (byte) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-8d, 0.3333333d, 100.0d, 100.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1024.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        double[] doubleArray4 = new double[] { (-1.0E10d), 0.001d, 0.70710678d, 0.25d };
        double[] doubleArray11 = new double[] { 1.0E-15d, (-1.0d), 1.0E-10d, 0.70710678d, (-1.0E10d), 0.0d };
        double[] doubleArray15 = new double[] { (-1.0d), (short) -1, 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray15.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 0.001d, 0.70710678d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-15d, (-1.0d), 1.0E-10d, 0.70710678d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        double[] doubleArray1 = new double[] { 0.3333333d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray2, doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 42.0d, 1.0d, (-1.0d), 10.0d };
        double[] doubleArray9 = new double[] { (-1.0d), '4', 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 512.0d, 0.0f };
        double[] doubleArray6 = new double[] { 1.0d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        double[] doubleArray4 = new double[] { (short) 10, 100L, (byte) 10, 1.0E-6d };
        double[] doubleArray11 = new double[] { (-10.0d), 0.01d, (-1.0d), (byte) -1, 1L, (-1.0f) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray4);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-10.0d), 0.01d, (-1.0d), (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        double[] doubleArray6 = new double[] { 10.0d, 1.0d, 2.0d, 1.0E10d, (-1L), (short) -1 };
        double[] doubleArray13 = new double[] { 100, 0.0d, 100.0d, (-1.0d), 100.0d, 0L };
        double[] doubleArray15 = new double[] { 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray13, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 2.0d, 1.0E10d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 0.0d, 100.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        double[] doubleArray4 = new double[] { 0.001d, 1000000.0d, 100.0f, 1024.0d };
        double[] doubleArray6 = new double[] { 1L };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 1000000.0d, 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 1.0E10d };
        double[] doubleArray6 = new double[] { 100.0d, 0.1d, 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.1d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 100, (-1L), (byte) 0, (short) -1, 0.1d, 0L };
        double[] doubleArray8 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d), 0.0d, (-1.0d), 0.1d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        double[] doubleArray2 = new double[] { 1000000.0d, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        double[] doubleArray2 = new double[] { 5.0d, 0.70710678d };
        double[] doubleArray4 = new double[] { 1.0E10d };
        double[] doubleArray9 = new double[] { 42.0d, 100, 0.001d, 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray4, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 5.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 42.0d, 100.0d, 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        double[] doubleArray3 = new double[] { 0.5d, 10L, (byte) 100 };
        double[] doubleArray5 = new double[] { (byte) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        double[] doubleArray3 = new double[] { 0.001d, (-1.0d), (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, (-1.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        double[] doubleArray1 = new double[] { 42.0d };
        double[] doubleArray4 = new double[] { 1.0E-15d, 'a' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        double[] doubleArray2 = new double[] { 0L, 0.01d };
        double[] doubleArray8 = new double[] { 10.0d, '4', 0.001d, 0.70710678d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 52.0d, 0.001d, 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray6 = new double[] { 0.1d, (-10.0d), '#', 1 };
        double[] doubleArray12 = new double[] { 1.0f, '4', 0.25d, (-1L), 42.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray6, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, (-10.0d), 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 52.0d, 0.25d, (-1.0d), 42.0d }, 1.0E-15);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        double[] doubleArray6 = new double[] { 1.0d, (short) 10, 10000.0d, 0.9d, 10L, 0.0f };
// flaky "4) test132(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 10000.0d, 0.9d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        double[] doubleArray3 = new double[] { (short) 10, 10000.0d, (short) -1 };
        double[] doubleArray4 = null;
        double[] doubleArray10 = new double[] { 1.0f, 100.0d, 100, (-1L), 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        double[] doubleArray3 = new double[] { 0.0d, 0.25d, 1000000.0d };
        double[] doubleArray5 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.25d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        double[] doubleArray3 = new double[] { (-1.0d), 10.0d, '4' };
        double[] doubleArray10 = new double[] { (-1.0f), 10.0d, 1.0f, (-10.0d), 0.01d, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 10.0d, 1.0d, (-10.0d), 0.01d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 100, 0.001d, 512.0d, 0.01d, (-1.0d) };
        double[] doubleArray13 = new double[] { (short) 0, 1.0E-4d, (-100.0d), 0.5d, (short) -1, ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.001d, 512.0d, 0.01d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 1.0E-4d, (-100.0d), 0.5d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        double[] doubleArray6 = new double[] { (short) 100, 0.0d, (-1L), 0.01d, 100, 100 };
        double[] doubleArray13 = new double[] { (byte) 10, (short) 1, (byte) -1, (byte) 10, 1.0E8d, 512.0d };
// flaky "5) test137(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, (-1.0d), 0.01d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0d, (-1.0d), 10.0d, 1.0E8d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        double[] doubleArray3 = new double[] { 5.0d, (short) 100, 'a' };
        double[] doubleArray4 = null;
        double[] doubleArray7 = new double[] { 5.0d, 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 5.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        double[] doubleArray3 = new double[] { 0.001d, 100L, (byte) 1 };
        double[] doubleArray5 = new double[] { 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        double[] doubleArray2 = new double[] { 1.0E-15d, (-10.0d) };
        double[] doubleArray7 = new double[] { '#', 0.1d, (short) 1, (-1L) };
        double[] doubleArray12 = new double[] { 'a', 0, 0, 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray7, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 0.1d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 97.0d, 0.0d, 0.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        double[] doubleArray3 = new double[] { 100.0d, 10000.0d, 1.0E-8d };
        double[] doubleArray7 = new double[] { 1.0E10d, 10000.0d, 512.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray7, doubleArray3);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10000.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, 10000.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        double[] doubleArray6 = new double[] { 1L, (byte) 0, 0.0d, 10.0f, (-10.0d), 10000.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray13 = new double[] { 10000.0d, (short) 10, 0.70710678d, 42.0d, (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray7, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 0.0d, 10.0d, (-10.0d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10000.0d, 10.0d, 0.70710678d, 42.0d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        double[] doubleArray5 = new double[] { 1.0E-4d, 1.0E8d, 10.0d, 0, 100L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 1.0E8d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        double[] doubleArray5 = new double[] { 0.5d, (byte) 0, (short) 1, 0.01d, (short) 0 };
        double[] doubleArray8 = new double[] { (-1.0f), (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.0d, 1.0d, 0.01d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1L, (short) 100 };
        double[] doubleArray5 = new double[] { 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0E10d, 10000.0d, 100.0d, 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, 10000.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        double[] doubleArray6 = new double[] { (-1.0f), 0, 100, 1.0E-15d, (-1.0d), 0.0d };
        double[] doubleArray10 = new double[] { 256.0d, 0.0d, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 100.0d, 1.0E-15d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        double[] doubleArray6 = new double[] { 0.9d, 0, 1.0E-15d, 0.001d, (-100.0d), 1.0f };
        double[] doubleArray9 = new double[] { 1.0E-8d, 0.9d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 0.0d, 1.0E-15d, 0.001d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-8d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        double[] doubleArray5 = new double[] { 100L, (byte) -1, 1.0E8d, 100.0f, 0.001d };
        double[] doubleArray11 = new double[] { 42.0d, 1, 0.5d, 10.0d, 1.0d };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 1.0E8d, 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 42.0d, 1.0d, 0.5d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        double[] doubleArray4 = new double[] { 0.9d, 1.0E-15d, 1.0E8d, (-10.0d) };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray5, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d, 1.0E-15d, 1.0E8d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        double[] doubleArray1 = new double[] { (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        double[] doubleArray5 = new double[] { 0.1d, 0.0d, '#', 1.0E-6d, (byte) 0 };
        double[] doubleArray7 = new double[] { 0.1d };
        double[] doubleArray13 = new double[] { 0.25d, (short) 1, (byte) 1, (-10.0d), 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray7, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 0.0d, 35.0d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.25d, 1.0d, 1.0d, (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        double[] doubleArray2 = new double[] { 10.0d, 512.0d };
        double[] doubleArray6 = new double[] { 1, 0.0d, 1.0E-4d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray2);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        double[] doubleArray2 = new double[] { 0.5d, 1.0E-4d };
        double[] doubleArray9 = new double[] { 0.5d, '4', 'a', 512.0d, (-1.0d), 1.0E8d };
        double[] doubleArray12 = new double[] { (byte) 0, (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.5d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, 52.0d, 97.0d, 512.0d, (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray8 = new double[] { 'a', 100L, (byte) 100, (short) 0, 0.3333333d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 97.0d, 100.0d, 100.0d, 0.0d, 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1L };
        double[] doubleArray4 = new double[] { 256.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d }, 1.0E-15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        double[] doubleArray6 = new double[] { 1000000.0d, 0L, 0.1d, 100L, (-100.0d), 1.0E-12d };
        double[] doubleArray11 = new double[] { 0.001d, 1024.0d, 0.9d, 512.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray11, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 0.0d, 0.1d, 100.0d, (-100.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.001d, 1024.0d, 0.9d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        double[] doubleArray2 = new double[] { 100.0f, 1.0f };
        double[] doubleArray8 = new double[] { 1.0E-12d, (short) -1, 512.0d, 0.0d, 1024.0d };
        double[] doubleArray12 = new double[] { 512.0d, 0.0d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-12d, (-1.0d), 512.0d, 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 512.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        double[] doubleArray6 = new double[] { 2.0d, 1.0E10d, 42.0d, 10.0f, (byte) 0, 100.0d };
        double[] doubleArray8 = new double[] { 1.0E8d };
        double[] doubleArray14 = new double[] { 10.0d, 100.0f, 512.0d, (-1.0f), 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray8, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 1.0E10d, 42.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 100.0d, 512.0d, (-1.0d), 5.0d }, 1.0E-15);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        double[] doubleArray5 = new double[] { 0.0d, 42.0d, 1.0d, ' ', 256.0d };
        double[] doubleArray9 = new double[] { 256.0d, 5.0d, 1.0E10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray9, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 42.0d, 1.0d, 32.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 5.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        double[] doubleArray4 = new double[] { (-1.0E10d), 0.001d, 0.70710678d, 0.25d };
        double[] doubleArray11 = new double[] { 1.0E-15d, (-1.0d), 1.0E-10d, 0.70710678d, (-1.0E10d), 0.0d };
        double[] doubleArray15 = new double[] { (-1.0d), (short) -1, 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 0.001d, 0.70710678d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-15d, (-1.0d), 1.0E-10d, 0.70710678d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100.0d };
        double[] doubleArray4 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        double[] doubleArray5 = new double[] { 0.25d, 1L, 0.25d, 0L, (byte) 100 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, 1.0d, 0.25d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { 42.0d, 100L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        double[] doubleArray6 = new double[] { 1L, 100.0f, (-1.0d), 10.0d, (-0.0d), 1.0E10d };
        double[] doubleArray8 = new double[] { 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, (-1.0d), 10.0d, (-0.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        double[] doubleArray5 = new double[] { 0.01d, (short) 0, 0.3333333d, (-1), (byte) 100 };
        double[] doubleArray7 = new double[] { 0.25d };
        double[] doubleArray9 = new double[] { 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray7, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 0.0d, 0.3333333d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        double[] doubleArray6 = new double[] { 1000000.0d, 10000.0d, (-1.0f), 0.5d, 0.0d, 256.0d };
        double[] doubleArray7 = null;
        double[] doubleArray12 = new double[] { 10, 10.0d, 1.0E10d, (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray7, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 10000.0d, (-1.0d), 0.5d, 0.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 1.0E10d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        double[] doubleArray4 = new double[] { 0.5d, 0.001d, (-1.0E10d), 1.0d };
        double[] doubleArray7 = new double[] { (-1.0f), (short) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray7, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, 0.001d, (-1.0E10d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        double[] doubleArray4 = new double[] { (-1), 0.3333333d, 1000000.0d, 0.25d };
        double[] doubleArray10 = new double[] { 1.0E8d, 1.0d, 'a', 0L, 512.0d };
        double[] doubleArray15 = new double[] { 1.0E-8d, '#', 10.0f, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.3333333d, 1000000.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E8d, 1.0d, 97.0d, 0.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-8d, 35.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray3 = new double[] { 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        double[] doubleArray5 = new double[] { 256.0d, 100.0d, 1.0E-8d, (-1L), 100.0d };
        double[] doubleArray11 = new double[] { 10.0f, 0.001d, 'a', 0L, (-1.0E10d) };
        double[] doubleArray15 = new double[] { 10L, 10.0f, 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, 100.0d, 1.0E-8d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.001d, 97.0d, 0.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 10.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        double[] doubleArray2 = new double[] { (-1L), (byte) -1 };
        double[] doubleArray6 = new double[] { (-1L), 0.25d, 0.9d };
        double[] doubleArray13 = new double[] { (-0.0d), (-1.0d), (-1), 0.70710678d, (short) -1, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.25d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-0.0d), (-1.0d), (-1.0d), 0.70710678d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray8 = new double[] { 0, '4', (-1.0E10d), (byte) 1, 10, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray8, doubleArray1);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 52.0d, (-1.0E10d), 1.0d, 10.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        double[] doubleArray6 = new double[] { 0.0d, 1.0d, (-10.0d), (short) 100, 1000000.0d, 1L };
        double[] doubleArray10 = new double[] { 1.0E-8d, 100.0d, 1.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, (-10.0d), 100.0d, 1000000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        double[] doubleArray3 = new double[] { 100.0d, 0, 1.0d };
        double[] doubleArray7 = new double[] { 100.0d, 1.0E-4d, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray7, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-4d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        double[] doubleArray4 = new double[] { 2.0d, (byte) -1, (short) 100, 100.0d };
        double[] doubleArray6 = new double[] { ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        double[] doubleArray3 = new double[] { 0.25d, '4', 0 };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.25d, 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        double[] doubleArray1 = new double[] { 1.0E10d };
        double[] doubleArray4 = new double[] { 1, (byte) 0 };
        double[] doubleArray6 = new double[] { 0.001d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 10, (byte) 10, 1, 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray4 = new double[] { 0.25d, (-1.0f) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        double[] doubleArray4 = new double[] { 10, (byte) 10, 1.0d, 1.0E8d };
        double[] doubleArray8 = new double[] { 10.0f, 2.0d, 10.0d };
        double[] doubleArray11 = new double[] { (-10.0d), 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-10.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        double[] doubleArray4 = new double[] { 10.0d, 1000000.0d, 5.0d, 0.001d };
        double[] doubleArray10 = new double[] { 1024.0d, (byte) 0, 0.0d, 1.0E-8d, (-0.0d) };
        double[] doubleArray13 = new double[] { 10.0f, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1000000.0d, 5.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 0.0d, 0.0d, 1.0E-8d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        double[] doubleArray2 = new double[] { 10L, ' ' };
        double[] doubleArray8 = new double[] { 100.0d, '#', (-0.0d), (short) 10, (short) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 35.0d, (-0.0d), 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        double[] doubleArray3 = new double[] { 1.0E-10d, (short) 1, (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        double[] doubleArray4 = new double[] { 1.0E-8d, 'a', (short) -1, 2.0d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-8d, 97.0d, (-1.0d), 2.0d }, 1.0E-15);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        double[] doubleArray2 = new double[] { 10L, 0.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { 1.0E10d, 10.0d, 10.0f, 100.0d, 0.001d, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E10d, 10.0d, 10.0d, 100.0d, 0.001d, (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray5 = new double[] { 1.0E-10d, 100L, 1.0E10d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        double[] doubleArray4 = new double[] { 1.0E-10d, 0.0d, 0.25d, 0.70710678d };
        double[] doubleArray10 = new double[] { (-1), (byte) 1, (-1), 1.0E10d, (byte) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 0.0d, 0.25d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, (-1.0d), 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray5 = new double[] { 1.0E-10d, 100L, 1.0E10d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 100.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        double[] doubleArray3 = new double[] { 0.25d, (short) 10, 0.01d };
        double[] doubleArray8 = new double[] { 0, (-1), 0.70710678d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.25d, 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 0.70710678d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        double[] doubleArray5 = new double[] { 0.5d, (byte) 0, (short) 1, 0.01d, (short) 0 };
        double[] doubleArray8 = new double[] { (-1.0f), (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 0.0d, 1.0d, 0.01d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        double[] doubleArray3 = new double[] { 0.01d, (-1), (short) -1 };
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray9 = new double[] { (-1.0d), 10L, 256.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 10.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        double[] doubleArray4 = new double[] { 1000000.0d, 256.0d, (-1), (short) 10 };
        double[] doubleArray7 = new double[] { 0L, 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray7, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 256.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        double[] doubleArray4 = new double[] { 1.0d, (short) 0, 1024.0d, (short) 1 };
        double[] doubleArray6 = new double[] { 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray4);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { (-100.0d), 10, 42.0d, (-1.0d), '#', 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray8, doubleArray1);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-100.0d), 10.0d, 42.0d, (-1.0d), 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        double[] doubleArray5 = new double[] { 0.0d, 10, 1.0E-4d, 0L, 1.0E-10d };
        double[] doubleArray12 = new double[] { 0.3333333d, 1.0E10d, 100.0d, 1.0E-10d, 10.0d, (byte) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1.0E-4d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.3333333d, 1.0E10d, 100.0d, 1.0E-10d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        double[] doubleArray4 = new double[] { 100.0d, 1.0E-12d, (short) 10, 0.001d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-12d, 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray0);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1.0E-6d, 2.0d, 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        double[] doubleArray4 = new double[] { 10, (-10.0d), 100L, 0L };
        double[] doubleArray8 = new double[] { (-1), 0.25d, 1000000.0d };
        double[] doubleArray10 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-10.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.25d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        double[] doubleArray6 = new double[] { (-1.0d), (-100.0d), 'a', 1L, (-0.0d), ' ' };
        double[] doubleArray11 = new double[] { 1.0E-8d, 0.0d, '#', 1.0E-4d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-100.0d), 97.0d, 1.0d, (-0.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-8d, 0.0d, 35.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        double[] doubleArray4 = new double[] { (short) 10, 42.0d, (-1.0f), 0.0f };
        double[] doubleArray7 = new double[] { (-0.0d), (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 42.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-0.0d), (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { 1024.0d, 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray1);
        java.lang.Class<?> wildcardClass6 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        double[] doubleArray8 = new double[] { (-1.0d), 1.0E-8d, 10.0d, (short) 100, 42.0d, 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0E-8d, 10.0d, 100.0d, 42.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        double[] doubleArray2 = new double[] { (short) 1, 0.9d };
        double[] doubleArray9 = new double[] { 0.001d, 1.0E-10d, 100.0f, 100, (byte) 1, (byte) 0 };
        double[] doubleArray12 = new double[] { 10.0d, ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 1.0E-10d, 100.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        double[] doubleArray1 = new double[] { 10000.0d };
        double[] doubleArray5 = new double[] { (short) 1, 1.0d, 1.0d };
        double[] doubleArray8 = new double[] { '#', 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        double[] doubleArray6 = new double[] { 0.9d, (-1.0d), 0.001d, (short) 1, 0.25d, 1.0E10d };
        double[] doubleArray12 = new double[] { 0.001d, 0.001d, 1.0E10d, 100.0f, 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, (-1.0d), 0.001d, 1.0d, 0.25d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.001d, 0.001d, 1.0E10d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        double[] doubleArray6 = new double[] { 0.9d, (-1.0d), 0.001d, (short) 1, 0.25d, 1.0E10d };
        double[] doubleArray12 = new double[] { 0.001d, 0.001d, 1.0E10d, 100.0f, 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, (-1.0d), 0.001d, 1.0d, 0.25d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.001d, 0.001d, 1.0E10d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        double[] doubleArray3 = new double[] { 100, 0.25d, 0.70710678d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.25d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        double[] doubleArray4 = new double[] { (short) 10, 1.0E-8d, (byte) 1, 42.0d };
        double[] doubleArray8 = new double[] { (byte) 0, 1.0E-10d, 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0E-8d, 1.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0E-10d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        double[] doubleArray2 = new double[] { 256.0d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 256.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0, 0.01d, 10L, (-1.0d) };
        double[] doubleArray7 = new double[] { (-1) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.01d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 100 };
        double[] doubleArray5 = new double[] { (-1.0E10d), 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        double[] doubleArray2 = new double[] { 10, 0.01d };
        double[] doubleArray4 = new double[] { 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray3 = new double[] { (short) -1 };
        double[] doubleArray9 = new double[] { 1.0E-15d, 512.0d, '#', 1.0E8d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray3, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 512.0d, 35.0d, 1.0E8d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        double[] doubleArray2 = new double[] { 100, 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        double[] doubleArray6 = new double[] { (-1.0f), 0, 100, 1.0E-15d, (-1.0d), 0.0d };
        double[] doubleArray10 = new double[] { 256.0d, 0.0d, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 100.0d, 1.0E-15d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 256.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0f, (-1.0f) };
        double[] doubleArray6 = new double[] { 0.0d, (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        double[] doubleArray6 = new double[] { '4', '4', 10L, (byte) 100, 100.0d, 100.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) 0, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray7, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 52.0d, 10.0d, 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-10.0d) };
        double[] doubleArray6 = new double[] { 0.1d, (short) 100, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        double[] doubleArray5 = new double[] { (-1.0E10d), ' ', (short) 100, 0.70710678d, 1.0d };
        double[] doubleArray10 = new double[] { 0L, 1, 0.70710678d, 100L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray10, doubleArray5);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 32.0d, 100.0d, 0.70710678d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        double[] doubleArray2 = new double[] { 100.0d, 512.0d };
        double[] doubleArray5 = new double[] { 0.5d, 1000000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        double[] doubleArray5 = new double[] { 'a', 1.0E-6d, ' ', 0.25d, 1.0E-15d };
        double[] doubleArray8 = new double[] { 10.0f, 0.01d };
        double[] doubleArray14 = new double[] { 0.0f, (byte) 10, 1.0E-4d, (-1.0f), 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray8, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 1.0E-6d, 32.0d, 0.25d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 1.0E-4d, (-1.0d), 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-10.0d), 10.0d, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 10.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        double[] doubleArray5 = new double[] { 1.0E8d, (-0.0d), (-10.0d), 1.0E-8d, 42.0d };
        double[] doubleArray10 = new double[] { 0.1d, 0.3333333d, (-10.0d), 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E8d, (-0.0d), (-10.0d), 1.0E-8d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.1d, 0.3333333d, (-10.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        double[] doubleArray6 = new double[] { 1.0E-6d, 'a', 100L, 100.0f, (-1.0d), (byte) 100 };
        double[] doubleArray13 = new double[] { (byte) 10, 1.0E-8d, 10L, 0.1d, 2.0d, 0.70710678d };
        double[] doubleArray15 = new double[] { 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray13, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 97.0d, 100.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0E-8d, 10.0d, 0.1d, 2.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        double[] doubleArray5 = new double[] { 0.0f, (-1.0d), ' ', 10.0d, 0.0f };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 32.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1024.0d, 42.0d, (-1.0d), (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d, 42.0d, (-1.0d), (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        double[] doubleArray4 = new double[] { 10.0d, 1000000.0d, 5.0d, 0.001d };
        double[] doubleArray10 = new double[] { 1024.0d, (byte) 0, 0.0d, 1.0E-8d, (-0.0d) };
        double[] doubleArray13 = new double[] { 10.0f, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1000000.0d, 5.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 0.0d, 0.0d, 1.0E-8d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        double[] doubleArray6 = new double[] { (-1), 1024.0d, 10.0d, (short) 0, 100L, (-1.0E10d) };
        double[] doubleArray10 = new double[] { 1.0E-8d, (-1.0f), (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1024.0d, 10.0d, 0.0d, 100.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        double[] doubleArray3 = new double[] { 0.9d, (short) 1, (-1.0E10d) };
        double[] doubleArray8 = new double[] { 100.0d, 256.0d, 1L, 10.0f };
        double[] doubleArray13 = new double[] { 0.70710678d, 100.0f, 100.0d, 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray8, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 256.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.70710678d, 100.0d, 100.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        double[] doubleArray1 = new double[] { 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        double[] doubleArray3 = new double[] { 10.0f, 1, (-10.0d) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { 256.0d, 10.0f, (-0.0d), 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 10.0d, (-0.0d), 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        double[] doubleArray4 = new double[] { '4', 10.0d, 0.3333333d, 1.0f };
        double[] doubleArray9 = new double[] { 1.0E-15d, 0.25d, 100, 1 };
        double[] doubleArray16 = new double[] { 1.0E-4d, 512.0d, 0.01d, 1024.0d, 1.0E-6d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 10.0d, 0.3333333d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 0.25d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0E-4d, 512.0d, 0.01d, 1024.0d, 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        double[] doubleArray6 = new double[] { (byte) 1, 0.0d, 0.25d, 1L, (-1.0d), 1 };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, 0.25d, 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-1L), 0.0d, 0.9d, 2.0d, (-1) };
        double[] doubleArray13 = new double[] { 0.0d, 10.0d, (-1.0d), (-1.0f), (byte) 0, 0.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 0.9d, 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d, (-1.0d), (-1.0d), 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray4 = new double[] { '4', 10000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        double[] doubleArray5 = new double[] { 0.1d, (-1L), 42.0d, 100.0f, (-1.0d) };
        double[] doubleArray7 = new double[] { 10 };
        double[] doubleArray9 = new double[] { 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray7, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, (-1.0d), 42.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray2, doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { (-1.0E10d), 1.0E-6d, 0.25d, (-1), 100L, ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0E10d), 1.0E-6d, 0.25d, (-1.0d), 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { '4', 1024.0d, 10000.0d, 1, 5.0d, 0.9d };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 52.0d, 1024.0d, 10000.0d, 1.0d, 5.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        double[] doubleArray4 = new double[] { 1.0E8d, 0, ' ', 1000000.0d };
        double[] doubleArray11 = new double[] { (-1L), 0.25d, 1.0E-15d, 10.0d, 0.0d, (short) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 0.0d, 32.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.25d, 1.0E-15d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        double[] doubleArray2 = new double[] { 1.0d, 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        double[] doubleArray1 = new double[] { (-1.0f) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray7 = new double[] { (short) 100, 100.0d, (-100.0d), 100, 2.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d, (-100.0d), 100.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        double[] doubleArray3 = new double[] { (-1.0d), 0.001d, (short) -1 };
        double[] doubleArray6 = new double[] { (byte) 10, 100.0d };
        double[] doubleArray8 = new double[] { 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray6, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d }, 1.0E-15);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        double[] doubleArray4 = new double[] { (byte) 0, 1.0d, 1.0E8d, 5.0d };
        double[] doubleArray6 = new double[] { 0.001d };
        double[] doubleArray10 = new double[] { 1.0E10d, 10.0d, (short) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 1.0E8d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E10d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        double[] doubleArray5 = new double[] { (-1.0f), 1.0E-8d, (byte) 1, '#', (-0.0d) };
        double[] doubleArray10 = new double[] { 512.0d, 1.0d, 0.001d, (short) 1 };
        double[] doubleArray12 = new double[] { 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray10, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-8d, 1.0d, 35.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 512.0d, 1.0d, 0.001d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        double[] doubleArray4 = new double[] { 0.25d, '4', (-10.0d), 100L };
        double[] doubleArray11 = new double[] { 10L, (-1.0f), (short) 100, 10.0f, 1, 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 52.0d, (-10.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, (-1.0d), 100.0d, 10.0d, 1.0d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        double[] doubleArray5 = new double[] { 100, (short) 10, 1.0E10d, (byte) 100, (byte) 1 };
        double[] doubleArray8 = new double[] { (-1.0d), 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 1.0E10d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        double[] doubleArray4 = new double[] { 10, (-10.0d), 100L, 0L };
        double[] doubleArray8 = new double[] { (-1), 0.25d, 1000000.0d };
        double[] doubleArray10 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-10.0d), 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.25d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        double[] doubleArray1 = new double[] { (short) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { 100L, 1.0E8d, 'a', 256.0d, (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E8d, 97.0d, 256.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        double[] doubleArray3 = new double[] { 100.0d, (short) 1, 1.0f };
        double[] doubleArray9 = new double[] { 1.0E-15d, 10.0f, 1.0E8d, (-100.0d), (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray9, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-15d, 10.0d, 1.0E8d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        double[] doubleArray5 = new double[] { 1.0E-4d, 0.0f, 1L, (short) 10, (short) 1 };
        double[] doubleArray12 = new double[] { 1.0E-6d, 0.01d, 2.0d, (-100.0d), 10000.0d, 100L };
        double[] doubleArray13 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray12, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 0.0d, 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-6d, 0.01d, 2.0d, (-100.0d), 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 42.0d, 0.1d, 100.0d, (-1), 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 0.1d, 100.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        double[] doubleArray6 = new double[] { (short) 100, 1.0E-8d, 100.0d, 1.0E-8d, 1024.0d, 2.0d };
        double[] doubleArray9 = new double[] { 0.3333333d, 256.0d };
        double[] doubleArray13 = new double[] { (byte) 10, 0.1d, 1.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0E-8d, 100.0d, 1.0E-8d, 1024.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.3333333d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        double[] doubleArray5 = new double[] { 100L, 0.0d, (-10.0d), 1L, (byte) 0 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, (-10.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        double[] doubleArray3 = new double[] { 0.0d, '#', 0L };
        double[] doubleArray7 = new double[] { (short) 0, 1.0E-15d, 1.0E-6d };
        double[] doubleArray8 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray7, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E-15d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        double[] doubleArray6 = new double[] { (short) 10, (-1.0d), (-10.0d), 0.5d, 256.0d, (-0.0d) };
        double[] doubleArray10 = new double[] { 1024.0d, (byte) 0, 100.0d };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), (-10.0d), 0.5d, 256.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        double[] doubleArray5 = new double[] { 0.01d, '4', 10.0d, 100.0d, 10.0f };
        double[] doubleArray12 = new double[] { 0.0d, 0.3333333d, (short) 10, (-1.0f), (-1.0d), ' ' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.01d, 52.0d, 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.3333333d, 10.0d, (-1.0d), (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        double[] doubleArray5 = new double[] { ' ', (byte) 0, 512.0d, 1, '#' };
        double[] doubleArray11 = new double[] { 0.01d, (short) 100, 1.0E-8d, 0.9d, 1L };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d, 512.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.01d, 100.0d, 1.0E-8d, 0.9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        double[] doubleArray6 = new double[] { 1.0E-8d, (byte) 10, 10000.0d, (-1.0E10d), 1.0f, 0.5d };
        double[] doubleArray9 = new double[] { (short) 1, 10000.0d };
        double[] doubleArray15 = new double[] { 1.0E-12d, (-0.0d), 5.0d, 100.0d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 10.0d, 10000.0d, (-1.0E10d), 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-12d, (-0.0d), 5.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        double[] doubleArray4 = new double[] { (-1), 1.0E-10d, 1.0d, '#' };
        double[] doubleArray11 = new double[] { 0.001d, 0.70710678d, 0.25d, 1024.0d, 0.0d, (short) -1 };
        double[] doubleArray13 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0E-10d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.001d, 0.70710678d, 0.25d, 1024.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        double[] doubleArray2 = new double[] { (short) 10, (-1L) };
        double[] doubleArray5 = new double[] { 0.0d, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray2);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        double[] doubleArray2 = new double[] { (-1L), (byte) 100 };
        double[] doubleArray9 = new double[] { 100L, 0.0d, 0.0d, 10, (-0.0d), 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 0.0d, 0.0d, 10.0d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, 100.0f, 1.0E-10d, (short) 1, 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 1.0E-10d, 1.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-10.0d), 100, 0.25d, (-1) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 100.0d, 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        double[] doubleArray5 = new double[] { 1.0d, 100.0d, 0.5d, 1.0E10d, (-100.0d) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 0.5d, 1.0E10d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        double[] doubleArray4 = new double[] { 1.0E-10d, 0.0d, 0.25d, 0.70710678d };
        double[] doubleArray10 = new double[] { (-1), (byte) 1, (-1), 1.0E10d, (byte) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray4);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-10d, 0.0d, 0.25d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0d, (-1.0d), 1.0E10d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d }, 1.0E-15);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray2, doubleArray1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        double[] doubleArray6 = new double[] { 0.1d, 0.5d, 0.9d, 10.0d, 1000000.0d, 'a' };
        double[] doubleArray11 = new double[] { 5.0d, 1.0E-12d, 10.0d, 0.3333333d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray11, doubleArray6);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.1d, 0.5d, 0.9d, 10.0d, 1000000.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 5.0d, 1.0E-12d, 10.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        double[] doubleArray3 = new double[] { (-1), (short) 1, 10.0d };
        double[] doubleArray8 = new double[] { 1.0E-4d, 0L, 100.0d, 1.0E-12d };
        double[] doubleArray11 = new double[] { 1.0E-12d, (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray8, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 0.0d, 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.70710678d };
        double[] doubleArray4 = new double[] { 0.3333333d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        double[] doubleArray2 = new double[] { 1.0E-12d, 5.0d };
        double[] doubleArray6 = new double[] { 1000000.0d, '4', 0.9d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-12d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 52.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        double[] doubleArray3 = new double[] { (byte) 10, 10000.0d, 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        double[] doubleArray5 = new double[] { 1000000.0d, 0.1d, 'a', 5.0d, 1.0E10d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { 10.0d, 1000000.0d, 'a' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 0.1d, 97.0d, 5.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1000000.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        double[] doubleArray2 = new double[] { (short) 10, 1.0E-8d };
        double[] doubleArray5 = new double[] { 10, 100.0f };
        double[] doubleArray10 = new double[] { ' ', 1.0E-8d, 1.0E-8d, 100L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 1.0E-8d, 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        double[] doubleArray5 = new double[] { 512.0d, 0L, (-1), (byte) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 'a', '#', 2.0d, 1.0d, 256.0d };
        double[] doubleArray15 = new double[] { (-1), 0.25d, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 0.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 97.0d, 35.0d, 2.0d, 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 0.25d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        double[] doubleArray6 = new double[] { 1.0E-6d, (-100.0d), 0.5d, 1.0E-15d, 0, 0.3333333d };
        double[] doubleArray10 = new double[] { 10.0d, 10.0d, (-10.0d) };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, (-100.0d), 0.5d, 1.0E-15d, 0.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        double[] doubleArray2 = new double[] { 1.0E-4d, 1.0E-12d };
        double[] doubleArray8 = new double[] { 0.3333333d, 0.0f, 100, (-0.0d), 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 0.0d, 100.0d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        double[] doubleArray2 = new double[] { 0, 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        double[] doubleArray4 = new double[] { 10.0d, 1L, 5.0d, 100.0d };
        double[] doubleArray8 = new double[] { (byte) 0, 10.0d, 10.0d };
        double[] doubleArray14 = new double[] { 1.0d, 10000.0d, 256.0d, (-1L), 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10000.0d, 256.0d, (-1.0d), 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        double[] doubleArray4 = new double[] { '#', 10.0d, 1000000.0d, 2.0d };
        double[] doubleArray8 = new double[] { 0.5d, 0.3333333d, 1.0E8d };
        double[] doubleArray15 = new double[] { (short) 1, 1024.0d, 256.0d, 0.0d, (-1.0E10d), 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray15);
        java.lang.Class<?> wildcardClass17 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 10.0d, 1000000.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d, 0.3333333d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1024.0d, 256.0d, 0.0d, (-1.0E10d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.70710678d, 0L, 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        double[] doubleArray6 = new double[] { (short) 10, 100.0d, 10.0d, (-1.0d), 10000.0d, 5.0d };
// flaky "6) test293(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 10.0d, (-1.0d), 10000.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray4 = new double[] { (short) 0, 1.0f };
        double[] doubleArray11 = new double[] { 1.0E-6d, 10, 10000.0d, ' ', 100L, 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 10.0d, 10000.0d, 32.0d, 100.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        double[] doubleArray3 = new double[] { (byte) 0, 0, 10000.0d };
        double[] doubleArray8 = new double[] { 10.0d, 0.1d, 0.0d, 1.0E-6d };
        double[] doubleArray14 = new double[] { 0.3333333d, '4', 1.0f, (short) -1, 2.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray8, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.1d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.3333333d, 52.0d, 1.0d, (-1.0d), 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        double[] doubleArray4 = new double[] { (short) 10, (short) 0, 1000000.0d, 1.0E-4d };
        double[] doubleArray9 = new double[] { (-1.0d), 0.001d, 100.0d, (byte) 100 };
        double[] doubleArray12 = new double[] { 0.0d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 1000000.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.001d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        double[] doubleArray4 = new double[] { (byte) -1, 1L, 1.0f, 10000.0d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        double[] doubleArray2 = new double[] { 10.0d, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        double[] doubleArray6 = new double[] { 512.0d, 2.0d, 0L, 1.0E-12d, '4', 100 };
// flaky "2) test299(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 2.0d, 0.0d, 1.0E-12d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        double[] doubleArray5 = new double[] { 1L, 100.0f, 42.0d, 1.0E-15d, (short) 10 };
        double[] doubleArray6 = null;
        double[] doubleArray9 = new double[] { 1024.0d, 1000000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 42.0d, 1.0E-15d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1024.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        double[] doubleArray2 = new double[] { 0.9d, 1.0E-15d };
        double[] doubleArray4 = new double[] { (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray8 = new double[] { 1.0E10d, (-1.0d), 10L, 1.0E-12d, 0.0d, 0.0d };
        double[] doubleArray10 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray8, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, (-1.0d), 10.0d, 1.0E-12d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d }, 1.0E-15);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        double[] doubleArray4 = new double[] { 0.70710678d, (-1L), (short) -1, 0.5d };
        double[] doubleArray6 = new double[] { 1.0E-15d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, (-1.0d), (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        double[] doubleArray5 = new double[] { ' ', 1.0E-12d, 0.001d, 0, 1024.0d };
// flaky "7) test304(randoop.tests.RegressionTest0)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 1.0E-12d, 0.001d, 0.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        double[] doubleArray2 = new double[] { 10.0d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        double[] doubleArray2 = new double[] { 1.0E-4d, 0 };
        double[] doubleArray5 = new double[] { 2.0d, 0.001d };
        double[] doubleArray8 = new double[] { (-1.0f), 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray5, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 2.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        double[] doubleArray5 = new double[] { 1.0E-12d, 0.25d, (-1L), 0.1d, 100L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 0.25d, (-1.0d), 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        double[] doubleArray5 = new double[] { ' ', (byte) 0, '4', (-100.0d), (byte) 10 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d, 52.0d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        double[] doubleArray4 = new double[] { 0.001d, 100.0d, 1.0E8d, 0.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 100.0d, 1.0E8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        double[] doubleArray5 = new double[] { 0.25d, (-1.0d), 0, 1.0E8d, 10L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.25d, (-1.0d), 0.0d, 1.0E8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        double[] doubleArray3 = new double[] { 0.0d, 42.0d, (-1.0d) };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        double[] doubleArray10 = new double[] { 1L, 42.0d, (byte) 1, 2.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 42.0d, 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-10d, 0.5d, (-1.0d), 0.70710678d, (byte) 10, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-10d, 0.5d, (-1.0d), 0.70710678d, 10.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        double[] doubleArray2 = new double[] { 10.0f, '#' };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0d, 0.3333333d, 10L, 1000000.0d, 100.0d, 0.70710678d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.3333333d, 10.0d, 1000000.0d, 100.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        double[] doubleArray5 = new double[] { (-1.0E10d), (byte) -1, 1.0E-8d, (byte) 10, '#' };
        double[] doubleArray12 = new double[] { 10, 100L, (-1), 1.0f, (-10.0d), 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), (-1.0d), 1.0E-8d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 100.0d, (-1.0d), 1.0d, (-10.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.5d, (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.5d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray6 = new double[] { 0.9d, 1.0E-6d, 2.0d, (short) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 1.0E-6d, 2.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        double[] doubleArray6 = new double[] { 1.0E-8d, 10, 0.0f, 42.0d, 2.0d, 0L };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 10.0d, 0.0d, 42.0d, 2.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 10 };
        double[] doubleArray5 = new double[] { 0.0d, 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        double[] doubleArray5 = new double[] { ' ', (byte) 0, '4', (-100.0d), (byte) 10 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 0.0d, 52.0d, (-100.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        double[] doubleArray4 = new double[] { (byte) 10, 0.3333333d, 0.5d, (byte) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.3333333d, 0.5d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, 0.3333333d, 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 0.3333333d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        double[] doubleArray1 = new double[] { 'a' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray1);
        java.lang.Class<?> wildcardClass3 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        double[] doubleArray3 = new double[] { 0.01d, (-0.0d), '#' };
        double[] doubleArray8 = new double[] { 0L, (short) -1, '4', 42.0d };
        double[] doubleArray11 = new double[] { 100, (byte) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray8, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, (-0.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 52.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 0.25d };
        double[] doubleArray7 = new double[] { 1.0f, (short) 10, (byte) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        double[] doubleArray3 = new double[] { 0.0d, 0.25d, 1000000.0d };
        double[] doubleArray5 = new double[] { 1.0E-4d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray3);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.25d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E8d, 1, 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 1.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1L, (-1.0E10d), 0.5d, 10.0d, 1.0E10d, (short) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0E10d), 0.5d, 10.0d, 1.0E10d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        double[] doubleArray2 = new double[] { 100.0d, 0.1d };
        double[] doubleArray7 = new double[] { (byte) -1, 10000.0d, 0.70710678d, 0.70710678d };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray7, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 10000.0d, 0.70710678d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-8d, 0.70710678d, 1.0E8d, 1.0d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-8d, 0.70710678d, 1.0E8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        double[] doubleArray3 = new double[] { 5.0d, 100.0d, '#' };
        double[] doubleArray6 = new double[] { 100, (byte) 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray6, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 5.0d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        double[] doubleArray6 = new double[] { (-1.0d), 10, 10L, 1.0E-12d, (-1.0f), (short) 100 };
        double[] doubleArray7 = null;
        double[] doubleArray13 = new double[] { 100.0d, '#', 0.001d, (short) 1, 256.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray7, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 10.0d, 1.0E-12d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 35.0d, 0.001d, 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        double[] doubleArray6 = new double[] { 0, 10000.0d, 100.0d, (short) 0, (short) 100, 10 };
        double[] doubleArray9 = new double[] { (byte) 0, 100.0d };
        double[] doubleArray14 = new double[] { 1L, 1.0E-12d, 100.0d, (-1.0f) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10000.0d, 100.0d, 0.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 1.0E-12d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray2, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0d, 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0E8d, 1000000.0d, 1L, 1.0E-8d, 10 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, 1000000.0d, 1.0d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { (short) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-10.0d), (-0.0d), 'a', (-1.0E10d), 0 };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray7, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-10.0d), (-0.0d), 97.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        double[] doubleArray2 = new double[] { 1024.0d, 1.0E-8d };
        double[] doubleArray7 = new double[] { 100, 1.0E-8d, 0.0f, (byte) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1024.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-8d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        double[] doubleArray6 = new double[] { 2.0d, 1000000.0d, 0.25d, 10000.0d, 10000.0d, 1.0E-6d };
        double[] doubleArray11 = new double[] { (-100.0d), 0.25d, 1.0d, 10.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray11, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 1000000.0d, 0.25d, 10000.0d, 10000.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-100.0d), 0.25d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        double[] doubleArray3 = new double[] { 1.0E8d, (short) 1, (-1.0f) };
        double[] doubleArray5 = new double[] { 0.0f };
        double[] doubleArray12 = new double[] { 1.0E10d, 512.0d, 1.0f, 0, (-0.0d), 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E10d, 512.0d, 1.0d, 0.0d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        double[] doubleArray4 = new double[] { (byte) 100, (byte) 100, (byte) 10, 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        double[] doubleArray4 = new double[] { 100.0f, (-100.0d), 100L, (-0.0d) };
        double[] doubleArray6 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-100.0d), 100.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        double[] doubleArray5 = new double[] { 42.0d, 100L, 0.001d, (short) -1, 512.0d };
        double[] doubleArray11 = new double[] { 10, 1.0E-12d, 10L, 1.0E-15d, (-1) };
        double[] doubleArray14 = new double[] { 1.0E-15d, 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 42.0d, 100.0d, 0.001d, (-1.0d), 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 1.0E-12d, 10.0d, 1.0E-15d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-15d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        double[] doubleArray5 = new double[] { (-0.0d), 1.0d, (-1.0d), 10, 1.0d };
        double[] doubleArray8 = new double[] { 5.0d, 100.0d };
        double[] doubleArray14 = new double[] { 0.0d, (byte) -1, 0.70710678d, (short) 100, (-10.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray8, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 1.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, (-1.0d), 0.70710678d, 100.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        double[] doubleArray6 = new double[] { (-1.0d), 10, 0.70710678d, 10.0d, 0, (-1.0d) };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 0.70710678d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        double[] doubleArray3 = new double[] { 0.9d, (-1.0E10d), 0.3333333d };
        double[] doubleArray10 = new double[] { 10.0d, 512.0d, 1.0d, 256.0d, (-1.0E10d), 1.0E-6d };
        double[] doubleArray15 = new double[] { 1.0E8d, (-1), 0.1d, (-1) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, (-1.0E10d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 512.0d, 1.0d, 256.0d, (-1.0E10d), 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E8d, (-1.0d), 0.1d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        double[] doubleArray2 = new double[] { 1.0E-15d, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        double[] doubleArray4 = new double[] { (short) 10, 'a', (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 1L, 0.70710678d, 0.0d, 0.001d };
        double[] doubleArray16 = new double[] { 0.70710678d, (byte) 100, (byte) 0, (-1.0f), 1.0d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.70710678d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.70710678d, 100.0d, 0.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        double[] doubleArray3 = new double[] { '#', (-1L), 0.01d };
        double[] doubleArray8 = new double[] { 1L, 0, (-1L), 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10000.0d, 100.0d, 10, 0L, '4' };
        double[] doubleArray10 = new double[] { 1.0E-10d, 1.0f, 100L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray6, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 100.0d, 10.0d, 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        double[] doubleArray3 = new double[] { 100.0d, 10000.0d, 1.0E-8d };
        double[] doubleArray7 = new double[] { 1.0E10d, 10000.0d, 512.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray7, doubleArray3);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10000.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, 10000.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        double[] doubleArray5 = new double[] { 0, 1.0E8d, 100, 0.0d, (-1L) };
        double[] doubleArray10 = new double[] { 0L, 1.0d, 1.0d, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray10, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E8d, 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 0.25d };
        double[] doubleArray7 = new double[] { 1.0f, (short) 10, (byte) -1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0E8d, (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray7 = new double[] { 1L, 1.0E-8d, 1L, 1.0E-10d, 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 1.0E-8d, 1.0d, 1.0E-10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        double[] doubleArray2 = new double[] { 0.0f, 1 };
        double[] doubleArray4 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray4, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        double[] doubleArray5 = new double[] { 1.0d, '4', '4', 100, (-100.0d) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 52.0d, 52.0d, 100.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        double[] doubleArray1 = new double[] { 0.25d };
        double[] doubleArray5 = new double[] { 1.0E-10d, (byte) 1, 5.0d };
        double[] doubleArray7 = new double[] { (-0.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d, 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 42.0d, 2.0d };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        double[] doubleArray5 = new double[] { 1.0E-15d, 1024.0d, 1.0E10d, 1.0d, 0 };
        double[] doubleArray12 = new double[] { (byte) 1, 0.0f, (-100.0d), (-1.0d), (-10.0d), (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray12, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 1024.0d, 1.0E10d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, (-100.0d), (-1.0d), (-10.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 1.0E10d };
        double[] doubleArray6 = new double[] { 100.0d, 0.1d, 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.1d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        double[] doubleArray6 = new double[] { 100L, 1.0d, (byte) -1, 10L, 1.0E10d, 100L };
        double[] doubleArray10 = new double[] { 1L, (-1L), 0L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, (-1.0d), 10.0d, 1.0E10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray5 = new double[] { 0.0d, (byte) 10, 'a' };
        double[] doubleArray12 = new double[] { (-1.0d), (byte) 1, (-0.0d), 1.0d, 1024.0d, 0.3333333d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray5, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, (-0.0d), 1.0d, 1024.0d, 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        double[] doubleArray3 = new double[] { 100.0d, 0.25d, 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.25d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { 0.25d, 1.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        double[] doubleArray4 = new double[] { 1.0E-6d, 1.0E10d, (-1.0d), 5.0d };
        double[] doubleArray10 = new double[] { 10.0f, 1.0E8d, 100.0f, '4', '4' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1.0E10d, (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0E8d, 100.0d, 52.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray3 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        double[] doubleArray2 = new double[] { 0L, 0.01d };
        double[] doubleArray8 = new double[] { 10.0d, '4', 0.001d, 0.70710678d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 52.0d, 0.001d, 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        double[] doubleArray4 = new double[] { ' ', 1000000.0d, 10L, (-0.0d) };
        double[] doubleArray11 = new double[] { ' ', 1, 1.0E-6d, '4', (-1.0E10d), (-10.0d) };
        double[] doubleArray12 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray11, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1000000.0d, 10.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 1.0d, 1.0E-6d, 52.0d, (-1.0E10d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 'a', 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        double[] doubleArray3 = new double[] { 100.0f, 'a', 0.5d };
        double[] doubleArray5 = new double[] { 'a' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 97.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        double[] doubleArray3 = new double[] { 0, 'a', 0.0d };
        double[] doubleArray6 = new double[] { (short) 100, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray6, doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        double[] doubleArray5 = new double[] { (-1.0E10d), 1L, (byte) 1, (byte) 1, (short) 0 };
        double[] doubleArray9 = new double[] { 1.0E-12d, 5.0d, 100 };
        double[] doubleArray16 = new double[] { 5.0d, (-100.0d), '4', 10.0d, 1000000.0d, 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray9, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 5.0d, (-100.0d), 52.0d, 10.0d, 1000000.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        double[] doubleArray6 = new double[] { 0.9d, 0, 1.0E-15d, 0.001d, (-100.0d), 1.0f };
        double[] doubleArray9 = new double[] { 1.0E-8d, 0.9d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 0.0d, 1.0E-15d, 0.001d, (-100.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-8d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        double[] doubleArray2 = new double[] { '4', 512.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        double[] doubleArray3 = new double[] { (-1.0E10d), 42.0d, 10.0f };
        double[] doubleArray4 = null;
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        double[] doubleArray3 = new double[] { 0.9d, 0.70710678d, 0 };
        double[] doubleArray6 = new double[] { 0L, (short) 0 };
        double[] doubleArray9 = new double[] { 0.5d, 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.9d, 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        double[] doubleArray3 = new double[] { 10.0f, 0.3333333d, 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.3333333d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        double[] doubleArray5 = new double[] { (short) -1, 1.0d, 10000.0d, (byte) 100, 10000.0d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { 0.001d, 42.0d, (-1), 1.0E-4d, (byte) 1, 0.1d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 10000.0d, 100.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.001d, 42.0d, (-1.0d), 1.0E-4d, 1.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        double[] doubleArray6 = new double[] { ' ', 1024.0d, 100.0d, (-10.0d), 1.0E8d, 100 };
        double[] doubleArray9 = new double[] { (short) 0, (-1) };
        double[] doubleArray12 = new double[] { 100.0f, 1024.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray12);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 1024.0d, 100.0d, (-10.0d), 1.0E8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        double[] doubleArray6 = new double[] { 1.0f, (byte) 10, (-10.0d), (short) -1, 10, 10.0f };
        double[] doubleArray12 = new double[] { (short) 10, 0.70710678d, 1.0E-12d, 1000000.0d, (-0.0d) };
        double[] doubleArray16 = new double[] { (-1L), 1.0E-10d, 1.0E-8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray12, doubleArray16);
        java.lang.Class<?> wildcardClass18 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, (-10.0d), (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.70710678d, 1.0E-12d, 1000000.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 1.0E-10d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        double[] doubleArray3 = new double[] { (byte) 0, (short) 100, (-1.0d) };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray3);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        double[] doubleArray4 = new double[] { 0.01d, 1.0E-4d, 1.0E-4d, 1.0E-6d };
        double[] doubleArray6 = new double[] { (-10.0d) };
        double[] doubleArray13 = new double[] { 1000000.0d, (-1.0f), 0.25d, (byte) 1, 0.001d, 1.0E-12d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.01d, 1.0E-4d, 1.0E-4d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1000000.0d, (-1.0d), 0.25d, 1.0d, 0.001d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        double[] doubleArray5 = new double[] { 5.0d, 0.3333333d, 1.0E10d, 10L, 1L };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray5);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d, 0.3333333d, 1.0E10d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        double[] doubleArray4 = new double[] { 256.0d, 0.70710678d, 10000.0d, 0L };
        double[] doubleArray8 = new double[] { 1.0E-10d, (-0.0d), 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 0.70710678d, 10000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, (-0.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        double[] doubleArray5 = new double[] { (short) 0, ' ', (-100.0d), 10000.0d, 1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0d, (short) -1, 10.0d, (short) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, (-100.0d), 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.001d, 0.01d, (byte) 0, 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 0.01d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        double[] doubleArray3 = new double[] { '#', 10.0d, 1.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        double[] doubleArray4 = new double[] { 1L, '4', 0.9d, 0L };
        double[] doubleArray5 = null;
        double[] doubleArray11 = new double[] { 512.0d, (-1.0d), (-1.0E10d), (byte) 1, (short) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray5, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 52.0d, 0.9d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 512.0d, (-1.0d), (-1.0E10d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        double[] doubleArray6 = new double[] { 512.0d, 42.0d, 1.0E-8d, 1.0E-12d, 256.0d, 100 };
        double[] doubleArray9 = new double[] { 10.0d, (-1L) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 42.0d, 1.0E-8d, 1.0E-12d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0, 256.0d, (short) 1, (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 256.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        double[] doubleArray2 = new double[] { 100.0d, (-1) };
        double[] doubleArray6 = new double[] { 1, (short) 10, 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray6, doubleArray2);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        double[] doubleArray3 = new double[] { 1.0E10d, (-1.0d), 0.5d };
        double[] doubleArray9 = new double[] { (-1.0d), (-100.0d), 0.001d, 100L, '#' };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray9, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), (-100.0d), 0.001d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        double[] doubleArray3 = new double[] { (byte) 10, 42.0d, 'a' };
        double[] doubleArray10 = new double[] { 0.70710678d, 0L, 10.0f, 0L, 0.70710678d, 1.0E-8d };
        double[] doubleArray15 = new double[] { ' ', 1.0E-4d, 10.0f, (byte) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 42.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.70710678d, 0.0d, 10.0d, 0.0d, 0.70710678d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 32.0d, 1.0E-4d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        double[] doubleArray6 = new double[] { 0.0f, 512.0d, 0.5d, 0, 1.0E-6d, 0.70710678d };
        double[] doubleArray10 = new double[] { 0, 0.001d, ' ' };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 512.0d, 0.5d, 0.0d, 1.0E-6d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.001d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        double[] doubleArray2 = new double[] { (byte) 1, 10L };
        double[] doubleArray9 = new double[] { 1, '#', 100.0d, 2.0d, 0.01d, 512.0d };
        double[] doubleArray11 = new double[] { 1000000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray9, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 35.0d, 100.0d, 2.0d, 0.01d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0d, 1024.0d, 'a', 0.1d, (short) 100, 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1024.0d, 97.0d, 0.1d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray6 = new double[] { 1.0E-10d, 0.0d, '4', (-1L) };
        double[] doubleArray12 = new double[] { 1.0E-8d, (-1.0E10d), '4', (byte) 100, 1.0E-10d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-10d, 0.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-8d, (-1.0E10d), 52.0d, 100.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 1.0E10d, 0.5d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E10d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}
