package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray5 = new double[] { 100.0d, 0.0f, 100 };
        double[] doubleArray7 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        double[] doubleArray3 = new double[] { (-1.0d), (byte) 1, (byte) 100 };
        double[] doubleArray9 = new double[] { (short) 10, '4', (-1.0f), 'a', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 100, 'a', 10L, (byte) 100, '#' };
        double[] doubleArray13 = new double[] { 100L, 0L, 100L, (short) 0, (byte) 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, 100.0d);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        double[] doubleArray4 = new double[] { (byte) 10, 10.0f, ' ', 0.0f };
        double[] doubleArray6 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { 100.0d, '4', (-1L), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        double[] doubleArray2 = new double[] { 100L, 10 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        double[] doubleArray4 = new double[] { ' ', (short) 0, (short) 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 'a');
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (double) '4');
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        double[] doubleArray6 = new double[] { '4', (byte) 0, 10, 100L, '#', 0.0d };
        double[] doubleArray11 = new double[] { (byte) 1, 100L, (byte) -1, 100 };
        double[] doubleArray13 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray13, (double) (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        double[] doubleArray3 = new double[] { 10, '#', (short) 1 };
        double[] doubleArray7 = new double[] { 1, (byte) 10, 10.0f };
        double[] doubleArray12 = new double[] { 0.0f, 10, (-1L), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) (byte) 100);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 100L, 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) 100);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        double[] doubleArray5 = new double[] { (byte) 0, (-1.0d), (-1.0d), (byte) 100, 0.0f };
        double[] doubleArray12 = new double[] { '4', '#', 100.0d, (short) -1, (-1.0f), (-1L) };
        double[] doubleArray17 = new double[] { 0.0d, 10.0f, 100.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray17, 10.0d);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10.0f, (byte) 100, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (byte) 0);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        double[] doubleArray3 = new double[] { (byte) 0, 0.0f, (short) 0 };
        double[] doubleArray6 = new double[] { 100.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, 0.0d);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        double[] doubleArray3 = new double[] { 0L, 10, (-1) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { (short) 1, 100L, (short) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        double[] doubleArray3 = new double[] { 10.0f, (short) 10, 100L };
        double[] doubleArray6 = new double[] { 100.0f, 0.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        double[] doubleArray6 = new double[] { 0L, (short) 1, (short) -1, 100.0d, 0.0d, (short) -1 };
        double[] doubleArray11 = new double[] { (-1.0f), 100, (short) -1, 1.0f };
        double[] doubleArray16 = new double[] { (short) 10, (-1.0f), '#', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray16, (double) (short) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        double[] doubleArray2 = new double[] { (short) -1, 1L };
        double[] doubleArray6 = new double[] { 1L, (byte) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, 0.0d);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        double[] doubleArray5 = new double[] { 1.0f, 10.0d, (-1), 100.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        double[] doubleArray3 = new double[] { 0, (byte) 0, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        double[] doubleArray4 = new double[] { 10L, 0L, (short) 0, 100 };
        double[] doubleArray9 = new double[] { 1.0f, (short) 0, 10.0d, 0.0d };
        double[] doubleArray14 = new double[] { 0L, 100L, (-1), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray14, 100.0d);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        double[] doubleArray6 = new double[] { (short) 10, (-1.0f), ' ', (byte) 10, (short) 10, (byte) 0 };
        double[] doubleArray10 = new double[] { (-1.0d), 0, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) 1);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        double[] doubleArray6 = new double[] { 10.0f, 10.0f, '4', 1L, 1.0d, (short) 10 };
        double[] doubleArray11 = new double[] { ' ', 0.0d, (-1.0f), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 100.0f);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        double[] doubleArray6 = new double[] { 100, (short) 1, 10, (byte) -1, 'a', (-1L) };
        double[] doubleArray10 = new double[] { 1L, 0L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 10);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        double[] doubleArray5 = new double[] { 10L, 100.0d, 0.0f, (-1), (byte) 10 };
        double[] doubleArray10 = new double[] { 10L, (short) 10, 10.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        double[] doubleArray5 = new double[] { 0.0d, (byte) 10, 0.0f, 0, 1 };
        double[] doubleArray10 = new double[] { 0L, (byte) 10, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray10, (double) (-1));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        double[] doubleArray6 = new double[] { 0L, (byte) 1, 10, 1.0f, 100.0d, (byte) 10 };
        double[] doubleArray9 = new double[] { (byte) 1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        double[] doubleArray3 = new double[] { 0L, ' ', (short) -1 };
        double[] doubleArray9 = new double[] { 10, 100L, 100.0f, (-1.0f), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) '4');
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        double[] doubleArray3 = new double[] { (byte) 1, (byte) -1, 10L };
        double[] doubleArray6 = new double[] { 10L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (double) 10);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray6 = new double[] { '#', 100L, 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) 100);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        double[] doubleArray2 = new double[] { 100, '#' };
        double[] doubleArray9 = new double[] { 0.0d, (byte) -1, (short) 1, (-1.0f), 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, (double) 0.0f);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        double[] doubleArray3 = new double[] { (short) 10, 100L, 100.0d };
        double[] doubleArray9 = new double[] { 100L, 'a', (short) 10, (byte) 1, 1.0f };
        double[] doubleArray12 = new double[] { (short) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray12, (double) 10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        double[] doubleArray5 = new double[] { (short) 100, (byte) 10, '#', (short) 1, (byte) 0 };
        double[] doubleArray11 = new double[] { 100, ' ', (-1.0d), 100.0d, 1 };
        double[] doubleArray17 = new double[] { ' ', 1.0d, 'a', (-1), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray17, (double) 1);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        double[] doubleArray4 = new double[] { 100, (-1.0f), (-1L), (byte) 100 };
        double[] doubleArray10 = new double[] { 1, (-1), 100L, (byte) 0, 10.0d };
        double[] doubleArray15 = new double[] { 0.0f, 100, (short) -1, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (double) (byte) -1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0d, (short) 10, 0, (short) 1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) ' ');
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray4 = new double[] { (short) 100, (short) -1 };
        double[] doubleArray7 = new double[] { ' ', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray7, (double) 1.0f);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        double[] doubleArray4 = new double[] { (byte) -1, '4', 0, ' ' };
        double[] doubleArray9 = new double[] { 10.0d, 'a', 'a', 10 };
        double[] doubleArray15 = new double[] { 10L, (-1.0d), (byte) 0, (-1L), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, (double) 10);
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        double[] doubleArray6 = new double[] { 0L, 0.0f, (byte) 100, (byte) 0, 100.0d, 100.0d };
        double[] doubleArray10 = new double[] { (-1L), 10L, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (-1.0d));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        double[] doubleArray1 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (byte) 100);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        double[] doubleArray4 = new double[] { (byte) 10, (short) 0, (-1.0f), 1.0f };
        double[] doubleArray6 = new double[] { 0.0d };
        double[] doubleArray9 = new double[] { 1.0d, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray9, (double) 0);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        double[] doubleArray6 = new double[] { (short) 10, (short) 100, (-1), (byte) 10, 0, 10.0f };
        double[] doubleArray12 = new double[] { (byte) 10, (short) 100, (short) 100, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) '4');
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.0d, (byte) 0, 1.0f, (byte) 0, (-1.0d) };
        double[] doubleArray11 = new double[] { (byte) 100, (short) 1, (short) -1, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, 0.0d);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray5 = new double[] { '4', (byte) 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        double[] doubleArray5 = new double[] { 100.0f, 1L, 1.0d, 0L, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        double[] doubleArray6 = new double[] { 100, (byte) -1, (byte) 1, '4', '4', 0 };
        double[] doubleArray11 = new double[] { 100, '#', '4', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, 10.0d);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        double[] doubleArray4 = new double[] { 100.0f, (short) 1, 100.0f, 100.0f };
        double[] doubleArray6 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) ' ');
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        double[] doubleArray2 = new double[] { (byte) 100, (-1.0f) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, 0.0d);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        double[] doubleArray6 = new double[] { 1L, (short) 0, (short) -1, (-1.0f), (short) 10, (-1.0f) };
        double[] doubleArray11 = new double[] { 1.0d, 1, (short) -1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) (-1));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        double[] doubleArray5 = new double[] { (-1), 10L, (short) 10, '#', (short) -1 };
        double[] doubleArray8 = new double[] { '#', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray8 = new double[] { 0.0d, (byte) -1, (short) 10, ' ', 0.0f, 0.0f };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        double[] doubleArray6 = new double[] { ' ', 0.0d, 100, 1.0f, '#', (short) -1 };
        double[] doubleArray12 = new double[] { 100L, (byte) 0, (short) -1, (-1.0f), (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) 10L);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        double[] doubleArray5 = new double[] { 1.0f, 0L, (byte) -1, 10.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { 1.0f, (byte) 100, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) 0L);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray6 = new double[] { (-1.0d), '4', 1.0f, (-1L) };
        double[] doubleArray11 = new double[] { (short) 0, 10L, (byte) 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, (double) (byte) 10);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        double[] doubleArray4 = new double[] { ' ', (short) -1, 10L, 0L };
        double[] doubleArray7 = new double[] { (byte) -1, 1L };
        double[] doubleArray11 = new double[] { '4', 100.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray11, 0.0d);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        double[] doubleArray1 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (-1.0d));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        double[] doubleArray5 = new double[] { 1.0f, 100, 1, 1.0f, 0 };
        double[] doubleArray7 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        double[] doubleArray6 = new double[] { (byte) 10, '4', ' ', 10L, 0.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        double[] doubleArray5 = new double[] { (byte) 100, (byte) 100, 10.0d, (-1L), 'a' };
        double[] doubleArray10 = new double[] { (byte) 1, (byte) 10, (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) 10);
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        double[] doubleArray4 = new double[] { (-1), 0.0f, 'a', (byte) 0 };
        double[] doubleArray6 = new double[] { ' ' };
        double[] doubleArray10 = new double[] { (short) 10, (-1.0f), '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray10, (double) (byte) 1);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        double[] doubleArray5 = new double[] { (short) 1, (short) -1, (-1.0f), (byte) 0, 10 };
        double[] doubleArray10 = new double[] { 10.0d, 'a', (byte) 10, 100.0d };
        double[] doubleArray12 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray12, (double) 0L);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        double[] doubleArray3 = new double[] { (-1L), 1, (byte) 100 };
        double[] doubleArray5 = new double[] { (-1.0f) };
        double[] doubleArray12 = new double[] { (-1), 0L, 1, 1L, (-1.0f), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray12, (double) (byte) 0);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        double[] doubleArray3 = new double[] { 1.0d, (byte) 1, 100L };
        double[] doubleArray8 = new double[] { 10.0d, 100.0f, (-1), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) ' ');
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        double[] doubleArray6 = new double[] { 100, 10.0d, ' ', 1, (-1), (-1L) };
        double[] doubleArray12 = new double[] { (-1), 100, 10L, 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 100);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        double[] doubleArray2 = new double[] { 0.0f, (byte) 0 };
        double[] doubleArray5 = new double[] { 0L, (-1L) };
        double[] doubleArray9 = new double[] { '#', 0L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray9, (double) 0.0f);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        double[] doubleArray3 = new double[] { ' ', (-1.0d), 100 };
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray8 = new double[] { (-1L), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray8, (double) 0.0f);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 10, 1.0f, 10L, (-1.0f), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, 0.0d);
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (-1L), (byte) 1 };
        double[] doubleArray5 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        double[] doubleArray5 = new double[] { 0.0f, (byte) -1, ' ', 0L, 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, 100.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1L, 10L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, 0.0d);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (-1L));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        double[] doubleArray5 = new double[] { 0.0d, 100L, 0.0f, 0.0d, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 0L);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { '#', (short) 100, 10L, (short) 1, 1L };
        double[] doubleArray8 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, 1.0d);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, 1.0d);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        double[] doubleArray5 = new double[] { 100.0f, 10, (short) -1, 1.0f, 0L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray3 = new double[] { (-1.0d) };
        double[] doubleArray9 = new double[] { 'a', (byte) -1, 100, 100.0f, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray9, (double) 10);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        double[] doubleArray4 = new double[] { 1L, 10, 100.0f, (short) 1 };
        double[] doubleArray8 = new double[] { 1L, (short) 1, (byte) 0 };
        double[] doubleArray14 = new double[] { (byte) -1, (short) 10, 1, (-1L), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray14, (double) 0);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        double[] doubleArray2 = new double[] { '#', (short) 0 };
        double[] doubleArray5 = new double[] { 1L, (byte) 0 };
        double[] doubleArray11 = new double[] { ' ', 0.0f, 10.0d, (byte) 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray11, (double) (short) 1);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray4 = new double[] { 100.0d, (-1) };
        double[] doubleArray10 = new double[] { 1.0d, (-1L), '4', 10.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray10, (double) ' ');
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        double[] doubleArray6 = new double[] { 10.0d, (short) 0, 1, (-1L), (short) 100, ' ' };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (byte) 0, 100L, 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        double[] doubleArray4 = new double[] { (short) 1, (short) -1, (byte) 1, (byte) 10 };
        double[] doubleArray8 = new double[] { 10L, (byte) 1, 10 };
        double[] doubleArray15 = new double[] { (byte) 10, (short) 100, '#', (short) -1, 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) 'a');
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray4 = new double[] { (byte) -1, 1.0f };
        double[] doubleArray10 = new double[] { 100.0f, 'a', (byte) -1, '#', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0f, 'a', (-1.0d), 0L };
        double[] doubleArray11 = new double[] { 0.0f, (-1.0d), (short) -1, 'a', 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) ' ');
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        double[] doubleArray4 = new double[] { (short) -1, (short) 1, (-1), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        double[] doubleArray6 = new double[] { (byte) -1, (-1.0d), 100.0d, 1, (short) 0, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (-1.0d));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) (short) 1);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        double[] doubleArray2 = new double[] { '#', 10 };
        double[] doubleArray9 = new double[] { '4', '4', 0, '4', 0, 10 };
        double[] doubleArray16 = new double[] { (-1L), (-1.0f), 0.0d, '#', 0.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray16, (double) ' ');
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        double[] doubleArray3 = new double[] { (short) 10, (byte) -1, '4' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { 0.0d, (byte) 100, 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray9, (double) '4');
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        double[] doubleArray3 = new double[] { 1.0f, 1.0f, 10.0f };
        double[] doubleArray6 = new double[] { (short) 10, 10 };
        double[] doubleArray8 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray8, (double) 100L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        double[] doubleArray2 = new double[] { 1L, 1 };
        double[] doubleArray8 = new double[] { (byte) 1, (byte) 10, 100.0f, (short) 10, 1L };
        double[] doubleArray15 = new double[] { 100L, (-1.0f), (short) 10, '#', 0.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray15, (double) (short) 0);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 10, 1.0f, (byte) 100, 100, 1.0d };
        double[] doubleArray11 = new double[] { (byte) 100, (byte) 0, 100.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, 1.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        double[] doubleArray4 = new double[] { (-1.0f), (short) 10, 0, 10.0f };
        double[] doubleArray8 = new double[] { (short) -1, (-1), (byte) 1 };
        double[] doubleArray15 = new double[] { (short) 0, '#', 100, (-1.0f), (short) -1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) '4');
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        double[] doubleArray3 = new double[] { (short) 0, (byte) 10, 100 };
        double[] doubleArray5 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { (short) 0, 10L, 0, (byte) 100, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray11, (double) 0L);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        double[] doubleArray2 = new double[] { 10.0f, (-1.0f) };
        double[] doubleArray8 = new double[] { 1.0d, (-1L), 100.0f, 100.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) '#');
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        double[] doubleArray2 = new double[] { (short) 1, (-1L) };
        double[] doubleArray8 = new double[] { (short) 10, 1.0f, 0.0d, 1.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) 0);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        double[] doubleArray5 = new double[] { (short) -1, 0, 1.0f, (short) 10, 1L };
        double[] doubleArray10 = new double[] { 100, 1L, 100.0f, 10 };
        double[] doubleArray15 = new double[] { ' ', 10.0f, (short) 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray15, (double) (short) -1);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { 10.0f, 0.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (byte) 1, 100L, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        double[] doubleArray2 = new double[] { (byte) 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 0.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        double[] doubleArray6 = new double[] { 0L, 1, 100L, (short) 100, (byte) 10, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.0d);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { 0L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray6 = new double[] { (short) 1, (short) 0, (short) 100, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        double[] doubleArray5 = new double[] { 1L, 0, (short) -1, 1.0f, 0L };
        double[] doubleArray11 = new double[] { (-1), 100.0f, (byte) 1, 1L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (-1.0d));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        double[] doubleArray6 = new double[] { 10.0d, (short) 10, (short) 10, (byte) 0, (-1), 100L };
        double[] doubleArray10 = new double[] { 10.0d, 0L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1), 10.0d, 100L, (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) '#');
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        double[] doubleArray4 = new double[] { (short) -1, (byte) 1, 1.0f, (-1) };
        double[] doubleArray10 = new double[] { 1.0d, '4', 0.0d, 0.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 0.0f);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        double[] doubleArray5 = new double[] { (-1L), (byte) -1, 0.0f, 0.0d, 10L };
        double[] doubleArray10 = new double[] { 100.0f, 1.0f, 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 1);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        double[] doubleArray5 = new double[] { (short) 0, 0, 0, 1.0f, (byte) 100 };
        double[] doubleArray9 = new double[] { 0L, (-1.0d), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, 0.0d);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { ' ', (byte) 1, '4', 0.0d, 1, (short) 0 };
        double[] doubleArray11 = new double[] { ' ', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray11, (double) (short) 100);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        double[] doubleArray6 = new double[] { 100.0f, 0.0d, 10, 1.0d, 100.0d, 1.0d };
        double[] doubleArray11 = new double[] { 0.0f, (short) 1, 100.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        double[] doubleArray4 = new double[] { (-1L), (-1.0f), 0.0d, 0 };
        double[] doubleArray6 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) '4');
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        double[] doubleArray4 = new double[] { 10, (byte) 10, (short) 100, 10.0f };
        double[] doubleArray10 = new double[] { '#', 1.0d, (-1.0f), 0.0f, 0L };
        double[] doubleArray12 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        double[] doubleArray2 = new double[] { (byte) 100, (short) -1 };
        double[] doubleArray6 = new double[] { (byte) -1, 100, (byte) 0 };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        double[] doubleArray3 = new double[] { '#', 10.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 10);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1, (-1.0d), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray3 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        double[] doubleArray1 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 0.0d);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        double[] doubleArray4 = new double[] { 1.0d, 'a', 0.0f, (short) 100 };
        double[] doubleArray7 = new double[] { (byte) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        double[] doubleArray4 = new double[] { '4', 0.0d, 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        double[] doubleArray2 = new double[] { 1L, 1 };
        double[] doubleArray4 = new double[] { 0.0f };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray5, 0.0d);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        double[] doubleArray4 = new double[] { 10, 100, (byte) 1, (byte) 0 };
        double[] doubleArray9 = new double[] { '#', (short) 0, 10L, (short) 0 };
        double[] doubleArray15 = new double[] { 100.0d, 0L, '#', (short) 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray15, 0.0d);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        double[] doubleArray2 = new double[] { (short) -1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (byte) 1);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        double[] doubleArray6 = new double[] { 100.0f, 100L, (-1.0f), 0.0d, (byte) 10, (-1) };
        double[] doubleArray10 = new double[] { 'a', 1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) (short) 100);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        double[] doubleArray5 = new double[] { 1, (byte) 10, 0.0d, (byte) 0, 0L };
        double[] doubleArray11 = new double[] { (short) 1, (short) 10, (byte) 10, (-1), (short) -1 };
        double[] doubleArray15 = new double[] { 10.0f, (short) 0, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray15, (double) (short) 100);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        double[] doubleArray6 = new double[] { 100.0d, (short) -1, 0L, '#', (short) 1, 100.0f };
        double[] doubleArray10 = new double[] { (byte) 100, (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) (short) 10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        double[] doubleArray3 = new double[] { 100.0d, (short) 100, 1 };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray6, 0.0d);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        double[] doubleArray3 = new double[] { (byte) 100, 0.0d, 100.0f };
        double[] doubleArray8 = new double[] { 'a', '#', 0.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 0.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        double[] doubleArray5 = new double[] { '4', 10, (short) 1, (-1), '#' };
        double[] doubleArray8 = new double[] { (short) 10, (byte) 100 };
        double[] doubleArray10 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray3 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray3, (double) (-1.0f));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        double[] doubleArray2 = new double[] { (-1L), 10.0d };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { 0L, (byte) 100, (byte) -1, (short) 1, 1L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray10, 100.0d);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        double[] doubleArray3 = new double[] { 0L, 10, 0.0f };
        double[] doubleArray10 = new double[] { 1L, 'a', 0, 'a', 'a', (byte) 0 };
        double[] doubleArray17 = new double[] { 10L, 1L, (short) 1, 100.0d, (short) 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray17, (-1.0d));
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        double[] doubleArray3 = new double[] { (short) 0, (-1), 0.0f };
        double[] doubleArray8 = new double[] { (short) 100, (short) 1, 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (byte) 100);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        double[] doubleArray5 = new double[] { '4', 1, 0L, (short) 100, 1.0d };
        double[] doubleArray11 = new double[] { (-1), (short) 0, (-1L), 1L, (-1.0f) };
        double[] doubleArray16 = new double[] { (byte) 100, (short) 0, 10L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray16, (double) 10.0f);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        double[] doubleArray5 = new double[] { 10.0f, 100, 1, (short) 1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 10L);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        double[] doubleArray2 = new double[] { (short) 100, (byte) 10 };
        double[] doubleArray9 = new double[] { (byte) 0, (byte) 10, (byte) 10, (-1.0f), (short) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray2, 10.0d);
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        double[] doubleArray5 = new double[] { 10L, (byte) 100, ' ', (short) 0, (byte) 100 };
        double[] doubleArray7 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) 0L);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        double[] doubleArray6 = new double[] { (byte) 100, 1, (-1), (short) 1, (byte) 0, (-1.0f) };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray11 = new double[] { (short) 0, 1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray11, (double) 0L);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        double[] doubleArray4 = new double[] { 100.0f, 'a', 1, (short) 1 };
        double[] doubleArray7 = new double[] { 1L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        double[] doubleArray4 = new double[] { 0, 1.0f, (short) 100, 0.0d };
        double[] doubleArray8 = new double[] { 100, 1, 0.0f };
        double[] doubleArray15 = new double[] { 1.0f, (byte) 0, 100.0f, (short) 100, 'a', 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) 100.0f);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0f), (-1), (short) 0, (byte) 100, 0.0f };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        double[] doubleArray6 = new double[] { (byte) 0, (-1.0f), 100L, (byte) 10, (-1.0d), 100.0f };
        double[] doubleArray10 = new double[] { (short) 0, '4', 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) (byte) 0);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        double[] doubleArray4 = new double[] { 'a', 10.0f, 1, 100 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray6, 0.0d);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        double[] doubleArray5 = new double[] { ' ', ' ', 10, 10.0d, (-1L) };
        double[] doubleArray9 = new double[] { (short) -1, 'a', 10L };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray10, (double) 1L);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100, (-1.0d), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) 1L);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray4 = new double[] { 100L, ' ' };
        double[] doubleArray8 = new double[] { 0, (short) -1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, (double) (byte) 0);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        double[] doubleArray4 = new double[] { 1.0d, ' ', (short) 1, 0 };
        double[] doubleArray7 = new double[] { 100.0d, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 100.0f);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        double[] doubleArray2 = new double[] { '#', 10L };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) 1);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        double[] doubleArray5 = new double[] { 10, (short) 10, 10, (byte) -1, 10.0f };
        double[] doubleArray9 = new double[] { 1.0f, (byte) -1, 10L };
        double[] doubleArray13 = new double[] { 100.0f, (-1.0f), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray13, (double) 1);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        double[] doubleArray5 = new double[] { 1.0d, 10L, (short) 100, 0.0f, 1 };
        double[] doubleArray11 = new double[] { 1L, (-1.0d), 100.0d, '#', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) ' ');
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        double[] doubleArray6 = new double[] { 100L, 10.0f, 100L, (short) 10, 10, (byte) 10 };
        double[] doubleArray11 = new double[] { (short) 100, (byte) 10, (short) 1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 100L);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray4 = new double[] { 'a', 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (double) 1L);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray4 = new double[] { 100.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) (short) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 100, '4', (short) -1 };
        double[] doubleArray8 = new double[] { '4', (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray8, (double) 100);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        double[] doubleArray2 = new double[] { 0L, (-1.0f) };
        double[] doubleArray5 = new double[] { 10.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, (double) (byte) 1);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        double[] doubleArray3 = new double[] { 0, ' ', 10 };
        double[] doubleArray6 = new double[] { (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        double[] doubleArray2 = new double[] { 0L, '4' };
        double[] doubleArray4 = new double[] { (byte) 10 };
        double[] doubleArray7 = new double[] { (short) -1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        double[] doubleArray1 = new double[] { (-1L) };
        double[] doubleArray4 = new double[] { 100.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 0.0d);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray6 = new double[] { 0L, (-1.0d), (-1), (-1L) };
        double[] doubleArray9 = new double[] { 1.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) 1.0f);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        double[] doubleArray6 = new double[] { 10.0d, 10.0f, (-1L), '4', 10, 10 };
        double[] doubleArray9 = new double[] { (byte) 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 0);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        double[] doubleArray6 = new double[] { '4', 100.0f, 0.0f, 10, 10.0f, (byte) -1 };
        double[] doubleArray8 = new double[] { 1.0d };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray9, 0.0d);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        double[] doubleArray6 = new double[] { '#', 1L, 10.0d, (byte) -1, (byte) 10, 0L };
        double[] doubleArray9 = new double[] { 1, 1L };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        double[] doubleArray1 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 1.0d);
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray4 = new double[] { 10.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray1, (double) (short) 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        double[] doubleArray6 = new double[] { 1, 1L, 100, (short) 1, 100.0f, 10L };
        double[] doubleArray13 = new double[] { 100L, (short) 10, 0.0f, (short) 1, 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        double[] doubleArray4 = new double[] { '#', (-1), (short) 0, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 'a');
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        double[] doubleArray4 = new double[] { (short) 100, (byte) 0, (byte) 10, (byte) 0 };
        double[] doubleArray7 = new double[] { (byte) 1, 10 };
        double[] doubleArray14 = new double[] { 'a', 1.0d, 10L, 0.0f, (byte) 1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray14, (double) (byte) 10);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        double[] doubleArray5 = new double[] { (-1.0f), (byte) 1, 100.0f, (byte) 10, (-1) };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray9 = new double[] { 0L, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        double[] doubleArray3 = new double[] { (byte) -1, 1, 0L };
        double[] doubleArray10 = new double[] { (-1), 10L, '#', 1.0f, 1.0f, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, (double) (byte) 10);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) (short) 10);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        double[] doubleArray6 = new double[] { 1L, 10.0d, (byte) 10, 100.0d, 10, (short) 0 };
        double[] doubleArray12 = new double[] { (short) -1, 10L, ' ', (byte) 100, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        double[] doubleArray3 = new double[] { 0L, 10, (short) 10 };
        double[] doubleArray8 = new double[] { 0, '#', 10, (short) 1 };
        double[] doubleArray12 = new double[] { 100.0d, 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        double[] doubleArray2 = new double[] { (-1.0d), 100 };
        double[] doubleArray9 = new double[] { 0L, 10, (byte) 100, 1, '#', 0 };
        double[] doubleArray13 = new double[] { 0.0d, 10L, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray13, (double) (byte) 1);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        double[] doubleArray5 = new double[] { 1.0f, (short) 0, 0.0d, 0.0d, (byte) -1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray7, (double) '#');
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        double[] doubleArray5 = new double[] { 10.0d, 1L, 10, 10, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        double[] doubleArray4 = new double[] { 10.0f, 1L, 1.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 'a');
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        double[] doubleArray2 = new double[] { 0L, 0 };
        double[] doubleArray8 = new double[] { 'a', 1L, 10L, (-1), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, 10.0d);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        double[] doubleArray2 = new double[] { 10, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '4');
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        double[] doubleArray3 = new double[] { 1L, (-1L), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 0);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        double[] doubleArray3 = new double[] { 1L, 10.0f, 0 };
        double[] doubleArray7 = new double[] { (-1L), (byte) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, (double) ' ');
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray7 = new double[] { (short) 0, 'a', '#', 1.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 0.0d);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        double[] doubleArray3 = new double[] { 0.0d, 100L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) -1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0f };
        double[] doubleArray5 = new double[] { (byte) -1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        double[] doubleArray5 = new double[] { 10, (byte) 1, 10.0f, (-1), 0L };
        double[] doubleArray7 = new double[] { 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        double[] doubleArray2 = new double[] { 10.0f, (byte) 100 };
        double[] doubleArray5 = new double[] { (-1.0d), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        double[] doubleArray6 = new double[] { 'a', (byte) 1, 1L, (byte) 1, (byte) 1, ' ' };
        double[] doubleArray13 = new double[] { (short) 10, (byte) 10, 0, (short) 1, 10.0f, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1L), (-1.0d), 10.0d, 100L, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 1);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (byte) -1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        double[] doubleArray5 = new double[] { 'a', (byte) -1, 1.0d, (byte) 100, 0.0f };
        double[] doubleArray10 = new double[] { 'a', 0.0d, 1, 0.0d };
        double[] doubleArray12 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray12, (double) '#');
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        double[] doubleArray5 = new double[] { (byte) 1, 100, 100L, (byte) 0, ' ' };
        double[] doubleArray11 = new double[] { (-1), 1, (short) 10, (byte) 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        double[] doubleArray2 = new double[] { (-1.0d), (short) -1 };
        double[] doubleArray5 = new double[] { '4', (byte) 100 };
        double[] doubleArray9 = new double[] { (short) 100, (byte) 1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray9, (double) 100L);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        double[] doubleArray2 = new double[] { (byte) 100, 1.0f };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray9 = new double[] { 10L, (short) 10, 10, ' ', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        double[] doubleArray1 = new double[] { 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 100);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, 0.0d);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        double[] doubleArray3 = new double[] { (byte) 0, 1L, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) -1);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) 0.0f);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        double[] doubleArray3 = new double[] { 10, (byte) 10, 10.0f };
        double[] doubleArray7 = new double[] { '#', 1.0f, (-1.0f) };
        double[] doubleArray14 = new double[] { (byte) 0, (-1.0d), (-1.0f), (short) 100, 100L, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray14, (double) ' ');
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        double[] doubleArray2 = new double[] { 10L, 10.0d };
        double[] doubleArray6 = new double[] { 100.0f, (byte) -1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray2, (double) 1);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        double[] doubleArray3 = new double[] { 0.0d, (short) 0, 10.0f };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray9 = new double[] { 1, 100.0d, (short) 100, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray9, (double) 'a');
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        double[] doubleArray2 = new double[] { (byte) -1, (-1L) };
        double[] doubleArray7 = new double[] { 1, 100.0d, '#', 100.0d };
        double[] doubleArray13 = new double[] { (byte) 10, (byte) 1, 1L, 100.0d, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        double[] doubleArray5 = new double[] { 10.0d, (short) 10, 0.0f, 100, 100 };
        double[] doubleArray10 = new double[] { 'a', 1.0f, 10, ' ' };
        double[] doubleArray14 = new double[] { (short) 10, (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray14, (double) (short) 100);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        double[] doubleArray4 = new double[] { 1L, (byte) 1, (byte) 100, (short) 10 };
        double[] doubleArray9 = new double[] { 10.0d, 0.0d, 100.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 1);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 0, (-1L), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, 0.0d);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        double[] doubleArray2 = new double[] { '#', (-1L) };
        double[] doubleArray6 = new double[] { (-1.0f), 100, (byte) 10 };
        double[] doubleArray10 = new double[] { (short) 100, (short) 0, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray10, (double) 10.0f);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        double[] doubleArray5 = new double[] { (short) 0, 100L, 100.0d, 10L, 1L };
        double[] doubleArray7 = new double[] { (short) 1 };
        double[] doubleArray12 = new double[] { '#', 0.0d, (short) 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray12, 100.0d);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        double[] doubleArray3 = new double[] { '4', (-1), 10.0f };
        double[] doubleArray8 = new double[] { (byte) 1, 'a', 100.0f, '#' };
        double[] doubleArray14 = new double[] { (short) 10, 0.0d, 100.0d, 0L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray14, (double) 1.0f);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        double[] doubleArray4 = new double[] { 10, 100L, 0.0f, (short) 10 };
        double[] doubleArray6 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 100L);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        double[] doubleArray6 = new double[] { (short) -1, 100, 100.0f, 0.0d, (-1L), (short) -1 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray9, (double) (-1));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 1.0d, 100.0f, (-1.0f), '#', 100.0f };
        double[] doubleArray9 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray9, (double) 0L);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        double[] doubleArray6 = new double[] { 0.0f, (-1L), (short) 100, (byte) 0, ' ', (short) 1 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray12 = new double[] { (short) 0, 0.0d, (short) 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray12, (double) (-1L));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        double[] doubleArray5 = new double[] { (-1.0f), (-1), 0.0f, (-1.0d), (short) 0 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (-1.0d));
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        double[] doubleArray2 = new double[] { (byte) -1, (short) -1 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { 100.0f, (byte) 100, 0.0f, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray8, (double) 'a');
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        double[] doubleArray3 = new double[] { 10.0f, (-1L), 1 };
        double[] doubleArray9 = new double[] { (-1.0d), (-1L), '4', (-1.0d), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) (-1.0f));
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 100);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray3 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray3, (double) 1L);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        double[] doubleArray2 = new double[] { 100.0f, (-1.0d) };
        double[] doubleArray4 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) (-1L));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        double[] doubleArray4 = new double[] { 0, 'a', (byte) 1, 1.0f };
        double[] doubleArray10 = new double[] { 100L, 10, (-1.0d), 0L, 0L };
        double[] doubleArray16 = new double[] { (byte) 1, 0.0d, (short) -1, 1.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray16, (double) 1L);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) (byte) 1);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        double[] doubleArray3 = new double[] { 10L, 'a', (byte) 100 };
        double[] doubleArray8 = new double[] { (byte) 1, '4', (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray3, (double) (-1.0f));
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        double[] doubleArray3 = new double[] { (short) 0, 1L, (-1) };
        double[] doubleArray9 = new double[] { 100.0d, (byte) 10, ' ', 100.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (double) 100L);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        double[] doubleArray6 = new double[] { (short) 1, 10L, 1.0f, (short) 100, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        double[] doubleArray2 = new double[] { 100, (-1.0d) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray3, (double) (byte) 1);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        double[] doubleArray6 = new double[] { 100.0f, 'a', (-1), (byte) 10, ' ', (byte) -1 };
        double[] doubleArray11 = new double[] { (short) 100, (byte) 1, (byte) 100, (byte) 10 };
        double[] doubleArray12 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray12, (double) 0L);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        double[] doubleArray4 = new double[] { (-1.0f), 100.0d, '#', (-1.0d) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray11 = new double[] { 1.0f, (byte) 10, (byte) 100, 10, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray11, (double) (byte) 0);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        double[] doubleArray4 = new double[] { 0L, 10.0f, 10, 100 };
        double[] doubleArray8 = new double[] { (byte) 1, 10.0d, 100L };
        double[] doubleArray10 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray10, (double) (-1));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        double[] doubleArray5 = new double[] { (byte) 0, 100, 10.0d, 0.0f, 100 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        double[] doubleArray2 = new double[] { (-1.0d), (byte) 10 };
        double[] doubleArray5 = new double[] { 10L, (byte) 10 };
        double[] doubleArray10 = new double[] { 100.0f, (-1.0f), 100L, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray10, (double) ' ');
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        double[] doubleArray2 = new double[] { (-1L), 100.0d };
        double[] doubleArray4 = new double[] { (short) 100 };
        double[] doubleArray11 = new double[] { (short) 1, (byte) 0, (byte) 10, 10.0f, 10.0d, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, (double) (-1.0f));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        double[] doubleArray4 = new double[] { 100.0d, 100.0f, 10, 1L };
        double[] doubleArray8 = new double[] { (byte) 1, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) (short) 1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        double[] doubleArray4 = new double[] { (byte) 1, 1L, (-1.0f), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 100.0f);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        double[] doubleArray2 = new double[] { (short) 100, (-1) };
        double[] doubleArray6 = new double[] { '4', 100L, (short) 0 };
        double[] doubleArray11 = new double[] { (byte) 10, (byte) -1, (short) 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray11, (double) (byte) 100);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        double[] doubleArray3 = new double[] { (short) 10, 1.0f, (byte) 1 };
        double[] doubleArray6 = new double[] { (byte) -1, (byte) -1 };
        double[] doubleArray10 = new double[] { (-1), 0L, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray10, (double) 'a');
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray4 = new double[] { (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) (-1L));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray6 = new double[] { (byte) 100, 0, (-1.0f), (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { 0, (short) 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) (short) 100);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        double[] doubleArray2 = new double[] { 10.0d, (byte) 100 };
        double[] doubleArray5 = new double[] { (byte) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, 1.0d);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        double[] doubleArray2 = new double[] { 10.0d, (byte) 10 };
        double[] doubleArray8 = new double[] { 0.0d, (short) 0, 'a', ' ', 0.0d };
        double[] doubleArray14 = new double[] { (byte) 10, 0L, 100.0f, 0.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, (double) (short) 100);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        double[] doubleArray6 = new double[] { 'a', 0.0d, (byte) 10, (short) 100, '#', 0.0d };
        double[] doubleArray10 = new double[] { 0.0d, 'a', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) '#');
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        double[] doubleArray2 = new double[] { ' ', (short) 100 };
        double[] doubleArray4 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 100L);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, 0.0d);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 100.0d, 1.0f, 1.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, 10.0d);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        double[] doubleArray6 = new double[] { 1.0d, (byte) -1, 1, (byte) 1, ' ', (short) -1 };
        double[] doubleArray10 = new double[] { (short) -1, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) (short) 10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        double[] doubleArray5 = new double[] { 100L, 100.0d, 100.0f, 10.0d, 10.0f };
        double[] doubleArray8 = new double[] { 1.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (byte) 100);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        double[] doubleArray3 = new double[] { (byte) 10, 0.0f, (short) 10 };
        double[] doubleArray8 = new double[] { 10.0d, (-1.0f), 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (-1.0d));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0.0f, 100.0d, 'a', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, 10.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        double[] doubleArray2 = new double[] { (byte) -1, (short) 0 };
        double[] doubleArray9 = new double[] { 'a', 10L, 100.0d, ' ', '#', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) '4');
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        double[] doubleArray4 = new double[] { 0, 1, (short) 0, 100.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 10.0d, '4', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, (double) 1L);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        double[] doubleArray5 = new double[] { 10.0d, 100L, (-1.0f), 10.0d, (byte) 1 };
        double[] doubleArray11 = new double[] { 10.0d, (-1.0d), (byte) 1, 10.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) '4');
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        double[] doubleArray2 = new double[] { (-1), (short) 10 };
        double[] doubleArray8 = new double[] { 1.0d, '4', (-1), 0.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) '4');
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        double[] doubleArray2 = new double[] { (short) 100, (short) 0 };
        double[] doubleArray9 = new double[] { (-1.0f), 'a', 100L, (short) -1, 100L, 0.0f };
        double[] doubleArray11 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray11, (double) 10.0f);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        double[] doubleArray6 = new double[] { 1.0f, 100.0f, 10L, 0L, ' ', 1 };
        double[] doubleArray11 = new double[] { 100.0d, '4', 0L, 10L };
        double[] doubleArray18 = new double[] { (byte) 0, (byte) 100, 0L, (short) 100, (byte) -1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray18, 0.0d);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        double[] doubleArray2 = new double[] { 10.0d, (-1.0f) };
        double[] doubleArray4 = new double[] { 100.0d };
        double[] doubleArray8 = new double[] { 1.0d, 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray8, (double) ' ');
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        double[] doubleArray6 = new double[] { ' ', 10L, 10.0f, (short) 1, 0, (short) 0 };
        double[] doubleArray8 = new double[] { (short) 0 };
        double[] doubleArray10 = new double[] { 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray10, (double) (short) 1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { 1.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray5, (double) (short) 1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        double[] doubleArray2 = new double[] { '#', 0.0f };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, 0.0d);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray8 = new double[] { 100L, ' ', (short) 10, (byte) 100, (-1.0f), 0.0f };
        double[] doubleArray10 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray10, (double) '#');
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        double[] doubleArray4 = new double[] { 1.0f, (short) 100, 1L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        double[] doubleArray5 = new double[] { (-1.0d), (short) 10, (byte) 1, (short) 100, (-1) };
        double[] doubleArray12 = new double[] { 1.0d, 0, 1, (byte) -1, (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 10L);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        double[] doubleArray2 = new double[] { '4', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 100L);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, (double) (-1L));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        double[] doubleArray6 = new double[] { 100.0d, 100L, (-1.0d), 0L, (-1), 10.0d };
        double[] doubleArray12 = new double[] { (-1.0f), 100.0f, 10.0f, (byte) 100, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, (double) 1.0f);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray8 = new double[] { '4', 0.0f, 10, (-1L), 0, 100L };
        double[] doubleArray15 = new double[] { (byte) -1, 10.0f, 0.0d, 10, (short) 1, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray15, (double) (byte) 1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        double[] doubleArray4 = new double[] { 1, (short) 0, 1.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 1L);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, 100.0d);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        double[] doubleArray6 = new double[] { (short) 0, (short) -1, ' ', 100.0d, 100, 1 };
        double[] doubleArray10 = new double[] { (short) 1, 0.0d, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 100L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        double[] doubleArray3 = new double[] { 1L, (short) 1, (byte) -1 };
        double[] doubleArray7 = new double[] { 1.0d, 'a', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) 10L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        double[] doubleArray4 = new double[] { 0L, (short) 0, 0.0d, (byte) -1 };
        double[] doubleArray6 = new double[] { 10 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        double[] doubleArray2 = new double[] { 10L, (-1L) };
        double[] doubleArray4 = new double[] { 0L };
        double[] doubleArray6 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        double[] doubleArray2 = new double[] { (short) 100, (byte) 10 };
        double[] doubleArray8 = new double[] { (byte) 0, (-1.0d), 0.0d, 1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) 100L);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        double[] doubleArray6 = new double[] { 1L, 100.0d, (byte) 100, 100.0d, (-1.0f), (short) 10 };
        double[] doubleArray10 = new double[] { 100.0d, 1.0d, 1 };
        double[] doubleArray14 = new double[] { 100, 10L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray14, (double) ' ');
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { ' ' };
        double[] doubleArray7 = new double[] { (short) 10, (byte) 0, (short) 0, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray7, (double) 1L);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, (byte) -1, 0L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray7, (double) 0.0f);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        double[] doubleArray5 = new double[] { (short) 100, '4', (-1.0f), (byte) -1, 100L };
        double[] doubleArray11 = new double[] { 100, 10, 100, 10L, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (short) 0);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        double[] doubleArray6 = new double[] { (-1.0d), ' ', (short) 0, 10.0d, 0.0d, (byte) 0 };
        double[] doubleArray11 = new double[] { ' ', 1.0f, (short) -1, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 10L);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray4 = new double[] { (byte) -1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 0.0d);
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        double[] doubleArray3 = new double[] { (short) 0, 1, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 'a');
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0f), 0.0f, 10L };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, 0.0d);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        double[] doubleArray2 = new double[] { (-1.0f), (byte) -1 };
        double[] doubleArray4 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) 0L);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        double[] doubleArray2 = new double[] { (byte) 100, '4' };
        double[] doubleArray6 = new double[] { 0L, (-1.0d), (short) 1 };
        double[] doubleArray9 = new double[] { 10.0d, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, (double) 100);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray7 = new double[] { 100.0f, (-1.0d), 1.0d, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 0.0d);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        double[] doubleArray1 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) 1.0f);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        double[] doubleArray3 = new double[] { '4', 0L, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        double[] doubleArray6 = new double[] { 100.0d, 10.0d, 10, 1.0d, 0.0f, (byte) 1 };
        double[] doubleArray9 = new double[] { (short) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) (-1));
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        double[] doubleArray2 = new double[] { (short) -1, (-1) };
        double[] doubleArray9 = new double[] { 1, (-1.0d), 100.0f, 'a', (short) -1, 0.0d };
        double[] doubleArray10 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray10, (double) 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        double[] doubleArray6 = new double[] { (short) -1, 1L, (short) 1, (byte) 100, 10.0f, (byte) -1 };
        double[] doubleArray9 = new double[] { '#', (byte) 0 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, (double) (short) -1);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        double[] doubleArray5 = new double[] { 1.0d, 1L, 100.0f, (short) 100, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 1.0d);
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        double[] doubleArray6 = new double[] { (-1.0d), (-1.0d), 'a', '#', (-1.0d), (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 10);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        double[] doubleArray3 = new double[] { (byte) 1, 100.0f, (byte) 10 };
        double[] doubleArray5 = new double[] { (short) 1 };
        double[] doubleArray8 = new double[] { (byte) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray8, (double) (-1L));
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        double[] doubleArray6 = new double[] { 1.0f, (byte) 100, 0L, 1L, (byte) 1, (byte) 1 };
        double[] doubleArray10 = new double[] { (byte) 10, 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) (-1L));
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { '#', ' ' };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray4, (double) ' ');
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        double[] doubleArray2 = new double[] { (-1.0f), 100.0f };
        double[] doubleArray4 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 'a');
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        double[] doubleArray3 = new double[] { 10, 1.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10.0f);
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        double[] doubleArray2 = new double[] { (-1.0f), (-1.0d) };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        double[] doubleArray6 = new double[] { (short) 0, 10, (byte) 10, 100.0d, (byte) 100, '4' };
        double[] doubleArray13 = new double[] { 0.0f, 10, 0.0d, 1.0d, (byte) 0, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) 10);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        double[] doubleArray2 = new double[] { 1.0f, 10 };
        double[] doubleArray5 = new double[] { 0.0d, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) (byte) 100);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        double[] doubleArray6 = new double[] { (short) 1, (-1.0f), 'a', 1, 1L, (short) -1 };
        double[] doubleArray12 = new double[] { 100.0f, (byte) 0, (byte) 0, (-1L), 100.0f };
        double[] doubleArray19 = new double[] { (byte) 1, 10, 10, (short) -1, 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray19, (double) 'a');
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        double[] doubleArray5 = new double[] { 10.0d, (-1), (short) 0, (short) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { (short) 10, (byte) 10, (byte) 10, (short) -1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100.0f, '4', 10.0d };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray5, (double) 0L);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        double[] doubleArray5 = new double[] { (short) 10, 1.0d, '#', (short) -1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 0);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0d, 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, 1.0d);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        double[] doubleArray5 = new double[] { 1, 1.0f, (short) 0, 0.0f, (-1) };
        double[] doubleArray12 = new double[] { 100L, '4', (byte) 100, '4', (-1.0d), 100.0f };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray13, (double) (byte) 1);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { '#', (short) 0, 100, ' ' };
        double[] doubleArray7 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (-1.0d));
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        double[] doubleArray2 = new double[] { (short) -1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 1);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        double[] doubleArray4 = new double[] { (short) 100, 1.0f, 10, '#' };
        double[] doubleArray7 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray12 = new double[] { 1, (byte) 100, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) '4');
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        double[] doubleArray1 = new double[] { 100L };
        double[] doubleArray6 = new double[] { 1.0f, 100L, ' ', (byte) 1 };
        double[] doubleArray9 = new double[] { 1L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        double[] doubleArray1 = new double[] { 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 1);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10.0d, 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray4, (double) 100);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        double[] doubleArray4 = new double[] { (short) -1, 0.0d, 100.0d, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10L);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        double[] doubleArray1 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (-1.0d));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray5 = new double[] { 100, 1, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) (-1));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        double[] doubleArray5 = new double[] { (byte) 1, 0.0d, 0.0f, 100, 0.0f };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { (-1L), 1L, 1.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        double[] doubleArray3 = new double[] { ' ', (short) 0, 10 };
        double[] doubleArray6 = new double[] { (-1.0d), 0 };
        double[] doubleArray10 = new double[] { 10L, (byte) 0, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray10, (double) 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 100, '#', (byte) 10, 1L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray7, 1.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        double[] doubleArray4 = new double[] { 10.0d, 1.0d, 'a', 1 };
        double[] doubleArray7 = new double[] { 100.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) '4');
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        double[] doubleArray2 = new double[] { (byte) 0, 0 };
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 100, (byte) 10, (short) 0, 10, 100 };
        double[] doubleArray13 = new double[] { (-1.0f), 10, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray13, (double) (short) 1);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        double[] doubleArray3 = new double[] { 'a', 10.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        double[] doubleArray5 = new double[] { 100, 0, 100L, 1L, '#' };
        double[] doubleArray11 = new double[] { (short) 10, (-1.0d), (byte) -1, 100.0d, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (-1.0f));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        double[] doubleArray4 = new double[] { 1, (-1), (byte) 1, (-1) };
        double[] doubleArray6 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        double[] doubleArray6 = new double[] { 'a', (-1.0f), (byte) 10, 10.0f, (-1.0d), (-1.0d) };
        double[] doubleArray10 = new double[] { 0, (-1), 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, 0.0d);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        double[] doubleArray2 = new double[] { (short) 0, (short) 100 };
        double[] doubleArray4 = new double[] { (short) -1 };
        double[] doubleArray8 = new double[] { 1.0f, 0.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0d), (-1), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) 100);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray7 = new double[] { 100.0d, 1.0f, 100.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray7, (double) 0);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray5 = new double[] { (byte) 100, ' ', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (-1.0d));
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        double[] doubleArray3 = new double[] { 0.0f, (short) -1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        double[] doubleArray4 = new double[] { (-1L), (-1), 100, ' ' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        double[] doubleArray5 = new double[] { 1L, (byte) 10, 'a', (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1L));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        double[] doubleArray3 = new double[] { (short) 10, 100.0d, 1L };
        double[] doubleArray9 = new double[] { 1L, 100, 1.0d, (byte) 0, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, 1.0d);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        double[] doubleArray6 = new double[] { 100.0f, 10, (-1), 1, '4', 100 };
        double[] doubleArray11 = new double[] { (short) 10, 10.0f, 1.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray6, (double) 0L);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        double[] doubleArray4 = new double[] { '4', (-1), 1.0f, 1 };
        double[] doubleArray8 = new double[] { '4', (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        double[] doubleArray2 = new double[] { 10L, (short) 100 };
        double[] doubleArray9 = new double[] { (-1L), (byte) 1, 10.0f, (byte) 10, (-1.0d), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray9, (double) 10L);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray7 = new double[] { 0.0f, 100.0d, 10.0d, 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray6 = new double[] { 10.0f, 100.0d, (byte) 1, ' ' };
        double[] doubleArray10 = new double[] { (-1.0f), (byte) 10, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray10, 10.0d);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        double[] doubleArray4 = new double[] { '4', (short) 100, (short) 100, (short) 0 };
        double[] doubleArray7 = new double[] { (byte) 1, (byte) 1 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray8, 100.0d);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        double[] doubleArray6 = new double[] { (byte) 10, (-1.0f), 0.0d, (-1), (byte) -1, 0.0f };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (short) -1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        double[] doubleArray4 = new double[] { (short) 10, (byte) 100, (byte) 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 1.0d);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray5 = new double[] { (-1), (short) 1, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, 0.0d);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        double[] doubleArray2 = new double[] { (byte) 10, 0 };
        double[] doubleArray5 = new double[] { (short) 10, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, (double) 100);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10.0f };
        double[] doubleArray6 = new double[] { '4', ' ', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        double[] doubleArray3 = new double[] { (byte) 100, (-1), (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10L);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        double[] doubleArray5 = new double[] { (short) 100, ' ', (byte) 1, 0.0f, 100.0d };
        double[] doubleArray9 = new double[] { (-1), (byte) 0, 1L };
        double[] doubleArray15 = new double[] { (-1.0d), (short) -1, 1.0d, 0.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray15, 0.0d);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        double[] doubleArray1 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) ' ');
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        double[] doubleArray4 = new double[] { 1, (byte) 10, (byte) 10, (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        double[] doubleArray3 = new double[] { 100.0d, 100.0f, (byte) -1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        double[] doubleArray3 = new double[] { '#', 0, 1 };
        double[] doubleArray9 = new double[] { 1L, 10, 1, 0, (-1.0d) };
        double[] doubleArray14 = new double[] { (byte) 100, (short) 1, (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray14, (double) (byte) -1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        double[] doubleArray4 = new double[] { (short) 1, 10L, 10L, 'a' };
        double[] doubleArray9 = new double[] { 10.0f, (-1L), 100, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, (double) (byte) 1);
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        double[] doubleArray4 = new double[] { 100, 10.0f, 1, (-1.0f) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 10.0d, '#', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, 100.0d);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        double[] doubleArray6 = new double[] { (byte) 0, 100.0f, (-1), 10, 1L, 10 };
        double[] doubleArray13 = new double[] { 1, 100L, 1.0f, 0.0d, 100.0f, 'a' };
        double[] doubleArray16 = new double[] { 100.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray16, (double) (short) 100);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 0L);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        double[] doubleArray3 = new double[] { 100.0d, 100L, (-1.0d) };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) 1);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (byte) 100, (short) 10, (-1L), 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (short) 10);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        double[] doubleArray5 = new double[] { (byte) 0, 1.0d, 'a', ' ', (byte) 10 };
        double[] doubleArray9 = new double[] { 10.0d, 1.0d, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (short) -1, 1.0d, (-1.0f), 0L };
        double[] doubleArray10 = new double[] { (short) 0, 10.0d, '#', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) ' ');
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        double[] doubleArray3 = new double[] { 10L, (byte) 1, (byte) -1 };
        double[] doubleArray6 = new double[] { (-1L), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (-1.0d));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { 0L, (-1.0d), 0.0f, (short) 100 };
        double[] doubleArray10 = new double[] { (short) 0, 0.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray10, (double) (-1.0f));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        double[] doubleArray5 = new double[] { 0.0f, (-1.0f), (byte) -1, (short) 100, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        double[] doubleArray4 = new double[] { (short) 100, (-1.0f), (short) 10, (-1L) };
        double[] doubleArray6 = new double[] { 1 };
        double[] doubleArray8 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray8, (double) (byte) 100);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        double[] doubleArray3 = new double[] { 1.0f, 0.0d, 100L };
        double[] doubleArray7 = new double[] { ' ', (short) 1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray7, (double) 1L);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        double[] doubleArray2 = new double[] { 100L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 10.0f);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 1, 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray6, (double) 100L);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        double[] doubleArray4 = new double[] { 10, 100, (short) 1, 1L };
        double[] doubleArray8 = new double[] { (-1.0d), 0.0f, 0.0f };
        double[] doubleArray15 = new double[] { (byte) 1, 0, 1L, 10L, (-1.0f), (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, 10.0d);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        double[] doubleArray4 = new double[] { 0.0f, ' ', 100.0d, ' ' };
        double[] doubleArray11 = new double[] { (byte) 1, 0, (-1.0f), (-1), (-1L), 0.0d };
        double[] doubleArray16 = new double[] { 1L, (-1L), 'a', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray16, (double) 100);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        double[] doubleArray5 = new double[] { (short) 1, (short) 100, (byte) 100, (short) 0, ' ' };
        double[] doubleArray8 = new double[] { (-1.0d), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) '4');
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray0, (double) (byte) 100);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        double[] doubleArray3 = new double[] { 10L, ' ', '4' };
        double[] doubleArray6 = new double[] { 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (-1.0d));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray7 = new double[] { '#', (-1.0f), (-1.0f), '4', 1L };
        double[] doubleArray9 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray9, (double) '#');
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 100, (short) 10, (short) -1, '#', (-1L) };
        double[] doubleArray9 = new double[] { ' ', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray9, 1.0d);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 1.0f, 1, (byte) -1, 0.0f, ' ' };
        double[] doubleArray11 = new double[] { 100, 100.0d, (byte) 0, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, (double) 0.0f);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 0, (byte) 0 };
        double[] doubleArray10 = new double[] { 0, 0L, 1, '4', (-1L), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray10, (double) (short) 1);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        double[] doubleArray6 = new double[] { (-1L), 0, '4', 0.0f, (byte) 10, (short) 0 };
        double[] doubleArray9 = new double[] { 10L, 'a' };
        double[] doubleArray15 = new double[] { 'a', (-1.0d), 0L, 0, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, (double) ' ');
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        double[] doubleArray5 = new double[] { (short) 1, 100.0d, 1L, (short) 10, 1 };
        double[] doubleArray7 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray7, (double) 1.0f);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        double[] doubleArray2 = new double[] { 'a', (byte) -1 };
        double[] doubleArray8 = new double[] { 0L, (byte) 100, '4', (short) -1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, (double) (-1));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        double[] doubleArray4 = new double[] { '#', 10.0d, 'a', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        double[] doubleArray2 = new double[] { 10.0d, 100L };
        double[] doubleArray8 = new double[] { 100.0d, 100, 100, (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { '4', 0, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) 0L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        double[] doubleArray4 = new double[] { (byte) -1, 1, (byte) 100, (short) 0 };
        double[] doubleArray9 = new double[] { 1, ' ', (short) -1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) '4');
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        double[] doubleArray6 = new double[] { 0.0f, ' ', 'a', (-1.0d), 1, 0.0f };
        double[] doubleArray12 = new double[] { 'a', (byte) 1, (-1), 10L, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) (byte) 100);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        double[] doubleArray3 = new double[] { (short) 100, '#', '4' };
        double[] doubleArray5 = new double[] { 0.0f };
        double[] doubleArray8 = new double[] { 1.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray8, (double) 10L);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] { (short) 1, (short) 100 };
        double[] doubleArray8 = new double[] { 100L, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        double[] doubleArray3 = new double[] { (-1L), '#', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (-1));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray8 = new double[] { 1.0f, 0.0d, (short) 0, 'a', 1L, (short) -1 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray9, (double) (short) 100);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        double[] doubleArray6 = new double[] { '#', (short) 0, 100, (short) 1, 10.0d, 100.0d };
        double[] doubleArray12 = new double[] { 1, 0L, (short) 0, 0.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 100);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        double[] doubleArray2 = new double[] { 0.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) -1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        double[] doubleArray2 = new double[] { (short) -1, (short) -1 };
        double[] doubleArray7 = new double[] { 1.0d, (short) 1, (byte) -1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 100L);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        double[] doubleArray2 = new double[] { 0.0d, (byte) 0 };
        double[] doubleArray4 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray4, (double) ' ');
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        double[] doubleArray4 = new double[] { 100L, 10, 0, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray3 = new double[] { 0.0d };
        double[] doubleArray10 = new double[] { 1, 1L, (short) 10, 10, 0.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray10, (double) 0);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        double[] doubleArray6 = new double[] { (-1), 100, 0, 10.0d, (byte) 100, 100.0d };
        double[] doubleArray9 = new double[] { 1, (byte) 10 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray10, (double) 0);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        double[] doubleArray3 = new double[] { (-1.0d), 'a', 0.0f };
        double[] doubleArray8 = new double[] { (byte) -1, 10.0f, 0L, (short) 100 };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        double[] doubleArray5 = new double[] { (-1), 0, (byte) 0, 'a', (byte) 1 };
        double[] doubleArray12 = new double[] { (short) 0, (byte) 0, '4', (byte) 10, 10.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, 100.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) -1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) (byte) 10);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        double[] doubleArray4 = new double[] { 10.0d, 0, 10, 100.0d };
        double[] doubleArray6 = new double[] { (-1) };
        double[] doubleArray8 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray8, 10.0d);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        double[] doubleArray3 = new double[] { 100L, (byte) 1, '#' };
        double[] doubleArray6 = new double[] { 10.0f, (byte) 10 };
        double[] doubleArray10 = new double[] { (byte) 1, (short) -1, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray10, (double) 100L);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 0, (short) -1, (byte) -1, (-1), 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100, (byte) 10, (short) 1, (-1), 100.0d };
        double[] doubleArray13 = new double[] { 0.0d, (byte) 0, 10L, 0, 10.0d, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray13, (double) 100.0f);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        double[] doubleArray5 = new double[] { (short) -1, (byte) 100, (-1), 0, 100L };
        double[] doubleArray7 = new double[] { 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, (double) (short) -1);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        double[] doubleArray5 = new double[] { 1L, 100L, 0L, 100.0f, 10.0d };
        double[] doubleArray7 = new double[] { 10 };
        double[] doubleArray12 = new double[] { (short) 0, 10.0d, (-1.0d), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray12, (double) ' ');
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        double[] doubleArray4 = new double[] { 1.0f, (-1.0d), (byte) 10, '#' };
        double[] doubleArray6 = new double[] { 10.0d };
        double[] doubleArray12 = new double[] { 100, 100L, (short) 1, (short) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray12, 100.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        double[] doubleArray3 = new double[] { 0, 0L, (byte) 0 };
        double[] doubleArray9 = new double[] { (-1), '#', 1, (byte) -1, (-1.0f) };
        double[] doubleArray12 = new double[] { 1.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray12, 0.0d);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray7 = new double[] { 100.0f, 0.0f, 100, 0L, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, 0.0d);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) 0);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        double[] doubleArray4 = new double[] { 10L, (short) 10, 0.0f, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        double[] doubleArray3 = new double[] { 1.0d, (short) 1, (short) 10 };
        double[] doubleArray10 = new double[] { 100, (-1.0f), (-1.0d), 1.0f, (byte) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, (double) 'a');
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        double[] doubleArray3 = new double[] { 100, (byte) -1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        double[] doubleArray5 = new double[] { 0.0f, 10, 1L, (short) -1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '#');
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        double[] doubleArray2 = new double[] { 100.0d, 0.0f };
        double[] doubleArray7 = new double[] { (-1.0d), 100.0d, 100.0d, (byte) 100 };
        double[] doubleArray13 = new double[] { 100L, 100L, 10, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray13, (double) '4');
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        double[] doubleArray2 = new double[] { 0.0f, (short) 1 };
        double[] doubleArray6 = new double[] { 100L, 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        double[] doubleArray4 = new double[] { '4', 10.0f, 1L, '4' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        double[] doubleArray2 = new double[] { (short) 10, (-1L) };
        double[] doubleArray5 = new double[] { 1L, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        double[] doubleArray3 = new double[] { 0.0d, (-1), (-1.0d) };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray11 = new double[] { ' ', 100L, ' ', 0L, (-1.0d), 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray11, (double) (byte) 1);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        double[] doubleArray6 = new double[] { 0, 100L, 10L, 0, (-1L), 10L };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (byte) 10);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        double[] doubleArray2 = new double[] { 1, 10.0f };
        double[] doubleArray4 = new double[] { 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 1);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        double[] doubleArray2 = new double[] { 0.0f, 100.0f };
        double[] doubleArray5 = new double[] { (byte) 100, (byte) -1 };
        double[] doubleArray7 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        double[] doubleArray6 = new double[] { (short) 10, 0.0d, (byte) 0, (byte) 0, 0.0d, (-1.0d) };
        double[] doubleArray13 = new double[] { '4', (-1.0f), (byte) 1, (-1.0d), 0, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) 100);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        double[] doubleArray6 = new double[] { 1.0d, 10, (short) 100, 100L, ' ', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10L);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        double[] doubleArray5 = new double[] { (short) 1, (short) 100, (-1), 'a', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        double[] doubleArray3 = new double[] { 100.0d, (-1L), (short) 100 };
        double[] doubleArray6 = new double[] { (-1.0f), 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (-1L));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        double[] doubleArray6 = new double[] { 0L, (short) 100, 1L, 100.0d, (short) 10, (-1) };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, 0.0d);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        double[] doubleArray4 = new double[] { 10.0d, '4', 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (-1.0d));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        double[] doubleArray2 = new double[] { '#', 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '#');
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        double[] doubleArray4 = new double[] { 10L, 1.0f, '#', 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 'a');
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        double[] doubleArray5 = new double[] { (short) 0, 10L, 10.0d, (-1L), 1L };
        double[] doubleArray9 = new double[] { '4', 1.0d, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray5, (double) 1);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        double[] doubleArray2 = new double[] { (short) 0, 10 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray2, (-1.0d));
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        double[] doubleArray5 = new double[] { 0.0d, (byte) 10, 1L, (-1.0f), (short) -1 };
        double[] doubleArray10 = new double[] { 0, (byte) 100, '#', 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 10L);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        double[] doubleArray3 = new double[] { (short) 10, (-1), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 0);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        double[] doubleArray4 = new double[] { (byte) 10, 1L, (-1.0d), (byte) 100 };
        double[] doubleArray7 = new double[] { (byte) 10, 10L };
        double[] doubleArray10 = new double[] { (-1.0f), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray10, (double) 0L);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        double[] doubleArray6 = new double[] { (-1.0f), '#', 0.0f, 10, (byte) 1, 1.0f };
        double[] doubleArray9 = new double[] { '#', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        double[] doubleArray3 = new double[] { 100L, (-1.0f), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 1L);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray3 = new double[] { 0.0f };
        double[] doubleArray7 = new double[] { 0, 1L, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        double[] doubleArray4 = new double[] { '#', 1L, 100.0f, (byte) 100 };
        double[] doubleArray9 = new double[] { 100, 10.0f, 100.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 'a');
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { '#', (byte) 0, 0L, 0, 1L, 100 };
        double[] doubleArray9 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray9, (double) 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        double[] doubleArray6 = new double[] { 'a', (byte) 1, (short) 1, 1, (short) 100, ' ' };
        double[] doubleArray11 = new double[] { (-1), 10, 10, 0.0d };
        double[] doubleArray16 = new double[] { 10L, (byte) 10, 'a', (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray16, 1.0d);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        double[] doubleArray6 = new double[] { '4', 10L, (byte) 10, (short) 1, (byte) 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        double[] doubleArray1 = new double[] { 1.0f };
        double[] doubleArray4 = new double[] { 1.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, 0.0d);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        double[] doubleArray5 = new double[] { 100, 10.0d, 0L, ' ', 10.0d };
        double[] doubleArray8 = new double[] { (-1), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        double[] doubleArray2 = new double[] { 0.0f, 0L };
        double[] doubleArray9 = new double[] { 1.0d, ' ', 100, 0.0d, (byte) -1, 0.0d };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray10, (double) '4');
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        double[] doubleArray5 = new double[] { 0, (byte) 10, (short) -1, (short) 100, 0.0f };
        double[] doubleArray12 = new double[] { 1, (short) -1, 10, (byte) -1, (-1.0f), 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (-1.0f));
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        double[] doubleArray3 = new double[] { 1.0f, 'a', 1.0f };
        double[] doubleArray5 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, (double) 10L);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 100.0f, (short) -1, 0, 0.0d, (short) -1 };
        double[] doubleArray8 = new double[] { 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray8, (double) 0);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        double[] doubleArray2 = new double[] { (short) 100, (short) 10 };
        double[] doubleArray7 = new double[] { '4', (byte) 1, 'a', '#' };
        double[] doubleArray12 = new double[] { 1, (byte) 100, 0.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray12, (double) (byte) 100);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray6 = new double[] { (short) 1, (short) 10, 1L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) (-1L));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { (-1.0f), 1, (-1L), 1.0f, 1L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray1, (double) '4');
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        double[] doubleArray5 = new double[] { 10.0d, 0.0f, (-1.0f), (short) -1, (byte) 0 };
        double[] doubleArray9 = new double[] { 10, (byte) -1, (byte) 100 };
        double[] doubleArray16 = new double[] { (short) 10, 10.0d, 0.0f, (short) 100, 100.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray16, (double) '#');
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        double[] doubleArray2 = new double[] { (byte) 0, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        double[] doubleArray4 = new double[] { 1L, 10, 1.0d, '4' };
        double[] doubleArray10 = new double[] { (short) 1, (short) -1, 100L, (-1), (short) 100 };
        double[] doubleArray15 = new double[] { (byte) 100, (-1.0f), (-1.0f), 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray15, (double) ' ');
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        double[] doubleArray6 = new double[] { 10.0d, '4', 0.0d, 0, (-1L), (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10L);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) -1, 0.0d, 0.0f, 0.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) 1);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        double[] doubleArray5 = new double[] { (-1.0d), 100.0d, (short) 1, 0.0f, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        double[] doubleArray6 = new double[] { (-1), 0.0d, 100L, 10, '4', (-1) };
        double[] doubleArray8 = new double[] { 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        double[] doubleArray5 = new double[] { (byte) -1, 'a', 10.0d, 10L, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '4');
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        double[] doubleArray4 = new double[] { 100, 1.0f, 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 100.0f);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        double[] doubleArray3 = new double[] { (short) 0, (-1), 1 };
        double[] doubleArray8 = new double[] { '#', (short) 0, '4', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 100L);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        double[] doubleArray2 = new double[] { 'a', 'a' };
        double[] doubleArray7 = new double[] { '#', 0L, 0L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 10);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        double[] doubleArray1 = new double[] { 1L };
        double[] doubleArray5 = new double[] { 0L, '#', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) (byte) 100);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        double[] doubleArray3 = new double[] { (-1), (-1.0d), (short) 0 };
        double[] doubleArray6 = new double[] { 0.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray3, (double) 100L);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        double[] doubleArray3 = new double[] { 10.0d, 1, (byte) 10 };
        double[] doubleArray8 = new double[] { (short) 10, 10L, (-1.0d), 1.0f };
        double[] doubleArray13 = new double[] { 10L, 100.0d, 'a', 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray13, (double) (byte) 1);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        double[] doubleArray4 = new double[] { 1.0d, '4', 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (-1));
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        double[] doubleArray6 = new double[] { 10.0f, (-1.0f), (-1L), 10.0f, 10.0d, 10L };
        double[] doubleArray13 = new double[] { 1.0d, 0.0f, (byte) -1, (byte) 1, 1.0f, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, (double) 1L);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        double[] doubleArray5 = new double[] { (byte) 0, 0L, (byte) 10, 'a', ' ' };
        double[] doubleArray11 = new double[] { (-1L), 0.0d, (short) -1, (-1.0f), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray11, (double) 0.0f);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        double[] doubleArray5 = new double[] { 10, 10, 0L, (byte) -1, (byte) 0 };
        double[] doubleArray8 = new double[] { 'a', '#' };
        double[] doubleArray12 = new double[] { 1.0d, 0.0f, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray12, (double) 10L);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        double[] doubleArray5 = new double[] { 1, (short) 1, '4', 10L, (-1.0f) };
        double[] doubleArray9 = new double[] { 10.0d, 0.0f, 100.0f };
        double[] doubleArray15 = new double[] { 0, 1.0d, 'a', 10L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray15, 10.0d);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        double[] doubleArray6 = new double[] { (short) 10, 10.0f, 10L, 1L, 0, 100 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray10 = new double[] { (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray10, (double) 100L);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { '4', 'a' };
        double[] doubleArray6 = new double[] { (-1.0f), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        double[] doubleArray4 = new double[] { (byte) 1, (short) -1, 10, (-1.0f) };
        double[] doubleArray7 = new double[] { 0.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray4, (double) 1L);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        double[] doubleArray3 = new double[] { (byte) 1, (-1.0f), (byte) 10 };
        double[] doubleArray8 = new double[] { 100L, 0L, 1.0d, (short) 1 };
        double[] doubleArray14 = new double[] { 0.0f, '#', 10L, (byte) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray14, (double) 100);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        double[] doubleArray4 = new double[] { 1.0f, 10.0d, (-1), 1 };
        double[] doubleArray8 = new double[] { 0.0d, 10, 100.0d };
        double[] doubleArray11 = new double[] { '#', (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray11, (double) (byte) 100);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        double[] doubleArray2 = new double[] { (byte) -1, 0.0d };
        double[] doubleArray8 = new double[] { '4', (short) 10, (short) 100, 100, (-1L) };
        double[] doubleArray11 = new double[] { 100L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray11, (double) '4');
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        double[] doubleArray6 = new double[] { 1.0d, (short) 10, 10.0f, (short) 1, 0L, ' ' };
        double[] doubleArray11 = new double[] { (byte) -1, 10.0f, 0.0f, (short) 10 };
        double[] doubleArray14 = new double[] { 100.0d, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray14, (double) 100L);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        double[] doubleArray4 = new double[] { (byte) -1, 10, 0.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 0.0f, 100L, (-1.0d), (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) '#');
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        double[] doubleArray3 = new double[] { 100.0f, 0.0f, (byte) -1 };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 0, (byte) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 'a');
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        double[] doubleArray5 = new double[] { (byte) 100, 1L, 1.0d, 100.0d, (-1L) };
        double[] doubleArray7 = new double[] { (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        double[] doubleArray6 = new double[] { '#', 10.0f, (-1), '4', 0.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) (byte) -1);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        double[] doubleArray2 = new double[] { 100.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (-1L));
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        double[] doubleArray2 = new double[] { 0L, (short) 10 };
        double[] doubleArray9 = new double[] { 0, (-1L), (-1L), 1, 0, (byte) -1 };
        double[] doubleArray12 = new double[] { (byte) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray12, 0.0d);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        double[] doubleArray6 = new double[] { (-1.0f), (short) 100, (short) 1, 0.0f, 100.0f, (short) 0 };
        double[] doubleArray9 = new double[] { (byte) 0, 10.0d };
        double[] doubleArray15 = new double[] { (byte) 0, (short) 0, 0L, (-1.0f), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, (double) (short) 0);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        double[] doubleArray2 = new double[] { 1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0d);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        double[] doubleArray2 = new double[] { (-1L), 100.0d };
        double[] doubleArray7 = new double[] { '#', (short) 10, 0.0f, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 100.0f);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        double[] doubleArray5 = new double[] { 1L, 10, (-1), (-1.0f), (byte) 0 };
        double[] doubleArray9 = new double[] { (-1L), (short) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        double[] doubleArray6 = new double[] { 1.0f, 10L, (short) 10, 10.0f, 1L, (short) 1 };
        double[] doubleArray9 = new double[] { (short) 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) (-1.0f));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        double[] doubleArray6 = new double[] { 1L, 100, 0L, (-1), (byte) 10, 10.0d };
        double[] doubleArray9 = new double[] { (short) 1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 0L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 100, 10 };
        double[] doubleArray8 = new double[] { (short) 100, 100.0d, (-1.0f), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray6 = new double[] { 100L, 1, ' ', '4' };
        double[] doubleArray11 = new double[] { 1.0d, 10L, 10.0d, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray11, (double) (short) 1);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        double[] doubleArray2 = new double[] { (short) 0, 100L };
        double[] doubleArray8 = new double[] { '4', 10, 1.0d, (-1.0f), 0.0d };
        double[] doubleArray14 = new double[] { (-1.0f), (short) 100, (-1.0d), (-1), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, (double) (short) 1);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        double[] doubleArray5 = new double[] { (byte) 100, 10L, (byte) 10, 100.0f, 1 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0d, 100.0f, (-1.0d), 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray12, (double) 0);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        double[] doubleArray6 = new double[] { (short) 100, 100.0d, (short) 0, 1L, (-1L), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 0);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        double[] doubleArray3 = new double[] { (byte) 10, (short) 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (-1L));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        double[] doubleArray2 = new double[] { 0.0d, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '#');
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        double[] doubleArray2 = new double[] { '#', (short) -1 };
        double[] doubleArray8 = new double[] { 'a', '#', (-1.0f), (-1), '4' };
        double[] doubleArray14 = new double[] { 'a', (-1L), '4', 0, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray14, (double) 1);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        double[] doubleArray3 = new double[] { '4', 0.0d, 100.0f };
        double[] doubleArray9 = new double[] { 100.0f, 'a', (-1), (-1), (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray3, (double) '#');
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        double[] doubleArray2 = new double[] { (byte) 10, (-1) };
        double[] doubleArray6 = new double[] { 0.0f, (short) 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        double[] doubleArray6 = new double[] { 0, 1, 100L, (-1.0f), 10.0f, 1 };
        double[] doubleArray9 = new double[] { (short) 1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) 10L);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray5 = new double[] { (byte) 1, (byte) -1, 0.0d };
        double[] doubleArray6 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray6, (double) (-1));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        double[] doubleArray4 = new double[] { (short) 0, 0.0d, (short) 100, (-1L) };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { (-1L), 100.0f, 1L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        double[] doubleArray5 = new double[] { 1.0f, 'a', (short) -1, (-1.0f), 10L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, 0.0d);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        double[] doubleArray5 = new double[] { (byte) -1, '4', 1.0d, 0.0d, (short) 10 };
        double[] doubleArray12 = new double[] { (byte) 1, 100.0f, 10, (byte) 1, (short) 0, (byte) 1 };
        double[] doubleArray17 = new double[] { (-1.0f), 100.0d, (short) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray17, (double) (-1));
    }
}
