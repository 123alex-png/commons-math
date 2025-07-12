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
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1, (double) 100);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 100, (double) (byte) -1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 100.0d, 0.0d);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1L), (double) 1);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1L), (double) (-1));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (-1.0d), (double) (byte) -1);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) ' ', (double) 0L);
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1L), (double) (short) -1);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 10.0f, (double) (-1L));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10L, (double) 10.0f);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) -1, (double) 10);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 'a', (double) (-1L));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) (short) -1);
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0L, (double) 1.0f);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (-1.0d), (double) 0);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 1.0d, (double) (-1L));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1L, (double) (byte) -1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) -1, (double) 'a');
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) 100L);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1.0f), (double) ' ');
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 100.0d, (double) 1.0f);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 1, (double) 'a');
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) '#', (double) (byte) 0);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 1, (double) (byte) 100);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0L, 10.0d);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 1.0d, (double) 0);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) -1, (double) '#');
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10L, (double) 10);
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0L, 100.0d);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 0, (double) 0);
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (-1.0d), (double) (-1));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 1, (double) 'a');
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 10.0f);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) 100);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1L, (double) 100);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (-1.0d), (double) 1L);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1, (double) (-1.0f));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 100L, (double) 0);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1, (double) (byte) 0);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) ' ', (-1.0d));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) '#', (-1.0d));
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 0.0d, 0.0d);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1, 0.0d);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 10L, (double) (-1L));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (-1.0f), (double) '4');
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, 1.0d);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 100, (double) 'a');
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 100, (double) 0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1.0f), (double) ' ');
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 10, (double) (-1L));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1L, 0.0d);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 0, (double) (-1.0f));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10, (double) (short) 0);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1), (double) (-1));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 1, (double) (byte) 0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) 0L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1L), (double) 100L);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1.0f), 100.0d);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 100, (double) (short) 0);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10, 0.0d);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (byte) 0, 100.0d);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1L, (double) (-1));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1), (double) 10);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0, (double) 0L);
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 100L, (double) (short) 1);
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, 0.0d);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) 1L);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 0L, (double) (byte) 100);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 0, (double) (byte) -1);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 0, 10.0d);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10, (double) (byte) 10);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1, (double) (byte) 10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 1.0f, 1.0d);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1), (double) (byte) 10);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) 100);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 100.0f, 1.0d);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1), (double) 1L);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100, (double) (byte) 10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 10.0d, (double) (-1L));
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 100.0f, (double) (short) -1);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) ' ', (double) (short) 1);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0, (double) (short) 0);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1.0f), (double) 'a');
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 10.0d, (double) (short) 100);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) 100L);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10.0f, (double) 0);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) (short) 10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 1.0f, 100.0d);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 1.0d, (double) (-1.0f));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 10.0d, (double) (short) 10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 1L, 100.0d);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 0, (double) 1L);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 10.0f, 100.0d);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) '4', 10.0d);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) '4', (double) 0);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 10.0d, (-1.0d));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (-1), (double) (short) 0);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 100.0d, (double) (-1L));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1), (double) 10);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 1L, (double) (short) 0);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0.0f, (double) (byte) -1);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1L, (double) 1.0f);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) -1, (double) 1.0f);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 1, (double) (byte) -1);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10L, (double) (-1));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) 0.0f);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10, 0.0d);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1.0f, (double) (-1.0f));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 0L, (double) (short) 100);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 0, (double) ' ');
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), (double) 10L);
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) 1);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) (short) 100);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0.0f, (double) ' ');
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) 'a');
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) 0, 0.0d);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 1, (double) (byte) 1);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1L, (double) 1.0f);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 100.0f, (double) 0L);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 1, (double) (byte) 100);
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 0, (double) (-1.0f));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) 100);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (-1.0d), (double) 1L);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1), (double) 10);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) 10, (double) 100L);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 10, (double) 100L);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 1.0f, 0.0d);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) (byte) 1);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 0, (double) 10);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0L, (double) (short) 1);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (-1.0d), (double) 0L);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 100, 0.0d);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) 0L);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) -1, (double) (byte) 10);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1), (double) (short) -1);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), (double) (short) 100);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, 10.0d);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 1.0d, (double) ' ');
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0.0f, (double) (byte) 10);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 0L, 100.0d);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1), (double) (byte) 100);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 1.0d, (double) (short) 10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 100.0f, (double) 0L);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1), (double) (short) 100);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1.0f), (double) 0);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, 0.0d, (double) (short) 10);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, (double) (short) -1);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 0.0d, (double) 1.0f);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1L), (double) 1L);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 0, (double) '4');
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 1, (double) (short) 10);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0L, (double) 10.0f);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) 0);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 100.0d, (-1.0d));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1), (double) 100);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) (-1));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '#', (double) 'a');
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10.0f, (double) (-1));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 100, 0.0d);
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 1.0d, (double) '#');
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1L), 100.0d);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1), (double) (short) 100);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 10.0f, (double) 'a');
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (-1.0d));
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) 1.0f);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 10, (double) (byte) 100);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 0, (double) (-1L));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) 0, 100.0d);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '4', (double) 0L);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1L), (double) '#');
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, (double) 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 100, (double) (short) -1);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 100L, (double) (-1));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) -1, (double) 10L);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 100.0d, 0.0d);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10L, (double) ' ');
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 1, (double) (byte) 10);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) -1, 10.0d);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 1L, (double) '4');
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 'a', 0.0d);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (-1.0d), (double) 10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) -1, (double) ' ');
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 1, (double) 10L);
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 10.0f, (double) (byte) 0);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (double) (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 1.0d, 100.0d);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0L, 1.0d);
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1.0f), (double) (short) -1);
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0, (double) 1);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (-1.0d), (double) (short) -1);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 100, (double) 10L);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 100.0d, (double) 1L);
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10, (double) (-1.0f));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 1.0f, (double) 1.0f);
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 10.0d, (double) (-1));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) (short) 10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) '4');
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 'a', (double) (-1L));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, 1.0d);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 1, (double) 'a');
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 10, (double) (-1L));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) ' ');
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) 0);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) 100);
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10L, (double) (short) -1);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 0, (double) 10L);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 100.0d, (double) '#');
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (-1.0d), (double) (byte) 100);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (-1L), 10.0d);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) ' ', 10.0d);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0.0f, 0.0d);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0, (double) (byte) -1);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1), 0.0d);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '4', (double) (short) -1);
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1, (double) ' ');
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 100, (double) (-1));
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0, (double) 1.0f);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 10, 100.0d);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (byte) 0, (double) 0);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 0, (double) 100);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 100, (double) (short) 1);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1L), 0.0d);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1.0f, (double) (byte) 0);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) ' ', 0.0d);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) ' ', (double) 1);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1), 1.0d);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, 1.0d);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 10, (double) (-1L));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 10.0d, (double) (-1.0f));
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 0.0f, (double) (-1));
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 0.0d, (double) 0);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '#', (double) (short) -1);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1), (double) (-1.0f));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 1, (double) 0.0f);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (-1.0d));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 10, (double) (short) 100);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 100.0d, (double) (byte) 1);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0L, (double) 1L);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 10, 0.0d);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), (double) 1L);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 0.0d, (double) '#');
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) (byte) 0);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0, (double) 1L);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) 1.0f);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0.0f, (double) (-1L));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 10.0f, 1.0d);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 1L, (double) (byte) 1);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 100.0f, 0.0d);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1L), (double) (short) 1);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1L), (double) ' ');
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 10.0d, (double) (-1.0f));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1.0f), (double) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1.0f), (double) 100);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 0L, (double) '#');
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 10, (double) 100.0f);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 0.0f, (double) 0);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 0, (double) 0L);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 0.0d, (double) (short) 1);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 1, (double) 100L);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0L, (double) ' ');
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (double) '#');
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) -1, 10.0d);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 0, (double) 10);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0.0f, (double) 'a');
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 100, (double) '#');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (short) 0, (double) '#');
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 10L, (double) (byte) 100);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0, (double) 100L);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 10, (double) (byte) -1);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0.0f, (double) 10L);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 10.0d, 0.0d);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (-1.0d), (-1.0d));
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0.0f, 100.0d);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 10, (double) 0);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 'a', 0.0d);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 10.0d, (double) (byte) 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1), (double) (short) 0);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) 0L);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 0, (double) 100);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 1.0d, (double) (byte) 10);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) -1, (-1.0d));
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1, (double) 'a');
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 100, (double) 10);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (-1.0d), (double) 100L);
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 10, (double) (byte) 1);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (byte) -1, (double) (byte) 100);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) '4', 0.0d);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1, (double) (short) 1);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 1L, 0.0d);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 0, 100.0d);
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1L), (double) 0);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 10.0d, (double) 10);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 0, (double) (-1));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 1, (double) 'a');
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) -1, (double) '4');
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, 0.0d);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 100.0d, (double) (byte) 10);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 0, (double) 10L);
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1L, 100.0d);
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1.0f), (double) (short) 0);
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 1, (double) 0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '4', (double) (short) -1);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10, (-1.0d));
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) (short) 0);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 1L, (double) '#');
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 'a', (double) (short) -1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) '4', (-1.0d));
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1.0f, (double) 100);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0, (double) 0);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 100, (double) 1.0f);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) 1L);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) '#', (-1.0d));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1.0f), 100.0d);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (-1.0d), 0.0d);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) 1.0f);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10.0f, (double) (byte) -1);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, 0.0d);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (-1.0d), (double) ' ');
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) -1, (double) (short) 100);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 1L, (double) 100L);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 1.0d, 100.0d);
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 10.0d, (double) (byte) 1);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) 10.0f);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 0, (double) (-1L));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 0, (double) 10L);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 'a', (double) 1.0f);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 1, 0.0d);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 1.0d, (double) (byte) 10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0, (double) '#');
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 0, (double) ' ');
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10L, (double) '#');
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 100.0f, (-1.0d));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) -1, (double) 0L);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 1.0d, (double) (-1));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) (short) 100);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1L), (double) (-1));
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 1.0d, (double) (short) 100);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0.0f, (double) 0);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10.0f, (double) 1.0f);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 1L, (double) (byte) 0);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0L, (double) 100L);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0L, (double) ' ');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) (-1L));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1L), (double) 1L);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) 0);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0L, (double) (short) 100);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (-1L), (double) (byte) 100);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 1, (double) (short) 0);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (-1.0d), (double) 1);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) -1, 10.0d);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0L, (double) (byte) 10);
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1), (double) 10);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (double) 0L);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 0, (double) 100);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 10, (double) (-1));
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 100L, (double) 0.0f);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) -1, (double) 1);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0L, (double) (short) 1);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10L, (double) (-1));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1), (double) 'a');
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) 0);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) 1.0f);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 10.0f, (double) 100L);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1.0f), (double) (-1L));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, 100.0d);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 1L, (double) (-1L));
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1), (double) 1);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1L, (-1.0d));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 0, (double) (byte) 100);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0L, (double) 100.0f);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 10, (double) (short) 0);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) 10, (-1.0d));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0L, (double) '#');
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (-1L), (double) 100L);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) 10L);
    }
}
