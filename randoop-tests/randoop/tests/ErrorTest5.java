package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2501");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2502");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2503");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 10L, (double) (short) 100);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2504");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 1.0f, (double) (byte) 1);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2505");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 100L, (double) (short) 1);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2506");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2507");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 10, (double) (byte) 100);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2508");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1.0f, (double) 'a');
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2509");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) (short) 100);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2510");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2511");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2512");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2513");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 0.0d, (double) ' ');
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2514");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2515");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) 0, (double) 10);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2516");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1), (double) 1.0f);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2517");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2518");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2519");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2520");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, (double) 100.0f);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2521");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) -1, 0.0d);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2522");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2523");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2524");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2525");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 0.0d, (double) 1.0f);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2526");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (byte) 0, 10.0d);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2527");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2528");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 10L, (double) 100);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2529");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 1.0d, (double) 100);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2530");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (-1.0d), (double) 10);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2531");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1, (double) '#');
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2532");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1.0f, (double) 0L);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2533");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1.0f), (double) 0);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2534");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10L, (-1.0d));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2535");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 10, (double) (short) 100);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2536");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 10, (double) 'a');
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2537");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2538");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1L, 0.0d);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2539");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 'a', (double) 0.0f);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2540");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 100, (double) 10);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2541");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) -1, 100.0d);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2542");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 1.0d, (double) (short) 100);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2543");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 10, (double) (byte) 10);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2544");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2545");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) '#', (double) (byte) -1);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2546");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10L, (double) 0);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2547");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (-1.0d));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2548");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 1.0f, (double) ' ');
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2549");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2550");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10, (double) '4');
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2551");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2552");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 10L, (double) 1L);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2553");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1), (double) (short) 100);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2554");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 0.0f, 0.0d);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2555");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) ' ', (double) 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2556");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 1.0d, (double) (short) -1);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2557");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0, 0.0d);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2558");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 0.0d, (double) 0);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2559");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 10, (double) 1);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2560");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 100.0f, (-1.0d));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2561");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2562");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 1.0d, (double) (short) 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2563");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 0.0f, 0.0d);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2564");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2565");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2566");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 'a', 10.0d);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2567");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 10.0d, 10.0d);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2568");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 1, 0.0d);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2569");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (-1), (double) '4');
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2570");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0, 100.0d);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2571");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 1, (double) 10);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2572");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (byte) 1, (double) ' ');
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2573");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100, (double) 0);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2574");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) (short) 10);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2575");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 100, (double) (byte) -1);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2576");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2577");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 100, (double) 10L);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2578");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) (-1L));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2579");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0, (double) (byte) 100);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2580");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2581");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2582");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 10.0f, (double) '#');
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2583");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2584");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) -1, (double) 10);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2585");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2586");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 10, 0.0d);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2587");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0, 1.0d);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2588");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10L, (double) 100.0f);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2589");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2590");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (-1.0d), 0.0d);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2591");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) -1, (double) 0);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2592");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) 1, (double) 0L);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2593");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) '4', (double) (byte) -1);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2594");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 100, (double) (byte) 10);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2595");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2596");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2597");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (-1.0d), (double) (byte) 10);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2598");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1.0f), (double) 1);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2599");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 1L, (double) (-1));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2600");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (-1L), (double) ' ');
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2601");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 0.0d, (double) 0L);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2602");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2603");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2604");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (-1.0d), (double) 10L);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2605");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) -1, (double) 10);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2606");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, 0.0d, (double) 10L);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2607");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 10, (double) 'a');
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2608");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2609");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0.0f, 10.0d);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2610");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 0, (double) 100.0f);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2611");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1L, (double) 10);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2612");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 10, (double) (short) -1);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2613");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 0, 100.0d);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2614");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (double) (-1));
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2615");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 100, 10.0d);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2616");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) -1, (double) ' ');
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2617");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 100, (double) (short) 0);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2618");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2619");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 100, (double) (byte) -1);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2620");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2621");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 1, (double) 100);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2622");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1L, 100.0d);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2623");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0, (double) (byte) 100);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2624");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0L, (double) 1L);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2625");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10L, (double) (short) 1);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2626");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0, (double) (byte) 100);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2627");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0.0f, 1.0d);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2628");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0L, (double) (short) 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2629");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 1, (double) 10L);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2630");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) 1, (double) 'a');
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2631");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 10, (double) (short) 0);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2632");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, 0.0d, (double) (-1L));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2633");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 1L, (double) 0L);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2634");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0, (double) (byte) 0);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2635");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2636");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 1, (double) ' ');
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2637");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 0, 100.0d);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2638");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1), (double) 1);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2639");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 100L);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2640");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10.0f, (double) 'a');
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2641");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 100L, 0.0d);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2642");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 'a', 0.0d);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2643");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2644");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2645");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) '#', (double) (short) 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2646");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2647");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2648");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0, 10.0d);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2649");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2650");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (-1.0d), 1.0d);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2651");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 100, (double) 1);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2652");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0, (double) (short) -1);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2653");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (-1.0d), (double) '4');
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2654");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2655");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, (double) 'a');
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2656");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1, (double) (-1L));
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2657");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 0, (double) 100);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2658");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2659");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2660");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (-1.0d), (double) 0L);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2661");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (-1L), (double) 0.0f);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2662");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2663");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 100, (double) (short) -1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2664");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 1.0d, (double) ' ');
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2665");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2666");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) 10);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2667");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2668");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (-1L), (double) '4');
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2669");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2670");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2671");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2672");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2673");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2674");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1L, (double) 0L);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2675");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 0, (double) (short) -1);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2676");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) '#');
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2677");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2678");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2679");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100.0f, (double) (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2680");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '#', (double) (short) 0);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2681");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) -1, (double) 10);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2682");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) 100);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2683");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2684");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2685");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 100.0f, (double) (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2686");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2687");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 0.0f, (double) 0L);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2688");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2689");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2690");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2691");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) (-1L));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2692");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1L), (double) 100);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2693");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2694");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 100, (double) (short) 0);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2695");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 10, (double) 100);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2696");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2697");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2698");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1L), 1.0d);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2699");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10, 100.0d);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2700");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 1.0d, (double) (-1));
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2701");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) ' ', (double) (-1L));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2702");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 1.0d, (double) ' ');
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2703");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) -1, 1.0d);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2704");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (short) 1, (double) 'a');
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2705");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2706");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2707");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1L, (double) 100L);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2708");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1L, (double) 0.0f);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2709");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 100.0f, 10.0d);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2710");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 0.0d, (double) 'a');
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2711");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 100.0d, (double) (-1L));
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2712");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1.0f, 10.0d);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2713");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 1.0d, (double) (byte) 100);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2714");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) 10.0f);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2715");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, 0.0d, (double) (short) 10);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2716");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (-1.0d), 0.0d);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2717");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 100, (double) 1);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2718");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 0, (double) (byte) -1);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2719");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 0.0d, (double) (-1L));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2720");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0.0f, (double) 100);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2721");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) 1L);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2722");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (-1.0d), (double) 1.0f);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2723");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (double) ' ');
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2724");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2725");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (-1.0d), (double) 0.0f);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2726");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0.0f, 100.0d);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2727");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (-1.0d), (double) 0);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2728");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 0, (double) 'a');
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2729");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 1.0d, 100.0d);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2730");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 100L, (-1.0d));
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2731");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2732");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1L, (double) (short) 100);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2733");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 0.0d, (double) '4');
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2734");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0, (double) (-1.0f));
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2735");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0.0f, (double) 10);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2736");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 10, (double) (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2737");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, 0.0d);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2738");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0, (double) 100L);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2739");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 1, (double) 100.0f);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2740");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2741");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 100.0d, (double) 0);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2742");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2743");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1L), (double) 'a');
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2744");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) -1, (double) 100.0f);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2745");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1L), (double) 1);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2746");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) 10, (double) 1);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2747");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1.0f), (double) 100.0f);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2748");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 10.0d, (double) 1.0f);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2749");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2750");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 1L, 10.0d);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2751");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 100.0d, 0.0d);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2752");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 100L, (double) 0);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2753");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2754");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2755");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (-1), (double) 100.0f);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2756");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 10.0f, (double) (-1.0f));
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2757");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) ' ', (-1.0d));
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2758");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (-1.0d), (double) 0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2759");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2760");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100, (double) (short) 10);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2761");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, (double) (short) 10);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2762");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 0, (double) 10L);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2763");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) -1, (double) '4');
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2764");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2765");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10L, (double) 10.0f);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2766");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2767");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (double) (short) 100);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2768");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 1L, 10.0d);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2769");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2770");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2771");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) '#', (double) (short) 0);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2772");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2773");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (-1.0d), (double) 'a');
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2774");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 0, (double) (-1));
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2775");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) (short) -1);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2776");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2777");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2778");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 10.0d, (double) 1);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2779");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2780");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 0L, (double) (-1L));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2781");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2782");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 1, (double) (byte) -1);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2783");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (-1.0d), (double) 1);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2784");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2785");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) '4', (double) (byte) -1);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2786");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 10.0f, 100.0d);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2787");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2788");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, (double) 0.0f);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2789");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1.0f), 1.0d);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2790");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, (double) ' ');
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2791");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) 0);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2792");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 10, 0.0d);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2793");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100, 0.0d);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2794");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2795");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1, (double) (short) -1);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2796");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) 0, (double) 100.0f);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2797");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 1, (double) 1L);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2798");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2799");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 1.0d, (double) (short) 100);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2800");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 1, (-1.0d));
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2801");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 100.0d, 1.0d);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2802");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, (double) 10L);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2803");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2804");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) ' ', 0.0d);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2805");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, (double) (short) -1);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2806");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0, (double) 100);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2807");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2808");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 1.0d, (double) 10.0f);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2809");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, 10.0d);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2810");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2811");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 1L, (double) (byte) 0);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2812");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2813");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 1.0d, (double) (byte) 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2814");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1), (double) 10);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2815");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1.0f), (double) 10);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2816");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, 0.0d, (double) (short) -1);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2817");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 'a', (double) (-1));
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2818");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) 0, (double) (byte) -1);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2819");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (-1.0d), 0.0d);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2820");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (-1.0d), (double) 1.0f);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2821");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0, (double) (byte) -1);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2822");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2823");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) 1.0f);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2824");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0.0f, 10.0d);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2825");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) -1, (double) (byte) 100);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2826");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0, (double) (short) 1);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2827");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, 100.0d);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2828");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (-1.0d), (double) 1L);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2829");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10, (double) (short) -1);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2830");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) 100L);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2831");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2832");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0.0f, 0.0d);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2833");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) -1, (-1.0d));
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2834");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2835");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 10, (double) 100);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2836");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) (byte) 0);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2837");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 0, 0.0d);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2838");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 'a', (double) 1.0f);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2839");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0L, 10.0d);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2840");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 1.0f, (double) (-1));
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2841");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2842");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10L, (double) ' ');
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2843");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, 0.0d);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2844");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (-1.0d), (double) (byte) 0);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2845");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2846");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2847");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2848");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 'a', 0.0d);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2849");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 0L, (double) (-1L));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2850");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2851");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1L), (double) 100L);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2852");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (-1L), (double) 100L);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2853");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 10, (double) (-1L));
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2854");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0L, (double) 'a');
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2855");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1), (double) 0L);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2856");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2857");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2858");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 10.0d, (double) (byte) 0);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2859");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2860");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100L, (double) (short) 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2861");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0, 0.0d);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2862");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100L, (double) '4');
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2863");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (short) 0, (double) 1);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2864");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100L, (double) 10.0f);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2865");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 100.0d, (double) (short) 0);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2866");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) '4', (double) 10);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2867");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, 10.0d, (double) 100);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2868");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1.0f), 10.0d);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2869");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 100, 0.0d);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2870");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2871");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (-1.0f), (double) 100.0f);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2872");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 0, (double) 10L);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2873");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, 0.0d, (-1.0d));
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2874");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 10.0f, (double) (short) 10);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2875");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2876");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2877");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1L), (double) (byte) 1);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2878");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, 0.0d, (double) 0L);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2879");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) '4', (double) 1L);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2880");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 100.0d, (double) (short) 0);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2881");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2882");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) -1, (double) 0L);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2883");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2884");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1L, 1.0d);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2885");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2886");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 0.0d, (double) 10);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2887");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2888");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2889");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1), (double) '#');
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2890");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0, (double) (-1));
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2891");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 'a', 0.0d);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2892");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 0.0d, (double) 100.0f);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2893");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 1L, 100.0d);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2894");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 1.0d, (double) (-1L));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2895");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 1L, (double) (byte) 1);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2896");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) -1, (double) '4');
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2897");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10, (double) (short) 10);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2898");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 1.0d, (double) 10);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2899");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2900");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (-1), (double) 1L);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2901");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2902");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10.0f, (double) ' ');
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2903");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) '4', (double) (-1.0f));
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2904");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2905");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2906");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '#', (double) 0);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2907");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2908");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1L), (double) (short) 0);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2909");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2910");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 100, (double) (short) -1);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2911");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 10, (double) 10.0f);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2912");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 1, (double) '#');
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2913");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 1.0d, (double) '#');
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2914");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2915");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 10L, (double) (short) 1);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2916");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1L), (double) '4');
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2917");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2918");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, 0.0d, (double) 10.0f);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2919");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 100L, (double) (short) -1);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2920");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 10L, 0.0d);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2921");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 10, (double) (short) 100);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2922");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2923");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1), (double) ' ');
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2924");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10, (double) 1);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2925");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) -1, (double) 0.0f);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2926");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2927");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 1.0f, (double) 1);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2928");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 1.0d, (double) (byte) -1);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2929");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 0L, 100.0d);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2930");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2931");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 1.0f, 10.0d);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2932");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 100.0f, (double) (short) 1);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2933");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (-1.0d));
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2934");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (-1.0d), 100.0d);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2935");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) 1, (double) 10L);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2936");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2937");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) -1, 10.0d);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2938");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0, (double) 10.0f);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2939");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10, (-1.0d));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2940");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 10, (double) (byte) 1);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2941");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2942");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 1, (double) (-1.0f));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2943");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0L, (double) (-1));
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2944");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) -1, (double) (short) -1);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2945");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2946");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 0.0f, (double) (-1.0f));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2947");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 0, (double) (short) 100);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2948");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0L, (double) '#');
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2949");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2950");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) -1, (double) (short) 0);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2951");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0, (double) (-1L));
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2952");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (-1.0d), (double) (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2953");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) 1.0f);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2954");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 0, (double) '#');
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2955");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 1.0f);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2956");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) 0, (double) '4');
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2957");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2958");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2959");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, 1.0d);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2960");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 1L, (double) 100);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2961");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 10, (double) (-1L));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2962");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2963");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 100, 1.0d);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2964");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2965");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1L, (double) (byte) -1);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2966");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 0.0d, (double) '#');
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2967");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100L, 10.0d);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2968");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1.0f), 0.0d);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2969");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (byte) -1, (double) 0L);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2970");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) (short) -1);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2971");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) -1, (double) 0L);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2972");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2973");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2974");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, 100.0d, (double) (short) -1);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2975");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1), (double) 10);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2976");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2977");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) 0, (double) 0);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2978");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 0.0d, (double) 0.0f);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2979");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 0, 1.0d);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2980");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0, (double) 100.0f);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2981");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) (short) 10);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2982");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1.0f, (double) ' ');
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2983");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 'a', (double) (byte) 1);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2984");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0L, (double) (short) 10);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2985");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 10.0d, (double) 100);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2986");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 100, (double) 1L);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2987");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2988");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 10, (double) 1L);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2989");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2990");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 0, (double) (-1));
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2991");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2992");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2993");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 0, (double) 0L);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2994");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 10L, (-1.0d));
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2995");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 10L, (double) (short) 100);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2996");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 10.0d, (double) 100L);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2997");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (-1), (double) 100.0f);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2998");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '4', (double) (byte) 0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test2999");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 1.0f, 100.0d);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest5.test3000");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1.0f, (double) (short) -1);
    }
}
