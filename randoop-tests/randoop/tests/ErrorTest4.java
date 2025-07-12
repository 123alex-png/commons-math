package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

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
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        double[] doubleArray5 = new double[] { (byte) 10, (short) 100, (byte) 0, (-1.0f), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray6 = new double[] { 0.0f, (-1L), (short) 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, 1.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        double[] doubleArray4 = new double[] { 10.0f, 'a', '4', 0L };
        double[] doubleArray9 = new double[] { (-1L), 100, (byte) 100, 100 };
        double[] doubleArray15 = new double[] { 0, (short) -1, (short) 0, 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, (double) 0L);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        double[] doubleArray2 = new double[] { (-1), (byte) -1 };
        double[] doubleArray8 = new double[] { 100.0f, 1L, 100.0f, (-1), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 1.0f);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        double[] doubleArray5 = new double[] { 10, 1.0d, (short) 0, (byte) 100, 0.0f };
        double[] doubleArray7 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) 100);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        double[] doubleArray6 = new double[] { 10, (short) 100, '4', 1.0f, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 1);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        double[] doubleArray2 = new double[] { (byte) 10, 100.0d };
        double[] doubleArray7 = new double[] { 0L, (byte) 100, (short) 1, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray6 = new double[] { 0L, 0L, 1.0d, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        double[] doubleArray6 = new double[] { (-1), '#', (short) 0, 100L, (-1), 100L };
        double[] doubleArray11 = new double[] { 0, 100, (-1.0f), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) 100);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        double[] doubleArray2 = new double[] { (short) 1, (-1.0d) };
        double[] doubleArray4 = new double[] { 1L };
        double[] doubleArray8 = new double[] { 10.0f, 1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        double[] doubleArray1 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1L);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        double[] doubleArray4 = new double[] { 0, 'a', 'a', (byte) 0 };
        double[] doubleArray10 = new double[] { (byte) 100, 100.0d, 100L, 10L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 1L);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        double[] doubleArray6 = new double[] { (-1.0d), (-1), (byte) 100, (byte) 100, 1.0d, 10.0f };
        double[] doubleArray13 = new double[] { '4', 100L, 100L, (short) -1, 'a', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, 0.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        double[] doubleArray2 = new double[] { 0L, (short) 0 };
        double[] doubleArray8 = new double[] { (byte) 100, 0.0d, 10.0d, 10.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, 100.0d);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        double[] doubleArray6 = new double[] { ' ', 1.0f, (short) -1, (byte) 100, 0, 10.0d };
        double[] doubleArray10 = new double[] { (byte) 10, 10L, 100L };
        double[] doubleArray17 = new double[] { ' ', (-1), '#', 0L, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray17, (double) 1);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        double[] doubleArray3 = new double[] { (byte) 10, (-1), '#' };
        double[] doubleArray7 = new double[] { (short) 0, 100.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (-1.0d));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        double[] doubleArray2 = new double[] { 0.0f, (byte) -1 };
        double[] doubleArray7 = new double[] { 1, 1.0f, 1.0f, 100.0d };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) -1, (-1.0d), (short) 1, (short) 10, 10.0d, (-1.0d) };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        double[] doubleArray6 = new double[] { 0, ' ', '4', 0L, 10.0f, (byte) 1 };
        double[] doubleArray12 = new double[] { 1.0d, 100, (byte) 1, '4', '#' };
        double[] doubleArray18 = new double[] { (byte) -1, 0, (short) -1, '4', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray18, (-1.0d));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100 };
        double[] doubleArray4 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray4, (double) 0);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        double[] doubleArray2 = new double[] { 0.0d, 1 };
        double[] doubleArray6 = new double[] { 1.0d, '4', ' ' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) 100L);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        double[] doubleArray5 = new double[] { (byte) -1, (byte) 10, '4', 100.0d, (short) -1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { 100.0f, 100L, '4', 0.0f, 'a', 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray13, (double) 100);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray4 = new double[] { (short) -1, 0 };
        double[] doubleArray9 = new double[] { (byte) 10, (-1L), ' ', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        double[] doubleArray3 = new double[] { (short) 1, '#', 1 };
        double[] doubleArray7 = new double[] { 100.0f, 1.0d, 100L };
        double[] doubleArray12 = new double[] { (byte) 1, 1.0d, '4', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) 10);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        double[] doubleArray6 = new double[] { (-1), 10.0d, (byte) -1, (-1.0d), (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 10L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 1);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        double[] doubleArray2 = new double[] { (-1), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1L);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        double[] doubleArray6 = new double[] { (byte) 1, 100, 1L, 0, 10.0f, 0L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, 0.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        double[] doubleArray3 = new double[] { (byte) 1, '4', 0L };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) 10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray1, 0.0d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        double[] doubleArray3 = new double[] { 10L, 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 0.0f);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        double[] doubleArray3 = new double[] { 1L, 100.0f, '#' };
        double[] doubleArray9 = new double[] { (-1L), 1.0f, '#', (short) -1, (byte) 1 };
        double[] doubleArray11 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray11, (double) 0.0f);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        double[] doubleArray5 = new double[] { 100.0d, (byte) 100, 'a', (byte) 0, 10L };
        double[] doubleArray11 = new double[] { (short) 10, 1L, (short) 10, 100, 'a' };
        double[] doubleArray15 = new double[] { (short) 10, (short) 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, (double) (byte) 100);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { '#', 10.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (-1.0d));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 1 };
        double[] doubleArray8 = new double[] { ' ', 10, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        double[] doubleArray2 = new double[] { 100L, '4' };
        double[] doubleArray5 = new double[] { (byte) 1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (double) (byte) 1);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        double[] doubleArray5 = new double[] { 10L, 10.0d, (byte) 10, 0.0d, 100 };
        double[] doubleArray8 = new double[] { (-1L), 1 };
        double[] doubleArray13 = new double[] { (short) 100, (byte) 1, (byte) 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray13, (double) 100.0f);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        double[] doubleArray4 = new double[] { '4', (short) 100, ' ', (short) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) (byte) 100);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        double[] doubleArray4 = new double[] { (short) 1, (short) -1, 1L, (byte) -1 };
        double[] doubleArray6 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { (short) 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray9, (double) 0L);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        double[] doubleArray4 = new double[] { 0.0f, 1.0d, (byte) 100, 1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) (byte) 100);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 1, 0, ' ', (short) 10, (byte) 0 };
        double[] doubleArray10 = new double[] { 10.0f, 1.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray10, (double) '4');
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1), 10.0d };
        double[] doubleArray5 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 0L, 10L, 100L, 1.0d };
        double[] doubleArray9 = new double[] { 0.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) 0, 10, '4', 0L };
        double[] doubleArray7 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        double[] doubleArray4 = new double[] { ' ', 10, 100.0f, 100L };
        double[] doubleArray8 = new double[] { (byte) 1, 1.0d, (short) 1 };
        double[] doubleArray10 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        double[] doubleArray3 = new double[] { 100, (-1), 0L };
        double[] doubleArray9 = new double[] { (short) 1, 10, 1.0d, (short) 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (-1.0d));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        double[] doubleArray5 = new double[] { 10.0d, 'a', 0.0f, (byte) -1, (short) 0 };
        double[] doubleArray8 = new double[] { 1.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        double[] doubleArray2 = new double[] { (-1L), '4' };
        double[] doubleArray7 = new double[] { (byte) 100, 10, (byte) 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 1, 1.0f, (short) 100, (-1L), (byte) 100 };
        double[] doubleArray9 = new double[] { 1.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray9, (double) 10L);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray3 = new double[] { 0L };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray4, (double) 0.0f);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        double[] doubleArray3 = new double[] { 10L, (byte) 0, (short) 0 };
        double[] doubleArray8 = new double[] { 1, (byte) -1, 1.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) (byte) 10);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        double[] doubleArray3 = new double[] { 10L, 10, (short) -1 };
        double[] doubleArray7 = new double[] { '#', (byte) 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        double[] doubleArray6 = new double[] { '4', 0, 1, 10, '#', (byte) 1 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 1, (-1.0d), (-1L), 10.0f, 10.0d };
        double[] doubleArray8 = new double[] { 1 };
        double[] doubleArray10 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray10, 1.0d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        double[] doubleArray4 = new double[] { (byte) -1, (-1.0d), (byte) 1, (byte) 1 };
        double[] doubleArray8 = new double[] { (-1.0d), 'a', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        double[] doubleArray3 = new double[] { 100.0d, 100.0f, 1 };
        double[] doubleArray6 = new double[] { 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray6 = new double[] { (-1), '4', (-1.0f), 10 };
        double[] doubleArray11 = new double[] { (short) 100, 100, 100L, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, 1.0d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        double[] doubleArray3 = new double[] { 0.0f, (short) 1, 1 };
        double[] doubleArray7 = new double[] { (-1), 0.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 100);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        double[] doubleArray3 = new double[] { 100L, 10L, 'a' };
        double[] doubleArray8 = new double[] { (byte) 1, 100.0f, (short) 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        double[] doubleArray4 = new double[] { 0.0f, (byte) 100, 10.0d, (short) 100 };
        double[] doubleArray6 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray4, (double) 'a');
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 10.0d, (short) 10, 0L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        double[] doubleArray5 = new double[] { ' ', (byte) 10, 100.0d, (byte) -1, 10L };
        double[] doubleArray12 = new double[] { 100L, 1L, '#', (byte) -1, 10, (-1) };
        double[] doubleArray19 = new double[] { 10, (byte) -1, 10, (byte) -1, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray19, (double) 10L);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        double[] doubleArray6 = new double[] { 10.0d, 1.0d, 0.0f, 0L, (-1L), (short) 0 };
        double[] doubleArray11 = new double[] { 100, (byte) 10, ' ', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (short) 10);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        double[] doubleArray3 = new double[] { 1L, (byte) -1, '4' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 0L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        double[] doubleArray2 = new double[] { 10L, 100L };
        double[] doubleArray9 = new double[] { (-1L), (byte) 10, 1L, (short) 1, 1.0f, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        double[] doubleArray2 = new double[] { 10L, (byte) 100 };
        double[] doubleArray8 = new double[] { (-1), (short) 10, '#', (short) -1, (short) 0 };
        double[] doubleArray11 = new double[] { 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray11, (double) 'a');
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray8 = new double[] { 0, 100.0f, 10L, '#', '#', 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) 10);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        double[] doubleArray4 = new double[] { (byte) 0, 10.0f, 10, 0 };
        double[] doubleArray11 = new double[] { (short) 1, 100.0d, '4', (short) 100, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) 0L);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 10, 1, 0.0d, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        double[] doubleArray5 = new double[] { (-1.0f), 100.0d, 10L, 10.0d, 0.0d };
        double[] doubleArray11 = new double[] { '4', (-1), (short) 10, 100L, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (byte) 100);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        double[] doubleArray2 = new double[] { 0.0d, 'a' };
        double[] doubleArray9 = new double[] { (short) 10, (short) 1, (short) 100, (-1.0d), 1.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, (double) (short) 0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        double[] doubleArray4 = new double[] { (short) 10, 0L, 100L, 10.0f };
        double[] doubleArray10 = new double[] { 0, '4', (short) 1, (-1L), (short) 1 };
        double[] doubleArray13 = new double[] { 10, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray13, (double) 10L);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        double[] doubleArray4 = new double[] { 1.0d, (short) 10, (short) 1, 1.0f };
        double[] doubleArray10 = new double[] { 1.0f, 10.0f, 0.0d, (short) 100, (-1.0d) };
        double[] doubleArray13 = new double[] { 10, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray13, (double) (byte) 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        double[] doubleArray3 = new double[] { (-1), (short) 0, 10.0f };
        double[] doubleArray5 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, (double) 0L);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        double[] doubleArray6 = new double[] { 0L, 100L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        double[] doubleArray2 = new double[] { '4', 1 };
        double[] doubleArray6 = new double[] { 100, (-1L), (short) -1 };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, (double) (byte) 10);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, (double) ' ');
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0L, 10L, 0, (byte) -1 };
        double[] doubleArray11 = new double[] { (byte) 10, 1.0f, 10.0f, 100L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) 1L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        double[] doubleArray3 = new double[] { 10L, '#', 1L };
        double[] doubleArray10 = new double[] { (byte) 1, '4', '4', (short) 0, 1L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) 1L);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0f, 100L, 'a', '4', 100, 10.0d };
        double[] doubleArray10 = new double[] { (short) 10, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray10, 0.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        double[] doubleArray3 = new double[] { 10, 0, (byte) 10 };
        double[] doubleArray10 = new double[] { 1.0f, (byte) 1, 0.0d, 100.0d, 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 0.0d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1), (short) 0 };
        double[] doubleArray9 = new double[] { (short) 0, (byte) 100, 0, '#', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray9, (double) 'a');
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        double[] doubleArray2 = new double[] { 0, 0L };
        double[] doubleArray5 = new double[] { (byte) 10, 1.0d };
        double[] doubleArray8 = new double[] { (byte) 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, (-1.0d));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, (byte) 100, (byte) 0, (short) 10, 100L };
        double[] doubleArray9 = new double[] { '#', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray9, (double) '#');
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        double[] doubleArray2 = new double[] { 0, 1 };
        double[] doubleArray6 = new double[] { 100, (byte) 0, (byte) 0 };
        double[] doubleArray11 = new double[] { 'a', '4', 1.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray11, 0.0d);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        double[] doubleArray3 = new double[] { 0, 0.0d, (short) 1 };
        double[] doubleArray9 = new double[] { 0, 100.0d, 100.0f, ' ', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) '#');
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) 0, (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 0, 1L, ' ' };
        double[] doubleArray14 = new double[] { (-1.0d), (-1.0d), (byte) 0, 100, 0L, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray14, (double) (byte) 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        double[] doubleArray3 = new double[] { 0.0f, (short) 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { '4', (-1L), (-1L), (-1L), (-1L) };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray7, (double) 0L);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) -1, 1L, 0.0d, (-1), 100.0f, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10, (-1.0d), 'a', 10.0d, (-1.0d), 100.0f };
        double[] doubleArray13 = new double[] { 0.0f, 'a', 10.0d, 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) (-1.0f));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray5 = new double[] { 1L, 0.0d, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 100L);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        double[] doubleArray4 = new double[] { 100.0d, 'a', (short) 0, '4' };
        double[] doubleArray9 = new double[] { (-1), 10, 100.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 100.0f);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray3 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, 1.0d);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        double[] doubleArray1 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) -1);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        double[] doubleArray3 = new double[] { 10, '4', 'a' };
        double[] doubleArray9 = new double[] { (byte) 10, (-1.0d), 0.0d, 10, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, 1.0d);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        double[] doubleArray3 = new double[] { 10L, (-1.0f), (short) 0 };
        double[] doubleArray9 = new double[] { (byte) -1, (byte) 1, (byte) 100, 100L, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        double[] doubleArray2 = new double[] { ' ', (-1.0f) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (-1L));
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10L, 'a', 0, (short) 10, (byte) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray0, (double) 100L);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        double[] doubleArray6 = new double[] { 0L, 'a', (-1L), 100L, (byte) 1, 10.0d };
        double[] doubleArray8 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray8, (double) '#');
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        double[] doubleArray6 = new double[] { (short) 1, 0L, 100.0f, (byte) 0, (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        double[] doubleArray4 = new double[] { 1.0f, (byte) 100, 10L, 0.0d };
        double[] doubleArray6 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray4, (double) '4');
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        double[] doubleArray3 = new double[] { (-1L), 100, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        double[] doubleArray3 = new double[] { 0, (short) 0, 0.0f };
        double[] doubleArray8 = new double[] { 10, 10.0f, '4', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) 10L);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { ' ', 1.0d, (-1), (byte) 1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) 10);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        double[] doubleArray2 = new double[] { 10.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (-1));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        double[] doubleArray6 = new double[] { (-1L), (byte) 1, (-1), 0.0d, ' ', (byte) -1 };
        double[] doubleArray13 = new double[] { (byte) -1, 0.0d, 1.0f, 10, (short) 10, (short) 0 };
        double[] doubleArray19 = new double[] { (-1), 0.0f, (short) 10, (short) -1, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray19, (double) ' ');
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        double[] doubleArray2 = new double[] { 'a', 0.0d };
        double[] doubleArray9 = new double[] { 100.0d, (byte) 1, 10.0d, (byte) -1, 10, (short) -1 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        double[] doubleArray6 = new double[] { 0.0f, 100L, (short) 10, (-1.0f), '4', 1.0f };
        double[] doubleArray10 = new double[] { (byte) -1, '4', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) 1);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        double[] doubleArray5 = new double[] { (-1.0d), 'a', (byte) -1, 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1L));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        double[] doubleArray2 = new double[] { 0L, (-1L) };
        double[] doubleArray8 = new double[] { (-1L), (byte) 100, '4', 1.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        double[] doubleArray3 = new double[] { 0L, 10, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10L);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        double[] doubleArray4 = new double[] { (-1.0d), (short) 10, 1, (byte) 100 };
        double[] doubleArray7 = new double[] { (-1), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) 0.0f);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0f), 100, 10.0d, 1, 1.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        double[] doubleArray3 = new double[] { 1L, 1.0d, (byte) 0 };
        double[] doubleArray7 = new double[] { (-1.0d), 1.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray5 = new double[] { 10, 10.0d, ' ' };
        double[] doubleArray11 = new double[] { (short) 10, 100.0d, 1, (short) 1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray11, 0.0d);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        double[] doubleArray2 = new double[] { 10, (-1) };
        double[] doubleArray9 = new double[] { 10, (short) 100, 10.0f, 10L, 0.0d, 'a' };
        double[] doubleArray16 = new double[] { (-1), 1.0f, (byte) 1, '4', 10.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (double) (short) 10);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        double[] doubleArray6 = new double[] { 10.0f, '#', 10.0d, 100, 0.0f, (byte) 100 };
        double[] doubleArray10 = new double[] { (short) 0, 1.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) (-1.0f));
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray6 = new double[] { (-1.0f), 10L, 100.0f, 0 };
        double[] doubleArray12 = new double[] { (short) 100, 10.0d, (byte) -1, 100.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, (double) (short) -1);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        double[] doubleArray5 = new double[] { (short) 1, 0, 100.0d, 0.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 10);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray7 = new double[] { 10L, (byte) 1, 10, (byte) 10, 0.0f };
        double[] doubleArray12 = new double[] { (-1L), ' ', ' ', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray12, (double) (short) 10);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        double[] doubleArray5 = new double[] { (short) 10, ' ', ' ', (-1.0d), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        double[] doubleArray6 = new double[] { 'a', (byte) 1, ' ', (byte) 100, 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        double[] doubleArray2 = new double[] { 1.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0d);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        double[] doubleArray6 = new double[] { (byte) 100, (-1.0d), 100, 1.0d, 100, 'a' };
        double[] doubleArray10 = new double[] { 10, '#', (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, 100.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        double[] doubleArray1 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 'a');
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        double[] doubleArray5 = new double[] { 0.0f, (-1.0d), (-1), ' ', (short) 1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { '#', 100L, 10.0d, (byte) 10, (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray13, (double) (-1));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        double[] doubleArray1 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        double[] doubleArray4 = new double[] { (-1.0f), 10L, (-1L), 100.0f };
        double[] doubleArray6 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) 100);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        double[] doubleArray3 = new double[] { (short) 0, (byte) 1, 10.0d };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray5, (double) '#');
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        double[] doubleArray4 = new double[] { 0.0f, (-1), (short) 10, 10.0f };
        double[] doubleArray10 = new double[] { ' ', '4', 100.0d, ' ', (short) 10 };
        double[] doubleArray16 = new double[] { 0.0f, 10L, (short) 100, '#', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) 0L);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        double[] doubleArray3 = new double[] { 100L, '4', (-1L) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100, (short) 0, 1L };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        double[] doubleArray4 = new double[] { 0, (-1), 0.0f, 1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) ' ');
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
        double[] doubleArray5 = new double[] { (-1L), (byte) 10, 10.0d, 100.0f, (byte) 0 };
        double[] doubleArray9 = new double[] { 0.0d, 10.0f, 10L };
        double[] doubleArray16 = new double[] { 0, 1L, (short) 100, ' ', 100.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray16, 0.0d);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10.0f, 0.0f, (-1.0d), (-1.0f), (byte) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray5 = new double[] { (byte) 1, (short) 100, (byte) 100 };
        double[] doubleArray8 = new double[] { 0.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray8, (double) 'a');
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
        double[] doubleArray4 = new double[] { 0.0d, 'a', (byte) 1, 0.0d };
        double[] doubleArray6 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) -1, 1.0f };
        double[] doubleArray10 = new double[] { 1L, (-1.0d), (short) 0, (-1), 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0d), (byte) 1, (byte) 10, '4' };
        double[] doubleArray11 = new double[] { (short) 100, (short) -1, (short) -1, 10, (byte) 1 };
        double[] doubleArray13 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        double[] doubleArray3 = new double[] { '#', 'a', (-1.0d) };
        double[] doubleArray10 = new double[] { (short) 100, (byte) -1, '#', (short) -1, 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, (double) '#');
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1L), 10, 0.0f, (byte) 0, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray0, (double) 0L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        double[] doubleArray3 = new double[] { 100, 10L, ' ' };
        double[] doubleArray10 = new double[] { (-1L), 10.0d, (-1), 100, 100.0f, 100 };
        double[] doubleArray11 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray11, (double) (byte) 0);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray5 = new double[] { 10.0f, '#', (short) 0 };
        double[] doubleArray10 = new double[] { (byte) 1, (short) 0, 10L, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray10, (double) 0.0f);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        double[] doubleArray3 = new double[] { (-1.0d), 'a', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        double[] doubleArray3 = new double[] { '#', (-1), (-1) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, 1.0d);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        double[] doubleArray2 = new double[] { 0.0d, (short) -1 };
        double[] doubleArray5 = new double[] { 10L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (-1.0d));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        double[] doubleArray5 = new double[] { 0.0d, 100.0f, 10, 0, 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) '4');
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        double[] doubleArray4 = new double[] { 'a', 10.0f, '4', 100.0d };
        double[] doubleArray8 = new double[] { 10.0d, (-1L), (byte) 0 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray8 = new double[] { ' ', (-1L), (byte) 1, 10.0d, 1.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, 0.0d);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        double[] doubleArray5 = new double[] { (short) 100, (byte) 1, 10.0f, ' ', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) ' ');
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        double[] doubleArray6 = new double[] { 1L, 100.0f, 10, (byte) 100, 0.0f, (byte) 1 };
        double[] doubleArray12 = new double[] { 0L, 1L, (short) 100, 1.0d, (short) 0 };
        double[] doubleArray15 = new double[] { (short) 10, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray15, (double) (short) 10);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        double[] doubleArray5 = new double[] { (short) -1, 100L, (byte) 10, (short) 1, '4' };
        double[] doubleArray9 = new double[] { (short) -1, (short) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        double[] doubleArray5 = new double[] { (short) 1, 10L, 'a', (short) 0, 10.0d };
        double[] doubleArray7 = new double[] { 0.0f };
        double[] doubleArray13 = new double[] { ' ', 1.0d, 1L, (byte) -1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        double[] doubleArray3 = new double[] { 100.0f, (short) 10, (-1.0d) };
        double[] doubleArray7 = new double[] { (byte) 1, '#', 10.0f };
        double[] doubleArray13 = new double[] { 1.0d, 100.0f, 100L, (byte) 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray13, (double) (byte) 100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray5 = new double[] { (byte) 1, (-1.0d), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) ' ');
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        double[] doubleArray2 = new double[] { 10.0f, '#' };
        double[] doubleArray8 = new double[] { 100.0d, 10.0d, (byte) 0, 0.0d, (-1) };
        double[] doubleArray10 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray10, (double) ' ');
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray8 = new double[] { 100.0f, 'a', (byte) 100, 1L, '4', '4' };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) '4');
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { (short) -1, '#', 1L, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) '#');
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        double[] doubleArray2 = new double[] { 0.0f, ' ' };
        double[] doubleArray5 = new double[] { 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray6 = new double[] { 0.0d, (byte) -1, (byte) 100, ' ' };
        double[] doubleArray12 = new double[] { (short) 10, 0, 100.0d, 100.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, (double) 100L);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray6 = new double[] { 1L, 1L, (-1L), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray8 = new double[] { 1.0d, (byte) 100, ' ', 'a', '#', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        double[] doubleArray2 = new double[] { 10L, (short) -1 };
        double[] doubleArray4 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) 0L);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0f), 0.0f, 0.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray5, (double) 'a');
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        double[] doubleArray4 = new double[] { (short) 100, (-1.0d), 100.0f, (short) 100 };
        double[] doubleArray7 = new double[] { 1L, 10.0d };
        double[] doubleArray12 = new double[] { ' ', 0.0d, 0, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray12, (double) 0);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        double[] doubleArray3 = new double[] { (short) 100, 100.0d, 1 };
        double[] doubleArray9 = new double[] { 0.0d, 10.0d, 1.0f, (byte) 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) 1.0f);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        double[] doubleArray2 = new double[] { (byte) 0, 0.0d };
        double[] doubleArray3 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, 0.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        double[] doubleArray5 = new double[] { (-1), (short) 10, (short) 0, 0.0d, (-1L) };
        double[] doubleArray9 = new double[] { (short) 10, ' ', 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) 0);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 1, (-1.0f), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) (short) 100);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        double[] doubleArray6 = new double[] { 'a', '4', 'a', 10.0d, '4', 10.0f };
        double[] doubleArray12 = new double[] { (short) 0, (-1), (byte) 100, 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, 100.0d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        double[] doubleArray4 = new double[] { (byte) -1, 10, 1L, 0.0d };
        double[] doubleArray6 = new double[] { 1L };
        double[] doubleArray11 = new double[] { 0, (-1), 100L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray11, (double) 100L);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1.0f), (byte) 1 };
        double[] doubleArray6 = new double[] { 1.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (double) 100L);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        double[] doubleArray4 = new double[] { '4', (byte) 1, 1.0d, 100.0d };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, 100.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        double[] doubleArray5 = new double[] { (-1), 10, 10, (byte) 100, 0L };
        double[] doubleArray10 = new double[] { (byte) 0, (byte) 10, (byte) 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray5 = new double[] { (-1L), (-1.0f), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray6 = new double[] { 10, 1.0f, (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray6 = new double[] { 100.0f, (-1.0f), 100.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) ' ');
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        double[] doubleArray5 = new double[] { (short) 10, (-1), (byte) 10, (byte) 100, 1.0d };
        double[] doubleArray9 = new double[] { 0L, (byte) -1, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, 1.0d);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (-1.0d));
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        double[] doubleArray2 = new double[] { 1L, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 100.0f);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
        double[] doubleArray2 = new double[] { 0L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) -1);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        double[] doubleArray2 = new double[] { '#', '#' };
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 10, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, 10.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray8 = new double[] { (-1.0f), (-1.0d), 100L, ' ', (-1.0d), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) '#');
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 0, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) (-1.0f));
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        double[] doubleArray4 = new double[] { 100.0f, (short) 100, 100L, 100L };
        double[] doubleArray8 = new double[] { 0L, 1L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, 0.0d);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        double[] doubleArray2 = new double[] { 0, 10.0f };
        double[] doubleArray4 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray4, 10.0d);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray8 = new double[] { (short) -1, 1L, 1, (byte) 1, (-1.0f), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) 100);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        double[] doubleArray2 = new double[] { ' ', 10 };
        double[] doubleArray7 = new double[] { (-1), 1L, 10.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        double[] doubleArray2 = new double[] { 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 1);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        double[] doubleArray6 = new double[] { 1.0d, (byte) 100, (short) 0, 10, 'a', (short) 0 };
        double[] doubleArray8 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) 100L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        double[] doubleArray6 = new double[] { (byte) 0, 1.0d, '#', 100, 100, (byte) 1 };
        double[] doubleArray9 = new double[] { 10L, 10.0f };
        double[] doubleArray14 = new double[] { 100L, ' ', 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray14, (double) 'a');
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
        double[] doubleArray2 = new double[] { (byte) 0, 100.0d };
        double[] doubleArray7 = new double[] { (short) 1, 100, (short) 10, (-1L) };
        double[] doubleArray14 = new double[] { (byte) 1, (byte) 100, 1.0f, (-1), 0L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray14, (double) '4');
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray5 = new double[] { 0, (short) 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, 0.0d);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        double[] doubleArray2 = new double[] { (-1L), '#' };
        double[] doubleArray5 = new double[] { 100L, (-1) };
        double[] doubleArray8 = new double[] { (-1L), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
        double[] doubleArray5 = new double[] { (byte) 1, (short) 1, (short) 1, (-1.0f), (-1.0f) };
        double[] doubleArray10 = new double[] { (byte) 100, 10.0d, (short) 10, (short) 10 };
        double[] doubleArray15 = new double[] { 100, (byte) -1, 0.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, (-1.0d));
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        double[] doubleArray6 = new double[] { 0, '4', 1.0d, (-1L), (byte) -1, ' ' };
        double[] doubleArray10 = new double[] { (short) 100, 100, (short) 10 };
        double[] doubleArray12 = new double[] { 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray12, 0.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        double[] doubleArray3 = new double[] { '#', 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (-1L));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 10, 10, (-1L), '#', ' ', 10.0d };
        double[] doubleArray13 = new double[] { 100.0d, 100L, '#', (-1), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) 'a');
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 100, (short) 10, 'a', (-1), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 1);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 'a', 100L, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (byte) 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
        double[] doubleArray3 = new double[] { (byte) 100, 100, 0 };
        double[] doubleArray6 = new double[] { (short) 0, (byte) 0 };
        double[] doubleArray11 = new double[] { 0.0f, 0.0f, '4', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray11, (double) 'a');
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        double[] doubleArray2 = new double[] { (byte) 1, (short) 1 };
        double[] doubleArray7 = new double[] { (byte) -1, 1.0f, ' ', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray7, (double) (-1L));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        double[] doubleArray3 = new double[] { (byte) -1, 0.0d, 1L };
        double[] doubleArray7 = new double[] { (-1L), (byte) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (byte) -1);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        double[] doubleArray6 = new double[] { 0L, 1.0f, 10.0f, (-1.0d), (-1), (-1.0d) };
        double[] doubleArray8 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray6, (double) (-1));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray6 = new double[] { (byte) -1, 1.0d, 10.0f, 10 };
        double[] doubleArray12 = new double[] { 0.0d, (short) 100, (short) 100, 1.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, (double) 1);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        double[] doubleArray5 = new double[] { (-1), (short) 10, 100L, (-1.0f), (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1L);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray4 = new double[] { (short) -1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        double[] doubleArray6 = new double[] { ' ', (short) 0, (-1.0f), 100L, (-1.0d), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        double[] doubleArray2 = new double[] { '#', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (-1));
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        double[] doubleArray2 = new double[] { (-1), (short) -1 };
        double[] doubleArray5 = new double[] { 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (double) (short) 0);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        double[] doubleArray1 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 0);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        double[] doubleArray3 = new double[] { (-1), 1, 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray5, (double) 0L);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        double[] doubleArray5 = new double[] { (byte) -1, (short) -1, 0, (short) 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
        double[] doubleArray4 = new double[] { '4', 100.0d, 0.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        double[] doubleArray2 = new double[] { 1.0d, (short) 0 };
        double[] doubleArray7 = new double[] { (byte) -1, (-1L), (short) 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        double[] doubleArray1 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 10.0d);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        double[] doubleArray4 = new double[] { 10, (byte) 0, 10L, 100.0f };
        double[] doubleArray9 = new double[] { '4', (-1L), 1.0d, (short) 0 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray10, (double) ' ');
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        double[] doubleArray4 = new double[] { (byte) 100, (byte) 10, 10, (short) -1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        double[] doubleArray6 = new double[] { 10, 10.0d, 0.0d, '#', (short) 100, 100.0d };
        double[] doubleArray10 = new double[] { (-1L), 0, 100L };
        double[] doubleArray12 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        double[] doubleArray4 = new double[] { 100.0f, 100, 1, 100L };
        double[] doubleArray10 = new double[] { 10L, 'a', 10.0d, 1L, 0.0d };
        double[] doubleArray15 = new double[] { (short) 10, (byte) -1, (short) 1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (double) 0);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
        double[] doubleArray4 = new double[] { (-1L), (-1.0f), '#', (short) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) 'a');
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        double[] doubleArray4 = new double[] { 10, (-1), 0.0d, 0 };
        double[] doubleArray8 = new double[] { (-1), 100.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, 0.0d);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
        double[] doubleArray6 = new double[] { 100.0d, (-1.0f), 10L, '#', (-1), (-1.0f) };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 1, (-1.0d), '#', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, 0.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
        double[] doubleArray5 = new double[] { 'a', 10.0d, 1.0f, 0.0f, (-1.0f) };
        double[] doubleArray12 = new double[] { 100.0f, (-1.0f), 10L, 1L, (byte) 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        double[] doubleArray4 = new double[] { (-1), (short) -1, 10L, (-1L) };
        double[] doubleArray6 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0d, 1L, 10.0f, (byte) 0 };
        double[] doubleArray8 = new double[] { 10L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        double[] doubleArray6 = new double[] { (short) 0, '4', 0L, '4', (short) 0, 1 };
        double[] doubleArray11 = new double[] { (short) 1, 10.0d, (byte) 100, '4' };
        double[] doubleArray12 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray12, (double) 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        double[] doubleArray3 = new double[] { 'a', (byte) 1, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) (-1));
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1L, (short) -1, 10.0d, 0L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (short) 100);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        double[] doubleArray4 = new double[] { (-1L), (-1.0f), ' ', 'a' };
        double[] doubleArray8 = new double[] { (byte) 0, 'a', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, (double) 1);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        double[] doubleArray5 = new double[] { 0, 100L, 100, (short) 100, 100 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray8 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray8, (double) 10);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
        double[] doubleArray4 = new double[] { 'a', 10L, 0.0f, 'a' };
        double[] doubleArray6 = new double[] { (-1.0f) };
        double[] doubleArray10 = new double[] { (byte) 10, 1.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray10, 0.0d);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        double[] doubleArray1 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 10.0f);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        double[] doubleArray6 = new double[] { (byte) 1, 0.0f, (-1.0d), 100, 100, 1.0f };
        double[] doubleArray12 = new double[] { (byte) 0, (short) 0, (byte) 1, 100.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) '4');
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray4 = new double[] { (-1.0d), '#' };
        double[] doubleArray10 = new double[] { 0.0f, (short) 100, (byte) 0, 0.0d, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray10, (double) (-1.0f));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
        double[] doubleArray3 = new double[] { 1.0f, ' ', 100.0d };
        double[] doubleArray9 = new double[] { 10L, 1.0f, (-1.0f), 100L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (-1.0d));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1) };
        double[] doubleArray7 = new double[] { 0.0f, 10, ' ', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray7, (double) 0L);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        double[] doubleArray1 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 0.0f);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        double[] doubleArray5 = new double[] { 100, 1.0f, 10, (short) -1, (short) 10 };
        double[] doubleArray10 = new double[] { (short) 1, (byte) 100, 10.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray4 = new double[] { (short) 10, 100.0f };
        double[] doubleArray6 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray6, 10.0d);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        double[] doubleArray6 = new double[] { (byte) 0, 10L, (short) -1, 1.0d, 10.0f, '#' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (-1));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        double[] doubleArray5 = new double[] { (byte) 100, ' ', 10.0d, (-1.0f), (-1) };
        double[] doubleArray10 = new double[] { 0.0f, 100, (byte) 100, 1L };
        double[] doubleArray13 = new double[] { (-1.0d), '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        double[] doubleArray5 = new double[] { (short) 0, (byte) 100, (byte) 0, (-1), (-1L) };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) (-1L));
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        double[] doubleArray2 = new double[] { '4', 1 };
        double[] doubleArray6 = new double[] { 0.0d, 'a', ' ' };
        double[] doubleArray12 = new double[] { 100L, 0.0d, 1.0f, 0.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray12, (double) 0.0f);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        double[] doubleArray6 = new double[] { (-1), (-1L), (-1L), 10, (-1.0f), 100.0d };
        double[] doubleArray8 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray4 = new double[] { 'a', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray1, (double) 100);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        double[] doubleArray6 = new double[] { 100.0d, 100L, 1.0f, (short) 1, 1L, (short) 0 };
        double[] doubleArray13 = new double[] { 10.0f, (-1L), (-1.0f), 10, 10L, 100.0f };
        double[] doubleArray19 = new double[] { 1L, (byte) 1, (short) 100, (short) -1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray19, (double) ' ');
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        double[] doubleArray6 = new double[] { 0.0f, (byte) -1, (short) 1, 10, (-1L), (-1.0d) };
        double[] doubleArray12 = new double[] { (-1.0f), (short) -1, 1L, 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) 1);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        double[] doubleArray6 = new double[] { (byte) 0, 10L, '4', '#', (-1), (-1L) };
        double[] doubleArray9 = new double[] { 0L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (-1.0d));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        double[] doubleArray6 = new double[] { 0.0f, (short) 100, 'a', '#', 100, (-1) };
        double[] doubleArray8 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, 10.0d);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray6 = new double[] { 0L, 10L, (-1L), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 'a');
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        double[] doubleArray2 = new double[] { (-1), 1.0d };
        double[] doubleArray5 = new double[] { 100.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (double) (-1.0f));
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        double[] doubleArray5 = new double[] { 10L, 0.0d, (short) 10, 1.0d, 1.0d };
        double[] doubleArray7 = new double[] { (-1) };
        double[] doubleArray9 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray9, (double) '4');
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
        double[] doubleArray3 = new double[] { 1.0d, 10L, (byte) 1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        double[] doubleArray2 = new double[] { (short) 1, (byte) 1 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { 0, (byte) 100, (byte) 0, 10.0f, 10.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray10, (-1.0d));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        double[] doubleArray4 = new double[] { 100.0d, 100, 10, (-1) };
        double[] doubleArray6 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        double[] doubleArray5 = new double[] { 100.0f, (byte) -1, 0.0f, 1, (short) 1 };
        double[] doubleArray8 = new double[] { (byte) 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) 100);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray5 = new double[] { (-1L), (short) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) 10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        double[] doubleArray2 = new double[] { ' ', (byte) 1 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) -1, (-1.0f), '4', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray8, (double) 100);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100L, 0.0f, 10.0d, (byte) 100, 0L, (-1.0f) };
        double[] doubleArray10 = new double[] { 10L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray10, (double) 1);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        double[] doubleArray3 = new double[] { ' ', '4', (short) 1 };
        double[] doubleArray10 = new double[] { (-1), 10L, (short) 10, '4', 1L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, (double) 1L);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        double[] doubleArray2 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { '4', 'a', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        double[] doubleArray5 = new double[] { 100, (-1L), 0, 1.0f, ' ' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray9 = new double[] { 0.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray9, (double) 100);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
        double[] doubleArray2 = new double[] { 100, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) ' ');
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        double[] doubleArray6 = new double[] { 0L, (byte) 1, (short) -1, 0.0f, 1.0f, (byte) 1 };
        double[] doubleArray11 = new double[] { 100.0d, (byte) 0, (short) -1, (byte) 10 };
        double[] doubleArray16 = new double[] { (short) -1, (-1), (-1), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray16, (double) 100L);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        double[] doubleArray4 = new double[] { 1.0f, '#', 0, '4' };
        double[] doubleArray9 = new double[] { 1L, (-1.0d), (short) 10, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 100.0f);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
        double[] doubleArray4 = new double[] { 0, 1, ' ', (short) 0 };
        double[] doubleArray8 = new double[] { (short) -1, 1.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, (double) 0);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        double[] doubleArray5 = new double[] { (byte) -1, 100L, 100, (byte) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 10L, (-1), (-1L), ' ' };
        double[] doubleArray10 = new double[] { 0, 10, 10.0d };
        double[] doubleArray15 = new double[] { (-1L), (short) 10, (byte) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray15, (double) '#');
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        double[] doubleArray3 = new double[] { (byte) 0, (short) 100, (-1) };
        double[] doubleArray8 = new double[] { 100, 10L, 0.0f, (-1L) };
        double[] doubleArray10 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray10, (double) (-1L));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        double[] doubleArray4 = new double[] { 1, 1, (-1), (byte) -1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        double[] doubleArray4 = new double[] { 0L, 10L, (short) 1, (short) 100 };
        double[] doubleArray8 = new double[] { 100, 1.0f, 'a' };
        double[] doubleArray15 = new double[] { (-1.0f), (short) 10, 1L, 1, 100L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) (short) 100);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
        double[] doubleArray6 = new double[] { (short) -1, 10.0f, 0L, (short) -1, 1.0f, 10.0d };
        double[] doubleArray8 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray6, (-1.0d));
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        double[] doubleArray2 = new double[] { 1.0d, (short) 10 };
        double[] doubleArray7 = new double[] { 1.0f, 0.0f, (short) 10, 1.0d };
        double[] doubleArray13 = new double[] { (byte) 100, 100, (byte) 10, 10.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray13, (double) (short) 100);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        double[] doubleArray4 = new double[] { 100L, 10.0f, 10.0d, 0L };
        double[] doubleArray10 = new double[] { (byte) 1, (short) 100, 1.0d, (short) 1, 1L };
        double[] doubleArray16 = new double[] { (short) 10, 10L, 1, '4', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) (byte) -1);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        double[] doubleArray5 = new double[] { 100.0d, 10, 0.0f, (short) 100, (short) 1 };
        double[] doubleArray8 = new double[] { 'a', 10.0d };
        double[] doubleArray15 = new double[] { (byte) 1, 10.0f, 0, (short) -1, (short) 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray15, (double) (-1L));
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        double[] doubleArray4 = new double[] { (-1L), ' ', (byte) 0, (byte) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        double[] doubleArray3 = new double[] { 1.0f, (short) 10, 100.0d };
        double[] doubleArray6 = new double[] { 0L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (-1.0d));
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        double[] doubleArray3 = new double[] { (-1), (short) 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (-1.0d));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) 0 };
        double[] doubleArray5 = new double[] { 10, 100 };
        double[] doubleArray9 = new double[] { 100.0f, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
        double[] doubleArray3 = new double[] { ' ', 100.0f, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, (-1.0d));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
        double[] doubleArray3 = new double[] { (short) 10, (short) 0, (byte) 100 };
        double[] doubleArray10 = new double[] { 10, ' ', (short) 100, 1, 10.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray3, (double) 1);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        double[] doubleArray6 = new double[] { 1L, 10, 0, (short) -1, 0.0f, 1.0f };
        double[] doubleArray12 = new double[] { '#', 100.0f, (byte) 100, 1.0f, (-1L) };
        double[] doubleArray18 = new double[] { 100, 0.0f, '4', 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray18, (double) (byte) -1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        double[] doubleArray2 = new double[] { (-1.0f), (-1L) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) '4');
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        double[] doubleArray2 = new double[] { 100.0f, 100.0d };
        double[] doubleArray7 = new double[] { 100.0f, 1.0f, '#', (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, 100.0d);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
        double[] doubleArray5 = new double[] { 10.0f, (short) 100, (short) 100, 0L, (byte) 100 };
        double[] doubleArray9 = new double[] { 100, (-1.0d), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        double[] doubleArray3 = new double[] { 1, (byte) 10, (byte) 10 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, 10.0d);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { ' ', 100, (byte) 0, 100L };
        double[] doubleArray11 = new double[] { (-1), 1.0f, (byte) 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, (double) 'a');
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        double[] doubleArray5 = new double[] { (byte) 1, 100L, '#', 'a', (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, 1.0f, 0.0d, 10.0d, 100.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray13 = new double[] { 100.0d, (-1L), 100.0d, 10, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray13, (double) (-1.0f));
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10, 1.0d, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (-1.0d));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        double[] doubleArray3 = new double[] { 10.0f, 0L, (byte) -1 };
        double[] doubleArray10 = new double[] { 100.0d, (byte) 1, 10L, (byte) 100, 100.0f, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) (short) 100);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        double[] doubleArray5 = new double[] { 1L, 100.0f, (byte) 1, (byte) 100, (byte) -1 };
        double[] doubleArray10 = new double[] { 100L, (byte) -1, 'a', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 0.0f);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        double[] doubleArray5 = new double[] { 0.0d, (byte) -1, 10.0d, 0.0f, (byte) 10 };
        double[] doubleArray9 = new double[] { 'a', (-1.0f), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 0L);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray3 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray1, 0.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        double[] doubleArray4 = new double[] { 1, 1, (byte) 1, (byte) 1 };
        double[] doubleArray10 = new double[] { (-1.0d), 0, (byte) 100, (short) 100, 1.0f };
        double[] doubleArray14 = new double[] { 100.0d, 1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray14, (double) 0L);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        double[] doubleArray3 = new double[] { ' ', 100.0d, 0 };
        double[] doubleArray5 = new double[] { '4' };
        double[] doubleArray12 = new double[] { 10.0d, 0, (-1.0d), (short) 1, 1L, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        double[] doubleArray6 = new double[] { '4', (short) 0, (byte) 0, (byte) 1, 0, 100.0d };
        double[] doubleArray10 = new double[] { (short) -1, 100, '#' };
        double[] doubleArray16 = new double[] { (-1L), ' ', '4', (short) 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray16, (-1.0d));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        double[] doubleArray5 = new double[] { '#', 0, '4', 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 0L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        double[] doubleArray6 = new double[] { (short) 100, (short) 1, 'a', 100.0f, (short) 0, 'a' };
        double[] doubleArray9 = new double[] { (short) 100, (byte) 0 };
        double[] doubleArray15 = new double[] { 0, (byte) 0, 1, 0.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, (double) (byte) 0);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0d, (byte) 1, 0.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, (double) (-1L));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
        double[] doubleArray1 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 1.0f);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        double[] doubleArray3 = new double[] { 100.0d, 0L, (short) 0 };
        double[] doubleArray9 = new double[] { (-1.0f), (-1.0f), 0.0f, 1L, 0.0d };
        double[] doubleArray14 = new double[] { '4', 1, 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray14, (double) '#');
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 100, 1.0d, 100.0d, 10.0f, 0L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) 'a');
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        double[] doubleArray3 = new double[] { (byte) 0, 10L, 1.0f };
        double[] doubleArray6 = new double[] { 'a', (short) -1 };
        double[] doubleArray12 = new double[] { (short) 1, 10.0f, '#', 0.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { (byte) -1, (short) -1, (short) -1, (short) 1, (short) -1 };
        double[] doubleArray11 = new double[] { 1, (short) 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray11, (double) 10);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0f, (byte) 100, 100.0d, (short) 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, 10.0d);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        double[] doubleArray4 = new double[] { 10.0d, (byte) 100, 100L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        double[] doubleArray6 = new double[] { 10L, (byte) 0, (byte) 10, (byte) -1, (short) 0, 100L };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray14 = new double[] { 10.0d, (short) 0, '#', (-1), 100.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray14, (double) 10L);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 10);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        double[] doubleArray2 = new double[] { (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 0);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray8 = new double[] { (byte) -1, (short) 1, 1, (short) 10, (short) 0, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, 0.0d);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        double[] doubleArray2 = new double[] { 1, (short) 0 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        double[] doubleArray3 = new double[] { 1, 0.0f, 'a' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray10 = new double[] { '4', 0, (-1.0f), 1.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray10, 0.0d);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        double[] doubleArray4 = new double[] { (short) 100, (-1), (short) 0, 10.0d };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
        double[] doubleArray6 = new double[] { 10.0f, 100.0f, (-1L), (-1.0d), (byte) -1, (short) 100 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { 1, (byte) 0, ' ', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) (short) 0);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        double[] doubleArray6 = new double[] { (byte) 1, (-1.0d), (short) -1, 0.0f, 1, 100L };
        double[] doubleArray11 = new double[] { 100, (byte) -1, 0.0d, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) '4');
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        double[] doubleArray5 = new double[] { (short) -1, (-1.0f), 10, (byte) -1, 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        double[] doubleArray4 = new double[] { (byte) -1, 1, (short) 10, 'a' };
        double[] doubleArray10 = new double[] { 100L, 1.0f, 100, 100.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray4, (double) 0L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        double[] doubleArray2 = new double[] { (-1L), 0.0f };
        double[] doubleArray5 = new double[] { 10.0d, 1 };
        double[] doubleArray9 = new double[] { (byte) 1, (-1L), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray9, 0.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        double[] doubleArray6 = new double[] { (byte) 0, 10, ' ', 10.0d, (-1.0d), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 1);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        double[] doubleArray6 = new double[] { (short) 1, ' ', 0, (byte) 100, 0.0f, (byte) 1 };
        double[] doubleArray10 = new double[] { '#', '4', 10L };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray11, (double) (byte) 100);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        double[] doubleArray3 = new double[] { (short) 100, (-1L), (-1.0d) };
        double[] doubleArray5 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, (double) (short) 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
        double[] doubleArray5 = new double[] { (-1.0f), 100.0f, (byte) 1, (-1.0f), (byte) 1 };
        double[] doubleArray8 = new double[] { 0.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) 'a');
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 1, 100.0d, 1, (byte) 10, (-1L) };
        double[] doubleArray12 = new double[] { 'a', '#', 10.0f, (short) 0, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        double[] doubleArray6 = new double[] { (short) 1, 10.0f, (short) 10, 1.0d, (short) 0, 10.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray5 = new double[] { 0, (short) -1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        double[] doubleArray2 = new double[] { 10, 100L };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (double) 'a');
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1 };
        double[] doubleArray9 = new double[] { (short) 100, 0.0d, 10.0f, (-1.0d), 100.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
        double[] doubleArray2 = new double[] { ' ', 10.0d };
        double[] doubleArray4 = new double[] { '#' };
        double[] doubleArray7 = new double[] { 100.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray7, 0.0d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        double[] doubleArray5 = new double[] { 100L, (short) 0, (short) 10, (byte) 1, (short) 0 };
        double[] doubleArray10 = new double[] { 100.0d, 10.0f, ' ', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        double[] doubleArray5 = new double[] { ' ', (byte) 100, (short) 0, 1L, (short) 1 };
        double[] doubleArray10 = new double[] { (-1), 0L, 1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray10, (double) '#');
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { (short) 0, 100.0f, 0.0f };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray6, (double) 10L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        double[] doubleArray6 = new double[] { (short) 100, (byte) -1, 1L, 100, 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1), 100, (byte) 10, (-1) };
        double[] doubleArray11 = new double[] { 1.0d, ' ', 100.0f, '#', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        double[] doubleArray1 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) -1);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 10, 0, 10.0f, (-1.0f), 'a' };
        double[] doubleArray9 = new double[] { 1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) 0L);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        double[] doubleArray1 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (-1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
        double[] doubleArray2 = new double[] { 0, (byte) 10 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, 100.0d);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        double[] doubleArray5 = new double[] { 0, (byte) 0, (short) 1, (byte) 100, (-1L) };
        double[] doubleArray7 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        double[] doubleArray4 = new double[] { 0L, 0L, (short) 10, 'a' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) (short) 0);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        double[] doubleArray2 = new double[] { 100.0d, (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 10, (-1L), 1.0f, 100.0f };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray10, (double) 10);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { 100, 10L, (byte) 0, (byte) 0, (-1.0d), (byte) 10 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, 0.0d);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        double[] doubleArray4 = new double[] { 0.0f, 100.0f, ' ', 0L };
        double[] doubleArray7 = new double[] { 100.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        double[] doubleArray4 = new double[] { (short) 10, 100, 1.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        double[] doubleArray2 = new double[] { (byte) -1, (short) 100 };
        double[] doubleArray9 = new double[] { 10.0d, 1.0d, (-1), (byte) 1, (byte) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, 10.0d);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        double[] doubleArray3 = new double[] { 1L, (short) 10, (byte) 10 };
        double[] doubleArray5 = new double[] { (short) 1 };
        double[] doubleArray10 = new double[] { 100, 10, '#', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray10, (double) 10);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray7 = new double[] { ' ', (-1.0f), (-1.0d), 100, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) (short) 1);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        double[] doubleArray3 = new double[] { 1.0d, (short) 10, (short) 10 };
        double[] doubleArray7 = new double[] { (short) 100, 100, (short) 100 };
        double[] doubleArray9 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray9, (double) (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        double[] doubleArray4 = new double[] { 0L, 100.0d, (byte) 0, 0 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray8 = new double[] { 100.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray8, (double) 100L);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        double[] doubleArray4 = new double[] { '4', (-1), 1, (byte) -1 };
        double[] doubleArray8 = new double[] { '4', 100, 10 };
        double[] doubleArray14 = new double[] { (-1L), (short) 10, (-1), 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray14, 0.0d);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        double[] doubleArray2 = new double[] { (short) 0, 0.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray5 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray5, (double) 'a');
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        double[] doubleArray3 = new double[] { (byte) 0, 100.0f, 10 };
        double[] doubleArray5 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray6 = new double[] { 0.0f, 100.0d, ' ', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) 0.0f);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        double[] doubleArray3 = new double[] { (byte) 0, 0.0f, 'a' };
        double[] doubleArray6 = new double[] { 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray9 = new double[] { (byte) 0, '#', 0.0f, 1.0d, (byte) -1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray9, (double) 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray8 = new double[] { (-1L), (byte) 0, 0L, 10L, (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { 10L };
        double[] doubleArray5 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        double[] doubleArray1 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1L);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        double[] doubleArray5 = new double[] { '4', (-1.0f), 100.0d, (short) 0, 100.0d };
        double[] doubleArray7 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray4 = new double[] { 1L, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (-1.0d));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        double[] doubleArray3 = new double[] { (short) 10, (-1L), (short) -1 };
        double[] doubleArray8 = new double[] { 1.0f, 100L, (short) 1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        double[] doubleArray2 = new double[] { (-1), ' ' };
        double[] doubleArray5 = new double[] { (short) 100, ' ' };
        double[] doubleArray12 = new double[] { 'a', (short) 10, 100.0d, 1, 0.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray12, (double) 100L);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        double[] doubleArray2 = new double[] { (-1.0d), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 0);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        double[] doubleArray5 = new double[] { 0.0f, (-1L), 100.0f, (short) -1, 10 };
        double[] doubleArray10 = new double[] { (-1.0f), 10.0d, (-1L), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (-1.0f));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) (byte) 100);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray8 = new double[] { 10.0f, 10.0d, (byte) 1, 0, 10.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        double[] doubleArray4 = new double[] { (byte) 100, 1, (-1L), 10.0d };
        double[] doubleArray9 = new double[] { 1.0f, ' ', (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        double[] doubleArray6 = new double[] { 100L, (short) 10, 100.0f, (short) 1, (short) 100, (short) 0 };
        double[] doubleArray12 = new double[] { (byte) -1, (byte) 1, '#', 10.0d, (short) -1 };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
        double[] doubleArray2 = new double[] { 100.0d, '#' };
        double[] doubleArray4 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) (-1.0f));
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray5 = new double[] { 100.0f, (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        double[] doubleArray2 = new double[] { (short) 1, 0.0f };
        double[] doubleArray9 = new double[] { (-1L), 1L, (-1.0d), 10.0f, 0.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) 1.0f);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        double[] doubleArray5 = new double[] { (short) -1, (short) -1, 1L, 10L, 10L };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0f, (short) -1, 10, 0.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray12, (double) 0);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, (byte) -1, 1.0d, 100.0f, '#' };
        double[] doubleArray11 = new double[] { 'a', (short) 100, 100L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) (byte) 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100.0f, ' ', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) '4');
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray3 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) 10L);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        double[] doubleArray3 = new double[] { 1L, (byte) -1, (byte) 1 };
        double[] doubleArray5 = new double[] { 100.0f };
        double[] doubleArray9 = new double[] { (-1.0f), 'a', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray8 = new double[] { (-1L), '#', 1.0f, 0, ' ', (-1.0d) };
        double[] doubleArray15 = new double[] { 0.0d, 100L, 10L, 'a', (short) 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, (double) 10.0f);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        double[] doubleArray4 = new double[] { (short) 0, (-1L), 0.0f, 10L };
        double[] doubleArray10 = new double[] { (byte) -1, 1.0f, (byte) 0, (byte) 100, 10.0f };
        double[] doubleArray15 = new double[] { 0, 100.0f, (byte) 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (double) 0);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        double[] doubleArray3 = new double[] { (short) 100, '#', 100.0d };
        double[] doubleArray9 = new double[] { (-1.0f), (short) 0, 10, 10.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) (-1.0f));
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
        double[] doubleArray3 = new double[] { 1.0f, (short) 1, (-1.0f) };
        double[] doubleArray9 = new double[] { 10.0d, ' ', 1.0f, ' ', (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) 0.0f);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 100L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        double[] doubleArray2 = new double[] { (-1), 0 };
        double[] doubleArray8 = new double[] { 10L, (byte) 0, ' ', 10.0f, 0.0d };
        double[] doubleArray13 = new double[] { (short) -1, 100L, 10.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray13, 0.0d);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        double[] doubleArray5 = new double[] { (short) -1, (-1.0d), (byte) 100, 0L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        double[] doubleArray5 = new double[] { 1, (-1L), (byte) 1, 0.0d, 100.0d };
        double[] doubleArray8 = new double[] { 10.0d, 10.0d };
        double[] doubleArray10 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, (double) (short) 10);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
        double[] doubleArray3 = new double[] { (-1.0f), (-1.0d), 10L };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0d, '4', 0L, 1, 10.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray11, (-1.0d));
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        double[] doubleArray3 = new double[] { '4', 0.0f, (short) 10 };
        double[] doubleArray5 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, (double) 0L);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        double[] doubleArray3 = new double[] { (byte) 10, 100.0d, 1L };
        double[] doubleArray9 = new double[] { (-1L), (short) 1, ' ', (byte) 10, '#' };
        double[] doubleArray13 = new double[] { (byte) -1, 100.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) '#');
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray7 = new double[] { (-1), (byte) 1, 10, (-1), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) 10L);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        double[] doubleArray6 = new double[] { 1.0d, (-1.0d), 1.0f, '4', 1L, (-1.0f) };
        double[] doubleArray8 = new double[] { 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) '#');
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        double[] doubleArray5 = new double[] { (-1L), (short) 1, (short) 100, '4', 0.0d };
        double[] doubleArray11 = new double[] { ' ', 0.0f, '#', '4', 0.0f };
        double[] doubleArray14 = new double[] { ' ', (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray14, (double) (short) -1);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        double[] doubleArray5 = new double[] { ' ', 100, (byte) 0, 10.0d, 'a' };
        double[] doubleArray8 = new double[] { 10L, (-1.0f) };
        double[] doubleArray10 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, (double) '4');
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        double[] doubleArray2 = new double[] { 0.0d, 0 };
        double[] doubleArray6 = new double[] { 10.0d, 1.0d, (byte) 0 };
        double[] doubleArray8 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray8, (double) '#');
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1L), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) '4');
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        double[] doubleArray6 = new double[] { 10L, (-1L), ' ', (byte) 1, (byte) 1, 100.0f };
        double[] doubleArray8 = new double[] { (-1L) };
        double[] doubleArray12 = new double[] { 100, (-1.0d), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        double[] doubleArray2 = new double[] { 'a', 0.0d };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        double[] doubleArray2 = new double[] { (short) 100, (byte) -1 };
        double[] doubleArray6 = new double[] { (-1.0d), 0, (short) 0 };
        double[] doubleArray13 = new double[] { 100.0d, 10.0d, (byte) 10, (short) -1, (-1), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray13, (double) (byte) 100);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1), (short) 0, 10.0f, (short) 1, (short) 10, (short) 100 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, (double) ' ');
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        double[] doubleArray6 = new double[] { (short) 0, 1.0d, 10L, 1.0d, 10L, (byte) 0 };
        double[] doubleArray8 = new double[] { 10 };
        double[] doubleArray15 = new double[] { 1, 'a', 10L, ' ', (short) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray15, (double) 10L);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        double[] doubleArray3 = new double[] { 10L, 1.0d, (byte) 1 };
        double[] doubleArray10 = new double[] { 10, 1.0f, (short) 0, (-1.0f), ' ', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray3, (-1.0d));
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        double[] doubleArray4 = new double[] { (byte) 10, ' ', (short) 100, 1 };
        double[] doubleArray6 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
        double[] doubleArray6 = new double[] { 0, 0L, (byte) -1, (-1L), 1.0d, (short) 10 };
        double[] doubleArray8 = new double[] { (byte) -1 };
        double[] doubleArray14 = new double[] { (short) 100, (byte) -1, (-1.0f), 100.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray14, 10.0d);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        double[] doubleArray2 = new double[] { 100.0d, (short) -1 };
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray2, (double) ' ');
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        double[] doubleArray2 = new double[] { 1.0f, (short) 10 };
        double[] doubleArray9 = new double[] { 10L, 0.0f, (-1.0f), ' ', (short) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (-1.0f));
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        double[] doubleArray5 = new double[] { (-1.0d), 100.0f, ' ', (byte) 100, 0.0d };
        double[] doubleArray8 = new double[] { 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        double[] doubleArray1 = new double[] { 0.0f };
        double[] doubleArray7 = new double[] { 100L, 10.0d, 100.0f, (byte) 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) (short) 1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        double[] doubleArray5 = new double[] { 1, 10L, '4', 1.0f, 1.0f };
        double[] doubleArray10 = new double[] { (-1L), (byte) 0, (-1.0f), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray10, (double) 100);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
        double[] doubleArray4 = new double[] { 100, (short) 10, 1L, 10L };
        double[] doubleArray9 = new double[] { (-1L), (short) 100, 0.0d, (-1) };
        double[] doubleArray14 = new double[] { 0, 1, 0L, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray14, 0.0d);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        double[] doubleArray2 = new double[] { (byte) 1, '#' };
        double[] doubleArray9 = new double[] { 0, (byte) 0, 100, 0.0f, 100, 100 };
        double[] doubleArray15 = new double[] { 100.0d, 1L, (-1L), 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray15, (double) (-1));
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1L), 0.0f, ' ', 0.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) '#');
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
        double[] doubleArray4 = new double[] { (byte) 1, ' ', (-1L), (-1) };
        double[] doubleArray7 = new double[] { (-1.0d), 1 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray8, (double) 0L);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        double[] doubleArray5 = new double[] { (byte) -1, (short) -1, (short) -1, 1, 10.0d };
        double[] doubleArray11 = new double[] { 1.0d, (short) 1, (-1L), ' ', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        double[] doubleArray3 = new double[] { 100.0d, (short) 10, 'a' };
        double[] doubleArray6 = new double[] { '#', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray3, 1.0d);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        double[] doubleArray1 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 10.0d);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        double[] doubleArray5 = new double[] { (short) 1, 'a', (byte) 0, (-1), 'a' };
        double[] doubleArray12 = new double[] { 1.0f, 100.0f, (short) 0, (byte) -1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        double[] doubleArray4 = new double[] { 1L, 10L, (byte) 100, (byte) 0 };
        double[] doubleArray9 = new double[] { (-1), 10L, 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        double[] doubleArray5 = new double[] { (short) 0, 0, 1, (short) -1, (byte) 0 };
        double[] doubleArray10 = new double[] { 0.0f, (byte) 1, 1, 0 };
        double[] doubleArray14 = new double[] { (short) 1, (-1.0d), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray14, (double) (short) 10);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        double[] doubleArray4 = new double[] { 0.0f, 0, 0, (byte) 0 };
        double[] doubleArray7 = new double[] { (byte) 100, 'a' };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray8, (double) ' ');
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        double[] doubleArray5 = new double[] { (-1L), 100.0d, 'a', (short) -1, (short) 10 };
        double[] doubleArray12 = new double[] { (short) 1, 0.0f, (short) -1, (short) -1, (-1L), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        double[] doubleArray2 = new double[] { 10, 0.0f };
        double[] doubleArray6 = new double[] { 100, (-1L), (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 10);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (-1.0f));
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        double[] doubleArray4 = new double[] { 10, (short) 100, 1.0f, (short) 1 };
        double[] doubleArray11 = new double[] { 0.0f, 10.0d, 10.0f, (byte) 100, 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (short) 0);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        double[] doubleArray1 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 10);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        double[] doubleArray5 = new double[] { (-1L), (byte) 1, (-1.0d), 1.0d, (byte) 0 };
        double[] doubleArray8 = new double[] { 10.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (byte) 100);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        double[] doubleArray4 = new double[] { 0.0d, 100.0d, 0.0d, (-1.0f) };
        double[] doubleArray8 = new double[] { 100.0d, (-1.0f), (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) ' ');
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        double[] doubleArray5 = new double[] { (-1L), (short) 100, (byte) 100, 0, 100.0f };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        double[] doubleArray6 = new double[] { (-1.0d), 100L, 'a', 100, '4', 100 };
        double[] doubleArray13 = new double[] { ' ', ' ', (byte) 1, 100, 0, (short) 0 };
        double[] doubleArray17 = new double[] { 100, '4', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray17, (double) 10);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, 1.0f, 100.0d, (byte) 0 };
        double[] doubleArray7 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, 0.0d);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        double[] doubleArray4 = new double[] { (byte) 1, 10L, 1.0f, 100.0f };
        double[] doubleArray11 = new double[] { '4', 100L, 10.0f, (-1L), 1.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        double[] doubleArray6 = new double[] { (-1.0f), (-1.0f), 100.0f, 100, (-1.0f), 10L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) 100L);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
        double[] doubleArray6 = new double[] { 100.0d, (short) 0, 1L, (byte) 0, '4', (short) -1 };
        double[] doubleArray8 = new double[] { (-1.0f) };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray9, (double) 10);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10L, (byte) -1, '#', (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 0L);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        double[] doubleArray4 = new double[] { 100L, (byte) 0, 1.0f, (byte) -1 };
        double[] doubleArray9 = new double[] { (byte) 10, 1.0d, 100.0d, 100.0f };
        double[] doubleArray13 = new double[] { (byte) -1, (byte) 0, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray13, (double) ' ');
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, ' ', 1.0f, (short) 1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 0);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        double[] doubleArray2 = new double[] { (byte) 0, 100 };
        double[] doubleArray9 = new double[] { (byte) 0, (byte) 10, 1.0d, (byte) 10, 100, 1 };
        double[] doubleArray13 = new double[] { (short) -1, 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray13, 1.0d);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        double[] doubleArray5 = new double[] { (short) 1, 10L, 0.0f, (byte) 0, (-1) };
        double[] doubleArray11 = new double[] { (short) 1, ' ', '4', ' ', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (short) 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1 };
        double[] doubleArray8 = new double[] { (short) 0, (byte) 10, (byte) 1, 1L, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray8, (double) (byte) 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 100, (short) 1, (short) -1, 1.0d, '4' };
        double[] doubleArray10 = new double[] { 0.0f, 0.0d, 10.0d };
        double[] doubleArray12 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray12, (double) (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        double[] doubleArray5 = new double[] { 1.0f, 10L, (byte) 1, (short) 10, 1 };
        double[] doubleArray8 = new double[] { 10.0f, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
        double[] doubleArray2 = new double[] { 10.0d, (short) 10 };
        double[] doubleArray7 = new double[] { 10, (short) -1, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        double[] doubleArray5 = new double[] { (-1), 100.0d, 1L, (byte) 1, 0L };
        double[] doubleArray12 = new double[] { 0, (byte) -1, '#', 10L, 100.0f, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 1L);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        double[] doubleArray4 = new double[] { 1, (short) -1, 100L, (-1.0f) };
        double[] doubleArray8 = new double[] { 1.0d, 10L, (short) 1 };
        double[] doubleArray12 = new double[] { 0, '#', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray12, (double) (short) 10);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) 0L);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray3 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        double[] doubleArray2 = new double[] { 1L, 1L };
        double[] doubleArray6 = new double[] { (short) 100, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, (double) 10L);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
        double[] doubleArray3 = new double[] { 100.0f, (short) 0, 0.0f };
        double[] doubleArray9 = new double[] { 1.0f, (byte) -1, (short) 0, 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) (-1L));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        double[] doubleArray5 = new double[] { 'a', 0.0f, (byte) 100, (byte) 100, (byte) 1 };
        double[] doubleArray12 = new double[] { 0.0f, (short) 10, (byte) 10, (byte) 100, 10, (byte) 1 };
        double[] doubleArray19 = new double[] { (-1), ' ', 0, 0, 1.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray19, 100.0d);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        double[] doubleArray4 = new double[] { (short) 1, 1.0d, 1.0f, 10 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray5 = new double[] { (short) 100, 0L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 10L);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        double[] doubleArray5 = new double[] { ' ', 1L, (byte) 10, (byte) 1, (byte) 100 };
        double[] doubleArray9 = new double[] { 'a', 100, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) 100.0f);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        double[] doubleArray3 = new double[] { 1L, (-1L), 1L };
        double[] doubleArray6 = new double[] { (byte) 100, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
        double[] doubleArray5 = new double[] { 10, 100.0f, (short) 100, (-1.0d), 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        double[] doubleArray2 = new double[] { 100.0f, 10.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { 100.0f, (byte) -1, (-1.0f), (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray8, 0.0d);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
        double[] doubleArray6 = new double[] { (byte) 10, (short) -1, (short) 1, (-1.0d), 100.0d, (-1) };
        double[] doubleArray8 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, 0.0d);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) (byte) 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0L };
        double[] doubleArray8 = new double[] { 0.0f, (short) 100, (short) 100, '#', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray8, (double) 0L);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        double[] doubleArray5 = new double[] { (short) 0, 1, (-1), 100.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 100.0d);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 'a', (byte) -1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (short) 10);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
        double[] doubleArray2 = new double[] { (short) 100, (-1.0f) };
        double[] doubleArray8 = new double[] { (short) 100, (-1.0d), 100L, (short) 0, 100.0d };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        double[] doubleArray5 = new double[] { (byte) 100, (byte) -1, (short) 10, (byte) 100, ' ' };
        double[] doubleArray9 = new double[] { 10.0d, (-1.0d), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, 1.0d);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray7 = new double[] { 10L, '#', 1.0d, 10L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray3 = new double[] { (short) 10 };
        double[] doubleArray10 = new double[] { '4', 1, 'a', (short) 100, 'a', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray10, 0.0d);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        double[] doubleArray2 = new double[] { (short) 10, (short) 100 };
        double[] doubleArray6 = new double[] { (byte) 100, 10.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) '4');
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        double[] doubleArray6 = new double[] { 100.0f, (short) 100, (-1L), 0, (-1L), ' ' };
        double[] doubleArray8 = new double[] { 1.0d };
        double[] doubleArray11 = new double[] { (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, (double) (short) 0);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { 0L, '#', 100L, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, 100.0d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        double[] doubleArray3 = new double[] { (-1.0d), (short) -1, 10.0f };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) 1L);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray8 = new double[] { (byte) 0, (byte) -1, 10.0f, '4', 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) 'a');
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        double[] doubleArray2 = new double[] { ' ', 10.0d };
        double[] doubleArray4 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) 100.0f);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, (-1.0d), 10.0d, 10.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (byte) -1);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        double[] doubleArray4 = new double[] { (short) 1, (byte) -1, 1L, 10L };
        double[] doubleArray9 = new double[] { 100.0d, (-1.0f), (-1.0d), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 0);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
        double[] doubleArray6 = new double[] { 0.0f, 0.0d, (byte) -1, 1.0d, (-1.0f), (-1) };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (byte) -1);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        double[] doubleArray3 = new double[] { (short) 10, (short) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 0);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray6 = new double[] { (byte) 100, 1, (short) 1, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 1L);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        double[] doubleArray5 = new double[] { (byte) 0, 100, (byte) 100, 0.0d, (byte) 100 };
        double[] doubleArray9 = new double[] { 10L, '#', 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        double[] doubleArray2 = new double[] { 1L, '#' };
        double[] doubleArray8 = new double[] { 1, ' ', (-1), (-1.0f), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, 0.0d);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        double[] doubleArray2 = new double[] { 1.0d, (-1L) };
        double[] doubleArray5 = new double[] { (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) 1L);
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray6 = new double[] { (short) 1, 100L, (-1.0f), 100 };
        double[] doubleArray11 = new double[] { (short) 0, 100, (-1.0f), (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, (double) (byte) 0);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray7 = new double[] { '#', (byte) 0, 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        double[] doubleArray5 = new double[] { 10.0f, 10.0d, 0L, 10L, (short) 10 };
        double[] doubleArray7 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        double[] doubleArray3 = new double[] { '4', (byte) 10, (-1) };
        double[] doubleArray5 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        double[] doubleArray3 = new double[] { 0.0f, 10.0d, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        double[] doubleArray3 = new double[] { 'a', 0.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) '4');
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0d, (short) 100, (-1.0d), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, 100.0d);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
        double[] doubleArray3 = new double[] { 100L, (byte) 1, (short) 100 };
        double[] doubleArray7 = new double[] { 10L, '#', 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        double[] doubleArray4 = new double[] { 100, (-1), 10.0f, (byte) 1 };
        double[] doubleArray6 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 0L);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        double[] doubleArray6 = new double[] { 100, ' ', (-1.0d), 100.0f, (short) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray6 = new double[] { (byte) 10, 10L, 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, 0.0d);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray4 = new double[] { 1.0f, 0L };
        double[] doubleArray11 = new double[] { 100.0f, (short) 10, 10L, (byte) -1, 0, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray11, (double) (-1L));
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        double[] doubleArray3 = new double[] { ' ', (byte) -1, (-1L) };
        double[] doubleArray8 = new double[] { (byte) 1, (short) 10, 0.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        double[] doubleArray4 = new double[] { 1.0f, (short) 100, '#', 0 };
        double[] doubleArray8 = new double[] { (byte) 100, 10.0f, '4' };
        double[] doubleArray15 = new double[] { 10.0f, 10L, ' ', 1, (short) 100, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) (short) -1);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
        double[] doubleArray6 = new double[] { (short) 100, 10.0d, 100L, 1.0d, 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) '#');
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
        double[] doubleArray4 = new double[] { (short) 100, (byte) 1, 1.0f, 1.0d };
        double[] doubleArray11 = new double[] { 100.0f, 10L, 100, 10, 1.0d, 100 };
        double[] doubleArray14 = new double[] { 0L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray14, (double) (short) 1);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        double[] doubleArray4 = new double[] { (short) 1, 10.0d, 0L, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { (byte) 0, 10.0f, (short) -1, (short) 10, 1.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) 10L);
    }
}
