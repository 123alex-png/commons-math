package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3001");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { '#', 1.0f, (-1), 1.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3002");
        double[] doubleArray5 = new double[] { 1L, 0.0f, (-1.0f), (short) 1, '4' };
        double[] doubleArray9 = new double[] { 100, 1.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, 0.0d);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3003");
        double[] doubleArray6 = new double[] { (-1.0d), 0.0d, 10L, (short) 0, (short) 10, (-1L) };
        double[] doubleArray9 = new double[] { 10L, 1.0d };
        double[] doubleArray16 = new double[] { (byte) 0, (byte) 10, ' ', 10.0d, (byte) 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray16, (double) (byte) -1);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3004");
        double[] doubleArray1 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3005");
        double[] doubleArray5 = new double[] { 0.0d, (byte) 1, 1L, 1.0f, (-1) };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 10, '4', 1.0d, 10.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray12, (double) 'a');
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3006");
        double[] doubleArray4 = new double[] { 1.0f, 1.0f, (byte) 100, 0 };
        double[] doubleArray6 = new double[] { (byte) 1 };
        double[] doubleArray9 = new double[] { (-1.0f), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray9, (double) '#');
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3007");
        double[] doubleArray6 = new double[] { (-1.0f), (-1.0f), (byte) 10, 1.0f, 1.0d, 0L };
        double[] doubleArray11 = new double[] { (-1L), (short) 100, 0.0f, 0 };
        double[] doubleArray17 = new double[] { (-1L), (short) 0, 100.0f, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray17, (double) (byte) -1);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3008");
        double[] doubleArray6 = new double[] { (-1L), (byte) 1, 10L, (byte) 100, (byte) 0, 100.0f };
        double[] doubleArray13 = new double[] { 100L, (byte) 1, (short) 100, (byte) 0, (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) 1L);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3009");
        double[] doubleArray5 = new double[] { 0.0f, '4', 0L, 10.0f, 10 };
        double[] doubleArray9 = new double[] { 10.0d, 1.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3010");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray7 = new double[] { 100.0d, (byte) 10, (byte) 100, ' ', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) 1);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3011");
        double[] doubleArray3 = new double[] { 1.0f, 0.0d, (short) 0 };
        double[] doubleArray5 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3012");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 'a' };
        double[] doubleArray10 = new double[] { 10.0d, (-1L), 100.0f, 10.0f, 10.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3013");
        double[] doubleArray6 = new double[] { 1, 1.0f, 0, 1.0d, (byte) 1, (-1.0f) };
        double[] doubleArray11 = new double[] { 0.0d, 0L, (-1L), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) 1);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3014");
        double[] doubleArray4 = new double[] { (short) -1, 100L, 0.0f, 100.0d };
        double[] doubleArray6 = new double[] { 100.0d };
        double[] doubleArray11 = new double[] { (short) 10, 100L, (byte) 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray11, (double) (short) 1);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3015");
        double[] doubleArray5 = new double[] { (-1.0d), '#', 10, 0.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3016");
        double[] doubleArray6 = new double[] { (-1), (-1), 'a', 0L, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) '#');
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3017");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.0d, 1 };
        double[] doubleArray6 = new double[] { (short) 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (-1.0d));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3018");
        double[] doubleArray5 = new double[] { 'a', 0.0f, (byte) 10, 0L, 100 };
        double[] doubleArray8 = new double[] { 'a', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) 0L);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3019");
        double[] doubleArray2 = new double[] { 100.0f, (byte) -1 };
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 10, (-1.0f), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray7, (double) 1);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3020");
        double[] doubleArray1 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) 100);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3021");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 0, '4', 100.0f };
        double[] doubleArray10 = new double[] { 10.0f, 1L, (byte) 1, 10L, '#' };
        double[] doubleArray15 = new double[] { (-1.0f), (short) 0, (-1L), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, 0.0d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3022");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 0L, (short) 0, 1L, 10.0d };
        double[] doubleArray12 = new double[] { 10.0d, (byte) 0, 1.0f, 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, 100.0d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3023");
        double[] doubleArray1 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3024");
        double[] doubleArray3 = new double[] { 1L, (byte) -1, 1 };
        double[] doubleArray5 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3025");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray8 = new double[] { 1L, (short) 0, '#', 1.0f, (-1.0d), (-1) };
        double[] doubleArray13 = new double[] { 1L, (short) 0, 10L, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray13, (double) 10L);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3026");
        double[] doubleArray5 = new double[] { (short) 100, 100.0d, (short) -1, 10, (byte) 1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (short) -1, (byte) -1, 0.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) 100L);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3027");
        double[] doubleArray3 = new double[] { '#', 0, 10.0f };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, 0.0d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3028");
        double[] doubleArray4 = new double[] { (-1L), 100.0f, (byte) 0, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3029");
        double[] doubleArray5 = new double[] { (short) 10, (short) 10, 10L, (byte) 0, 100L };
        double[] doubleArray10 = new double[] { (byte) 10, 0L, 10.0d, (-1.0f) };
        double[] doubleArray12 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray12, (double) ' ');
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3030");
        double[] doubleArray4 = new double[] { (-1), 0L, 0L, 0 };
        double[] doubleArray9 = new double[] { 1, (byte) -1, 0L, 0.0d };
        double[] doubleArray15 = new double[] { 'a', 1, '#', 10.0d, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, (double) '4');
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3031");
        double[] doubleArray4 = new double[] { (-1.0f), (short) 0, (byte) 100, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 1.0d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3032");
        double[] doubleArray6 = new double[] { (byte) -1, (byte) 0, 10.0d, 10.0f, 100.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10L);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3033");
        double[] doubleArray4 = new double[] { (-1), (byte) 1, (-1.0f), (byte) 1 };
        double[] doubleArray7 = new double[] { 100L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 100.0f);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3034");
        double[] doubleArray3 = new double[] { (-1.0f), 0.0d, (short) 10 };
        double[] doubleArray8 = new double[] { 0.0f, 10.0f, (byte) 0, (short) -1 };
        double[] doubleArray13 = new double[] { 10.0d, (short) 0, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray13, (double) (short) -1);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3035");
        double[] doubleArray3 = new double[] { 0.0d, (-1.0f), (-1) };
        double[] doubleArray10 = new double[] { '4', (-1.0d), (-1.0d), 100.0d, 1L, 'a' };
        double[] doubleArray13 = new double[] { (-1), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3036");
        double[] doubleArray4 = new double[] { (-1.0f), (byte) 10, 0.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3037");
        double[] doubleArray6 = new double[] { '4', 1.0f, (short) 1, (short) -1, (short) -1, 10.0f };
        double[] doubleArray13 = new double[] { '4', 1.0f, (-1), (-1.0f), 'a', 1 };
        double[] doubleArray18 = new double[] { 100.0f, (short) 10, ' ', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray18, (double) '#');
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3038");
        double[] doubleArray4 = new double[] { 1.0d, (short) 10, 1, (short) 100 };
        double[] doubleArray6 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 100L);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3039");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray8 = new double[] { 10.0f, 1L, (short) -1, (short) 0, 0.0d, 100L };
        double[] doubleArray13 = new double[] { (short) 0, (byte) 0, (short) 10, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray13, (double) 1);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3040");
        double[] doubleArray3 = new double[] { '4', 'a', (-1.0f) };
        double[] doubleArray9 = new double[] { 1L, 1, '4', '#', 10.0f };
        double[] doubleArray13 = new double[] { 0.0f, ' ', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) (byte) 100);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3041");
        double[] doubleArray6 = new double[] { 1L, (-1), 10L, '4', 1.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3042");
        double[] doubleArray3 = new double[] { 10.0f, 100L, 1.0d };
        double[] doubleArray5 = new double[] { (short) 10 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray6, 0.0d);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3043");
        double[] doubleArray5 = new double[] { '#', 100L, (short) 1, 0, '#' };
        double[] doubleArray9 = new double[] { 10L, 10.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 100);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3044");
        double[] doubleArray2 = new double[] { 1, 0.0f };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, 0.0d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3045");
        double[] doubleArray2 = new double[] { ' ', 10L };
        double[] doubleArray5 = new double[] { (-1.0f), 10.0f };
        double[] doubleArray10 = new double[] { (-1), 1, 1.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray10, (double) (byte) 10);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3046");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0L, 0L, 100.0d, (byte) -1, (short) 1, (short) 0 };
        double[] doubleArray13 = new double[] { 10, 0, (byte) 1, 1L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) (short) -1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3047");
        double[] doubleArray6 = new double[] { (short) 10, ' ', 1L, (short) 100, 1, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3048");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, 10.0d);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3049");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray3, (double) 1);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3050");
        double[] doubleArray3 = new double[] { (-1), (byte) 1, 1.0f };
        double[] doubleArray8 = new double[] { 100L, (short) 100, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) (-1));
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3051");
        double[] doubleArray2 = new double[] { (-1.0f), 10L };
        double[] doubleArray8 = new double[] { (short) -1, (-1), 100.0d, (short) 1, (byte) 0 };
        double[] doubleArray13 = new double[] { (short) 10, (byte) 10, 100L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3052");
        double[] doubleArray2 = new double[] { 100.0f, 10.0f };
        double[] doubleArray6 = new double[] { (short) 100, (-1.0d), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 'a');
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3053");
        double[] doubleArray6 = new double[] { (byte) 10, (-1.0f), (short) -1, 0.0d, 100.0f, '#' };
        double[] doubleArray11 = new double[] { '4', 1.0f, (byte) 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, 10.0d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3054");
        double[] doubleArray4 = new double[] { 1, 100L, 1L, 0.0d };
        double[] doubleArray8 = new double[] { 100, (short) -1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3055");
        double[] doubleArray5 = new double[] { 100L, 0, (short) 1, 0.0f, (short) 100 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray7, (double) (-1L));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3056");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, (short) 1, 10, 10.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) 100);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3057");
        double[] doubleArray3 = new double[] { 10, (short) 0, (-1.0d) };
        double[] doubleArray6 = new double[] { 0.0f, '4' };
        double[] doubleArray8 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray8, (double) 'a');
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3058");
        double[] doubleArray4 = new double[] { 10L, 0.0f, (-1.0d), 1.0f };
        double[] doubleArray7 = new double[] { 1.0f, 0 };
        double[] doubleArray14 = new double[] { 10.0d, ' ', 0.0f, 'a', (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray14, (double) (byte) 10);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3059");
        double[] doubleArray5 = new double[] { (byte) 100, 0L, (byte) 0, (short) -1, 1 };
        double[] doubleArray7 = new double[] { 1.0f };
        double[] doubleArray14 = new double[] { '#', 100, (short) 0, 10.0f, 0, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray14, 10.0d);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3060");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray8 = new double[] { (byte) -1, (-1.0d), 0.0d, (-1.0d), ' ', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) '#');
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3061");
        double[] doubleArray3 = new double[] { ' ', (byte) -1, (byte) 100 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3062");
        double[] doubleArray2 = new double[] { 100.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 'a');
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3063");
        double[] doubleArray4 = new double[] { (byte) 100, '#', (-1), (byte) 10 };
        double[] doubleArray10 = new double[] { (short) 10, (byte) -1, (short) 10, 10.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) (short) 0);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3064");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 100L);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3065");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 100.0f);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3066");
        double[] doubleArray5 = new double[] { (short) 1, (byte) 0, (short) 1, 1.0f, 10L };
        double[] doubleArray10 = new double[] { 10L, '4', 0L, (short) 10 };
        double[] doubleArray15 = new double[] { (short) 1, 100.0d, '4', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, 1.0d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3067");
        double[] doubleArray6 = new double[] { (short) 100, (short) 1, (byte) 0, 10.0d, (byte) -1, 100L };
        double[] doubleArray8 = new double[] { (short) 10 };
        double[] doubleArray11 = new double[] { (-1), 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, 1.0d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3068");
        double[] doubleArray2 = new double[] { (-1L), (short) 10 };
        double[] doubleArray7 = new double[] { 1, (short) 100, 0.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) (byte) 1);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3069");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray6 = new double[] { (byte) -1, 'a', 10, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 100);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3070");
        double[] doubleArray6 = new double[] { (byte) 0, (byte) 1, (short) -1, 100L, 0, (-1L) };
        double[] doubleArray13 = new double[] { (short) 10, (byte) -1, 100.0d, 10.0d, 'a', 0.0f };
        double[] doubleArray20 = new double[] { (byte) -1, (-1), (short) 100, 0.0d, 0.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray20, (double) ' ');
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3071");
        double[] doubleArray3 = new double[] { (short) -1, 0, 'a' };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, 100.0d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3072");
        double[] doubleArray5 = new double[] { ' ', (-1.0d), (byte) 100, (short) 10, '#' };
        double[] doubleArray12 = new double[] { ' ', 10.0d, (-1.0f), 10.0f, (byte) 100, 10.0d };
        double[] doubleArray16 = new double[] { (byte) 1, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) (short) 1);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3073");
        double[] doubleArray2 = new double[] { (short) 0, (short) -1 };
        double[] doubleArray6 = new double[] { 'a', 100.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 10);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3074");
        double[] doubleArray4 = new double[] { 10.0d, 10L, '4', (short) 100 };
        double[] doubleArray11 = new double[] { (short) 1, 1, (short) 1, 1, (byte) 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, 100.0d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3075");
        double[] doubleArray6 = new double[] { 100.0d, (short) 0, 10.0f, 1, 1, 0.0f };
        double[] doubleArray12 = new double[] { (-1), '4', 1.0f, 0L, 100L };
        double[] doubleArray16 = new double[] { (-1.0d), 100.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray16, (double) ' ');
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3076");
        double[] doubleArray3 = new double[] { 100L, (-1.0d), 10 };
        double[] doubleArray9 = new double[] { 10.0f, '#', 100L, 100L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3077");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) (byte) 100);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3078");
        double[] doubleArray3 = new double[] { 0, (byte) 1, 100.0f };
        double[] doubleArray9 = new double[] { 0, 10.0d, 100.0d, 10L, (-1) };
        double[] doubleArray10 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3079");
        double[] doubleArray2 = new double[] { 10.0f, (short) 10 };
        double[] doubleArray9 = new double[] { 100.0f, (short) 0, (short) 100, (short) 100, 100, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3080");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 1, (short) -1, 100.0f, 0L, (-1L), 0 };
        double[] doubleArray12 = new double[] { 1, ' ', 10L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray12, (double) 0.0f);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3081");
        double[] doubleArray6 = new double[] { (short) 1, (short) 100, (short) 0, (short) 10, (short) -1, 0L };
        double[] doubleArray13 = new double[] { (byte) 100, 1, 'a', '#', (short) 1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, 0.0d);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3082");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 100 };
        double[] doubleArray5 = new double[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray5, (double) 100);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3083");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 10 };
        double[] doubleArray8 = new double[] { 100, 10.0f, (byte) 10, (short) -1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray8, (double) 0);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3084");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { 'a', 10, (byte) 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3085");
        double[] doubleArray6 = new double[] { 10.0f, 10.0f, 10L, (short) 0, 10.0f, 10.0d };
        double[] doubleArray13 = new double[] { 1L, 100.0d, (short) -1, (-1L), (short) 1, 0L };
        double[] doubleArray16 = new double[] { 100, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray16, (double) '4');
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3086");
        double[] doubleArray5 = new double[] { ' ', (byte) 0, (-1), 1L, 100.0f };
        double[] doubleArray12 = new double[] { 1.0f, '#', 0, 0, 100L, (-1.0d) };
        double[] doubleArray16 = new double[] { 10.0f, 1L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) (byte) -1);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3087");
        double[] doubleArray6 = new double[] { 10.0d, (-1.0d), 10.0f, 100.0f, (-1.0f), 100.0f };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (-1.0d));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3088");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 10 };
        double[] doubleArray9 = new double[] { 0L, 0.0d, 1.0f, 1.0f, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (byte) 0);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3089");
        double[] doubleArray6 = new double[] { '#', 0.0f, (byte) 100, '4', (short) 10, 1.0d };
        double[] doubleArray10 = new double[] { (short) 10, (-1.0d), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, 100.0d);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3090");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0d, (short) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray5, (double) 1L);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3091");
        double[] doubleArray4 = new double[] { 10L, 1, 1L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 1.0d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3092");
        double[] doubleArray5 = new double[] { 1L, 100, 100.0f, 1L, 10.0f };
        double[] doubleArray9 = new double[] { '#', (-1L), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) 0L);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3093");
        double[] doubleArray5 = new double[] { (byte) 100, '#', 0L, (byte) 0, 100.0f };
        double[] doubleArray8 = new double[] { '4', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3094");
        double[] doubleArray6 = new double[] { 0, '4', (byte) -1, (byte) 1, 10.0f, (short) -1 };
        double[] doubleArray12 = new double[] { (short) 100, 10.0f, 'a', (-1.0d), (short) -1 };
        double[] doubleArray14 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray14, (double) 100);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3095");
        double[] doubleArray2 = new double[] { 1.0d, '4' };
        double[] doubleArray6 = new double[] { (byte) 100, 10.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) (short) 100);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3096");
        double[] doubleArray5 = new double[] { 10, (-1L), 0.0f, (byte) 10, '4' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { 1L, (-1L), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray10, 0.0d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3097");
        double[] doubleArray6 = new double[] { (-1L), 100.0f, (byte) 10, 0L, 10.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10L);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3098");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) 100L);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3099");
        double[] doubleArray2 = new double[] { (byte) 0, 100L };
        double[] doubleArray7 = new double[] { 100L, (byte) 0, (-1L), (byte) 100 };
        double[] doubleArray14 = new double[] { 1.0d, 100, (byte) 100, 1.0d, 10L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray14, (double) (byte) 100);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3100");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray3 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3101");
        double[] doubleArray4 = new double[] { 100L, 'a', (short) 10, (byte) 10 };
        double[] doubleArray11 = new double[] { 100.0f, (byte) -1, (short) 10, (byte) 1, (short) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (short) 0);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3102");
        double[] doubleArray3 = new double[] { (byte) 0, 10, (byte) 10 };
        double[] doubleArray10 = new double[] { 100.0f, 1, (short) 10, (short) 10, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, (double) 10);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3103");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 1, 0L, (-1L) };
        double[] doubleArray9 = new double[] { (short) 10, 1L, 100.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray9, (double) 10L);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3104");
        double[] doubleArray6 = new double[] { 0.0d, ' ', 0.0f, '#', (byte) 100, 0L };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 0, (short) 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) 0);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3105");
        double[] doubleArray3 = new double[] { 100L, 1L, 1 };
        double[] doubleArray8 = new double[] { 0L, 0, 10, 10.0f };
        double[] doubleArray15 = new double[] { 0.0f, '4', (short) -1, 0.0d, (short) 0, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray15, (double) '4');
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3106");
        double[] doubleArray4 = new double[] { 1.0f, ' ', '#', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3107");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 'a', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) 100L);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3108");
        double[] doubleArray2 = new double[] { 0.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3109");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.0d, 100.0f, (-1), (-1), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3110");
        double[] doubleArray5 = new double[] { 10.0f, (short) 1, '4', (short) -1, 0 };
        double[] doubleArray7 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3111");
        double[] doubleArray4 = new double[] { 1L, 1, 100, (-1.0d) };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3112");
        double[] doubleArray4 = new double[] { (byte) -1, ' ', '4', 1 };
        double[] doubleArray8 = new double[] { (-1L), 10L, 10 };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray9, 100.0d);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3113");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0f, (short) 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3114");
        double[] doubleArray6 = new double[] { 10.0d, 1, (byte) 1, (byte) 100, 0.0f, 1.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { '#', 100L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray11, 10.0d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3115");
        double[] doubleArray3 = new double[] { 0, 100, (byte) 1 };
        double[] doubleArray6 = new double[] { 1.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (-1));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3116");
        double[] doubleArray5 = new double[] { (byte) -1, (byte) -1, (byte) 1, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1L));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3117");
        double[] doubleArray6 = new double[] { 10L, 0.0f, (byte) 10, 10.0d, (-1.0d), (byte) -1 };
        double[] doubleArray12 = new double[] { (-1), 0.0d, 1L, (-1.0f), 100.0d };
        double[] doubleArray16 = new double[] { (-1.0d), 100.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray16, (double) (-1.0f));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3118");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray5 = new double[] { (byte) -1, '#', (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 100);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3119");
        double[] doubleArray2 = new double[] { 1.0f, 100.0d };
        double[] doubleArray5 = new double[] { (byte) 100, 0L };
        double[] doubleArray8 = new double[] { 1.0d, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, (double) (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3120");
        double[] doubleArray5 = new double[] { 10.0d, 0.0d, (-1.0d), '#', 1.0f };
        double[] doubleArray10 = new double[] { (byte) 0, 100, (byte) 0, (byte) 0 };
        double[] doubleArray12 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray12, (double) (short) -1);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3121");
        double[] doubleArray4 = new double[] { 0.0f, (short) 0, 0, 10 };
        double[] doubleArray7 = new double[] { 1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3122");
        double[] doubleArray4 = new double[] { (-1), 100L, (byte) 100, 0L };
        double[] doubleArray6 = new double[] { 100 };
        double[] doubleArray12 = new double[] { 0.0f, (short) 100, (-1L), (byte) 0, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray12, 0.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3123");
        double[] doubleArray4 = new double[] { (byte) 100, 10.0f, (-1.0d), (byte) -1 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray8 = new double[] { 0.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray8, (double) (byte) 100);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3124");
        double[] doubleArray3 = new double[] { (byte) 100, 100, (byte) -1 };
        double[] doubleArray5 = new double[] { (byte) 1 };
        double[] doubleArray11 = new double[] { 1, (short) 0, 1.0d, 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray11, (double) 10);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3125");
        double[] doubleArray4 = new double[] { (short) 1, 10L, (-1.0f), (short) 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) 0.0f);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3126");
        double[] doubleArray2 = new double[] { ' ', '4' };
        double[] doubleArray7 = new double[] { 10.0f, 1.0f, 'a', 100.0d };
        double[] doubleArray9 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray9, (double) 10);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3127");
        double[] doubleArray2 = new double[] { (byte) 1, 1.0f };
        double[] doubleArray8 = new double[] { 10L, 0L, (byte) 1, (-1L), (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3128");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray5 = new double[] { (short) 100, 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) 1L);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3129");
        double[] doubleArray2 = new double[] { 10L, 1.0d };
        double[] doubleArray9 = new double[] { (short) 10, (short) -1, 1.0d, (short) 0, (byte) 1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (-1));
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3130");
        double[] doubleArray4 = new double[] { (-1), 0.0d, 0L, '#' };
        double[] doubleArray8 = new double[] { (-1.0f), 'a', 10L };
        double[] doubleArray13 = new double[] { 1, 0.0d, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray13, (double) (short) -1);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3131");
        double[] doubleArray4 = new double[] { 100.0d, (short) 100, (short) 1, 0.0d };
        double[] doubleArray8 = new double[] { (byte) 10, (byte) 100, 'a' };
        double[] doubleArray10 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, (double) (-1L));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3132");
        double[] doubleArray5 = new double[] { 10, 0.0f, 0.0d, '4', (-1) };
        double[] doubleArray8 = new double[] { 0.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, 1.0d);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3133");
        double[] doubleArray4 = new double[] { 0L, 10, ' ', (-1L) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3134");
        double[] doubleArray2 = new double[] { 10, 1.0d };
        double[] doubleArray8 = new double[] { 10, (byte) 1, (-1.0d), 'a', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 0L);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3135");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { (-1.0d), '#', '#', 1, (-1.0f), 1 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) '4');
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3136");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray5 = new double[] { 1, 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3137");
        double[] doubleArray2 = new double[] { 0.0d, (-1L) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3138");
        double[] doubleArray1 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 0);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3139");
        double[] doubleArray4 = new double[] { (-1.0d), 'a', 1.0d, (short) -1 };
        double[] doubleArray7 = new double[] { 1.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3140");
        double[] doubleArray3 = new double[] { (short) 100, 100L, '4' };
        double[] doubleArray7 = new double[] { 10L, (-1), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (-1.0d));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3141");
        double[] doubleArray6 = new double[] { '4', 1.0d, (short) 100, 100.0f, (byte) 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3142");
        double[] doubleArray2 = new double[] { 100, (-1) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (-1.0f));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3143");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3144");
        double[] doubleArray4 = new double[] { (byte) 0, (-1L), 10L, 10.0d };
        double[] doubleArray7 = new double[] { (byte) 1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3145");
        double[] doubleArray4 = new double[] { (-1), ' ', (short) -1, (-1L) };
        double[] doubleArray6 = new double[] { '#' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3146");
        double[] doubleArray6 = new double[] { 10.0d, (-1.0d), 100, 0.0d, 10L, 0L };
        double[] doubleArray11 = new double[] { (byte) 10, (byte) 1, (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) 0L);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3147");
        double[] doubleArray5 = new double[] { (-1), 100L, 10L, 10.0d, 1.0f };
        double[] doubleArray9 = new double[] { (byte) 100, (-1), (byte) 1 };
        double[] doubleArray15 = new double[] { (short) -1, (short) 100, (byte) 1, '4', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray15, (double) 100);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3148");
        double[] doubleArray1 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 0.0d);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3149");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0d, (-1.0f), 0.0d, (short) 0, 0.0f };
        double[] doubleArray12 = new double[] { (-1L), (short) 0, '4', 100L, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray12, (double) 100L);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3150");
        double[] doubleArray2 = new double[] { (short) 10, (byte) -1 };
        double[] doubleArray4 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 'a');
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3151");
        double[] doubleArray6 = new double[] { 0, ' ', 100.0d, 0L, '#', (-1) };
        double[] doubleArray8 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) 10L);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3152");
        double[] doubleArray6 = new double[] { 1.0f, (short) 0, 100.0d, 100L, 0.0f, (-1L) };
        double[] doubleArray10 = new double[] { 10L, (-1), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) '#');
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3153");
        double[] doubleArray6 = new double[] { 0.0d, (-1.0f), 100.0f, 10, 0.0f, 0.0f };
        double[] doubleArray10 = new double[] { 0L, 100.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, 100.0d);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3154");
        double[] doubleArray4 = new double[] { (-1.0d), 100L, 10.0d, 1L };
        double[] doubleArray10 = new double[] { 100, 'a', 100L, (byte) 100, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 10);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3155");
        double[] doubleArray4 = new double[] { (short) 1, (short) 0, (short) 10, ' ' };
        double[] doubleArray9 = new double[] { 1.0d, (short) 100, ' ', (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) (byte) 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3156");
        double[] doubleArray5 = new double[] { (byte) 100, 100, (-1.0f), (-1.0d), 0 };
        double[] doubleArray8 = new double[] { 1.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, 10.0d);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3157");
        double[] doubleArray5 = new double[] { 100, (byte) 10, 0L, 10.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3158");
        double[] doubleArray5 = new double[] { (byte) 10, 10.0f, 0.0d, 1L, (byte) -1 };
        double[] doubleArray11 = new double[] { 10.0d, ' ', (byte) 10, 100.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, 10.0d);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3159");
        double[] doubleArray3 = new double[] { 1, 1.0d, (short) 100 };
        double[] doubleArray5 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, 10.0d);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3160");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 0, 1.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) ' ');
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3161");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 10, (-1L), '#', 1.0d, 0.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3162");
        double[] doubleArray2 = new double[] { 1.0d, (short) 100 };
        double[] doubleArray6 = new double[] { 0L, 10.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, 0.0d);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3163");
        double[] doubleArray4 = new double[] { 100.0f, (byte) 10, (short) 1, (short) 1 };
        double[] doubleArray10 = new double[] { 1.0d, 0L, 0, 0L, 1 };
        double[] doubleArray11 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray11, (-1.0d));
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3164");
        double[] doubleArray3 = new double[] { 1L, 100, 0L };
        double[] doubleArray6 = new double[] { (-1.0d), 1L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3165");
        double[] doubleArray3 = new double[] { 100.0f, (byte) 100, (short) 100 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, 0.0d);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3166");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray3 = new double[] { (byte) 0 };
        double[] doubleArray9 = new double[] { (short) 1, (short) 10, (-1L), 10.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) 0.0f);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3167");
        double[] doubleArray3 = new double[] { 0.0f, (short) 0, (short) -1 };
        double[] doubleArray6 = new double[] { (byte) 1, 0L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3168");
        double[] doubleArray6 = new double[] { (short) 100, 10, 100, (byte) 100, 10L, 0 };
        double[] doubleArray11 = new double[] { (-1.0d), (short) 100, (short) -1, (byte) 100 };
        double[] doubleArray13 = new double[] { 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray13, (double) (-1.0f));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3169");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray3 = new double[] { (byte) 0 };
        double[] doubleArray7 = new double[] { 100L, (short) 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray7, (double) 10L);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3170");
        double[] doubleArray3 = new double[] { (byte) 100, (byte) 1, 1.0d };
        double[] doubleArray8 = new double[] { 0.0d, '4', (byte) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) 100.0f);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3171");
        double[] doubleArray5 = new double[] { (-1), 100.0d, 1.0f, (short) 1, (-1.0d) };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) (byte) 0);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3172");
        double[] doubleArray6 = new double[] { ' ', 0, (byte) 100, 10.0d, (short) 10, ' ' };
        double[] doubleArray9 = new double[] { (short) 10, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3173");
        double[] doubleArray4 = new double[] { (short) 10, (short) 0, 1.0d, 10.0f };
        double[] doubleArray8 = new double[] { 0L, '#', 0.0f };
        double[] doubleArray13 = new double[] { 10.0f, 0.0f, 0.0d, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray13, (double) 10);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3174");
        double[] doubleArray3 = new double[] { ' ', (byte) -1, (byte) 100 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) 1);
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3175");
        double[] doubleArray2 = new double[] { 0L, (short) -1 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (byte) 100);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3176");
        double[] doubleArray1 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) -1);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3177");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10, 0L, (short) 1, (short) 10, 10.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3178");
        double[] doubleArray5 = new double[] { 100L, 1.0f, 0.0f, 1.0f, 100.0f };
        double[] doubleArray9 = new double[] { 0, 0.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) (-1));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3179");
        double[] doubleArray4 = new double[] { (short) 10, (short) 0, (short) 10, (-1) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray6, (double) 0L);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3180");
        double[] doubleArray5 = new double[] { (-1.0f), (short) 10, (-1.0f), (short) -1, (short) -1 };
        double[] doubleArray10 = new double[] { (byte) -1, (short) 0, 100.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 0L);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3181");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, 10, 100.0f, 100.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3182");
        double[] doubleArray2 = new double[] { (short) 10, (byte) 100 };
        double[] doubleArray8 = new double[] { (byte) 0, 10, 10.0f, 100.0f, 1.0d };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, (double) 1L);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3183");
        double[] doubleArray4 = new double[] { 100.0f, (byte) 1, '4', 0L };
        double[] doubleArray8 = new double[] { (byte) 0, (short) 0, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3184");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray5 = new double[] { 100.0d, 0, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) 100L);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3185");
        double[] doubleArray2 = new double[] { (-1.0f), (-1.0f) };
        double[] doubleArray9 = new double[] { 100L, 'a', 100, '#', (-1L), '#' };
        double[] doubleArray16 = new double[] { (-1.0d), (short) 100, (byte) 10, (-1), '#', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (double) (byte) -1);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3186");
        double[] doubleArray3 = new double[] { 10.0d, (short) 1, '4' };
        double[] doubleArray10 = new double[] { 1, 1L, (-1), 0, 'a', 'a' };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray11, (double) (short) 100);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3187");
        double[] doubleArray6 = new double[] { (-1.0d), (-1L), (byte) 100, 100, (byte) 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0L);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3188");
        double[] doubleArray3 = new double[] { 0L, 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3189");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { ' ', ' ' };
        double[] doubleArray9 = new double[] { ' ', '4', (byte) 10, (byte) 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3190");
        double[] doubleArray2 = new double[] { (byte) 0, 10.0f };
        double[] doubleArray7 = new double[] { (byte) 10, (short) 100, '4', (-1.0d) };
        double[] doubleArray12 = new double[] { (-1.0d), 'a', 1L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray12, (double) (short) 10);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3191");
        double[] doubleArray3 = new double[] { '4', (short) 1, (short) -1 };
        double[] doubleArray8 = new double[] { (-1.0f), 10.0d, '#', (byte) 1 };
        double[] doubleArray10 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3192");
        double[] doubleArray6 = new double[] { (byte) 10, '#', 10L, 'a', 100.0d, 10L };
        double[] doubleArray9 = new double[] { 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) 1.0f);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3193");
        double[] doubleArray4 = new double[] { 10.0d, 0, (byte) 0, (short) -1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3194");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, (byte) -1, (byte) -1, (-1.0f), (byte) 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) 10);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3195");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 1, 100.0d };
        double[] doubleArray6 = new double[] { (short) 1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3196");
        double[] doubleArray2 = new double[] { 100, 0L };
        double[] doubleArray5 = new double[] { 100.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) 100);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3197");
        double[] doubleArray4 = new double[] { (-1.0f), (short) -1, 10.0d, (byte) 10 };
        double[] doubleArray10 = new double[] { '4', (short) 1, (byte) -1, (short) 0, 10.0d };
        double[] doubleArray17 = new double[] { (byte) 1, (short) 1, 0.0f, (byte) 1, 'a', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray17, (double) '4');
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3198");
        double[] doubleArray5 = new double[] { 0.0f, 100, (byte) 1, ' ', (byte) 0 };
        double[] doubleArray8 = new double[] { (byte) 0, '#' };
        double[] doubleArray15 = new double[] { 100.0d, (short) 1, 1, (-1.0d), 1.0d, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray15, (double) (byte) 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3199");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray7 = new double[] { 100.0d, (byte) 100, 1, (byte) 0, 10L };
        double[] doubleArray12 = new double[] { 0.0f, (byte) 100, 100.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3200");
        double[] doubleArray5 = new double[] { 1, (byte) -1, 1L, 10, 10L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (double) 0);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3201");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray6 = new double[] { 10L, 0.0f, (short) 1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 1L);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3202");
        double[] doubleArray2 = new double[] { 0.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 100);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3203");
        double[] doubleArray2 = new double[] { 0.0d, (-1.0d) };
        double[] doubleArray7 = new double[] { 100, 1L, (byte) -1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3204");
        double[] doubleArray5 = new double[] { (byte) -1, (short) 10, (byte) -1, 0.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3205");
        double[] doubleArray4 = new double[] { 100.0d, (byte) 0, (byte) 0, 1L };
        double[] doubleArray10 = new double[] { 10.0d, 10.0d, (short) -1, 10.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) 1L);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3206");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 0, 1.0d, (-1L), (byte) 0, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3207");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, 10.0d, 1L, (-1L), 100.0f };
        double[] doubleArray13 = new double[] { 0.0f, 10.0f, (byte) 10, (byte) 1, (short) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3208");
        double[] doubleArray2 = new double[] { 0.0f, 1L };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray7 = new double[] { '#', 0, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3209");
        double[] doubleArray6 = new double[] { 100L, (byte) 100, (short) 10, (short) 0, 1L, (byte) 1 };
        double[] doubleArray10 = new double[] { 0, (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) (short) 0);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3210");
        double[] doubleArray4 = new double[] { (-1.0f), 10, (byte) -1, '#' };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { (short) -1, (short) -1, 100, '#', 10L, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3211");
        double[] doubleArray3 = new double[] { 'a', 0.0f, 0 };
        double[] doubleArray8 = new double[] { 10.0f, (short) 10, (byte) 10, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3212");
        double[] doubleArray6 = new double[] { (-1), 10, (-1.0d), (byte) 100, 0.0d, (byte) 100 };
        double[] doubleArray13 = new double[] { 100.0d, 'a', 0.0d, 100.0d, (byte) 10, (-1.0f) };
        double[] doubleArray17 = new double[] { (byte) 10, 10L, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray17, (double) (short) 10);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3213");
        double[] doubleArray3 = new double[] { (short) 1, 0.0d, 10.0d };
        double[] doubleArray10 = new double[] { 0.0d, 100L, (-1.0f), 100.0f, (byte) 100, (byte) 0 };
        double[] doubleArray14 = new double[] { (short) 10, 100.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray14, 0.0d);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3214");
        double[] doubleArray3 = new double[] { 10, (short) 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 100);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3215");
        double[] doubleArray2 = new double[] { (byte) 0, 0.0f };
        double[] doubleArray7 = new double[] { 1.0d, (-1L), '#', (byte) 0 };
        double[] doubleArray10 = new double[] { 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3216");
        double[] doubleArray5 = new double[] { (byte) 10, 0L, 10.0f, 10.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 100);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3217");
        double[] doubleArray5 = new double[] { '#', (-1L), (byte) 100, 100.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '4');
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3218");
        double[] doubleArray5 = new double[] { (short) -1, 1.0f, (-1L), (byte) 1, 1.0f };
        double[] doubleArray12 = new double[] { 100.0d, 1L, 'a', (short) 0, 100.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, (double) (short) 10);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3219");
        double[] doubleArray5 = new double[] { '4', 100, 1, (short) 1, (-1.0f) };
        double[] doubleArray7 = new double[] { (-1) };
        double[] doubleArray10 = new double[] { 0.0d, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3220");
        double[] doubleArray4 = new double[] { 'a', (-1.0d), (short) 100, (short) -1 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray12 = new double[] { 0.0f, 10.0d, 1.0f, (byte) 10, (short) -1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray12, (double) (-1.0f));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3221");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray6 = new double[] { 100, 0.0f, 100.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) (short) 0);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3222");
        double[] doubleArray3 = new double[] { 100, (-1.0d), (-1) };
        double[] doubleArray6 = new double[] { 1.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3223");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray7 = new double[] { ' ', '4', 0L, (byte) 100, 1 };
        double[] doubleArray11 = new double[] { (short) 10, (-1L), 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3224");
        double[] doubleArray6 = new double[] { (short) 1, 1L, (-1), 1, 10, (-1) };
        double[] doubleArray11 = new double[] { (byte) 0, 1.0f, (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, 0.0d);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3225");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0d, (byte) 100, '4', 100L, ' ' };
        double[] doubleArray12 = new double[] { (short) 1, 100.0d, '4', 100L, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray12, 0.0d);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3226");
        double[] doubleArray4 = new double[] { (short) 100, (short) -1, 'a', (-1.0f) };
        double[] doubleArray7 = new double[] { 0, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3227");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) (-1L));
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3228");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray7 = new double[] { 10.0f, (short) 100, (short) -1, (byte) 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 10.0d);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3229");
        double[] doubleArray4 = new double[] { 10.0f, 1, 10.0d, (byte) 0 };
        double[] doubleArray10 = new double[] { 10, (byte) -1, 100.0d, 100.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3230");
        double[] doubleArray1 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 10);
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3231");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray8 = new double[] { (-1.0d), 1L, (short) 0, (-1), (short) 0, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) (-1));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3232");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray4 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray4, (double) '#');
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3233");
        double[] doubleArray3 = new double[] { (-1.0d), '#', 10.0f };
        double[] doubleArray8 = new double[] { 100, '#', (short) 1, (byte) 100 };
        double[] doubleArray15 = new double[] { 100, 1, 0.0d, (-1L), 10.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray15, 0.0d);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3234");
        double[] doubleArray2 = new double[] { 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1.0f);
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3235");
        double[] doubleArray6 = new double[] { 100L, 100.0d, 1.0d, (short) -1, 0.0f, 1 };
        double[] doubleArray13 = new double[] { 0, 0, 0.0d, (short) 1, 10.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3236");
        double[] doubleArray3 = new double[] { (-1), 100, 1L };
        double[] doubleArray8 = new double[] { (short) 1, (-1L), 0.0f, (byte) 100 };
        double[] doubleArray11 = new double[] { (-1.0d), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray11, 1.0d);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3237");
        double[] doubleArray2 = new double[] { (-1.0d), ' ' };
        double[] doubleArray7 = new double[] { (short) 1, 10L, 1.0f, 0L };
        double[] doubleArray13 = new double[] { (-1.0f), (short) 10, (byte) 0, 0.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray13, (double) '4');
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3238");
        double[] doubleArray5 = new double[] { 1.0d, 0.0d, 0, 100.0d, (short) 100 };
        double[] doubleArray10 = new double[] { 0.0d, 1.0f, 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray5, (double) (short) 1);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3239");
        double[] doubleArray2 = new double[] { 10, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (-1L));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3240");
        double[] doubleArray4 = new double[] { (-1), (-1.0f), 100.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 10.0d);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3241");
        double[] doubleArray4 = new double[] { (short) 100, ' ', (byte) -1, (byte) -1 };
        double[] doubleArray10 = new double[] { 10L, 100.0d, 100L, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) 1);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3242");
        double[] doubleArray4 = new double[] { 100.0d, 'a', (-1.0f), 0.0d };
        double[] doubleArray10 = new double[] { 100L, (-1.0d), (-1), (-1.0f), (short) 100 };
        double[] doubleArray14 = new double[] { (byte) 0, 0.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray14, (double) 0.0f);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3243");
        double[] doubleArray5 = new double[] { (-1), 0.0f, 0.0f, (byte) 10, (short) -1 };
        double[] doubleArray7 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3244");
        double[] doubleArray1 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 100L);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3245");
        double[] doubleArray2 = new double[] { (byte) 1, 100 };
        double[] doubleArray7 = new double[] { 0L, 100, (-1.0f), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 1L);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3246");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray5 = new double[] { 10.0f, 100.0d, 0 };
        double[] doubleArray10 = new double[] { (byte) 10, (-1L), 10, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3247");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray4 = new double[] { 'a', 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray1, (double) '#');
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3248");
        double[] doubleArray3 = new double[] { '4', (-1L), (byte) -1 };
        double[] doubleArray6 = new double[] { (-1), (short) 100 };
        double[] doubleArray8 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray8, (double) 100);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3249");
        double[] doubleArray5 = new double[] { (byte) 1, 1.0d, 10L, (byte) 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 100);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3250");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) '4');
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3251");
        double[] doubleArray5 = new double[] { ' ', ' ', 1L, (byte) 10, 0 };
        double[] doubleArray12 = new double[] { '4', (short) 10, (byte) 0, 100, (byte) -1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3252");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray4 = new double[] { 0.0f, 10.0d };
        double[] doubleArray9 = new double[] { (byte) -1, 'a', (short) 1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray9, (double) 'a');
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3253");
        double[] doubleArray3 = new double[] { 0, 0, (short) 0 };
        double[] doubleArray10 = new double[] { 0, 10L, (short) -1, 0, (short) 100, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3254");
        double[] doubleArray5 = new double[] { 'a', 0, 1.0d, 10, (short) -1 };
        double[] doubleArray12 = new double[] { (byte) 0, 100, (-1L), 10, (short) -1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3255");
        double[] doubleArray6 = new double[] { (short) 100, 100L, 10.0d, 10, (byte) 0, (short) 10 };
        double[] doubleArray9 = new double[] { '4', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3256");
        double[] doubleArray4 = new double[] { 10.0d, (-1), (-1.0f), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (-1L));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3257");
        double[] doubleArray5 = new double[] { '4', (short) 10, 1.0d, 1.0f, 100.0f };
        double[] doubleArray9 = new double[] { 10.0f, 100, '#' };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3258");
        double[] doubleArray3 = new double[] { 1.0d, (short) 100, 0.0d };
        double[] doubleArray5 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, (double) (-1));
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3259");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { (byte) 1, (-1L), (-1L) };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3260");
        double[] doubleArray3 = new double[] { 1.0f, (byte) 10, (short) 10 };
        double[] doubleArray9 = new double[] { 1.0d, 10, (-1), (byte) 10, 0 };
        double[] doubleArray14 = new double[] { (short) 1, (byte) 100, 10.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray14, (double) 0L);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3261");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray7 = new double[] { 0.0f, 10.0d, (-1.0d), 10.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, 10.0d);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3262");
        double[] doubleArray3 = new double[] { 1.0f, 1.0f, (-1.0d) };
        double[] doubleArray9 = new double[] { 0.0f, (short) 0, (short) 100, (short) 0, (-1) };
        double[] doubleArray15 = new double[] { '4', ' ', 100L, 1.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray15, 100.0d);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3263");
        double[] doubleArray6 = new double[] { 100L, 10L, (byte) 0, 100, 0L, '#' };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { 1.0d, 1.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray11, (-1.0d));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3264");
        double[] doubleArray2 = new double[] { '4', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1L);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3265");
        double[] doubleArray2 = new double[] { 1.0f, 1L };
        double[] doubleArray8 = new double[] { '4', 100.0f, (byte) 0, (-1.0d), '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, 0.0d);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3266");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray4 = new double[] { (short) 100, 1L };
        double[] doubleArray8 = new double[] { (short) 0, 100L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, 0.0d);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3267");
        double[] doubleArray2 = new double[] { 1.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 0.0d);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3268");
        double[] doubleArray3 = new double[] { 'a', 100.0d, 1.0f };
        double[] doubleArray7 = new double[] { 10.0d, (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, 1.0d);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3269");
        double[] doubleArray6 = new double[] { '#', 1.0d, (byte) 100, 10.0f, (short) 100, (byte) 1 };
        double[] doubleArray8 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) (byte) 0);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3270");
        double[] doubleArray3 = new double[] { (short) 0, (byte) 0, (short) 10 };
        double[] doubleArray8 = new double[] { 'a', 10.0f, 0L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 1L);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3271");
        double[] doubleArray6 = new double[] { (byte) -1, 100, (short) 1, (-1), 'a', 1.0f };
        double[] doubleArray12 = new double[] { 'a', (byte) 100, 0.0d, (byte) -1, (-1.0d) };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) 1);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3272");
        double[] doubleArray2 = new double[] { (byte) 100, 10.0f };
        double[] doubleArray9 = new double[] { (short) 0, 1.0f, (byte) 1, (-1.0d), (byte) 0, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) '4');
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3273");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, 0.0d);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3274");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, (double) 0L);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3275");
        double[] doubleArray3 = new double[] { '4', 1.0d, 100.0f };
        double[] doubleArray5 = new double[] { (byte) 0 };
        double[] doubleArray12 = new double[] { (byte) 0, (-1.0d), 0.0d, ' ', ' ', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray12, (double) '#');
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3276");
        double[] doubleArray3 = new double[] { (-1.0d), '4', 10 };
        double[] doubleArray7 = new double[] { 10L, (-1.0d), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) '4');
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3277");
        double[] doubleArray3 = new double[] { (byte) 1, 0, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3278");
        double[] doubleArray4 = new double[] { 0.0f, '4', (-1.0d), (-1.0d) };
        double[] doubleArray6 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) ' ');
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3279");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { ' ', (byte) 0, (-1.0d) };
        double[] doubleArray8 = new double[] { 100, 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3280");
        double[] doubleArray2 = new double[] { (byte) 10, 1.0d };
        double[] doubleArray7 = new double[] { 100L, 10.0f, (-1.0f), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 1L);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3281");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray8 = new double[] { (byte) 1, (byte) 10, 100.0d, '#', 0.0d, 100 };
        double[] doubleArray10 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (double) (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3282");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray6 = new double[] { (byte) 1, (short) 0, '4', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) '#');
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3283");
        double[] doubleArray3 = new double[] { (short) 0, (byte) 0, ' ' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray5, 0.0d);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3284");
        double[] doubleArray4 = new double[] { 1.0f, 0.0d, 'a', ' ' };
        double[] doubleArray6 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3285");
        double[] doubleArray5 = new double[] { (short) 0, (byte) -1, 0.0f, (-1L), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3286");
        double[] doubleArray5 = new double[] { (short) 100, (short) -1, 10.0d, 10.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3287");
        double[] doubleArray5 = new double[] { 100.0d, 0, 0, (byte) 100, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '4');
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3288");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (short) 0);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3289");
        double[] doubleArray2 = new double[] { 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (-1.0d));
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3290");
        double[] doubleArray6 = new double[] { '#', 10, (byte) 100, (byte) 0, (byte) 0, 0.0f };
        double[] doubleArray13 = new double[] { (short) 10, 100.0f, ' ', (byte) 0, ' ', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3291");
        double[] doubleArray3 = new double[] { '#', 100L, 100L };
        double[] doubleArray6 = new double[] { 'a', 100 };
        double[] doubleArray9 = new double[] { (byte) 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3292");
        double[] doubleArray4 = new double[] { 'a', (byte) 100, 1L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3293");
        double[] doubleArray5 = new double[] { 0L, (byte) 0, '4', 10.0f, (byte) 10 };
        double[] doubleArray9 = new double[] { (byte) 0, (byte) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 1L);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3294");
        double[] doubleArray2 = new double[] { (-1), (-1) };
        double[] doubleArray6 = new double[] { (short) -1, (-1.0f), (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3295");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100, 0.0f, 1.0f, 100.0f, 10.0d, 1.0d };
        double[] doubleArray11 = new double[] { 1.0d, '#', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray11, (double) 'a');
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3296");
        double[] doubleArray2 = new double[] { 1.0f, 100 };
        double[] doubleArray9 = new double[] { (short) -1, 10, (short) 100, (byte) -1, ' ', 100 };
        double[] doubleArray12 = new double[] { '4', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3297");
        double[] doubleArray6 = new double[] { (short) 1, '4', 1.0f, (short) 1, 100, (byte) 0 };
        double[] doubleArray12 = new double[] { 10, 'a', 1, (-1.0d), (byte) -1 };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) (short) 1);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3298");
        double[] doubleArray5 = new double[] { 0.0d, 1.0f, 100.0d, (short) 0, '4' };
        double[] doubleArray11 = new double[] { (byte) 10, 10L, '4', 10.0d, 100.0d };
        double[] doubleArray15 = new double[] { 100.0f, (short) 0, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, 10.0d);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3299");
        double[] doubleArray3 = new double[] { (-1L), (short) 1, 10.0d };
        double[] doubleArray6 = new double[] { (short) 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, 0.0d);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3300");
        double[] doubleArray6 = new double[] { (short) 1, 1L, 100, 100L, (short) -1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 1L);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3301");
        double[] doubleArray6 = new double[] { (-1), 100L, '4', (byte) 10, 0, (short) 0 };
        double[] doubleArray9 = new double[] { 0.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3302");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 1.0f);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3303");
        double[] doubleArray1 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 10);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3304");
        double[] doubleArray5 = new double[] { 10.0d, 100, (short) 0, 'a', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 'a');
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3305");
        double[] doubleArray6 = new double[] { (-1L), (short) 0, (-1), (short) -1, 100.0d, (short) 10 };
        double[] doubleArray12 = new double[] { 10.0f, 1.0d, 100L, 0L, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3306");
        double[] doubleArray5 = new double[] { (byte) 100, 100L, 1.0d, 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 0L);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3307");
        double[] doubleArray5 = new double[] { 100.0d, 0.0f, 0.0f, 100L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0d);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3308");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray8 = new double[] { '4', 0.0d, (byte) 0, 1.0f, 0L, (byte) 1 };
        double[] doubleArray15 = new double[] { 1, (short) 1, (short) 100, 'a', 1.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, (double) 1);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3309");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { ' ' };
        double[] doubleArray9 = new double[] { 1L, (short) -1, 1L, (short) 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) 0L);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3310");
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0d), 10.0f, (byte) 0, 10.0f };
        double[] doubleArray7 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, 100.0d);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3311");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 'a', 0L, (-1) };
        double[] doubleArray7 = new double[] { 1.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray7, (double) (-1L));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3312");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray3 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) (byte) 10);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3313");
        double[] doubleArray6 = new double[] { (short) 0, 0.0f, 100, (-1.0d), 0.0f, 1 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { 'a', 0.0d, (short) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) (byte) 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3314");
        double[] doubleArray5 = new double[] { (short) 10, 100L, '#', (byte) 10, 10 };
        double[] doubleArray7 = new double[] { 1 };
        double[] doubleArray9 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3315");
        double[] doubleArray5 = new double[] { (byte) 10, (byte) 10, (byte) 0, 1.0d, (short) 100 };
        double[] doubleArray11 = new double[] { 100L, (byte) 0, (byte) 10, 0L, (short) 100 };
        double[] doubleArray13 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray13, 0.0d);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3316");
        double[] doubleArray3 = new double[] { (-1.0d), 1.0d, 0.0f };
        double[] doubleArray9 = new double[] { 100.0f, 10.0d, (byte) -1, 10L, (short) -1 };
        double[] doubleArray12 = new double[] { (byte) 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray12, (double) (short) -1);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3317");
        double[] doubleArray4 = new double[] { 10L, 10, 0L, 10.0f };
        double[] doubleArray10 = new double[] { 10L, (byte) 0, (short) -1, '4', 1L };
        double[] doubleArray13 = new double[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray13, (double) (-1L));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3318");
        double[] doubleArray2 = new double[] { (byte) 1, (-1.0d) };
        double[] doubleArray9 = new double[] { ' ', ' ', (-1L), ' ', (short) 100, 1.0d };
        double[] doubleArray14 = new double[] { 'a', (short) -1, 0.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray14, (double) (-1L));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3319");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1.0d) };
        double[] doubleArray3 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray3, (double) 0L);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3320");
        double[] doubleArray6 = new double[] { (-1L), (-1), 'a', '4', 1.0f, (-1) };
        double[] doubleArray11 = new double[] { 10L, 0, (-1), (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3321");
        double[] doubleArray4 = new double[] { 1, (byte) 0, (-1.0d), 1L };
        double[] doubleArray6 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) '#');
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3322");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (-1.0d));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3323");
        double[] doubleArray3 = new double[] { 100, 100, 10.0f };
        double[] doubleArray7 = new double[] { 100.0d, (byte) 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) 0L);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3324");
        double[] doubleArray5 = new double[] { 10.0d, 1, 100, 1.0f, 100.0f };
        double[] doubleArray10 = new double[] { '#', 100, (-1), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, 100.0d);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3325");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray4 = new double[] { (-1), '4' };
        double[] doubleArray9 = new double[] { 1L, (short) 10, 1.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3326");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100L, 10.0d, 0.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3327");
        double[] doubleArray3 = new double[] { 100.0d, (short) 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3328");
        double[] doubleArray6 = new double[] { (byte) 100, 10L, (byte) 10, (short) 1, '4', (-1) };
        double[] doubleArray13 = new double[] { (byte) -1, (byte) 1, (short) 100, (short) 0, 10L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3329");
        double[] doubleArray2 = new double[] { 1.0f, (-1) };
        double[] doubleArray4 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 1L);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3330");
        double[] doubleArray3 = new double[] { 10.0f, 100, 0L };
        double[] doubleArray10 = new double[] { (short) 0, 100, ' ', (-1), (short) 10, '4' };
        double[] doubleArray12 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray12, (double) 'a');
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3331");
        double[] doubleArray4 = new double[] { (byte) 0, 0.0f, '#', 10.0f };
        double[] doubleArray10 = new double[] { 100.0f, 10.0f, 0, '4', (byte) 1 };
        double[] doubleArray12 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray12, (double) (short) 10);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3332");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1L), 0, 0, 'a', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) '#');
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3333");
        double[] doubleArray4 = new double[] { 10L, (short) 0, (-1.0d), (short) 0 };
        double[] doubleArray9 = new double[] { (-1.0f), (short) 10, (-1), 0.0d };
        double[] doubleArray13 = new double[] { (short) 0, 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray13, (double) 0L);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3334");
        double[] doubleArray3 = new double[] { (short) 100, (byte) 1, 10 };
        double[] doubleArray9 = new double[] { 100.0f, ' ', 1L, 1.0f, 10 };
        double[] doubleArray16 = new double[] { (byte) -1, 10.0f, (byte) 0, (-1.0f), '4', (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray16, (double) '#');
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3335");
        double[] doubleArray3 = new double[] { 1, (short) -1, (short) 10 };
        double[] doubleArray10 = new double[] { 10.0f, (short) 1, (-1L), 10L, 1.0d, 100L };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray11, (double) ' ');
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3336");
        double[] doubleArray2 = new double[] { 10.0d, 100.0f };
        double[] doubleArray5 = new double[] { (byte) 10, (-1) };
        double[] doubleArray12 = new double[] { 0L, (byte) -1, 100, 100, 100.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray12, (double) (-1L));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3337");
        double[] doubleArray4 = new double[] { (-1), '4', 0, '4' };
        double[] doubleArray6 = new double[] { 100.0d };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) 0L);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3338");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1.0d) };
        double[] doubleArray6 = new double[] { '4', ' ', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3339");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 1, (byte) 0 };
        double[] doubleArray5 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) 1);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3340");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray8 = new double[] { (short) 10, 0, (byte) 0, (byte) 0, 1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) 100.0f);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3341");
        double[] doubleArray4 = new double[] { (-1.0f), '#', 100.0f, (short) 10 };
        double[] doubleArray11 = new double[] { (-1), 10.0d, ' ', 1.0f, 10L, 0.0f };
        double[] doubleArray13 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3342");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray6 = new double[] { 0L, 0.0d, 1L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) (short) -1);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3343");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray7 = new double[] { 0L, (byte) 10, 0.0d, '#', 100.0f };
        double[] doubleArray8 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray8, (double) 100L);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3344");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0, 1.0f, (byte) 100, (byte) 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) 0L);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3345");
        double[] doubleArray3 = new double[] { 0L, 1, 100 };
        double[] doubleArray5 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, (double) ' ');
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3346");
        double[] doubleArray6 = new double[] { '4', 100, (-1.0d), (byte) 100, (byte) 10, 0L };
        double[] doubleArray9 = new double[] { 0.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3347");
        double[] doubleArray5 = new double[] { 0, 0.0d, (-1.0f), (short) 1, 10.0f };
        double[] doubleArray7 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, 0.0d);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3348");
        double[] doubleArray2 = new double[] { 0L, 10 };
        double[] doubleArray9 = new double[] { (byte) 10, 1, 10.0f, 1.0f, 1L, (byte) 10 };
        double[] doubleArray16 = new double[] { (-1L), 10L, 10.0f, 1, (short) 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (double) 1L);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3349");
        double[] doubleArray4 = new double[] { (short) 100, 1, 1L, 10.0f };
        double[] doubleArray10 = new double[] { '4', 1L, (short) 1, (short) 1, 1.0d };
        double[] doubleArray11 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray11, (double) 'a');
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3350");
        double[] doubleArray2 = new double[] { 0.0f, (byte) -1 };
        double[] doubleArray5 = new double[] { 10L, 0.0d };
        double[] doubleArray12 = new double[] { 10.0f, 100.0d, 1L, 100, 100, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray12, (double) (byte) 10);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3351");
        double[] doubleArray3 = new double[] { (byte) 10, (short) -1, 100 };
        double[] doubleArray6 = new double[] { (-1.0d), 10L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray7, (double) 0);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3352");
        double[] doubleArray5 = new double[] { (-1L), (byte) -1, 'a', 10.0d, 100L };
        double[] doubleArray7 = new double[] { (-1L) };
        double[] doubleArray14 = new double[] { (short) 0, 'a', 0, 10.0f, (short) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray14, (double) 0L);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3353");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 100.0f };
        double[] doubleArray9 = new double[] { (byte) 10, (byte) 10, 100.0f, (short) 0, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3354");
        double[] doubleArray6 = new double[] { (short) -1, 0, (short) 1, (-1), ' ', 'a' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3355");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray5, 0.0d);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3356");
        double[] doubleArray5 = new double[] { 10L, 100.0d, 10L, 0L, 0.0d };
        double[] doubleArray7 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) ' ');
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3357");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, 10.0f };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, (double) (-1));
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3358");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray8 = new double[] { 1.0d, 1.0d, (-1), 1L, 0L, 1.0f };
        double[] doubleArray10 = new double[] { (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3359");
        double[] doubleArray3 = new double[] { 0.0d, (short) 0, 1L };
        double[] doubleArray7 = new double[] { (-1L), 10.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3360");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray6 = new double[] { (byte) 0, (byte) 100, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, 100.0d);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3361");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 0L, (-1.0d), 0.0f, (short) 10, 10.0d };
        double[] doubleArray14 = new double[] { 0L, 0, 0.0d, (short) 10, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray14, (double) (short) 100);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3362");
        double[] doubleArray6 = new double[] { 1, 1.0d, (byte) 100, (byte) 0, 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3363");
        double[] doubleArray5 = new double[] { '4', 1, (byte) 10, (-1.0d), 10 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray9 = new double[] { 100.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray9, (double) 1.0f);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3364");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { 1L, (byte) -1, (-1L), (short) 0 };
        double[] doubleArray8 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray8, (double) (-1));
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3365");
        double[] doubleArray3 = new double[] { 100, 100.0d, '#' };
        double[] doubleArray5 = new double[] { (short) 10 };
        double[] doubleArray12 = new double[] { 10L, ' ', (-1L), 100.0d, 10, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray12, 0.0d);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3366");
        double[] doubleArray2 = new double[] { (byte) 0, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 100);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3367");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '4', 1.0f, (byte) -1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, 0.0d);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3368");
        double[] doubleArray6 = new double[] { 10.0f, '4', 0, 1L, (short) -1, 0 };
        double[] doubleArray12 = new double[] { 10.0d, '4', 1.0f, 100.0d, (-1.0d) };
        double[] doubleArray18 = new double[] { '#', ' ', (short) 100, '#', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray18, (double) (-1.0f));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3369");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, 0.0d);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3370");
        double[] doubleArray4 = new double[] { 100L, 10, (short) 1, (byte) 100 };
        double[] doubleArray10 = new double[] { ' ', '4', 10, (short) 100, ' ' };
        double[] doubleArray16 = new double[] { (short) 10, 1, 10.0d, 0L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) (-1.0f));
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3371");
        double[] doubleArray5 = new double[] { 0, 0.0f, (-1), (short) 10, (short) 10 };
        double[] doubleArray7 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) 0);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3372");
        double[] doubleArray6 = new double[] { 1, 100.0f, 1.0d, (-1.0d), 1, (-1.0d) };
        double[] doubleArray10 = new double[] { 1.0f, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3373");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray5 = new double[] { 100L, (short) -1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3374");
        double[] doubleArray2 = new double[] { (short) 10, (short) 100 };
        double[] doubleArray9 = new double[] { (byte) -1, 1.0d, 10L, 1, 'a', '#' };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray10, (double) '4');
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3375");
        double[] doubleArray4 = new double[] { (byte) -1, 0L, (byte) 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3376");
        double[] doubleArray6 = new double[] { (byte) 10, 0.0d, (short) 1, 10, (-1.0f), 10.0f };
        double[] doubleArray13 = new double[] { 10.0f, 'a', (-1), 0, 0L, (-1) };
        double[] doubleArray14 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray14, (double) (byte) 1);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3377");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray4 = new double[] { (short) 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3378");
        double[] doubleArray6 = new double[] { (-1L), 10, ' ', (-1L), 0.0d, 0 };
        double[] doubleArray9 = new double[] { 0, 0L };
        double[] doubleArray12 = new double[] { (byte) 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3379");
        double[] doubleArray2 = new double[] { 0, 1.0f };
        double[] doubleArray6 = new double[] { 1.0f, ' ', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, (double) ' ');
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3380");
        double[] doubleArray2 = new double[] { 100L, ' ' };
        double[] doubleArray9 = new double[] { 100.0f, 100, 0L, 1, 1L, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3381");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (short) 1, 0L, (-1.0f), 0L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3382");
        double[] doubleArray3 = new double[] { 1.0f, ' ', (short) 100 };
        double[] doubleArray10 = new double[] { (byte) 100, (byte) 100, 0.0d, 0L, 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3383");
        double[] doubleArray2 = new double[] { 1.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3384");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 10, 100, 10L, 10.0f, 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) 1);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3385");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] { (short) 0, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray1, (double) (-1.0f));
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3386");
        double[] doubleArray4 = new double[] { (short) 1, 100L, 100.0d, 1L };
        double[] doubleArray8 = new double[] { 0.0f, 100L, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) ' ');
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3387");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, (-1.0d), 100, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) 10L);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3388");
        double[] doubleArray4 = new double[] { (short) 10, (short) -1, 10, 1L };
        double[] doubleArray10 = new double[] { 0.0f, 100.0f, 1.0d, 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 0.0f);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3389");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10, 10L, (short) -1 };
        double[] doubleArray8 = new double[] { '#', 1.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, 1.0d);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3390");
        double[] doubleArray4 = new double[] { (short) 100, 100.0f, (-1), 100.0f };
        double[] doubleArray6 = new double[] { '4' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) 0);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3391");
        double[] doubleArray5 = new double[] { (short) 100, '#', 10.0f, 10, 100L };
        double[] doubleArray12 = new double[] { (short) -1, 10L, 1.0f, (short) 10, (byte) -1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3392");
        double[] doubleArray6 = new double[] { 0, 1, 'a', (short) 10, '#', 100L };
        double[] doubleArray11 = new double[] { (-1L), '#', 10, (-1) };
        double[] doubleArray14 = new double[] { (-1.0f), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray14, 0.0d);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3393");
        double[] doubleArray6 = new double[] { ' ', 100, (short) 1, 'a', 1, 1.0f };
        double[] doubleArray11 = new double[] { 100.0f, (short) 100, '4', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) (byte) 10);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3394");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, (double) (byte) 0);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3395");
        double[] doubleArray6 = new double[] { 10.0d, 100L, 10, 0, '4', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3396");
        double[] doubleArray3 = new double[] { (-1.0d), (-1L), (short) 100 };
        double[] doubleArray10 = new double[] { (-1L), 100, (byte) 1, '#', 10.0f, 0 };
        double[] doubleArray12 = new double[] { 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray12, (double) 100);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3397");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray5 = new double[] { (byte) 1, 1.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 1);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3398");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray7 = new double[] { (byte) 1, 0L, (byte) 10, 'a', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, 0.0d);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3399");
        double[] doubleArray2 = new double[] { (short) 100, (short) 1 };
        double[] doubleArray8 = new double[] { 10L, 0L, 'a', 10, (short) 100 };
        double[] doubleArray11 = new double[] { (-1.0f), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray11, (double) (short) 100);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3400");
        double[] doubleArray5 = new double[] { 0.0d, 1L, '4', ' ', 100.0f };
        double[] doubleArray9 = new double[] { (-1), 0L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, 10.0d);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3401");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray7 = new double[] { 0L, 1, 1, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3402");
        double[] doubleArray2 = new double[] { '#', 100 };
        double[] doubleArray5 = new double[] { (byte) 0, (byte) 1 };
        double[] doubleArray7 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3403");
        double[] doubleArray2 = new double[] { 0L, (-1) };
        double[] doubleArray8 = new double[] { ' ', (-1.0f), 0.0d, 1.0d, 0.0d };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, (double) 10L);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3404");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray4 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray4, (double) (byte) 1);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3405");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, (byte) 10 };
        double[] doubleArray7 = new double[] { 0.0d, (byte) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3406");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray3 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) (-1L));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3407");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 1, 1.0f, 10.0d, (byte) 10, (-1), (short) 0 };
        double[] doubleArray14 = new double[] { (short) 0, '#', (-1L), (-1L), 10.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray14, (double) 100L);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3408");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray6 = new double[] { ' ', 100.0f, ' ', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3409");
        double[] doubleArray4 = new double[] { (byte) 0, (byte) 1, (short) 10, 'a' };
        double[] doubleArray10 = new double[] { (byte) 100, (short) -1, (short) 10, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, 10.0d);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3410");
        double[] doubleArray5 = new double[] { (byte) -1, 'a', (-1.0d), 100.0d, 100L };
        double[] doubleArray9 = new double[] { (-1), '4', (-1) };
        double[] doubleArray13 = new double[] { (byte) -1, 1.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3411");
        double[] doubleArray2 = new double[] { 100, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 10);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3412");
        double[] doubleArray4 = new double[] { (byte) -1, 1L, (short) 100, 100.0f };
        double[] doubleArray8 = new double[] { '#', '#', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) (-1));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3413");
        double[] doubleArray5 = new double[] { '4', 10.0d, 10, (-1.0d), 'a' };
        double[] doubleArray9 = new double[] { 100.0f, 1.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, 0.0d);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3414");
        double[] doubleArray5 = new double[] { 1.0d, (byte) 10, (-1), '4', (byte) 0 };
        double[] doubleArray8 = new double[] { ' ', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) 0L);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3415");
        double[] doubleArray2 = new double[] { (byte) -1, 0L };
        double[] doubleArray9 = new double[] { (byte) 10, 10L, (short) 100, 0.0d, 10, '#' };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray10, 0.0d);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3416");
        double[] doubleArray2 = new double[] { (byte) 10, 100L };
        double[] doubleArray8 = new double[] { (short) 0, 10.0d, 'a', ' ', 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) (short) 100);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3417");
        double[] doubleArray6 = new double[] { 1L, (byte) 100, 100.0d, (byte) 100, 10, (-1.0d) };
        double[] doubleArray12 = new double[] { 100.0d, 100, '#', 10L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) 0.0f);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3418");
        double[] doubleArray4 = new double[] { (short) 100, (-1), (-1.0d), 10 };
        double[] doubleArray10 = new double[] { 0.0d, (byte) -1, (-1.0d), 0, (byte) 1 };
        double[] doubleArray16 = new double[] { (short) -1, 100L, 100.0d, 1.0d, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) (byte) 10);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3419");
        double[] doubleArray3 = new double[] { 100, 0.0f, (byte) 0 };
        double[] doubleArray6 = new double[] { (-1), 10.0d };
        double[] doubleArray8 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray8, 0.0d);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3420");
        double[] doubleArray6 = new double[] { (byte) 1, 1.0f, (short) 10, 1.0f, 1.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3421");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 1L, (short) 0, 100L, (byte) 100, 1.0f, (byte) 1 };
        double[] doubleArray12 = new double[] { 100L, 10.0f, 10.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray12, (double) (-1));
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3422");
        double[] doubleArray2 = new double[] { '#', 1.0f };
        double[] doubleArray7 = new double[] { (short) -1, (-1.0d), (byte) -1, 1L };
        double[] doubleArray11 = new double[] { '4', (byte) -1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray11, (double) (byte) 10);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3423");
        double[] doubleArray3 = new double[] { '#', 0.0f, (-1.0f) };
        double[] doubleArray9 = new double[] { (short) 10, (-1L), '#', (byte) 100, ' ' };
        double[] doubleArray13 = new double[] { 100, (byte) -1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) 1);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3424");
        double[] doubleArray4 = new double[] { 0, (byte) 0, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3425");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 10, 100L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3426");
        double[] doubleArray6 = new double[] { (-1.0d), 10, 100.0f, 0L, '4', 10.0f };
        double[] doubleArray11 = new double[] { 0.0d, (short) 100, 1L, ' ' };
        double[] doubleArray12 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray12, 0.0d);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3427");
        double[] doubleArray6 = new double[] { 1, (byte) 10, (byte) 1, 10.0d, (short) 1, (short) 1 };
        double[] doubleArray8 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray8, (double) 10L);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3428");
        double[] doubleArray5 = new double[] { '4', 10.0d, (-1.0d), (short) 0, (byte) 100 };
        double[] doubleArray8 = new double[] { 0, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3429");
        double[] doubleArray3 = new double[] { (short) 0, 'a', 100 };
        double[] doubleArray7 = new double[] { (short) 100, '#', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 0L);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3430");
        double[] doubleArray4 = new double[] { 100, 100, '4', 0 };
        double[] doubleArray9 = new double[] { 0.0f, 0.0d, (byte) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 0L);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3431");
        double[] doubleArray5 = new double[] { (-1L), 1.0f, 100L, 10.0d, 1.0d };
        double[] doubleArray8 = new double[] { 10.0f, (short) -1 };
        double[] doubleArray10 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, (double) (short) -1);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3432");
        double[] doubleArray2 = new double[] { '4', (short) 100 };
        double[] doubleArray7 = new double[] { (short) 10, 1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) 0);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3433");
        double[] doubleArray4 = new double[] { 'a', (short) 0, (byte) 100, (-1.0d) };
        double[] doubleArray8 = new double[] { (byte) -1, 0L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray8, (double) 0L);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3434");
        double[] doubleArray4 = new double[] { (byte) 1, 100.0f, (short) -1, 0 };
        double[] doubleArray8 = new double[] { (byte) 10, '4', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3435");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray5, (double) 1L);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3436");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { (byte) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3437");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray6 = new double[] { 1, '#', 1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, 100.0d);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3438");
        double[] doubleArray4 = new double[] { '4', 0, 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3439");
        double[] doubleArray4 = new double[] { '#', (byte) 100, (-1), (-1) };
        double[] doubleArray6 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3440");
        double[] doubleArray2 = new double[] { 10.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 10L);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3441");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) 10, 0.0d, '#', (-1), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray8, (double) 1L);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3442");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0, (short) 10, 100.0f };
        double[] doubleArray8 = new double[] { 10.0d, 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, 0.0d);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3443");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 0.0d, 100.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3444");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray6 = new double[] { 'a', 100.0f, 1L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) 100L);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3445");
        double[] doubleArray2 = new double[] { (short) 1, 10.0f };
        double[] doubleArray4 = new double[] { 0.0f };
        double[] doubleArray11 = new double[] { (short) 100, (short) -1, (-1.0d), (-1.0d), 1.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, (-1.0d));
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3446");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) -1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) 100.0f);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3447");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray4, (double) (short) 100);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3448");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, (double) 1.0f);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3449");
        double[] doubleArray6 = new double[] { (-1L), 10.0f, 0.0d, 1.0f, (-1.0f), 10 };
        double[] doubleArray11 = new double[] { 1, 1L, (-1.0f), (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) '#');
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3450");
        double[] doubleArray3 = new double[] { (byte) 0, 100.0d, (short) 100 };
        double[] doubleArray8 = new double[] { (byte) 10, '4', (short) 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 0.0d);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3451");
        double[] doubleArray6 = new double[] { ' ', 10, 100.0d, 1.0d, 0.0d, 10.0d };
        double[] doubleArray11 = new double[] { 10.0f, 1.0d, 10.0f, (byte) 1 };
        double[] doubleArray18 = new double[] { 100.0f, 1L, (byte) 100, (-1L), 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray18, 0.0d);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3452");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray1, (double) 100.0f);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3453");
        double[] doubleArray6 = new double[] { (byte) 0, (-1.0f), (short) 1, 0, 0L, 1 };
        double[] doubleArray11 = new double[] { ' ', (byte) 1, ' ', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (byte) -1);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3454");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray6 = new double[] { 100, 1.0f, 'a', (byte) 1 };
        double[] doubleArray8 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray8, (double) 100);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3455");
        double[] doubleArray3 = new double[] { '#', 100.0d, 10.0f };
        double[] doubleArray10 = new double[] { 100L, '#', 10.0d, '4', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) 0L);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3456");
        double[] doubleArray6 = new double[] { 100, 'a', 100, 10.0f, (byte) -1, (byte) 1 };
        double[] doubleArray9 = new double[] { 1.0d, 100 };
        double[] doubleArray16 = new double[] { (byte) -1, 10.0d, 100, 1L, (short) 1, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray16, 0.0d);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3457");
        double[] doubleArray4 = new double[] { (byte) -1, (-1L), 10.0f, (short) -1 };
        double[] doubleArray8 = new double[] { 100, 10L, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) 1.0f);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3458");
        double[] doubleArray2 = new double[] { (-1.0f), 1.0f };
        double[] doubleArray6 = new double[] { 0.0d, 1.0f, (byte) 1 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) 10L);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3459");
        double[] doubleArray4 = new double[] { (short) 0, 100.0f, '#', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 100L);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3460");
        double[] doubleArray5 = new double[] { 100L, 10, (byte) 0, 0.0f, 1 };
        double[] doubleArray11 = new double[] { 100, (short) -1, 1.0f, 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray11, (double) '4');
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3461");
        double[] doubleArray4 = new double[] { 'a', '#', (short) 100, (byte) 1 };
        double[] doubleArray7 = new double[] { (short) 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, 0.0d);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3462");
        double[] doubleArray3 = new double[] { (byte) -1, (-1L), (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 0.0f);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3463");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 10, 0.0f, (short) 10 };
        double[] doubleArray7 = new double[] { (short) 0, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 'a');
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3464");
        double[] doubleArray4 = new double[] { (byte) -1, 10.0d, (-1), 100L };
        double[] doubleArray11 = new double[] { (short) -1, (-1L), (short) 10, 100L, (-1.0f), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) 0.0f);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3465");
        double[] doubleArray3 = new double[] { 'a', (short) 0, 1.0d };
        double[] doubleArray7 = new double[] { 0.0f, 'a', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (-1.0d));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3466");
        double[] doubleArray2 = new double[] { 0.0d, 10 };
        double[] doubleArray7 = new double[] { (short) 10, (-1L), (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3467");
        double[] doubleArray3 = new double[] { 100, (byte) 1, (byte) -1 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3468");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10, 100, (-1.0f) };
        double[] doubleArray9 = new double[] { (byte) 100, (-1L), (byte) 0, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3469");
        double[] doubleArray4 = new double[] { '#', 100.0d, 100, 1.0f };
        double[] doubleArray8 = new double[] { 1, 'a', 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 0);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3470");
        double[] doubleArray1 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 10);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3471");
        double[] doubleArray3 = new double[] { 10, (-1.0f), ' ' };
        double[] doubleArray8 = new double[] { 0.0f, 10.0f, ' ', 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3472");
        double[] doubleArray6 = new double[] { (byte) 1, (short) 100, (short) 10, 1.0d, 10L, (short) 100 };
        double[] doubleArray12 = new double[] { (short) -1, 10, (short) 1, (short) 10, (short) 10 };
        double[] doubleArray17 = new double[] { 10L, (short) 1, 0, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray17, (double) (byte) 1);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3473");
        double[] doubleArray3 = new double[] { (short) 0, 10.0d, 10.0f };
        double[] doubleArray8 = new double[] { 0.0d, 10.0d, 100.0f, (byte) 100 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) (-1.0f));
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3474");
        double[] doubleArray2 = new double[] { 1.0d, 10.0f };
        double[] doubleArray5 = new double[] { 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3475");
        double[] doubleArray2 = new double[] { 10L, '4' };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 100, (byte) 1, 10.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, 0.0d);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3476");
        double[] doubleArray3 = new double[] { 1L, 1.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3477");
        double[] doubleArray4 = new double[] { (-1.0d), (byte) 0, 10L, 10 };
        double[] doubleArray10 = new double[] { 100.0d, 1.0d, (byte) 10, 10.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3478");
        double[] doubleArray6 = new double[] { 1, 1, (-1), 100.0f, 10L, 0.0d };
        double[] doubleArray9 = new double[] { 10.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3479");
        double[] doubleArray4 = new double[] { '#', (byte) 1, (-1L), (byte) 0 };
        double[] doubleArray11 = new double[] { (byte) 100, '#', 100.0f, 100.0f, 100.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) (-1.0f));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3480");
        double[] doubleArray6 = new double[] { (short) 1, (-1.0f), (-1L), (byte) 100, 1.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3481");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 'a', (-1.0d), 10L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3482");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { ' ', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) 0L);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3483");
        double[] doubleArray6 = new double[] { (byte) -1, (short) -1, 0.0f, (-1.0d), (short) 1, (-1L) };
        double[] doubleArray9 = new double[] { 0.0d, 10 };
        double[] doubleArray10 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3484");
        double[] doubleArray3 = new double[] { 0.0d, 0, (byte) 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { 100L, 100L, (-1L), ' ', (short) 0, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray11, (double) '4');
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3485");
        double[] doubleArray1 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) 1);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3486");
        double[] doubleArray5 = new double[] { 1, (byte) -1, (-1L), 100, (short) -1 };
        double[] doubleArray8 = new double[] { 100, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3487");
        double[] doubleArray4 = new double[] { (byte) 100, (byte) -1, 100, 100L };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { (-1.0d), 100L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, (double) '#');
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3488");
        double[] doubleArray4 = new double[] { 100.0d, (-1), 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '4');
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3489");
        double[] doubleArray4 = new double[] { 0.0f, (byte) 1, (-1.0f), 1L };
        double[] doubleArray8 = new double[] { (short) 1, (short) 100, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, 0.0d);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3490");
        double[] doubleArray5 = new double[] { (byte) 100, (byte) 10, (short) 100, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0d);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3491");
        double[] doubleArray5 = new double[] { (byte) 10, 100.0f, 'a', (-1.0f), 1 };
        double[] doubleArray7 = new double[] { (byte) 10 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3492");
        double[] doubleArray5 = new double[] { 1L, '#', 1.0f, (short) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3493");
        double[] doubleArray3 = new double[] { 0L, 100.0d, 1 };
        double[] doubleArray9 = new double[] { (byte) -1, 0.0f, (short) 10, (short) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) ' ');
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3494");
        double[] doubleArray5 = new double[] { 100L, (-1L), 100L, (short) 100, ' ' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { '#', (-1.0d), (-1.0f), 'a', 100L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray13, (double) (short) 0);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3495");
        double[] doubleArray5 = new double[] { 0L, (short) 0, (byte) 1, 0.0d, (short) 0 };
        double[] doubleArray9 = new double[] { (short) 10, '4', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 10);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3496");
        double[] doubleArray2 = new double[] { (byte) 0, 10L };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { 100.0f, 'a', 100.0d, '4', (short) 1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3497");
        double[] doubleArray4 = new double[] { 0.0d, '#', 0.0f, (short) 1 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { '4', 100.0d, (short) 10, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray10, (double) 10);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3498");
        double[] doubleArray6 = new double[] { 0.0d, (short) 0, (short) 0, (short) 100, (-1L), (-1.0d) };
        double[] doubleArray12 = new double[] { 10L, 10.0d, 1, 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3499");
        double[] doubleArray5 = new double[] { (-1.0d), 0.0d, 'a', (-1L), (short) 0 };
        double[] doubleArray9 = new double[] { (short) 0, 1.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) 0.0f);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test3500");
        double[] doubleArray4 = new double[] { 100.0d, (-1), 0, 10 };
        double[] doubleArray7 = new double[] { 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (-1));
    }
}
