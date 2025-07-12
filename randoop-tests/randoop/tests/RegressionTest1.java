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
        double[] doubleArray5 = new double[] { (byte) -1, 1.0d, (short) 0, 1024.0d, 100 };
// flaky "1) test501(randoop.tests.RegressionTest1)":         org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 0.0d, 1024.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        double[] doubleArray6 = new double[] { 0.0f, 10.0f, 1.0f, 256.0d, 0.001d, '#' };
        double[] doubleArray13 = new double[] { 1.0f, 1, 1.0E-6d, 100.0d, 0.5d, (-100.0d) };
        double[] doubleArray19 = new double[] { 100.0d, (byte) -1, 10, (-100.0d), 10000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray13, doubleArray19);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 1.0d, 256.0d, 0.001d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 1.0d, 1.0E-6d, 100.0d, 0.5d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, (-1.0d), 10.0d, (-100.0d), 10000.0d }, 1.0E-15);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        double[] doubleArray6 = new double[] { 10, (short) -1, 10000.0d, 1.0E-10d, 0.001d, (-1L) };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0E10d), 1 };
        double[] doubleArray17 = new double[] { 512.0d, 0.001d, 1.0E-4d, '#', 10.0d, '#' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray17);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 10000.0d, 1.0E-10d, 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0E10d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 512.0d, 0.001d, 1.0E-4d, 35.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-100.0d) };
        double[] doubleArray5 = new double[] { (byte) 100, 1.0E-4d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        double[] doubleArray6 = new double[] { 10.0d, 0.70710678d, 0.9d, 0.0d, (-100.0d), 0.9d };
        double[] doubleArray9 = new double[] { 0.70710678d, 512.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray9, doubleArray9);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.70710678d, 0.9d, 0.0d, (-100.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        double[] doubleArray4 = new double[] { 10, (short) 100, 0.0d, (byte) 0 };
        double[] doubleArray10 = new double[] { (byte) 1, 0.1d, 2.0d, '4', (-1.0f) };
        double[] doubleArray16 = new double[] { (short) 1, (byte) -1, 1.0E10d, 0.01d, (byte) 1 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray16);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.1d, 2.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, (-1.0d), 1.0E10d, 0.01d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        double[] doubleArray3 = new double[] { 0L, (-1.0d), (short) 100 };
        double[] doubleArray5 = new double[] { 10 };
        double[] doubleArray7 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray5, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { (byte) 1, 10L };
        double[] doubleArray11 = new double[] { 1L, 0.01d, 10.0d, (-0.0d), 10.0f, (-1.0f) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 0.01d, 10.0d, (-0.0d), 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray4 = new double[] { 1.0E-6d, 1.0E-15d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        double[] doubleArray6 = new double[] { 0.0f, (-100.0d), (short) -1, (-1.0d), '#', 1.0E-15d };
        double[] doubleArray11 = new double[] { (-100.0d), ' ', 1024.0d, 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-100.0d), (-1.0d), (-1.0d), 35.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-100.0d), 32.0d, 1024.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        double[] doubleArray6 = new double[] { 10000.0d, 100.0f, '4', 0.9d, '#', (byte) 10 };
        double[] doubleArray10 = new double[] { 0.01d, (short) 0, 1.0f };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 100.0d, 52.0d, 0.9d, 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.01d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray5 = new double[] { (short) 1, 1.0E-8d, (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-8d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        double[] doubleArray4 = new double[] { 1.0E8d, 1.0E-4d, '#', 10000.0d };
        double[] doubleArray10 = new double[] { 1.0E-12d, 256.0d, 1.0E-8d, 100.0d, 0 };
        double[] doubleArray14 = new double[] { 0.70710678d, 1.0E-4d, (short) 100 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray10, doubleArray14);
        java.lang.Class<?> wildcardClass16 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 1.0E-4d, 35.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 256.0d, 1.0E-8d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.70710678d, 1.0E-4d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 42.0d, 0.0d, 10L, (-10.0d), (-0.0d), (byte) 0 };
        double[] doubleArray10 = new double[] { 1000000.0d, 1L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray7, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 42.0d, 0.0d, 10.0d, (-10.0d), (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1000000.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        double[] doubleArray2 = new double[] { 0.70710678d, (-1.0f) };
        double[] doubleArray3 = null;
        double[] doubleArray8 = new double[] { (-0.0d), 1024.0d, 0.01d, 1.0E-6d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.70710678d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-0.0d), 1024.0d, 0.01d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray4 = new double[] { 0.0d, 1L };
        double[] doubleArray6 = new double[] { 0.001d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray4, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        double[] doubleArray4 = new double[] { 10, (byte) 10, 1.0d, 1.0E8d };
        double[] doubleArray8 = new double[] { 10.0f, 2.0d, 10.0d };
        double[] doubleArray11 = new double[] { (-10.0d), 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray8, doubleArray11);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-10.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        double[] doubleArray4 = new double[] { 0.70710678d, (-1L), (short) -1, 0.5d };
        double[] doubleArray6 = new double[] { 1.0E-15d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray6, doubleArray7);
        java.lang.Class<?> wildcardClass9 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, (-1.0d), (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (byte) 1, 1024.0d, 100, ' ', 1000000.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray6, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1024.0d, 100.0d, 32.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        double[] doubleArray3 = new double[] { '#', (-1L), 0.01d };
        double[] doubleArray8 = new double[] { 1L, 0, (-1L), 5.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { 0.0f, ' ', 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        double[] doubleArray3 = new double[] { 1.0E-10d, 10.0f, 1.0E-8d };
        double[] doubleArray6 = new double[] { (-0.0d), 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        double[] doubleArray5 = new double[] { 1.0E-15d, 1024.0d, 1.0E10d, 1.0d, 0 };
        double[] doubleArray12 = new double[] { (byte) 1, 0.0f, (-100.0d), (-1.0d), (-10.0d), (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray12, doubleArray5);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 1024.0d, 1.0E10d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, (-100.0d), (-1.0d), (-10.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        double[] doubleArray5 = new double[] { 5.0d, 10L, (-1.0f), '4', (byte) 1 };
        double[] doubleArray10 = new double[] { (short) 10, (-1.0d), 'a', (byte) 100 };
        double[] doubleArray15 = new double[] { (byte) 10, 1.0E10d, '4', 0.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray10, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 5.0d, 10.0d, (-1.0d), 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 97.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 1.0E10d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        double[] doubleArray5 = new double[] { (-1.0E10d), 100, 5.0d, 0.3333333d, 0L };
        double[] doubleArray7 = new double[] { (-1.0E10d) };
        double[] doubleArray14 = new double[] { 1.0E-10d, 100.0d, 0.3333333d, (short) 10, 1.0d, 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray7, doubleArray14);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 100.0d, 5.0d, 0.3333333d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-10d, 100.0d, 0.3333333d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray8 = new double[] { (-100.0d), 0.5d, 0.1d, 1.0E-4d, 10.0d, 0.1d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray8);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-100.0d), 0.5d, 0.1d, 1.0E-4d, 10.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        double[] doubleArray3 = new double[] { (-1.0E10d), 42.0d, 10.0f };
        double[] doubleArray4 = null;
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray4, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0E10d), 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        double[] doubleArray2 = new double[] { 1.0E-8d, 512.0d };
        double[] doubleArray7 = new double[] { 0.5d, 1.0E-8d, 0.0d, 100L };
        double[] doubleArray13 = new double[] { (short) -1, 1.0f, (byte) 100, '#', (short) 0 };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray7, doubleArray13);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, 1.0E-8d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 100.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0E-6d, 1.0f };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0E-6d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        double[] doubleArray2 = new double[] { '#', 10 };
        double[] doubleArray8 = new double[] { 1L, 0.70710678d, 0.70710678d, 1.0E-8d, 10.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray8, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.70710678d, 0.70710678d, 1.0E-8d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0d, 100.0d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray3, doubleArray3);
        java.lang.Class<?> wildcardClass5 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (-10.0d), (-0.0d), 'a', (-1.0E10d), 0 };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray7, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-10.0d), (-0.0d), 97.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        double[] doubleArray5 = new double[] { 1.0E-6d, 1.0E10d, 1.0E8d, (short) 100, '#' };
        double[] doubleArray8 = new double[] { 10L, 100.0f };
        double[] doubleArray9 = null;
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray8, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, 1.0E10d, 1.0E8d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray4 = new double[] { (short) -1, 0.25d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray1, doubleArray1, doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.25d }, 1.0E-15);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 100 };
        double[] doubleArray5 = new double[] { (-1.0E10d), 10L };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray2, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        double[] doubleArray6 = new double[] { (-1.0d), 0.9d, 10, 0.25d, 42.0d, 0.0d };
        double[] doubleArray10 = new double[] { 1.0d, (short) 10, 0.0d };
        double[] doubleArray13 = new double[] { 100L, (-100.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray13);
        java.lang.Class<?> wildcardClass15 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.9d, 10.0d, 0.25d, 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        double[] doubleArray4 = new double[] { 1.0E-12d, (-1.0d), 10, 1.0E-4d };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, (-1.0d), 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0, 256.0d, (short) 1, (-1.0d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray5, doubleArray5);
        java.lang.Class<?> wildcardClass7 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 256.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        double[] doubleArray2 = new double[] { 10.0d, 0.0d };
        double[] doubleArray7 = new double[] { 0.3333333d, 10L, (-0.0d), '4' };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.3333333d, 10.0d, (-0.0d), 52.0d }, 1.0E-15);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        double[] doubleArray6 = new double[] { '4', 1000000.0d, '#', (byte) 0, 1.0d, 1 };
        double[] doubleArray10 = new double[] { 1.0E-15d, 1, 0.01d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray10, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 1000000.0d, 35.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-15d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        double[] doubleArray2 = new double[] { (short) 1, 0.9d };
        double[] doubleArray9 = new double[] { 0, 1.0E-6d, (short) 10, 1.0d, 42.0d, 1.0E8d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray2, doubleArray9);
        java.lang.Class<?> wildcardClass11 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-6d, 10.0d, 1.0d, 42.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { '4', 1L, (-1.0E10d) };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray0, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        double[] doubleArray2 = new double[] { 0.25d, (short) 100 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray2, doubleArray3, doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        double[] doubleArray3 = new double[] { (short) 1, (-10.0d), 100.0f };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray3, doubleArray3, doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-10.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray7 = new double[] { (byte) -1, 0.9d, 100.0d, 100.0d, 0.70710678d };
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray0, doubleArray1, doubleArray7);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.9d, 100.0d, 100.0d, 0.70710678d }, 1.0E-15);
    }
}
