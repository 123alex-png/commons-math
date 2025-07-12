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
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NumberIsTooLargeException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(512.0d, 1.0E-6d, 1.0E-12d, 42.0d, (double) (short) 1, 1024.0d, 1.0d);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        // during test generation this statement threw an exception of type java.util.concurrent.TimeoutException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.1d, (double) (-1L), (double) ' ', (double) 100L, (-1.0E10d), 1.0E8d, 2.0d);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NumberIsTooLargeException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(5.0d, (double) 100.0f, 1.0E8d, 0.0d, 0.1d, (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NumberIsTooLargeException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 0L, (double) 10.0f, (double) (byte) 0, (double) (byte) 1, (double) 1.0f, 10000.0d, (double) (byte) 1);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NumberIsTooLargeException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 1, 1024.0d, (double) (byte) 0, 0.0d, (double) (-1.0f), (double) (short) 10, (double) (-1));
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NumberIsTooLargeException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 10, 2.0d, 0.0d, 0.001d, (double) (-1L), 256.0d, (double) (-1.0f));
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        // during test generation this statement threw an exception of type java.util.concurrent.TimeoutException in error
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((-1.0E10d), 0.0d, (double) 1L, 1000000.0d, (-1.0E10d), 2.0d, 1.0E-12d);
    }
}
