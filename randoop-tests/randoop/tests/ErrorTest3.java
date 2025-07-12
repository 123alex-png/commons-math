package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        double[] doubleArray4 = new double[] { 10, (short) 1, (short) 10, 0L };
        double[] doubleArray7 = new double[] { '4', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) '#');
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        double[] doubleArray3 = new double[] { 1L, (short) -1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 0.0d);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        double[] doubleArray3 = new double[] { (-1L), 'a', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10.0f);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        double[] doubleArray5 = new double[] { 10, 100L, (byte) 100, 1L, 0L };
        double[] doubleArray11 = new double[] { (short) 1, (-1.0d), 1.0f, (short) 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) '#');
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        double[] doubleArray3 = new double[] { 100L, (-1L), 0.0f };
        double[] doubleArray9 = new double[] { (-1.0f), (short) 100, 100.0f, 100.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray9, (-1.0d));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray5 = new double[] { (short) 100, (-1L), 10L };
        double[] doubleArray10 = new double[] { 10, (short) 10, (short) 0, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray10, (double) 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 10L, 100, 0 };
        double[] doubleArray6 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        double[] doubleArray4 = new double[] { (short) -1, 0L, 10, 10.0d };
        double[] doubleArray11 = new double[] { (byte) 10, (-1L), 0.0f, (-1.0d), (-1L), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) (short) -1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0f), 1.0f, 0.0f, (short) 100 };
        double[] doubleArray7 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (double) (-1));
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        double[] doubleArray5 = new double[] { (short) 0, 10, (byte) 10, 'a', 10.0f };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray11 = new double[] { 10L, 10, (short) 1, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray11, (double) 1L);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        double[] doubleArray2 = new double[] { 100, 1.0f };
        double[] doubleArray7 = new double[] { (byte) 1, 10, (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) 0L);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        double[] doubleArray4 = new double[] { (byte) 0, '4', 1.0f, (short) 100 };
        double[] doubleArray8 = new double[] { 0.0f, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) (-1L));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray1, (double) 10.0f);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray5 = new double[] { 10, 1, (short) 1 };
        double[] doubleArray8 = new double[] { (byte) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray8, (double) (byte) 10);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        double[] doubleArray2 = new double[] { (-1), 10 };
        double[] doubleArray6 = new double[] { (-1.0f), 10L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (-1.0d));
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        double[] doubleArray2 = new double[] { (short) 1, (short) 100 };
        double[] doubleArray6 = new double[] { (byte) -1, 10L, 0L };
        double[] doubleArray12 = new double[] { 10L, ' ', ' ', (short) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray12, 100.0d);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        double[] doubleArray6 = new double[] { 0, 10.0d, (byte) 0, 100, (short) 100, 10.0f };
        double[] doubleArray9 = new double[] { (-1.0d), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray9, (double) (byte) 100);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        double[] doubleArray4 = new double[] { 0L, ' ', 100.0d, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 0);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        double[] doubleArray5 = new double[] { 10.0d, 100L, 100, 100, 10.0d };
        double[] doubleArray12 = new double[] { (short) 100, (short) 0, (short) 0, (short) 100, (short) -1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, 100.0d);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        double[] doubleArray5 = new double[] { (byte) 1, 100.0f, 1.0d, 100, (byte) -1 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        double[] doubleArray5 = new double[] { 1L, 0.0d, 1.0d, 100.0f, (short) 1 };
        double[] doubleArray12 = new double[] { (-1L), (-1.0d), 0.0d, (byte) 0, 10.0f, 100.0f };
        double[] doubleArray19 = new double[] { (short) -1, '#', 0, (short) 10, 0L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray19, (double) 1.0f);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        double[] doubleArray4 = new double[] { '4', (-1L), 100, '4' };
        double[] doubleArray11 = new double[] { ' ', 10.0d, (short) 10, (-1L), 10L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (-1L));
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray6 = new double[] { 1L, 10.0d, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) (-1L));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        double[] doubleArray5 = new double[] { (short) 10, (byte) -1, (short) 1, ' ', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        double[] doubleArray2 = new double[] { 10L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 1.0f);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        double[] doubleArray5 = new double[] { (short) 1, (-1L), 10.0f, (byte) 100, (byte) 100 };
        double[] doubleArray8 = new double[] { 0.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray5, 1.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        double[] doubleArray3 = new double[] { ' ', 10, (byte) 1 };
        double[] doubleArray9 = new double[] { (-1.0f), (short) 10, (byte) 100, ' ', 1L };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray10, (double) 1);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        double[] doubleArray5 = new double[] { 'a', 0, 10.0d, 100, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '#');
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        double[] doubleArray5 = new double[] { 1L, 100L, '4', 1L, 100 };
        double[] doubleArray12 = new double[] { 0L, 10L, (short) 0, 100, ' ', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (short) 1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        double[] doubleArray3 = new double[] { 1.0d, 10.0f, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray8 = new double[] { 0L, (byte) 1, 0, (byte) 100, (byte) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray5 = new double[] { (byte) 100, ' ', 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) 1L);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        double[] doubleArray6 = new double[] { '4', 'a', 10, (short) -1, 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray4 = new double[] { 100L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray4, (double) 0);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        double[] doubleArray6 = new double[] { (byte) 1, 100.0f, 1.0d, 0L, (byte) 0, (short) 0 };
        double[] doubleArray13 = new double[] { (byte) 0, (short) 0, ' ', (-1.0f), 100.0d, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 100.0f, (-1), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) 0L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        double[] doubleArray1 = new double[] { ' ' };
        double[] doubleArray5 = new double[] { (byte) 100, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (short) 100);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        double[] doubleArray6 = new double[] { 100, 1.0f, (-1.0d), 10.0d, '4', 10 };
        double[] doubleArray11 = new double[] { 0.0f, 10, '4', 10.0f };
        double[] doubleArray14 = new double[] { 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray14, (double) '#');
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        double[] doubleArray5 = new double[] { (-1.0f), (-1.0d), (byte) 100, 10.0d, 1.0d };
        double[] doubleArray12 = new double[] { (short) 1, 10.0d, (short) -1, '#', (-1), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (short) 100);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        double[] doubleArray6 = new double[] { (byte) 1, 1.0d, (short) 10, (-1.0f), 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        double[] doubleArray4 = new double[] { (byte) 10, (short) 100, 10.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 0);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        double[] doubleArray6 = new double[] { 1.0f, (byte) -1, 0, 0L, 1.0f, 10.0f };
        double[] doubleArray8 = new double[] { 100 };
        double[] doubleArray12 = new double[] { 10, ' ', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray12, (double) 1.0f);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        double[] doubleArray5 = new double[] { '#', 10.0f, 100L, 1, 'a' };
        double[] doubleArray11 = new double[] { '#', 'a', 1.0f, 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, (double) (-1));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        double[] doubleArray4 = new double[] { (short) 100, 1, '#', 0L };
        double[] doubleArray6 = new double[] { (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        double[] doubleArray2 = new double[] { 1L, 100.0d };
        double[] doubleArray6 = new double[] { 10, (-1L), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray6, (double) (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        double[] doubleArray2 = new double[] { 1.0f, (byte) -1 };
        double[] doubleArray4 = new double[] { (short) -1 };
        double[] doubleArray8 = new double[] { 1L, 1.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray8, (double) '4');
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        double[] doubleArray1 = new double[] { 100 };
        double[] doubleArray6 = new double[] { 1.0d, (byte) -1, 0.0d, 100L };
        double[] doubleArray9 = new double[] { 10L, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        double[] doubleArray4 = new double[] { (byte) 100, 0L, 1.0d, 100.0d };
        double[] doubleArray7 = new double[] { (short) 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (double) 'a');
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray5 = new double[] { 1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray5, (double) ' ');
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (-1.0f));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        double[] doubleArray4 = new double[] { 10, (-1.0f), (-1.0f), '#' };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 1L);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        double[] doubleArray2 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray4 = new double[] { 1L };
        double[] doubleArray11 = new double[] { (byte) 1, (-1.0f), 10.0d, 0L, '4', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, (double) 'a');
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        double[] doubleArray6 = new double[] { 100.0f, (byte) 0, (short) 1, 0, 1L, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        double[] doubleArray5 = new double[] { (byte) 1, 100.0f, 10L, ' ', (byte) 10 };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { 100.0d, 1L, 100.0f, 0.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray12, (double) (-1.0f));
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        double[] doubleArray3 = new double[] { 0L, 10.0d, 1.0d };
        double[] doubleArray5 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, (double) (short) 100);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        double[] doubleArray5 = new double[] { (short) 1, (short) 0, 1.0d, 1.0f, (-1) };
        double[] doubleArray11 = new double[] { '#', (short) 10, (short) 10, 'a', (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray5, (double) '#');
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        double[] doubleArray2 = new double[] { 100, 'a' };
        double[] doubleArray4 = new double[] { 0.0f };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        double[] doubleArray1 = new double[] { 1.0d };
        double[] doubleArray8 = new double[] { 10.0f, (short) 100, '#', 1.0f, 'a', (byte) 1 };
        double[] doubleArray12 = new double[] { 10.0d, 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray12, (double) 1);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        double[] doubleArray6 = new double[] { '4', ' ', (short) 1, (byte) -1, (short) 100, (short) 1 };
        double[] doubleArray13 = new double[] { (short) 10, 1, 0.0f, (-1.0d), '#', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, 10.0d);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        double[] doubleArray5 = new double[] { 1, 'a', 1, 100.0d, (byte) 10 };
        double[] doubleArray12 = new double[] { (byte) 0, 0.0f, (byte) 1, 100, (-1.0d), 10.0d };
        double[] doubleArray15 = new double[] { 10.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray15, 10.0d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        double[] doubleArray2 = new double[] { (short) 1, 'a' };
        double[] doubleArray9 = new double[] { (short) 0, (short) 1, 100.0d, (byte) 1, 0, 10.0f };
        double[] doubleArray15 = new double[] { (short) -1, 100.0d, (short) 10, 1.0f, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray15, (double) (-1L));
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        double[] doubleArray3 = new double[] { 1.0d, '#', 1L };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, 10.0d);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        double[] doubleArray6 = new double[] { 0, 100L, '#', (short) 1, 0.0d, 10.0f };
        double[] doubleArray12 = new double[] { (-1.0f), 10, 100L, 100.0f, 0L };
        double[] doubleArray14 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray14, (double) (byte) -1);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        double[] doubleArray4 = new double[] { (short) 1, (short) 100, 1L, ' ' };
        double[] doubleArray11 = new double[] { (byte) -1, (byte) 100, 10.0f, (short) 1, '4', 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) '4');
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        double[] doubleArray6 = new double[] { 100.0f, 1, 10L, (-1.0d), 10L, 10.0f };
        double[] doubleArray13 = new double[] { 1, 0.0f, (-1L), (byte) 1, '#', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray6, (double) (-1));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        double[] doubleArray1 = new double[] { (-1.0f) };
        double[] doubleArray7 = new double[] { 100.0d, 1.0f, 0L, 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray1, (double) '#');
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        double[] doubleArray6 = new double[] { 0, (short) 100, (-1.0f), 10L, 10.0f, (-1.0d) };
        double[] doubleArray13 = new double[] { 10L, 0.0f, (short) 100, ' ', 1, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, (double) (short) 10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        double[] doubleArray3 = new double[] { '4', 0L, (byte) -1 };
        double[] doubleArray9 = new double[] { 1L, 1, 100, (short) -1, ' ' };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray10, (double) 'a');
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        double[] doubleArray6 = new double[] { '4', 0, 1.0d, 'a', 1L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        double[] doubleArray6 = new double[] { 10.0d, 0, 100, (byte) 1, (-1.0f), (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 'a');
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        double[] doubleArray4 = new double[] { (short) 100, 1.0f, (byte) 100, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100L, 1, 100L, '#' };
        double[] doubleArray12 = new double[] { 1.0f, (short) 0, '4', 100.0d, 0, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        double[] doubleArray2 = new double[] { (short) 0, 10.0d };
        double[] doubleArray5 = new double[] { '4', (short) 10 };
        double[] doubleArray8 = new double[] { (short) 10, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        double[] doubleArray5 = new double[] { (byte) -1, (short) 1, (byte) 1, (-1), 100.0d };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, 100.0d);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        double[] doubleArray2 = new double[] { (-1.0f), (short) 1 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] { 10.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray6, (double) (byte) 100);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        double[] doubleArray2 = new double[] { ' ', (-1) };
        double[] doubleArray6 = new double[] { 100.0d, (-1), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray6, 0.0d);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        double[] doubleArray4 = new double[] { (byte) 0, (byte) 100, 'a', 1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        double[] doubleArray5 = new double[] { 10.0f, 10L, (byte) 0, 100.0f, 100.0f };
        double[] doubleArray12 = new double[] { 10L, (short) 100, 0L, 100L, 10, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 0L);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        double[] doubleArray6 = new double[] { 10L, 1.0f, 100L, (-1L), 100.0f, (short) 100 };
        double[] doubleArray10 = new double[] { 10, 10.0d, 100L };
        double[] doubleArray17 = new double[] { 10.0f, (short) 0, 10.0d, 10, (byte) 1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray17, (double) '4');
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        double[] doubleArray3 = new double[] { (short) 10, (-1L), 1L };
        double[] doubleArray4 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        double[] doubleArray4 = new double[] { 0.0d, 1.0f, 100L, 100L };
        double[] doubleArray6 = new double[] { (byte) 0 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 100, (byte) -1, 1L, 100.0f };
        double[] doubleArray11 = new double[] { 10.0d, 0L, 'a', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray11, (double) (-1L));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        double[] doubleArray3 = new double[] { 10L, 1, 10.0f };
        double[] doubleArray7 = new double[] { 10L, (-1.0f), (byte) 10 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray8, 1.0d);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        double[] doubleArray5 = new double[] { (-1L), 100.0f, 1.0f, (short) 10, 10L };
        double[] doubleArray8 = new double[] { 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        double[] doubleArray4 = new double[] { ' ', 100L, (short) 1, 10 };
        double[] doubleArray9 = new double[] { (byte) 100, 10.0f, (short) -1, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 10L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        double[] doubleArray1 = new double[] { (short) -1 };
        double[] doubleArray5 = new double[] { 100.0d, 1, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        double[] doubleArray5 = new double[] { (-1L), 0.0f, (byte) 100, 10.0d, '#' };
        double[] doubleArray10 = new double[] { 10L, 0, (-1L), (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        double[] doubleArray4 = new double[] { '4', 0, (short) 10, 10L };
        double[] doubleArray8 = new double[] { (byte) 10, (byte) 100, 100.0f };
        double[] doubleArray15 = new double[] { 'a', 10, (byte) 1, 100.0d, (-1), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray15, (double) (byte) 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        double[] doubleArray4 = new double[] { 10.0f, (byte) 1, 10L, (-1L) };
        double[] doubleArray10 = new double[] { (-1.0d), 100, (-1.0f), 10, (short) 100 };
        double[] doubleArray11 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray11, (double) (byte) 0);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        double[] doubleArray1 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 0.0d);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        double[] doubleArray5 = new double[] { 100.0d, 10L, 100L, (short) -1, 0 };
        double[] doubleArray12 = new double[] { (short) 10, (byte) 10, (short) 1, (byte) -1, (byte) 100, 'a' };
        double[] doubleArray17 = new double[] { 1.0f, (-1.0d), 100.0f, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray17, (double) (short) 100);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray7 = new double[] { (byte) 100, (short) 1, 0.0f, 10, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, (double) 'a');
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        double[] doubleArray1 = new double[] { '#' };
        double[] doubleArray6 = new double[] { 10.0f, (byte) 1, 10.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        double[] doubleArray4 = new double[] { (short) 1, 100, 1L, 0 };
        double[] doubleArray11 = new double[] { (-1), 10.0f, (-1L), 0, (byte) 10, 10.0f };
        double[] doubleArray13 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { 0L, (byte) 10, 10.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray6, (double) 100L);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        double[] doubleArray2 = new double[] { (short) -1, (-1L) };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray5 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        double[] doubleArray2 = new double[] { 1.0d, 0.0f };
        double[] doubleArray4 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, (double) (byte) -1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray7 = new double[] { 100.0d, 10.0f, (byte) 100, (-1), 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, (double) 10L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        double[] doubleArray6 = new double[] { (short) 100, 10L, 10, ' ', (-1L), 100L };
        double[] doubleArray12 = new double[] { ' ', 10.0d, 0, 0.0d, (byte) -1 };
        double[] doubleArray14 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray14, (double) 0L);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        double[] doubleArray6 = new double[] { (short) 10, (-1L), (short) -1, (short) 10, 10, ' ' };
        double[] doubleArray13 = new double[] { 0.0f, (-1), 1.0f, 0.0f, (-1.0d), 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (-1.0d));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        double[] doubleArray4 = new double[] { (-1L), (short) 1, 10, (byte) -1 };
        double[] doubleArray9 = new double[] { (byte) 100, 0.0f, '4', 10.0d };
        double[] doubleArray16 = new double[] { (-1.0f), 1L, 1.0d, (byte) 1, 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray16, (double) 100.0f);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        double[] doubleArray6 = new double[] { (short) -1, (byte) 100, 100.0d, 100L, (short) 1, (short) 100 };
        double[] doubleArray13 = new double[] { (-1.0d), (byte) 100, ' ', (byte) 0, '#', 1L };
        double[] doubleArray14 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray14, (double) 10L);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        double[] doubleArray5 = new double[] { ' ', 1.0f, 1, 0.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        double[] doubleArray5 = new double[] { '4', 0L, 1.0d, 100.0f, 10.0d };
        double[] doubleArray7 = new double[] { 10 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        double[] doubleArray2 = new double[] { 10.0d, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) (short) 10);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        double[] doubleArray1 = new double[] { (byte) 100 };
        double[] doubleArray6 = new double[] { 1, 100.0f, (byte) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        double[] doubleArray5 = new double[] { 10, 10, (byte) 0, (-1.0f), 100L };
        double[] doubleArray9 = new double[] { (byte) 100, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        double[] doubleArray3 = new double[] { (byte) 1, '#', 1.0f };
        double[] doubleArray7 = new double[] { 0, 10L, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) '#');
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        double[] doubleArray2 = new double[] { 10L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) '#');
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        double[] doubleArray2 = new double[] { 10, 100L };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 0);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        double[] doubleArray4 = new double[] { 1.0d, (byte) 0, (byte) 0, 100L };
        double[] doubleArray11 = new double[] { 0.0d, 10.0d, (byte) 100, 100.0d, 10L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        double[] doubleArray2 = new double[] { (short) 100, (byte) 10 };
        double[] doubleArray5 = new double[] { (-1.0f), (byte) 0 };
        double[] doubleArray8 = new double[] { (byte) 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, (double) 100);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        double[] doubleArray3 = new double[] { (-1L), 10.0d, (short) 10 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, 100.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        double[] doubleArray2 = new double[] { (-1.0d), 100L };
        double[] doubleArray6 = new double[] { ' ', (-1.0f), (byte) 1 };
        double[] doubleArray10 = new double[] { (byte) 0, '4', (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray10, (double) (short) -1);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray5 = new double[] { '4', (byte) 100, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        double[] doubleArray6 = new double[] { (byte) 10, (byte) -1, 1L, 10, (short) 0, (short) 1 };
        double[] doubleArray13 = new double[] { (byte) 10, (-1L), 10.0f, (byte) 1, 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) (-1));
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        double[] doubleArray4 = new double[] { 0, 100L, 0L, (short) 0 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        double[] doubleArray5 = new double[] { (short) 100, (short) -1, 0.0f, 0L, 1 };
        double[] doubleArray8 = new double[] { (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray8, doubleArray8, (double) 10L);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        double[] doubleArray4 = new double[] { 100.0f, (-1.0d), 100.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        double[] doubleArray6 = new double[] { 100L, 1.0f, 'a', (-1.0d), 10.0d, 1.0d };
        double[] doubleArray8 = new double[] { (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray8, (double) 0.0f);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        double[] doubleArray3 = new double[] { ' ', (short) -1, 'a' };
        double[] doubleArray8 = new double[] { (short) 100, (-1.0f), (byte) 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, 100.0d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        double[] doubleArray6 = new double[] { 1, 0.0f, 0L, (byte) 10, 0.0f, '#' };
        double[] doubleArray12 = new double[] { (short) 100, (-1), (-1.0f), (byte) 100, (byte) 10 };
        double[] doubleArray13 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        double[] doubleArray1 = new double[] { (short) 10 };
        double[] doubleArray3 = new double[] { 10 };
        double[] doubleArray6 = new double[] { 100, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray6, (double) 100.0f);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        double[] doubleArray6 = new double[] { (short) 100, (short) 0, 1L, (byte) 100, (short) 1, 10 };
        double[] doubleArray9 = new double[] { 10L, (byte) 1 };
        double[] doubleArray15 = new double[] { (byte) 1, (-1.0f), 10.0d, 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, 1.0d);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        double[] doubleArray4 = new double[] { (byte) 0, 100L, (byte) 0, 0L };
        double[] doubleArray9 = new double[] { (short) 0, 'a', 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray9, (double) 100L);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        double[] doubleArray2 = new double[] { (byte) 1, (-1.0f) };
        double[] doubleArray9 = new double[] { 10L, 10L, (short) 0, (short) 1, (short) 10, (-1.0f) };
        double[] doubleArray12 = new double[] { 0, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray12, (double) (byte) -1);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray3 = new double[] { 100L };
        double[] doubleArray7 = new double[] { 10.0f, 100.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray7, (double) (-1));
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        double[] doubleArray5 = new double[] { (short) 1, 10.0f, 0.0f, 0L, (byte) 100 };
        double[] doubleArray12 = new double[] { (-1L), (byte) 10, (short) 10, 10, 100L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, (double) 10);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        double[] doubleArray3 = new double[] { (short) 100, (short) 100, (byte) 0 };
        double[] doubleArray9 = new double[] { 1L, (-1.0f), 10L, (-1), 100 };
        double[] doubleArray10 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray10, (double) '#');
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray6 = new double[] { (byte) 100, (-1L), 10L, (short) -1 };
        double[] doubleArray9 = new double[] { 10L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) 1L);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        double[] doubleArray6 = new double[] { (short) -1, 10.0f, (short) 1, 1.0f, 100L, 0.0f };
        double[] doubleArray8 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray6, (double) 100);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray5 = new double[] { 1L, 100.0d, 100L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        double[] doubleArray1 = new double[] { (byte) 0 };
        double[] doubleArray5 = new double[] { 'a', 0.0d, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) 100);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        double[] doubleArray5 = new double[] { (short) 1, (short) 0, (-1L), 10, (-1) };
        double[] doubleArray9 = new double[] { (short) -1, 1.0f, (-1) };
        double[] doubleArray15 = new double[] { 0, (byte) 100, 10L, 0L, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray15, (-1.0d));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        double[] doubleArray6 = new double[] { (-1.0f), ' ', (short) 1, (short) 1, 10.0f, 10L };
        double[] doubleArray8 = new double[] { (-1.0d) };
        double[] doubleArray13 = new double[] { 10.0f, (-1L), (short) 10, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray13, (-1.0d));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        double[] doubleArray3 = new double[] { 10.0f, 100L, 0.0d };
        double[] doubleArray7 = new double[] { (short) 10, 1, 0 };
        double[] doubleArray12 = new double[] { 10L, '4', 100.0f, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) 1.0f);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        double[] doubleArray3 = new double[] { 1.0f, 100L, '4' };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray5, 0.0d);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 1.0f, 1.0f, 100.0d, 100.0f };
        double[] doubleArray7 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray7, (-1.0d));
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        double[] doubleArray4 = new double[] { 100, (byte) 10, 100L, 'a' };
        double[] doubleArray7 = new double[] { (-1), (short) 1 };
        double[] doubleArray13 = new double[] { 10.0d, (short) 100, (short) 10, 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray13, (double) ' ');
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        double[] doubleArray6 = new double[] { (byte) 10, 0.0f, (-1), 100.0d, 0.0f, 1L };
        double[] doubleArray9 = new double[] { 100.0f, 100 };
        double[] doubleArray16 = new double[] { (short) 0, (short) 1, 10.0f, '4', 'a', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray16, (double) (short) 0);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (short) 100);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        double[] doubleArray4 = new double[] { 0.0f, (short) 100, ' ', (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        double[] doubleArray4 = new double[] { (short) 100, (byte) 100, 1.0d, 0.0f };
        double[] doubleArray10 = new double[] { 'a', 'a', (short) -1, 10.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, 10.0d);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        double[] doubleArray6 = new double[] { (-1), 100, (short) 10, 0.0d, (-1.0f), 1 };
        double[] doubleArray11 = new double[] { 1, 0L, (-1L), (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        double[] doubleArray5 = new double[] { 1L, 0L, 100L, 1.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        double[] doubleArray3 = new double[] { (byte) 1, (short) -1, 0.0d };
        double[] doubleArray10 = new double[] { 10, (-1L), (-1.0d), 0, 0.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 100.0d);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { ' ', (short) 1, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray4, (double) 10.0f);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        double[] doubleArray2 = new double[] { 1, (-1) };
        double[] doubleArray4 = new double[] { 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray4, (double) 1L);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        double[] doubleArray3 = new double[] { 1.0d, (-1L), 0.0f };
        double[] doubleArray8 = new double[] { (short) 10, (short) 1, 100L, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray6 = new double[] { 0, (byte) 10, ' ', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, 10.0d);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        double[] doubleArray4 = new double[] { (-1.0f), (byte) -1, 10.0f, 1L };
        double[] doubleArray10 = new double[] { 0L, 0.0f, 100.0d, 100.0f, (-1.0d) };
        double[] doubleArray14 = new double[] { 100.0d, 1L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray10, doubleArray14, (double) (short) 0);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        double[] doubleArray1 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, 0.0d);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        double[] doubleArray4 = new double[] { (short) 10, (byte) 10, 'a', (short) -1 };
        double[] doubleArray8 = new double[] { 10, (byte) -1, 100 };
        double[] doubleArray13 = new double[] { 100, 0L, '4', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray13, 10.0d);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray6 = new double[] { 100, (-1), 10.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray1, (double) '#');
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        double[] doubleArray5 = new double[] { (byte) -1, 0, (short) 100, 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1.0f));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        double[] doubleArray2 = new double[] { 10L, (-1L) };
        double[] doubleArray8 = new double[] { '#', (short) 100, 100L, 0.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray2, (double) (byte) 10);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        double[] doubleArray2 = new double[] { (-1L), 0.0d };
        double[] doubleArray8 = new double[] { (byte) 10, 1L, (-1L), 10, 100.0d };
        double[] doubleArray11 = new double[] { 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray11, (double) ' ');
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        double[] doubleArray4 = new double[] { 0.0d, (byte) 10, 100L, (short) 0 };
        double[] doubleArray8 = new double[] { 100L, (byte) 10, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) 10);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        double[] doubleArray6 = new double[] { 100L, 1.0f, 0.0f, (short) 100, (short) 1, 0.0f };
        double[] doubleArray13 = new double[] { (short) 100, 'a', (short) 10, 100L, 0L, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray13, 0.0d);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0f, 'a' };
        double[] doubleArray8 = new double[] { (byte) 10, 0, 0, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        double[] doubleArray4 = new double[] { 10, 10.0f, ' ', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        double[] doubleArray4 = new double[] { 0L, 10.0f, (short) -1, (-1.0d) };
        double[] doubleArray11 = new double[] { 1, 'a', '4', (short) 100, 0.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, 10.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10.0d, 1.0d, 100.0f, 100L, (short) 10, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) '4');
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) (byte) 100);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        double[] doubleArray2 = new double[] { 100L, (byte) 10 };
        double[] doubleArray5 = new double[] { ' ', 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, 0.0d);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        double[] doubleArray2 = new double[] { (-1.0f), (short) 1 };
        double[] doubleArray9 = new double[] { 0L, 100L, 100L, (short) 1, (short) 1, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (-1.0f));
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        double[] doubleArray5 = new double[] { (-1), (short) -1, 0.0d, 'a', 0L };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) (-1L));
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        double[] doubleArray2 = new double[] { (-1.0d), (short) -1 };
        double[] doubleArray6 = new double[] { '4', 100.0f, (-1.0d) };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) 10L);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        double[] doubleArray5 = new double[] { 'a', 10.0f, (short) 10, (byte) 10, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        double[] doubleArray2 = new double[] { (short) 10, 0.0f };
        double[] doubleArray6 = new double[] { 0.0f, (byte) 10, (-1.0f) };
        double[] doubleArray13 = new double[] { 1, (short) 100, (-1.0d), 'a', (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray13, (double) 100);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        double[] doubleArray5 = new double[] { 100.0d, 'a', (short) 1, (-1.0d), 100.0d };
        double[] doubleArray10 = new double[] { ' ', 0, (-1), (-1.0f) };
        double[] doubleArray13 = new double[] { 1.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray13, (double) (byte) 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { (short) 0, (byte) 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 10.0f);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        double[] doubleArray2 = new double[] { (short) 1, (-1) };
        double[] doubleArray9 = new double[] { 100.0f, (short) 10, 1L, 'a', '4', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        double[] doubleArray3 = new double[] { 1.0f, (byte) 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 0.0d);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { 0.0f, 0.0d, (byte) -1, 100L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (short) 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        double[] doubleArray1 = new double[] { ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray1, (double) (short) 100);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        double[] doubleArray4 = new double[] { (short) -1, (-1L), (byte) 100, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (-1L));
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        double[] doubleArray5 = new double[] { 100L, (-1), (short) 100, 100.0f, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 1.0f);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0f), (byte) 1, 10, '4', 0.0f, (short) 0 };
        double[] doubleArray9 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray9, 100.0d);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 100L, 0.0f, (byte) 1, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) 100);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        double[] doubleArray6 = new double[] { 10.0f, (byte) -1, '4', 0.0d, 10, (short) 1 };
        double[] doubleArray12 = new double[] { 1.0f, 100, 0.0d, '#', (short) 1 };
        double[] doubleArray16 = new double[] { 10, 0.0f, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray16, (double) 100L);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1L };
        double[] doubleArray6 = new double[] { (-1.0d), 100.0d, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray6, (double) 100);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        double[] doubleArray6 = new double[] { (-1), 10L, '4', 10.0f, 100L, 0.0d };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) 1.0f);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        double[] doubleArray4 = new double[] { 'a', (short) 0, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) ' ');
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        double[] doubleArray2 = new double[] { (short) -1, 100 };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] { 10, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray6, (double) (byte) -1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray3, (double) 0L);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        double[] doubleArray3 = new double[] { (short) 100, 10.0f, 100L };
        double[] doubleArray5 = new double[] { 10L };
        double[] doubleArray7 = new double[] { 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray7, 0.0d);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) (short) 10);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        double[] doubleArray3 = new double[] { 1.0d, 0.0d, (-1L) };
        double[] doubleArray10 = new double[] { 10.0d, (-1L), (-1.0d), (short) 100, ' ', '4' };
        double[] doubleArray16 = new double[] { 10, (-1), (short) 10, 10L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray16, 10.0d);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        double[] doubleArray5 = new double[] { 100, ' ', (short) 10, 1.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (byte) 10);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        double[] doubleArray2 = new double[] { (byte) 0, (short) 1 };
        double[] doubleArray5 = new double[] { (byte) 0, 100L };
        double[] doubleArray8 = new double[] { (short) 1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        double[] doubleArray2 = new double[] { (-1.0d), (-1) };
        double[] doubleArray7 = new double[] { 10.0d, 10, 10.0f, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray7, (double) (-1L));
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        double[] doubleArray1 = new double[] { 0.0f };
        double[] doubleArray5 = new double[] { (byte) 100, (-1L), ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (-1));
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        double[] doubleArray3 = new double[] { (byte) 0, 1.0d, 100.0d };
        double[] doubleArray7 = new double[] { 100, 1.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) (short) 10);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        double[] doubleArray4 = new double[] { 10L, 10L, 1, 0 };
        double[] doubleArray7 = new double[] { (short) -1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray7, (-1.0d));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        double[] doubleArray2 = new double[] { '4', (short) 1 };
        double[] doubleArray7 = new double[] { (-1.0d), (byte) 0, (-1.0d), 100.0f };
        double[] doubleArray14 = new double[] { ' ', (byte) -1, (byte) 10, 0.0f, 1L, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray14, (double) 0);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        double[] doubleArray3 = new double[] { 100.0d, 0, 0L };
        double[] doubleArray7 = new double[] { 100.0d, 100L, (byte) 0 };
        double[] doubleArray12 = new double[] { ' ', (byte) 0, '4', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        double[] doubleArray6 = new double[] { 0, (byte) 1, 0L, 100, 10.0d, 100 };
        double[] doubleArray11 = new double[] { ' ', 0.0f, (byte) 10, (-1.0d) };
        double[] doubleArray13 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray13, (double) 10);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        double[] doubleArray1 = new double[] { 10L };
        double[] doubleArray7 = new double[] { '#', (-1.0d), (-1.0f), (byte) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, (double) 10L);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray5 = new double[] { '#', '4', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 0, 100L, 100.0d };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 0.0f, (byte) 1, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        double[] doubleArray5 = new double[] { (short) 10, 'a', 100.0d, 100.0f, (short) -1 };
        double[] doubleArray6 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray5, (double) '#');
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1), 'a', ' ', '4' };
        double[] doubleArray8 = new double[] { 100, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray8, 0.0d);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        double[] doubleArray5 = new double[] { (short) 10, 1L, 100.0f, (byte) 0, (-1) };
        double[] doubleArray6 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray6, (double) (byte) 1);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        double[] doubleArray3 = new double[] { '4', (-1.0d), (byte) 0 };
        double[] doubleArray8 = new double[] { (short) -1, '#', 10.0d, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        double[] doubleArray4 = new double[] { 1, 10.0d, 100.0d, '#' };
        double[] doubleArray6 = new double[] { (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray6, (double) (-1L));
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        double[] doubleArray4 = new double[] { (byte) 0, 0.0d, '4', 10L };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray9 = new double[] { 'a', (short) 0, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray9, 0.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        double[] doubleArray4 = new double[] { 10.0d, (byte) 0, 1.0f, (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 100, 'a', 100L, 1, 'a', (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        double[] doubleArray5 = new double[] { (short) -1, 1.0d, (byte) 10, '#', 1 };
        double[] doubleArray12 = new double[] { (-1.0d), (byte) 1, 10.0f, '4', 1.0d, (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray5, (double) '4');
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray1, (double) 1);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10, (byte) 1, (short) 100, '4', 100.0f, (short) 0 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, 0.0d);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        double[] doubleArray5 = new double[] { 0L, (byte) 100, (short) 1, (byte) 1, '4' };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray7, (double) (short) 100);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        double[] doubleArray6 = new double[] { 10.0f, 10.0f, (-1L), 1, (-1.0d), (-1L) };
        double[] doubleArray8 = new double[] { (byte) 100 };
        double[] doubleArray9 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray9, (double) 1);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        double[] doubleArray2 = new double[] { (byte) 0, 100 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (short) 0);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        double[] doubleArray1 = new double[] { 10.0f };
        double[] doubleArray3 = new double[] { (short) 0 };
        double[] doubleArray10 = new double[] { (byte) 0, 100, 0.0f, (short) 1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray10, (double) 1L);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        double[] doubleArray5 = new double[] { 1L, 0L, ' ', 0L, 10 };
        double[] doubleArray7 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) 100L);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        double[] doubleArray3 = new double[] { ' ', (-1.0f), 0.0d };
        double[] doubleArray5 = new double[] { (short) -1 };
        double[] doubleArray7 = new double[] { (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        double[] doubleArray6 = new double[] { (-1.0d), (short) 100, 1, 0, (byte) 100, 0 };
        double[] doubleArray10 = new double[] { 10.0d, (-1.0d), (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        double[] doubleArray1 = new double[] { (byte) 1 };
        double[] doubleArray8 = new double[] { '#', 0.0f, 0.0d, 100.0f, 0L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) (-1));
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        double[] doubleArray4 = new double[] { '#', 10.0f, (-1), (byte) 100 };
        double[] doubleArray11 = new double[] { (byte) 1, '#', (short) 0, 'a', 10L, (byte) 1 };
        double[] doubleArray15 = new double[] { (short) 0, 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray15, (double) (short) -1);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray7 = new double[] { 100.0d, 1.0d, 10.0f, (short) 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray7, 0.0d);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        double[] doubleArray3 = new double[] { (byte) 10, (-1.0f), 1.0f };
        double[] doubleArray6 = new double[] { 100L, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 100);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        double[] doubleArray6 = new double[] { (-1.0d), (byte) 0, '4', 0.0f, '4', (byte) 0 };
        double[] doubleArray10 = new double[] { 10, 0.0f, 10.0d };
        double[] doubleArray15 = new double[] { '#', 0L, (short) -1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray15, (double) 10.0f);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        double[] doubleArray6 = new double[] { ' ', 1.0f, 1.0f, 1.0f, 100.0d, (-1L) };
        double[] doubleArray10 = new double[] { (-1L), (byte) 1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) 1);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        double[] doubleArray3 = new double[] { 1.0f, (short) 1, (short) 1 };
        double[] doubleArray8 = new double[] { (short) 100, 1L, (short) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        double[] doubleArray1 = new double[] { (byte) 10 };
        double[] doubleArray4 = new double[] { (short) 1, 1.0f };
        double[] doubleArray7 = new double[] { 100.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray7, (double) 100.0f);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        double[] doubleArray4 = new double[] { (-1), 100.0f, '4', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) 100);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        double[] doubleArray6 = new double[] { (short) -1, 0.0d, 100.0d, 0L, 10L, 1L };
        double[] doubleArray13 = new double[] { 10L, ' ', '#', 100.0d, 1L, '#' };
        double[] doubleArray20 = new double[] { (short) 1, 0.0f, '4', 1.0f, '4', 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray20, (double) (byte) 1);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        double[] doubleArray6 = new double[] { 10.0d, (-1.0d), 'a', 100, 100L, ' ' };
        double[] doubleArray9 = new double[] { (byte) -1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        double[] doubleArray3 = new double[] { '4', 10L, (short) -1 };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray4, (double) (-1.0f));
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        double[] doubleArray6 = new double[] { 0.0d, 10.0f, 10, 100L, (-1.0f), (short) 100 };
        double[] doubleArray13 = new double[] { 1.0f, 0L, (short) 0, 100L, 1, (short) 100 };
        double[] doubleArray19 = new double[] { '4', (short) 10, 100L, 1.0f, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray19, (double) 100.0f);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        double[] doubleArray5 = new double[] { (short) 10, 10, (byte) 1, 0, 0.0d };
        double[] doubleArray10 = new double[] { (-1L), ' ', ' ', 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 10);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) -1, (byte) 1, (short) -1, 10, (short) 1, 100.0f };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        double[] doubleArray4 = new double[] { (-1L), 10.0d, 0, (byte) 10 };
        double[] doubleArray6 = new double[] { 100L };
        double[] doubleArray11 = new double[] { (byte) 0, (short) 100, 10L, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray11, (double) 0);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        double[] doubleArray6 = new double[] { 0.0d, 0, '4', 1.0f, 10L, 0 };
        double[] doubleArray9 = new double[] { 100.0f, 0.0d };
        double[] doubleArray15 = new double[] { (byte) -1, (byte) -1, 1, (short) 10, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, (double) 0.0f);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        double[] doubleArray2 = new double[] { (byte) 10, 100.0d };
        double[] doubleArray8 = new double[] { 100, 0.0f, 100, '4', ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, (double) (short) -1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        double[] doubleArray3 = new double[] { (short) 1, (byte) 1, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 10.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, (-1L), '#', 10L, (-1L), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) ' ');
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        double[] doubleArray6 = new double[] { 0.0f, (-1), (-1.0d), (byte) 100, (-1L), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 1.0f);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0 };
        double[] doubleArray5 = new double[] { (short) 10, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray5, (double) 1L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        double[] doubleArray5 = new double[] { (short) -1, 0.0d, ' ', (short) 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 10);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        double[] doubleArray3 = new double[] { (-1), 100.0f, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 100L);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        double[] doubleArray6 = new double[] { 100.0d, (byte) 100, (short) -1, (byte) 100, 100.0d, 'a' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        double[] doubleArray4 = new double[] { ' ', (byte) 100, 0L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) ' ');
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        double[] doubleArray2 = new double[] { (-1.0f), 100 };
        double[] doubleArray8 = new double[] { (-1), ' ', 100, (short) 0, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) (-1L));
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        double[] doubleArray5 = new double[] { (-1.0d), (-1.0f), (short) 10, ' ', 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) (-1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        double[] doubleArray5 = new double[] { ' ', 1L, (byte) -1, 100.0d, (byte) -1 };
        double[] doubleArray11 = new double[] { 100L, 0.0f, 0.0d, 10.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray11, 0.0d);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 10.0f, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (double) 0L);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        double[] doubleArray4 = new double[] { (byte) 1, 100.0d, 1.0f, 1.0d };
        double[] doubleArray7 = new double[] { 1L, 0L };
        double[] doubleArray10 = new double[] { '#', (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray10, (double) ' ');
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        double[] doubleArray4 = new double[] { 1, 1L, 10.0f, (byte) 1 };
        double[] doubleArray10 = new double[] { 'a', 1.0d, '#', 100.0f, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 100.0f);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        double[] doubleArray3 = new double[] { (byte) 10, 10.0d, 10.0f };
        double[] doubleArray4 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        double[] doubleArray6 = new double[] { 0, (-1.0d), ' ', 10, 10.0f, (short) 100 };
        double[] doubleArray8 = new double[] { '4' };
        double[] doubleArray11 = new double[] { 100.0d, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray11, 100.0d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        double[] doubleArray3 = new double[] { (short) 0, (-1.0f), (-1.0f) };
        double[] doubleArray8 = new double[] { 0L, 0L, (-1L), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        double[] doubleArray3 = new double[] { 100, (byte) 100, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        double[] doubleArray3 = new double[] { 1, 100.0d, (short) -1 };
        double[] doubleArray7 = new double[] { (-1L), 0.0f, (short) 100 };
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray8, (double) 0);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        double[] doubleArray2 = new double[] { 100.0d, (-1.0f) };
        double[] doubleArray6 = new double[] { 1.0d, 0.0f, 1 };
        double[] doubleArray9 = new double[] { '4', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, (double) (-1L));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        double[] doubleArray4 = new double[] { (-1.0f), 1.0f, (short) 0, 1.0f };
        double[] doubleArray10 = new double[] { (-1.0f), 10.0f, '4', 1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 0L);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        double[] doubleArray5 = new double[] { 10L, (byte) 1, (byte) 10, 10, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        double[] doubleArray4 = new double[] { (-1), (-1L), (short) -1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        double[] doubleArray1 = new double[] { (byte) -1 };
        double[] doubleArray3 = new double[] { (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray3, 0.0d);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        double[] doubleArray4 = new double[] { (-1.0d), (byte) 10, 1L, (short) 1 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, 10.0d);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (-1.0f), (byte) -1, 0L };
        double[] doubleArray9 = new double[] { (byte) 0, 100.0d, 10, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray9, (double) (short) -1);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { ' ', 1L, (short) 10, 10.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray6, (double) 'a');
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 1.0f };
        double[] doubleArray9 = new double[] { 10.0d, 1L, (short) 0, (-1L), '4', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray9, (double) (byte) 10);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        double[] doubleArray6 = new double[] { (short) 1, 10.0d, '#', (-1.0d), 1L, 0L };
        double[] doubleArray10 = new double[] { 100.0f, (short) 0, (short) 100 };
        double[] doubleArray17 = new double[] { (short) 100, (byte) 1, 1.0d, 100.0f, (byte) -1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray17, (double) (byte) 100);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        double[] doubleArray4 = new double[] { '4', 0, '4', 10 };
        double[] doubleArray8 = new double[] { 10L, ' ', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray4, (double) 1L);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        double[] doubleArray6 = new double[] { (-1.0f), (byte) 0, 'a', (short) 10, '4', 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 100L);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        double[] doubleArray3 = new double[] { (short) 0, (-1.0f), 100.0d };
        double[] doubleArray9 = new double[] { (short) 100, 0L, (byte) -1, 100, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray9, (double) 100L);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        double[] doubleArray5 = new double[] { (-1L), 0.0f, (-1), (short) -1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1.0f), (byte) 100, 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray5, (double) (byte) 0);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        double[] doubleArray2 = new double[] { (-1.0f), 0.0d };
        double[] doubleArray4 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 10L);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        double[] doubleArray1 = new double[] { '4' };
        double[] doubleArray6 = new double[] { 100.0d, (byte) 100, (short) 10, 10L };
        double[] doubleArray10 = new double[] { 100, (byte) -1, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray10, (double) (byte) 10);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        double[] doubleArray2 = new double[] { (-1.0f), 10L };
        double[] doubleArray7 = new double[] { 0.0f, (byte) -1, 0L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray2, (double) (short) -1);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        double[] doubleArray5 = new double[] { 0, (short) -1, 1.0d, 10.0d, (byte) -1 };
        double[] doubleArray7 = new double[] { (short) 1 };
        double[] doubleArray14 = new double[] { 100L, 1, (-1L), (byte) 10, (byte) 0, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray14, (double) '4');
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        double[] doubleArray6 = new double[] { 0.0f, (byte) 1, (-1), 10.0f, (short) 100, (short) -1 };
        double[] doubleArray9 = new double[] { (-1.0f), 10L };
        double[] doubleArray11 = new double[] { (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray11, (double) '4');
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        double[] doubleArray6 = new double[] { 100L, (-1.0f), '4', (-1L), (byte) -1, 100 };
        double[] doubleArray12 = new double[] { 10.0d, 'a', (short) 10, 100.0d, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        double[] doubleArray2 = new double[] { 0, 1.0d };
        double[] doubleArray7 = new double[] { (byte) 10, (short) 1, 100, 10 };
        double[] doubleArray10 = new double[] { (short) -1, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray10, (double) (byte) -1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        double[] doubleArray6 = new double[] { 0.0f, (byte) 0, ' ', (-1), 'a', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 0);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 10, 0L };
        double[] doubleArray6 = new double[] { 10.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray6, (double) ' ');
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 10 };
        double[] doubleArray5 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) '4');
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        double[] doubleArray4 = new double[] { (-1.0f), 10L, 100.0d, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        double[] doubleArray5 = new double[] { '#', (byte) -1, 100.0f, 100, (-1L) };
        double[] doubleArray9 = new double[] { 10L, 0.0d, 100L };
        double[] doubleArray11 = new double[] { '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray11, (double) '#');
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        double[] doubleArray5 = new double[] { 100, 100L, 10L, 10.0d, (short) 10 };
        double[] doubleArray10 = new double[] { (-1.0f), 0L, (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) 10L);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (-1.0f), 0L, (byte) 100, 0.0f, (-1.0f), 10 };
        double[] doubleArray10 = new double[] { 100.0f, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray10, 1.0d);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        double[] doubleArray3 = new double[] { (byte) 100, (short) -1, 100L };
        double[] doubleArray7 = new double[] { (byte) 10, 100, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray3, 0.0d);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        double[] doubleArray5 = new double[] { 1, 1L, (byte) 0, (short) 0, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '#');
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 100, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray0, (-1.0d));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        double[] doubleArray6 = new double[] { 100L, 100L, (byte) -1, (byte) -1, 0, (short) 10 };
        double[] doubleArray12 = new double[] { (byte) -1, (byte) -1, (-1), (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        double[] doubleArray4 = new double[] { (byte) -1, 100.0d, 0, (short) 0 };
        double[] doubleArray7 = new double[] { 100L, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 0);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        double[] doubleArray6 = new double[] { 100L, 0.0f, (byte) 0, (byte) 0, 0.0f, 100.0d };
        double[] doubleArray12 = new double[] { (byte) 10, 100L, (byte) 10, 100, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) (byte) 1);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        double[] doubleArray5 = new double[] { (byte) 0, (-1.0f), '4', (short) 0, 0.0d };
        double[] doubleArray12 = new double[] { 0, 10.0f, 0.0f, '#', 0.0f, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray12, (double) ' ');
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        double[] doubleArray6 = new double[] { 0.0d, '4', 0L, 100.0d, 100, (byte) 100 };
        double[] doubleArray8 = new double[] { 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray8, doubleArray8, (double) (short) 10);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        double[] doubleArray3 = new double[] { 0, 0.0d, '#' };
        double[] doubleArray6 = new double[] { 10.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray6, (double) 0.0f);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray4 = new double[] { 'a', '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (double) (short) -1);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        double[] doubleArray3 = new double[] { (short) 100, (short) 0, 1.0f };
        double[] doubleArray8 = new double[] { (byte) 0, (short) -1, 10.0f, (byte) 100 };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) (-1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        double[] doubleArray6 = new double[] { 1L, (short) 0, (-1), ' ', 100.0f, 100 };
        double[] doubleArray13 = new double[] { (-1), 10.0f, (short) 10, 100L, 1.0d, 1.0d };
        double[] doubleArray17 = new double[] { 100, (short) -1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray13, doubleArray17, (double) 1.0f);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        double[] doubleArray4 = new double[] { (byte) 1, ' ', ' ', 1.0f };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, 0.0d);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        double[] doubleArray5 = new double[] { 100.0f, (-1.0f), (short) -1, (-1.0d), (short) 0 };
        double[] doubleArray11 = new double[] { 100.0d, 10.0f, '4', 10.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray11, (double) 100L);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 100.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray3, (double) (byte) 10);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        double[] doubleArray2 = new double[] { 1.0d, (-1L) };
        double[] doubleArray5 = new double[] { (short) 100, 100 };
        double[] doubleArray12 = new double[] { (short) -1, (-1), 1.0d, (byte) -1, (byte) -1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray12, (double) 0L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        double[] doubleArray3 = new double[] { ' ', 1.0f, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 0.0f);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        double[] doubleArray2 = new double[] { 1.0d, (-1.0f) };
        double[] doubleArray9 = new double[] { '4', (short) 10, (short) 1, ' ', 10.0d, ' ' };
        double[] doubleArray15 = new double[] { 10, 10L, 100, (-1.0f), 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray15, (double) 1.0f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        double[] doubleArray3 = new double[] { (byte) 1, 0.0d, 0L };
        double[] doubleArray8 = new double[] { 1L, (byte) 1, (byte) -1, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (-1L));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        double[] doubleArray2 = new double[] { '4', (-1.0f) };
        double[] doubleArray9 = new double[] { 10, (byte) 10, (-1L), (short) 0, (-1.0d), (-1L) };
        double[] doubleArray12 = new double[] { 100.0f, ' ' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray12, (double) (byte) 10);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        double[] doubleArray4 = new double[] { (short) 0, 0, 100L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        double[] doubleArray6 = new double[] { 100, 0L, 100L, (short) 1, (-1L), (-1) };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray9 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray9, 1.0d);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        double[] doubleArray3 = new double[] { ' ', (short) -1, '4' };
        double[] doubleArray7 = new double[] { 0L, 10, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        double[] doubleArray4 = new double[] { (-1), (-1L), ' ', (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (-1.0d));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        double[] doubleArray4 = new double[] { 0.0f, (byte) -1, 100, (byte) 100 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray5, (double) 100L);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        double[] doubleArray4 = new double[] { 1.0d, 1.0d, (short) 1, 1.0f };
        double[] doubleArray11 = new double[] { 'a', (short) 1, 10.0f, 100, (short) 1, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, 10.0d);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        double[] doubleArray5 = new double[] { (-1L), (short) 10, (short) 10, 10L, (short) 10 };
        double[] doubleArray11 = new double[] { ' ', 10.0f, 1, 10.0f, (short) 100 };
        double[] doubleArray17 = new double[] { 0L, (byte) 100, (byte) 0, 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray17, (double) (short) 1);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        double[] doubleArray4 = new double[] { (-1), 10.0d, 100.0f, (byte) 100 };
        double[] doubleArray11 = new double[] { 0.0d, (short) 0, 100.0d, (short) -1, 0, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray11, 0.0d);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        double[] doubleArray2 = new double[] { (-1L), ' ' };
        double[] doubleArray8 = new double[] { (-1L), 100, 'a', (byte) 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray8, (double) '#');
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        double[] doubleArray4 = new double[] { (byte) 1, 0, 'a', 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 10.0d);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        double[] doubleArray5 = new double[] { 0.0d, '#', 10, ' ', 1 };
        double[] doubleArray12 = new double[] { (-1.0f), (short) 100, 10.0d, (short) 0, 0L, (short) 1 };
        double[] doubleArray19 = new double[] { 0, (short) 10, 1L, (-1), 1.0d, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray19, (double) 10.0f);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, (double) (byte) 0);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        double[] doubleArray2 = new double[] { '4', 100L };
        double[] doubleArray9 = new double[] { 0L, 100L, (-1L), (-1.0d), 100, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { 1, 1L };
        double[] doubleArray5 = new double[] { 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, (double) 10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        double[] doubleArray4 = new double[] { '4', (byte) 100, 100.0d, 10 };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        double[] doubleArray3 = new double[] { (byte) -1, 10L, 10L };
        double[] doubleArray10 = new double[] { 1.0f, (short) 100, 100.0f, 0.0f, 100.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray10, 100.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (short) 10, (byte) 1, 10.0d, 0.0d, (byte) 100, 10L };
        double[] doubleArray8 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray8, (double) (byte) 10);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        double[] doubleArray3 = new double[] { 10.0f, 0.0d, (-1) };
        double[] doubleArray6 = new double[] { (-1.0d), 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) 100);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        double[] doubleArray3 = new double[] { 10.0d, 1.0d, 100L };
        double[] doubleArray8 = new double[] { ' ', 0.0f, 0.0d, (short) 100 };
        double[] doubleArray13 = new double[] { 10.0f, 100L, 0L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        double[] doubleArray5 = new double[] { (short) 10, (byte) -1, ' ', 0L, (short) 100 };
        double[] doubleArray10 = new double[] { (byte) 100, '#', (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, 100.0d);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        double[] doubleArray4 = new double[] { 0L, 'a', 0, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 10L);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        double[] doubleArray4 = new double[] { 10.0d, 'a', 1L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 1);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (short) 0, 1L, 10L, 1.0f, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray0, (double) (-1.0f));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        double[] doubleArray6 = new double[] { (-1.0f), 100, 0, ' ', 1.0d, 10 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, 0.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        double[] doubleArray5 = new double[] { 100, (byte) 0, (-1.0d), '#', 0 };
        double[] doubleArray10 = new double[] { (-1.0d), 0L, (byte) 10, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray10, (double) (byte) 100);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        double[] doubleArray4 = new double[] { (-1), 100.0f, (-1), '#' };
        double[] doubleArray7 = new double[] { (-1.0f), 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) (-1.0f));
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray2 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray2, (double) (-1L));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        double[] doubleArray6 = new double[] { 1.0d, '4', 10.0d, (-1), 10, 1 };
        double[] doubleArray13 = new double[] { 1.0d, 1L, 0, 0L, (-1), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray13, (double) '#');
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        double[] doubleArray6 = new double[] { 100.0d, 100L, (short) 1, (-1L), '#', 100.0f };
        double[] doubleArray9 = new double[] { 1.0f, (byte) 100 };
        double[] doubleArray14 = new double[] { (short) 10, (-1.0d), 100, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray14, (double) (byte) 0);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        double[] doubleArray2 = new double[] { (byte) 1, 1 };
        double[] doubleArray7 = new double[] { 1, (short) 10, (short) 0, (-1) };
        double[] doubleArray11 = new double[] { 10.0f, 'a', (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray7, doubleArray11, (double) (byte) -1);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray2, (double) 0);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        double[] doubleArray5 = new double[] { 10.0d, 1L, 0.0d, (-1.0d), 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, 100.0d);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        double[] doubleArray4 = new double[] { (-1.0f), 0.0f, (-1), (short) 0 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { 10L, (short) -1, (byte) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray10, 10.0d);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray0, (double) 100L);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        double[] doubleArray6 = new double[] { (byte) 1, (byte) 100, 0L, (short) 10, 0.0f, 100 };
        double[] doubleArray9 = new double[] { 100.0d, 0 };
        double[] doubleArray13 = new double[] { '4', (-1), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray13, (double) (short) 100);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        double[] doubleArray6 = new double[] { 0, (byte) 0, ' ', (short) 0, 100, 1.0d };
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 10.0f);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        double[] doubleArray2 = new double[] { 100.0d, (byte) 1 };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) (byte) 10);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        double[] doubleArray3 = new double[] { 0.0d, 100.0d, 0.0d };
        double[] doubleArray8 = new double[] { 10, 1, (byte) 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (-1.0f));
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        double[] doubleArray4 = new double[] { (byte) 100, 10.0d, 10, 1.0d };
        double[] doubleArray10 = new double[] { 100, 100.0f, 100L, 0, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 10);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        double[] doubleArray1 = new double[] { 100.0f };
        double[] doubleArray6 = new double[] { (byte) 0, 10L, 10L, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray6, (double) 100L);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        double[] doubleArray3 = new double[] { 0.0f, 10.0f, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 1.0d);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        double[] doubleArray4 = new double[] { 10.0f, 100.0d, (-1.0f), '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 0L);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        double[] doubleArray3 = new double[] { (byte) 10, 0L, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, 0.0d);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        double[] doubleArray3 = new double[] { 'a', 0, (short) -1 };
        double[] doubleArray8 = new double[] { (short) 1, (-1), (-1.0d), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray8, (double) (byte) -1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        double[] doubleArray2 = new double[] { 10.0d, (short) -1 };
        double[] doubleArray8 = new double[] { (-1.0d), (short) 0, (short) 10, (short) -1, 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray8, (double) 10.0f);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        double[] doubleArray5 = new double[] { (short) 100, 10.0f, 100L, (-1.0d), (-1.0f) };
        double[] doubleArray10 = new double[] { (byte) 10, 1.0d, 10.0d, 0.0f };
        double[] doubleArray13 = new double[] { 0.0f, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray10, doubleArray13, (double) 0);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        double[] doubleArray5 = new double[] { 100, 100, (short) 10, (-1.0f), 100.0f };
        double[] doubleArray6 = new double[] {};
        double[] doubleArray13 = new double[] { 100, (byte) 1, (-1.0f), (short) -1, (byte) 100, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray6, doubleArray13, (double) 1.0f);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        double[] doubleArray2 = new double[] { (byte) 10, 10.0d };
        double[] doubleArray8 = new double[] { (byte) 0, (-1.0f), (byte) 0, (short) 0, 0 };
        double[] doubleArray12 = new double[] { 0L, (-1.0f), 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray8, doubleArray12, (double) 10.0f);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        double[] doubleArray2 = new double[] { 10L, 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0d);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray3 = new double[] { (short) 1 };
        double[] doubleArray10 = new double[] { 0.0d, (byte) -1, (-1.0f), 10L, 100.0f, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray10, (double) (short) 1);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        double[] doubleArray2 = new double[] { 1, 1 };
        double[] doubleArray9 = new double[] { 0, '#', 100.0f, 1.0f, (byte) 1, ' ' };
        double[] doubleArray11 = new double[] { (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray9, doubleArray11, (double) 100L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        double[] doubleArray4 = new double[] { (byte) 100, 1, (byte) 0, 100L };
        double[] doubleArray9 = new double[] { 100.0f, ' ', 1.0d, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray4, (double) (byte) 10);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        double[] doubleArray4 = new double[] { '#', 10L, 10L, (short) 0 };
        double[] doubleArray11 = new double[] { 1, 10.0f, 10.0d, (short) -1, 1.0d, (short) 0 };
        double[] doubleArray15 = new double[] { 1.0d, 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray15, 10.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        double[] doubleArray2 = new double[] { 10.0f, 10 };
        double[] doubleArray6 = new double[] { (short) 1, (byte) 100, 100.0f };
        double[] doubleArray12 = new double[] { (byte) -1, 1L, (byte) 100, '4', 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray12, (double) 0);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray8 = new double[] { 0.0f, (-1), ' ', (short) 10, 'a', (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray8, doubleArray8, (double) (short) 0);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        double[] doubleArray2 = new double[] { (short) 0, (byte) 10 };
        double[] doubleArray6 = new double[] { 1.0d, 0, (byte) 100 };
        double[] doubleArray7 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray7, (double) (short) 0);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        double[] doubleArray6 = new double[] { 1, 0.0f, (-1.0d), 10, (short) 100, 1L };
        double[] doubleArray9 = new double[] { 1.0d, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray6, (double) (short) -1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        double[] doubleArray4 = new double[] { (-1L), 100.0d, (short) 1, 'a' };
        double[] doubleArray7 = new double[] { (short) 100, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray7, (double) 10.0f);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        double[] doubleArray4 = new double[] { (byte) 10, (byte) 10, (byte) 10, 10L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 0.0d);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { ' ', (short) 1 };
        double[] doubleArray5 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray5, 0.0d);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        double[] doubleArray3 = new double[] { 100L, 1L, (byte) 0 };
        double[] doubleArray8 = new double[] { 10.0f, 10.0f, 10, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 100L);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        double[] doubleArray6 = new double[] { ' ', (-1), (-1.0f), 0.0f, (short) 100, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, 0.0d);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        double[] doubleArray4 = new double[] { 100L, (byte) 1, (byte) 1, (-1.0f) };
        double[] doubleArray7 = new double[] { 'a', 1.0f };
        double[] doubleArray12 = new double[] { (-1), (byte) -1, (short) 10, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray12, (double) 0L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        double[] doubleArray4 = new double[] { (short) 1, (short) 1, (byte) 100, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, 10.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        double[] doubleArray5 = new double[] { (byte) -1, 1.0f, (short) 0, 1.0d, ' ' };
        double[] doubleArray7 = new double[] { 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray7, (double) 100);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        double[] doubleArray3 = new double[] { 100, 100.0f, 0L };
        double[] doubleArray9 = new double[] { (-1.0f), 1.0d, (byte) 0, 100.0d, 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray3, (double) (short) 1);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        double[] doubleArray6 = new double[] { '#', (short) 10, 1, 100.0d, (byte) 10, '4' };
        double[] doubleArray11 = new double[] { (-1), 10, 0L, 0L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) 10.0f);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        double[] doubleArray3 = new double[] { 1.0d, 1, (byte) -1 };
        double[] doubleArray7 = new double[] { 1.0f, '#', 10.0d };
        double[] doubleArray12 = new double[] { 10, '#', (-1.0d), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray12, (double) 100.0f);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        double[] doubleArray6 = new double[] { (short) 0, (-1), (byte) 10, 'a', (-1), '4' };
        double[] doubleArray10 = new double[] { 0.0d, (-1), 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        double[] doubleArray6 = new double[] { 100, 10.0d, '#', 10L, 1L, (byte) 0 };
        double[] doubleArray11 = new double[] { (byte) 1, 100.0d, '#', 100.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray11, (double) ' ');
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        double[] doubleArray4 = new double[] { 1.0f, (byte) -1, '4', 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) (short) 10);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray3 = new double[] { (byte) 1, 10 };
        double[] doubleArray10 = new double[] { (byte) -1, 1.0d, '#', (short) 10, 1.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray3, doubleArray10, 0.0d);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        double[] doubleArray2 = new double[] { (byte) 0, ' ' };
        double[] doubleArray4 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray4, 0.0d);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) (short) 100);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 10L };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray3, (double) 10);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 100, 1.0d, (byte) 10, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray6, 0.0d);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        double[] doubleArray4 = new double[] { (short) -1, 10.0f, (byte) 100, 0.0f };
        double[] doubleArray11 = new double[] { (short) 1, (short) -1, (-1.0f), (short) 100, 0L, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray11, (double) 1);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        double[] doubleArray6 = new double[] { (byte) 100, 10.0f, (short) 100, '#', 10, (-1.0d) };
        double[] doubleArray11 = new double[] { (short) -1, 'a', (short) 10, (short) 100 };
        double[] doubleArray14 = new double[] { 10.0f, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray11, doubleArray14, 100.0d);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (-1L), (byte) 0, 10.0d, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray0, (double) 100.0f);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        double[] doubleArray4 = new double[] { (byte) 1, 'a', 100.0d, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) 'a');
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        double[] doubleArray3 = new double[] { 100, 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 1.0f);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        double[] doubleArray6 = new double[] { 'a', '4', (short) 100, (-1), (byte) 1, 10.0d };
        double[] doubleArray9 = new double[] { (short) -1, 10.0f };
        double[] doubleArray15 = new double[] { (short) -1, 10.0d, 1.0d, (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray9, doubleArray15, 100.0d);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray1, (double) (-1));
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray7 = new double[] { 10, 10L, 1.0d, '#', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray7, (double) 100L);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        double[] doubleArray0 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray0, (double) (byte) 0);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray8 = new double[] { '4', 0L, (short) -1, (short) 10, (byte) 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) 'a');
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        double[] doubleArray4 = new double[] { (byte) 0, 100.0f, 0L, (short) 1 };
        double[] doubleArray7 = new double[] { 10, ' ' };
        double[] doubleArray8 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray8, (double) 100L);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        double[] doubleArray6 = new double[] { 1.0d, 1.0d, 10.0f, 100L, 100L, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (-1L));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        double[] doubleArray3 = new double[] { 100.0f, 0.0d, 1L };
        double[] doubleArray10 = new double[] { 100.0f, 0.0f, (-1.0d), 0.0d, ' ', (-1) };
        double[] doubleArray11 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray11, 0.0d);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { 0L };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray2, doubleArray3, (double) 0);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray6 = new double[] { 0L, (-1.0d), 100.0d, (byte) 1 };
        double[] doubleArray9 = new double[] { 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray6, doubleArray9, (double) (short) 0);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        double[] doubleArray6 = new double[] { (byte) -1, 0, (short) 1, 0L, (byte) 10, '#' };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        double[] doubleArray3 = new double[] { 10L, (-1.0d), 100 };
        double[] doubleArray7 = new double[] { (byte) 100, 100L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray7, (double) (byte) 0);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        double[] doubleArray2 = new double[] { 10L, (byte) 100 };
        double[] doubleArray4 = new double[] { 100L };
        double[] doubleArray11 = new double[] { (byte) -1, (byte) 10, (byte) 1, 100, 1.0d, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray11, (double) 10);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray4 = new double[] { 10.0d, (byte) 1 };
        double[] doubleArray9 = new double[] { (-1.0f), (byte) 10, (-1), 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray9, (-1.0d));
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        double[] doubleArray6 = new double[] { '4', (short) 0, '#', (byte) 100, (byte) 0, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        double[] doubleArray1 = new double[] { 1 };
        double[] doubleArray3 = new double[] { 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray1, (double) ' ');
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        double[] doubleArray6 = new double[] { 10.0f, 1L, (byte) -1, (-1L), 1.0f, (byte) 100 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) 100L);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { (short) 10, 'a', (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) 1L);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        double[] doubleArray6 = new double[] { (short) 10, 10L, 1.0f, 0.0d, '#', (short) 10 };
        double[] doubleArray7 = new double[] {};
        double[] doubleArray8 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray8, (double) 100L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray6 = new double[] { (byte) 100, 'a', 0.0d, 1.0f, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray6, doubleArray6, (double) 10);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        double[] doubleArray3 = new double[] { (short) 10, (short) 100, 0L };
        double[] doubleArray4 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 1, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray4, doubleArray7, (double) '#');
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        double[] doubleArray4 = new double[] { 0L, (-1L), (short) 10, 0.0d };
        double[] doubleArray8 = new double[] { 10.0d, 1L, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) (-1L));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        double[] doubleArray3 = new double[] { (short) 10, (-1), 0L };
        double[] doubleArray5 = new double[] { 10L };
        double[] doubleArray10 = new double[] { '#', (short) 0, (byte) 1, '#' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray10, (double) 1.0f);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        double[] doubleArray4 = new double[] { (byte) -1, 10, 100, (byte) 0 };
        double[] doubleArray6 = new double[] { 10.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) (short) 1);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        double[] doubleArray5 = new double[] { 100.0f, (byte) 10, 10.0f, 0.0d, ' ' };
        double[] doubleArray12 = new double[] { 1.0d, 1.0f, 1.0f, 0.0d, 100L, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) (byte) 100);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        double[] doubleArray5 = new double[] { 0.0d, (short) 100, ' ', 0, 10 };
        double[] doubleArray12 = new double[] { 1, (-1L), (-1L), 0, 0L, '4' };
        double[] doubleArray16 = new double[] { '4', 0, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) 100);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        double[] doubleArray5 = new double[] { (byte) 100, (-1), 0.0f, (byte) 1, (byte) 0 };
        double[] doubleArray9 = new double[] { (byte) 1, 100.0d, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray9, doubleArray9, (double) 100L);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        double[] doubleArray2 = new double[] { (short) 10, '#' };
        double[] doubleArray3 = new double[] {};
        double[] doubleArray10 = new double[] { (short) 1, (short) 0, 100L, 0L, (byte) 100, (-1.0d) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray10, (double) (short) 0);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        double[] doubleArray4 = new double[] { (byte) 100, 'a', 100L, (short) 100 };
        double[] doubleArray9 = new double[] { (short) -1, (byte) 0, (short) 100, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray9, (-1.0d));
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        double[] doubleArray2 = new double[] { 'a', ' ' };
        double[] doubleArray7 = new double[] { 100.0d, 10.0d, 100, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 100L);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        double[] doubleArray1 = new double[] { 10.0d };
        double[] doubleArray5 = new double[] { (byte) 10, (short) 100, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        double[] doubleArray3 = new double[] { 1.0f, 1.0f, 1L };
        double[] doubleArray5 = new double[] { 0L };
        double[] doubleArray7 = new double[] { 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray7, 0.0d);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        double[] doubleArray2 = new double[] { 0.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 0.0d);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        double[] doubleArray4 = new double[] { 100, '#', 100.0d, (short) 0 };
        double[] doubleArray9 = new double[] { 10L, (-1), 10L, 100 };
        double[] doubleArray13 = new double[] { (-1L), (-1.0f), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray9, doubleArray13, (double) (short) -1);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray2 = new double[] { (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray2, (double) ' ');
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        double[] doubleArray4 = new double[] { (-1L), (-1.0d), 0, 10 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray7, (double) (byte) 100);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        double[] doubleArray3 = new double[] { 100.0f, 'a', (byte) 0 };
        double[] doubleArray5 = new double[] { (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray3, 0.0d);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        double[] doubleArray3 = new double[] { (byte) 100, (short) 1, 1 };
        double[] doubleArray8 = new double[] { '4', (short) 0, (-1.0d), 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        double[] doubleArray3 = new double[] { 10, 1, 0.0f };
        double[] doubleArray8 = new double[] { (byte) 1, 100.0d, 1L, 100.0f };
        double[] doubleArray9 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray9, (double) (byte) -1);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        double[] doubleArray5 = new double[] { ' ', 0.0d, ' ', (short) 10, (-1.0f) };
        double[] doubleArray11 = new double[] { (byte) 1, (byte) -1, (-1.0f), (short) 1, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray11, doubleArray11, 1.0d);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        double[] doubleArray6 = new double[] { (-1L), 10, (short) 0, 10.0d, 1, '#' };
        double[] doubleArray10 = new double[] { (byte) 10, (-1L), (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray6, (double) (short) 100);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { (byte) 10, 1.0f, (-1L), 1.0d, (-1), 1L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) 1);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { 0L, 10L, (byte) 10, (short) 0 };
        double[] doubleArray11 = new double[] { 0.0f, (byte) 0, 0.0d, 1L, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) (byte) 1);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { ' ', (-1), (byte) 0, 100, (byte) 1, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray0, (double) 1.0f);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 1.0d, ' ', (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray0, (double) (byte) 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        double[] doubleArray4 = new double[] { 1, (byte) 10, 10.0f, (short) 100 };
        double[] doubleArray6 = new double[] { 0.0d };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray6, doubleArray7, 100.0d);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        double[] doubleArray6 = new double[] { 1.0f, (-1.0d), 10.0f, 100.0d, ' ', '#' };
        double[] doubleArray10 = new double[] { 0L, 1L, 10 };
        double[] doubleArray13 = new double[] { 100L, (short) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray13, (double) 10L);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        double[] doubleArray4 = new double[] { 1L, 10, 100.0d, (byte) -1 };
        double[] doubleArray7 = new double[] { (byte) 1, 10 };
        double[] doubleArray10 = new double[] { (-1.0d), (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray7, doubleArray10, (double) (short) 100);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        double[] doubleArray2 = new double[] { (short) 10, 100 };
        double[] doubleArray7 = new double[] { 10L, (-1.0d), (short) -1, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray7, (double) 1.0f);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        double[] doubleArray3 = new double[] { 1L, (short) 100, 100L };
        double[] doubleArray8 = new double[] { 10, 10.0d, 10.0d, 0.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 10L);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        double[] doubleArray4 = new double[] { (-1L), 0, 0.0f, (byte) -1 };
        double[] doubleArray5 = new double[] {};
        double[] doubleArray11 = new double[] { 10.0f, (short) 10, 0.0f, (-1), 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray11, (double) (short) 10);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray5 = new double[] { (byte) -1, 0.0f, 0.0f, 100.0d };
        double[] doubleArray11 = new double[] { 10.0f, (short) -1, (short) 0, (byte) 1, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray5, doubleArray11, (double) 1.0f);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        double[] doubleArray6 = new double[] { (short) 0, (byte) -1, 1L, 100, (short) 10, (byte) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10.0f);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        double[] doubleArray3 = new double[] { 0.0d, (short) 0, 0.0f };
        double[] doubleArray6 = new double[] { 0.0f, (-1L) };
        double[] doubleArray12 = new double[] { (-1.0f), 0L, (byte) 1, (short) -1, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray12, (double) '4');
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        double[] doubleArray1 = new double[] { 10 };
        double[] doubleArray5 = new double[] { (-1L), 100.0f, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) (byte) 10);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray7 = new double[] { 100.0d, 10.0f, '4', 10L, (byte) 0 };
        double[] doubleArray10 = new double[] { 10, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray10, (double) (short) 100);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        double[] doubleArray3 = new double[] { (short) 1, 0, ' ' };
        double[] doubleArray9 = new double[] { (short) 1, (-1), ' ', 1L, 1.0f };
        double[] doubleArray13 = new double[] { (byte) 100, 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray13, (double) 10L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        double[] doubleArray3 = new double[] { 10, 10.0d, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 0.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        double[] doubleArray2 = new double[] { 0.0f, ' ' };
        double[] doubleArray6 = new double[] { 100.0f, 10, (short) 1 };
        double[] doubleArray9 = new double[] { (short) -1, 0.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray9, (double) (short) 10);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        double[] doubleArray2 = new double[] { 10L, (-1.0f) };
        double[] doubleArray4 = new double[] { (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray4, doubleArray2, (double) 100L);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        double[] doubleArray3 = new double[] { 0.0f, (short) 10, (byte) 100 };
        double[] doubleArray10 = new double[] { '4', ' ', 0.0d, (short) 100, (short) 100, 10.0d };
        double[] doubleArray15 = new double[] { (byte) 1, '4', '4', (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray10, doubleArray15, (double) 100);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        double[] doubleArray6 = new double[] { (byte) -1, (short) 100, (short) 100, (short) 100, (byte) -1, (short) 0 };
        double[] doubleArray12 = new double[] { 'a', 1.0f, 10L, 0L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray12, (double) (byte) 10);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        double[] doubleArray6 = new double[] { (byte) 10, 10.0d, (byte) 1, 10L, 1L, (byte) 1 };
        double[] doubleArray7 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray7, doubleArray6, (double) (byte) 10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        double[] doubleArray3 = new double[] { 100.0f, (-1.0f), 100L };
        double[] doubleArray9 = new double[] { ' ', '4', (-1L), (byte) 100, 0.0f };
        double[] doubleArray14 = new double[] { 0.0d, 10.0d, (byte) -1, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray9, doubleArray14, (double) 100);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        double[] doubleArray1 = new double[] { (short) 1 };
        double[] doubleArray4 = new double[] { 10.0d, 100.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray4, doubleArray4, (double) '#');
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        double[] doubleArray6 = new double[] { 1L, (byte) 1, 100L, '4', 0L, '4' };
        double[] doubleArray12 = new double[] { (byte) 0, 0.0f, (short) 1, (short) 100, 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray12, (double) 0L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        double[] doubleArray6 = new double[] { 0, (short) 100, 10.0d, 0, 100L, (byte) 0 };
        double[] doubleArray10 = new double[] { 100, '4', (byte) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray10, doubleArray10, (double) ' ');
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        double[] doubleArray3 = new double[] { 100, (byte) 1, 1 };
        double[] doubleArray6 = new double[] { '#', (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray6, (double) (short) 10);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        double[] doubleArray3 = new double[] { 100.0f, 100, (-1.0d) };
        double[] doubleArray5 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray5, (double) 1);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        double[] doubleArray4 = new double[] { '4', (byte) 1, (short) 0, (-1.0f) };
        double[] doubleArray8 = new double[] { (-1), 1, 1.0d };
        double[] doubleArray12 = new double[] { (byte) -1, (-1.0f), (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray8, doubleArray12, (double) ' ');
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        double[] doubleArray3 = new double[] { (short) 100, '#', 100L };
        double[] doubleArray6 = new double[] { 100.0d, 100.0f };
        double[] doubleArray13 = new double[] { (short) 100, 100, 100.0d, (byte) 100, 10, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray6, doubleArray13, (double) (-1L));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        double[] doubleArray5 = new double[] { 0, 10.0f, (short) 100, ' ', 10.0d };
        double[] doubleArray7 = new double[] { (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray7, doubleArray5, (double) 1L);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        double[] doubleArray5 = new double[] { (-1L), '4', 10.0f, '4', '#' };
        double[] doubleArray12 = new double[] { (byte) 10, 0.0f, 10.0d, 10L, 0.0f, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 100);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        double[] doubleArray3 = new double[] { 1.0d, 100L, '4' };
        double[] doubleArray7 = new double[] { '#', 1L, (byte) 100 };
        double[] doubleArray14 = new double[] { 100, (byte) 0, '#', 10, '4', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray7, doubleArray14, (double) 10L);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        double[] doubleArray3 = new double[] { (byte) 0, (short) 100, 0L };
        double[] doubleArray5 = new double[] { (byte) 100 };
        double[] doubleArray9 = new double[] { ' ', 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray9, (double) (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        double[] doubleArray3 = new double[] { (byte) -1, 100L, 1.0f };
        double[] doubleArray5 = new double[] { 100L };
        double[] doubleArray9 = new double[] { (byte) 0, (-1.0f), 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray9, (double) 0L);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        double[] doubleArray6 = new double[] { '4', '4', ' ', (short) 1, (short) 10, 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) (byte) 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        double[] doubleArray4 = new double[] { 10.0d, (byte) 100, 10L, (short) 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (-1.0d));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        double[] doubleArray3 = new double[] { 100.0f, 10.0f, '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) '4');
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray1, (double) (byte) 0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray4 = new double[] { 0L, (byte) 100, (byte) 100 };
        double[] doubleArray6 = new double[] { 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray4, doubleArray6, (double) 10L);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray1 = new double[] {};
        double[] doubleArray3 = new double[] { 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray1, doubleArray3, (double) 10L);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        double[] doubleArray6 = new double[] { 10.0f, 'a', (byte) 10, 0.0d, 10.0f, (-1.0d) };
        double[] doubleArray12 = new double[] { 1.0f, 0L, (short) 100, (-1L), 10.0d };
        double[] doubleArray19 = new double[] { 0, 10.0f, 0.0f, 1, ' ', (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray12, doubleArray19, (double) (-1));
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        double[] doubleArray1 = new double[] { (short) 0 };
        double[] doubleArray3 = new double[] { 10.0f };
        double[] doubleArray8 = new double[] { 100.0f, 100L, 1L, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray3, doubleArray8, (-1.0d));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        double[] doubleArray4 = new double[] { (short) -1, (short) 100, (-1.0f), (byte) 10 };
        double[] doubleArray6 = new double[] { (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray6, (double) 10L);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        double[] doubleArray1 = new double[] { 100.0d };
        double[] doubleArray7 = new double[] { 0.0d, (-1.0f), 10.0f, (byte) 0, 1.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray7, (double) 1.0f);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        double[] doubleArray5 = new double[] { 1, 0.0d, 100, (byte) -1, (short) 10 };
        double[] doubleArray12 = new double[] { 0, (byte) -1, ' ', 100L, (-1L), 1L };
        double[] doubleArray16 = new double[] { (short) 0, (byte) 10, (byte) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray16, (double) 1);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        double[] doubleArray4 = new double[] { 0L, 10.0d, 100.0d, (byte) 100 };
        double[] doubleArray10 = new double[] { 1, 100L, 0, (byte) 10, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray10, (double) 1L);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        double[] doubleArray2 = new double[] { (-1), (short) -1 };
        double[] doubleArray5 = new double[] { 0, 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray5, (double) (byte) -1);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        double[] doubleArray6 = new double[] { (byte) 10, 10.0d, (-1L), 0, (-1.0d), 100L };
        double[] doubleArray9 = new double[] { 1L, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray9, (double) 100.0f);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        double[] doubleArray5 = new double[] { 10.0f, (short) 1, (-1.0f), (short) -1, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) '#');
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        double[] doubleArray1 = new double[] { (short) 100 };
        double[] doubleArray2 = new double[] {};
        double[] doubleArray5 = new double[] { (short) 1, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray5, 0.0d);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        double[] doubleArray3 = new double[] { '4', 1, 0 };
        double[] doubleArray8 = new double[] { (byte) 1, '4', 10, (short) -1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray8, doubleArray8, (double) 100.0f);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        double[] doubleArray4 = new double[] { 10.0f, 0, 0, (short) 100 };
        double[] doubleArray8 = new double[] { 1.0f, 0.0d, 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray8, (double) 1);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        double[] doubleArray4 = new double[] { ' ', '4', (byte) -1, 10L };
        double[] doubleArray5 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray5, doubleArray4, (double) (byte) 0);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        double[] doubleArray2 = new double[] { 0.0f, 1 };
        double[] doubleArray6 = new double[] { (-1L), 100.0f, (short) 100 };
        double[] doubleArray8 = new double[] { (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray6, doubleArray8, 0.0d);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray8 = new double[] { 10L, 1L, 100.0f, (byte) 1, 10.0f, (short) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray8, (double) (short) 100);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        double[] doubleArray3 = new double[] { 1.0d, (short) 10, 'a' };
        double[] doubleArray5 = new double[] { (byte) 0 };
        double[] doubleArray11 = new double[] { 100.0f, 1.0d, 100, ' ', 100L };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray5, doubleArray11, (double) (short) 1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        double[] doubleArray1 = new double[] { 0L };
        double[] doubleArray5 = new double[] { 100.0d, (short) 0, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray1, (double) 1.0f);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        double[] doubleArray1 = new double[] { 0 };
        double[] doubleArray2 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray2, doubleArray2, (double) (byte) 100);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        double[] doubleArray2 = new double[] { 0, (byte) 100 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, (double) 10);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 0, (byte) 1, 'a', (byte) -1, 0.0f, 1.0d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray7, doubleArray7, 100.0d);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        double[] doubleArray6 = new double[] { 0.0d, (-1.0d), (byte) -1, (short) 1, 0L, (short) 10 };
        double[] doubleArray11 = new double[] { (byte) 0, '4', (short) 100, (-1L) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray11, (double) 100);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        double[] doubleArray2 = new double[] { (short) 10, (short) 0 };
        double[] doubleArray9 = new double[] { 1.0d, (byte) -1, (byte) 100, 1.0d, (short) -1, (-1) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray9, (double) (short) 1);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        double[] doubleArray5 = new double[] { 100.0f, 0.0d, 1.0d, (byte) 0, (byte) 1 };
        double[] doubleArray12 = new double[] { 0.0f, 100.0f, 1.0d, 10.0f, 0, (-1) };
        double[] doubleArray13 = null;
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray12, doubleArray13, (double) (short) 1);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        double[] doubleArray1 = new double[] { (-1.0d) };
        double[] doubleArray5 = new double[] { 0.0f, 1L, (-1) };
        double[] doubleArray12 = new double[] { ' ', 0.0f, ' ', 10.0f, 10, (-1.0f) };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray5, doubleArray12, (double) (-1L));
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        double[] doubleArray1 = new double[] { 0.0d };
        double[] doubleArray7 = new double[] { (short) -1, 10L, '#', 100, 10L };
        double[] doubleArray14 = new double[] { 10, (-1L), ' ', (byte) 100, (byte) 10, 10.0f };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray7, doubleArray14, (-1.0d));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        double[] doubleArray1 = new double[] { 0.0f };
        double[] doubleArray5 = new double[] { 0L, 100L, (short) 1 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray1, doubleArray1, doubleArray5, (double) 10L);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        double[] doubleArray0 = new double[] {};
        double[] doubleArray7 = new double[] { 10.0f, 10, (-1L), 100.0d, '#', '4' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathArithmeticException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray0, doubleArray0, doubleArray7, (double) (byte) 1);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        double[] doubleArray6 = new double[] { '4', 0.0d, 1.0d, (byte) 0, (short) 100, 'a' };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.OutOfRangeException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray6, doubleArray6, doubleArray6, (double) 10);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        double[] doubleArray4 = new double[] { 10L, 'a', 1.0f, (short) -1 };
        double[] doubleArray11 = new double[] { (-1.0f), 0.0f, (byte) 1, ' ', (byte) 100, (short) 1 };
        double[] doubleArray13 = new double[] { (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray11, doubleArray13, (double) 10.0f);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        double[] doubleArray5 = new double[] { 'a', 0L, (short) -1, (byte) 1, (short) 10 };
        double[] doubleArray12 = new double[] { (-1.0d), 10, ' ', (byte) -1, (byte) 1, 0 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray12, (double) 1);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        double[] doubleArray3 = new double[] { (-1L), (byte) 10, 1.0d };
        double[] doubleArray10 = new double[] { (-1.0f), (-1), (byte) 10, 100, 100, (byte) 10 };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NotPositiveException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray10, 100.0d);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        double[] doubleArray2 = new double[] { (-1), 1.0d };
        double[] doubleArray3 = new double[] {};
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.DimensionMismatchException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray3, doubleArray3, (double) 1.0f);
    }
}
