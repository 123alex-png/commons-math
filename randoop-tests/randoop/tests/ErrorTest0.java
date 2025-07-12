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
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.5d, (double) 1, 1.0d, 2.0d);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-0.0d), 1.0E-4d, 0.0d, 1.0E-8d);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0E-10d, (double) 1.0f, 1.0d, 2.0d);
    }
}
