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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        double[] doubleArray2 = new double[] { 1.0E-15d, 0.25d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NoBracketingException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray2, doubleArray2, 1.0E-8d);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        double[] doubleArray4 = new double[] { 1.0E-12d, 1L, 0.9d, (short) 1 };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray4, doubleArray4, doubleArray4, (double) '4');
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        double[] doubleArray5 = new double[] { 0.9d, 1.0E-4d, 0.0d, 1.0d, 0.01d };
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray5, doubleArray5, doubleArray5, (double) 100.0f);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        double[] doubleArray3 = new double[] { 0.3333333d, 0.25d, 1.0E-8d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NoBracketingException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray3, doubleArray3, doubleArray3, (double) 'a');
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        double[] doubleArray2 = new double[] { 1, 10.0f };
        double[] doubleArray5 = new double[] { 0.70710678d, 1.0E-6d };
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NoBracketingException in error
        org.apache.commons.math3.test.testAdditivePerturbationEffect(doubleArray2, doubleArray5, doubleArray5, 0.3333333d);
    }
}
