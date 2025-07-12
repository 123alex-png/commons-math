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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10.0f, (double) (byte) 0, 32.0d, (double) (byte) -1);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10, (double) 'a', 0.0d, (double) 1L);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 10L, 1.0d, (double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 0.0d, (double) (byte) 0, (double) 10L, 0.0d);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 10L, (double) 100L, (double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (byte) 10, (double) (short) -1, (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 0.0f, (double) (short) 1, 0.0d, (-1.0d));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 10.0f, (double) 10, (double) 'a', (-1.0d));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (short) 100, (double) 100, (double) (short) -1, 32.0d);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 10, (double) 10, 52.0d, (double) 1L);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 100.0f, (double) (-1), (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (short) 1, 0.0d, 52.0d, (double) (-1.0f));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10.0f, (double) (byte) 1, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) '#', 0.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 100.0f, (double) (short) 0, (double) (short) 100, (double) (short) -1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 35.0d, (double) 100, (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 32.0d, (double) 10.0f, (double) 100L, (double) 10);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (byte) 10, (double) (byte) 100, 97.0d, (double) (byte) 0);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 10, 97.0d, 10.0d, (double) '4');
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 32.0d, 10.0d, (double) 100L, (double) (short) 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) 'a', 100.0d, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (byte) 100, (double) (short) 10, 0.0d, (double) 1L);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 32.0d, 0.0d, (double) 0.0f, (double) '#');
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) (short) -1, (double) (short) 100, 0.0d, 0.0d);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (-1.0d), (double) 10.0f, 97.0d, (double) 0);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) ' ', (double) 1.0f, (double) 0, (double) (short) 0);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 100L, (double) (short) 100, (-1.0d), (double) (-1L));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (-1L), (double) 10.0f, 1.0d, 0.0d);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 10L, (double) (short) 1, (double) (short) 100, (double) 100);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 0.0d, 0.0d, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (byte) 0, (double) 1.0f, (double) 10L, 100.0d);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 52.0d, (double) 10, (double) 0, (double) 'a');
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (-1.0d), (double) (byte) 1, 100.0d, 35.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 52.0d, (double) (byte) -1, (double) (short) 10, 0.0d);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 1.0f, 100.0d, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) 1, 0.0d, (double) '4', (double) 100L);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 'a', (double) (byte) 0, (double) (short) 100, 0.0d);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 97.0d, (double) (byte) 100, 100.0d, 52.0d);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 1, (double) 1L, (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (byte) -1, (double) 1, 52.0d, (double) (byte) 0);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1, (double) 1L, (double) 'a', (double) 1.0f);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 10.0f, (double) (byte) 10, (double) 10L, 0.0d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (short) -1, 35.0d, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 1L, 10.0d, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 1.0d, (double) 100.0f, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 'a', 97.0d, (double) (-1), 100.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1.0f, (double) (short) 0, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) (byte) -1, (double) ' ', (double) '4', (double) 100);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (short) 10, (double) (short) 100, (double) 100L, 97.0d);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 10L, (double) (-1), (double) (short) 0, (double) '#');
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (byte) 10, (double) 10L, (double) '4', 1.0d);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (byte) 10, 0.0d, (double) '#', (double) (-1L));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 100.0f, (double) (byte) 10, (double) 10, 1.0d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 10, (double) (short) 0, (double) (short) 10, 35.0d);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (byte) -1, (double) '#', (double) 10, 0.0d);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 35.0d, (double) (short) 0, 32.0d, (double) (short) 100);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 1L, (double) 0L, 0.0d, (double) (short) -1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) '4', (double) (-1), (double) (byte) 1, 10.0d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 0.0f, (double) ' ', (double) 0L, (-1.0d));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (-1.0d), (double) 1L, (double) 100L, 52.0d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 1L, (double) '#', (double) (short) 1, (double) 0);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) ' ', (double) (short) 0, (double) (short) 10, (double) '4');
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (byte) 0, (double) 100.0f, (double) (byte) 10, (double) (short) -1);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 0.0f, (-1.0d), 35.0d, (double) 100);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) 100L, (double) (-1L), 0.0d, (double) (short) 100);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) (short) -1, (-1.0d), (double) 10, 100.0d);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) ' ', 97.0d, (double) 1, (double) (byte) 0);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 'a', (double) '#', (double) 0L, (-1.0d));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (short) 10, (double) 10L, 52.0d, 0.0d);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) (-1.0f), (double) 0L, 10.0d, (double) (byte) 100);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) '4', (double) (short) -1, 100.0d, (double) 0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), 97.0d, 0.0d, 0.0d, (double) (-1));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 'a', (double) (-1), (double) '#', (double) '#');
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) 100, 100.0d, 32.0d, (double) 0.0f);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 10, 97.0d, (double) '#', (double) (short) 100);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (-1L), (double) (-1.0f), (double) 100.0f, (double) 10L);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 0.0d, (double) 1L, (double) 100, (double) (short) -1);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 100.0d, (-1.0d), 97.0d, (double) (byte) 10);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) (short) 1, (double) 10.0f, (double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10.0f, (double) (byte) 0, (double) (short) 10, (double) 1);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) 10, (-1.0d), (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 100, 32.0d, (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10L, (double) '#', (double) (byte) 10, (double) '4');
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 1L, (double) 1, (double) (byte) 10, (double) 0.0f);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) '#', (double) '#', (double) 100L, (double) (-1.0f));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10, 1.0d, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, 0.0d, (double) 1.0f, 1.0d, (double) (byte) 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 100, (double) 0.0f, 10.0d, (double) (byte) -1);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (-1.0d), 0.0d, 97.0d, (double) (byte) -1);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (byte) -1, (double) 10.0f, (double) 0L, 0.0d);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 100.0d, (double) ' ', 1.0d, (double) (short) 0);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 0.0d, (double) (short) -1, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 1.0f, 10.0d, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (byte) 10, (double) (short) 1, 0.0d, (double) '#');
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 100L, 10.0d, (double) 0L, 1.0d);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 0.0d, (double) (short) 100, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) ' ', (double) (short) 10, (double) (short) 10, 97.0d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) ' ', (-1.0d), (double) (byte) 100, (double) 0.0f);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) (short) 0, 32.0d, (double) '#', (-1.0d));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) (byte) 100, (-1.0d), (double) ' ', 32.0d);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 100, (double) (-1.0f), 0.0d, (double) (-1L));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) 10.0f, 0.0d, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (byte) 10, 52.0d, (double) 100, (double) (byte) 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) 100.0f, (double) (short) 0, (double) 10L, (double) ' ');
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 35.0d, 0.0d, 52.0d, (double) 100);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 100, (double) 10.0f, (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (byte) 1, 97.0d, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, 10.0d, 0.0d, (double) 'a', (double) 1);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) '#', 1.0d, (double) (short) 0, (double) 1);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) (short) 1, (double) (byte) 100, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 52.0d, 52.0d, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) 10.0f, (double) 100L, (double) (short) 0, 0.0d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (byte) -1, 1.0d, (double) (byte) 100, (double) (-1));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 0.0d, (double) (byte) -1, (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) 100, (double) (short) 100, (double) (short) 100, 32.0d);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, 97.0d, (double) '4', (double) 10L, (double) (byte) 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, 97.0d, (double) 1.0f, 97.0d, (double) 100L);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (-1.0d), (double) 10L, (double) '#', (double) '4');
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10, (double) (-1.0f), (double) 1, (double) 0.0f);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 10L, 32.0d, (double) 100, (double) (-1L));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) ' ', (double) (short) 10, (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (byte) -1, (double) (-1.0f), 35.0d, (double) (short) 10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 10L, (double) (short) 100, (double) ' ', (double) (-1L));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) 0L, (double) ' ', (double) ' ', (double) 0L);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', 35.0d, (double) (short) 0, 0.0d, 0.0d);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', (double) (short) -1, (double) (byte) -1, (-1.0d));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 52.0d, (double) 1L, (double) (byte) 100, (double) 100.0f);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 10L, (double) (-1), (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) ' ', 35.0d, (double) (short) 100, (double) '4');
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 1.0f, (double) '#', (double) 0, 0.0d);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 0.0d, 52.0d, 10.0d, (double) 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) '4', (double) 10.0f, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (byte) 10, 1.0d, (double) 10L, (double) (-1L));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, 32.0d, (double) 'a', 0.0d, (double) (byte) 0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 100, (-1.0d), (double) (byte) 1, 1.0d);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 0.0d, (double) 0L, (double) 'a', 0.0d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 100, (double) (short) -1, (double) (short) -1, (double) 100L);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 0, (double) (short) -1, (double) (short) 10, 0.0d);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) 100, (double) (short) 0, (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 32.0d, (double) 10, (double) 'a', (double) 100L);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 0L, (double) ' ', (double) 10, (-1.0d));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (short) 1, (double) 0, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 100.0d, (double) 0.0f, (double) '#', (double) 100);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', 100.0d, (double) '#', 1.0d, (double) '#');
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (byte) 100, (double) (-1.0f), (double) (-1L), (double) (short) 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (-1), 0.0d, (double) 0, (double) (-1L));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (short) 0, (double) 10L, (double) (short) 100, 0.0d);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) '4', (double) (-1L), (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (short) 1, (double) (byte) 10, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) '4', (double) '#', 52.0d, (-1.0d));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (-1.0d), (double) 100.0f, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 10, (double) (-1), (double) '#', (double) 10);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', 97.0d, 1.0d, (double) 10.0f);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', 97.0d, (double) 10L, (-1.0d), 0.0d);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 97.0d, 35.0d, (double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 100, (double) 1L, (double) 10L, (double) '4');
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) 1.0f, (double) 10, 10.0d, (double) (-1));
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (byte) -1, (double) 10L, (double) 1, (double) 0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (byte) 0, (double) 0, (double) 10.0f, (double) 0.0f);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) '#', (double) (byte) -1, 32.0d, (double) (byte) 100);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 1, (-1.0d), (double) (byte) 100, (double) 'a');
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) 1, (double) 100, (double) 10L, 0.0d);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10L, 32.0d, (double) 10L, (double) 1L);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 0.0d, (-1.0d), (double) (short) -1, 0.0d);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) (byte) 10, 1.0d, (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 1L, (double) (short) 0, (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 97.0d, 97.0d, (double) 1.0f, (double) '4');
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) (byte) 10, (double) 1L, (double) 1, (double) (byte) 0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) 10.0f, (double) (byte) 100, (double) '4', (double) '4');
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 10L, (double) (byte) 10, (double) 0.0f, (double) 100);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) ' ', (double) 1L, 0.0d, (double) (short) 10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 0L, (double) 100.0f, (double) 1L, (double) (-1L));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) (byte) 1, (double) 1, (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (byte) 100, (double) 100.0f, 52.0d, (double) (byte) 10);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 10.0f, (double) (short) 0, (double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 1, 52.0d, (double) 1, 0.0d);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) (short) 10, (double) 10L, (double) 0L, (double) (-1));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 1L, (double) (byte) -1, (double) (short) 10, (double) (-1));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 1, (double) '4', 100.0d, 100.0d);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) 100.0f, (double) (-1), 35.0d, (double) 1);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 100.0f, (double) (byte) -1, (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) (-1L), (double) (byte) 100, 97.0d, (double) 0);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 10.0d, (double) (-1L), (double) 100L, (double) (-1));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 10.0f, (double) 10L, (double) (-1.0f), (double) 0);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) (byte) -1, (double) (short) 1, (double) 100.0f, (double) 10);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) (short) 10, (double) 100L, 0.0d, (double) (short) 10);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 1.0f, 1.0d, (double) (short) 100, 35.0d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 10, (double) 10.0f, (double) 1, (double) (byte) 100);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (-1L), (double) 1, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 100.0d, (double) 100L, (double) 0L, 0.0d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, (double) (-1L), (double) (-1), 1.0d, (double) (short) -1);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 52.0d, 0.0d, (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (-1.0d), 0.0d, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (-1.0f), (double) 10.0f, 35.0d, 10.0d);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), 0.0d, 32.0d, (double) (short) 100, (double) '#');
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 35.0d, (double) 'a', (double) 100L, (double) ' ');
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (short) 10, (double) 0.0f, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 'a', (double) 10, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 10L, (double) 100L, (double) 0L, 0.0d);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (-1), 52.0d, (double) 0.0f, (double) 0);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (-1), (double) 0.0f, (double) 100, (double) (-1L));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) (byte) 1, (double) (short) 0, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) 0, (double) 'a', (-1.0d), (double) (-1));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10L, 0.0d, (-1.0d), (double) (short) 100);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100, (double) 0, (double) '4', (-1.0d));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 32.0d, (double) 1, 1.0d, 32.0d);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 'a', (double) '#', (double) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (short) 10, 52.0d, (double) '4', (double) (-1.0f));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) ' ', (double) (short) 0, (double) (short) 1, (double) 1);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) 100, (double) (-1.0f), 35.0d, (double) 0);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) (short) 1, (double) 100, (double) '#', (double) (-1L));
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 52.0d, (-1.0d), (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 52.0d, (double) (short) 100, 0.0d, (double) 'a');
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) (short) 100, (double) (short) 10, (double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 'a', (double) 100L, (double) (short) 0, 0.0d);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (short) 10, 10.0d, (double) (short) 100, (double) ' ');
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 0, 32.0d, (double) (byte) 0, (double) 0L);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (double) ' ', (double) '4', (double) (-1L), 0.0d);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (-1.0d), (double) 100, (double) ' ', (double) (byte) 0);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) 100, (double) 10L, 32.0d, (double) (short) 10);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 1, (double) 10L, (double) (short) 100, (double) ' ');
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 52.0d, (double) (byte) 100, (double) '4', 52.0d);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 0.0d, (double) (byte) 10, 100.0d, (double) 100L);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 32.0d, (double) (short) 0, 10.0d, (double) (short) 100);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 35.0d, 32.0d, (double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) (byte) 0, 97.0d, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, (double) 10.0f, (double) (short) 100, (double) 10L, 1.0d);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, (double) (-1), (double) 1, (double) '#', (double) '#');
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, 0.0d, (double) (-1.0f), (double) (short) -1, 0.0d);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, 32.0d, 0.0d, (double) (-1), (-1.0d));
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), 32.0d, (double) 10L, (double) 0L, (double) (short) -1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 10.0d, (double) '4', (double) (short) 100, (double) 0.0f);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (short) 10, 0.0d, (double) 0L, (double) (short) 0);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (byte) 1, (double) 0.0f, 0.0d, (-1.0d));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 100, 1.0d, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, (double) 10L, 0.0d, (double) (short) -1, 1.0d);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 0, (double) 10.0f, (double) 1, (double) (short) -1);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 100, (double) 10L, (double) 10L, (double) 1L);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 0.0d, (double) '4', 52.0d, (double) (short) 0);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) (-1.0f), (double) 10, (double) '4', (double) (short) 100);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, 0.0d, 35.0d, (double) 100L, (double) (byte) 0);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(100.0d, 52.0d, 52.0d, 97.0d, (double) 1L);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) 10, (double) 0, 52.0d, (double) (byte) 1);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) '#', (double) (byte) 0, (double) 100.0f, 100.0d);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, 52.0d, 32.0d, (double) (short) 100, (double) 100L);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) '#', (double) 0L, 10.0d, (double) (-1.0f));
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 10, (double) (short) 100, (double) 1L, 0.0d);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (short) 1, (double) 'a', 97.0d, (double) 0L);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) 'a', 0.0d, (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) (short) 10, (double) 0, (double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) 0.0f, (double) (short) 100, (double) 0, (double) (byte) -1);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 1, (double) (byte) 100, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, 0.0d, (double) (short) -1, 52.0d, (double) (short) -1);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) '4', (double) 1L, (double) 'a', (double) (byte) 100);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 1, (double) 100L, 1.0d, (double) 100, (double) 100L);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, (double) (byte) 1, (double) 0, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) '4', (double) 100.0f, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 10.0d, (double) (short) 0, (double) 100L, (double) 0);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, 0.0d, (double) (-1.0f), (double) 100L, 10.0d);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 10.0d, 0.0d, 100.0d, (double) 10.0f);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, (double) (byte) -1, (double) (byte) 1, 0.0d, (double) 1);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, 97.0d, 0.0d, (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) 100.0f, 10.0d, 0.0d, (double) 10);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100L, (-1.0d), (double) 0.0f, (double) (short) 0, (double) (short) 0);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, (double) (short) 100, (double) (byte) -1, (double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100, 35.0d, (double) (short) 100, (double) 10);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) 100L, 35.0d, (double) 1, 0.0d);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) '#', (double) 'a', 52.0d, (double) (byte) -1);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, 97.0d, 97.0d, 35.0d, (double) (byte) 0);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, 97.0d, (-1.0d), 35.0d, 97.0d);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) ' ', 10.0d, (double) '4', 52.0d);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 100L, (double) 'a', (double) '4', (double) (short) -1);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) 100L, (double) (byte) -1, 52.0d, (double) 1L);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) '4', (double) 1.0f, (double) 'a', (double) 100.0f);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (-1.0f), (double) (byte) 0, (double) 0, 0.0d);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 0, (double) 10.0f, (double) 10, (double) 10.0f, (-1.0d));
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) '#', (double) (byte) 10, (double) (-1), (double) 1L);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 100, (double) 0.0f, (double) 10L, (double) (short) -1);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', (double) 0L, (double) (short) 10, 52.0d, (double) (short) 100);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (byte) 1, 1.0d, 35.0d, (double) (byte) -1);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, 97.0d, 32.0d, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) (short) 0, (double) 10, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) -1, (double) 100L, (double) 0L, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (short) 1, 0.0d, 35.0d, 0.0d);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 0, (double) 100L, 1.0d, 0.0d);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, 52.0d, (double) 10L, 0.0d, 0.0d);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) 0.0f, (double) (short) 0, (double) 'a', (double) (-1.0f));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', (double) 0.0f, (double) (-1.0f), (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1.0f, (double) (short) -1, (double) 0.0f, (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 0L, (-1.0d), 97.0d, (double) 100L);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10.0f, (double) 10L, (double) (short) -1, 52.0d, (double) 1.0f);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', 100.0d, (double) 0, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, 35.0d, (double) ' ', (double) (-1L), (double) 1);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, (double) 'a', (double) (byte) 10, (double) (short) 100, 97.0d);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 0, 32.0d, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 0.0f, 0.0d, (double) (short) 100, (double) (byte) -1);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, 52.0d, (double) 10, (double) 1.0f, (-1.0d));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) '#', (double) (-1), (double) (byte) 10, (double) 10.0f);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) '#', (double) 10, (double) 1L, (double) 10.0f);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0L, 52.0d, (double) 1, 35.0d, 10.0d);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 35.0d, (double) 10, (double) 0.0f, (double) 10);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, (double) 10.0f, (double) 0L, (double) 'a', (double) 10L);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 100.0d, (double) 100, (double) 'a', 35.0d);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1L), (double) (byte) 10, 100.0d, (double) (byte) 0, 35.0d);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (-1.0d), (double) 1.0f, (double) '#', (double) (short) 100);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) 0, (double) (byte) 1, (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (short) 100, (double) 0.0f, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) '4', (double) (byte) 10, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (-1.0f), (double) 0L, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, 0.0d, (double) 0L, (-1.0d), (double) (short) -1);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1), (double) 10.0f, 10.0d, (double) (byte) 0, (double) (byte) -1);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100, (double) (-1), (double) ' ', (double) '4', 35.0d);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10L, (double) 100, (double) ' ', (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) -1, 52.0d, (double) 100.0f, (double) 0, 100.0d);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) 10L, (double) 10.0f, 10.0d, 0.0d);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), 35.0d, (double) (byte) 0, (double) 'a', (double) (short) 100);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) (byte) 1, (double) (byte) 1, (double) (short) 100, (double) 'a');
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(35.0d, (double) (short) -1, (double) (byte) 100, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, (double) (byte) 10, 1.0d, (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10, (double) 10L, (double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (byte) 0, 0.0d, (double) 0, 0.0d);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '4', 52.0d, (double) (byte) 0, 97.0d, (double) 1L);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 1, (double) ' ', (double) 10.0f, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) '4', (double) '#', (double) 10L, (double) 10L);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0, (double) (byte) -1, (double) '4', (double) 1, (double) (-1.0f));
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 10, (double) 'a', 97.0d, (double) (short) 1, (double) 0L);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) '#', (double) (short) 1, (double) 100.0f, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) '#', 10.0d, (double) 100.0f, (double) ' ');
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (byte) 100, (double) (short) 0, (double) (short) 10, 0.0d);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, 97.0d, 52.0d, (double) (short) 1, (double) (-1));
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(32.0d, 10.0d, 10.0d, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) 0.0f, (double) 1L, (double) 100.0f, (double) 1L);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 10.0f, (double) (-1L), (double) 1, (double) (byte) 100);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (-1.0f), (double) (byte) 10, 0.0d, (double) '4', (double) (short) 10);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (short) 0, (double) 1L, (double) (short) 10, (double) '#');
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 'a', (double) 10, (double) 0.0f, (double) 10L);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 0.0f, 97.0d, (double) (byte) 1, (double) 100.0f, (double) (-1));
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) ' ', 10.0d, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 100, (double) (short) 10, (double) 10L, (double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1, 52.0d, 0.0d, 100.0d, 32.0d);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) (short) 10, (double) 1, (double) 'a', 97.0d);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 100.0f, 97.0d, 0.0d, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 0, 32.0d, 0.0d, (double) 10L, (double) (short) 1);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(97.0d, (double) (short) 1, (double) (byte) 10, 97.0d, (double) 10.0f);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 'a', (double) (-1.0f), (double) (byte) -1, (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(1.0d, (double) 1.0f, (double) ' ', (double) 'a', (double) (byte) 0);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (-1.0d), (double) 10L, 100.0d, (double) (short) -1);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) 100.0f, (double) (short) 0, (double) '4', (double) 100.0f);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) '4', (double) 100L, (double) 1, (double) '#');
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) 1L, 1.0d, 10.0d, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 10, (double) (-1L), (double) (byte) 1, (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (short) -1, (double) 1, (double) 10.0f, 52.0d);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (byte) 100, 97.0d, (double) 0.0f, (double) (-1.0f), (double) (-1.0f));
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        // during test generation this statement threw an exception of type java.lang.AssertionError in error
        org.apache.commons.math3.test.testShiftedArcConsistency((-1.0d), (double) 0.0f, (double) 100, (double) 10, (double) (byte) -1);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) 100L, (double) (byte) 10, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(0.0d, (double) (byte) 1, (double) (-1L), (double) 100.0f, (double) 100L);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, (double) (short) 100, 10.0d, (double) 100, (double) 100);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(10.0d, (double) (short) 10, (double) (-1.0f), 1.0d, (double) (-1L));
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency(52.0d, (double) 1, (double) (byte) 1, (double) '4', 35.0d);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) ' ', 0.0d, (double) 'a', 10.0d, 0.0d);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.NumberIsTooLargeException in error
        org.apache.commons.math3.test.testShiftedArcConsistency((double) (short) 10, 100.0d, (double) 1.0f, 52.0d, 97.0d);
    }
}
