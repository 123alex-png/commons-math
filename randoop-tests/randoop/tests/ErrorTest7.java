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
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 0.0f, (double) (-1));
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3502");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (double) 10.0f);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3503");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3504");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (byte) 0, (double) (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3505");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 0.0d, (double) (-1L));
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3506");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10, (double) (byte) -1);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3507");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3508");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 10.0d, (double) (short) 100);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3509");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (short) -1, (double) '4');
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3510");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (-1.0d), 100.0d);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3511");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3512");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 0, (double) (byte) 1);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3513");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3514");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 10L, (double) 1L);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3515");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3516");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) -1, (double) 0L);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3517");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3518");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3519");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3520");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 100, 0.0d);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3521");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), 0.0d, (-1.0d));
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3522");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) 1, 10.0d);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3523");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 100, (double) (-1L));
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3524");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 1, (double) (byte) 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3525");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 0, (double) (byte) 100);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3526");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 100.0f, (double) 0);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3527");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1, 0.0d);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3528");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (-1), 100.0d);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3529");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 0, (double) 100L);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3530");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3531");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1, (double) 0);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3532");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 0, (double) (short) -1);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3533");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3534");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 10.0d, (double) (-1));
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3535");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3536");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) (short) 100);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3537");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0.0f, 100.0d);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3538");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3539");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3540");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10, (double) '4');
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3541");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3542");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0, (double) 1.0f);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3543");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) ' ', 0.0d);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3544");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0, (double) '4');
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3545");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10.0f, (double) 'a');
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3546");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) 100.0f);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3547");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 10, (double) 1.0f);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3548");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3549");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10L, (double) (short) 0);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3550");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1.0f, (double) (byte) -1);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3551");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1.0f), (double) '#');
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3552");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3553");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0L, (double) ' ');
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3554");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) ' ', (double) 0);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3555");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 1.0d, 1.0d);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest7.test3556");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, 1.0d);
    }
}
