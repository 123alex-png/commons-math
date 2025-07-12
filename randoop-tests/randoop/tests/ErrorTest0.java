package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        double[] doubleArray6 = new double[] { (-10.0d), 0.001d, (short) 100, '#', (byte) 10, 1000000.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        double[] doubleArray6 = new double[] { 1024.0d, 0.01d, 1.0f, 1.0E-15d, 1.0E-4d, 1024.0d };
        double[] doubleArray13 = new double[] { 10000.0d, 0.0d, 256.0d, 256.0d, 1.0E-10d, 0.3333333d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray13, doubleArray6);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        double[] doubleArray5 = new double[] { 10L, 0.25d, 100L, 1.0E-6d, 1.0E-6d };
        double[] doubleArray11 = new double[] { 0.01d, ' ', (byte) 0, (byte) 100, 0.5d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray11);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        double[] doubleArray5 = new double[] { 0.5d, 1.0f, 1.0f, 100.0f, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        double[] doubleArray4 = new double[] { 1L, (byte) 0, 0.1d, 1.0E-12d };
        double[] doubleArray9 = new double[] { 100, 2.0d, (byte) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray4);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        double[] doubleArray4 = new double[] { (-1.0d), 512.0d, 100.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray4);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        double[] doubleArray5 = new double[] { 'a', 10.0d, 10.0d, (byte) 0, 42.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        double[] doubleArray6 = new double[] { (-0.0d), 1L, 1000000.0d, 1000000.0d, 0.0d, 10 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        double[] doubleArray4 = new double[] { 100, 10.0f, '4', (-1.0f) };
        double[] doubleArray9 = new double[] { (short) 1, 0.001d, 0.9d, 2.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray9);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        double[] doubleArray5 = new double[] { 42.0d, 0.0f, ' ', 1024.0d, 0.9d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        double[] doubleArray5 = new double[] { 10L, (-10.0d), 0, 1.0d, 1.0E10d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        double[] doubleArray6 = new double[] { 0, 1.0E-4d, (-1.0d), 0.001d, (-1), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        double[] doubleArray6 = new double[] { 0.70710678d, 1.0E-8d, 0.1d, (-1L), 1.0E-10d, (-0.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        double[] doubleArray5 = new double[] { 10L, 100.0f, (-1.0d), 1.0E-8d, 1.0E-10d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        double[] doubleArray4 = new double[] { 1000000.0d, (-1), 0.1d, 42.0d };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray4);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        double[] doubleArray4 = new double[] { 10.0f, 0L, (short) 0, 1.0E10d };
        double[] doubleArray9 = new double[] { (-100.0d), (-1), (short) 10, 42.0d };
        double[] doubleArray14 = new double[] { 0.5d, 1, 100.0d, 1.0E-15d };
        // during test generation this statement threw an exception of type java.lang.IllegalArgumentException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray9, doubleArray14);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        double[] doubleArray5 = new double[] { 512.0d, (-1.0E10d), 1.0E-15d, 10000.0d, (-10.0d) };
        double[] doubleArray11 = new double[] { 5.0d, 100.0d, 5.0d, 1.0E-10d, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray5);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        double[] doubleArray6 = new double[] { 10.0f, (byte) 1, 0.9d, 10.0f, 0.5d, 1.0E10d };
        double[] doubleArray13 = new double[] { (-1L), 'a', (byte) 10, 100L, 2.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray13);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        double[] doubleArray6 = new double[] { 100.0f, (-1.0d), (short) 10, 42.0d, 0.5d, (-1.0f) };
        double[] doubleArray13 = new double[] { 1.0E-15d, 1.0E-12d, 100.0d, 0.0d, 1.0E10d, ' ' };
        // during test generation this statement threw an exception of type java.lang.IllegalArgumentException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray13, doubleArray6);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        double[] doubleArray6 = new double[] { (short) 100, 100.0d, (-0.0d), (short) 1, 512.0d, 1.0E-4d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        double[] doubleArray5 = new double[] { 1.0E10d, 1.0E10d, 1.0E-6d, (short) 10, 1.0E-8d };
        double[] doubleArray11 = new double[] { 1, 1.0E8d, (-1L), '4', 1024.0d };
        // during test generation this statement threw an exception of type java.util.concurrent.TimeoutException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray11);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        double[] doubleArray5 = new double[] { 0.01d, ' ', 1.0E8d, 1.0f, 1.0E-6d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test23");
        double[] doubleArray5 = new double[] { (-10.0d), (-0.0d), (-1.0d), 0.1d, (byte) 100 };
        double[] doubleArray11 = new double[] { 1, 10.0d, 1.0E10d, 100.0d, 1 };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray11, doubleArray5);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test24");
        double[] doubleArray5 = new double[] { 42.0d, 1.0d, 512.0d, 0.5d, 256.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test25");
        double[] doubleArray5 = new double[] { (byte) -1, (-1), 2.0d, 0.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test26");
        double[] doubleArray6 = new double[] { 0.0f, '4', 'a', 0.0d, 100, 0.3333333d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test27");
        double[] doubleArray6 = new double[] { 10L, 100.0d, '#', 10.0f, 1.0E-8d, 1024.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test28");
        double[] doubleArray5 = new double[] { (-1), 10000.0d, 512.0d, 1L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray5, doubleArray5, doubleArray5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test29");
        double[] doubleArray6 = new double[] { (byte) -1, 0.0d, 0.01d, 1.0d, '#', 5.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray6, doubleArray6, doubleArray6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test30");
        double[] doubleArray4 = new double[] { 1.0E-8d, 2.0d, (-1.0E10d), 1.0d };
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testAddOuterPointEffect(doubleArray4, doubleArray4, doubleArray4);
    }
}
