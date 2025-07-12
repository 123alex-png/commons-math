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
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, 0.0d, (double) (short) 100);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 0L, (double) 10L);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0, (double) 100L);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10.0f, (double) '4');
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1), (double) 10.0f);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (-1.0d), (double) (byte) 0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0.0f, (double) (byte) 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), 0.0d, (double) 100.0f);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1), (-1.0d));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1.0f), (double) '4');
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 1.0d, (double) (byte) 10);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100L, (double) (-1));
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100.0f, (double) 'a');
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 1.0d, (double) 10.0f);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 10.0d, (double) (short) 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 100.0d, 1.0d);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 1.0d, 1.0d);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, (double) (byte) 100);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 100, (double) 0.0f);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) 0, (double) 1);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) ' ', (double) (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10.0f, (double) (short) 0);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 0, (double) (byte) 0);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (-1.0d), 0.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) ' ', (double) 0.0f);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (-1.0f), 10.0d);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) 100, (-1.0d));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1.0f, (double) 0);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0.0f, 10.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 100L, (double) (byte) 1);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 100.0d, (double) (byte) -1);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) 100L);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0.0f, (double) '#');
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 10.0d, (double) (short) -1);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 100L, (double) 0);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0.0f, (double) (byte) 0);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 1L, (double) 1L);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) ' ', (double) (-1));
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 1, 100.0d);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 10, (double) 100L);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 100, (double) (-1.0f));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 1.0d, (double) 100.0f);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (-1.0d), (double) '#');
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 100.0d, (double) (-1L));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (short) 1, 10.0d);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 1.0f, (double) '#');
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1L), 0.0d);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) (short) 100);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) ' ', (double) 10.0f);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) -1, (double) 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, 0.0d);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (-1.0d), (double) 10L);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 100, 1.0d);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 100, (double) 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (short) -1, (double) 0);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) -1, (double) (-1));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (-1.0d), (double) (short) -1);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) '#', (double) (-1L));
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) -1, (double) 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1L), (double) 'a');
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 100.0d, (double) (short) 1);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 0, (double) 100);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 1.0d, (double) '4');
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0L, (double) 10.0f);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 100, (double) 0);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 0.0d, (double) (byte) -1);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 0, (double) 1.0f);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1), 100.0d);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (-1.0d), 0.0d);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1L, (double) 'a');
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 1);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 0, (double) ' ');
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 1.0d, (double) (byte) -1);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1), (double) 100L);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 100, (-1.0d));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 0.0d, (double) 10.0f);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 10, (double) (byte) 1);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 1.0f, (double) (byte) 0);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 100L, (double) (short) -1);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) ' ', (double) (short) 10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) (short) 10);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 0.0d, (double) 100);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 0, (double) (byte) 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) '#', 0.0d);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 1, (double) (short) 10);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0L, (double) 0L);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) -1, (double) 10L);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, 0.0d);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 'a', (double) '#');
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 100.0d, (double) 0L);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (short) -1, 100.0d);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0L, (double) 'a');
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 1, (double) 1L);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, 0.0d);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 10, (double) (-1.0f));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0, (double) '#');
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) '#');
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10, (double) 1L);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1L), (double) 1L);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 10L, 100.0d);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '4', (double) 1);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) '#', (double) (byte) -1);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 0, (double) '#');
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 'a', (double) (byte) 1);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 0, (double) 10.0f);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 10, 0.0d);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) '4', (double) 1.0f);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 10.0d, (double) (byte) 100);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 1, (double) '4');
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 0.0d, (double) 0);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0, 0.0d);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 0.0d, (double) '#');
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1L, (double) 0.0f);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 10, (double) (-1));
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) ' ', (double) (short) -1);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, (double) (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (-1.0f), (double) (byte) 0);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 100, (double) (byte) 0);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 0.0d, (double) 1.0f);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0, (double) (byte) 10);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) (short) 100);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1L), (double) (short) 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1), (double) (byte) 10);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1, (double) (byte) -1);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 1L, (double) (short) 1);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, (double) 100.0f);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 0, (double) 10L);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1.0f, (double) '#');
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 0.0d, (double) (short) 1);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 1L, (double) 'a');
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, (double) 0L);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) ' ', (double) (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 10.0f, (double) 100L);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, 10.0d);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, (double) 100.0f);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1L), (double) (-1.0f));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 100, 0.0d);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1, (double) (short) 1);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (-1.0d), (double) 10);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 100.0f, (double) (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 1, (double) '4');
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (double) 10L);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) '4', (double) 'a');
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 1, (-1.0d));
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 0, (double) ' ');
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 'a', (double) 1.0f);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 10, (double) (short) 100);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0L, (double) 1L);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) -1, (double) 1);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1), (double) (-1));
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '4', (double) 10.0f);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '#', (double) (byte) 0);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1), (double) (short) 10);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) ' ', (double) 1.0f);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) (-1));
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (-1.0d), (double) 'a');
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 100.0d, (double) 1);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100.0f, (double) 1);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 100L, (double) 1.0f);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0L, 100.0d);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 10.0d, (double) (-1L));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1, 0.0d);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (byte) 0, (double) (byte) -1);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10.0f, 1.0d);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) -1, (double) '#');
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), (double) (-1.0f));
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1), (-1.0d));
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 0, (double) 1.0f);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 0.0d, (-1.0d));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 10.0f, (double) 1.0f);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1L, (double) 0.0f);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (-1.0f), (double) 1.0f);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, 0.0d);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10L, (double) 10.0f);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (-1.0d), 10.0d);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 10.0d, 100.0d);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0, 0.0d);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 10, (double) (byte) 0);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 10, (double) 10);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 1.0f, (double) 100.0f);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) -1, (double) '#');
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 0.0d, (double) 100.0f);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10, (double) (byte) -1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), 0.0d);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '4', (double) (-1.0f));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 0.0d, (-1.0d));
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 10, (double) 100L);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0, (double) 1.0f);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 0, 10.0d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 100, (double) (short) 1);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 10);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 1.0d, (double) (byte) 100);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 10, (double) 0.0f);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1.0f), (double) 1.0f);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 10, (double) 100);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 1L, (double) 1L);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 1L, 0.0d);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 100.0d, (double) 'a');
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 1L, 100.0d);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 10.0d, (double) (byte) -1);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, 0.0d, (double) 10.0f);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 0.0d, (double) 0.0f);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) -1, (double) '4');
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0.0f, (double) 0L);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1), (double) (byte) 100);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 1, 1.0d);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 0, (double) 1.0f);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, (double) '4');
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 'a', (double) 10);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1), (double) 10);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 0.0d, 100.0d);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 10, (double) (short) -1);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) -1, (-1.0d));
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 1, (double) 0);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) -1, 100.0d);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) 1, (double) 10L);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (-1.0d), (double) '4');
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) 100.0f);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 'a', (double) (byte) 0);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 0, 100.0d);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10.0f, (double) 0L);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) '#', (double) 1);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 1, (double) 10);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) -1, (double) '4');
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 1.0f, (double) 100);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 1, (double) (short) 100);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '4', (double) (short) 0);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 0L, (double) '4');
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 100L, (double) 10);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 0, (double) (byte) 1);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1.0f), 100.0d);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) -1, (double) (-1));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '4', (double) '4');
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0L, (double) 1);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) 1.0f);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) 10.0f);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) '#', (double) (byte) -1);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 100, (double) (-1.0f));
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (-1.0d), 0.0d);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) 1, (double) (-1L));
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0, (double) '#');
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 0, (double) ' ');
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, (double) 0);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (-1.0d), (double) '#');
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) -1, (double) 1.0f);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 100L, 0.0d);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0, (double) 1);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (-1.0d), (double) 10L);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (byte) -1, (double) (-1L));
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 1.0d, (double) 1.0f);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) (byte) 100);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1L), (-1.0d));
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (byte) 0, (double) (byte) 100);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 100, (double) 0);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 1.0d, (double) (-1L));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10L, 1.0d);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (-1.0d), (double) (byte) 0);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, (double) 1.0f);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 100, 1.0d);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (-1.0d), (double) (byte) 0);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 100.0d, (double) (short) -1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, 100.0d);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1.0f), (double) '#');
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) (-1L));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1), (double) (byte) 10);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) -1, (double) '#');
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 'a', (-1.0d));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 10, 1.0d);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) -1, 10.0d);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1L), (double) (short) -1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) 0, (double) 'a');
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1L, (double) (byte) 1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '#', 0.0d);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) -1, (-1.0d));
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0, (double) 10L);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 0, (double) 1L);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 1.0f, (-1.0d));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 10.0d, (double) 0L);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), (double) 10.0f);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 1, (double) 100.0f);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 10.0d, (double) (short) 0);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 10.0f, (double) 'a');
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (-1.0d), (double) (-1));
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1), (double) '4');
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), 10.0d);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) -1, (double) '#');
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1, (double) (short) 1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 10, (double) 1);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 100L, (double) (byte) -1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) 0, (double) 1.0f);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1L), (double) 100L);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 0, (double) (byte) -1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 1, 10.0d);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1L), (double) (-1L));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 0, (double) 10);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0L, (double) 10);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) ' ', (double) (short) 0);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (byte) 1, (double) (-1L));
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 100.0d, (double) 1.0f);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 1, (double) 100L);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0.0f, (double) 1L);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 0.0f, 0.0d);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 10L);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) 0, (double) 100L);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (-1.0d), (double) '4');
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, 10.0d);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) 0, (double) 100.0f);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (-1.0d), (double) ' ');
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '4', (-1.0d));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 0.0d, (double) (byte) 0);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (-1.0d), (double) (short) 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 0L);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (-1.0d), 0.0d);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0.0f, (double) 10.0f);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1.0f, (double) (short) -1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 'a', (double) (short) 0);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 100, (double) 1L);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 0.0d, (double) (byte) 0);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (-1.0d), (double) 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1), (double) (short) 1);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), 10.0d, 100.0d);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) 100L);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (-1), (double) 10);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 10, 0.0d);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 1.0d, (-1.0d));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 0);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 1, (double) (-1L));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1L, (double) 1.0f);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 1L);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) 100, (double) (short) 0);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0L, (double) 100.0f);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) '#', (double) 0L);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) '#', 1.0d);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 1.0d, (-1.0d));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 10, (double) 10L);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1.0f), (double) 10L);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 1L, (double) '4');
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 10, (double) (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) ' ', (double) (-1.0f));
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1, (double) 1);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) '#', (double) (short) -1);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0, (double) (short) 10);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 100, (double) 1);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0.0f, (double) 100.0f);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 1.0d, (double) 0.0f);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0.0f, (double) 10L);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1, (double) (byte) 0);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 100.0d, (double) 0);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1930");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (short) 0, (double) 1.0f);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1931");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 100L, (double) (byte) 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1932");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 1, (double) (short) 100);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1933");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 10.0f, (double) 100);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1934");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 1, (double) 100);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1935");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1L, (double) 'a');
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1936");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) 100.0f);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1937");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1938");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (byte) 1, (double) '#');
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1939");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) ' ', (double) 0.0f);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1940");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (-1), 0.0d);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1941");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 10, (double) (byte) -1);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1942");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 10.0d, (-1.0d));
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1943");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 100, (double) 0L);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1944");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1), (double) 0.0f);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1945");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) 1, (double) 100.0f);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1946");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (double) (-1L));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1947");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 1, (double) 100L);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1948");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 1, (double) '4');
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1949");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1950");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) '4', 0.0d);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1951");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (-1.0d), 0.0d);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1952");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) '#', (double) 1L);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1953");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1.0f), (double) (byte) 10);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1954");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (short) -1, (double) (byte) 10);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1955");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 10.0d, (double) (byte) 0);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1956");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0L, (double) (byte) 10);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1957");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, (double) (-1));
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1958");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 1.0f, (double) 0);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1959");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1960");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1961");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, (double) (byte) 1);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1962");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1), (double) (short) 10);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1963");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 1, (-1.0d));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1964");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 1.0f, (double) 100L);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1965");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 100, (double) (byte) 1);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1966");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10, (double) 100L);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1967");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1L, (double) 100);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1968");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) 10, 0.0d);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1969");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1970");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (double) 0.0f);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1971");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 10, 100.0d);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1972");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 1, (double) 100);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1973");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1974");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 1, (double) 10L);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1975");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10L, (double) 0L);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1976");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 100.0d, (double) 1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1977");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '4', (double) (byte) 0);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1978");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1979");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 0.0d, (double) 10);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1980");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1L), (double) '4');
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1981");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), 0.0d, (double) 10.0f);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1982");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 0, (double) (-1));
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1983");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1L), 100.0d);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1984");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 100.0f, (double) (byte) -1);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1985");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1986");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0L, (double) 1.0f);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1987");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1988");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 100, (double) (byte) -1);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1989");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 10, (double) 'a');
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1990");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1991");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1992");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (-1.0f), 10.0d);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1993");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (-1), 0.0d);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1994");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1995");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) -1, (double) '#');
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1996");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 10, (double) 10.0f);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1997");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 10, (double) (short) 10);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1998");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0, 10.0d);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1999");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test2000");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (-1.0d), 10.0d);
    }
}
