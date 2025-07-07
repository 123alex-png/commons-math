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
        double[] doubleArray3 = new double[] { 'a', 0, (byte) -1 };
        double[] doubleArray6 = new double[] { 0, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        double[] doubleArray3 = new double[] { 'a', 0, (byte) -1 };
        double[] doubleArray6 = new double[] { 0, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1.0d, 10.0f, (-1.0f), 0, (byte) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, (-1.0d), 0.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) 1, 0L };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        double[] doubleArray2 = new double[] { 10.0f, (byte) 100 };
        double[] doubleArray4 = new double[] { (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        double[] doubleArray5 = new double[] { 'a', (short) -1, 10.0d, 1.0d, 10.0d };
        double[] doubleArray10 = new double[] { 0.0d, 10.0d, 0, (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 97.0d, (-1.0d), 10.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        double[] doubleArray2 = new double[] { 0.0d, 0.0d };
        double[] doubleArray4 = new double[] { (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1, 10.0d, 0.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 100.0d, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 0L, 1L, ' ', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 32.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) -1, '4' };
        double[] doubleArray6 = new double[] { (-1.0d), (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { '4', 10.0f, 100L, (-1.0d), ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 10.0d, 100.0d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        double[] doubleArray2 = new double[] { 0.0d, 0.0d };
        double[] doubleArray4 = new double[] { (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        double[] doubleArray5 = new double[] { (short) 1, 10, (short) -1, (byte) 10, 10.0d };
        double[] doubleArray10 = new double[] { 10L, '#', 100, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 35.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        double[] doubleArray5 = new double[] { (short) 1, 10, (short) -1, (byte) 10, 10.0d };
        double[] doubleArray10 = new double[] { 10L, '#', 100, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 35.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0f), (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), (-1.0d), 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 1, 0, 0.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) 0, (-1.0f) };
        double[] doubleArray6 = new double[] { 'a', (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        double[] doubleArray4 = new double[] { (-1.0d), (short) 0, (short) 1, 100 };
        double[] doubleArray8 = new double[] { (short) 1, (byte) 0, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        double[] doubleArray4 = new double[] { ' ', (-1), 1.0d, 1L };
        double[] doubleArray8 = new double[] { 100, 0.0d, '#' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) 0, (-1.0f) };
        double[] doubleArray6 = new double[] { 'a', (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        double[] doubleArray4 = new double[] { 100.0d, (byte) -1, 1.0d, 10.0d };
        double[] doubleArray8 = new double[] { 100, 100L, 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) -1, '4' };
        double[] doubleArray6 = new double[] { (-1.0d), (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0f, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        double[] doubleArray4 = new double[] { (-1.0d), (short) 0, (short) 1, 100 };
        double[] doubleArray8 = new double[] { (short) 1, (byte) 0, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        double[] doubleArray5 = new double[] { (-1L), 10.0d, (byte) 1, 100L, 1.0f };
        double[] doubleArray10 = new double[] { (short) 0, 0.0f, (-1.0f), (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10.0f, (-1), ' ', 10.0d, 0.0d, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 32.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        double[] doubleArray5 = new double[] { (-1L), 10.0d, (byte) 1, 100L, 1.0f };
        double[] doubleArray10 = new double[] { (short) 0, 0.0f, (-1.0f), (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        double[] doubleArray2 = new double[] { (short) -1, 1 };
        double[] doubleArray4 = new double[] { (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        double[] doubleArray3 = new double[] { (-1.0f), 100, (short) 1 };
        double[] doubleArray6 = new double[] { 1, 10L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 0, (short) 10, 100L, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 100.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        double[] doubleArray4 = new double[] { '4', 0, '4', 10 };
        double[] doubleArray8 = new double[] { 10L, ' ', (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        double[] doubleArray2 = new double[] { 1L, (short) 100 };
        double[] doubleArray4 = new double[] { (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        double[] doubleArray2 = new double[] { 1L, (short) 100 };
        double[] doubleArray4 = new double[] { (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        double[] doubleArray3 = new double[] { (byte) 10, 100.0d, 0 };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        double[] doubleArray3 = new double[] { 100.0d, 0, (short) 10 };
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        double[] doubleArray2 = new double[] { (byte) 100, 100.0f };
        double[] doubleArray4 = new double[] { 1.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        double[] doubleArray4 = new double[] { 100.0d, (byte) -1, 1.0d, 10.0d };
        double[] doubleArray8 = new double[] { 100, 100L, 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        double[] doubleArray6 = new double[] { 100, 1L, 10, 'a', '4', 1.0d };
        double[] doubleArray12 = new double[] { 0L, (short) -1, 10.0f, 100, 100L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 10.0d, 97.0d, 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        double[] doubleArray4 = new double[] { '4', (short) 0, (byte) 0, (byte) 0 };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        double[] doubleArray4 = new double[] { (byte) 0, (short) -1, 10.0f, (byte) 100 };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        double[] doubleArray3 = new double[] { 100.0d, 0, (short) 10 };
        double[] doubleArray6 = new double[] { 1, (byte) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        double[] doubleArray2 = new double[] { (short) -1, 1 };
        double[] doubleArray4 = new double[] { (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 10.0d, '4', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        double[] doubleArray4 = new double[] { '4', 0, '4', 10 };
        double[] doubleArray8 = new double[] { 10L, ' ', (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 0.0d, 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        double[] doubleArray6 = new double[] { 10, ' ', 1.0f, (-1.0f), 10, (short) 10 };
        double[] doubleArray12 = new double[] { (short) 10, (byte) -1, (short) 10, 0L, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 32.0d, 1.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        double[] doubleArray4 = new double[] { 0.0f, 1.0d, 1.0f, (byte) 0 };
        double[] doubleArray8 = new double[] { 0.0f, (-1.0d), 100L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (byte) 0, 0, (-1.0f), (short) 0, 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 0.0d, (-1.0d), 0.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-1.0d), 1L, (byte) 0, 100.0f, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        double[] doubleArray4 = new double[] { ' ', (-1), 1.0d, 1L };
        double[] doubleArray8 = new double[] { 100, 0.0d, '#' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        double[] doubleArray2 = new double[] { 10.0d, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, 0.0d };
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray7);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        double[] doubleArray5 = new double[] { (byte) 0, 1L, 100.0d, (byte) 1, 1 };
        double[] doubleArray10 = new double[] { 1, (short) 10, (short) 0, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 100.0f, (short) -1, (byte) -1, (-1.0d), 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        double[] doubleArray3 = new double[] { (-1.0f), 100, (short) 1 };
        double[] doubleArray6 = new double[] { 1, 10L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        double[] doubleArray6 = new double[] { 100, 1L, 10, 'a', '4', 1.0d };
        double[] doubleArray12 = new double[] { 0L, (short) -1, 10.0f, 100, 100L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 10.0d, 97.0d, 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, (-1.0d), 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        double[] doubleArray6 = new double[] { 10, ' ', 1.0f, (-1.0f), 10, (short) 10 };
        double[] doubleArray12 = new double[] { (short) 10, (byte) -1, (short) 10, 0L, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 32.0d, 1.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (-1.0f), 10.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 10, 1.0f, '4', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        double[] doubleArray3 = new double[] { 'a', (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 1, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        double[] doubleArray5 = new double[] { ' ', 10, (-1.0f), (-1.0d), 1L };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d, 10.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        double[] doubleArray4 = new double[] { (byte) 1, (byte) 100, 'a', (-1) };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 100.0d, 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        double[] doubleArray4 = new double[] { 0, (-1), 0, 10.0d };
        double[] doubleArray8 = new double[] { 0L, (-1L), (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        double[] doubleArray2 = new double[] { 10.0d, (byte) 10 };
        double[] doubleArray5 = new double[] { 1, 0.0d };
        double[] doubleArray7 = new double[] { 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray7);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray7);
        java.lang.Class<?> wildcardClass10 = doubleArray7.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        double[] doubleArray2 = new double[] { (short) 0, 1.0d };
        double[] doubleArray4 = new double[] { (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        double[] doubleArray4 = new double[] { 0, (-1), 0, 10.0d };
        double[] doubleArray8 = new double[] { 0L, (-1L), (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        double[] doubleArray3 = new double[] { 0, 0, (byte) 1 };
        double[] doubleArray6 = new double[] { (short) 100, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        double[] doubleArray4 = new double[] { '#', (short) 100, (-1.0d), 10.0d };
        double[] doubleArray8 = new double[] { (short) 10, (byte) -1, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        double[] doubleArray3 = new double[] { 0, 0, (byte) 1 };
        double[] doubleArray6 = new double[] { (short) 100, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        double[] doubleArray5 = new double[] { (-1), 0, 100, (byte) 100, (-1) };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        double[] doubleArray3 = new double[] { (-1L), (-1L), (short) -1 };
        double[] doubleArray6 = new double[] { '4', (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1L, (byte) -1, (-1L), 1.0f, (byte) 100, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, (-1.0d), (-1.0d), 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        double[] doubleArray5 = new double[] { 1L, (byte) -1, (short) 100, 100, (short) 10 };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0f, 0L, (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        double[] doubleArray5 = new double[] { (byte) 0, 1L, 100.0d, (byte) 1, 1 };
        double[] doubleArray10 = new double[] { 1, (short) 10, (short) 0, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        double[] doubleArray2 = new double[] { (byte) 100, 100.0f };
        double[] doubleArray4 = new double[] { 1.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        double[] doubleArray3 = new double[] { 'a', (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 1, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        double[] doubleArray4 = new double[] { 0.0f, 1.0d, 1.0f, (byte) 0 };
        double[] doubleArray8 = new double[] { 0.0f, (-1.0d), 100L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (byte) 10, 100.0d, 0L, '#', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, 0.0d, 35.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10.0f, (short) 10, 0.0f, (-1), 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        double[] doubleArray4 = new double[] { 10.0d, '4', ' ', (byte) 0 };
        double[] doubleArray8 = new double[] { '4', 10L, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 52.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        double[] doubleArray4 = new double[] { '#', (short) 100, (-1.0d), 10.0d };
        double[] doubleArray8 = new double[] { (short) 10, (byte) -1, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, (-1.0d), 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        double[] doubleArray3 = new double[] { '4', '4', (-1.0f) };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 52.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        double[] doubleArray3 = new double[] { 100.0f, 10, (short) 1 };
        double[] doubleArray6 = new double[] { (short) -1, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        double[] doubleArray2 = new double[] { 10L, (-1.0f) };
        double[] doubleArray4 = new double[] { (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        double[] doubleArray2 = new double[] { 10L, (-1.0f) };
        double[] doubleArray4 = new double[] { (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { '4', 'a', 100, '4', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, 97.0d, 100.0d, 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        double[] doubleArray5 = new double[] { (short) 0, 10.0d, 100.0d, '#', (byte) 10 };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 100.0d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        double[] doubleArray5 = new double[] { (short) 100, 100.0f, '#', 100, (byte) 10 };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 35.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        double[] doubleArray4 = new double[] { 10, (-1L), 1, (byte) 1 };
        double[] doubleArray8 = new double[] { (byte) 100, (-1), 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass11 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        double[] doubleArray3 = new double[] { (short) 100, '#', 100L };
        double[] doubleArray6 = new double[] { 100.0d, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10L, (-1.0f), '4', 0.0d, 10.0d, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, (-1.0d), 52.0d, 0.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        double[] doubleArray5 = new double[] { 1, 100L, (short) 1, (byte) 10, (byte) 100 };
        double[] doubleArray10 = new double[] { 10.0d, (short) 1, 'a', 1.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        double[] doubleArray3 = new double[] { 10, (short) 100, (short) -1 };
        double[] doubleArray6 = new double[] { 100L, (-1) };
        double[] doubleArray8 = new double[] { 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray8);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        double[] doubleArray3 = new double[] { (short) 100, '#', 100L };
        double[] doubleArray6 = new double[] { 100.0d, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        double[] doubleArray4 = new double[] { 1L, '#', (byte) 1, (byte) -1 };
        double[] doubleArray8 = new double[] { 10.0d, 1.0d, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        double[] doubleArray5 = new double[] { 100L, 10, (short) 10, 10L, (-1.0d) };
        double[] doubleArray10 = new double[] { (short) -1, 100, '#', 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 100.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        double[] doubleArray6 = new double[] { (short) 100, (byte) 10, 1, 10.0d, (-1.0d), 100.0f };
        double[] doubleArray12 = new double[] { (short) 1, (short) 0, (-1), 100, '#' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 1.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, (-1.0d), 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        double[] doubleArray3 = new double[] { (-1L), (-1L), (short) -1 };
        double[] doubleArray6 = new double[] { '4', (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        double[] doubleArray4 = new double[] { (-1.0f), 10L, (byte) 100, (-1.0d) };
        double[] doubleArray8 = new double[] { (-1.0f), '4', (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        double[] doubleArray5 = new double[] { 100L, 10, (short) 10, 10L, (-1.0d) };
        double[] doubleArray10 = new double[] { (short) -1, 100, '#', 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 100.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        double[] doubleArray6 = new double[] { (short) 100, (byte) 10, 1, 10.0d, (-1.0d), 100.0f };
        double[] doubleArray12 = new double[] { (short) 1, (short) 0, (-1), 100, '#' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 1.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, (-1.0d), 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        double[] doubleArray5 = new double[] { 1, 100L, (short) 1, (byte) 10, (byte) 100 };
        double[] doubleArray10 = new double[] { 10.0d, (short) 1, 'a', 1.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        double[] doubleArray4 = new double[] { 1L, '#', (byte) 1, (byte) -1 };
        double[] doubleArray8 = new double[] { 10.0d, 1.0d, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 35.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        double[] doubleArray4 = new double[] { 10.0d, '4', ' ', (byte) 0 };
        double[] doubleArray8 = new double[] { '4', 10L, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 52.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 52.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        double[] doubleArray2 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray4 = new double[] { 1L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        double[] doubleArray5 = new double[] { 1.0f, 1.0d, (-1.0f), 'a', (-1) };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        double[] doubleArray2 = new double[] { 0.0f, 100.0f };
        double[] doubleArray4 = new double[] { 1.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        double[] doubleArray2 = new double[] { (byte) 0, 100.0d };
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        double[] doubleArray3 = new double[] { 10.0d, 100.0f, (short) 100 };
        double[] doubleArray6 = new double[] { 0.0d, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        double[] doubleArray3 = new double[] { 0.0d, 0.0f, 'a' };
        double[] doubleArray6 = new double[] { 0.0f, (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (short) -1, 100.0f, 10, 10, 1L, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 100.0d, 10.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        double[] doubleArray4 = new double[] { (-1.0f), 10L, (byte) 100, (-1.0d) };
        double[] doubleArray8 = new double[] { (-1.0f), '4', (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        double[] doubleArray5 = new double[] { 1L, (byte) -1, (short) 100, 100, (short) 10 };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0f, 0L, (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        double[] doubleArray4 = new double[] { 10, (-1L), 1, (byte) 1 };
        double[] doubleArray8 = new double[] { (byte) 100, (-1), 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass11 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        double[] doubleArray6 = new double[] { 1L, 10.0f, 10, 10L, ' ', (-1.0f) };
        double[] doubleArray12 = new double[] { 0.0f, 10, '4', 10L, (short) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 10.0d, 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 52.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        double[] doubleArray2 = new double[] { 0.0f, 100.0f };
        double[] doubleArray4 = new double[] { 1.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        double[] doubleArray2 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray4 = new double[] { 1L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        double[] doubleArray3 = new double[] { 0.0d, 0.0f, 'a' };
        double[] doubleArray6 = new double[] { 0.0f, (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 0L, (byte) 100, (short) 10, 10L, (short) -1, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 100.0d, 10.0d, 10.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        double[] doubleArray6 = new double[] { 1L, 10.0f, 10, 10L, ' ', (-1.0f) };
        double[] doubleArray12 = new double[] { 0.0f, 10, '4', 10L, (short) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d, 10.0d, 10.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 10.0d, 52.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) 1, 1.0f, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1L), (short) 0, (short) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        double[] doubleArray3 = new double[] { '4', (short) 10, 100 };
        double[] doubleArray6 = new double[] { (short) 10, (byte) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 35.0d }, 1.0E-15);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (-1), (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        double[] doubleArray4 = new double[] { 10.0f, (byte) 1, '4', '4' };
        double[] doubleArray8 = new double[] { (-1.0d), 'a', 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 52.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        double[] doubleArray4 = new double[] { 10.0f, (byte) 1, '4', '4' };
        double[] doubleArray8 = new double[] { (-1.0d), 'a', 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 52.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        double[] doubleArray5 = new double[] { (-1.0d), 1.0d, 10, (short) 0, (byte) 0 };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (byte) 10, (-1.0d), 0.0d, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d), 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10.0f, 1, (short) 10, 1.0d, 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 10.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        double[] doubleArray6 = new double[] { (byte) 1, ' ', 100, 0.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { (-1.0f), (-1L), (-1), 10L, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 32.0d, 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        double[] doubleArray6 = new double[] { (byte) 1, ' ', 100, 0.0f, 1, 0.0f };
        double[] doubleArray12 = new double[] { (-1.0f), (-1L), (-1), 10L, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 32.0d, 100.0d, 0.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d), (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        double[] doubleArray2 = new double[] { (short) 0, 1.0d };
        double[] doubleArray4 = new double[] { (-1.0d) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        double[] doubleArray5 = new double[] { (short) 1, '#', 100.0d, (byte) 1, (-1) };
        double[] doubleArray10 = new double[] { 100, (short) 0, (byte) 100, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 35.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        double[] doubleArray5 = new double[] { (short) 1, 1L, 'a', (byte) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 1, (byte) 10, 10.0d, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 97.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 'a', 10, 100, 1.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, 10.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0.0f, (short) -1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        double[] doubleArray5 = new double[] { (byte) -1, 100, (short) 10, '4', 0.0d };
        double[] doubleArray10 = new double[] { 1, (byte) 100, 10.0d, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        double[] doubleArray4 = new double[] { 100.0d, (byte) -1, (byte) 10, 0.0f };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        double[] doubleArray6 = new double[] { 1.0f, (short) 100, (byte) 10, (byte) 10, 10, 10 };
        double[] doubleArray12 = new double[] { (-1), 1L, 0.0f, ' ', 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 0.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        double[] doubleArray3 = new double[] { '4', (short) 10, 100 };
        double[] doubleArray6 = new double[] { (short) 10, (byte) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        double[] doubleArray3 = new double[] { 1, 1L, 10.0f };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        double[] doubleArray5 = new double[] { (byte) -1, 100, (short) 10, '4', 0.0d };
        double[] doubleArray10 = new double[] { 1, (byte) 100, 10.0d, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, 52.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 1L, 10.0d, (byte) 1, 10L, (short) -1, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d, 1.0d, 10.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        double[] doubleArray4 = new double[] { 100L, (byte) -1, 1, 1.0d };
        double[] doubleArray8 = new double[] { (-1), 1.0d, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        double[] doubleArray2 = new double[] { (short) 100, 10.0d };
        double[] doubleArray4 = new double[] { 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        double[] doubleArray6 = new double[] { 1L, (short) 1, 1, ' ', 0L, 10.0d };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 1.0d, 32.0d, 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        double[] doubleArray4 = new double[] { 100L, (byte) -1, 1, 1.0d };
        double[] doubleArray8 = new double[] { (-1), 1.0d, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        double[] doubleArray2 = new double[] { 100.0f, (short) 1 };
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 'a', 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        double[] doubleArray4 = new double[] { ' ', (short) 1, (byte) 10, 'a' };
        double[] doubleArray8 = new double[] { '4', 1.0f, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 52.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { '#', (-1L), ' ', '#', (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, (-1.0d), 32.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        double[] doubleArray4 = new double[] { ' ', (short) 1, (byte) 10, 'a' };
        double[] doubleArray8 = new double[] { '4', 1.0f, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 32.0d, 1.0d, 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 52.0d, 1.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        double[] doubleArray5 = new double[] { (short) 1, 1L, 'a', (byte) 10, 100L };
        double[] doubleArray10 = new double[] { (short) 1, (byte) 10, 10.0d, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 1.0d, 97.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 0, (short) 10, (byte) 10, 0.0d, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d, 10.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        double[] doubleArray5 = new double[] { 10.0f, 10, (byte) 0, (short) -1, (byte) -1 };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0f), 100.0d, 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        double[] doubleArray4 = new double[] { (byte) 1, 0, 'a', 0L };
        double[] doubleArray9 = new double[] { 100L, (byte) -1, 1, 1.0d };
        double[] doubleArray13 = new double[] { (-1), 1.0d, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray9, doubleArray13);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray13);
        java.lang.Class<?> wildcardClass16 = doubleArray13.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        double[] doubleArray4 = new double[] { (short) 10, (byte) 1, 10.0d, (byte) 10 };
        double[] doubleArray8 = new double[] { (-1.0d), 0.0d, (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        double[] doubleArray5 = new double[] { (-1), 10, 10, (byte) 100, 0L };
        double[] doubleArray10 = new double[] { (byte) 0, (byte) 10, (byte) 1, (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        double[] doubleArray5 = new double[] { (-1), 10, 10, (byte) 100, 0L };
        double[] doubleArray10 = new double[] { (byte) 0, (byte) 10, (byte) 1, (-1.0f) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        double[] doubleArray6 = new double[] { 1.0f, (-1), 0L, '#', (byte) 10, '#' };
        double[] doubleArray12 = new double[] { 0.0f, 100.0f, 10L, 100L, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 0.0d, 35.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        double[] doubleArray4 = new double[] { (byte) 1, 0, 'a', 0L };
        double[] doubleArray9 = new double[] { 100L, (byte) -1, 1, 1.0d };
        double[] doubleArray13 = new double[] { (-1), 1.0d, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray9, doubleArray13);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray13);
        java.lang.Class<?> wildcardClass16 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 97.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, (-1.0d), 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 1, 'a', (-1), (short) 1, 10 };
        double[] doubleArray12 = new double[] { 10L, 0.0f, (short) -1, (short) -1, 1L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 97.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        double[] doubleArray3 = new double[] { (byte) 100, 100, 0 };
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        double[] doubleArray5 = new double[] { (short) 1, '#', 100.0d, (byte) 1, (-1) };
        double[] doubleArray10 = new double[] { 100, (short) 0, (byte) 100, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 35.0d, 100.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        double[] doubleArray3 = new double[] { (byte) 100, 100, 0 };
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        double[] doubleArray2 = new double[] { (short) 100, 10.0d };
        double[] doubleArray4 = new double[] { 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        double[] doubleArray3 = new double[] { 100.0f, 10, (short) 1 };
        double[] doubleArray6 = new double[] { (short) -1, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        double[] doubleArray4 = new double[] { (-1.0f), 0.0f, '4', 10L };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 52.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        double[] doubleArray6 = new double[] { 1.0f, (short) 100, (byte) 10, (byte) 10, 10, 10 };
        double[] doubleArray12 = new double[] { (-1), 1L, 0.0f, ' ', 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 100.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 1.0d, 0.0d, 32.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 1, 'a', (-1), (short) 1, 10 };
        double[] doubleArray12 = new double[] { 10L, 0.0f, (short) -1, (short) -1, 1L };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 97.0d, (-1.0d), 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, (-1.0d), (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        double[] doubleArray6 = new double[] { 1.0f, (-1), 0L, '#', (byte) 10, '#' };
        double[] doubleArray12 = new double[] { 0.0f, 100.0f, 10L, 100L, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 0.0d, 35.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 100.0d, 10.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0.0d, 1.0f, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1L, 'a', '#', (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 97.0d, 35.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        double[] doubleArray2 = new double[] { (-1L), 1.0f };
        double[] doubleArray4 = new double[] { (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        double[] doubleArray2 = new double[] { (short) 10, 100.0f };
        double[] doubleArray4 = new double[] { 10.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (-1L), (-1), 1.0d, 1L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), (-1.0d), 1.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        double[] doubleArray5 = new double[] { 1.0d, (byte) 100, ' ', 10.0d, (-1.0f) };
        double[] doubleArray10 = new double[] { (short) -1, 0.0f, 100, (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        double[] doubleArray5 = new double[] { (short) -1, (short) 10, 1L, 1L, (byte) 10 };
        double[] doubleArray10 = new double[] { (short) 1, (byte) 100, 10.0f, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        double[] doubleArray2 = new double[] { (-1L), 1.0f };
        double[] doubleArray4 = new double[] { (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        double[] doubleArray6 = new double[] { 10.0f, 1, (byte) 0, (short) -1, 100L, (short) 10 };
        double[] doubleArray12 = new double[] { 10.0d, 10.0f, (short) 0, '4', (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 0.0d, 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        double[] doubleArray4 = new double[] { 100.0d, (byte) -1, (byte) 10, 0.0f };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        double[] doubleArray5 = new double[] { (byte) 0, 'a', (-1.0f), 1.0f, 0.0d };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 97.0d, (-1.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        double[] doubleArray2 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 1, 0.0d, (short) 0 };
        double[] doubleArray8 = new double[] { 1, 10, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        double[] doubleArray5 = new double[] { 1.0d, (byte) 100, ' ', 10.0d, (-1.0f) };
        double[] doubleArray10 = new double[] { (short) -1, 0.0f, 100, (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        double[] doubleArray2 = new double[] { 100.0f, 0L };
        double[] doubleArray4 = new double[] { '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        double[] doubleArray2 = new double[] { (short) 10, 100.0f };
        double[] doubleArray4 = new double[] { 10.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        double[] doubleArray6 = new double[] { 10.0f, 1, (byte) 0, (short) -1, 100L, (short) 10 };
        double[] doubleArray12 = new double[] { 10.0d, 10.0f, (short) 0, '4', (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 0.0d, 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        double[] doubleArray4 = new double[] { 0.0d, 1.0d, (-1.0d), 100L };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        double[] doubleArray6 = new double[] { 100L, 1.0d, 10L, 1, (byte) 1, 0 };
        double[] doubleArray12 = new double[] { 10.0d, (-1.0f), 'a', 0.0f, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        double[] doubleArray5 = new double[] { (short) -1, (short) 10, 1L, 1L, (byte) 10 };
        double[] doubleArray10 = new double[] { (short) 1, (byte) 100, 10.0f, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (byte) -1, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1.0d, (-1.0d), (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        double[] doubleArray4 = new double[] { 100L, 1, (byte) 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 10, (short) 1, 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        double[] doubleArray4 = new double[] { 100L, 1, (byte) 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 10, (short) 1, 0.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        double[] doubleArray2 = new double[] { 100L, (-1.0d) };
        double[] doubleArray4 = new double[] { 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10L, 1.0f, 0.0f, (short) 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 0.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 10, 1.0d, (byte) 1, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 1.0d, 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        double[] doubleArray3 = new double[] { 10.0d, 100.0f, (short) 100 };
        double[] doubleArray6 = new double[] { 0.0d, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        double[] doubleArray3 = new double[] { (byte) 100, '#', 10.0f };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 35.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        double[] doubleArray6 = new double[] { 100, (-1.0d), 0.0d, (short) 10, (-1.0d), 100.0d };
        double[] doubleArray12 = new double[] { 0.0f, 0.0d, 100.0f, ' ', '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 0.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 100.0d, 32.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        double[] doubleArray3 = new double[] { 100L, (-1), '#' };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        double[] doubleArray2 = new double[] { 100.0f, 0L };
        double[] doubleArray4 = new double[] { '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        double[] doubleArray6 = new double[] { 0L, ' ', (byte) 10, (-1.0d), 0.0f, (byte) 10 };
        double[] doubleArray12 = new double[] { '4', (byte) 10, 1.0d, (byte) 0, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 32.0d, 10.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 10.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        double[] doubleArray6 = new double[] { 100, (-1.0d), 0.0d, (short) 10, (-1.0d), 100.0d };
        double[] doubleArray12 = new double[] { 0.0f, 0.0d, 100.0f, ' ', '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), 0.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 100.0d, 32.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        double[] doubleArray2 = new double[] { 10.0d, '#' };
        double[] doubleArray4 = new double[] { (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        double[] doubleArray5 = new double[] { 100L, (short) -1, '#', 0.0d, (short) -1 };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, (-1.0d), 35.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 1L, (byte) 10, 1L, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        double[] doubleArray6 = new double[] { 100L, 1.0d, 10L, 1, (byte) 1, 0 };
        double[] doubleArray12 = new double[] { 10.0d, (-1.0f), 'a', 0.0f, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 10.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, (-1.0d), 97.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        double[] doubleArray3 = new double[] { 100L, (-1), '#' };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        double[] doubleArray5 = new double[] { (-1.0d), 100.0f, 10.0d, (-1.0f), 100 };
        double[] doubleArray10 = new double[] { 10L, (short) 10, 0.0d, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        double[] doubleArray3 = new double[] { 0L, 100, (short) -1 };
        double[] doubleArray6 = new double[] { (-1), 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 1, 0.0d, (short) 0 };
        double[] doubleArray8 = new double[] { 1, 10, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 10, 0, 100, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 100.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        double[] doubleArray3 = new double[] { 0L, 100, (short) -1 };
        double[] doubleArray6 = new double[] { (-1), 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        double[] doubleArray2 = new double[] { 10.0d, '#' };
        double[] doubleArray4 = new double[] { (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        double[] doubleArray5 = new double[] { 1L, 100.0f, (byte) 10, 1, (-1) };
        double[] doubleArray10 = new double[] { 0, 1, 10.0d, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        double[] doubleArray5 = new double[] { (-1.0d), 100.0f, 10.0d, (-1.0f), 100 };
        double[] doubleArray10 = new double[] { 10L, (short) 10, 0.0d, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        double[] doubleArray4 = new double[] { 100L, (short) 1, (byte) 0, 1.0d };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 1.0d, 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        double[] doubleArray2 = new double[] { 100L, (-1.0d) };
        double[] doubleArray4 = new double[] { 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        double[] doubleArray5 = new double[] { 10.0f, 10, (byte) 0, (short) -1, (byte) -1 };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0f), 100.0d, 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 10.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (short) 0, 1L, (byte) 10, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        double[] doubleArray4 = new double[] { (short) 10, (byte) 1, 10.0d, (byte) 10 };
        double[] doubleArray8 = new double[] { (-1.0d), 0.0d, (byte) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        double[] doubleArray5 = new double[] { 10L, (byte) -1, '#', (short) 100, (short) 10 };
        double[] doubleArray10 = new double[] { (short) 10, (-1), 10.0f, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 35.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        double[] doubleArray4 = new double[] { (byte) 10, 1.0d, 100.0d, 100.0f };
        double[] doubleArray8 = new double[] { (byte) -1, (byte) 0, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 100, (short) 0, '4', 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        double[] doubleArray3 = new double[] { 1L, (-1L), 1L };
        double[] doubleArray6 = new double[] { (byte) 100, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 100, (byte) 100, 10.0f, (short) 100, (-1.0f) };
        double[] doubleArray12 = new double[] { (short) 100, (-1.0d), 100L, (short) 0, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 100.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        double[] doubleArray5 = new double[] { (short) 0, (byte) 10, (byte) 1, 1L, (short) -1 };
        double[] doubleArray10 = new double[] { (short) 1, 100.0d, ' ', (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 0.0d, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        double[] doubleArray3 = new double[] { '4', (short) -1, (byte) 10 };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        double[] doubleArray3 = new double[] { (-1), 100.0f, 100 };
        double[] doubleArray6 = new double[] { 0, 10.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        double[] doubleArray4 = new double[] { (byte) 10, 1.0d, 100.0d, 100.0f };
        double[] doubleArray8 = new double[] { (byte) -1, (byte) 0, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        double[] doubleArray2 = new double[] { 0.0f, 0L };
        double[] doubleArray4 = new double[] { (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 100, '#', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 35.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0d), 100L, 10.0f, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 100.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        double[] doubleArray6 = new double[] { 10, 100L, (-1.0f), 100.0d, 10, 10.0d };
        double[] doubleArray12 = new double[] { (short) 1, 100.0d, (short) -1, 100, (short) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, (-1.0d), 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        double[] doubleArray4 = new double[] { (-1L), 10, (short) 1, 100L };
        double[] doubleArray8 = new double[] { 1.0f, 100.0f, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 0, 0.0d, (short) 10, 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        double[] doubleArray5 = new double[] { 10.0d, 'a', (byte) 10, 10.0d, 100 };
        double[] doubleArray10 = new double[] { (short) 10, 10.0d, 0L, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        double[] doubleArray2 = new double[] { 0.0f, 0L };
        double[] doubleArray4 = new double[] { (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 1.0d, 1.0f, (short) -1, (byte) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, (-1.0d), (-1.0d), 97.0d }, 1.0E-15);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100.0d, 100.0f, 10L, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        double[] doubleArray3 = new double[] { 1L, (-1L), 1L };
        double[] doubleArray6 = new double[] { (byte) 100, 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        double[] doubleArray5 = new double[] { 1.0f, (-1), (-1.0d), (-1.0f), (-1L) };
        double[] doubleArray10 = new double[] { (byte) 0, 10.0d, (byte) 10, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { '4', 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        double[] doubleArray6 = new double[] { (short) 0, (byte) 100, (byte) 100, 10.0f, (short) 100, (-1.0f) };
        double[] doubleArray12 = new double[] { (short) 100, (-1.0d), 100L, (short) 0, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 100.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, (-1.0d), 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        double[] doubleArray3 = new double[] { (-1), 100.0f, 100 };
        double[] doubleArray6 = new double[] { 0, 10.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { '#', 0 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        double[] doubleArray4 = new double[] { (-1L), 10, (short) 1, 100L };
        double[] doubleArray8 = new double[] { 1.0f, 100.0f, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 10.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        double[] doubleArray5 = new double[] { 1.0f, (-1), (-1.0d), (-1.0f), (-1L) };
        double[] doubleArray10 = new double[] { (byte) 0, 10.0d, (byte) 10, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        double[] doubleArray6 = new double[] { (byte) 100, 1L, '#', (short) -1, (-1.0f), (-1) };
        double[] doubleArray12 = new double[] { (byte) 0, 0, 100.0f, 0.0d, (short) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 35.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        double[] doubleArray6 = new double[] { 10, (short) 1, (short) 10, 1L, (short) 1, (short) 100 };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 10.0d, 1.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { (short) 1, 0.0d, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        double[] doubleArray4 = new double[] { (short) -1, 0.0f, 100, 1.0d };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        double[] doubleArray4 = new double[] { 0.0d, 1.0d, (-1L), (-1.0f) };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 1.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        double[] doubleArray6 = new double[] { 10, 100L, (-1.0f), 100.0d, 10, 10.0d };
        double[] doubleArray12 = new double[] { (short) 1, 100.0d, (short) -1, 100, (short) 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, (-1.0d), 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { 0.0d, 0, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        double[] doubleArray5 = new double[] { 0L, 0L, 10L, 10L, 1.0d };
        double[] doubleArray10 = new double[] { ' ', 100, (byte) -1, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 'a', (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) -1, (byte) 0 };
        double[] doubleArray6 = new double[] { 1, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        double[] doubleArray5 = new double[] { (short) 0, (byte) 10, (byte) 1, 1L, (short) -1 };
        double[] doubleArray10 = new double[] { (short) 1, 100.0d, ' ', (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 10.0d, 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 32.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        double[] doubleArray6 = new double[] { (byte) 100, 1L, '#', (short) -1, (-1.0f), (-1) };
        double[] doubleArray12 = new double[] { (byte) 0, 0, 100.0f, 0.0d, (short) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 1.0d, 35.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        double[] doubleArray5 = new double[] { (byte) 100, 0, 1.0d, 1, (byte) 0 };
        double[] doubleArray10 = new double[] { (short) 100, (-1), 0, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        double[] doubleArray5 = new double[] { 0L, '4', 1, 1L, 0 };
        double[] doubleArray10 = new double[] { 100, 100L, (byte) -1, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 52.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        double[] doubleArray6 = new double[] { 1.0f, 1.0d, (byte) 100, 0.0d, 10.0f, (-1) };
        double[] doubleArray12 = new double[] { 0.0d, 1L, 10.0d, (byte) 0, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 100.0d, 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        double[] doubleArray5 = new double[] { (byte) 100, 0, 1.0d, 1, (byte) 0 };
        double[] doubleArray10 = new double[] { (short) 100, (-1), 0, ' ' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        double[] doubleArray6 = new double[] { 0L, ' ', (byte) 10, (-1.0d), 0.0f, (byte) 10 };
        double[] doubleArray12 = new double[] { '4', (byte) 10, 1.0d, (byte) 0, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 32.0d, 10.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 52.0d, 10.0d, 1.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        double[] doubleArray5 = new double[] { 0L, 0L, 10L, 10L, 1.0d };
        double[] doubleArray10 = new double[] { ' ', 100, (byte) -1, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 10.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 32.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        double[] doubleArray4 = new double[] { '#', (byte) 0, (short) 10, '#' };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 35.0d, 0.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        double[] doubleArray6 = new double[] { 10.0f, 1, ' ', 1.0f, 100.0f, 10.0d };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 1.0d, 32.0d, 1.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        double[] doubleArray3 = new double[] { (-1), 1L, (byte) -1 };
        double[] doubleArray6 = new double[] { 10, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        double[] doubleArray5 = new double[] { 10.0d, 'a', (byte) 10, 10.0d, 100 };
        double[] doubleArray10 = new double[] { (short) 10, 10.0d, 0L, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 97.0d, 10.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 10.0d, 0.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        double[] doubleArray3 = new double[] { (-1L), 100, 100 };
        double[] doubleArray6 = new double[] { ' ', 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        double[] doubleArray3 = new double[] { '4', (short) -1, (byte) 10 };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 52.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1), 1, (byte) 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 1.0d, 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        double[] doubleArray3 = new double[] { (-1L), 100, 100 };
        double[] doubleArray6 = new double[] { ' ', 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { (short) 100, 100.0f, 'a', '4', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d, 97.0d, 52.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 100.0d, 0.0d, (byte) 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 0.0d, 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        double[] doubleArray3 = new double[] { (-1), 1L, (byte) -1 };
        double[] doubleArray6 = new double[] { 10, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        double[] doubleArray4 = new double[] { (short) 10, 10, (short) 10, 0L };
        double[] doubleArray8 = new double[] { (byte) 10, 0L, 1.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        double[] doubleArray6 = new double[] { 1.0f, 1.0d, (byte) 100, 0.0d, 10.0f, (-1) };
        double[] doubleArray12 = new double[] { 0.0d, 1L, 10.0d, (byte) 0, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 1.0d, 100.0d, 0.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 1.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        double[] doubleArray2 = new double[] { 10L, 10L };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) -1, (byte) 0 };
        double[] doubleArray6 = new double[] { 1, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        double[] doubleArray3 = new double[] { (byte) -1, 100, (byte) 1 };
        double[] doubleArray6 = new double[] { (short) 0, 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        double[] doubleArray4 = new double[] { (short) 10, 10, (short) 10, 0L };
        double[] doubleArray8 = new double[] { (byte) 10, 0L, 1.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 10.0d, 10, '#' };
        double[] doubleArray10 = new double[] { 10.0d, 1L, (short) 0, '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 10.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        double[] doubleArray5 = new double[] { 100.0f, 10.0d, 10.0d, 10, '#' };
        double[] doubleArray10 = new double[] { 10.0d, 1L, (short) 0, '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 10.0d, 10.0d, 10.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 0.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        double[] doubleArray6 = new double[] { 10.0d, 10L, 100, (short) 100, 0, '4' };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 100.0d, 100.0d, 0.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (byte) 1, (byte) -1, 1L, '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 1.0d, 52.0d }, 1.0E-15);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        double[] doubleArray4 = new double[] { 0.0d, (short) -1, (short) 0, 1 };
        double[] doubleArray8 = new double[] { (byte) 100, 100, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        double[] doubleArray2 = new double[] { 10L, 10L };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (-1L), 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        double[] doubleArray5 = new double[] { 1L, 100.0f, (byte) 10, 1, (-1) };
        double[] doubleArray10 = new double[] { 0, 1, 10.0d, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, 100.0d, 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        double[] doubleArray5 = new double[] { 10.0f, (byte) 1, (short) 10, 10L, '4' };
        double[] doubleArray10 = new double[] { 0, (short) 1, (short) 100, (short) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 10.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        double[] doubleArray5 = new double[] { 10.0f, (byte) 1, (short) 10, 10L, '4' };
        double[] doubleArray10 = new double[] { 0, (short) 1, (short) 100, (short) 100 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 1.0d, 10.0d, 10.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        double[] doubleArray2 = new double[] { 100.0f, 100.0d };
        double[] doubleArray4 = new double[] { 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        double[] doubleArray2 = new double[] { 100.0f, 100.0d };
        double[] doubleArray4 = new double[] { 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        double[] doubleArray0 = null;
        double[] doubleArray4 = new double[] { '4', (short) 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        double[] doubleArray4 = new double[] { 100L, (-1.0f), (short) -1, 0.0d };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        double[] doubleArray6 = new double[] { 0, '4', 1.0f, 100.0f, (byte) 1, 100.0f };
        double[] doubleArray12 = new double[] { 10.0f, (short) 0, 1, 0L, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 52.0d, 1.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        double[] doubleArray2 = new double[] { 100L, 0.0d };
        double[] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        double[] doubleArray2 = new double[] { (byte) -1, (short) -1 };
        double[] doubleArray4 = new double[] { '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        double[] doubleArray5 = new double[] { 1.0f, (-1), (-1.0d), (-1.0f), (-1L) };
        double[] doubleArray10 = new double[] { (byte) 0, 10.0d, (byte) 10, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass13 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 100, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        double[] doubleArray4 = new double[] { 0.0d, (short) -1, (short) 0, 1 };
        double[] doubleArray8 = new double[] { (byte) 100, 100, 0.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        double[] doubleArray6 = new double[] { 0, '4', 1.0f, 100.0f, (byte) 1, 100.0f };
        double[] doubleArray12 = new double[] { 10.0f, (short) 0, 1, 0L, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 52.0d, 1.0d, 100.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 0.0d, 1.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        double[] doubleArray3 = new double[] { (byte) -1, 100, (byte) 1 };
        double[] doubleArray6 = new double[] { (short) 0, 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        double[] doubleArray4 = new double[] { 1.0d, 1.0d, 1.0d, 0L };
        double[] doubleArray8 = new double[] { 10, (short) 0, 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        double[] doubleArray5 = new double[] { 1, (-1.0d), 10.0d, 1.0d, (-1) };
        double[] doubleArray10 = new double[] { (byte) -1, (byte) -1, 0L, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        double[] doubleArray2 = new double[] { ' ', (byte) 1 };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        double[] doubleArray3 = new double[] { 1.0d, (byte) 100, (byte) 1 };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        double[] doubleArray5 = new double[] { 1, (-1.0d), 10.0d, 1.0d, (-1) };
        double[] doubleArray10 = new double[] { (byte) -1, (byte) -1, 0L, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), 10.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        double[] doubleArray4 = new double[] { (short) -1, 0.0f, 100, 1.0d };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, (-1L) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d), 0.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray1, doubleArray2);
        java.lang.Class<?> wildcardClass4 = doubleArray1.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        double[] doubleArray2 = new double[] { (byte) -1, (short) -1 };
        double[] doubleArray4 = new double[] { '4' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        double[] doubleArray5 = new double[] { 1.0f, (-1), (-1.0d), (-1.0f), (-1L) };
        double[] doubleArray10 = new double[] { (byte) 0, 10.0d, (byte) 10, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass13 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 10.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { 10, 0, 100.0d, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        double[] doubleArray4 = new double[] { 1.0d, 1.0d, 1.0d, 0L };
        double[] doubleArray8 = new double[] { 10, (short) 0, 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        double[] doubleArray2 = new double[] { (short) 0, 0.0d };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        double[] doubleArray2 = new double[] { ' ', (byte) 1 };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 32.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1.0d), 10.0d, '#', (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        double[] doubleArray6 = new double[] { 100.0f, (-1L), (-1), 1, (byte) 10, '#' };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, (-1.0d), (-1.0d), 1.0d, 10.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 0, 100L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        double[] doubleArray3 = new double[] { 10L, (short) -1, 0 };
        double[] doubleArray6 = new double[] { (byte) 1, (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        double[] doubleArray5 = new double[] { 10L, (byte) -1, '#', (short) 100, (short) 10 };
        double[] doubleArray10 = new double[] { (short) 10, (-1), 10.0f, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 35.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, (-1.0d), 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        double[] doubleArray5 = new double[] { 100, 1L, (byte) 100, 0L, 0.0d };
        double[] doubleArray10 = new double[] { 0.0f, 1.0f, (short) 10, (short) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d, 100.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 1.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        double[] doubleArray5 = new double[] { (-1), (short) 10, '#', 1, 0L };
        double[] doubleArray10 = new double[] { 1L, (short) 0, (short) -1, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 35.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        double[] doubleArray2 = new double[] { (short) 0, 0.0d };
        double[] doubleArray4 = new double[] { 1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        double[] doubleArray3 = new double[] { 100, 100, 10.0d };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 100.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        double[] doubleArray4 = new double[] { 10, (byte) 0, 1.0f, (byte) 1 };
        double[] doubleArray8 = new double[] { 100, 0, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        double[] doubleArray6 = new double[] { (-1L), '4', 10L, (short) 1, (short) -1, 100 };
        double[] doubleArray12 = new double[] { (short) 1, (short) 0, 100.0f, 100, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        double[] doubleArray5 = new double[] { '4', 10.0d, '4', 0L, 1.0f };
        double[] doubleArray10 = new double[] { 100, 0L, (byte) -1, (-1) };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d, 52.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        double[] doubleArray5 = new double[] { (-1), (short) 10, '#', 1, 0L };
        double[] doubleArray10 = new double[] { 1L, (short) 0, (short) -1, (short) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 10.0d, 35.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 0.0d, (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        double[] doubleArray3 = new double[] { 10L, (short) -1, 0 };
        double[] doubleArray6 = new double[] { (byte) 1, (byte) -1 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray6);
        java.lang.Class<?> wildcardClass8 = doubleArray3.getClass();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        double[] doubleArray4 = new double[] { 10, (byte) 0, 1.0f, (byte) 1 };
        double[] doubleArray8 = new double[] { 100, 0, 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 0.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 0.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        double[] doubleArray4 = new double[] { 10, 100, (short) 100, 10L };
        double[] doubleArray8 = new double[] { (short) 10, (byte) 100, 1.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray8.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        double[] doubleArray5 = new double[] { (-1.0f), 0.0d, (short) -1, (byte) 100, 0.0f };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 0.0d, (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        double[] doubleArray0 = null;
        double[] doubleArray6 = new double[] { 'a', (byte) -1, (-1.0f), (-1), (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 97.0d, (-1.0d), (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        double[] doubleArray5 = new double[] { '4', (-1.0d), 100.0d, (byte) 1, 1.0d };
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, (-1.0d), 100.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        double[] doubleArray6 = new double[] { (-1L), '4', 10L, (short) 1, (short) -1, 100 };
        double[] doubleArray12 = new double[] { (short) 1, (short) 0, 100.0f, 100, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 52.0d, 10.0d, 1.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 0.0d, 100.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        double[] doubleArray6 = new double[] { 10.0f, (short) 10, 0L, '#', 1L, (short) 100 };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 10.0d, 0.0d, 35.0d, 1.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        double[] doubleArray2 = new double[] { (-1L), (byte) 0 };
        double[] doubleArray4 = new double[] { (short) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        double[] doubleArray2 = new double[] { (byte) 1, (byte) 100 };
        double[] doubleArray4 = new double[] { 100.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        double[] doubleArray6 = new double[] { (byte) -1, 0.0d, 100.0f, (short) 10, (short) 0, (-1.0d) };
        double[] doubleArray12 = new double[] { ' ', ' ', (byte) -1, 0, 10.0d };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 0.0d, 100.0d, 10.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 32.0d, (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        double[] doubleArray5 = new double[] { 0L, 0, 100, (-1.0f), (short) 1 };
        double[] doubleArray10 = new double[] { 'a', 10, 0L, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 97.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        double[] doubleArray6 = new double[] { 100L, 10, 10.0d, (-1L), 'a', (byte) -1 };
        double[] doubleArray12 = new double[] { ' ', 10.0f, 1L, 10.0d, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray12.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 10.0d, (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 10.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        double[] doubleArray4 = new double[] { 10.0f, '#', 1, '#' };
        double[] doubleArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 35.0d, 1.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        double[] doubleArray0 = null;
        double[] doubleArray5 = new double[] { (-1), 'a', (byte) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d), 97.0d, (-1.0d), 32.0d }, 1.0E-15);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        double[] doubleArray5 = new double[] { 0L, '4', 1, 1L, 0 };
        double[] doubleArray10 = new double[] { 100, 100L, (byte) -1, 'a' };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray5.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 52.0d, 1.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d, (-1.0d), 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { (-1), (short) 1, (byte) 100, 100.0d, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 1.0d, 100.0d, 100.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        double[] doubleArray5 = new double[] { 0L, 0, 100, (-1.0f), (short) 1 };
        double[] doubleArray10 = new double[] { 'a', 10, 0L, (byte) 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        java.lang.Class<?> wildcardClass12 = doubleArray10.getClass();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 0.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 97.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        double[] doubleArray6 = new double[] { (short) -1, 1, (byte) 100, 10.0d, 'a', 0 };
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d), 1.0d, 100.0d, 10.0d, 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test890");
        double[] doubleArray2 = new double[] { (-1L), (byte) 0 };
        double[] doubleArray4 = new double[] { (short) 10 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test891");
        double[] doubleArray0 = null;
        double[] doubleArray7 = new double[] { 10.0f, 1L, (-1), 100.0d, 1.0f, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, (-1.0d), 100.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test892");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { '#', (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 35.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test893");
        double[] doubleArray5 = new double[] { 10.0f, (byte) -1, '4', 100, '4' };
        double[] doubleArray10 = new double[] { (short) 10, (short) 1, 0, 0 };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray5, doubleArray10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 10.0d, (-1.0d), 52.0d, 100.0d, 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 1.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test894");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { (short) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test895");
        double[] doubleArray6 = new double[] { 100L, 10, 10.0d, (-1L), 'a', (byte) -1 };
        double[] doubleArray12 = new double[] { ' ', 10.0f, 1L, 10.0d, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray6, doubleArray12);
        java.lang.Class<?> wildcardClass14 = doubleArray6.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 10.0d, 10.0d, (-1.0d), 97.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 32.0d, 10.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test896");
        double[] doubleArray0 = null;
        double[] doubleArray3 = new double[] { 10.0d, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray0, doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test897");
        double[] doubleArray3 = new double[] { 'a', '4', 100L };
        double[] doubleArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray3, doubleArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] { 97.0d, 52.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test898");
        double[] doubleArray2 = new double[] { 0.0f, (byte) -1 };
        double[] doubleArray4 = new double[] { 1.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray2, doubleArray4);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test899");
        double[] doubleArray4 = new double[] { 10L, 10.0f, 'a', 1L };
        double[] doubleArray8 = new double[] { 0, 10.0d, 100.0f };
        org.apache.commons.math.linear.EigenMetamorphicTester.testReverseMetamorphicRelation(doubleArray4, doubleArray8);
        java.lang.Class<?> wildcardClass10 = doubleArray4.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d, 10.0d, 97.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }
}

