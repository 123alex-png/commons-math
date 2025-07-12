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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100.0f, 10.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        // during test generation this statement threw an exception of type org.apache.commons.math3.geometry.spherical.oned.ArcsSet$InconsistentStateAt2PiWrapping in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) 1.0f, (double) 10L, (double) 0.0f, (double) 1L);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (-1), (-1.0d), 100.0d, (double) (short) 10);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) ' ', (double) (byte) 1, (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (-1), (double) (-1.0f), (double) 10L, (double) (-1));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 10L, 1.0d, (double) 100, (double) 100.0f);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 'a', (double) 1L, (double) (short) 100, 97.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) '4', 0.0d, (double) 100, 0.0d);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) 10.0f, (double) (byte) 100, (double) (byte) 1, (double) 0L);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (short) 1, 10.0d, 100.0d, (double) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 1.0d, (double) 100.0f, (double) 0, 0.0d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) '#', (double) (byte) 1, 0.0d, (double) (short) -1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) 10, (double) 10L, (double) '#', (double) 100L);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10, (double) (-1L), (double) (short) 1, (double) 0L);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', (double) 1, (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (short) 100, (double) 1, (double) 1.0f, (double) (-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (byte) 0, (double) 0L, (double) 100L, 0.0d);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 1.0d, (double) 1.0f, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100, (double) (short) 0, 100.0d, (double) 10.0f);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 0L, (double) (short) -1, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 1.0d, (double) (byte) -1, (double) '#', 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 100.0f, (double) 0L, (double) (-1), 10.0d);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 100.0d, (double) (byte) 1, (double) 0, (double) (short) 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 100.0d, 97.0d, 0.0d, 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 0, (double) '4', (double) 100L, (double) (byte) 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (short) 1, (double) (byte) 1, (double) '4', (double) 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 100.0f, (double) (byte) 1, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 100, (double) (-1.0f), 35.0d, (double) (byte) -1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', 100.0d, (double) (-1L), (double) (short) 1, (double) 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) 100, (double) (short) 100, 10.0d, (double) 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 0.0d, (double) (-1.0f), (double) 100L, 1.0d);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 1, (-1.0d), (double) (short) 100, (-1.0d));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 10.0d, (double) (byte) 10, (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 1.0f, (double) (-1.0f), (double) 1, (double) 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (short) -1, (double) 10.0f, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 10, (double) 100L, 35.0d, (-1.0d));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, 97.0d, (double) 10, (double) 0, (double) 10L);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 35.0d, (double) (byte) 0, (double) ' ', (double) 100L);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 10L, (double) 100.0f, (double) (-1L), 35.0d);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 100.0f, 97.0d, (double) 'a', (-1.0d));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 10.0d, (double) (byte) 10, (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (-1.0f), (double) (short) 10, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        // during test generation this statement threw an exception of type org.apache.commons.math3.geometry.spherical.oned.ArcsSet$InconsistentStateAt2PiWrapping in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (byte) -1, (double) (byte) -1, (-1.0d), (double) 1.0f);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 35.0d, (double) (short) 10, 97.0d, 10.0d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, 0.0d, (double) (short) 0, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) (byte) 0, (double) (-1L), (double) 100L, (double) 10.0f);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 1, (double) 1, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (byte) -1, 35.0d, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 10, 0.0d, (double) (byte) 1, (double) 10L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (short) 1, (double) 100L, (double) 100.0f, (double) 0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, 10.0d, (double) (byte) -1, (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) 1L, (double) '4', (double) 100.0f, (double) 1L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100.0f, (double) (short) 10, (double) 0L, (double) 10L);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 1.0f, (double) ' ', (double) '4', (double) 1L);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (short) 1, (double) 100.0f, (double) '4', (double) (-1L));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (byte) 1, (double) (short) 100, 32.0d, (double) (byte) 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) '4', (double) 0.0f, 32.0d, (double) 100.0f);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 0L, (double) 10.0f, (double) 100, (double) '4');
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (short) 10, 0.0d, (double) (short) 10, (double) 1.0f);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', 32.0d, (double) (-1), 97.0d, (double) ' ');
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 100, (double) (byte) 0, (double) 10, 35.0d);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1, 32.0d, (double) (byte) 100, (double) 0L);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 0.0d, 32.0d, (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (short) -1, (double) (-1L), (double) '#', 32.0d);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 100.0d, (double) (short) 10, (double) (short) -1, (double) (short) -1);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) '#', (double) '4', (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) ' ', (double) '4', 0.0d, (double) (-1L));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 0.0d, (double) (-1), 32.0d, (double) (short) 100);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (byte) 100, (double) (-1), 32.0d, 0.0d);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 0.0d, 1.0d, (double) (short) -1, 0.0d);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) '4', (double) (-1.0f), (double) 10, (double) '4');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 0L, (double) (byte) -1, (double) 100L, 0.0d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10.0f, (double) 100, (double) 0, (double) (byte) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 10.0d, (double) '#', (double) 1L, (double) 10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100L, (double) 1, 0.0d, (double) (short) 100);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) ' ', (double) ' ', (double) (short) 1, 35.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 0.0f, (double) ' ', (double) (short) 100, (double) 10L);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 'a', 97.0d, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 100.0d, (double) (byte) -1, (double) '#', (-1.0d));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (byte) 1, (double) (byte) 100, (double) 100.0f, (-1.0d));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) (short) 100, 0.0d, (double) (short) 100, (double) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 100.0f, (double) 0, (double) (-1.0f), (double) '4');
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 100.0f, (double) '#', 97.0d, (double) 0.0f);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (short) 100, (-1.0d), (double) (-1L), (double) 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (-1L), (double) (byte) -1, (double) 100.0f, (double) (short) 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 100L, (double) (short) 10, (double) '#', (double) 100.0f);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) (byte) 100, (double) 1L, (double) (short) 10, (double) 0L);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (-1.0f), (double) (short) 0, (double) ' ', (double) (byte) 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100.0f, (double) 10, (double) 0L, 97.0d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', (double) 100, (double) 10.0f, (double) 'a');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (-1L), 1.0d, 97.0d, (double) (byte) 10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 10.0f, (double) 10, 100.0d, 0.0d);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) '#', 35.0d, 100.0d, (double) 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) '4', (double) (byte) 0, (double) 0L, (double) (-1L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 97.0d, (double) 'a', (double) 10, (double) 0L);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (short) 1, (double) (-1), (double) (byte) 100, (double) (short) -1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) '#', (double) '#', (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', (double) 'a', 35.0d, (double) ' ');
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) ' ', (double) 10L, (double) (short) 1, (double) 0.0f);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 1L, (double) 'a', (double) 1L, (double) 0.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 32.0d, (double) (short) 0, (double) '#', (double) 0L);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, 32.0d, (double) 10.0f, 10.0d, (double) (short) 0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) (byte) 100, (double) (byte) 0, (double) 10, 52.0d);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 100.0d, 35.0d, (double) 100, (double) (byte) 100);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10L, 0.0d, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10, 0.0d, 52.0d, (double) (short) 10);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 10.0d, (double) 10.0f, (double) (short) 100, (double) 1);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) '#', 0.0d, (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 52.0d, (double) 100L, 0.0d, (double) 1L);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (short) -1, (double) 1.0f, (double) '4', (double) (byte) 100);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 10, (double) 10.0f, (double) (-1.0f), (double) 1L);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (short) 0, (double) (short) 100, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 100, 10.0d, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 100, (double) 'a', (double) 0.0f, 52.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) -1, (double) 0.0f, 97.0d, (double) 1.0f);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 97.0d, 32.0d, (double) '4', (double) 0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 1L, (double) 10L, (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 'a', (double) (byte) 1, (double) (byte) 10, (double) 1.0f);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) 100L, (double) 0.0f, (double) (byte) 10, (double) 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 35.0d, (double) 10.0f, (double) (-1L), 1.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 10, (double) 1L, (double) 100L, (double) (-1L));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 0, (double) 1, 10.0d, 97.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) -1, 97.0d, 97.0d, (double) (short) -1);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (byte) 1, (double) (-1), (double) 100, (double) (byte) 1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) -1, (double) 10L, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 1.0f, (double) (-1L), (double) 10L, (double) 10L);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 100.0d, (double) (byte) -1, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 52.0d, 1.0d, (double) (byte) 1, (double) 0L);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 1.0d, (double) (byte) 1, (double) '#', (double) 0.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) ' ', 52.0d, (double) 100.0f, (double) 0L);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 1.0f, (double) (-1), (double) (short) 10, 52.0d);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 97.0d, (double) 0.0f, (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) (-1.0f), (double) (short) 1, (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 0, 0.0d, (double) '#', (-1.0d));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 100.0f, 0.0d, (double) (short) 100, 35.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (byte) -1, (double) (-1L), (double) (-1L), (-1.0d));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 32.0d, (double) (-1), 32.0d, (double) 100);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 10, (double) (byte) 0, 0.0d, (double) 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 'a', 0.0d, (double) 1L, (double) (-1));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, 10.0d, 10.0d, (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) 1L, (double) 10L, 52.0d, (double) 0.0f);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (short) 1, (double) 1, (double) 10.0f, (double) '#');
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (byte) 0, (double) ' ', 97.0d, (double) 100);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (-1), (double) 1, (double) 100.0f, 0.0d);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (short) 100, 0.0d, 32.0d, (double) (byte) 100);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (byte) 1, (double) (byte) -1, (double) (byte) -1, (-1.0d));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (byte) -1, (double) (short) 1, (double) 100L, (double) 1L);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) 100, 0.0d, (double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 100.0f, (double) 0L, (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 100.0f, 1.0d, (double) 0.0f, (double) 1L);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (-1.0f), (double) 0.0f, (double) 10, (double) 10.0f);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 100, (double) (byte) -1, (double) (short) 10, 0.0d);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, 1.0d, (double) 0.0f, (double) '4', 52.0d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 10, (-1.0d), 0.0d, (double) (byte) 10);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) (-1.0f), (-1.0d), (double) 10L, (double) 0L);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 0.0d, (double) 10, 97.0d, (double) 10L);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, 1.0d, (double) '4', (double) (short) 100, (double) 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 35.0d, (double) 10.0f, (double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 0, (double) (byte) 1, (double) (byte) 10, (double) (byte) 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (short) 1, 1.0d, 97.0d, (double) 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 10.0f, 0.0d, (double) 100L, (double) 100L);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) '4', (double) 1L, (double) 10L, (double) 10.0f);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 0, 0.0d, 100.0d, (double) (-1.0f));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 35.0d, (double) (short) -1, (double) 'a', 10.0d);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (byte) 100, (double) 1L, 10.0d, 97.0d);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) 10L, 0.0d, (double) ' ', (double) '#');
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 0.0f, (double) (short) 0, 97.0d, (double) (-1.0f));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (short) 10, (double) '#', 97.0d, (double) ' ');
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, 35.0d, (double) ' ', (double) 100, (-1.0d));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) 10L, (double) 0L, (double) 'a', (double) 'a');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 1.0d, (double) (byte) 1, (double) '#', (double) 1L);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 10.0f, (double) (short) 1, (double) (-1L), (double) 10L);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 0.0d, (double) (short) 10, (double) 1.0f, (double) (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 52.0d, (double) 1L, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 100L, (double) 10, (double) 100, 0.0d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (byte) 100, (double) (byte) 0, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, 100.0d, (double) (byte) 1, (-1.0d), 0.0d);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (-1.0f), (double) 100.0f, (double) 10.0f, (double) 0.0f);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 100.0f, (double) (byte) 0, (double) (short) 10, (double) (short) 100);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (-1L), (double) 0, (double) ' ', (double) 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 100, (double) 1L, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', 100.0d, (double) (byte) 0, (double) '4', (double) (byte) 1);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 52.0d, (double) 'a', 0.0d, 1.0d);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) 0, 0.0d, (double) '4', 97.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 'a', 32.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 1, (double) 0L, (double) 100.0f, (double) (byte) 100);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) '4', 97.0d, (double) 100.0f, (double) 10);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 32.0d, 0.0d, 100.0d, (double) 10.0f);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (short) 1, (double) ' ', (double) 1.0f, (double) (-1L));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) ' ', 35.0d, (double) (short) 1, (double) '#');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 100L, (double) ' ', (double) 1.0f, (double) 1L);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (-1.0f), (double) (short) -1, (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 97.0d, 0.0d, 32.0d, (double) 0L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 35.0d, (double) ' ', (double) (short) 10, (double) 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, 1.0d, 1.0d, 100.0d, 97.0d);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) 'a', (double) '4', (double) (byte) 0, 97.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 1, (double) 'a', (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 100.0f, (double) '4', (double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (-1L), 32.0d, (double) 100, (double) 100L);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) 100, (double) 100L, (double) (short) 0, (double) '#');
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10.0f, (double) 10.0f, (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) '4', 35.0d, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) 0L, 0.0d, (double) (short) 10, 97.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (-1.0f), (double) (-1.0f), (double) '#', (double) 'a');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 1.0d, 0.0d, (double) 'a', (double) (short) 100);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 100, (double) (byte) 100, 100.0d, (double) ' ');
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) 100.0f, (double) 1L, 97.0d, (double) 10.0f);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) 1, (double) 0.0f, (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 10, (double) 'a', (double) (short) 10, (double) 1L);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (short) -1, (double) '#', (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, 0.0d, (double) 1.0f, (double) 100.0f, (double) (short) 100);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 52.0d, (double) 100, (double) '#', (double) (short) 10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (short) 100, (double) 100L, (double) 10.0f, (double) (byte) 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 1.0d, (double) 0, (double) ' ', (double) 100.0f);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 100L, (double) 0, (double) 1, 100.0d);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (byte) -1, (double) 10.0f, (double) 10L, 0.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) (short) 10, (double) 0.0f, 52.0d, (double) '#');
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 97.0d, 97.0d, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (byte) 10, 32.0d, (double) 0.0f, 0.0d);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10, 97.0d, (double) 1L, (double) (-1));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (byte) 100, 35.0d, (double) (byte) 100, 52.0d);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (-1), (double) 1.0f, (double) 1.0f, (double) 1L);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 0.0d, (double) (-1.0f), (double) (short) 100, (double) (-1));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (short) 100, (double) (short) 0, (double) ' ', (double) ' ');
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 10.0d, (double) (byte) -1, (double) 10L, (double) (-1));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 0.0f, (double) '4', (double) 1L, 0.0d);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 1, (double) 10.0f, (double) 'a', (double) (-1.0f));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 0L, (double) (short) 1, (double) 10, 1.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) '4', (double) 10.0f, 1.0d, 35.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 100, (double) '#', (double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 1.0d, (double) (byte) 10, (double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (short) -1, (double) 10L, (double) '#', (double) '4');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) '#', (double) (short) 10, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10, (double) 'a', (double) (-1), (double) ' ');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) (byte) 100, (double) (short) -1, 10.0d, (double) (byte) 100);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 10.0d, (double) 10.0f, (double) (-1), (double) (-1));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, 35.0d, 35.0d, (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10, (double) 10.0f, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 0.0f, 52.0d, 100.0d, 97.0d);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, 32.0d, (double) 1L, 0.0d, 35.0d);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (-1.0d), 0.0d, (double) 0, (double) (short) -1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) '#', 0.0d, (double) 1, (double) 10L);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 97.0d, (double) 10L, (double) 10L, 97.0d);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) (-1), (double) 0.0f, 52.0d, (double) (short) 100);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 100.0f, (double) (byte) 100, 32.0d, (double) (short) 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 10L, (double) 100L, (double) 0, (double) (-1L));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 'a', (double) '4', 0.0d, (double) (-1.0f));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (byte) 0, 0.0d, (double) 100L, (double) (byte) 100);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) ' ', (double) 100L, (double) (byte) -1, 32.0d);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 52.0d, (double) 10, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 35.0d, (double) (byte) -1, (double) (short) 0, 100.0d);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) (byte) -1, (double) 0L, (double) 10, (double) 100L);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 0.0f, (double) (short) 0, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100L, 35.0d, (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 100.0d, (double) '4', (double) (byte) 1, (double) (short) 0);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 52.0d, (double) (short) 0, (double) '4', (-1.0d));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 35.0d, 97.0d, (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10, 32.0d, (double) 0.0f, 32.0d);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) 1L, (double) 10, (double) 100, (double) 10);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100L, (double) 0.0f, 100.0d, 10.0d);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10, (double) (byte) 0, 35.0d, (double) (byte) 10);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) '4', (double) (byte) 10, (double) 1.0f, 1.0d);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 52.0d, (double) (short) 0, 52.0d, (double) 10);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (byte) 10, 52.0d, (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100L, (double) (byte) -1, (double) (byte) 10, 35.0d);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 97.0d, (double) '#', 52.0d, 0.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 0.0d, (double) 100L, (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10.0f, (double) 1, 32.0d, (double) 1.0f);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) 1, (double) 0.0f, (double) 10, 0.0d);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (byte) 100, (double) (byte) -1, (double) 100.0f, (double) '#');
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (byte) 100, (-1.0d), (double) 10L, (double) (byte) -1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (short) 100, 10.0d, (double) (short) 100, (double) 1L);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 100.0f, 32.0d, (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 0.0d, (double) 100L, (double) 100L, (double) (-1L));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, 35.0d, (double) 1.0f, (double) ' ', (double) (short) 10);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, 0.0d, 0.0d, (double) (-1L), (double) (-1));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (byte) 100, (double) 'a', (double) (-1), 52.0d);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 100L, (double) '4', (double) 0L, (double) 1.0f);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 0, 10.0d, (double) 1L, (double) (byte) 0);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 97.0d, (double) (byte) 1, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (-1), (double) 10L, (double) '#', (double) ' ');
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (byte) -1, (double) 0, (double) '4', (double) (byte) 10);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (byte) 100, 0.0d, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 32.0d, (double) (-1L), (double) '#', (double) (byte) 0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) 0L, (double) ' ', (double) (byte) -1, 0.0d);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) (-1L), (double) 0L, (double) 10.0f, 100.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 100L, (double) (byte) 100, (double) 100.0f, 10.0d);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 10.0d, (double) 10, (-1.0d), 10.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 100, (double) (-1), (double) (-1), (double) (short) 100);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 97.0d, (-1.0d), (double) 1.0f, (double) '4');
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 100L, 1.0d, (double) '#', (double) 10);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 32.0d, (double) 1L, (double) 10L, (double) (short) 10);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 97.0d, (double) '4', (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 97.0d, (double) (byte) 1, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 10, (double) (-1L), (double) 0.0f, (double) (byte) 100);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 10L, (double) 10.0f, (double) 100, 0.0d);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (short) 10, (double) 100.0f, (double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 97.0d, (double) 0.0f, 97.0d, (double) (short) -1);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 0, (double) 100.0f, 32.0d, (double) 0L);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, 1.0d, (double) (short) 10, 52.0d, 52.0d);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (short) -1, 0.0d, 35.0d, (double) '4');
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, 10.0d, (double) (byte) 100, (double) 'a', (double) 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 52.0d, (double) '4', 0.0d, (double) (-1.0f));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 52.0d, (double) 100.0f, (double) 10L, (double) (short) 10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 100.0d, (double) (byte) 100, (double) 1L, (double) (byte) -1);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) '4', 0.0d, (double) 0.0f, (double) '#');
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (byte) 100, (double) (byte) 100, (double) 100, (double) (byte) 1);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 0.0d, (double) (byte) 0, (double) (byte) 100, (double) ' ');
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) 100.0f, (double) (byte) -1, (double) (short) 0, (double) '#');
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) ' ', (double) 10, (double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 100, 100.0d, 0.0d, (double) '#');
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, 1.0d, (double) 0, (double) 10L, (double) (short) 0);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (byte) 100, 100.0d, 100.0d, (double) (-1.0f));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 97.0d, 1.0d, (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) 100, (double) 'a', 0.0d, (double) 100.0f);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 35.0d, 10.0d, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 0, (double) (byte) -1, (double) 100L, (double) (-1));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) (byte) 10, (double) (byte) -1, (double) 100L, (double) (short) 1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (short) 1, 52.0d, (double) 100L, 97.0d);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 100L, (double) ' ', (double) '#', (double) 1L);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, 52.0d, (double) (-1L), (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 10, 97.0d, 52.0d, 0.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (byte) 1, (double) (-1), 10.0d, (double) (byte) 10);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) 0, 52.0d, (double) 100.0f, 32.0d);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10L, (double) (byte) -1, (double) (short) 10, 52.0d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 10.0d, (double) 0.0f, 35.0d, 1.0d);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 0L, 32.0d, (double) ' ', (-1.0d));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 10.0f, (double) (byte) -1, (double) (short) -1, 10.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) 100, (-1.0d), (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 0.0d, (double) (short) 1, (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) (-1), 35.0d, 100.0d, (double) (byte) 100);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (-1), 10.0d, (double) (-1L), (double) (short) -1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 0.0f, 35.0d, 100.0d, (double) 0L);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) (byte) 10, (double) (byte) 1, 0.0d, 35.0d);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (short) 10, (double) 100L, 0.0d, (double) 0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (-1L), (double) (-1.0f), (double) (short) 0, 1.0d);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) ' ', (double) (byte) 0, 1.0d, (double) (byte) 10);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (byte) -1, (double) 1.0f, (double) 1.0f, 0.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10.0f, 52.0d, (double) (short) 10, 100.0d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 10, 1.0d, (double) 100, (double) 100L);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 32.0d, 0.0d, (double) 100L, (double) (short) -1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 100.0d, (double) 10, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) 100, 97.0d, (double) (byte) 10, (double) 0);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 100, (double) 10, 32.0d, (double) 100L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 35.0d, 97.0d, (double) 0L, 10.0d);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (byte) 10, (double) (byte) 1, (-1.0d), (double) (short) -1);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, 52.0d, (double) '4', (double) 'a', (double) (-1));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (short) 1, (double) (short) 0, 32.0d, (double) (short) 1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) 1L, (-1.0d), (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) '#', (double) 0.0f, (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (-1L), 1.0d, (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 100L, 0.0d, 35.0d, 32.0d);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 35.0d, (double) (-1.0f), 1.0d, (double) 1L);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 1L, (double) (byte) 0, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 100.0f, (double) (byte) 100, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 100.0f, (double) (short) 0, (double) (-1L), (double) (-1L));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, 32.0d, (double) 1.0f, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) -1, (double) (-1L), (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 0L, (double) ' ', 1.0d, (double) (-1.0f));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 32.0d, (double) 'a', 1.0d, (double) 10);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 100.0d, 0.0d, (-1.0d), (double) (short) -1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (short) 10, (double) (byte) 10, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) '#', (double) '#', (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (byte) -1, (double) ' ', (double) 100, (double) (-1.0f));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 97.0d, (-1.0d), (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 32.0d, (double) (byte) 100, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 1, (double) 0, (double) (short) 10, (double) (short) 100);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 10, 0.0d, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) ' ', 35.0d, 100.0d, (double) ' ');
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 97.0d, (double) (byte) 1, (double) 100, 0.0d);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) 100, (double) (short) 100, (double) (byte) 10, (double) 1.0f);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 100.0d, (double) 10L, (double) 0, 0.0d);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 32.0d, (double) (byte) 0, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 100.0d, (double) (byte) 10, (double) (-1L), (double) 10L);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (short) 1, (double) 1L, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 97.0d, (double) 0L, (double) 100L, (double) 10L);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) (short) -1, (double) (short) 1, (double) (short) 100, 100.0d);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (short) 10, (double) 0, 52.0d, (double) (short) -1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 35.0d, 35.0d, (double) 1.0f, (double) 10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (short) -1, (double) (-1L), (double) (short) -1, (double) (short) -1);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) '4', (double) '#', 97.0d, (double) (-1));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 100L, (double) 1, (double) '#', (double) (byte) 1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (byte) 10, (double) (-1L), (double) 100L, (double) '4');
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, 97.0d, (double) 'a', (double) (byte) 10, (double) 100L);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (short) -1, (double) 0L, (double) 100L, (double) 10L);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 1L, (double) (short) -1, (double) 10L, (double) (short) 10);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) '4', (double) 100L, (double) (byte) 100, (double) 10);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 100.0d, (double) 0, (-1.0d), 1.0d);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) '4', (double) (byte) 0, (double) ' ', (double) (short) -1);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 10, (double) 1, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10L, (double) ' ', 100.0d, (double) (-1));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, 52.0d, (double) 0.0f, (double) 10L, (double) (byte) 10);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (short) 100, (double) ' ', (double) 100.0f, 0.0d);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) 'a', (double) 1.0f, (double) 10, 0.0d);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) '#', (double) 100L, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 100.0f, (double) (-1L), (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 100L, 100.0d, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) -1, 32.0d, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) -1, (double) (short) -1, 35.0d, (double) 0);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100.0f, 100.0d, (double) 100, 0.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 1L, (double) (short) 1, (double) 10.0f, (double) 1.0f);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, 100.0d, (double) (byte) 0, 0.0d, 35.0d);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (-1.0d), (double) 10, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) '#', (double) 1.0f, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 10.0d, (double) (short) 100, (double) 1, 52.0d);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) '4', (double) '#', 0.0d, (double) (byte) 100);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (-1.0f), (double) 0.0f, (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 0, (double) 10.0f, 35.0d, (double) (short) 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 0, 1.0d, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, 97.0d, (double) '4', (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) '4', (double) 100.0f, (double) 1, (double) (byte) 10);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) (short) 10, (double) (byte) 10, (double) 100.0f, (double) 1.0f);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (short) -1, (double) (short) 100, (double) 0.0f, 0.0d);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (-1.0d), (double) (-1.0f), (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (short) 10, 0.0d, 32.0d, (double) (short) -1);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (-1.0f), (double) (-1.0f), (double) 100L, (double) (byte) 0);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 10.0f, (double) (short) 0, 1.0d, (double) (short) 100);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 100L, (double) 0, (double) 0L, (double) 'a');
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) '#', 32.0d, (double) 10L, (double) 10L);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 100L, (double) (short) 100, (double) ' ', (double) (byte) 100);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10, (double) 100.0f, 10.0d, (double) (short) 1);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) 'a', (double) ' ', (double) (byte) 1, 100.0d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 100.0d, 1.0d, 1.0d, 0.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 100.0f, (double) (short) -1, 0.0d, 32.0d);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 0.0d, 0.0d, 97.0d, (double) (short) 100);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) (byte) 100, 32.0d, (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 1L, (double) 0L, (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) (byte) 10, 35.0d, 35.0d, 0.0d);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10, (double) (byte) 1, (double) 0, (double) (short) 10);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100.0f, 10.0d, 0.0d, 10.0d);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 0.0d, 100.0d, (double) 10.0f, (double) 0.0f);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) 'a', (-1.0d), 35.0d, (double) 100L);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 0, 32.0d, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) 100L, (double) 0L, (double) 10, (double) 0.0f);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10L, (double) (short) 0, 35.0d, (double) (short) 100);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 'a', (double) (byte) 100, (double) 100L, (double) (-1));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, 1.0d, (double) ' ', 0.0d, (double) (byte) 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 35.0d, 1.0d, (double) 100.0f, 32.0d);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (short) 10, 35.0d, (double) (byte) 100, (double) (short) 100);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 32.0d, (double) (byte) 10, (double) (short) 1, 0.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) (-1.0f), (double) (byte) 1, (double) (-1), (double) (-1));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 0, (double) 0.0f, 32.0d, (double) '#');
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 10, (double) (-1.0f), 35.0d, (double) '4');
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, 97.0d, (double) 'a', (double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (byte) 10, (double) 100L, (double) '#', (double) 0L);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 10.0f, 52.0d, 97.0d, (double) (short) 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (byte) 100, (double) 10.0f, (double) '#', (double) 100.0f);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', (double) (-1.0f), 0.0d, (double) (byte) 1);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 0.0f, (double) (-1.0f), (double) (short) 100, (double) (byte) 100);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 32.0d, (double) 0L, (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, 1.0d, (double) (byte) 0, (double) 100L, (double) (byte) -1);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) ' ', (double) 100.0f, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (-1L), (double) (short) 100, (double) 10L, (double) (-1));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 10L, 10.0d, 0.0d, (double) 0);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', 100.0d, (double) 1L, 1.0d, 1.0d);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (short) 100, (double) '4', (double) 100.0f, (double) (short) 100);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (short) 100, (double) (-1.0f), (double) (short) 0, (double) (-1L));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 32.0d, (double) 1, 1.0d, (double) (-1));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) 0, 32.0d, (double) 0, (double) (-1L));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 10L, (double) 1, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 97.0d, (double) 0, (double) (-1), 0.0d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (short) 0, (double) (byte) 10, 100.0d, (double) (byte) -1);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 0L, (double) 10L, (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 1.0d, (double) (short) 0, 97.0d, (double) 1);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 35.0d, 52.0d, (double) 10, (double) 100.0f);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) ' ', (double) (byte) 1, (double) 100L, (double) 0L);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 1L, 52.0d, (double) 10, (double) (-1));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 97.0d, (double) (short) 1, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) 100, 97.0d, (double) (-1L), (double) '#');
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) ' ', (double) 10.0f, (double) '4', (double) 0.0f);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 0L, (double) (short) -1, (double) ' ', 52.0d);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10.0f, 0.0d, 32.0d, (double) 1L);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (-1L), (double) (short) -1, (double) 100, (double) 1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 0.0f, (-1.0d), 32.0d, (double) (short) 100);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, 35.0d, (double) 10.0f, 35.0d, (double) (byte) 1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (-1.0f), (double) (short) 1, 52.0d, 0.0d);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 52.0d, (double) (byte) 0, 0.0d, 32.0d);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) '4', 0.0d, (-1.0d), (double) 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (-1L), (double) (byte) 1, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', 100.0d, (double) (byte) 100, 1.0d, (double) 10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, 0.0d, 1.0d, (double) ' ', (double) (short) -1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (byte) 1, (double) (-1L), (double) (short) 10, 0.0d);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (short) 100, 10.0d, (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 100, (double) (-1L), (double) ' ', (double) ' ');
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 1.0f, (double) (-1), 35.0d, (double) ' ');
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 'a', 0.0d, 0.0d, (double) 10.0f);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, 32.0d, (double) (byte) 0, 1.0d, (double) 100.0f);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (-1), (double) (short) -1, (double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 1, (double) 1L, (double) (byte) 10, 35.0d);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 10, (double) 10.0f, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, 10.0d, (double) (short) 10, (double) (short) 0, (double) 1);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) 100L, (double) 1, (double) 10, (double) 1);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (-1L), (double) (-1), (double) 100, (double) ' ');
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (short) 0, (double) ' ', 100.0d, (double) 1.0f);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 1.0d, 10.0d, (double) (-1L), (-1.0d));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) 100L, (double) (short) -1, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 100, (double) (-1L), (double) 10, (double) (short) 100);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 'a', (double) '#', (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, 100.0d, (double) (short) 100, (double) 10.0f, (double) 0);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 35.0d, (double) 0.0f, 0.0d, 52.0d);
    }
}
