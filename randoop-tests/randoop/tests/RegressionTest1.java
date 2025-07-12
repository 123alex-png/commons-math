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
        double[] doubleArray5 = new double[] { 1.0f, 1000000.0d, 1.0E-4d, 0.5d, 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1000000.0d, 1.0E-4d, 0.5d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 10, 100.0d, 100L, 1.0E-8d, 1.0E8d };
        double[] doubleArray8 = new double[] { 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, (double) (short) 1);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 100.0d, 1.0E-8d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        double[] doubleArray4 = new double[] { '4', 10000.0d, 0.0d, 1.0E-6d };
        double[] doubleArray6 = new double[] { (short) 10 };
        double[] doubleArray11 = new double[] { 10.0d, 0.01d, (-1.0d), 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray11, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 10000.0d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.01d, (-1.0d), 256.0d }, 1.0E-15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        double[] doubleArray6 = new double[] { (-1L), 256.0d, 1.0d, 1.0E-10d, 512.0d, 0.5d };
        double[] doubleArray13 = new double[] { 10.0d, 'a', 0.0d, (byte) 1, 42.0d, 256.0d };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray14, (-1.0E10d));
        java.lang.Class<?> wildcardClass17 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 256.0d, 1.0d, 1.0E-10d, 512.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 97.0d, 0.0d, 1.0d, 42.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        double[] doubleArray2 = new double[] { 0, 1.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        double[] doubleArray3 = new double[] { 0.001d, (-10.0d), 10.0d };
        double[] doubleArray10 = new double[] { (short) -1, (-0.0d), 0.25d, (short) 0, 0.9d, 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 1.0E-15d);
        java.lang.Class<?> wildcardClass13 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, (-10.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-0.0d), 0.25d, 0.0d, 0.9d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        double[] doubleArray2 = new double[] { 1.0E-4d, (-1.0f) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        double[] doubleArray3 = new double[] { 1.0E-8d, 1.0d, 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 0.3333333d);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-8d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        double[] doubleArray1 = new double[] { (-100.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { 0.0f, 0.001d, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.001d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        double[] doubleArray6 = new double[] { (-0.0d), 1.0E-15d, 1.0E8d, (-1.0f), (short) 10, (short) 10 };
        double[] doubleArray10 = new double[] { 0.3333333d, 'a', (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (-1.0d));
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-0.0d), 1.0E-15d, 1.0E8d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.3333333d, 97.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        double[] doubleArray5 = new double[] { 0.001d, 1.0E8d, 0.001d, 10.0f, 1L };
        double[] doubleArray12 = new double[] { (byte) 0, (-1.0E10d), 1.0d, 0.01d, 1.0E-4d, (-1.0d) };
        double[] doubleArray17 = new double[] { 10.0d, 100.0f, (-1.0f), (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray17, 1.0E8d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 1.0E8d, 0.001d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0E10d), 1.0d, 0.01d, 1.0E-4d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        double[] doubleArray2 = new double[] { 0.9d, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0E-6d);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.9d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        double[] doubleArray4 = new double[] { 1.0E8d, (-1.0E10d), 0L, 1.0E10d };
        double[] doubleArray9 = new double[] { 2.0d, 100.0f, 10.0d, (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, 1.0E-12d);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, (-1.0E10d), 0.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 2.0d, 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0E-12d, 1000000.0d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 1000000.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        double[] doubleArray3 = new double[] { (-100.0d), 10.0d, ' ' };
        double[] doubleArray6 = new double[] { 0.25d, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, 1024.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 10.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        double[] doubleArray3 = new double[] { 0.25d, 0L, 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { 0.5d, (byte) 10, (byte) 0, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray9, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.25d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.5d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, 1.0E-6d);
        double[] doubleArray7 = new double[] { 1024.0d, 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1024.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        double[] doubleArray6 = new double[] { 42.0d, 1.0E10d, 256.0d, (short) 10, 0L, 1000000.0d };
        double[] doubleArray13 = new double[] { 'a', 1, 100L, (-100.0d), 0.0d, 100.0d };
        double[] doubleArray15 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray15, (-10.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 1.0E10d, 256.0d, 10.0d, 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 97.0d, 1.0d, 100.0d, (-100.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        double[] doubleArray6 = new double[] { (byte) 0, 'a', '4', 1000000.0d, '#', (byte) 0 };
        double[] doubleArray10 = new double[] { 0L, 10L, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (-1.0d));
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 97.0d, 52.0d, 1000000.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        double[] doubleArray4 = new double[] { (-10.0d), 1.0E8d, (short) 10, 1.0E-8d };
        double[] doubleArray10 = new double[] { 42.0d, 1.0d, 1.0E-6d, 100, 1L };
        double[] doubleArray17 = new double[] { (byte) 0, (byte) -1, 'a', 1.0E10d, 1.0E10d, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray17, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 1.0E8d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 42.0d, 1.0d, 1.0E-6d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d, (-1.0d), 97.0d, 1.0E10d, 1.0E10d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        double[] doubleArray2 = new double[] { (byte) 100, 1.0E-4d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1.0f);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.01d, 1, (short) -1, 100.0f, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (-100.0d));
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 1.0d, (-1.0d), 100.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        double[] doubleArray6 = new double[] { (-1.0E10d), 0.3333333d, 1.0E-8d, 512.0d, 1.0E10d, 1.0E-15d };
        double[] doubleArray10 = new double[] { (-1.0E10d), 1.0E-6d, 0.25d };
        double[] doubleArray14 = new double[] { (-1), 0.1d, (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray14, (double) 100);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 0.3333333d, 1.0E-8d, 512.0d, 1.0E10d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0E10d), 1.0E-6d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 0.1d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        double[] doubleArray3 = new double[] { 42.0d, 1.0d, (short) 1 };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (-1.0d));
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 42.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        double[] doubleArray6 = new double[] { 100.0d, (-1), '4', 1.0E-15d, 0, 1 };
        double[] doubleArray11 = new double[] { 100L, (-0.0d), 100.0f, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, 42.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 52.0d, 1.0E-15d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-0.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        double[] doubleArray1 = new double[] { 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 1024.0d);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1.0E10d };
        double[] doubleArray8 = new double[] { 0.5d, (-1.0d), (short) 0, 1, 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, 1.0E-10d);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d, (-1.0d), 0.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        double[] doubleArray6 = new double[] { (short) 0, 1.0f, 1.0E10d, (short) 100, 1.0E-8d, 0.9d };
        double[] doubleArray10 = new double[] { 10000.0d, 1.0d, (byte) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0d, 1.0E10d, 100.0d, 1.0E-8d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10000.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (-10.0d));
        java.lang.Class<?> wildcardClass5 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        double[] doubleArray5 = new double[] { (-100.0d), 0.1d, 1000000.0d, 10L, (byte) 1 };
        double[] doubleArray10 = new double[] { 0.3333333d, 0.70710678d, (-1), '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray5, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 0.1d, 1000000.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.3333333d, 0.70710678d, (-1.0d), 52.0d }, 1.0E-15);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 42.0d, 1.0f, 0.0d, 256.0d, (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, 1.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 1.0d, 0.0d, 256.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0d, (-100.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, 0.0d);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        double[] doubleArray3 = new double[] { (-0.0d), 10, (-1.0d) };
        double[] doubleArray8 = new double[] { (byte) 0, 100, 10000.0d, 1.0d };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) 0);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-0.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 100.0d, 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        double[] doubleArray5 = new double[] { 0.0d, 256.0d, 1.0E8d, '#', 1.0f };
        double[] doubleArray9 = new double[] { 100.0d, (byte) 10, 0.0d };
        double[] doubleArray13 = new double[] { (short) 1, 42.0d, (-1L) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) (short) 100);
        java.lang.Class<?> wildcardClass16 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 256.0d, 1.0E8d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-12d, (-1.0d), 10.0d, (-100.0d), (byte) 10, 5.0d };
        double[] doubleArray13 = new double[] { 10L, 'a', 0.0d, (byte) 0, (short) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) 100.0f);
        java.lang.Class<?> wildcardClass16 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, (-1.0d), 10.0d, (-100.0d), 10.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 97.0d, 0.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        double[] doubleArray2 = new double[] { ' ', 1.0f };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        double[] doubleArray5 = new double[] { 1, 100, 1.0E-10d, 0.70710678d, 1L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 1.0E-12d);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1.0E-10d, 0.70710678d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        double[] doubleArray5 = new double[] { 10, 'a', (short) 10, (byte) 1, 100L };
        double[] doubleArray6 = null;
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray7, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray2, (-1.0E10d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        double[] doubleArray2 = new double[] { (-1L), (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0E10d), 0L, 1.0d, 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        double[] doubleArray4 = new double[] { 10.0d, 0.0d, 1, 1.0E10d };
        double[] doubleArray9 = new double[] { 1.0E-12d, 0.9d, 0, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray9, 10.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 1.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 0.9d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        double[] doubleArray2 = new double[] { 100, (-1.0f) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0E10d);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { ' ', 1000000.0d, 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, 10000.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1000000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray6 = new double[] { 0.0d, 100L, 42.0d, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 42.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        double[] doubleArray4 = new double[] { 1.0d, 0, 0L, 1L };
        double[] doubleArray7 = new double[] { 0.0d, 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, 0.0d);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        double[] doubleArray2 = new double[] { 1000000.0d, (-1.0d) };
        double[] doubleArray5 = new double[] { 1.0E-12d, 2.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (double) (short) -1);
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        double[] doubleArray6 = new double[] { 0.0f, 1.0E-8d, 512.0d, 5.0d, (short) 100, 0.0d };
        double[] doubleArray8 = new double[] { 100L };
        double[] doubleArray14 = new double[] { (short) -1, 1.0f, (byte) 100, '#', (short) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray14, 1.0E-10d);
        java.lang.Class<?> wildcardClass17 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-8d, 512.0d, 5.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 1.0d, 100.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        double[] doubleArray2 = new double[] { 42.0d, (byte) -1 };
        double[] doubleArray9 = new double[] { 1L, 2.0d, 1.0d, (byte) 10, 10.0d, 0.1d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, 0.70710678d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 2.0d, 1.0d, 10.0d, 10.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        double[] doubleArray3 = new double[] { 0.0d, (-1.0E10d), 0.5d };
        double[] doubleArray9 = new double[] { 100.0d, (-100.0d), (byte) 10, 256.0d, 1.0d };
        double[] doubleArray12 = new double[] { (short) 10, 1.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray12, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0E10d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-100.0d), 10.0d, 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        double[] doubleArray4 = new double[] { (short) -1, 1.0f, 10.0d, 10 };
        double[] doubleArray10 = new double[] { 0.0d, (-1), 100.0d, 100.0f, (-1.0f) };
        double[] doubleArray15 = new double[] { 1.0d, '#', (-1.0E10d), 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0d), 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 35.0d, (-1.0E10d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        double[] doubleArray4 = new double[] { 10.0f, 100.0d, 100, 10000.0d };
        double[] doubleArray9 = new double[] { (-100.0d), 1.0d, 0, (-1.0d) };
        double[] doubleArray15 = new double[] { 0.001d, (short) 0, (-10.0d), ' ', 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 100.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.001d, 0.0d, (-10.0d), 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        double[] doubleArray5 = new double[] { (-100.0d), (short) 10, 100.0f, (byte) 100, 0.01d };
        double[] doubleArray11 = new double[] { (byte) 1, 10.0d, '4', 'a', 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) 0.0f);
        java.lang.Class<?> wildcardClass14 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 10.0d, 100.0d, 100.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d, 52.0d, 97.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        double[] doubleArray4 = new double[] { (short) -1, (-1.0d), (-1.0d), (short) 1 };
        double[] doubleArray6 = new double[] { 1.0E-6d };
        double[] doubleArray9 = new double[] { 0.0d, 1.0E-6d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray9, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        double[] doubleArray6 = new double[] { 0.3333333d, (-1.0d), '4', 256.0d, 0.0d, 1.0d };
        double[] doubleArray12 = new double[] { (byte) -1, 2.0d, (short) 1, (byte) 100, 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.3333333d, (-1.0d), 52.0d, 256.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 2.0d, 1.0d, 100.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        double[] doubleArray5 = new double[] { 1.0E-6d, 1.0E10d, 1.0E8d, (short) 100, '#' };
        double[] doubleArray8 = new double[] { 10L, 100.0f };
        double[] doubleArray9 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray9, 0.01d);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-6d, 1.0E10d, 1.0E8d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        double[] doubleArray2 = new double[] { (short) 0, (-1) };
        double[] doubleArray5 = new double[] { 100.0f, 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (-0.0d));
        java.lang.Class<?> wildcardClass8 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        double[] doubleArray2 = new double[] { 10.0d, (short) 0 };
        double[] doubleArray6 = new double[] { 0.0d, 0.0d, 1.0d };
        double[] doubleArray9 = new double[] { (short) 10, (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, 100.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0d, 5.0d, 0.0d, 0.25d, 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, 1.0E10d);
        java.lang.Class<?> wildcardClass9 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 5.0d, 0.0d, 0.25d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        double[] doubleArray4 = new double[] { (-100.0d), (short) 0, (-1), 1.0E-4d };
        double[] doubleArray9 = new double[] { 1.0f, 10.0f, 10.0d, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (-0.0d));
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 0.0d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        double[] doubleArray6 = new double[] { 100L, 0.0d, 0.0d, 10, (-0.0d), 10 };
        double[] doubleArray11 = new double[] { 100L, (-0.0d), 1.0E-6d, 0.5d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 1.0f);
        java.lang.Class<?> wildcardClass14 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 0.0d, 0.0d, 10.0d, (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-0.0d), 1.0E-6d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray5 = new double[] { (-10.0d), (-1.0d), (byte) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray5, 5.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        double[] doubleArray3 = new double[] { '#', (byte) -1, 1.0E10d };
        double[] doubleArray8 = new double[] { 1.0E-12d, ' ', 0, 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, (-1.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-12d, 32.0d, 0.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        double[] doubleArray2 = new double[] { 1.0E-4d, 10.0d };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (double) (short) 100);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        double[] doubleArray5 = new double[] { (byte) 1, 0.0d, 0.0d, '4', 0.5d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 100.0f);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 0.0d, 52.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        double[] doubleArray6 = new double[] { 0.9d, 100, 5.0d, 1.0E-6d, '#', (short) 100 };
        double[] doubleArray11 = new double[] { (-1), (-1), (-0.0d), (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, 1.0E8d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.9d, 100.0d, 5.0d, 1.0E-6d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), (-0.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray6 = new double[] { (-1.0d), 0.001d, 1, 1.0E-6d };
        double[] doubleArray9 = new double[] { 0L, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, 0.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.001d, 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0L, (-1), 0.1d, (short) 10 };
        double[] doubleArray10 = new double[] { 1.0E-12d, (byte) 0, 1.0E10d, 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray10, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, (-1.0d), 0.1d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 0.0d, 1.0E10d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        double[] doubleArray3 = new double[] { (byte) 0, 0.0d, 1.0E-15d };
        double[] doubleArray8 = new double[] { 1.0d, 1L, 100.0d, 2.0d };
        double[] doubleArray15 = new double[] { 0.01d, 0.9d, '#', 1L, 1.0E-10d, 512.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray15, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.01d, 0.9d, 35.0d, 1.0d, 1.0E-10d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        double[] doubleArray6 = new double[] { 5.0d, 0.1d, 0.1d, 1.0E-12d, 2.0d, 0.001d };
        double[] doubleArray12 = new double[] { 1.0E-10d, 1000000.0d, (short) 0, (-1.0d), 10.0f };
        double[] doubleArray14 = new double[] { ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray14, 1.0E-15d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 0.1d, 0.1d, 1.0E-12d, 2.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-10d, 1000000.0d, 0.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        double[] doubleArray4 = new double[] { 1.0E10d, 1.0f, 10.0d, 512.0d };
        double[] doubleArray8 = new double[] { (-1.0d), 2.0d, 10.0f };
        double[] doubleArray14 = new double[] { 1.0d, 10, 1.0E-8d, 0.25d, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray14, (double) ' ');
        java.lang.Class<?> wildcardClass17 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 1.0d, 10.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 2.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10.0d, 1.0E-8d, 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        double[] doubleArray4 = new double[] { 512.0d, (byte) -1, 1.0f, 512.0d };
        double[] doubleArray8 = new double[] { 1.0E-8d, 100L, 1.0E8d };
        double[] doubleArray13 = new double[] { 42.0d, 2.0d, (short) 1, 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray13, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, (-1.0d), 1.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-8d, 100.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 42.0d, 2.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        double[] doubleArray6 = new double[] { 1.0E-4d, 1.0d, (-10.0d), (short) 100, 0.3333333d, 'a' };
        double[] doubleArray12 = new double[] { (byte) 100, (short) -1, 0.3333333d, 100.0d, 0.1d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, 1.0E-4d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-4d, 1.0d, (-10.0d), 100.0d, 0.3333333d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 0.3333333d, 100.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { 0.0f, ' ', 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (-1L));
        java.lang.Class<?> wildcardClass8 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        double[] doubleArray5 = new double[] { (-100.0d), (short) 10, 100.0f, (byte) 100, 0.01d };
        double[] doubleArray11 = new double[] { (byte) 1, 10.0d, '4', 'a', 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) 0.0f);
        java.lang.Class<?> wildcardClass14 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 10.0d, 100.0d, 100.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 10.0d, 52.0d, 97.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray5 = new double[] { 0.001d, 10.0d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        double[] doubleArray2 = new double[] { (short) -1, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 0L);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray6 = new double[] { 0.001d, 1L, (short) 0, 10L };
        double[] doubleArray11 = new double[] { 100.0f, (byte) 100, 10, 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        double[] doubleArray4 = new double[] { 1L, (-10.0d), (byte) 10, 0.0d };
        double[] doubleArray7 = new double[] { 1L, ' ' };
        double[] doubleArray11 = new double[] { 100L, 0.0d, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray11, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, (-10.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray4 = new double[] { 1.0E-6d, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (-0.0d));
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        double[] doubleArray5 = new double[] { 10.0d, 0.70710678d, 1.0E-8d, 100, (short) -1 };
        double[] doubleArray7 = new double[] { 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, 0.3333333d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.70710678d, 1.0E-8d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, (double) 100L);
        java.lang.Class<?> wildcardClass5 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.5d, 10, 0.5d, 1000000.0d, (-0.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) (byte) -1);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.5d, 10.0d, 0.5d, 1000000.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        double[] doubleArray6 = new double[] { (byte) 1, (-1.0d), 1.0E-4d, 0.3333333d, 1.0E-12d, (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.3333333d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 1.0E-4d, 0.3333333d, 1.0E-12d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        double[] doubleArray4 = new double[] { (short) 0, (byte) -1, 5.0d, (short) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 10.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 5.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        double[] doubleArray3 = new double[] { 0.01d, (byte) 0, 1.0E-10d };
        double[] doubleArray6 = new double[] { '#', 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) '#');
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.01d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        double[] doubleArray5 = new double[] { (-1L), 0.70710678d, (byte) 10, 1024.0d, (byte) -1 };
        double[] doubleArray8 = new double[] { 0L, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, 1.0E-6d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.70710678d, 10.0d, 1024.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        double[] doubleArray2 = new double[] { 1L, 1.0E-10d };
        double[] doubleArray8 = new double[] { 0.5d, 1.0E-4d, (short) 100, (byte) 0, 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 100.0f);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.5d, 1.0E-4d, 100.0d, 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        double[] doubleArray2 = new double[] { (-100.0d), 1.0E10d };
        double[] doubleArray5 = new double[] { 1.0E-4d, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, (-1.0E10d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d), 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-4d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        double[] doubleArray1 = new double[] { 0.3333333d };
        double[] doubleArray7 = new double[] { 0.0d, 0, (-1.0f), 0.01d, 100 };
        double[] doubleArray14 = new double[] { (-1.0f), (-0.0d), 1.0E-15d, 0, 1.0E-8d, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray14, (double) (-1L));
        java.lang.Class<?> wildcardClass17 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, (-1.0d), 0.01d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-0.0d), 1.0E-15d, 0.0d, 1.0E-8d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        double[] doubleArray4 = new double[] { 512.0d, 1.0d, (-1.0d), (byte) 100 };
        double[] doubleArray6 = new double[] { 0.01d };
        double[] doubleArray8 = new double[] { 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray8, 0.3333333d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        double[] doubleArray4 = new double[] { 100.0d, 10000.0d, 10, '#' };
        double[] doubleArray10 = new double[] { 1024.0d, 10.0f, 0L, 0.70710678d, 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (-10.0d));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 10000.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, 10.0d, 0.0d, 0.70710678d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        double[] doubleArray4 = new double[] { 256.0d, 512.0d, (short) 10, 1 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 42.0d, 512.0d, 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 512.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 42.0d, 512.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        double[] doubleArray3 = new double[] { 10.0d, (-1), 1.0f };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (-100.0d));
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        double[] doubleArray3 = new double[] { 0L, 100, (byte) 0 };
        double[] doubleArray9 = new double[] { (-1.0d), (short) 0, 100.0d, 10000.0d, 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 0.001d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 100.0d, 10000.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.001d, 10.0f, (byte) 1, (short) 0 };
        double[] doubleArray7 = new double[] { 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.001d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.25d }, 1.0E-15);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0d, (-1.0f) };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, 0.25d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        double[] doubleArray5 = new double[] { ' ', 10L, 100.0d, (byte) 100, 10 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 10.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        double[] doubleArray1 = new double[] { 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 1);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        double[] doubleArray2 = new double[] { 1000000.0d, 0.0f };
        double[] doubleArray9 = new double[] { 1.0E-12d, 1.0E-8d, (-10.0d), 100.0d, (short) 1, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, 256.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-12d, 1.0E-8d, (-10.0d), 100.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        double[] doubleArray5 = new double[] { (byte) 0, 1.0f, 1L, (-0.0d), 1.0d };
        double[] doubleArray10 = new double[] { 1.0d, 0.3333333d, 100.0f, 10.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (short) 1);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 1.0d, (-0.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.3333333d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.3333333d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        double[] doubleArray1 = new double[] { 0.3333333d };
        double[] doubleArray7 = new double[] { 0.0d, 0, (-1.0f), 0.01d, 100 };
        double[] doubleArray14 = new double[] { (-1.0f), (-0.0d), 1.0E-15d, 0, 1.0E-8d, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray14, (double) (-1L));
        java.lang.Class<?> wildcardClass17 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, (-1.0d), 0.01d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), (-0.0d), 1.0E-15d, 0.0d, 1.0E-8d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        double[] doubleArray6 = new double[] { (byte) -1, 1.0d, ' ', 42.0d, 42.0d, 100 };
        double[] doubleArray13 = new double[] { (-1), (short) 1, 0.9d, 10, 100L, 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, 0.9d);
        java.lang.Class<?> wildcardClass16 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 32.0d, 42.0d, 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 0.9d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        double[] doubleArray2 = new double[] { (-1.0E10d), 0.1d };
        double[] doubleArray3 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (double) (-1.0f));
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0E10d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        double[] doubleArray5 = new double[] { '#', (-1.0E10d), 1.0E-6d, 42.0d, '#' };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 0.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, (-1.0E10d), 1.0E-6d, 42.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        double[] doubleArray6 = new double[] { 5.0d, 1.0E-8d, 42.0d, 1.0E-15d, 1000000.0d, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 10.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 1.0E-8d, 42.0d, 1.0E-15d, 1000000.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray3 = new double[] { (-10.0d) };
        double[] doubleArray9 = new double[] { 256.0d, 10L, 1.0E-15d, 0.0d, (byte) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 256.0d, 10.0d, 1.0E-15d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        double[] doubleArray4 = new double[] { 0.70710678d, (byte) -1, 1.0E10d, '4' };
        double[] doubleArray8 = new double[] { 10.0d, ' ', (short) 0 };
        double[] doubleArray14 = new double[] { 1000000.0d, (short) 10, (-1.0f), 0, 1.0E-4d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray14, (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.70710678d, (-1.0d), 1.0E10d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1000000.0d, 10.0d, (-1.0d), 0.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        double[] doubleArray5 = new double[] { (-1.0E10d), 10.0f, (-100.0d), 1.0E-12d, (byte) -1 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 10.0d, (-100.0d), 1.0E-12d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 100 };
        double[] doubleArray5 = new double[] { 256.0d, (-10.0d) };
        double[] doubleArray11 = new double[] { 1.0E-12d, (-100.0d), 'a', 0.9d, (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray11, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 256.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, (-100.0d), 97.0d, 0.9d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray4 = new double[] { (short) 100, 1.0E-8d };
        double[] doubleArray10 = new double[] { 0.1d, (short) 0, 0.25d, 1.0E10d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray10, (-100.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.1d, 0.0d, 0.25d, 1.0E10d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        double[] doubleArray6 = new double[] { 5.0d, 'a', (byte) 100, (-1.0d), 1000000.0d, (short) 100 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { 1000000.0d, ' ', (short) -1, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 97.0d, 100.0d, (-1.0d), 1000000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1000000.0d, 32.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        double[] doubleArray2 = new double[] { (byte) 10, 0.001d };
        double[] doubleArray8 = new double[] { 0.9d, (-1), 'a', 0.0d, 1.0E-6d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, 0.9d);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9d, (-1.0d), 97.0d, 0.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        double[] doubleArray4 = new double[] { (short) 0, ' ', (-1.0d), 0.3333333d };
        double[] doubleArray8 = new double[] { 100.0d, (-1.0f), 1 };
        double[] doubleArray15 = new double[] { 1000000.0d, 10L, 0.1d, 0L, 10, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 32.0d, (-1.0d), 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1000000.0d, 10.0d, 0.1d, 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        double[] doubleArray2 = new double[] { 1.0E-15d, 1.0d };
        double[] doubleArray7 = new double[] { (byte) 100, (byte) 100, (byte) 10, 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) 10);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d, 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10.0d, 0.001d, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, 512.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.001d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10000.0d, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, 1.0E10d);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        double[] doubleArray4 = new double[] { 0.001d, (short) 1, 256.0d, (-1.0E10d) };
        double[] doubleArray10 = new double[] { 0.0d, 10, 1.0E-4d, 0L, 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) (byte) -1);
        java.lang.Class<?> wildcardClass13 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.001d, 1.0d, 256.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 1.0E-4d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        double[] doubleArray5 = new double[] { 10.0d, 5.0d, (byte) 0, (-0.0d), 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0E-10d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 5.0d, 0.0d, (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        double[] doubleArray4 = new double[] { 100.0d, (byte) -1, (-10.0d), 1.0d };
        double[] doubleArray6 = new double[] { '4' };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, 0.0d);
        java.lang.Class<?> wildcardClass10 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 0.3333333d);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        double[] doubleArray5 = new double[] { (-1L), 1.0E-15d, 100, 1.0E-6d, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0E-15d, 100.0d, 1.0E-6d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        double[] doubleArray6 = new double[] { (byte) 10, 1000000.0d, 1.0E-6d, 1.0f, 1.0E-6d, (byte) 1 };
        double[] doubleArray9 = new double[] { '#', 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, 1.0E-8d);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1000000.0d, 1.0E-6d, 1.0d, 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        double[] doubleArray3 = new double[] { 100.0f, 1.0E-6d, 1L };
        double[] doubleArray9 = new double[] { 512.0d, 256.0d, (byte) -1, 10L, 1 };
        double[] doubleArray14 = new double[] { 1.0E-6d, 1.0E8d, 1.0E10d, (short) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray14, (double) 100);
        java.lang.Class<?> wildcardClass17 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 512.0d, 256.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-6d, 1.0E8d, 1.0E10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        double[] doubleArray2 = new double[] { '4', 1.0E-12d };
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, (-1), 1024.0d, 0.25d, 1.0E-4d };
        double[] doubleArray16 = new double[] { 1.0f, (-1), 1.0E-4d, (-100.0d), (short) 100, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (-1.0E10d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 52.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, (-1.0d), (-1.0d), 1024.0d, 0.25d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, (-1.0d), 1.0E-4d, (-100.0d), 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        double[] doubleArray3 = new double[] { 1.0E-6d, 1.0E-12d, (byte) 10 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { 0.0f, 10.0f, (byte) 0, 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray9, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-6d, 1.0E-12d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        double[] doubleArray3 = new double[] { 'a', 0.5d, 5.0d };
        double[] doubleArray6 = new double[] { 0.0d, 1.0E-12d };
        double[] doubleArray8 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray8, 0.001d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.5d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-10.0d), 0.25d, 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) 100.0f);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-10.0d), 0.25d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        double[] doubleArray6 = new double[] { 1L, (short) -1, 10.0d, 1.0E-4d, 0.01d, 10 };
        double[] doubleArray11 = new double[] { 10, 0.70710678d, 512.0d, 0.1d };
        double[] doubleArray13 = new double[] { 1.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray13, (double) (-1.0f));
        java.lang.Class<?> wildcardClass16 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 10.0d, 1.0E-4d, 0.01d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.70710678d, 512.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        double[] doubleArray2 = new double[] { '#', 10L };
        double[] doubleArray8 = new double[] { 1024.0d, 42.0d, '#', 0.1d, 0.25d };
        double[] doubleArray15 = new double[] { 100.0d, 512.0d, (short) 100, (-1.0d), 100.0f, 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray15, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 35.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1024.0d, 42.0d, 35.0d, 0.1d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 512.0d, 100.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0d, 1.0d, 1.0E-8d, 10L, 0.25d };
        double[] doubleArray11 = new double[] { 0L, 1000000.0d, (byte) 1, (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, 1000000.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 1.0E-8d, 10.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1000000.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1.0E-8d, 10, 1L };
        double[] doubleArray11 = new double[] { 10000.0d, (byte) 100, 0.0d, '#', (-1L), 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray11, 0.0d);
        java.lang.Class<?> wildcardClass14 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-8d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10000.0d, 100.0d, 0.0d, 35.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        double[] doubleArray2 = new double[] { (short) -1, 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1L);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        double[] doubleArray4 = new double[] { 10.0f, (-1.0d), (short) 1, 0.5d };
        double[] doubleArray8 = new double[] { 1.0d, 1.0E-6d, 1.0d };
        double[] doubleArray15 = new double[] { 1.0E-6d, (short) -1, 100.0d, 1.0f, (short) -1, (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 1.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0E-6d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E-6d, (-1.0d), 100.0d, 1.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        double[] doubleArray3 = new double[] { (-1.0f), 0.0f, 1.0d };
        double[] doubleArray5 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { 1.0E-15d, 1.0E-12d, (byte) 1, 100.0f, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray11, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-15d, 1.0E-12d, 1.0d, 100.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        double[] doubleArray4 = new double[] { (byte) 1, 100, (-0.0d), 1.0E-6d };
        double[] doubleArray7 = new double[] { '#', 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (-1.0E10d));
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 100.0d, (-0.0d), 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        double[] doubleArray2 = new double[] { (-100.0d), (-1.0d) };
        double[] doubleArray8 = new double[] { (-0.0d), 1.0E-12d, 10.0d, 100.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-0.0d), 1.0E-12d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 1 };
        double[] doubleArray8 = new double[] { 100L, 10L, 1L, 10L, 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 10.0d, 1.0d, 10.0d, 0.9d }, 1.0E-15);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        double[] doubleArray1 = new double[] { 5.0d };
        double[] doubleArray5 = new double[] { (byte) 10, (short) 10, 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (short) -1);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        double[] doubleArray5 = new double[] { 10.0d, 10000.0d, 0.70710678d, 1.0d, 0.001d };
        double[] doubleArray10 = new double[] { 0.70710678d, 0.70710678d, (byte) 1, (-1.0E10d) };
        double[] doubleArray15 = new double[] { 1.0E10d, 0.9d, 5.0d, 1.0E-6d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10000.0d, 0.70710678d, 1.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.70710678d, 0.70710678d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0E10d, 0.9d, 5.0d, 1.0E-6d }, 1.0E-15);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        double[] doubleArray5 = new double[] { (short) -1, 100.0f, 0.5d, 1.0E-6d, (short) 0 };
        double[] doubleArray9 = new double[] { 10.0d, 0.3333333d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, 0.70710678d);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 0.5d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 0.3333333d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100, 0.01d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.01d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        double[] doubleArray4 = new double[] { 0.5d, (-0.0d), '4', 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 1.0E8d);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.5d, (-0.0d), 52.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        double[] doubleArray4 = new double[] { (short) 10, 'a', (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 1L, 0.70710678d, 0.0d, 0.001d };
        double[] doubleArray16 = new double[] { 0.70710678d, (byte) 100, (byte) 0, (-1.0f), 1.0d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray16, 1.0E-12d);
        java.lang.Class<?> wildcardClass19 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.70710678d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.70710678d, 100.0d, 0.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { 1, 5.0d };
        double[] doubleArray7 = new double[] { 10L, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray7, 0.70710678d);
        java.lang.Class<?> wildcardClass10 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-15d, 100L, (-0.0d), 0.0f };
        double[] doubleArray12 = new double[] { 0.3333333d, 0.3333333d, 100, 1.0d, (short) 10, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (-1.0E10d));
        java.lang.Class<?> wildcardClass15 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-15d, 100.0d, (-0.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.3333333d, 0.3333333d, 100.0d, 1.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        double[] doubleArray2 = new double[] { 1.0E-6d, (-1.0E10d) };
        double[] doubleArray3 = null;
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray4, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-6d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        double[] doubleArray1 = new double[] { 0.1d };
        double[] doubleArray4 = new double[] { (short) -1, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 2.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        double[] doubleArray4 = new double[] { 1.0E-12d, (-1.0d), 0L, 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 100L);
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { ' ', (-1.0d), 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) (byte) 0);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        double[] doubleArray1 = new double[] { 1.0E-6d };
        double[] doubleArray8 = new double[] { (short) 10, 256.0d, 0.3333333d, 1.0E-4d, 0.001d, 0.3333333d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, 0.5d);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 256.0d, 0.3333333d, 1.0E-4d, 0.001d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        double[] doubleArray6 = new double[] { 1L, 0.70710678d, '#', (byte) -1, (-10.0d), (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.70710678d, 35.0d, (-1.0d), (-10.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100.0d, 10.0d, 100L, 1L };
        double[] doubleArray8 = new double[] { (short) 100, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray8, (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        double[] doubleArray5 = new double[] { '#', 2.0d, 0.0d, 1.0d, 1.0E-15d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (-10.0d), (byte) 1, 0.3333333d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d, 2.0d, 0.0d, 1.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-10.0d), 1.0d, 0.3333333d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        double[] doubleArray3 = new double[] { 0.70710678d, 1L, 1L };
        double[] doubleArray5 = new double[] { 1024.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray6, 10000.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.70710678d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1.0E-4d, 512.0d, (-1.0E10d), 1.0E-12d, (byte) 100, 10.0d };
        double[] doubleArray14 = new double[] { 1.0E-6d, 1.0E-12d, 0.1d, 1.0E-4d, 1L, 0L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray14, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-4d, 512.0d, (-1.0E10d), 1.0E-12d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0E-6d, 1.0E-12d, 0.1d, 1.0E-4d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray6 = new double[] { 10.0d, 0L, (-1.0E10d), 0.0f };
        double[] doubleArray12 = new double[] { 1L, ' ', 0.0d, 100, ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, 512.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 0.0d, (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 32.0d, 0.0d, 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        double[] doubleArray5 = new double[] { 1000000.0d, 1, 100.0f, 0, 100L };
        double[] doubleArray11 = new double[] { 1.0E-12d, 0.9d, 1.0E8d, 1.0d, 1.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 1.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-12d, 0.9d, 1.0E8d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1000000.0d, 1.0d, 100, 1.0d, (-1L) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1000000.0d, 1.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray8 = new double[] { 1.0E-10d, 0.0d, 1.0E-12d, 0L, (-1.0E10d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray8, 1.0E-4d);
        java.lang.Class<?> wildcardClass11 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-10d, 0.0d, 1.0E-12d, 0.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray8 = new double[] { 0.3333333d, 2.0d, 1.0f, 0.001d, (byte) 0, 0.0f };
        double[] doubleArray11 = new double[] { (short) 100, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray11, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.3333333d, 2.0d, 1.0d, 0.001d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        double[] doubleArray4 = new double[] { '#', 1.0E-15d, 512.0d, 100.0f };
        double[] doubleArray9 = new double[] { 100.0d, (byte) 10, 10, 1.0d };
        double[] doubleArray15 = new double[] { 1L, 1.0E-15d, (-1.0f), 100, 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, 0.0d);
        java.lang.Class<?> wildcardClass18 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 1.0E-15d, 512.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 1.0E-15d, (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        double[] doubleArray6 = new double[] { 10, 42.0d, 100.0f, 1, 512.0d, 0.01d };
        double[] doubleArray11 = new double[] { 1.0E-6d, 0.01d, (short) 1, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 42.0d, 100.0d, 1.0d, 512.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 0.01d, 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        double[] doubleArray5 = new double[] { 1.0d, 1.0E-15d, (short) 10, (byte) 0, 0.9d };
        double[] doubleArray9 = new double[] { (byte) 100, 10000.0d, 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, 2.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0E-15d, 10.0d, 0.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (short) 10, 1.0E-6d, 1.0E-12d, 100L, (-1.0f), 10.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0E-6d, 1.0E-12d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        double[] doubleArray4 = new double[] { (-1L), '4', 0.5d, 100 };
        double[] doubleArray9 = new double[] { (byte) 10, 100L, (short) 100, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, 1.0E-15d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 52.0d, 0.5d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d, 100.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0.3333333d, 10.0f, 1.0E-4d };
        double[] doubleArray11 = new double[] { 1.0E-10d, 0.001d, 0.3333333d, 10.0d, 1.0d, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray11, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.3333333d, 10.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-10d, 0.001d, 0.3333333d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        double[] doubleArray4 = new double[] { 100L, 0.9d, (-0.0d), 10.0d };
        double[] doubleArray10 = new double[] { 0L, 100.0d, 0.0f, 1.0E-6d, 10000.0d };
        double[] doubleArray12 = new double[] { (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray12, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.9d, (-0.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 100.0d, 0.0d, 1.0E-6d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        double[] doubleArray2 = new double[] { 0.01d, (-1.0E10d) };
        double[] doubleArray6 = new double[] { (byte) -1, ' ', 100.0f };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 32.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        double[] doubleArray2 = new double[] { 1.0f, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 0.0d);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        double[] doubleArray6 = new double[] { 1.0E10d, (short) 1, 0.001d, 10, 1.0E-8d, 10 };
        double[] doubleArray10 = new double[] { (byte) 100, '#', (short) -1 };
        double[] doubleArray11 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray11, (double) 10);
        java.lang.Class<?> wildcardClass14 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 1.0d, 0.001d, 10.0d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        double[] doubleArray2 = new double[] { 1.0E-8d, (-1L) };
        double[] doubleArray7 = new double[] { 100L, 1.0E-10d, (byte) 100, 0 };
        double[] doubleArray14 = new double[] { (short) 1, 10000.0d, ' ', 42.0d, (-10.0d), (short) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray14, 0.5d);
        java.lang.Class<?> wildcardClass17 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0E-10d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10000.0d, 32.0d, 42.0d, (-10.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.1d, 1L, 0.1d, 1.0E-6d };
        double[] doubleArray11 = new double[] { 100L, 100L, 0.0f, 1.0d, (-1.0E10d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (-100.0d));
        java.lang.Class<?> wildcardClass14 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 1.0d, 0.1d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d, 0.0d, 1.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        double[] doubleArray2 = new double[] { (short) 10, 1.0E-8d };
        double[] doubleArray5 = new double[] { 10, 100.0f };
        double[] doubleArray10 = new double[] { ' ', 1.0E-8d, 1.0E-8d, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray10, (double) (short) 10);
        java.lang.Class<?> wildcardClass13 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 1.0E-8d, 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1), (short) 0, (-1L) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { ' ', 100.0d };
        double[] doubleArray7 = new double[] { 1.0d, 0.01d, 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray7, 1.0E-4d);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 32.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 0.01d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        double[] doubleArray0 = null;
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { 0.01d, 1.0E8d, 0.0f, 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray6, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 1.0E8d, 0.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 100.0d, 1L, (byte) 100, 0.001d, (byte) 0 };
        double[] doubleArray12 = new double[] { (-100.0d), 1.0f, 0L, 1024.0d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray12, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 100.0d, 0.001d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-100.0d), 1.0d, 0.0d, 1024.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        double[] doubleArray6 = new double[] { 1024.0d, (short) 100, 100.0f, 0.01d, 1.0E-12d, 0 };
        double[] doubleArray7 = null;
        double[] doubleArray12 = new double[] { 1.0E-4d, 1.0E-8d, 0.1d, 10.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 100.0d, 100.0d, 0.01d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-4d, 1.0E-8d, 0.1d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        double[] doubleArray6 = new double[] { (-100.0d), 0.0d, 100.0d, 1L, 10, (-1.0E10d) };
        double[] doubleArray10 = new double[] { 1.0E-15d, 100.0f, 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, 100.0d);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-100.0d), 0.0d, 100.0d, 1.0d, 10.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-15d, 100.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 1.0E10d, (short) 1, 100L };
        double[] doubleArray7 = new double[] { (byte) 10, (-1L) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray7, 1024.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray3 = new double[] { 1.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray3, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        double[] doubleArray6 = new double[] { (short) 0, (-1.0E10d), 0.70710678d, 0, (short) 1, 1.0E8d };
        double[] doubleArray12 = new double[] { 10.0f, (-1.0f), 100L, 1.0E-10d, (-0.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) 0);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0E10d), 0.70710678d, 0.0d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 100.0d, 1.0E-10d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        double[] doubleArray3 = new double[] { (-100.0d), 100L, 1.0E-10d };
        double[] doubleArray4 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, 512.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 100.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        double[] doubleArray1 = new double[] { 0.01d };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 0, 1.0E10d, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) (-1));
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E10d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        double[] doubleArray4 = new double[] { 1.0E-15d, 0.001d, 1.0E-4d, 1.0d };
        double[] doubleArray7 = new double[] { 1.0E-12d, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 0.001d, 1.0E-4d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-12d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        double[] doubleArray2 = new double[] { 10.0f, 100.0d };
        double[] doubleArray4 = new double[] { (-1.0E10d) };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray5, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        double[] doubleArray1 = new double[] { 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 100);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 10);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        double[] doubleArray3 = new double[] { (short) -1, 10L, 0.0d };
        double[] doubleArray8 = new double[] { 1.0E10d, 0.9d, 100L, 1.0f };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) (short) 0);
        java.lang.Class<?> wildcardClass12 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, 0.9d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 1, 256.0d, (-100.0d), (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray5, 1024.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 256.0d, (-100.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        double[] doubleArray4 = new double[] { (short) 100, 0.70710678d, (short) 100, 1.0E-6d };
        double[] doubleArray9 = new double[] { (-1), 100.0d, 1.0E-10d, (byte) 100 };
        double[] doubleArray15 = new double[] { (-1), 0.01d, 100.0f, 1.0E-4d, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, 512.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 0.70710678d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 100.0d, 1.0E-10d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 0.01d, 100.0d, 1.0E-4d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        double[] doubleArray5 = new double[] { (short) 1, 100, 0.9d, 100, 1.0E-6d };
        double[] doubleArray11 = new double[] { (-0.0d), 100L, 1.0E-12d, 0.9d, (short) -1 };
        double[] doubleArray15 = new double[] { (-1.0d), 1.0E-6d, 2.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 0.9d, 100.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 100.0d, 1.0E-12d, 0.9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0E-6d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        double[] doubleArray6 = new double[] { 2.0d, 100.0d, 1.0E-12d, (byte) 1, 1.0E8d, 10 };
        double[] doubleArray10 = new double[] { 1.0E-4d, 100, 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 100.0d, 1.0E-12d, 1.0d, 1.0E8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-4d, 100.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        double[] doubleArray3 = new double[] { (-1L), 1.0d, (short) 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray6, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        double[] doubleArray1 = new double[] { 1.0E-4d };
        double[] doubleArray8 = new double[] { 0.0d, 1L, (-1.0f), 1.0E-4d, 10, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) (-1));
        java.lang.Class<?> wildcardClass11 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0d, (-1.0d), 1.0E-4d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        double[] doubleArray2 = new double[] { 1L, 1.0E-6d };
        double[] doubleArray4 = new double[] { 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) 10);
        java.lang.Class<?> wildcardClass7 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        double[] doubleArray3 = new double[] { 1.0E-12d, 1.0d, (-1.0d) };
        double[] doubleArray8 = new double[] { (-1.0d), (-10.0d), 1.0E-6d, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 512.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), (-10.0d), 1.0E-6d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        double[] doubleArray5 = new double[] { 0.70710678d, (-1.0d), (-100.0d), 1.0E10d, 10000.0d };
        double[] doubleArray8 = new double[] { 1.0E10d, 1.0E-6d };
        double[] doubleArray10 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.70710678d, (-1.0d), (-100.0d), 1.0E10d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.1d, 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, 1.0E-4d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        double[] doubleArray4 = new double[] { 100.0f, (short) 1, '4', (short) 0 };
        double[] doubleArray9 = new double[] { (byte) 100, '#', 1L, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 100L);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 35.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10000.0d, 10L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, 1.0E10d);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { '#', 0.0f, (short) 10, (short) 10, (-0.0d), (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray0, 0.0d);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 0.0d, 10.0d, 10.0d, (-0.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10.0d, 100.0d, 100, 100L, (-1L), 1.0E-4d };
        double[] doubleArray9 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray9, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 100.0d, 100.0d, 100.0d, (-1.0d), 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10000.0d }, 1.0E-15);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        double[] doubleArray4 = new double[] { 42.0d, (short) -1, 1.0E8d, 1024.0d };
        double[] doubleArray5 = null;
        double[] doubleArray8 = new double[] { 10, (short) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray8, 0.0d);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, (-1.0d), 1.0E8d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        double[] doubleArray2 = new double[] { (byte) 100, 0.3333333d };
        double[] doubleArray4 = new double[] { 2.0d };
        double[] doubleArray9 = new double[] { 0.001d, 1.0d, 42.0d, (short) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray9, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.001d, 1.0d, 42.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.01d }, 1.0E-15);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0, (-1.0d), (short) 100, 0.0f, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (-1.0E10d));
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d), 100.0d, 0.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        double[] doubleArray4 = new double[] { 100.0d, 256.0d, 1L, 10.0f };
        double[] doubleArray9 = new double[] { 0.70710678d, 100.0f, 100.0d, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, (double) (short) 100);
        java.lang.Class<?> wildcardClass12 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 256.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.70710678d, 100.0d, 100.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 2.0d, (short) -1, 2.0d, (short) 0, (-1.0d) };
        double[] doubleArray8 = new double[] { (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, 10000.0d);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, (-1.0d), 2.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        double[] doubleArray2 = new double[] { 1.0E-15d, 0.001d };
        double[] doubleArray6 = new double[] { 10L, 1.0E8d, 0.5d };
        double[] doubleArray12 = new double[] { 100.0f, 1.0d, (short) 1, 100L, 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray12, 256.0d);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-15d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E8d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 1.0d, 100.0d, 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 'a', 1024.0d, 10, 1.0E-10d, 1, (short) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (-1.0d));
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 97.0d, 1024.0d, 10.0d, 1.0E-10d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 0.0d, 1024.0d, 1.0E8d, 1.0E-6d, (byte) -1 };
        double[] doubleArray12 = new double[] { 1.0E-4d, '4', (short) 0, 10.0d, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray12, (double) (byte) 1);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1024.0d, 1.0E8d, 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E-4d, 52.0d, 0.0d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        double[] doubleArray2 = new double[] { 2.0d, 0 };
        double[] doubleArray9 = new double[] { 100.0d, 1.0f, '4', (-1.0E10d), 0.5d, (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, 1000000.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 2.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1.0d, 52.0d, (-1.0E10d), 0.5d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        double[] doubleArray5 = new double[] { (-1.0E10d), 1.0E10d, ' ', 0.9d, 100.0d };
        double[] doubleArray7 = new double[] { 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), 1.0E10d, 32.0d, 0.9d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { (-10.0d), 0, 10.0f, (byte) -1, (short) 100 };
        double[] doubleArray9 = new double[] { 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray9, (-1.0d));
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-10.0d), 0.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        double[] doubleArray6 = new double[] { 0, '4', 42.0d, '#', (-1.0f), 42.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { 0.0f, 1.0E-12d, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray11, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 52.0d, 42.0d, 35.0d, (-1.0d), 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 1.0E-12d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        double[] doubleArray4 = new double[] { 512.0d, 0.25d, 1.0f, '#' };
        double[] doubleArray7 = new double[] { 512.0d, (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 0.25d, 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 512.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        double[] doubleArray4 = new double[] { 5.0d, 0.01d, (short) 1, 10L };
        double[] doubleArray8 = new double[] { 0.1d, (byte) 100, (byte) 1 };
        double[] doubleArray15 = new double[] { (byte) 0, 1.0E10d, 1L, 100L, 1L, (byte) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 0.01d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.1d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 1.0E10d, 1.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1), (short) 0, (byte) 10, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray7, (double) (short) 10);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        double[] doubleArray5 = new double[] { 1000000.0d, 0.1d, 'a', 5.0d, 1.0E10d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { 10.0d, 1000000.0d, 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray10, 0.0d);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1000000.0d, 0.1d, 97.0d, 5.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1000000.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, (double) '#');
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0d), 10000.0d, 1.0E-8d, 10000.0d, 0L };
        double[] doubleArray7 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray7, 5.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10000.0d, 1.0E-8d, 10000.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        double[] doubleArray6 = new double[] { 1024.0d, (-1.0f), (short) 100, (-1.0f), 0.0f, 0.1d };
        double[] doubleArray10 = new double[] { (byte) 1, 1.0E-12d, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, (-1.0d), 100.0d, (-1.0d), 0.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 1.0E-12d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        double[] doubleArray4 = new double[] { 10.0d, 100, (-1.0d), 10000.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray6, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, (-1.0d), 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        double[] doubleArray5 = new double[] { 0.5d, (-1.0f), 100L, 1.0f, 1.0d };
        double[] doubleArray9 = new double[] { (byte) 1, (byte) 0, 0.5d };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray10, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, (-1.0d), 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.1d, 5.0d, 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.1d, 5.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { (short) -1, (-100.0d) };
        double[] doubleArray8 = new double[] { '#', (byte) 1, 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 35.0d, 1.0d, 0.25d }, 1.0E-15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        double[] doubleArray5 = new double[] { 1.0d, (-1L), (-1.0E10d), 0.0d, (byte) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.001d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0E10d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        double[] doubleArray4 = new double[] { (-100.0d), (short) 10, (byte) 0, 10.0d };
        double[] doubleArray7 = new double[] { (short) 100, 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, 5.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0d, 10.0d, 1024.0d, 1.0E-6d, 1.0E-8d, (short) 10 };
        double[] doubleArray12 = new double[] { 10000.0d, 0.25d, 0L, 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray12, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, 1024.0d, 1.0E-6d, 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10000.0d, 0.25d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        double[] doubleArray3 = new double[] { 0.3333333d, (short) 1, 0.0f };
        double[] doubleArray4 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, 0.25d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3333333d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        double[] doubleArray5 = new double[] { 0.9d, 1.0d, 10.0d, 1, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 2.0d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 1.0d, 10.0d, 1.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray3 = new double[] { (short) 1 };
        double[] doubleArray5 = new double[] { 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray5, 0.01d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        double[] doubleArray5 = new double[] { (-1.0d), 100, 1, 100.0d, (short) 100 };
        double[] doubleArray9 = new double[] { '4', 1.0E-10d, 1.0d };
        double[] doubleArray13 = new double[] { 100.0d, (-1.0f), 512.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 52.0d, 1.0E-10d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-1.0d), 512.0d }, 1.0E-15);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        double[] doubleArray3 = new double[] { 10.0d, 256.0d, ' ' };
        double[] doubleArray5 = new double[] { (byte) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, 1.0E-6d);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 256.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        double[] doubleArray5 = new double[] { (-1L), 0.70710678d, 10.0d, (-1.0d), (short) 100 };
        double[] doubleArray11 = new double[] { (-1.0E10d), (-1.0d), (-0.0d), 0.3333333d, (-1.0d) };
        double[] doubleArray17 = new double[] { 10L, 0.70710678d, 0.0d, 1.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray17, (double) 10.0f);
        java.lang.Class<?> wildcardClass20 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.70710678d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0E10d), (-1.0d), (-0.0d), 0.3333333d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 0.70710678d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        double[] doubleArray5 = new double[] { 1.0E-12d, (byte) 0, (-0.0d), 0.001d, 0.25d };
        double[] doubleArray11 = new double[] { 1.0E-6d, 1.0E-10d, (byte) 0, (-1.0d), 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (-100.0d));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-12d, 0.0d, (-0.0d), 0.001d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0E-6d, 1.0E-10d, 0.0d, (-1.0d), 0.9d }, 1.0E-15);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        double[] doubleArray6 = new double[] { (-1L), 1, (byte) 10, (short) 1, (byte) 100, 2.0d };
        double[] doubleArray11 = new double[] { 0L, 2.0d, 100.0d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 10.0d, 1.0d, 100.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, 2.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        double[] doubleArray1 = new double[] { 1.0E-15d };
        double[] doubleArray4 = new double[] { 0.25d, (-100.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, (-100.0d) }, 1.0E-15);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 100, 0.0d, 0.1d, ' ', 0.1d };
        double[] doubleArray10 = new double[] { 2.0d, 1.0E-8d, (byte) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) 1L);
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 0.0d, 0.1d, 32.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 2.0d, 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        double[] doubleArray4 = new double[] { 100.0d, 100L, (byte) 1, 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (-1.0f));
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, 1.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        double[] doubleArray2 = new double[] { (-1.0d), 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) -1);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        double[] doubleArray6 = new double[] { (byte) 0, 'a', '4', 1000000.0d, '#', (byte) 0 };
        double[] doubleArray10 = new double[] { 0L, 10L, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (-1.0d));
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 97.0d, 52.0d, 1000000.0d, 35.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray4 = new double[] { 0.0f, 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0E10d };
        double[] doubleArray8 = new double[] { 0.25d, (short) 1, (-1.0f) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, 1.0E-6d);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.25d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0.25d, (byte) 1, (short) 1 };
        double[] doubleArray8 = new double[] { 1.0E-15d, 1.0E8d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.25d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-15d, 1.0E8d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        double[] doubleArray2 = new double[] { 1.0E-8d, (-1.0d) };
        double[] doubleArray5 = new double[] { (byte) -1, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        double[] doubleArray4 = new double[] { 1L, 100L, (-1), (-10.0d) };
        double[] doubleArray7 = new double[] { 256.0d, 0.1d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, 0.5d);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 100.0d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 256.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        double[] doubleArray3 = new double[] { 1.0E-4d, 100L, 10000.0d };
        double[] doubleArray7 = new double[] { '4', (-0.0d), 42.0d };
        double[] doubleArray12 = new double[] { 10L, 42.0d, 0.25d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) (short) 10);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-4d, 100.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 52.0d, (-0.0d), 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 42.0d, 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        double[] doubleArray5 = new double[] { (short) 10, 5.0d, '#', 0L, 0.25d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1000000.0d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 5.0d, 35.0d, 0.0d, 0.25d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        double[] doubleArray2 = new double[] { (short) 0, 1000000.0d };
        double[] doubleArray8 = new double[] { (short) -1, (byte) 1, (byte) 10, 1.0E-10d, 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, 10.0d);
        java.lang.Class<?> wildcardClass12 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 10.0d, 1.0E-10d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, 1000000.0d);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray6 = new double[] { 1.0E-6d, 0.01d, 10000.0d, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 0L);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d, 0.01d, 10000.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        double[] doubleArray2 = new double[] { 'a', 256.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] { 10, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray6, 1.0E10d);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        double[] doubleArray4 = new double[] { 0L, (-0.0d), 0.0d, 100.0f };
        double[] doubleArray6 = new double[] { '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) ' ');
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-0.0d), 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        double[] doubleArray0 = null;
        double[] doubleArray1 = null;
        double[] doubleArray2 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, 1.0E-6d);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        double[] doubleArray2 = new double[] { (-1.0d), 0.9d };
        double[] doubleArray6 = new double[] { 0.001d, 1.0E-4d, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray2, (double) '#');
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 1.0E-4d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        double[] doubleArray2 = new double[] { 100L, 0.5d };
        double[] doubleArray4 = new double[] { 1.0E-6d };
        double[] doubleArray7 = new double[] { 1.0E10d, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray7, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E10d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        double[] doubleArray1 = new double[] { 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 1.0E-6d);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        double[] doubleArray6 = new double[] { ' ', 1000000.0d, 10.0d, (-1.0E10d), ' ', 1.0E-4d };
        double[] doubleArray13 = new double[] { 1.0E-4d, (short) 0, 0, 512.0d, 256.0d, 1 };
        double[] doubleArray19 = new double[] { 100L, 0.1d, 10000.0d, 1.0f, 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray19, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 1000000.0d, 10.0d, (-1.0E10d), 32.0d, 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0E-4d, 0.0d, 0.0d, 512.0d, 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.1d, 10000.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray4 = new double[] { 256.0d, 1.0f };
        double[] doubleArray8 = new double[] { 1.0E-6d, 1L, 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, 512.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-6d, 1.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        double[] doubleArray3 = new double[] { (-1.0d), 1L, 1.0E-10d };
        double[] doubleArray6 = new double[] { (-1), 1024.0d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray7, (double) 0.0f);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        double[] doubleArray4 = new double[] { '4', 42.0d, (-10.0d), 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (-1.0d));
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 42.0d, (-10.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        double[] doubleArray1 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1.0f);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        double[] doubleArray6 = new double[] { 0L, 1.0E10d, 0.25d, 100L, 0.70710678d, 0 };
        double[] doubleArray9 = new double[] { 0, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 100);
        java.lang.Class<?> wildcardClass12 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 1.0E10d, 0.25d, 100.0d, 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        double[] doubleArray6 = new double[] { 100.0d, 100.0d, 1.0E8d, 10000.0d, 0, 0.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 1024.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d, 1.0E8d, 10000.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        double[] doubleArray5 = new double[] { 0.5d, 10L, 100.0d, 0.25d, (short) 100 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, 5.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.5d, 10.0d, 100.0d, 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray5 = new double[] { 0.9d, 100.0d, (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.9d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        double[] doubleArray2 = new double[] { 0.25d, (-1.0d) };
        double[] doubleArray9 = new double[] { (short) -1, 0.5d, 10L, 42.0d, 10.0f, 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.5d, 10.0d, 42.0d, 10.0d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        double[] doubleArray3 = new double[] { '#', 1.0E-8d, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 0);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 1.0E-8d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 0.0d);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-100.0d), 0.25d, 1.0d };
        double[] doubleArray5 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) (-1.0f));
        java.lang.Class<?> wildcardClass8 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        double[] doubleArray4 = new double[] { (-1), 5.0d, (-1.0d), 0.5d };
        double[] doubleArray7 = new double[] { (byte) 100, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 5.0d, (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        double[] doubleArray3 = new double[] { (-1L), 0.0d, 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (-1));
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray7 = new double[] { 0.70710678d, 1.0E10d, 1.0d, 512.0d, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) 10);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, 1.0E10d, 1.0d, 512.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0d, 1024.0d, 'a', 0.1d, (short) 100, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (double) 0L);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1024.0d, 97.0d, 0.1d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        double[] doubleArray2 = new double[] { 0.25d, 0L };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray9 = new double[] { 0.0d, (short) 0, 1.0E-8d, (byte) 0, 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray9, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d, 1.0E-8d, 0.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        double[] doubleArray6 = new double[] { (byte) 100, (byte) 1, 1.0E-6d, 5.0d, 0L, (byte) 0 };
        double[] doubleArray12 = new double[] { 512.0d, 0.0d, (-1.0E10d), 1024.0d, 2.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 1.0E-6d, 5.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 512.0d, 0.0d, (-1.0E10d), 1024.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0.5d, (-1.0d), 100, 100.0d, 10.0d, 1.0f };
        double[] doubleArray11 = new double[] { (-1L), 0.3333333d, (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray11, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.5d, (-1.0d), 100.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.3333333d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        double[] doubleArray5 = new double[] { (byte) -1, (short) 1, 0.5d, (byte) -1, (byte) 1 };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) (short) 10);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 0.5d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0E10d, 10000.0d, 100.0d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (short) 0);
        java.lang.Class<?> wildcardClass8 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, 10000.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1024.0d, (short) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, 100.0d);
        java.lang.Class<?> wildcardClass6 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1024.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        double[] doubleArray3 = new double[] { 100.0f, 0.9d, (-1.0d) };
        double[] doubleArray8 = new double[] { (short) -1, 1.0E-6d, 10000.0d, 0.3333333d };
        double[] doubleArray12 = new double[] { 0.0d, 10L, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray12, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.9d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0E-6d, 10000.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        double[] doubleArray3 = new double[] { 1.0d, 42.0d, 2.0d };
        double[] doubleArray6 = new double[] { 10.0d, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (short) -1);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 42.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        double[] doubleArray5 = new double[] { 512.0d, 1.0E-8d, 0.01d, 0.0f, 100 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray6, (double) ' ');
        double[] doubleArray13 = new double[] { (-100.0d), 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray13, 1.0E-4d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 512.0d, 1.0E-8d, 0.01d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-100.0d), 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        double[] doubleArray2 = new double[] { 100.0d, 1.0d };
        double[] doubleArray9 = new double[] { (-1.0d), 0.9d, 10, 0.25d, 42.0d, 0.0d };
        double[] doubleArray13 = new double[] { 1.0d, (short) 10, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray13, 0.5d);
        java.lang.Class<?> wildcardClass16 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.9d, 10.0d, 0.25d, 42.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        double[] doubleArray2 = new double[] { 1, 2.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 10.0d, 0.1d, (byte) 1 };
        double[] doubleArray7 = new double[] { (-100.0d), 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray7, (double) (byte) 10);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.1d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-100.0d), 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        double[] doubleArray6 = new double[] { 1, 1.0E-12d, 2.0d, 1L, 100L, 1.0E-12d };
        double[] doubleArray8 = new double[] { ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, 0.9d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0E-12d, 2.0d, 1.0d, 100.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        double[] doubleArray4 = new double[] { (byte) 1, 1.0E-4d, (-1.0f), (short) 10 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) 0, 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray8, 1.0E8d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0E-4d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        double[] doubleArray2 = new double[] { 100.0d, 2.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        double[] doubleArray4 = new double[] { (-1L), 42.0d, 10, (byte) 100 };
        double[] doubleArray10 = new double[] { (-1.0f), (-1.0E10d), 5.0d, 0.70710678d, (-0.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 42.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0E10d), 5.0d, 0.70710678d, (-0.0d) }, 1.0E-15);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0.70710678d, (byte) 10, '4', (byte) 10, 0.3333333d, 0.5d };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, 1.0E-4d);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, 10.0d, 52.0d, 10.0d, 0.3333333d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 100, (byte) 100, (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0.3333333d };
        double[] doubleArray9 = new double[] { 1.0E10d, 100L, 0.70710678d, 100, 'a', (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray9, (double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E10d, 100.0d, 0.70710678d, 100.0d, 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        double[] doubleArray2 = new double[] { 100L, '#' };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) 10.0f);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        double[] doubleArray3 = new double[] { (byte) -1, 100, (-0.0d) };
        double[] doubleArray8 = new double[] { 1.0E-4d, 1.0E8d, 0.25d, 10.0d };
        double[] doubleArray11 = new double[] { (-1.0E10d), 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray11, 0.0d);
        java.lang.Class<?> wildcardClass14 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-4d, 1.0E8d, 0.25d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0E10d), 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { (short) 100, 1.0d, 0.70710678d, 1.0E-6d, (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 1.0d, 0.70710678d, 1.0E-6d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        double[] doubleArray2 = new double[] { 1.0E-8d, 10 };
        double[] doubleArray7 = new double[] { (-1.0d), 1000000.0d, 1.0E-10d, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1000000.0d, 1.0E-10d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        double[] doubleArray2 = new double[] { 1.0d, (-1.0d) };
        double[] doubleArray4 = new double[] { ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, 1.0E-15d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d }, 1.0E-15);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        double[] doubleArray5 = new double[] { 10.0f, ' ', 'a', 1000000.0d, (-1.0d) };
        double[] doubleArray12 = new double[] { 1024.0d, 0.01d, (short) 100, (byte) 10, 10.0d, 42.0d };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray13, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 32.0d, 97.0d, 1000000.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1024.0d, 0.01d, 100.0d, 10.0d, 10.0d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray6 = new double[] { (-1.0E10d), 0.01d, 1.0E-12d, (byte) 0 };
        double[] doubleArray12 = new double[] { 100.0d, (-1.0d), (-1.0f), 'a', 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, 42.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0E10d), 0.01d, 1.0E-12d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), (-1.0d), 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        double[] doubleArray1 = new double[] { (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0d, 2.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 2.0d }, 1.0E-15);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0f, (-1.0d), 100, 1.0E8d, 1L, 256.0d };
        double[] doubleArray13 = new double[] { 0.0d, 0, 100.0f, 0.1d, 0L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) 1L);
        java.lang.Class<?> wildcardClass16 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), 100.0d, 1.0E8d, 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 0.0d, 100.0d, 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 'a', (-100.0d), 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, (-100.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        double[] doubleArray6 = new double[] { (-1.0f), 0.5d, 1.0d, 0.001d, 10, 0L };
        double[] doubleArray11 = new double[] { 0, (-1.0d), 10000.0d, 0.70710678d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.5d, 1.0d, 0.001d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d, (-1.0d), 10000.0d, 0.70710678d }, 1.0E-15);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        double[] doubleArray6 = new double[] { 1.0d, 0.0d, (-1.0d), (short) -1, 0L, 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 2.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d, (-1.0d), (-1.0d), 0.0d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        double[] doubleArray1 = new double[] { 1.0E-10d };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray3, 1.0E-6d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        double[] doubleArray3 = new double[] { 100, 100.0d, 100.0f };
        double[] doubleArray5 = new double[] { '#' };
        double[] doubleArray7 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, 1.0d);
        double[] doubleArray10 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray10, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        double[] doubleArray6 = new double[] { 42.0d, 0L, 1.0E-12d, 0.0d, (byte) 1, 1.0d };
        double[] doubleArray12 = new double[] { (short) 10, ' ', 0.3333333d, 0.3333333d, 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, 256.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 0.0d, 1.0E-12d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 32.0d, 0.3333333d, 0.3333333d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 1, 0, (short) 10, 1.0E-6d, (byte) 0 };
        double[] doubleArray12 = new double[] { 100L, ' ', 1.0f, ' ', 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 0.0d, 10.0d, 1.0E-6d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 32.0d, 1.0d, 32.0d, 1.0E-10d }, 1.0E-15);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        double[] doubleArray3 = new double[] { 1.0E-6d, 512.0d, 0 };
        double[] doubleArray6 = new double[] { (short) 1, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, 10.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-6d, 512.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        double[] doubleArray2 = new double[] { 100, (-1.0E10d) };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] { 5.0d, 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray6, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 5.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        double[] doubleArray3 = new double[] { 10.0d, 0.01d, 1.0E8d };
        double[] doubleArray5 = new double[] { 10.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.01d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { 42.0d, (short) 100, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, 256.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 42.0d, 100.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0E10d), 10.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, 0.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        double[] doubleArray6 = new double[] { ' ', 0L, 1000000.0d, 0.0d, 100.0d, 1024.0d };
        double[] doubleArray13 = new double[] { '#', 42.0d, (short) 10, (byte) 1, 10.0d, 0 };
        double[] doubleArray18 = new double[] { 0L, 1.0E-6d, 100L, 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray18, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 0.0d, 1000000.0d, 0.0d, 100.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 42.0d, 10.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 1.0E-6d, 100.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        double[] doubleArray5 = new double[] { 'a', 0, 42.0d, (short) 1, 1.0E-12d };
        double[] doubleArray7 = new double[] { 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, 0.0d, 42.0d, 1.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.9d }, 1.0E-15);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        double[] doubleArray5 = new double[] { (-0.0d), 512.0d, 1.0E-12d, 1.0E-10d, 1000000.0d };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 0.70710678d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-0.0d), 512.0d, 1.0E-12d, 1.0E-10d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        double[] doubleArray5 = new double[] { (-100.0d), 512.0d, 1.0d, 256.0d, 1.0E-15d };
        double[] doubleArray6 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, 512.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-100.0d), 512.0d, 1.0d, 256.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0, (short) 10, 1L, (byte) 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray5, 0.25d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        double[] doubleArray4 = new double[] { 1.0E-12d, 5.0d, 1.0d, (byte) 10 };
        double[] doubleArray10 = new double[] { 42.0d, 0.01d, '#', (short) 100, 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, 2.0d);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 5.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 42.0d, 0.01d, 35.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        double[] doubleArray6 = new double[] { (short) 0, 2.0d, 0.0d, 0.01d, (short) 10, 100L };
        double[] doubleArray12 = new double[] { 0L, (short) 10, ' ', (short) -1, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 2.0d, 0.0d, 0.01d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 32.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 2.0d, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) 10.0f);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 2.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray4 = new double[] { 512.0d, 1.0E-10d };
        double[] doubleArray10 = new double[] { (-1L), 1.0E-6d, 1.0f, 0.70710678d, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray10, (double) (short) 1);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 512.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0E-6d, 1.0d, 0.70710678d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        double[] doubleArray6 = new double[] { 0.001d, (-1), 10.0d, 1.0E-4d, (-1.0f), 10.0f };
        double[] doubleArray10 = new double[] { 0.3333333d, 5.0d, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (-0.0d));
        java.lang.Class<?> wildcardClass13 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, (-1.0d), 10.0d, 1.0E-4d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.3333333d, 5.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        double[] doubleArray3 = new double[] { 100.0d, (-10.0d), 0.001d };
        double[] doubleArray10 = new double[] { 0L, (-1.0f), 2.0d, ' ', (-1.0E10d), 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray3, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-10.0d), 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0d), 2.0d, 32.0d, (-1.0E10d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        double[] doubleArray4 = new double[] { (-100.0d), (-1.0d), (-1.0E10d), 0.0d };
        double[] doubleArray7 = new double[] { (-1.0E10d), 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 1L);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-100.0d), (-1.0d), (-1.0E10d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0E10d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        double[] doubleArray2 = new double[] { (-1.0d), 5.0d };
        double[] doubleArray7 = new double[] { (-1.0d), 0L, (short) 1, 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 0.0d, 1.0d, 5.0d }, 1.0E-15);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        double[] doubleArray2 = new double[] { (-1.0f), (-1.0d) };
        double[] doubleArray6 = new double[] { 0, 42.0d, 512.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 100L);
        java.lang.Class<?> wildcardClass9 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 42.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1), 1000000.0d, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, 10000.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1000000.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        double[] doubleArray2 = new double[] { 100.0d, 10.0d };
        double[] doubleArray6 = new double[] { 1.0d, 10.0f, 0.001d };
        double[] doubleArray10 = new double[] { 1.0E-8d, (-1.0E10d), (byte) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray10, 2.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-8d, (-1.0E10d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        double[] doubleArray5 = new double[] { 1.0E-15d, '4', 1.0E-4d, 1.0f, (short) 10 };
        double[] doubleArray7 = new double[] { 1.0E-6d };
        double[] doubleArray12 = new double[] { (-1L), (byte) 1, (short) -1, 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray12, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E-15d, 52.0d, 1.0E-4d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray8 = new double[] { 512.0d, 512.0d, 10.0d, 1.0E-10d, 0.5d, 1000000.0d };
        double[] doubleArray10 = new double[] { 0L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (double) (byte) 1);
        java.lang.Class<?> wildcardClass13 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 512.0d, 512.0d, 10.0d, 1.0E-10d, 0.5d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        double[] doubleArray3 = new double[] { 100.0d, (byte) 100, 10.0f };
        double[] doubleArray8 = new double[] { 10.0d, 1.0E-6d, (short) 0, 1.0E-10d };
        double[] doubleArray14 = new double[] { '4', 100.0d, 1.0E-4d, 1.0f, (byte) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray14, 0.70710678d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0E-6d, 0.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 52.0d, 100.0d, 1.0E-4d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, 1.0E-12d);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        double[] doubleArray4 = new double[] { 0, 2.0d, (-10.0d), (byte) 1 };
        double[] doubleArray6 = new double[] { 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 1L);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 2.0d, (-10.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0, 1.0d, 0L, (-10.0d), 0.3333333d, 100.0d };
        double[] doubleArray10 = new double[] { 100.0f, 1.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray10, 1.0d);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0d, 0.0d, (-10.0d), 0.3333333d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        double[] doubleArray5 = new double[] { (short) 0, ' ', (-100.0d), 10000.0d, 1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0d, (short) -1, 10.0d, (short) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, 0.5d);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 32.0d, (-100.0d), 10000.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        double[] doubleArray6 = new double[] { 1024.0d, 0.70710678d, 0L, 1.0d, 100, (short) 0 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray9, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1024.0d, 0.70710678d, 0.0d, 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        double[] doubleArray3 = new double[] { 1.0E-15d, 0.1d, 0.1d };
        double[] doubleArray10 = new double[] { 1.0E-12d, 512.0d, (-1), (short) 0, 0.9d, 5.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 1.0E10d);
        java.lang.Class<?> wildcardClass13 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-15d, 0.1d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 512.0d, (-1.0d), 0.0d, 0.9d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        double[] doubleArray6 = new double[] { (-1.0f), 10.0d, (short) 100, (short) 0, (-100.0d), 100.0d };
        double[] doubleArray10 = new double[] { 1024.0d, (-1L), 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) (-1L));
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d, 100.0d, 0.0d, (-100.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1024.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        double[] doubleArray6 = new double[] { 1.0d, '#', 1.0d, 1, 1.0E-8d, 1.0f };
        double[] doubleArray12 = new double[] { 0.0d, (short) -1, (-100.0d), 5.0d, 512.0d };
        double[] doubleArray13 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) 10L);
        java.lang.Class<?> wildcardClass16 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 35.0d, 1.0d, 1.0d, 1.0E-8d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), (-100.0d), 5.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        double[] doubleArray1 = new double[] { 0.001d };
        double[] doubleArray7 = new double[] { 0.0f, 1.0E-15d, 0.01d, (short) 100, (byte) 100 };
        double[] doubleArray9 = new double[] { 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray9, 1.0E-12d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E-15d, 0.01d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        double[] doubleArray6 = new double[] { (-1), (-0.0d), (-1L), 10, (short) -1, (-1.0d) };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 100, 42.0d, 512.0d, 0.1d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, 1.0E-12d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-0.0d), (-1.0d), 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 42.0d, 512.0d, 0.1d }, 1.0E-15);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        double[] doubleArray5 = new double[] { 100.0f, '4', 512.0d, (-1L), (-1.0f) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 256.0d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 52.0d, 512.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        double[] doubleArray4 = new double[] { 5.0d, 100.0f, (short) 1, 256.0d };
        double[] doubleArray6 = new double[] { 1.0E-6d };
        double[] doubleArray12 = new double[] { 1.0E8d, (short) 10, 0.1d, 10.0d, 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray12, (double) (short) 10);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 100.0d, 1.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0E8d, 10.0d, 0.1d, 10.0d, 256.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 10, 0.9d, 1.0E-12d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray5, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.9d, 1.0E-12d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        double[] doubleArray2 = new double[] { 0.1d, 0L };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { (short) 10, 100, 1.0E-10d, 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray8, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.1d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 100.0d, 1.0E-10d, 1.0E10d }, 1.0E-15);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        double[] doubleArray5 = new double[] { 0, 1.0E-15d, 256.0d, 1.0d, (short) 10 };
        double[] doubleArray9 = new double[] { (-1.0d), 0.0d, '4' };
        double[] doubleArray13 = new double[] { (-1.0E10d), 0.70710678d, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) (byte) 0);
        java.lang.Class<?> wildcardClass16 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0E-15d, 256.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0E10d), 0.70710678d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        double[] doubleArray3 = new double[] { 1.0E-10d, 10.0d, 100.0d };
        double[] doubleArray9 = new double[] { 512.0d, '4', 0.5d, 5.0d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, 0.3333333d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-10d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 512.0d, 52.0d, 0.5d, 5.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0E10d, 10000.0d, 100.0d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (short) 0);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0E10d, 10000.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10000.0d, 100.0d, 10, 0L, '4' };
        double[] doubleArray10 = new double[] { 1.0E-10d, 1.0f, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray10, 0.0d);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d, 100.0d, 10.0d, 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-10d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray3 = new double[] { 0.1d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray3, 1.0E-6d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.1d }, 1.0E-15);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        double[] doubleArray2 = new double[] { 'a', ' ' };
        double[] doubleArray4 = new double[] { 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, 1.0E-15d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 97.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        double[] doubleArray4 = new double[] { 42.0d, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray4, 2.0d);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        double[] doubleArray4 = new double[] { 1000000.0d, 1.0E-4d, 0.01d, 42.0d };
        double[] doubleArray10 = new double[] { 10L, 0.25d, 10.0d, 1L, (byte) -1 };
        double[] doubleArray16 = new double[] { 100L, 10000.0d, 42.0d, 10000.0d, 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, 1.0E-4d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1000000.0d, 1.0E-4d, 0.01d, 42.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 0.25d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 10000.0d, 42.0d, 10000.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0d, 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        double[] doubleArray3 = new double[] { 0.3333333d, 10.0d, 1 };
        double[] doubleArray8 = new double[] { 10, ' ', 100, 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, 0.25d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.3333333d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 32.0d, 100.0d, 0.001d }, 1.0E-15);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100L, (short) 1, 0.0f, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, 0.0d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d, 0.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        double[] doubleArray1 = new double[] { 0.9d };
        double[] doubleArray8 = new double[] { 0L, 1.0E-4d, 0, (byte) 1, (short) 1, 1000000.0d };
        double[] doubleArray14 = new double[] { 10L, 100.0d, 10.0f, 2.0d, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray14, (double) 1);
        java.lang.Class<?> wildcardClass17 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.9d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0E-4d, 0.0d, 1.0d, 1.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 100.0d, 10.0d, 2.0d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { (short) 100, 10, (short) -1, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, 1024.0d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        double[] doubleArray3 = new double[] { (-100.0d), 0.3333333d, 1024.0d };
        double[] doubleArray9 = new double[] { 0.25d, (byte) -1, 10L, 2.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 0.01d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-100.0d), 0.3333333d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.25d, (-1.0d), 10.0d, 2.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        double[] doubleArray2 = new double[] { (short) 10, 100.0d };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (double) (-1));
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        double[] doubleArray6 = new double[] { 100.0f, (byte) 1, (byte) 100, (short) 0, 0.5d, 1000000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 100.0d, 0.0d, 0.5d, 1000000.0d }, 1.0E-15);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        double[] doubleArray2 = new double[] { 0.0d, (short) 10 };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        double[] doubleArray6 = new double[] { 'a', (byte) 1, '4', (-0.0d), 100.0f, 1.0d };
        double[] doubleArray11 = new double[] { 100L, 100.0d, 0L, (short) 1 };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray12, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 1.0d, 52.0d, (-0.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        double[] doubleArray4 = new double[] { 10L, (byte) 10, '#', 512.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray11 = new double[] { (byte) -1, 0.001d, '4', 1.0E-4d, 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray11, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 35.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.001d, 52.0d, 1.0E-4d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        double[] doubleArray1 = new double[] { 1.0E-12d };
        double[] doubleArray7 = new double[] { 100, 0.25d, 0.001d, 0.001d, (-1.0d) };
        double[] doubleArray8 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray8, 1.0E-8d);
        java.lang.Class<?> wildcardClass11 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.25d, 0.001d, 0.001d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        double[] doubleArray4 = new double[] { (byte) 0, 256.0d, '4', 100.0d };
        double[] doubleArray8 = new double[] { 0.0f, (-10.0d), (-1L) };
        double[] doubleArray10 = new double[] { 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 256.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-10.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        double[] doubleArray3 = new double[] { (byte) -1, '4', (-10.0d) };
        double[] doubleArray8 = new double[] { 1.0E8d, 0.0d, 100, '#' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) ' ');
        java.lang.Class<?> wildcardClass11 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 52.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E8d, 0.0d, 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        double[] doubleArray5 = new double[] { 10.0d, (short) 10, 1.0E-10d, (-1L), (-10.0d) };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) 0L);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 1.0E-10d, (-1.0d), (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        double[] doubleArray2 = new double[] { 1.0E-4d, 0.0d };
        double[] doubleArray5 = new double[] { 10000.0d, (short) 100 };
        double[] doubleArray10 = new double[] { (-1.0E10d), (byte) -1, 0L, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray10, (-100.0d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-4d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10000.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0E10d), (-1.0d), 0.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        double[] doubleArray2 = new double[] { 42.0d, '4' };
        double[] doubleArray4 = new double[] { 0 };
        double[] doubleArray11 = new double[] { (-10.0d), (byte) 100, (byte) 0, 'a', 10, 10.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, 0.5d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-10.0d), 100.0d, 0.0d, 97.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        double[] doubleArray4 = new double[] { (short) -1, 1.0E-10d, 512.0d, 10.0d };
        double[] doubleArray8 = new double[] { 512.0d, 0L, 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 1.0E-10d, 512.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 512.0d, 0.0d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        double[] doubleArray4 = new double[] { ' ', 1.0E-4d, (byte) 100, 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1.0E-4d, 100.0d, 10000.0d }, 1.0E-15);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        double[] doubleArray2 = new double[] { 1.0d, '#' };
        double[] doubleArray6 = new double[] { 0.001d, (short) 100, (short) 1 };
        double[] doubleArray11 = new double[] { (-1.0d), 0.0f, (-1L), (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray11, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        double[] doubleArray3 = new double[] { 10.0d, 0.0d, (-1.0d) };
        double[] doubleArray6 = new double[] { (short) 0, (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0E-4d, (-0.0d), 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray10, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-4d, (-0.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray4 = new double[] { 0.9d, (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.9d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray5 = new double[] { (byte) 100, (short) -1, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, 0.0d);
        java.lang.Class<?> wildcardClass8 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 1.0E8d, (-1.0f) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E8d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        double[] doubleArray2 = new double[] { 0.001d, 100.0f };
        double[] doubleArray8 = new double[] { 1000000.0d, 1.0E-10d, (short) -1, (short) 10, 1000000.0d };
        double[] doubleArray11 = new double[] { (short) -1, 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray11, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.001d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1000000.0d, 1.0E-10d, (-1.0d), 10.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        double[] doubleArray2 = new double[] { 512.0d, (-1.0E10d) };
        double[] doubleArray5 = new double[] { (short) 0, 10.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, 1000000.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 512.0d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        double[] doubleArray2 = new double[] { 1024.0d, 1.0E-6d };
        double[] doubleArray8 = new double[] { 0.0f, (short) 0, 0.001d, 1.0E8d, 10.0d };
        double[] doubleArray14 = new double[] { (short) 1, 0.0f, (short) 0, (byte) -1, 0.3333333d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1024.0d, 1.0E-6d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.001d, 1.0E8d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 0.0d, 0.0d, (-1.0d), 0.3333333d }, 1.0E-15);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        double[] doubleArray6 = new double[] { 512.0d, 100.0d, 0.5d, (-1.0d), (short) 10, 1.0E-12d };
        double[] doubleArray10 = new double[] { (-1), 1.0E-6d, 1.0E8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (-10.0d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 512.0d, 100.0d, 0.5d, (-1.0d), 10.0d, 1.0E-12d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 1.0E-6d, 1.0E8d }, 1.0E-15);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10L, 256.0d, 1, 1.0d, (-10.0d), 'a' };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, 100.0d);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 256.0d, 1.0d, 1.0d, (-10.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) 100, ' ', 1.0d };
        double[] doubleArray10 = new double[] { '4', 100.0d, 1.0E10d, 0.0d, '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray10, 100.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 100.0d, 1.0E10d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        double[] doubleArray2 = new double[] { 42.0d, (-1.0d) };
        double[] doubleArray4 = new double[] { (-1.0E10d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0E10d) }, 1.0E-15);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        double[] doubleArray6 = new double[] { 100.0d, 10.0d, 0.25d, (short) -1, '4', 0.5d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray7, (double) 1L);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 0.25d, (-1.0d), 52.0d, 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] {}, 1.0E-15);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray6 = new double[] { 1, (short) 100, 1.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, 1.0E8d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        double[] doubleArray6 = new double[] { 1.0E10d, 1.0E-12d, (short) 10, (byte) 10, 0.25d, 1L };
        double[] doubleArray10 = new double[] { (-1L), 'a', 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 1.0E-12d, 10.0d, 10.0d, 0.25d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 97.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test900");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray3 = new double[] { 10 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray1, 0.0d);
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test901");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (byte) -1, 1.0E-12d, 0L, 0.25d, 0.0f, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1.0E-12d, 0.0d, 0.25d, 0.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test902");
        double[] doubleArray5 = new double[] { (byte) 0, 100.0f, 'a', 10L, 0.001d };
        double[] doubleArray8 = new double[] { 1L, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 100.0d, 97.0d, 10.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test903");
        double[] doubleArray3 = new double[] { 256.0d, 100.0d, 1000000.0d };
        double[] doubleArray8 = new double[] { 10, 0L, (byte) -1, 0.9d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 256.0d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 256.0d, 100.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, (-1.0d), 0.9d }, 1.0E-15);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test904");
        double[] doubleArray4 = new double[] { (short) 10, 'a', (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 1L, 0.70710678d, 0.0d, 0.001d };
        double[] doubleArray16 = new double[] { 0.70710678d, (byte) 100, (byte) 0, (-1.0f), 1.0d, 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray16, 1.0E-12d);
        java.lang.Class<?> wildcardClass19 = doubleArray16.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 97.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.70710678d, 0.0d, 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.70710678d, 100.0d, 0.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test905");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0d, 0.0f, 1.0d, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, 1.0E10d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test906");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0E-8d, 512.0d, 0.9d, 10.0d, 100 };
        double[] doubleArray11 = new double[] { ' ', 0, 1L, 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, 0.0d);
        java.lang.Class<?> wildcardClass14 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E-8d, 512.0d, 0.9d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 0.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test907");
        double[] doubleArray2 = new double[] { 1000000.0d, 1.0E-8d };
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 10000.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) 1.0f);
        double[] doubleArray9 = null;
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, 1.0E-10d);
        java.lang.Class<?> wildcardClass12 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1000000.0d, 1.0E-8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test908");
        double[] doubleArray2 = new double[] { 1.0d, 0.1d };
        double[] doubleArray9 = new double[] { 1.0E10d, 0.70710678d, (-1), 10.0d, (byte) 100, 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E10d, 0.70710678d, (-1.0d), 10.0d, 100.0d, 256.0d }, 1.0E-15);
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test909");
        double[] doubleArray2 = new double[] { (-1.0f), (-1.0d) };
        double[] doubleArray6 = new double[] { 0, 42.0d, 512.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 100L);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 42.0d, 512.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test910");
        double[] doubleArray4 = new double[] { 1024.0d, (-1.0f), 10000.0d, (-0.0d) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 1.0E-4d, 0.5d, 1.0E-8d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, 1.0E-4d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1024.0d, (-1.0d), 10000.0d, (-0.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, 0.5d, 1.0E-8d }, 1.0E-15);
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test911");
        double[] doubleArray5 = new double[] { (-10.0d), 0.70710678d, 0.0d, 0.9d, (byte) 1 };
        double[] doubleArray11 = new double[] { (short) -1, 10.0f, (short) -1, 256.0d, 42.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-10.0d), 0.70710678d, 0.0d, 0.9d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 10.0d, (-1.0d), 256.0d, 42.0d }, 1.0E-15);
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test912");
        double[] doubleArray5 = new double[] { (-1.0E10d), (-1L), 1.0E10d, (byte) 0, (-10.0d) };
        double[] doubleArray6 = null;
        double[] doubleArray9 = new double[] { 0.0d, 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray9, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0E10d), (-1.0d), 1.0E10d, 0.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test913");
        double[] doubleArray5 = new double[] { 0.3333333d, (-1L), 1024.0d, 0.70710678d, 0 };
        double[] doubleArray6 = null;
        double[] doubleArray9 = new double[] { 10000.0d, 0.01d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray9, (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, (-1.0d), 1024.0d, 0.70710678d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10000.0d, 0.01d }, 1.0E-15);
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test914");
        double[] doubleArray5 = new double[] { 1, 100, 1.0E-10d, 0.70710678d, 1L };
        double[] doubleArray6 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 1.0E-12d);
        java.lang.Class<?> wildcardClass9 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1.0E-10d, 0.70710678d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test915");
        double[] doubleArray2 = new double[] { 0.3333333d, (short) 10 };
        double[] doubleArray8 = new double[] { 0.9d, 10.0f, 100.0d, 10000.0d, 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) '#');
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.3333333d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.9d, 10.0d, 100.0d, 10000.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test916");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 1, 0.001d, 0.0f, 256.0d, 100.0d };
        double[] doubleArray12 = new double[] { (-10.0d), 5.0d, 0.0d, 100.0d, ' ' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray12, 1024.0d);
        java.lang.Class<?> wildcardClass15 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.001d, 0.0d, 256.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-10.0d), 5.0d, 0.0d, 100.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test917");
        double[] doubleArray2 = new double[] { 0.25d, (byte) 100 };
        double[] doubleArray9 = new double[] { 10.0d, 10, 10, 10.0d, 0.1d, 100.0d };
        double[] doubleArray11 = new double[] { 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray11, 2.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.25d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 0.1d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test918");
        double[] doubleArray6 = new double[] { 1.0E8d, (-100.0d), (-1.0f), (short) 1, 1, 0.70710678d };
        double[] doubleArray11 = new double[] { (byte) 10, (short) 100, 0.0d, 0L };
        double[] doubleArray18 = new double[] { 'a', (-0.0d), 2.0d, 1.0E-6d, 0.25d, (-1L) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray18, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E8d, (-100.0d), (-1.0d), 1.0d, 1.0d, 0.70710678d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 97.0d, (-0.0d), 2.0d, 1.0E-6d, 0.25d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test919");
        double[] doubleArray2 = new double[] { 0, (-100.0d) };
        double[] doubleArray4 = new double[] { 1.0E10d };
        double[] doubleArray8 = new double[] { (short) -1, 100.0d, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray8, (-100.0d));
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 100.0d, (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test920");
        double[] doubleArray6 = new double[] { 2.0d, (short) 100, (byte) 100, (-0.0d), 0.01d, 1.0E-15d };
        double[] doubleArray8 = new double[] { (-10.0d) };
        double[] doubleArray10 = new double[] { 0.001d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray10, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 2.0d, 100.0d, 100.0d, (-0.0d), 0.01d, 1.0E-15d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.001d }, 1.0E-15);
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test921");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 10 };
        double[] doubleArray5 = new double[] { 100.0d, 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray5, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test922");
        double[] doubleArray6 = new double[] { ' ', (-100.0d), (short) 100, 512.0d, (byte) 100, (short) -1 };
        double[] doubleArray10 = new double[] { 0.0d, (-1L), (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) 10.0f);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, (-100.0d), 100.0d, 512.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test923");
        double[] doubleArray2 = new double[] { 1.0f, '4' };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test924");
        double[] doubleArray4 = new double[] { 42.0d, 0.01d, 10000.0d, (byte) 10 };
        double[] doubleArray6 = new double[] { (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, 0.01d);
        java.lang.Class<?> wildcardClass9 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 42.0d, 0.01d, 10000.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test925");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray8 = new double[] { 0.70710678d, '#', 1.0E-12d, (short) 10, 1.0E8d, (-1.0d) };
        double[] doubleArray10 = new double[] { (byte) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (-10.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.70710678d, 35.0d, 1.0E-12d, 10.0d, 1.0E8d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test926");
        double[] doubleArray4 = new double[] { 1.0E-15d, 0.0f, (short) 100, 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-15d, 0.0d, 100.0d, 1024.0d }, 1.0E-15);
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test927");
        double[] doubleArray5 = new double[] { 0.1d, 0.0d, 0, 100.0f, 0.3333333d };
        double[] doubleArray12 = new double[] { 0.001d, '#', 1.0E-15d, 1.0E-15d, 1.0E10d, 512.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, 0.001d);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.1d, 0.0d, 0.0d, 100.0d, 0.3333333d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.001d, 35.0d, 1.0E-15d, 1.0E-15d, 1.0E10d, 512.0d }, 1.0E-15);
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test928");
        double[] doubleArray2 = new double[] { 1.0E-8d, 1L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test929");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 0 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, 1.0E-15d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test930");
        double[] doubleArray6 = new double[] { 0.25d, 10.0f, 0.0d, 0L, 5.0d, 5.0d };
        double[] doubleArray12 = new double[] { (short) 0, (byte) -1, 1.0E-12d, 512.0d, 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.25d, 10.0d, 0.0d, 0.0d, 5.0d, 5.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 1.0E-12d, 512.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test931");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { 10L, 1L, '4', 0.0f, (-1.0d), 0.1d };
        double[] doubleArray15 = new double[] { 10.0f, 0.9d, (short) 100, (-1.0d), 0.25d, (short) 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 52.0d, 0.0d, (-1.0d), 0.1d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.9d, 100.0d, (-1.0d), 0.25d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test932");
        double[] doubleArray3 = new double[] { 1.0E-12d, (short) 1, 0.01d };
        double[] doubleArray9 = new double[] { 1.0E-4d, (-1L), 10000.0d, 0L, 2.0d };
        double[] doubleArray13 = new double[] { 0.0f, 1.0d, 100.0f };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, 1.0E-15d);
        java.lang.Class<?> wildcardClass16 = doubleArray9.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0E-12d, 1.0d, 0.01d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0E-4d, (-1.0d), 10000.0d, 0.0d, 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test933");
        double[] doubleArray4 = new double[] { 5.0d, 100.0d, ' ', 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 1.0E-8d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 5.0d, 100.0d, 32.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test934");
        double[] doubleArray0 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test935");
        double[] doubleArray3 = new double[] { 0.001d, (-100.0d), 100.0d };
        double[] doubleArray7 = new double[] { (-1.0d), 100L, 1000000.0d };
        double[] doubleArray14 = new double[] { 100.0d, 100L, 1.0E10d, '4', 0.01d, 100L };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray14, 0.1d);
        java.lang.Class<?> wildcardClass17 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.001d, (-100.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 100.0d, 1000000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d, 1.0E10d, 52.0d, 0.01d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test936");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0E10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (double) ' ');
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test937");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        double[] doubleArray6 = new double[] { 1.0f, 0.9d, '4', 1.0E-12d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray6, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.9d, 52.0d, 1.0E-12d }, 1.0E-15);
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test938");
        double[] doubleArray4 = new double[] { 1.0E8d, 1.0E-4d, '#', 10000.0d };
        double[] doubleArray10 = new double[] { 1.0E-12d, 256.0d, 1.0E-8d, 100.0d, 0 };
        double[] doubleArray14 = new double[] { 0.70710678d, 1.0E-4d, (short) 100 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray14, 0.0d);
        java.lang.Class<?> wildcardClass17 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E8d, 1.0E-4d, 35.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0E-12d, 256.0d, 1.0E-8d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.70710678d, 1.0E-4d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test939");
        double[] doubleArray6 = new double[] { 0L, 42.0d, 0.001d, (short) -1, 0L, 1.0E8d };
        double[] doubleArray10 = new double[] { 0.0f, 10.0d, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, 0.01d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 42.0d, 0.001d, (-1.0d), 0.0d, 1.0E8d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test940");
        double[] doubleArray3 = new double[] { (-1L), 0.3333333d, 10.0d };
        double[] doubleArray7 = new double[] { (short) 0, 1.0E-8d, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, 0.01d);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.3333333d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 1.0E-8d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test941");
        double[] doubleArray4 = new double[] { (short) 10, 1.0d, 1.0E-15d, 0.0d };
        double[] doubleArray6 = new double[] { 0.001d };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 1.0E-15d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.001d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test942");
        double[] doubleArray2 = new double[] { (byte) 10, (-1.0d) };
        double[] doubleArray4 = new double[] { 1.0E-4d };
        double[] doubleArray6 = new double[] { 0.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray6, 0.70710678d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-4d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test943");
        double[] doubleArray3 = new double[] { 0L, (-100.0d), (-1) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (-1.0d));
        java.lang.Class<?> wildcardClass6 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-100.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test944");
        double[] doubleArray2 = new double[] { (-1.0d), 0.5d };
        double[] doubleArray8 = new double[] { 1.0E-8d, 1.0E-4d, 1.0E8d, (-100.0d), '4' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, 0.1d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.5d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0E-8d, 1.0E-4d, 1.0E8d, (-100.0d), 52.0d }, 1.0E-15);
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test945");
        double[] doubleArray6 = new double[] { ' ', 0.5d, ' ', (-1.0d), '#', (-1L) };
        double[] doubleArray8 = new double[] { (byte) 100 };
        double[] doubleArray13 = new double[] { 0.0d, '#', 42.0d, 1.0E-4d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray13, (-1.0E10d));
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 0.5d, 32.0d, (-1.0d), 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 35.0d, 42.0d, 1.0E-4d }, 1.0E-15);
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test946");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, 0.01d);
        java.lang.Class<?> wildcardClass5 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test947");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 10 };
        double[] doubleArray7 = new double[] { 0.70710678d, 1, 1.0f, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray7, 1.0E-6d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.70710678d, 1.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test948");
        double[] doubleArray1 = new double[] { (-100.0d) };
        double[] doubleArray6 = new double[] { 1.0E10d, 1.0E10d, (short) -1, 'a' };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray7, 0.5d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-100.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0E10d, 1.0E10d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test949");
        double[] doubleArray5 = new double[] { (short) 100, ' ', (byte) 0, 0, (short) 1 };
        double[] doubleArray11 = new double[] { (-0.0d), 1024.0d, '4', 1, 1.0E-15d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 32.0d, 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-0.0d), 1024.0d, 52.0d, 1.0d, 1.0E-15d }, 1.0E-15);
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test950");
        double[] doubleArray4 = new double[] { 1.0E-12d, '#', 10, (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10.0f);
        java.lang.Class<?> wildcardClass7 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0E-12d, 35.0d, 10.0d, (-10.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test951");
        double[] doubleArray6 = new double[] { (short) 1, (byte) -1, (-0.0d), 1.0E-12d, 1.0E-6d, (short) -1 };
        double[] doubleArray11 = new double[] { 1.0f, 1024.0d, 1000000.0d, 1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, 0.001d);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), (-0.0d), 1.0E-12d, 1.0E-6d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, 1024.0d, 1000000.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test952");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray4 = new double[] { 0.0d, (-1.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test953");
        double[] doubleArray1 = new double[] { 1.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 256.0d);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test954");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0.3333333d, (byte) 100, 512.0d, 1024.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0E-12d);
        double[] doubleArray14 = new double[] { 0.0d, 10, 100.0f, 1.0E-10d, (short) 1, 1.0E-10d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray14, (double) (short) 100);
        java.lang.Class<?> wildcardClass17 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.3333333d, 100.0d, 512.0d, 1024.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, 10.0d, 100.0d, 1.0E-10d, 1.0d, 1.0E-10d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test955");
        double[] doubleArray3 = new double[] { 0L, 0.01d, 100.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.01d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test956");
        double[] doubleArray2 = new double[] { 42.0d, (byte) 10 };
        double[] doubleArray9 = new double[] { '#', 0.5d, (byte) -1, (-1), 1.0E-12d, (short) -1 };
        double[] doubleArray13 = new double[] { 0.25d, 0.70710678d, (short) -1 };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray13, (double) (byte) 100);
        java.lang.Class<?> wildcardClass16 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 35.0d, 0.5d, (-1.0d), (-1.0d), 1.0E-12d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.25d, 0.70710678d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test957");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-0.0d), 0.01d, ' ' };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertArrayEquals(doubleArray0, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-0.0d), 0.01d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test958");
        double[] doubleArray2 = new double[] { 1.0E-8d, 0.0f };
        double[] doubleArray4 = new double[] { 256.0d };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, 1.0E-10d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0E-8d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 256.0d }, 1.0E-15);
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test959");
        double[] doubleArray5 = new double[] { 10, 1.0E-8d, 256.0d, (byte) 1, 10000.0d };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { ' ', '4', (short) -1, 1.0E8d, (-1.0E10d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray12, 1.0E8d);
        java.lang.Class<?> wildcardClass15 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0E-8d, 256.0d, 1.0d, 10000.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 52.0d, (-1.0d), 1.0E8d, (-1.0E10d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test960");
        double[] doubleArray2 = new double[] { 42.0d, 1.0f };
        double[] doubleArray6 = new double[] { 0.01d, 0.1d, (-1) };
        double[] doubleArray9 = new double[] { (-100.0d), (-10.0d) };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 42.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.01d, 0.1d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-100.0d), (-10.0d) }, 1.0E-15);
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test961");
        double[] doubleArray1 = new double[] { 2.0d };
        double[] doubleArray7 = new double[] { 10.0d, (byte) 100, 10, 1.0E8d, 'a' };
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 2.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 100.0d, 10.0d, 1.0E8d, 97.0d }, 1.0E-15);
    }
}

