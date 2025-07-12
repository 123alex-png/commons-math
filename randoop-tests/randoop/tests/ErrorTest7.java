package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3501");
        double[] doubleArray5 = new double[] { (short) 100, 100, (-1.0d), (byte) 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3502");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1, 100.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3503");
        double[] doubleArray1 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3504");
        double[] doubleArray5 = new double[] { '#', 1.0d, 'a', (short) 1, (short) 1 };
        double[] doubleArray11 = new double[] { (-1), (-1L), (-1.0f), 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (byte) 1);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3505");
        double[] doubleArray6 = new double[] { 1.0f, (-1.0d), (short) 1, (byte) 10, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3506");
        double[] doubleArray5 = new double[] { 10, 10L, 1, (short) -1, 100.0f };
        double[] doubleArray9 = new double[] { (-1), 0L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) (byte) 0);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3507");
        double[] doubleArray5 = new double[] { 1L, 10.0f, (byte) 10, 10.0d, (short) 1 };
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 0, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) ' ');
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3508");
        double[] doubleArray2 = new double[] { (short) -1, 100.0d };
        double[] doubleArray5 = new double[] { 1.0d, 0 };
        double[] doubleArray11 = new double[] { (-1.0d), (-1.0d), (short) -1, '4', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3509");
        double[] doubleArray2 = new double[] { 1.0f, 1.0d };
        double[] doubleArray5 = new double[] { 100L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, 0.0d);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3510");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray7 = new double[] { ' ', (byte) 0, 0, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3511");
        double[] doubleArray4 = new double[] { (-1.0f), 10, 0.0d, (short) 0 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 100);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3512");
        double[] doubleArray4 = new double[] { ' ', (-1L), 100.0d, 10L };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray6, (double) 'a');
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3513");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1, (short) 1, '4', (byte) 10, (-1.0d) };
        double[] doubleArray8 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3514");
        double[] doubleArray2 = new double[] { 10.0d, 1 };
        double[] doubleArray7 = new double[] { 100L, 1.0d, 0.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3515");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) 0, 0L, (short) -1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) 1L);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3516");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) (byte) -1);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3517");
        double[] doubleArray4 = new double[] { 1, 100, '4', 0L };
        double[] doubleArray10 = new double[] { (short) 10, '#', 10.0d, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3518");
        double[] doubleArray4 = new double[] { '#', ' ', (-1.0f), 0.0d };
        double[] doubleArray11 = new double[] { (short) 0, 100L, (byte) -1, 10.0f, 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) (short) 0);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3519");
        double[] doubleArray2 = new double[] { (short) 100, 1 };
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray10 = new double[] { (byte) 10, (-1), (short) 0, ' ', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray10, (double) 10);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3520");
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 100, 0L, (-1.0d), 1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3521");
        double[] doubleArray4 = new double[] { (short) -1, (byte) 0, (byte) 100, (byte) 100 };
        double[] doubleArray6 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 1L);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3522");
        double[] doubleArray4 = new double[] { (-1), 0L, 'a', 0.0f };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0d, (byte) -1, (short) 100, (short) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray11, (double) 100L);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3523");
        double[] doubleArray2 = new double[] { (byte) 1, 100.0f };
        double[] doubleArray7 = new double[] { 10, 100, 1.0d, 10.0f };
        double[] doubleArray14 = new double[] { 0L, '#', (short) 10, 100.0d, (byte) 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray14, (-1.0d));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3524");
        double[] doubleArray2 = new double[] { 0.0d, 'a' };
        double[] doubleArray8 = new double[] { 100.0d, 1.0d, 100L, 10L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, (double) 100);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3525");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, 0.0d);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3526");
        double[] doubleArray2 = new double[] { 0, '#' };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 100);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3527");
        double[] doubleArray3 = new double[] { 0.0f, (short) 0, '4' };
        double[] doubleArray10 = new double[] { 10L, (-1L), 0L, 0, (short) 0, (byte) 10 };
        double[] doubleArray14 = new double[] { (short) -1, 'a', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray14, (double) (short) 1);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3528");
        double[] doubleArray5 = new double[] { 100.0d, 1.0f, 0.0d, 10.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3529");
        double[] doubleArray6 = new double[] { 100, 1.0d, 1.0d, (short) 100, 0, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3530");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) ' ');
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3531");
        double[] doubleArray2 = new double[] { 10, (byte) -1 };
        double[] doubleArray6 = new double[] { (-1.0f), 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) 100);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3532");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, (double) '4');
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3533");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0L, (short) 10 };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray4, 0.0d);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3534");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { 0, ' ', '4' };
        double[] doubleArray7 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray7, (double) ' ');
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3535");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray8 = new double[] { '4', 10, 1.0f, (byte) 0, 0, 0L };
        double[] doubleArray10 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3536");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { '#', (short) 1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3537");
        double[] doubleArray3 = new double[] { 10, 10.0f, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (-1.0d));
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3538");
        double[] doubleArray3 = new double[] { (byte) 1, 1.0d, 0.0d };
        double[] doubleArray7 = new double[] { 'a', ' ', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) 'a');
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3539");
        double[] doubleArray4 = new double[] { (short) 100, (-1), 1, 1.0f };
        double[] doubleArray6 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray4, (double) 1L);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3540");
        double[] doubleArray3 = new double[] { 100L, (short) 1, 10L };
        double[] doubleArray9 = new double[] { 1.0f, (byte) 1, 100.0f, 100.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray3, (double) (byte) 10);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3541");
        double[] doubleArray6 = new double[] { (-1), 'a', 1L, (-1.0f), 100.0d, (short) -1 };
        double[] doubleArray10 = new double[] { (-1), 1.0d, (short) 10 };
        double[] doubleArray14 = new double[] { (short) 100, (short) 1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray14, (double) 100L);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3542");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1, 100.0d, '4' };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3543");
        double[] doubleArray6 = new double[] { 1.0f, 10L, 'a', 100.0d, 10L, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) ' ');
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3544");
        double[] doubleArray3 = new double[] { (byte) -1, 10.0d, 100 };
        double[] doubleArray9 = new double[] { 'a', '#', (short) 100, 0, '#' };
        double[] doubleArray16 = new double[] { 1.0d, 0, 100.0f, 100L, 1.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray16, (-1.0d));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3545");
        double[] doubleArray5 = new double[] { 10.0f, (byte) -1, 0L, (byte) 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1L);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3546");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 1, 10.0d, (byte) -1, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3547");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray3 = new double[] { 0.0f };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3548");
        double[] doubleArray2 = new double[] { (-1), 100.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { (byte) 0, (-1), (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray8, (-1.0d));
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3549");
        double[] doubleArray1 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3550");
        double[] doubleArray3 = new double[] { 10.0d, 0L, (byte) 10 };
        double[] doubleArray8 = new double[] { (short) -1, (-1L), 'a', 10.0f };
        double[] doubleArray14 = new double[] { (byte) 10, 10.0f, 'a', 0.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray14, (double) (byte) 0);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3551");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10L, 1 };
        double[] doubleArray7 = new double[] { 10, 0.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3552");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1.0f), (short) 1 };
        double[] doubleArray5 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3553");
        double[] doubleArray4 = new double[] { 0.0f, (byte) 0, (-1.0d), (-1L) };
        double[] doubleArray6 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) '#');
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3554");
        double[] doubleArray2 = new double[] { '#', 10L };
        double[] doubleArray8 = new double[] { (short) 1, (short) 10, 100.0d, (short) 100, 10L };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, 0.0d);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3555");
        double[] doubleArray5 = new double[] { 100.0d, '#', 100.0f, (short) 10, 100.0d };
        double[] doubleArray8 = new double[] { (-1), (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray11, 1.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3556");
        double[] doubleArray6 = new double[] { (short) 10, (byte) 1, '4', 0L, '#', (short) -1 };
        double[] doubleArray10 = new double[] { 100.0f, (short) -1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3557");
        double[] doubleArray4 = new double[] { 0.0d, 0, '#', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 1);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3558");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray5 = new double[] { (byte) 1, 0L, 100L };
        double[] doubleArray8 = new double[] { '#', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3559");
        double[] doubleArray3 = new double[] { 10L, 0.0d, 10 };
        double[] doubleArray7 = new double[] { 1.0d, (-1.0f), '4' };
        double[] doubleArray10 = new double[] { 100.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray10, 0.0d);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3560");
        double[] doubleArray3 = new double[] { (short) 10, 100L, (-1.0f) };
        double[] doubleArray5 = new double[] { '4' };
        double[] doubleArray10 = new double[] { (byte) 0, (byte) 1, 'a', 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray10, (double) 0L);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3561");
        double[] doubleArray2 = new double[] { (byte) 100, (short) -1 };
        double[] doubleArray5 = new double[] { (byte) 10, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) ' ');
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3562");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray3 = new double[] { (byte) 0 };
        double[] doubleArray9 = new double[] { 0.0d, (short) 100, 1.0f, (byte) 1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) (byte) 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3563");
        double[] doubleArray1 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (-1L));
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3564");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 1, 100, 1L, '#', (-1) };
        double[] doubleArray8 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, (double) 0);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3565");
        double[] doubleArray5 = new double[] { (short) -1, (-1), (short) 10, 1.0f, (byte) 100 };
        double[] doubleArray12 = new double[] { '4', (byte) 0, (byte) 10, (byte) -1, (-1L), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (short) 0);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3566");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray6 = new double[] { ' ', 0, (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, 100.0d);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3567");
        double[] doubleArray1 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3568");
        double[] doubleArray3 = new double[] { (byte) 10, 10L, (-1L) };
        double[] doubleArray6 = new double[] { ' ', (short) -1 };
        double[] doubleArray13 = new double[] { 1, (byte) 0, 10.0f, 0L, (byte) 100, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray13, (double) 100.0f);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3569");
        double[] doubleArray3 = new double[] { '4', 100, 1.0d };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { 100.0d, (short) 1, ' ', 10L, 0.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray11, (double) 100);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3570");
        double[] doubleArray2 = new double[] { (byte) 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 10);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3571");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0f, (byte) 100, 100L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3572");
        double[] doubleArray1 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (-1.0f));
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3573");
        double[] doubleArray3 = new double[] { 0, 1.0f, 0.0f };
        double[] doubleArray9 = new double[] { 10, 1.0d, 1, 1.0f, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) 1);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3574");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray8 = new double[] { (byte) 10, (byte) 1, 0, (byte) 10, '4', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) 0L);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3575");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray6 = new double[] { 'a', '4', (byte) 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 1L);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3576");
        double[] doubleArray5 = new double[] { 1, 0, (short) -1, (-1.0d), (short) 10 };
        double[] doubleArray8 = new double[] { (byte) 100, (short) 0 };
        double[] doubleArray15 = new double[] { 0L, (-1), 1.0d, (-1), (short) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray15, (double) '#');
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3577");
        double[] doubleArray3 = new double[] { 'a', 10.0d, (byte) 100 };
        double[] doubleArray7 = new double[] { (short) 0, (byte) 100, 100 };
        double[] doubleArray12 = new double[] { 1.0d, 10.0f, (short) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) 0);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3578");
        double[] doubleArray4 = new double[] { 1L, '4', (short) 10, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3579");
        double[] doubleArray6 = new double[] { (-1), (byte) 100, ' ', 10, 1.0d, '#' };
        double[] doubleArray8 = new double[] { 0.0d };
        double[] doubleArray12 = new double[] { 0.0d, 10, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray12, 1.0d);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3580");
        double[] doubleArray4 = new double[] { 100, 1, 0.0d, 100.0d };
        double[] doubleArray7 = new double[] { 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 10);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3581");
        double[] doubleArray6 = new double[] { (byte) 0, 1.0f, (byte) -1, 10L, 'a', 100L };
        double[] doubleArray12 = new double[] { 0L, 100L, 10.0f, (short) 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3582");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { 0L, (byte) 0, 100.0d, ' ', 1.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray8, (double) (-1L));
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3583");
        double[] doubleArray2 = new double[] { (-1.0d), (short) 1 };
        double[] doubleArray6 = new double[] { (-1.0d), (byte) -1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3584");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { (byte) 10, 0.0f, 10L, 1L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, 0.0d);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3585");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 'a', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) '#');
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3586");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0f, 1.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (-1.0d));
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3587");
        double[] doubleArray3 = new double[] { 0, 1L, 100.0f };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray8 = new double[] { (short) -1, (short) 0, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray8, (double) (-1L));
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3588");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10.0f, 10.0f, 0L, (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3589");
        double[] doubleArray3 = new double[] { (-1L), '4', 1.0d };
        double[] doubleArray7 = new double[] { (-1), 1L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (-1L));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3590");
        double[] doubleArray5 = new double[] { '4', (byte) 0, '#', (byte) 10, (short) -1 };
        double[] doubleArray12 = new double[] { (byte) -1, (-1.0f), 10.0f, 0L, (byte) -1, (byte) -1 };
        double[] doubleArray15 = new double[] { (short) -1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray15, (double) (byte) -1);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3591");
        double[] doubleArray5 = new double[] { (-1.0f), 100.0f, (-1.0d), (-1.0d), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3592");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray5 = new double[] { '4', 1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3593");
        double[] doubleArray5 = new double[] { (byte) 1, (short) 0, (byte) 100, (byte) 10, 10.0d };
        double[] doubleArray12 = new double[] { 0, (short) 100, (byte) 1, 0, ' ', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3594");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray5 = new double[] { 10, (-1.0d), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 1);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3595");
        double[] doubleArray5 = new double[] { (short) 10, 100.0d, (byte) -1, 10, 1.0d };
        double[] doubleArray8 = new double[] { 100L, 10L };
        double[] doubleArray13 = new double[] { (short) -1, (-1L), 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray13, (double) 100L);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3596");
        double[] doubleArray6 = new double[] { (short) 0, ' ', ' ', (byte) -1, 100L, (byte) 1 };
        double[] doubleArray9 = new double[] { 0.0d, (short) 100 };
        double[] doubleArray14 = new double[] { (byte) 10, 0.0f, 1.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray14, (double) 10L);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3597");
        double[] doubleArray6 = new double[] { 100.0f, 100, 0, 100L, 1, 100.0f };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) 0.0f);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3598");
        double[] doubleArray6 = new double[] { 0, 10.0d, 0L, (short) 1, 10.0f, 1 };
        double[] doubleArray12 = new double[] { 100L, 100, 10, (byte) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, 0.0d);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3599");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (double) 100);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3600");
        double[] doubleArray6 = new double[] { (short) 0, 'a', (short) 10, (short) 100, (byte) 1, (short) 0 };
        double[] doubleArray12 = new double[] { 10, 10.0f, (short) 1, 100, 10 };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) 'a');
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3601");
        double[] doubleArray2 = new double[] { (-1L), 10L };
        double[] doubleArray6 = new double[] { 10.0f, (byte) 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, 100.0d);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3602");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) -1, (short) 1, 10.0d, 10, (-1L) };
        double[] doubleArray13 = new double[] { '#', '#', 0.0d, 100.0f, (byte) -1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray13, (double) (byte) 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3603");
        double[] doubleArray3 = new double[] { '#', (-1L), '4' };
        double[] doubleArray7 = new double[] { 1.0d, 100.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) ' ');
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3604");
        double[] doubleArray2 = new double[] { (byte) 100, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1L);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3605");
        double[] doubleArray5 = new double[] { (short) 100, '4', 0, (short) 100, 100 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3606");
        double[] doubleArray4 = new double[] { 10, (short) 1, (short) -1, '4' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, 1.0d);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3607");
        double[] doubleArray5 = new double[] { 100L, (byte) 10, 'a', (-1L), 0.0d };
        double[] doubleArray12 = new double[] { 100.0d, 100L, (short) 10, (byte) -1, 0L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3608");
        double[] doubleArray4 = new double[] { 100.0f, 10L, ' ', 100L };
        double[] doubleArray11 = new double[] { 0.0d, 10, (byte) 1, (-1), (short) 1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3609");
        double[] doubleArray6 = new double[] { 10.0d, 1L, (byte) 0, (-1.0d), 100.0d, (byte) -1 };
        double[] doubleArray10 = new double[] { (byte) 10, 1.0f, (byte) 1 };
        double[] doubleArray13 = new double[] { 0.0f, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray13, (double) (-1.0f));
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3610");
        double[] doubleArray2 = new double[] { (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 10.0d);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3611");
        double[] doubleArray3 = new double[] { 100.0d, 0, 100.0d };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray3, 0.0d);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3612");
        double[] doubleArray4 = new double[] { (short) -1, (short) -1, (short) 100, 0 };
        double[] doubleArray7 = new double[] { (short) -1, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (double) (-1));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3613");
        double[] doubleArray5 = new double[] { (byte) 10, 1.0d, (byte) 0, 100L, (short) -1 };
        double[] doubleArray9 = new double[] { (short) 1, 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3614");
        double[] doubleArray5 = new double[] { 10.0f, 0.0d, 1, 100, 'a' };
        double[] doubleArray12 = new double[] { (short) 0, (-1.0f), (short) 100, 1.0f, (byte) -1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) '#');
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3615");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 1 };
        double[] doubleArray4 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray4, (double) ' ');
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3616");
        double[] doubleArray4 = new double[] { (-1), (byte) 0, (short) 1, (-1.0f) };
        double[] doubleArray11 = new double[] { (byte) 0, 1L, 0.0d, 10.0d, (short) -1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) '#');
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3617");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '4', 0.0f, 0.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3618");
        double[] doubleArray4 = new double[] { 10.0f, 1L, 1.0f, ' ' };
        double[] doubleArray10 = new double[] { (byte) 100, (short) 1, 10L, 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray4, (double) ' ');
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3619");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) -1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 0);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3620");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray5 = new double[] { (byte) -1, 100, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (-1));
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3621");
        double[] doubleArray6 = new double[] { (byte) 0, 100, 1.0d, (-1L), '#', (short) 0 };
        double[] doubleArray13 = new double[] { 100.0d, 100.0f, 1, (byte) 10, (-1), (-1.0f) };
        double[] doubleArray16 = new double[] { (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray16, (double) ' ');
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3622");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray5 = new double[] { 'a', '4', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3623");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1.0f) };
        double[] doubleArray8 = new double[] { 10.0f, 0, 0L, 1.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray8, 0.0d);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3624");
        double[] doubleArray2 = new double[] { (short) -1, (short) 1 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3625");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray8 = new double[] { (byte) 0, 1, 10.0f, 1.0f, 10.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3626");
        double[] doubleArray5 = new double[] { 0.0d, 10.0d, (-1), 10, '#' };
        double[] doubleArray9 = new double[] { (short) 10, (byte) -1, (-1L) };
        double[] doubleArray13 = new double[] { 10.0d, 100.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) 1);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3627");
        double[] doubleArray4 = new double[] { (byte) 100, (byte) 1, 10L, 100.0d };
        double[] doubleArray7 = new double[] { 0.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) (-1));
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3628");
        double[] doubleArray4 = new double[] { (-1L), '4', (-1L), (-1L) };
        double[] doubleArray10 = new double[] { 0, (byte) 10, (short) -1, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) (short) 10);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3629");
        double[] doubleArray4 = new double[] { (byte) 1, 100L, '4', (-1.0f) };
        double[] doubleArray10 = new double[] { (short) 10, (byte) 1, (short) 1, (-1), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3630");
        double[] doubleArray6 = new double[] { '#', '#', (short) 1, (-1L), (short) 0, (byte) -1 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3631");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { (-1L), 10, 1, (byte) 0 };
        double[] doubleArray8 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray8, (double) 0);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3632");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) -1, 100.0f, (short) 0 };
        double[] doubleArray8 = new double[] { 0.0f, 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3633");
        double[] doubleArray4 = new double[] { '4', 10, (byte) 1, '4' };
        double[] doubleArray6 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) '4');
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3634");
        double[] doubleArray2 = new double[] { 0.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (-1.0d));
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3635");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray3 = new double[] { (-1.0f) };
        double[] doubleArray9 = new double[] { (short) 0, 10L, (short) 10, (-1L), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3636");
        double[] doubleArray6 = new double[] { 100L, (short) 0, (-1), 100.0f, (byte) 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 10);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3637");
        double[] doubleArray6 = new double[] { 0.0d, (short) 1, 100, (-1L), (byte) 0, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3638");
        double[] doubleArray2 = new double[] { (short) 0, 10L };
        double[] doubleArray4 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) '#');
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3639");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray6 = new double[] { (byte) 100, (short) 10, 'a', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) 1.0f);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3640");
        double[] doubleArray1 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 'a');
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3641");
        double[] doubleArray6 = new double[] { 10.0f, 100, (byte) 1, 1.0f, 0.0f, 100.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, 0.0d);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3642");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 1, (byte) -1, 10.0f, '4', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) '4');
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3643");
        double[] doubleArray5 = new double[] { 10L, '4', 100.0f, 'a', 1.0d };
        double[] doubleArray12 = new double[] { (short) 0, ' ', 1L, (byte) 1, (short) 0, 1.0f };
        double[] doubleArray16 = new double[] { '4', (-1), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) (short) 0);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3644");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0f, (-1.0f), '4', 0.0f };
        double[] doubleArray6 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray6, 1.0d);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3645");
        double[] doubleArray6 = new double[] { 0.0d, (byte) 0, 100.0d, (short) 1, 1L, 10L };
        double[] doubleArray9 = new double[] { 1.0d, 1.0d };
        double[] doubleArray10 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3646");
        double[] doubleArray2 = new double[] { 100L, 1L };
        double[] doubleArray5 = new double[] { (-1.0d), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, 100.0d);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3647");
        double[] doubleArray4 = new double[] { 0.0f, (byte) -1, 100.0f, 10 };
        double[] doubleArray8 = new double[] { 1.0d, 0L, 1L };
        double[] doubleArray10 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, (double) ' ');
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3648");
        double[] doubleArray3 = new double[] { (byte) -1, 1, (byte) 10 };
        double[] doubleArray6 = new double[] { 100.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3649");
        double[] doubleArray5 = new double[] { (-1L), 1.0f, (-1.0f), 0.0f, 1L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3650");
        double[] doubleArray2 = new double[] { (short) 100, (-1.0d) };
        double[] doubleArray4 = new double[] { 0.0f };
        double[] doubleArray11 = new double[] { (-1L), 1.0d, 0.0f, (short) 10, (-1.0f), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, (double) 0L);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3651");
        double[] doubleArray6 = new double[] { 1.0d, 0L, (short) 10, 10.0d, (byte) -1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3652");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray5 = new double[] { 10, (byte) 100, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (-1.0d));
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3653");
        double[] doubleArray2 = new double[] { (short) 1, 100.0f };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3654");
        double[] doubleArray2 = new double[] { 0L, 1.0f };
        double[] doubleArray6 = new double[] { (short) 100, (byte) -1, 10L };
        double[] doubleArray11 = new double[] { (byte) -1, '#', 100.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3655");
        double[] doubleArray6 = new double[] { 1L, 1, 0.0f, 1L, 100.0f, 10.0f };
        double[] doubleArray11 = new double[] { (byte) 10, 0, (byte) 0, '#' };
        double[] doubleArray15 = new double[] { (short) 100, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray15, 0.0d);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3656");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 100, 100.0d, 'a', (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) '4');
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3657");
        double[] doubleArray5 = new double[] { 10, (short) 10, (short) 1, (byte) 1, 1L };
        double[] doubleArray7 = new double[] { ' ' };
        double[] doubleArray11 = new double[] { '#', 1.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray11, (double) 'a');
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3658");
        double[] doubleArray3 = new double[] { 1.0d, 10, (short) 10 };
        double[] doubleArray7 = new double[] { (short) -1, (byte) 10, 0.0d };
        double[] doubleArray10 = new double[] { 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray10, 0.0d);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3659");
        double[] doubleArray6 = new double[] { 10, 10.0d, 1.0d, 'a', 1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100L);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3660");
        double[] doubleArray6 = new double[] { (short) 1, 'a', 0.0d, 0.0f, (byte) -1, 10 };
        double[] doubleArray10 = new double[] { (short) 10, 10.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, 0.0d);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3661");
        double[] doubleArray4 = new double[] { (byte) 10, 1.0f, 0.0d, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10L);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3662");
        double[] doubleArray3 = new double[] { 0, 1.0d, (byte) 10 };
        double[] doubleArray7 = new double[] { 1.0d, (short) 10, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) ' ');
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3663");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1), 100L };
        double[] doubleArray10 = new double[] { (byte) 100, (byte) -1, 100L, 1L, 10.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray10, (double) (short) 10);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3664");
        double[] doubleArray5 = new double[] { (short) 10, (-1L), 100, (short) -1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0d);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3665");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray8 = new double[] { 0, 1L, 0L, 10L, ' ', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray8, (double) 'a');
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3666");
        double[] doubleArray1 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (-1));
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3667");
        double[] doubleArray2 = new double[] { (byte) -1, 10.0d };
        double[] doubleArray5 = new double[] { (byte) 0, (-1.0d) };
        double[] doubleArray12 = new double[] { (byte) 10, ' ', 1.0d, 100, (short) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray12, (double) (short) 0);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3668");
        double[] doubleArray6 = new double[] { ' ', 10L, 10, 0L, 1L, 10L };
        double[] doubleArray8 = new double[] { (short) 10 };
        double[] doubleArray11 = new double[] { 100.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3669");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3670");
        double[] doubleArray6 = new double[] { (short) -1, 10.0d, 100.0f, 100, (byte) 1, 10.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray7, (double) 1);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3671");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0d, (byte) 1, (byte) 10, 100.0d };
        double[] doubleArray12 = new double[] { 1.0d, (byte) -1, (short) 10, 100.0d, (short) 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3672");
        double[] doubleArray5 = new double[] { 100.0d, 0L, (short) 1, 0, (byte) -1 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3673");
        double[] doubleArray4 = new double[] { (-1.0d), 10.0f, (byte) 0, (byte) 100 };
        double[] doubleArray8 = new double[] { (short) 0, 10.0d, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) '#');
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3674");
        double[] doubleArray2 = new double[] { 100L, 1L };
        double[] doubleArray8 = new double[] { 1, 10.0d, 'a', 10L, 0.0f };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray9, 0.0d);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3675");
        double[] doubleArray4 = new double[] { (byte) -1, 0L, 'a', (byte) 10 };
        double[] doubleArray7 = new double[] { 10.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 1L);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3676");
        double[] doubleArray2 = new double[] { (-1.0d), (short) 0 };
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 10L, (short) 10, '4', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray9, (double) 100);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3677");
        double[] doubleArray5 = new double[] { 1, (byte) -1, 1.0f, 0, (short) 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, 100.0d);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3678");
        double[] doubleArray5 = new double[] { 1.0f, 10.0d, 10L, 1.0f, '4' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { '4', (-1L), (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray10, (double) 0L);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3679");
        double[] doubleArray2 = new double[] { 0.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (-1.0d));
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3680");
        double[] doubleArray5 = new double[] { (-1L), ' ', 10, (-1.0f), '#' };
        double[] doubleArray8 = new double[] { (short) 100, 100.0d };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray9, (double) '4');
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3681");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, 1.0d);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3682");
        double[] doubleArray4 = new double[] { 1, (byte) 0, 0.0d, 0L };
        double[] doubleArray9 = new double[] { 'a', (short) 1, 1L, 10 };
        double[] doubleArray16 = new double[] { (short) 100, (byte) 1, '4', (short) 1, (short) 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray16, (double) '4');
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3683");
        double[] doubleArray5 = new double[] { (short) 1, 'a', (short) 100, (byte) -1, (byte) -1 };
        double[] doubleArray8 = new double[] { 'a', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) 0L);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3684");
        double[] doubleArray4 = new double[] { 1, 100.0f, 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3685");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, '#' };
        double[] doubleArray9 = new double[] { (byte) 0, 100, (short) 100, (byte) -1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3686");
        double[] doubleArray3 = new double[] { 100, 10L, (byte) 0 };
        double[] doubleArray9 = new double[] { 0.0d, 100.0f, (byte) -1, (-1L), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray3, (double) (byte) -1);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3687");
        double[] doubleArray3 = new double[] { (byte) 100, 100L, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 'a');
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3688");
        double[] doubleArray3 = new double[] { (byte) -1, (byte) 10, 10L };
        double[] doubleArray6 = new double[] { (byte) 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 1);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3689");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray6 = new double[] { (-1.0f), (-1.0d), 10.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) 1);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3690");
        double[] doubleArray5 = new double[] { 0.0d, 'a', (short) 0, (byte) 10, 10 };
        double[] doubleArray12 = new double[] { (-1), 1.0d, (short) 10, 1.0f, ' ', ' ' };
        double[] doubleArray14 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray14, (double) 100L);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3691");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (short) 0, 'a' };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray4, (double) ' ');
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3692");
        double[] doubleArray6 = new double[] { ' ', 1.0d, '#', 100.0d, 1L, '4' };
        double[] doubleArray10 = new double[] { 'a', 10.0d, 100.0d };
        double[] doubleArray13 = new double[] { 10L, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray13, (double) 'a');
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3693");
        double[] doubleArray4 = new double[] { 1, (byte) 1, (short) 100, (-1L) };
        double[] doubleArray10 = new double[] { 1L, (short) 10, 10L, (short) 1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray4, (double) 10);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3694");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 0, 'a', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3695");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray3, (double) 0L);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3696");
        double[] doubleArray2 = new double[] { 100, 0.0f };
        double[] doubleArray9 = new double[] { 0, (-1L), 10.0f, (byte) 0, 1L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, 10.0d);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3697");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray0, (double) (-1L));
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3698");
        double[] doubleArray6 = new double[] { '4', (byte) 100, 10, 0, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3699");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray3 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) ' ');
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3700");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 1, '#', ' ', (short) 1, 0L };
        double[] doubleArray11 = new double[] { 1L, 10.0f, 10L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, (-1.0d));
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3701");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray5 = new double[] { (byte) 100, 10.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3702");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray5 = new double[] { (short) 1, 100L, '#' };
        double[] doubleArray6 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray6, (double) 10L);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3703");
        double[] doubleArray6 = new double[] { 1L, 0L, (byte) 100, (byte) 0, (byte) 0, 1.0d };
        double[] doubleArray12 = new double[] { '4', 10, 'a', 1.0f, 10 };
        double[] doubleArray17 = new double[] { 10.0f, (short) -1, 10L, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray17, (double) 1.0f);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3704");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray6 = new double[] { 1.0d, 10.0d, 100, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3705");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray8 = new double[] { 1, 1.0f, 100.0d, (short) 10, (byte) -1, 1 };
        double[] doubleArray11 = new double[] { (short) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray11, 0.0d);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3706");
        double[] doubleArray3 = new double[] { (-1), (-1), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3707");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray6 = new double[] { 0L, (short) 1, 100L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) '4');
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3708");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { 1L, (byte) 0, ' ', (short) 0, 10.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) (byte) 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3709");
        double[] doubleArray6 = new double[] { 100.0d, (-1), (-1.0f), 1.0f, (-1.0d), (short) 10 };
        double[] doubleArray8 = new double[] { (byte) 10 };
        double[] doubleArray11 = new double[] { 10.0f, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, (double) 1);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3710");
        double[] doubleArray6 = new double[] { 100.0d, 100.0d, (short) -1, 1L, (byte) 10, '#' };
        double[] doubleArray11 = new double[] { (-1.0d), (byte) 1, 'a', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) 10);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3711");
        double[] doubleArray4 = new double[] { 10, 1.0f, 10, '#' };
        double[] doubleArray8 = new double[] { (short) 10, 10L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 0L);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3712");
        double[] doubleArray5 = new double[] { (short) -1, 'a', (byte) 0, (short) 1, 1 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3713");
        double[] doubleArray2 = new double[] { (-1), (byte) 100 };
        double[] doubleArray8 = new double[] { ' ', (-1), '4', 0.0f, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, 0.0d);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3714");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 10, (byte) -1, 1, (short) 0, (byte) 10 };
        double[] doubleArray10 = new double[] { 1.0f, '4', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3715");
        double[] doubleArray2 = new double[] { ' ', 10.0f };
        double[] doubleArray6 = new double[] { 0, (byte) 0, 10 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3716");
        double[] doubleArray3 = new double[] { '#', (short) -1, (-1.0f) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, 0.0d);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3717");
        double[] doubleArray3 = new double[] { 100.0f, 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 100L);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3718");
        double[] doubleArray4 = new double[] { ' ', (-1.0f), 0, (byte) 0 };
        double[] doubleArray9 = new double[] { 100.0f, 10L, 1.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 0L);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3719");
        double[] doubleArray5 = new double[] { 10.0f, 10.0d, 1, (-1), '4' };
        double[] doubleArray7 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) 1);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3720");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { 10.0f, 0.0f, (byte) 0, 100.0f, 100L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) 100.0f);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3721");
        double[] doubleArray3 = new double[] { (byte) 0, 1.0f, 0 };
        double[] doubleArray5 = new double[] { (byte) 0 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray6, (double) 100L);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3722");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray6 = new double[] { (-1), 10L, 1L, 0.0f };
        double[] doubleArray12 = new double[] { 100, (short) 1, 0L, (-1), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3723");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) 10L);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3724");
        double[] doubleArray6 = new double[] { (short) 1, 0, (short) 1, (byte) 1, 0, 0.0d };
        double[] doubleArray8 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray8, (double) 100L);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3725");
        double[] doubleArray4 = new double[] { (byte) 100, 10.0d, ' ', 0.0d };
        double[] doubleArray11 = new double[] { '#', (-1.0f), (short) 100, 100.0d, (-1), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) '4');
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3726");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, (double) 10);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3727");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray5 = new double[] { 10L, (-1.0d), (short) 10 };
        double[] doubleArray9 = new double[] { 10.0f, 0.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3728");
        double[] doubleArray6 = new double[] { (byte) 1, 0.0f, (byte) -1, (-1L), 0.0d, ' ' };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 1, 10L, (short) 0, (short) 1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, (double) 0);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3729");
        double[] doubleArray3 = new double[] { (byte) -1, (short) -1, 1 };
        double[] doubleArray10 = new double[] { (byte) 100, (byte) 1, ' ', 1, (-1.0f), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3730");
        double[] doubleArray3 = new double[] { 100, 1, (short) -1 };
        double[] doubleArray10 = new double[] { 1.0d, 1L, (-1), (-1), (byte) 0, (-1) };
        double[] doubleArray15 = new double[] { 10, 10.0d, (-1.0d), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray15, (double) 10);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3731");
        double[] doubleArray5 = new double[] { 100.0f, 0L, (-1.0d), ' ', 0L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (double) 1);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3732");
        double[] doubleArray6 = new double[] { (byte) -1, 10.0d, 'a', 1.0f, (short) -1, 0L };
        double[] doubleArray11 = new double[] { (byte) 10, 1.0f, (byte) 10, (byte) -1 };
        double[] doubleArray12 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3733");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0f), (byte) 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) (short) 100);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3734");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1L, (short) 1, 10.0d, (-1.0d), 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 10L);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3735");
        double[] doubleArray5 = new double[] { (short) -1, 0.0d, 10.0d, 100L, 1L };
        double[] doubleArray9 = new double[] { (-1), (short) 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3736");
        double[] doubleArray4 = new double[] { (byte) 100, (-1), (byte) 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 100L);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3737");
        double[] doubleArray3 = new double[] { (-1.0d), 0.0d, (byte) 0 };
        double[] doubleArray10 = new double[] { 'a', (short) 1, (byte) -1, ' ', (-1L), (short) 0 };
        double[] doubleArray14 = new double[] { 1, 0.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray14, (double) '#');
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3738");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 0, 0L, '4', (byte) 1, (-1L), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) (byte) -1);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3739");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1, 100, (byte) 0 };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3740");
        double[] doubleArray5 = new double[] { (-1.0d), 0, (-1.0f), 100.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1L);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3741");
        double[] doubleArray2 = new double[] { (byte) 1, (byte) 100 };
        double[] doubleArray6 = new double[] { (byte) 10, (short) 10, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray2, 0.0d);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3742");
        double[] doubleArray6 = new double[] { 1L, 100L, 0L, (byte) 100, 100L, 10.0f };
        double[] doubleArray9 = new double[] { (short) 1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3743");
        double[] doubleArray5 = new double[] { 1.0f, 1L, '4', 10, 100 };
        double[] doubleArray12 = new double[] { 100.0d, 'a', (byte) -1, (byte) 10, 10, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) 1);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3744");
        double[] doubleArray3 = new double[] { 0, (short) 100, (short) 100 };
        double[] doubleArray10 = new double[] { 100, 10L, 1, (short) 0, ' ', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 0.0d);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3745");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0d), 0, 10, (short) 100, 100, (byte) 100 };
        double[] doubleArray13 = new double[] { 1.0f, 0.0d, (byte) 10, 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray13, (double) 10);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3746");
        double[] doubleArray5 = new double[] { 0.0d, '4', (byte) 0, 100L, 100.0d };
        double[] doubleArray11 = new double[] { 100.0d, (short) 100, '4', 0, '#' };
        double[] doubleArray13 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray13, 0.0d);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3747");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100, (byte) 1, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3748");
        double[] doubleArray4 = new double[] { 0, 100.0f, (short) -1, (-1.0f) };
        double[] doubleArray7 = new double[] { 1, 100L };
        double[] doubleArray13 = new double[] { (-1.0d), (short) 0, (short) -1, 10L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray13, (double) 'a');
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3749");
        double[] doubleArray4 = new double[] { (short) 0, (short) 100, (short) 0, (short) -1 };
        double[] doubleArray7 = new double[] { (-1.0d), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3750");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray3 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3751");
        double[] doubleArray1 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 100L);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3752");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 10.0d, '#', (byte) 10, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3753");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 0, 0.0f, (short) 0 };
        double[] doubleArray7 = new double[] { (byte) 0, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) ' ');
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3754");
        double[] doubleArray5 = new double[] { 10, ' ', 100.0f, 0.0f, (byte) 0 };
        double[] doubleArray8 = new double[] { (short) 100, 10L };
        double[] doubleArray14 = new double[] { 1.0f, '4', 0L, (byte) 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray14, (double) (short) 1);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3755");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 1, 0.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) 10L);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3756");
        double[] doubleArray3 = new double[] { (short) -1, (byte) 10, (byte) 1 };
        double[] doubleArray10 = new double[] { 10, 100.0f, ' ', 1.0d, (byte) 1, 0.0f };
        double[] doubleArray12 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3757");
        double[] doubleArray4 = new double[] { '#', (short) 0, (-1.0d), (byte) 0 };
        double[] doubleArray11 = new double[] { '4', 10, (byte) 0, (-1.0f), (byte) 1, 10.0d };
        double[] doubleArray13 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray13, (double) 0);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3758");
        double[] doubleArray5 = new double[] { (byte) -1, 10.0f, 1L, 1.0f, (byte) 0 };
        double[] doubleArray8 = new double[] { 100.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, 100.0d);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3759");
        double[] doubleArray5 = new double[] { 10, 10.0f, (short) 10, 100.0d, '#' };
        double[] doubleArray10 = new double[] { 1L, 100L, 0L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, 0.0d);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3760");
        double[] doubleArray4 = new double[] { (short) 1, 0.0f, 0.0f, 'a' };
        double[] doubleArray7 = new double[] { (-1.0f), (short) 0 };
        double[] doubleArray8 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray8, (double) 100.0f);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3761");
        double[] doubleArray4 = new double[] { 10.0d, 10.0d, (-1.0f), 1.0d };
        double[] doubleArray6 = new double[] { 100.0d };
        double[] doubleArray12 = new double[] { 100, 100L, 100.0d, 1.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray12, (-1.0d));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3762");
        double[] doubleArray4 = new double[] { 100, (short) 1, 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '4');
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3763");
        double[] doubleArray2 = new double[] { 0L, (short) 10 };
        double[] doubleArray4 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3764");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1.0d), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray3, (double) 100);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3765");
        double[] doubleArray5 = new double[] { 10.0d, 10.0d, (byte) -1, 0.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3766");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray1, 0.0d);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3767");
        double[] doubleArray3 = new double[] { 0.0f, (-1.0f), (byte) -1 };
        double[] doubleArray5 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, 1.0d);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3768");
        double[] doubleArray6 = new double[] { 0, (byte) 0, (short) 1, 0L, (short) 100, 10 };
        double[] doubleArray10 = new double[] { (-1.0f), 1.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) (short) -1);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3769");
        double[] doubleArray2 = new double[] { 0, 1.0d };
        double[] doubleArray6 = new double[] { (byte) 0, (short) 100, '#' };
        double[] doubleArray9 = new double[] { (byte) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, (double) 1L);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3770");
        double[] doubleArray5 = new double[] { (-1L), (byte) 1, (short) 0, (-1.0d), 10.0d };
        double[] doubleArray10 = new double[] { 1L, (byte) 10, 100L, '4' };
        double[] doubleArray16 = new double[] { (short) -1, 10L, (byte) 0, 1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray16, (double) 'a');
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3771");
        double[] doubleArray5 = new double[] { (short) -1, 'a', 100.0d, 0.0f, '#' };
        double[] doubleArray11 = new double[] { '#', (-1.0d), 1, 10.0f, 10.0f };
        double[] doubleArray14 = new double[] { 10L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray14, (double) (-1.0f));
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3772");
        double[] doubleArray3 = new double[] { (-1L), '#', 10.0f };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray5, (double) 1L);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3773");
        double[] doubleArray6 = new double[] { 0.0f, 0, 10L, (short) 0, (short) 100, 100L };
        double[] doubleArray8 = new double[] { (byte) -1 };
        double[] doubleArray15 = new double[] { ' ', 0L, (-1.0f), (byte) 100, 100L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray15, (double) 0.0f);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3774");
        double[] doubleArray5 = new double[] { 0.0d, 10L, 1L, (short) 100, 0.0f };
        double[] doubleArray11 = new double[] { 100.0d, 10.0f, 1L, 1, (short) 1 };
        double[] doubleArray15 = new double[] { (short) 0, '#', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, (double) 1L);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3775");
        double[] doubleArray5 = new double[] { (short) 0, (short) 10, (short) 0, (short) 100, (byte) 100 };
        double[] doubleArray11 = new double[] { 1.0f, (short) -1, 0, 1.0d, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) 0.0f);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3776");
        double[] doubleArray3 = new double[] { 'a', 1.0f, 100L };
        double[] doubleArray8 = new double[] { (byte) 1, (-1), 0L, 10 };
        double[] doubleArray11 = new double[] { '4', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray11, (double) (byte) 100);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3777");
        double[] doubleArray5 = new double[] { '#', 100, (-1L), 10.0d, 10 };
        double[] doubleArray10 = new double[] { 100, 100.0f, 1, 1 };
        double[] doubleArray16 = new double[] { '#', 0.0d, 10, 100L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray16, (double) (byte) 1);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3778");
        double[] doubleArray3 = new double[] { (byte) 10, (-1.0f), '4' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray8 = new double[] { 100L, (-1.0d), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3779");
        double[] doubleArray4 = new double[] { (short) 1, 1.0d, 1, (byte) -1 };
        double[] doubleArray6 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3780");
        double[] doubleArray3 = new double[] { ' ', (-1L), (short) 10 };
        double[] doubleArray5 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray5, 0.0d);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3781");
        double[] doubleArray5 = new double[] { 1, (byte) 0, (byte) 10, 100L, (byte) -1 };
        double[] doubleArray11 = new double[] { ' ', 1.0f, (-1.0d), 100, 1 };
        double[] doubleArray16 = new double[] { 10.0f, 10L, ' ', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray16, (double) (-1));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3782");
        double[] doubleArray3 = new double[] { (-1), 0.0f, '#' };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) 1.0f);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3783");
        double[] doubleArray4 = new double[] { 100L, 0L, (byte) 100, (byte) 1 };
        double[] doubleArray11 = new double[] { 0, 100.0d, 1L, 10.0d, (-1.0f), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) 10L);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3784");
        double[] doubleArray3 = new double[] { (byte) 1, (short) 10, 1.0f };
        double[] doubleArray6 = new double[] { (-1L), 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (double) 0);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3785");
        double[] doubleArray4 = new double[] { (-1.0f), 100, '4', (byte) 100 };
        double[] doubleArray9 = new double[] { ' ', ' ', (short) 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, (double) 1);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3786");
        double[] doubleArray3 = new double[] { 0.0f, 100.0d, (byte) 1 };
        double[] doubleArray10 = new double[] { 1L, 0.0f, (short) -1, '#', 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) 100L);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3787");
        double[] doubleArray2 = new double[] { 10, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3788");
        double[] doubleArray6 = new double[] { (byte) 1, 100L, (short) 0, ' ', (byte) 100, 0.0d };
        double[] doubleArray8 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3789");
        double[] doubleArray5 = new double[] { 0.0f, (short) 0, '#', 0.0d, 'a' };
        double[] doubleArray8 = new double[] { 100.0f, 0 };
        double[] doubleArray10 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, 100.0d);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3790");
        double[] doubleArray6 = new double[] { 1L, (short) 0, 10.0d, (byte) 100, (-1.0f), 0L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3791");
        double[] doubleArray5 = new double[] { 1L, 1.0d, (short) 1, 'a', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3792");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '4', (-1), 1.0f, '#' };
        double[] doubleArray9 = new double[] { 0, 100.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray9, (double) 10L);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3793");
        double[] doubleArray5 = new double[] { 1L, 0, (-1.0d), 1.0f, (-1L) };
        double[] doubleArray9 = new double[] { ' ', 0.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3794");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100L, 1, 10.0f, '#', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3795");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0, 1.0d, 0.0f, (short) 0, (short) 100, (-1L) };
        double[] doubleArray9 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray9, (double) '4');
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3796");
        double[] doubleArray2 = new double[] { 'a', (byte) -1 };
        double[] doubleArray7 = new double[] { '#', 100, (short) 10, 0 };
        double[] doubleArray12 = new double[] { 10L, (byte) 10, (-1), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray12, (double) 1.0f);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3797");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray4 = new double[] { 1L, 10.0f };
        double[] doubleArray7 = new double[] { 0.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3798");
        double[] doubleArray4 = new double[] { 10.0d, 100.0f, 'a', (short) 0 };
        double[] doubleArray6 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3799");
        double[] doubleArray2 = new double[] { 100, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3800");
        double[] doubleArray5 = new double[] { '#', 100L, 1.0f, 10.0d, (short) 0 };
        double[] doubleArray8 = new double[] { (short) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) '#');
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3801");
        double[] doubleArray6 = new double[] { (byte) 0, (short) -1, 100L, (byte) 100, 1.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 1L);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3802");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray3 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) 100L);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3803");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray4 = new double[] { '4', (byte) 100 };
        double[] doubleArray9 = new double[] { 100.0f, 100L, 0.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray9, (double) 10L);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3804");
        double[] doubleArray6 = new double[] { 100.0f, 1, (short) 100, (byte) 0, '#', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3805");
        double[] doubleArray4 = new double[] { 'a', 1, ' ', 10.0f };
        double[] doubleArray9 = new double[] { 100, 1.0f, (byte) -1, 100 };
        double[] doubleArray13 = new double[] { 0.0f, 10.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray13, (double) 100);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3806");
        double[] doubleArray6 = new double[] { 10, 0L, 0L, (short) 100, '4', (-1.0d) };
        double[] doubleArray12 = new double[] { 100L, 0L, 100L, (short) 10, (byte) 100 };
        double[] doubleArray15 = new double[] { (-1.0d), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray15, (double) (-1.0f));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3807");
        double[] doubleArray6 = new double[] { 0.0d, '#', 100.0f, (byte) 1, 1, (short) 100 };
        double[] doubleArray9 = new double[] { (short) 10, 10 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, 10.0d);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3808");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 0, (byte) 0, '4' };
        double[] doubleArray10 = new double[] { 1.0f, 100.0d, (-1L), (short) 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3809");
        double[] doubleArray5 = new double[] { (byte) 10, (byte) 100, (short) 10, 10, (short) -1 };
        double[] doubleArray8 = new double[] { 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray5, (double) 'a');
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3810");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 100, 0, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) 100.0f);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3811");
        double[] doubleArray3 = new double[] { (byte) 10, (byte) 0, 10L };
        double[] doubleArray7 = new double[] { (short) 1, 100.0d, 0L };
        double[] doubleArray11 = new double[] { ' ', 10.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray11, (double) 100);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3812");
        double[] doubleArray5 = new double[] { (short) 100, (byte) 100, (short) -1, (short) 10, '4' };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (-1.0d));
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3813");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray4 = new double[] { 10.0d, 10L };
        double[] doubleArray8 = new double[] { 100L, 1.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, 0.0d);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3814");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0f, 0L };
        double[] doubleArray5 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (-1.0d));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3815");
        double[] doubleArray3 = new double[] { (short) -1, 10L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) -1);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3816");
        double[] doubleArray3 = new double[] { (short) 0, (short) 1, (short) 100 };
        double[] doubleArray5 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3817");
        double[] doubleArray6 = new double[] { '#', (-1.0f), (-1.0f), (short) 100, (-1), 1.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) 0);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3818");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray4 = new double[] { (-1), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) 0.0f);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3819");
        double[] doubleArray3 = new double[] { 1L, (short) 100, (short) 100 };
        double[] doubleArray9 = new double[] { '4', 10.0d, (-1.0d), 'a', '4' };
        double[] doubleArray13 = new double[] { '#', (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) 10L);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3820");
        double[] doubleArray5 = new double[] { 100, (-1L), 10.0d, 1L, ' ' };
        double[] doubleArray10 = new double[] { (-1L), 10.0d, (byte) 1, 0 };
        double[] doubleArray13 = new double[] { 0.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3821");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray6 = new double[] { 1.0f, 100.0f, (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 1L);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3822");
        double[] doubleArray3 = new double[] { ' ', 'a', 100.0f };
        double[] doubleArray7 = new double[] { 100L, 10L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 1L);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3823");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100L, ' ', 10.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, (double) '#');
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3824");
        double[] doubleArray4 = new double[] { (byte) 100, 100.0f, (short) 1, (-1.0f) };
        double[] doubleArray7 = new double[] { 1.0f, (byte) 100 };
        double[] doubleArray14 = new double[] { (-1.0f), ' ', 10.0d, 0, 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray14, 10.0d);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3825");
        double[] doubleArray3 = new double[] { (-1), 'a', (short) -1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) 0.0f);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3826");
        double[] doubleArray3 = new double[] { 100.0d, (short) 0, 1L };
        double[] doubleArray6 = new double[] { 0.0f, 1L };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3827");
        double[] doubleArray5 = new double[] { 10.0f, 10L, 0, 1L, (byte) 0 };
        double[] doubleArray7 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3828");
        double[] doubleArray6 = new double[] { 0, 100.0d, (-1.0f), (-1L), 1L, 10L };
        double[] doubleArray9 = new double[] { 0.0d, 0 };
        double[] doubleArray13 = new double[] { (-1.0d), 100L, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3829");
        double[] doubleArray2 = new double[] { 10L, (-1.0d) };
        double[] doubleArray8 = new double[] { (short) 10, (byte) -1, (-1), 1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, (double) '#');
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3830");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray3 = new double[] { (-1.0d) };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray4, (-1.0d));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3831");
        double[] doubleArray6 = new double[] { 10, 0.0f, 10.0f, 1L, 100.0d, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3832");
        double[] doubleArray5 = new double[] { (short) 1, (short) 10, 1L, (byte) 0, (short) 0 };
        double[] doubleArray10 = new double[] { (-1.0d), (byte) 10, (short) 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 100L);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3833");
        double[] doubleArray3 = new double[] { '4', 100L, 100.0d };
        double[] doubleArray10 = new double[] { (short) 100, 'a', (-1L), 0.0d, 1.0d, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray3, (double) 10);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3834");
        double[] doubleArray6 = new double[] { 1.0d, (byte) 0, 1.0d, 1.0d, 0.0d, 0.0d };
        double[] doubleArray11 = new double[] { 10.0d, (-1L), 10, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 0L);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3835");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100.0d, 100.0f, 10, 0.0f };
        double[] doubleArray7 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (double) 10L);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3836");
        double[] doubleArray6 = new double[] { 100L, 10, 1.0d, 100L, (byte) -1, 100.0f };
        double[] doubleArray10 = new double[] { 10, (byte) 10, (-1) };
        double[] doubleArray14 = new double[] { (short) 100, 0L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray14, 1.0d);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3837");
        double[] doubleArray5 = new double[] { (byte) 1, (-1.0d), (byte) 0, (byte) 0, 0 };
        double[] doubleArray9 = new double[] { (byte) 0, 'a', 100L };
        double[] doubleArray16 = new double[] { (byte) 1, (-1), (short) 0, (byte) 0, (-1.0f), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray16, (double) (byte) 100);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3838");
        double[] doubleArray4 = new double[] { 0L, ' ', (byte) 1, 0.0f };
        double[] doubleArray11 = new double[] { 10, 10L, 1.0f, (byte) 10, (short) -1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3839");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (short) 100);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3840");
        double[] doubleArray2 = new double[] { 0, 0.0f };
        double[] doubleArray8 = new double[] { 1.0d, (-1.0d), 1.0d, '#', (byte) -1 };
        double[] doubleArray14 = new double[] { ' ', (byte) -1, 100.0f, 100.0f, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, 0.0d);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3841");
        double[] doubleArray5 = new double[] { 100.0d, 100.0d, (byte) 10, (byte) 100, 0.0f };
        double[] doubleArray8 = new double[] { 1L, (byte) 0 };
        double[] doubleArray15 = new double[] { 10L, (short) 1, 0.0d, (-1.0f), (short) 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray15, (double) (short) -1);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3842");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) '#');
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3843");
        double[] doubleArray5 = new double[] { (short) 0, 1.0f, 0.0f, (short) -1, 10.0d };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (double) (byte) 10);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3844");
        double[] doubleArray3 = new double[] { 100.0d, 10, (byte) 1 };
        double[] doubleArray8 = new double[] { 1L, (byte) 10, 10.0f, (byte) 100 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) 1L);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3845");
        double[] doubleArray4 = new double[] { (byte) 100, (short) 0, 10.0f, 10.0d };
        double[] doubleArray6 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) 1);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3846");
        double[] doubleArray6 = new double[] { 100.0f, 10, (byte) 100, (short) 1, 10L, 0.0d };
        double[] doubleArray9 = new double[] { 1.0f, (byte) -1 };
        double[] doubleArray14 = new double[] { (short) 10, '#', (-1.0d), (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray14, (double) (-1));
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3847");
        double[] doubleArray5 = new double[] { (byte) 10, 1, '4', 1, 0.0f };
        double[] doubleArray12 = new double[] { 1.0d, (short) 0, 100.0d, 10.0d, 0L, 1.0d };
        double[] doubleArray16 = new double[] { (byte) 0, (byte) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) 100.0f);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3848");
        double[] doubleArray3 = new double[] { ' ', 1.0f, 10L };
        double[] doubleArray6 = new double[] { 100.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, 1.0d);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3849");
        double[] doubleArray6 = new double[] { 1, 0.0d, (short) 1, 0.0f, (-1L), (-1.0d) };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0d, (short) 10, 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) (byte) 100);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3850");
        double[] doubleArray4 = new double[] { (-1.0f), (-1.0d), 1.0d, 100 };
        double[] doubleArray7 = new double[] { (short) 100, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) '#');
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3851");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray8 = new double[] { 10L, (-1.0d), (byte) 10, 0.0f, 1.0d, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, 100.0d);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3852");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (byte) 10, 10.0f, 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3853");
        double[] doubleArray2 = new double[] { (short) 10, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 1);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3854");
        double[] doubleArray6 = new double[] { (short) 10, (-1.0f), '4', 1, 0, (short) 100 };
        double[] doubleArray10 = new double[] { (short) 10, '#', (short) 100 };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray11, (double) ' ');
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3855");
        double[] doubleArray5 = new double[] { (byte) -1, 10.0d, 10.0f, (-1.0d), (short) 10 };
        double[] doubleArray11 = new double[] { 10, (short) 10, (short) 1, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, 1.0d);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3856");
        double[] doubleArray5 = new double[] { 100.0f, (short) 10, (-1.0f), 100.0f, 1L };
        double[] doubleArray12 = new double[] { (byte) 10, 100.0f, '#', 0.0f, 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3857");
        double[] doubleArray4 = new double[] { 0.0f, (-1L), (short) 10, 0.0f };
        double[] doubleArray11 = new double[] { 1, (short) 0, (byte) 10, 'a', 'a', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) 0L);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3858");
        double[] doubleArray3 = new double[] { '#', (short) 1, 0.0f };
        double[] doubleArray7 = new double[] { 10.0f, 0, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3859");
        double[] doubleArray3 = new double[] { 1.0d, 10, (-1L) };
        double[] doubleArray10 = new double[] { '4', 10.0d, 10, 0L, ' ', 10.0f };
        double[] doubleArray16 = new double[] { 0.0f, 10L, (-1.0f), (-1), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray16, (double) 100L);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3860");
        double[] doubleArray6 = new double[] { (byte) 100, 100.0d, (byte) 100, 10L, 0L, 0.0f };
        double[] doubleArray12 = new double[] { (byte) 10, (short) 1, 0.0d, ' ', 10 };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, 0.0d);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3861");
        double[] doubleArray3 = new double[] { (short) 0, (-1), 1.0d };
        double[] doubleArray7 = new double[] { '4', (-1L), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3862");
        double[] doubleArray6 = new double[] { 0.0f, (short) 100, (short) -1, (byte) -1, (byte) -1, '4' };
        double[] doubleArray11 = new double[] { '#', (short) -1, (byte) 1, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) (byte) 10);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3863");
        double[] doubleArray6 = new double[] { (short) 100, (short) 10, 100L, 'a', (short) -1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 10);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3864");
        double[] doubleArray3 = new double[] { (-1.0d), 100.0f, 0.0f };
        double[] doubleArray7 = new double[] { (byte) -1, 0.0f, (-1.0f) };
        double[] doubleArray10 = new double[] { 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray10, (double) (short) 0);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3865");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { 100, 0L, 100.0d, (byte) 1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) 0L);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3866");
        double[] doubleArray2 = new double[] { '4', 100L };
        double[] doubleArray6 = new double[] { '#', (short) 10, 100.0d };
        double[] doubleArray9 = new double[] { 100L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3867");
        double[] doubleArray6 = new double[] { 'a', 10, (-1L), 10.0d, (-1.0f), 1.0d };
        double[] doubleArray11 = new double[] { (short) 0, 100, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, 1.0d);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3868");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (short) -1);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3869");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 'a', (byte) 0, (short) 10, '4' };
        double[] doubleArray9 = new double[] { (byte) 100, (short) 1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3870");
        double[] doubleArray4 = new double[] { 1.0f, 'a', (byte) 1, (byte) 10 };
        double[] doubleArray8 = new double[] { (byte) 1, 100.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 'a');
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3871");
        double[] doubleArray6 = new double[] { (short) 0, 0, (-1.0d), 10.0f, 0, 0L };
        double[] doubleArray11 = new double[] { (byte) -1, 0, ' ', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) 0);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3872");
        double[] doubleArray5 = new double[] { (byte) 10, 0, 100.0f, 1, 100.0f };
        double[] doubleArray10 = new double[] { (short) 0, (byte) 100, (byte) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3873");
        double[] doubleArray5 = new double[] { 100.0f, (byte) 100, 100.0d, (short) 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 1);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3874");
        double[] doubleArray5 = new double[] { 100.0f, 10, 100.0f, '#', 1.0d };
        double[] doubleArray12 = new double[] { 100L, '#', 10, 0.0d, 0.0f, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, 0.0d);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3875");
        double[] doubleArray6 = new double[] { (byte) -1, (-1L), 100, (short) 10, 0.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3876");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { (short) 0, (short) 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3877");
        double[] doubleArray4 = new double[] { (-1.0f), ' ', (-1L), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (-1L));
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3878");
        double[] doubleArray4 = new double[] { 0, '#', 1, (byte) -1 };
        double[] doubleArray10 = new double[] { (-1.0f), 1.0f, (byte) -1, 10.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray10, (double) 0.0f);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3879");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray6 = new double[] { 1L, 10.0d, 0.0d, (byte) 0 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3880");
        double[] doubleArray5 = new double[] { 0L, (byte) -1, 100L, (-1), 100L };
        double[] doubleArray9 = new double[] { (byte) -1, (byte) 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) 10);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3881");
        double[] doubleArray4 = new double[] { ' ', (byte) 1, (short) -1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10L);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3882");
        double[] doubleArray1 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) -1);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3883");
        double[] doubleArray2 = new double[] { (short) 0, 0.0d };
        double[] doubleArray9 = new double[] { (byte) 10, 1.0d, 10.0f, 0.0f, 10.0f, (short) 1 };
        double[] doubleArray15 = new double[] { (short) 1, (byte) 10, 100L, 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray15, (double) 0);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3884");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray3 = new double[] { 1L };
        double[] doubleArray9 = new double[] { '4', '#', 1L, (byte) -1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3885");
        double[] doubleArray4 = new double[] { (short) 1, 10L, 1.0d, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 1.0f);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3886");
        double[] doubleArray5 = new double[] { (-1), (byte) 0, '4', (-1), (short) 10 };
        double[] doubleArray9 = new double[] { (byte) 0, 10L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) 10);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3887");
        double[] doubleArray5 = new double[] { (short) -1, 0, 0, (byte) 10, (-1L) };
        double[] doubleArray9 = new double[] { 1L, 100.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3888");
        double[] doubleArray5 = new double[] { (-1L), 1, 0, 0L, (short) 1 };
        double[] doubleArray8 = new double[] { 1.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3889");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10L, 1.0d, (short) 1, 0.0f, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (-1.0d));
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3890");
        double[] doubleArray5 = new double[] { 1, 100.0d, 100, (byte) 1, 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3891");
        double[] doubleArray4 = new double[] { 100, 0.0d, (short) 1, (-1.0f) };
        double[] doubleArray7 = new double[] { ' ', 10.0d };
        double[] doubleArray14 = new double[] { 100.0f, 10.0f, (byte) 1, (byte) 1, (byte) -1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray14, 1.0d);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3892");
        double[] doubleArray6 = new double[] { (-1.0f), 100.0d, (-1.0d), 1.0d, (-1.0f), 10L };
        double[] doubleArray8 = new double[] { (byte) 0 };
        double[] doubleArray11 = new double[] { 0, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, 100.0d);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3893");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray4 = new double[] { 0, (byte) 100 };
        double[] doubleArray6 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray6, 1.0d);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3894");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray7 = new double[] { 0.0d, (short) 10, 1.0f, 'a', 10.0d };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray8, 10.0d);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3895");
        double[] doubleArray3 = new double[] { ' ', 1L, 10L };
        double[] doubleArray8 = new double[] { 10.0d, (-1.0d), (byte) 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (byte) 10);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3896");
        double[] doubleArray4 = new double[] { (short) 0, 1.0d, 1, (byte) 1 };
        double[] doubleArray11 = new double[] { (-1.0d), 100L, 0.0d, 1L, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, 1.0d);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3897");
        double[] doubleArray3 = new double[] { (-1L), 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3898");
        double[] doubleArray5 = new double[] { (-1.0f), 100.0f, 0L, 100.0d, 100.0d };
        double[] doubleArray11 = new double[] { 100L, ' ', 0.0d, (-1), 0L };
        double[] doubleArray18 = new double[] { 10L, (-1.0d), '4', 0.0f, (byte) -1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray18, (double) '4');
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3899");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray3 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray1, 10.0d);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3900");
        double[] doubleArray4 = new double[] { 1, ' ', 0.0f, 1L };
        double[] doubleArray7 = new double[] { (short) 10, (-1.0d) };
        double[] doubleArray9 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray9, (double) 10);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3901");
        double[] doubleArray6 = new double[] { (byte) 0, (-1L), (-1.0d), 1.0d, (short) 10, 10L };
        double[] doubleArray9 = new double[] { (-1), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) 10);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3902");
        double[] doubleArray6 = new double[] { 0.0f, 0, 0.0d, 1.0d, (byte) 1, 100L };
        double[] doubleArray10 = new double[] { (-1L), (short) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3903");
        double[] doubleArray6 = new double[] { (-1), (short) 100, 'a', (short) 1, (-1.0d), 100L };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3904");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100, 0L, (-1.0f), (-1.0d), (short) 1 };
        double[] doubleArray8 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3905");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray3 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, (double) 10L);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3906");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 1, 100.0d, 1.0f };
        double[] doubleArray7 = new double[] { 1L, 0.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (byte) -1);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3907");
        double[] doubleArray5 = new double[] { 1.0f, 100, (short) 100, 100.0f, 100.0d };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) 0);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3908");
        double[] doubleArray2 = new double[] { (short) 1, 10.0f };
        double[] doubleArray9 = new double[] { 0, ' ', (short) 0, 100L, 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3909");
        double[] doubleArray6 = new double[] { (short) -1, '4', '4', 10.0d, '4', 10.0f };
        double[] doubleArray10 = new double[] { (short) 10, (short) 100, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 0);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3910");
        double[] doubleArray3 = new double[] { 100.0f, 10L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 100);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3911");
        double[] doubleArray3 = new double[] { 100L, (short) 100, 1 };
        double[] doubleArray9 = new double[] { 100, (short) 1, '#', (byte) -1, (-1) };
        double[] doubleArray11 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray11, (-1.0d));
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3912");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3913");
        double[] doubleArray2 = new double[] { '4', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 10.0d);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3914");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 100, 100, 1.0d, 100, (-1.0d), (-1.0d) };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3915");
        double[] doubleArray6 = new double[] { 100L, 100.0d, 1L, (short) 0, 'a', (byte) 10 };
        double[] doubleArray11 = new double[] { 0, 100L, 0L, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (short) 10);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3916");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray1, (double) 1L);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3917");
        double[] doubleArray4 = new double[] { 1.0f, (short) -1, '4', 'a' };
        double[] doubleArray8 = new double[] { '#', 0L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 0.0f);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3918");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1L, (-1.0f), (short) 0, 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (-1.0f));
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3919");
        double[] doubleArray2 = new double[] { 0.0d, 0.0f };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (double) '#');
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3920");
        double[] doubleArray6 = new double[] { (-1L), (short) 1, (-1L), 'a', (short) -1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3921");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray7 = new double[] { ' ', 'a', 0L, 0L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) 'a');
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3922");
        double[] doubleArray5 = new double[] { (-1L), 1, 0.0f, (byte) 10, (short) 1 };
        double[] doubleArray7 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (-1.0d));
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3923");
        double[] doubleArray2 = new double[] { 100, 100L };
        double[] doubleArray9 = new double[] { (byte) -1, (byte) 100, (short) -1, 10.0f, '4', (-1.0f) };
        double[] doubleArray11 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray11, 0.0d);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3924");
        double[] doubleArray3 = new double[] { 0, 10, (byte) -1 };
        double[] doubleArray7 = new double[] { 10, (byte) 100, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, 10.0d);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3925");
        double[] doubleArray2 = new double[] { (byte) 1, ' ' };
        double[] doubleArray5 = new double[] { (short) 10, (byte) 100 };
        double[] doubleArray9 = new double[] { 0L, (-1L), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3926");
        double[] doubleArray4 = new double[] { 'a', 10, (-1.0f), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3927");
        double[] doubleArray3 = new double[] { ' ', '#', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3928");
        double[] doubleArray6 = new double[] { 10.0f, (-1L), (-1), 0.0f, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 1.0d);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3929");
        double[] doubleArray4 = new double[] { (short) 10, 0.0d, (byte) -1, (-1L) };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) ' ');
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3930");
        double[] doubleArray3 = new double[] { 'a', 0L, 10 };
        double[] doubleArray6 = new double[] { (byte) 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (-1L));
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3931");
        double[] doubleArray5 = new double[] { (byte) 10, (short) 0, (short) 0, 0, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3932");
        double[] doubleArray3 = new double[] { (byte) -1, 1, (-1L) };
        double[] doubleArray6 = new double[] { 1.0f, (short) 100 };
        double[] doubleArray11 = new double[] { 0.0d, (short) 100, ' ', (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray11, (double) '#');
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3933");
        double[] doubleArray5 = new double[] { (short) 100, 1.0f, (-1), 100, (short) 1 };
        double[] doubleArray10 = new double[] { '#', (byte) 10, 100.0d, '#' };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray11, (double) '4');
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3934");
        double[] doubleArray5 = new double[] { 1L, 0.0d, (byte) 0, ' ', 10.0f };
        double[] doubleArray9 = new double[] { 100, (byte) 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) (byte) 1);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3935");
        double[] doubleArray5 = new double[] { (short) 1, (-1), 100L, (short) 10, 1.0f };
        double[] doubleArray11 = new double[] { (byte) 1, 100.0d, 1.0d, (-1), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray11, (double) '#');
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3936");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray5 = new double[] { 100.0d, '4', 1.0f };
        double[] doubleArray9 = new double[] { 100L, 1L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray9, (double) 100L);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3937");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray3 = new double[] { (short) 10 };
        double[] doubleArray8 = new double[] { 10, (-1.0d), 10L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray8, 0.0d);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3938");
        double[] doubleArray6 = new double[] { 0L, (-1.0d), (short) 0, 10.0d, 100L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.0d);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3939");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray8 = new double[] { 100.0f, (short) 10, (byte) -1, 0, 10.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) '4');
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3940");
        double[] doubleArray2 = new double[] { (short) -1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '4');
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3941");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray5 = new double[] { 1.0d, 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3942");
        double[] doubleArray4 = new double[] { 10L, 10.0d, (-1.0d), 1.0f };
        double[] doubleArray10 = new double[] { 10.0d, (short) 0, 1L, 100.0d, 100 };
        double[] doubleArray12 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray12, (double) (byte) 10);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3943");
        double[] doubleArray5 = new double[] { 1, (short) 1, 10.0d, (-1), 1L };
        double[] doubleArray12 = new double[] { (-1.0f), (-1L), (byte) 1, 0, (short) 1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, (double) (byte) -1);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3944");
        double[] doubleArray3 = new double[] { 100.0f, 10L, 0.0f };
        double[] doubleArray9 = new double[] { 1.0d, 100.0d, 10.0f, (-1.0d), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 100.0d);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3945");
        double[] doubleArray5 = new double[] { 10.0f, (-1.0d), 'a', (short) 10, (byte) 10 };
        double[] doubleArray7 = new double[] { (byte) 1 };
        double[] doubleArray14 = new double[] { ' ', (byte) 1, ' ', 100.0f, 100L, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray14, 1.0d);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3946");
        double[] doubleArray5 = new double[] { (byte) 1, 10L, 100L, 100.0d, ' ' };
        double[] doubleArray8 = new double[] { (byte) 10, (byte) 10 };
        double[] doubleArray11 = new double[] { 100.0d, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3947");
        double[] doubleArray5 = new double[] { (short) 10, 0, (byte) 10, 10.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) 1);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3948");
        double[] doubleArray6 = new double[] { 0.0d, ' ', (short) -1, (byte) 100, (short) 10, 10.0d };
        double[] doubleArray13 = new double[] { 1L, (-1.0f), 1.0d, 0, (-1L), 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, (double) (short) 1);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3949");
        double[] doubleArray6 = new double[] { '4', (short) 0, 10.0d, 0L, 10L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (-1.0d));
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3950");
        double[] doubleArray6 = new double[] { 10.0f, 10.0d, (-1.0f), 100.0f, 0.0f, (-1.0f) };
        double[] doubleArray12 = new double[] { 0L, (-1), 1.0d, (-1.0d), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, 1.0d);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3951");
        double[] doubleArray3 = new double[] { 100, (byte) -1, 100 };
        double[] doubleArray6 = new double[] { (byte) 100, 'a' };
        double[] doubleArray9 = new double[] { 100L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3952");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray8 = new double[] { (short) 1, 10.0d, (short) 1, (byte) 0, 0.0f, 100.0f };
        double[] doubleArray15 = new double[] { (-1.0d), 10.0f, ' ', (byte) 1, 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, 100.0d);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3953");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 100, 0, 'a' };
        double[] doubleArray10 = new double[] { 10.0d, 10.0f, (-1L), 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, 10.0d);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3954");
        double[] doubleArray5 = new double[] { 10.0d, 'a', 1.0d, 0, 'a' };
        double[] doubleArray10 = new double[] { (-1), (byte) -1, (-1.0d), (short) -1 };
        double[] doubleArray15 = new double[] { 10.0f, (-1.0f), 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, 0.0d);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3955");
        double[] doubleArray5 = new double[] { 100.0d, (short) 1, (byte) 100, 'a', (short) 10 };
        double[] doubleArray8 = new double[] { (-1.0d), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray5, (double) '4');
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3956");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray8 = new double[] { 1L, (byte) -1, (byte) 10, (-1.0f), (short) 100, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3957");
        double[] doubleArray6 = new double[] { (-1), 10L, (byte) 0, 1.0f, (-1L), 0.0f };
        double[] doubleArray11 = new double[] { (-1.0d), '#', 1.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (-1.0f));
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3958");
        double[] doubleArray4 = new double[] { 10L, (-1), 10.0f, 0.0d };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3959");
        double[] doubleArray5 = new double[] { 10.0f, 'a', 'a', 100.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1));
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3960");
        double[] doubleArray5 = new double[] { 1.0d, ' ', ' ', 10.0f, (short) 1 };
        double[] doubleArray9 = new double[] { (byte) 100, ' ', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 0.0f);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3961");
        double[] doubleArray3 = new double[] { 1L, 1, 'a' };
        double[] doubleArray6 = new double[] { 100.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) '#');
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3962");
        double[] doubleArray4 = new double[] { 0.0f, 0.0f, (short) 0, 100.0d };
        double[] doubleArray7 = new double[] { (-1.0d), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, 10.0d);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3963");
        double[] doubleArray4 = new double[] { (short) 1, 1, 10.0d, (-1.0f) };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) 100L);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3964");
        double[] doubleArray3 = new double[] { (byte) -1, (short) 0, (byte) -1 };
        double[] doubleArray7 = new double[] { (short) 1, (byte) 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3965");
        double[] doubleArray4 = new double[] { (byte) -1, 10, (short) 0, (byte) 10 };
        double[] doubleArray11 = new double[] { (short) 0, (short) -1, 10, 'a', 10.0f, (-1L) };
        double[] doubleArray18 = new double[] { (byte) -1, 0.0f, 0.0f, (short) -1, (-1.0d), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray18, 100.0d);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3966");
        double[] doubleArray1 = new double[] { 'a' };
        double[] doubleArray3 = new double[] { (short) 100 };
        double[] doubleArray10 = new double[] { 0, 0.0d, 100L, (-1), (-1L), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray10, (double) 1L);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3967");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { ' ', 1.0d, 1.0f };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) (short) 0);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3968");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 10, 0L, 1 };
        double[] doubleArray9 = new double[] { (short) -1, (byte) 100, 1.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3969");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3970");
        double[] doubleArray4 = new double[] { (byte) 100, (-1), (byte) 100, (byte) 10 };
        double[] doubleArray5 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 0L);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3971");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0d, (short) 0, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3972");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { (-1L), ' ', 0.0d, 0.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray7, 1.0d);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3973");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 10, (byte) 100, (byte) 1, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 1);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3974");
        double[] doubleArray2 = new double[] { (byte) 10, 10.0d };
        double[] doubleArray7 = new double[] { 10.0f, (byte) 1, 100.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) (short) 1);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3975");
        double[] doubleArray2 = new double[] { 'a', (-1L) };
        double[] doubleArray7 = new double[] { (-1), 100.0f, 1L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) 1);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3976");
        double[] doubleArray5 = new double[] { (-1L), 0.0d, ' ', (-1.0d), 100.0d };
        double[] doubleArray10 = new double[] { 'a', '#', 100.0d, (short) 0 };
        double[] doubleArray14 = new double[] { 0.0f, (short) 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray14, (double) (short) -1);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3977");
        double[] doubleArray3 = new double[] { (byte) 10, ' ', (byte) -1 };
        double[] doubleArray10 = new double[] { 1.0d, (byte) 0, 0L, (short) 1, (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3978");
        double[] doubleArray6 = new double[] { 0L, 0.0d, 0L, (-1.0d), 'a', 0L };
        double[] doubleArray12 = new double[] { 100, (short) 0, 100, 10.0d, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.0d, 1, 100L, (byte) 100, 10, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray19, (double) ' ');
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3979");
        double[] doubleArray4 = new double[] { (byte) -1, (short) 0, 100, 'a' };
        double[] doubleArray7 = new double[] { 10L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3980");
        double[] doubleArray4 = new double[] { (-1.0f), 100.0d, (-1L), (byte) 0 };
        double[] doubleArray9 = new double[] { (short) 0, 10, 100, (-1.0d) };
        double[] doubleArray12 = new double[] { '4', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray12, (-1.0d));
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3981");
        double[] doubleArray6 = new double[] { 0, 10L, 'a', 10.0d, (-1.0f), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.0d);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3982");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray6 = new double[] { 1, (byte) 0, (-1.0d), (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (-1.0d));
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3983");
        double[] doubleArray6 = new double[] { '#', 'a', 100, (byte) 100, (short) 100, (-1.0f) };
        double[] doubleArray10 = new double[] { (byte) 1, (byte) 100, 1 };
        double[] doubleArray12 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray12, 10.0d);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3984");
        double[] doubleArray6 = new double[] { 1, (byte) -1, (-1.0d), 100.0f, (-1), 10 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray7, (double) '#');
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3985");
        double[] doubleArray5 = new double[] { (short) 0, '#', (short) -1, (-1.0d), 100.0f };
        double[] doubleArray11 = new double[] { 10.0f, 10, 'a', (byte) 1, 10L };
        double[] doubleArray15 = new double[] { 100, 10L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, (double) (-1));
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3986");
        double[] doubleArray5 = new double[] { 1.0f, (short) -1, (byte) 1, 0.0d, (-1L) };
        double[] doubleArray10 = new double[] { 1, 100L, (byte) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, 0.0d);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3987");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 0, (byte) -1, 0.0f, 1L, 100.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, 100.0d);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3988");
        double[] doubleArray2 = new double[] { (-1L), 1 };
        double[] doubleArray7 = new double[] { (short) 1, (-1.0f), (-1.0f), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3989");
        double[] doubleArray5 = new double[] { (byte) -1, 100.0d, 1.0f, 0.0d, '#' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (short) -1, 0L, (byte) 0, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) (-1L));
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3990");
        double[] doubleArray2 = new double[] { 10, 10.0d };
        double[] doubleArray5 = new double[] { '#', 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) '#');
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3991");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 100, 0, (-1), 10L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3992");
        double[] doubleArray3 = new double[] { 100.0f, (-1.0f), (short) 1 };
        double[] doubleArray5 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, (double) (short) 0);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3993");
        double[] doubleArray6 = new double[] { (short) 100, (short) 0, (short) 1, 0, 10.0f, 0L };
        double[] doubleArray13 = new double[] { (short) -1, 10L, (short) 0, ' ', 10.0d, 1.0d };
        double[] doubleArray14 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray14, (double) 'a');
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3994");
        double[] doubleArray2 = new double[] { (short) -1, (byte) 1 };
        double[] doubleArray8 = new double[] { (-1.0f), (byte) 0, (-1), (byte) 10, (short) -1 };
        double[] doubleArray14 = new double[] { 100, 0.0f, 100L, (-1), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, (double) (short) 1);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3995");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1), 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (short) -1);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3996");
        double[] doubleArray3 = new double[] { 100, 0.0f, 100 };
        double[] doubleArray10 = new double[] { (short) 100, (byte) -1, ' ', (short) 1, (byte) 100, (byte) 10 };
        double[] doubleArray16 = new double[] { (byte) 10, '#', 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray16, (double) 0.0f);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3997");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, (-1.0d), (-1.0f), (short) 100, 100L, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3998");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { ' ' };
        double[] doubleArray7 = new double[] { 10L, 100.0d, 10.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray7, 10.0d);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3999");
        double[] doubleArray2 = new double[] { 0, (byte) 0 };
        double[] doubleArray8 = new double[] { 100L, (short) 10, (short) 1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) 0);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test4000");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray2, (double) 100L);
    }
}
