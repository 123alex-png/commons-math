package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4001");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray7 = new double[] { (short) 1, 1.0d, (byte) 100, (short) 0, (byte) 10 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray8, (double) 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4002");
        double[] doubleArray2 = new double[] { 10.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '#');
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4003");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { (short) 1, (short) 0, ' ', (-1.0f) };
        double[] doubleArray12 = new double[] { 0.0d, (byte) -1, (-1.0f), (short) 1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, 0.0d);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4004");
        double[] doubleArray6 = new double[] { (short) 100, (short) 100, 0, 100.0d, (short) 0, 10L };
        double[] doubleArray13 = new double[] { 100.0f, 1.0f, (-1.0d), (byte) -1, 1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) '#');
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4005");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray3 = new double[] { 0.0f };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray4, (double) ' ');
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4006");
        double[] doubleArray4 = new double[] { 10.0f, (short) 10, (short) 10, (byte) 1 };
        double[] doubleArray10 = new double[] { 0.0f, (short) 1, 1, (byte) -1, (-1.0d) };
        double[] doubleArray13 = new double[] { (-1), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray13, (double) 1L);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4007");
        double[] doubleArray6 = new double[] { (byte) 10, 10L, '4', 10L, (-1.0f), 1L };
        double[] doubleArray11 = new double[] { 100, (short) 10, (byte) 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4008");
        double[] doubleArray2 = new double[] { 1, 10.0f };
        double[] doubleArray9 = new double[] { 10.0f, 100.0d, (short) -1, 10.0d, (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4009");
        double[] doubleArray5 = new double[] { (byte) 1, 10, (byte) 0, 10L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4010");
        double[] doubleArray6 = new double[] { 100L, 0L, 100L, (-1.0d), 'a', (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (-1L));
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4011");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray3 = new double[] { 100 };
        double[] doubleArray9 = new double[] { 'a', (byte) 0, (byte) 100, 1.0d, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) (-1L));
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4012");
        double[] doubleArray6 = new double[] { '4', (byte) 0, (-1.0d), (short) -1, (short) 1, 100 };
        double[] doubleArray13 = new double[] { 1.0d, (short) 100, 10.0f, (short) -1, '4', 0L };
        double[] doubleArray15 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray15, 1.0d);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4013");
        double[] doubleArray3 = new double[] { 100.0f, (-1.0f), ' ' };
        double[] doubleArray8 = new double[] { 'a', 'a', 1L, (-1.0f) };
        double[] doubleArray13 = new double[] { 10.0f, (short) 10, 1.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray13, 10.0d);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4014");
        double[] doubleArray4 = new double[] { 0.0f, (short) 10, (short) 100, (-1.0d) };
        double[] doubleArray10 = new double[] { '4', 0.0f, (-1.0f), (-1L), (short) -1 };
        double[] doubleArray15 = new double[] { '4', 10.0d, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (-1.0d));
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4015");
        double[] doubleArray4 = new double[] { 10.0f, 100L, (short) 10, '#' };
        double[] doubleArray8 = new double[] { 100, 10, 0L };
        double[] doubleArray10 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, 1.0d);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4016");
        double[] doubleArray2 = new double[] { 1, 100.0f };
        double[] doubleArray5 = new double[] { 10.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4017");
        double[] doubleArray4 = new double[] { (short) -1, 10L, (short) 0, 1.0f };
        double[] doubleArray10 = new double[] { 10, 10L, (byte) 0, (short) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4018");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray6 = new double[] { 1, (-1), (byte) 100, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4019");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray4 = new double[] { '#', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4020");
        double[] doubleArray4 = new double[] { (byte) 100, '4', 100.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4021");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 100, (byte) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, 1.0d);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4022");
        double[] doubleArray4 = new double[] { (-1.0d), 100, 0, 0.0f };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, 0.0d);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4023");
        double[] doubleArray5 = new double[] { (short) 100, (byte) 0, 'a', (-1), (short) 10 };
        double[] doubleArray11 = new double[] { 10, (short) 100, (byte) 100, 10, (short) 100 };
        double[] doubleArray17 = new double[] { 'a', 10L, 1.0f, 100L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray17, (-1.0d));
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4024");
        double[] doubleArray3 = new double[] { (short) 0, 10, (byte) 10 };
        double[] doubleArray8 = new double[] { '#', 0.0f, 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) 100L);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4025");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray7 = new double[] { (-1), 0.0d, 1, 10.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4026");
        double[] doubleArray3 = new double[] { 0L, (byte) 0, 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0d), (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, (double) 10L);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4027");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray4 = new double[] { 10L, '#' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4028");
        double[] doubleArray6 = new double[] { 0.0d, 100.0f, (short) 0, 0L, 100.0f, 100.0d };
        double[] doubleArray13 = new double[] { 0.0f, (-1), (short) 10, (short) 1, 1L, 1 };
        double[] doubleArray16 = new double[] { (byte) 1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray16, (double) (byte) 10);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4029");
        double[] doubleArray5 = new double[] { (-1.0f), (byte) 1, (-1), (-1.0f), (byte) -1 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) ' ');
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4030");
        double[] doubleArray2 = new double[] { (byte) 1, (byte) -1 };
        double[] doubleArray6 = new double[] { (short) 1, 100.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 0L);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4031");
        double[] doubleArray4 = new double[] { 0, 100, (-1.0d), (-1.0f) };
        double[] doubleArray7 = new double[] { (-1.0d), (byte) 100 };
        double[] doubleArray14 = new double[] { 0.0f, (byte) 10, 'a', 1L, (byte) 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray14, (double) (short) -1);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4032");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) -1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) 100.0f);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4033");
        double[] doubleArray2 = new double[] { 100.0f, 10L };
        double[] doubleArray5 = new double[] { '#', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray2, (double) (byte) 10);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4034");
        double[] doubleArray4 = new double[] { (byte) 100, 100.0d, (-1.0f), 1.0f };
        double[] doubleArray9 = new double[] { 'a', (-1L), (byte) 10, 0L };
        double[] doubleArray13 = new double[] { (-1L), (short) 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray13, (double) 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4035");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, (short) -1, 0.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, (double) 100.0f);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4036");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { ' ', (-1.0d), (-1), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, (double) (byte) 10);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4037");
        double[] doubleArray3 = new double[] { '4', 10, (-1.0d) };
        double[] doubleArray9 = new double[] { 10.0f, (short) 100, (short) 0, 1.0f, 1 };
        double[] doubleArray13 = new double[] { (short) 100, 0L, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) (-1.0f));
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4038");
        double[] doubleArray4 = new double[] { 10.0d, 10.0f, 'a', (short) -1 };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 100L);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4039");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray3 = new double[] { 'a' };
        double[] doubleArray5 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4040");
        double[] doubleArray2 = new double[] { (byte) -1, (byte) 10 };
        double[] doubleArray5 = new double[] { 1.0d, (-1L) };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray6, (double) 100L);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4041");
        double[] doubleArray5 = new double[] { (short) 10, 10, (-1), (short) 1, 1 };
        double[] doubleArray8 = new double[] { (byte) -1, 100 };
        double[] doubleArray10 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, 10.0d);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4042");
        double[] doubleArray5 = new double[] { 1.0f, (short) 0, (byte) 10, 10.0d, 0L };
        double[] doubleArray11 = new double[] { 100, '#', (byte) 1, 10, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) ' ');
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4043");
        double[] doubleArray5 = new double[] { 0L, 10, 100.0f, 0L, '#' };
        double[] doubleArray10 = new double[] { (byte) 0, 1.0f, (byte) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4044");
        double[] doubleArray4 = new double[] { 100.0f, (byte) 0, (byte) 100, 10.0f };
        double[] doubleArray9 = new double[] { 100L, (short) 0, 10L, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, 1.0d);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4045");
        double[] doubleArray6 = new double[] { 1.0d, 10.0f, 1.0d, 'a', 10, 'a' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, (double) 100L);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4046");
        double[] doubleArray2 = new double[] { (byte) 0, 10.0f };
        double[] doubleArray9 = new double[] { 1.0d, (short) 100, 1L, (short) 0, (byte) 1, 100.0d };
        double[] doubleArray16 = new double[] { 1.0f, (byte) 10, (short) 100, 1.0d, (-1L), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (double) '#');
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4047");
        double[] doubleArray5 = new double[] { 10, (-1L), (-1), (-1.0f), '4' };
        double[] doubleArray10 = new double[] { 0.0f, '#', 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, 1.0d);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4048");
        double[] doubleArray4 = new double[] { '4', 1, 10, (-1.0f) };
        double[] doubleArray7 = new double[] { (short) 100, (short) 1 };
        double[] doubleArray11 = new double[] { (-1.0f), (byte) -1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray11, (double) 1L);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4049");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray8 = new double[] { 10.0d, 100.0d, (short) 10, (byte) 1, (short) 1, 100.0d };
        double[] doubleArray15 = new double[] { 100.0d, 0.0d, (byte) 0, 1L, (byte) -1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, (-1.0d));
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4050");
        double[] doubleArray6 = new double[] { 0L, (short) 1, (byte) -1, (byte) 100, (byte) 10, (short) 10 };
        double[] doubleArray13 = new double[] { 10.0d, (-1L), 100, '#', '4', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, 1.0d);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4051");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray3 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray1, (double) 100);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4052");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100, (byte) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) '4');
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4053");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray5 = new double[] { 0.0d, (short) -1, (short) 10 };
        double[] doubleArray11 = new double[] { (-1), 10L, ' ', (-1), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray11, (double) 10);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4054");
        double[] doubleArray4 = new double[] { (short) 10, 1L, 1L, 100 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, 0.0d);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4055");
        double[] doubleArray4 = new double[] { 1, 0, '4', (byte) 0 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4056");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1), (byte) 10 };
        double[] doubleArray6 = new double[] { 1.0d, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (-1.0d));
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4057");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) '4');
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4058");
        double[] doubleArray1 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 10);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4059");
        double[] doubleArray6 = new double[] { 1.0f, 0.0f, 10.0d, 100, 0.0d, (byte) 10 };
        double[] doubleArray13 = new double[] { 100L, 10, 100.0d, 100.0f, 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) (byte) 10);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4060");
        double[] doubleArray4 = new double[] { 1.0d, 1, (-1.0f), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4061");
        double[] doubleArray2 = new double[] { 0, (short) 10 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4062");
        double[] doubleArray2 = new double[] { (byte) 1, (short) 10 };
        double[] doubleArray5 = new double[] { 100, 10L };
        double[] doubleArray8 = new double[] { 10, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, (-1.0d));
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4063");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, 0, (byte) -1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4064");
        double[] doubleArray3 = new double[] { ' ', 100.0f, (short) 0 };
        double[] doubleArray9 = new double[] { '4', 100.0f, 1.0f, 100.0d, (-1.0d) };
        double[] doubleArray16 = new double[] { (short) -1, (short) 0, 100.0f, (short) 100, 10.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray16, (double) 0);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4065");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1), 1.0f, (byte) 100, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4066");
        double[] doubleArray3 = new double[] { 100.0f, ' ', (byte) 0 };
        double[] doubleArray7 = new double[] { 10L, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4067");
        double[] doubleArray3 = new double[] { (byte) 1, ' ', (byte) 0 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, (double) 100.0f);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4068");
        double[] doubleArray3 = new double[] { 0.0d, (short) 0, ' ' };
        double[] doubleArray9 = new double[] { 100.0d, 1.0d, 1L, 1.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 1.0d);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4069");
        double[] doubleArray5 = new double[] { (byte) 100, (short) 0, (short) -1, 100.0d, 100L };
        double[] doubleArray8 = new double[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) 100.0f);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4070");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (byte) -1, (byte) 0, (byte) 10, (short) 100 };
        double[] doubleArray11 = new double[] { 100, 100.0f, 1L, 0, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) (byte) 10);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4071");
        double[] doubleArray6 = new double[] { 10L, 0L, (byte) 10, (short) 1, 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100L);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4072");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray3 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) 'a');
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4073");
        double[] doubleArray2 = new double[] { '4', (-1.0d) };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray9 = new double[] { (-1.0d), (byte) -1, 0.0d, (-1L), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4074");
        double[] doubleArray5 = new double[] { (byte) -1, 100, 100.0f, (-1L), 100.0d };
        double[] doubleArray7 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4075");
        double[] doubleArray2 = new double[] { (byte) 0, 10L };
        double[] doubleArray4 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, 10.0d);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4076");
        double[] doubleArray4 = new double[] { (byte) -1, 1.0f, 'a', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4077");
        double[] doubleArray4 = new double[] { 10.0f, 10L, (-1L), 10 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { (-1.0d), 1.0f, 0, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray10, (double) 'a');
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4078");
        double[] doubleArray5 = new double[] { 'a', 10L, (byte) -1, 10.0f, (-1.0d) };
        double[] doubleArray10 = new double[] { 100.0d, 1.0d, 0.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (-1L));
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4079");
        double[] doubleArray3 = new double[] { 10L, 0.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4080");
        double[] doubleArray5 = new double[] { (byte) 10, '#', (byte) 1, (byte) 10, 0.0f };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (-1.0f), (short) 1, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) 1L);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4081");
        double[] doubleArray6 = new double[] { 'a', 100L, (-1), 10, 1.0f, (byte) 100 };
        double[] doubleArray11 = new double[] { 1L, 10, (byte) 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4082");
        double[] doubleArray2 = new double[] { 10.0d, 100.0d };
        double[] doubleArray8 = new double[] { 100L, 100.0f, (byte) -1, 1.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 100.0f);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4083");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 100, 10.0d, 10L, 0.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, 0.0d);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4084");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, '4' };
        double[] doubleArray10 = new double[] { 100, 100.0d, 10.0d, ' ', (short) 0, 10L };
        double[] doubleArray17 = new double[] { 1L, 0.0d, (-1L), 10.0d, 'a', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray17, (double) 0.0f);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4085");
        double[] doubleArray2 = new double[] { 0.0f, (-1) };
        double[] doubleArray8 = new double[] { 100.0d, 10.0d, (-1), 10.0f, (-1.0d) };
        double[] doubleArray12 = new double[] { (byte) -1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray12, 0.0d);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4086");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 100, 100L };
        double[] doubleArray5 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, 100.0d);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4087");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 10, 0.0d, (-1L), 0, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) 100);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4088");
        double[] doubleArray5 = new double[] { (-1.0d), 0L, (short) 100, (byte) 10, (byte) 100 };
        double[] doubleArray12 = new double[] { (byte) -1, (short) 0, (short) 1, 100.0f, 1.0f, (short) 100 };
        double[] doubleArray13 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4089");
        double[] doubleArray6 = new double[] { '4', 100, 1.0f, 'a', 1.0f, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 100.0d);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4090");
        double[] doubleArray3 = new double[] { 10, (short) 0, (byte) 0 };
        double[] doubleArray10 = new double[] { 100, 1L, '#', 1.0d, 1.0f, 10 };
        double[] doubleArray12 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray12, (double) (short) -1);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4091");
        double[] doubleArray6 = new double[] { (-1L), 0.0f, 1.0f, 10, 0.0f, 0.0f };
        double[] doubleArray9 = new double[] { (-1.0f), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4092");
        double[] doubleArray5 = new double[] { (byte) -1, 10.0f, 'a', '4', 10.0d };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (-1.0d));
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4093");
        double[] doubleArray3 = new double[] { (short) 0, 100, (-1) };
        double[] doubleArray6 = new double[] { '4', '4' };
        double[] doubleArray11 = new double[] { (-1.0f), 1L, 1L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4094");
        double[] doubleArray4 = new double[] { (byte) 1, (byte) 0, 100.0f, 100.0d };
        double[] doubleArray11 = new double[] { '#', 10.0d, '#', (byte) 0, (short) 100, (short) 100 };
        double[] doubleArray14 = new double[] { (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray14, (-1.0d));
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4095");
        double[] doubleArray3 = new double[] { 0.0d, 1, 0.0f };
        double[] doubleArray6 = new double[] { (short) 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (-1.0d));
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4096");
        double[] doubleArray6 = new double[] { 0, (short) -1, 100L, (-1), 100, (-1) };
        double[] doubleArray11 = new double[] { (-1), (-1), (short) 1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4097");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray6 = new double[] { 10.0f, ' ', (short) 10, 10L };
        double[] doubleArray8 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray8, (double) 0L);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4098");
        double[] doubleArray5 = new double[] { 100.0f, (short) 1, 0.0d, '4', (short) 1 };
        double[] doubleArray9 = new double[] { 0, 10.0d, (short) 1 };
        double[] doubleArray13 = new double[] { 100.0f, '4', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) 1);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4099");
        double[] doubleArray4 = new double[] { 0.0f, (byte) -1, 1L, 10.0f };
        double[] doubleArray6 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 1L);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4100");
        double[] doubleArray4 = new double[] { 1L, 10L, 100, 100.0d };
        double[] doubleArray7 = new double[] { (byte) 100, (byte) -1 };
        double[] doubleArray10 = new double[] { (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4101");
        double[] doubleArray3 = new double[] { (-1.0f), 10.0f, (byte) 0 };
        double[] doubleArray6 = new double[] { (short) 100, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 0L);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4102");
        double[] doubleArray5 = new double[] { 10.0f, 0.0d, 10L, 0.0f, '4' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { 0.0f, (short) 10, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray10, (double) 1L);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4103");
        double[] doubleArray6 = new double[] { 0.0f, 100.0f, ' ', (-1.0d), 1.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0L);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4104");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray3 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray3, (double) 10.0f);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4105");
        double[] doubleArray4 = new double[] { ' ', (-1), 1, 100L };
        double[] doubleArray9 = new double[] { 100, (short) 100, 10.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4106");
        double[] doubleArray6 = new double[] { (-1.0f), 100.0d, (short) 10, 100.0d, 100.0f, (-1.0d) };
        double[] doubleArray12 = new double[] { 0L, 0L, 100.0f, 10.0d, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, (double) 0L);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4107");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray7 = new double[] { (short) 100, ' ', (short) 100, (short) 100, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4108");
        double[] doubleArray4 = new double[] { 0, (byte) 100, 1.0d, (byte) 100 };
        double[] doubleArray8 = new double[] { 10, 0.0f, (byte) 0 };
        double[] doubleArray15 = new double[] { (short) -1, 1L, (byte) 1, 0.0d, 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) 100L);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4109");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray5 = new double[] { 1.0d, (-1), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) 0);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4110");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) -1, 10L, (-1L), (-1.0d), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) (-1));
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4111");
        double[] doubleArray4 = new double[] { (short) 0, 0L, (short) 10, 10.0f };
        double[] doubleArray8 = new double[] { 0, 1.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) 100);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4112");
        double[] doubleArray4 = new double[] { 0, (byte) -1, 1.0d, 0.0d };
        double[] doubleArray6 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 10);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4113");
        double[] doubleArray6 = new double[] { (byte) 1, 100, 0L, (short) -1, 1L, (-1) };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (-1L));
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4114");
        double[] doubleArray5 = new double[] { 1.0f, (byte) 10, '#', 0.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 0);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4115");
        double[] doubleArray1 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 0);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4116");
        double[] doubleArray5 = new double[] { (-1.0d), (short) 0, (-1.0f), (byte) 100, (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4117");
        double[] doubleArray4 = new double[] { 0L, 0.0d, 1, 100.0f };
        double[] doubleArray10 = new double[] { (short) 1, 0.0d, (byte) -1, (byte) -1, (short) 100 };
        double[] doubleArray17 = new double[] { (byte) 10, 10, (byte) 100, (short) 0, 0.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray17, 0.0d);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4118");
        double[] doubleArray3 = new double[] { (short) 100, 0, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) 10L);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4119");
        double[] doubleArray1 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 'a');
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4120");
        double[] doubleArray5 = new double[] { (short) 1, 10.0f, (short) 0, 10.0d, 10 };
        double[] doubleArray12 = new double[] { 10.0d, 0.0f, (-1L), 0L, (byte) 10, (-1) };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray13, 0.0d);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4121");
        double[] doubleArray6 = new double[] { 10.0f, 1.0f, 10, (short) 10, (byte) -1, (byte) 1 };
        double[] doubleArray9 = new double[] { (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) (-1));
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4122");
        double[] doubleArray3 = new double[] { '4', 'a', 'a' };
        double[] doubleArray7 = new double[] { 100.0d, (short) 1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4123");
        double[] doubleArray4 = new double[] { (short) 100, (byte) 100, (short) 1, 10 };
        double[] doubleArray11 = new double[] { (short) 1, 1L, '#', ' ', 1L, (-1.0d) };
        double[] doubleArray14 = new double[] { 0L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray14, (double) (short) 0);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4124");
        double[] doubleArray6 = new double[] { 0.0d, 10.0d, 'a', 1, (byte) -1, 1.0d };
        double[] doubleArray11 = new double[] { 100L, '#', 100.0d, (-1) };
        double[] doubleArray18 = new double[] { (-1.0f), (short) 100, 1, 1, 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray18, (double) 100.0f);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4125");
        double[] doubleArray2 = new double[] { 10.0f, (-1.0d) };
        double[] doubleArray8 = new double[] { 10L, (byte) 100, (byte) 100, 0.0f, 0L };
        double[] doubleArray10 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray10, (double) 10);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4126");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { 0, 100.0f, (byte) 0, 1.0d, 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4127");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100L, (byte) 100, 100L };
        double[] doubleArray6 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4128");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray8 = new double[] { 0, (byte) 100, 0.0d, 100.0d, 'a', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) '#');
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4129");
        double[] doubleArray6 = new double[] { 1L, (short) -1, (byte) 10, 100.0f, (short) 100, 1L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (short) 1);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4130");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 'a', 10, (short) 100, 100, 10L, 10L };
        double[] doubleArray10 = new double[] { 0L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4131");
        double[] doubleArray5 = new double[] { (short) -1, 1.0f, 10.0f, 1.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 10L);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4132");
        double[] doubleArray3 = new double[] { 0.0d, (-1.0f), (-1L) };
        double[] doubleArray8 = new double[] { 10L, 10.0d, '4', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 0.0d);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4133");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0f), (-1.0d), (short) -1 };
        double[] doubleArray8 = new double[] { (short) 1, 100.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, (double) ' ');
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4134");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) 100);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4135");
        double[] doubleArray4 = new double[] { (-1), (-1.0d), (-1L), 1.0d };
        double[] doubleArray8 = new double[] { (short) -1, (short) -1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 100.0f);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4136");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) (short) -1);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4137");
        double[] doubleArray1 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4138");
        double[] doubleArray3 = new double[] { 0, 1L, 1.0f };
        double[] doubleArray8 = new double[] { (short) 10, (short) 100, (-1L), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (byte) 1);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4139");
        double[] doubleArray3 = new double[] { 10.0d, 0.0d, 0L };
        double[] doubleArray8 = new double[] { (-1L), (short) 100, 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) 10L);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4140");
        double[] doubleArray5 = new double[] { 100.0d, (byte) 100, (-1), ' ', '4' };
        double[] doubleArray8 = new double[] { (short) 100, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4141");
        double[] doubleArray3 = new double[] { 0L, 10.0f, '4' };
        double[] doubleArray5 = new double[] { 10.0d };
        double[] doubleArray12 = new double[] { 1.0d, 100L, 0, 100L, ' ', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4142");
        double[] doubleArray4 = new double[] { (-1), 0.0d, (byte) 10, (short) 100 };
        double[] doubleArray11 = new double[] { 100L, (short) 100, 100.0d, (byte) -1, 10.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4143");
        double[] doubleArray5 = new double[] { 0.0d, (short) 1, (-1.0f), 1, (-1.0d) };
        double[] doubleArray8 = new double[] { (byte) 10, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4144");
        double[] doubleArray3 = new double[] { 0.0f, ' ', 100 };
        double[] doubleArray8 = new double[] { 100.0d, 10L, (byte) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4145");
        double[] doubleArray5 = new double[] { 10.0d, (-1L), (byte) 100, 10.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4146");
        double[] doubleArray1 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4147");
        double[] doubleArray6 = new double[] { 1.0d, 0.0f, (byte) -1, '4', (short) 100, 0 };
        double[] doubleArray12 = new double[] { 100L, 10, 0L, 10, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, 1.0d);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4148");
        double[] doubleArray6 = new double[] { (byte) -1, '4', 10, 10.0f, (short) 10, (short) 10 };
        double[] doubleArray8 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) (-1));
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4149");
        double[] doubleArray5 = new double[] { '#', (short) 0, '4', (byte) 100, (byte) 10 };
        double[] doubleArray9 = new double[] { 10L, (-1.0d), (byte) -1 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray10, (double) '#');
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4150");
        double[] doubleArray5 = new double[] { 10.0d, 10, (short) 100, (byte) 1, (short) 1 };
        double[] doubleArray11 = new double[] { (-1L), 10.0d, (byte) 1, 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, 0.0d);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4151");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { ' ', 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) 'a');
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4152");
        double[] doubleArray2 = new double[] { (short) 10, 100.0d };
        double[] doubleArray9 = new double[] { 10.0d, 1, ' ', (byte) 10, (short) 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (-1));
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4153");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) 10.0f);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4154");
        double[] doubleArray5 = new double[] { 1.0f, (-1L), 10, (short) 1, 1.0d };
        double[] doubleArray10 = new double[] { 0, 10L, 0.0d, 1L };
        double[] doubleArray15 = new double[] { (short) -1, 10L, 10.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, (double) 0L);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4155");
        double[] doubleArray6 = new double[] { 0, 100L, 0.0f, 1.0f, 10, 10.0d };
        double[] doubleArray10 = new double[] { '4', (byte) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) '#');
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4156");
        double[] doubleArray4 = new double[] { (-1.0f), 10.0f, (byte) -1, (-1.0d) };
        double[] doubleArray7 = new double[] { 0.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) '4');
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4157");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray8 = new double[] { 0, (byte) 0, (short) 1, (short) 0, 10, (byte) 100 };
        double[] doubleArray11 = new double[] { 0L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray11, 1.0d);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4158");
        double[] doubleArray5 = new double[] { 1.0f, 0.0f, 0.0d, '4', (byte) 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4159");
        double[] doubleArray6 = new double[] { 100L, (short) 0, (-1.0f), (byte) 0, 10.0d, 10.0f };
        double[] doubleArray8 = new double[] { 100 };
        double[] doubleArray12 = new double[] { 10, 0.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray12, (double) 0L);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4160");
        double[] doubleArray6 = new double[] { 1.0f, 10.0d, 0L, (short) 100, 100.0f, (-1.0f) };
        double[] doubleArray11 = new double[] { 0L, 100L, (byte) 0, (short) 100 };
        double[] doubleArray15 = new double[] { 10, 'a', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray15, (double) 100.0f);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4161");
        double[] doubleArray5 = new double[] { 1.0d, (byte) -1, 'a', (-1.0d), 100.0d };
        double[] doubleArray7 = new double[] { (-1) };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray8, 0.0d);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4162");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 10, ' ', 1L };
        double[] doubleArray11 = new double[] { 1L, 10.0d, 0.0f, (byte) 100, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray11, 0.0d);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4163");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { 10.0d, '#', 0L, 1.0f, 1, (byte) 10 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4164");
        double[] doubleArray6 = new double[] { (-1L), (byte) 1, (-1L), 100, (-1.0d), 100L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4165");
        double[] doubleArray6 = new double[] { 10, (byte) 10, 100.0f, (byte) 100, (short) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4166");
        double[] doubleArray4 = new double[] { 1.0d, 10.0d, 0.0f, (-1L) };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0d), (short) 0, 0L, (byte) 10 };
        double[] doubleArray16 = new double[] { '4', (-1), 1.0d, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) 10.0f);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4167");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0, (byte) -1, 1.0f, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 1.0f);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4168");
        double[] doubleArray2 = new double[] { 10, 1 };
        double[] doubleArray7 = new double[] { (byte) 1, 0.0d, (short) 100, (-1.0f) };
        double[] doubleArray13 = new double[] { 'a', 100L, 10, 10L, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray13, 1.0d);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4169");
        double[] doubleArray5 = new double[] { (byte) 0, (byte) 0, 1L, 0.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1));
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4170");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { 100.0f, 1.0d, (short) 100, 100.0d, (short) 1, 10L };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) ' ');
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4171");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray7 = new double[] { 0.0f, (-1), (byte) 10, (byte) 10, '4' };
        double[] doubleArray10 = new double[] { (short) 100, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray10, (double) 10L);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4172");
        double[] doubleArray4 = new double[] { (byte) 100, 0L, (byte) 0, 10 };
        double[] doubleArray7 = new double[] { 10.0f, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4173");
        double[] doubleArray3 = new double[] { 0L, ' ', 0.0f };
        double[] doubleArray7 = new double[] { (byte) 10, (byte) 1, (short) 0 };
        double[] doubleArray9 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray9, (double) '#');
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4174");
        double[] doubleArray2 = new double[] { 'a', (-1) };
        double[] doubleArray9 = new double[] { 1, 100.0d, 10.0f, (short) 10, 1L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, 0.0d);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test4175");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray5 = new double[] { 1, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 1);
    }
}
