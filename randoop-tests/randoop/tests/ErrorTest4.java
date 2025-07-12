package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest4 {

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
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2001");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2002");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0L, (double) (short) 0);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2003");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) '#', (double) (byte) -1);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2004");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 0L, 10.0d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2005");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1), (double) (byte) -1);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2006");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 0.0d, (double) (-1L));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2007");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (byte) -1, (double) '#');
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2008");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0L, (double) (short) 1);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2009");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 10, (-1.0d));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2010");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1), 1.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2011");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '#', (double) (short) 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2012");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10, (double) 100);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2013");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) 0.0f);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2014");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 100, (double) (-1.0f));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2015");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, 10.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2016");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) '4', (double) 1);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2017");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2018");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2019");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0.0f, (double) ' ');
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2020");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0, (double) 10L);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2021");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 10.0d, (double) (short) -1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2022");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 100L, (double) 1.0f);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2023");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 10.0d, 0.0d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2024");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (byte) 1, (double) (-1.0f));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2025");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 1, (double) (-1L));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2026");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), 0.0d, (double) (short) 0);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2027");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0.0f, (double) 100L);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2028");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) -1, (double) (short) 10);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2029");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2030");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) '4', 0.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2031");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2032");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, (double) (byte) 1);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2033");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0, 10.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2034");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 1, (double) (byte) 10);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2035");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (-1L), (double) 0L);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2036");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0L, (double) (byte) 1);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2037");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 1, (double) 0L);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2038");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (-1L), (double) (-1));
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2039");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1L), (double) 10L);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2040");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, 1.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2041");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) -1, (double) 100);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2042");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 1, (double) (short) 100);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2043");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1L), (double) (short) 0);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2044");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 100.0f, (double) (byte) 0);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2045");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2046");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) '4', (double) (short) 0);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2047");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1.0f, (double) 'a');
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2048");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 1, 0.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2049");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 100, (double) (short) 0);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2050");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1), (double) '#');
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2051");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, 0.0d, (double) 10L);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2052");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1L), 0.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2053");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (-1.0d), 0.0d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2054");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 0.0d, (double) 10.0f);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2055");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2056");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10, (double) '4');
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2057");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 100.0f, (double) (-1.0f));
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2058");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0, (double) 10L);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2059");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 0.0d, 10.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2060");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0L, 0.0d);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2061");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 1, (double) (byte) 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2062");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1L), (double) 0.0f);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2063");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 10, (-1.0d));
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2064");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2065");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1L), (double) 100.0f);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2066");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2067");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 100.0d, (double) (byte) 0);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2068");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (double) (byte) 100);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2069");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 10L, (double) 10L);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2070");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 'a', 1.0d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2071");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (-1.0d), (double) (byte) 10);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2072");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2073");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 100L, (double) (short) 0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2074");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1, (double) ' ');
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2075");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 10.0f, (double) 0L);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2076");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (byte) 0, (double) 'a');
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2077");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1L), 0.0d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2078");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) -1, (double) 10L);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2079");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 10, (double) 10L);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2080");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, 0.0d, (double) 10L);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2081");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) '#', (double) 10.0f);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2082");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) 0L, (double) (-1.0f));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2083");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 0L, (double) 1.0f);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2084");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (short) -1, (double) (-1.0f));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2085");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) (-1L));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2086");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (-1.0d), (double) (short) 1);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2087");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 0.0d, 10.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2088");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 100.0d, (double) 0);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2089");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 1, (double) '4');
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2090");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 100.0d, 0.0d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2091");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 10.0d, (double) 'a');
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2092");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10L, (double) (-1));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2093");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (short) 1, (double) ' ');
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2094");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 10, 0.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2095");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 10, (double) (byte) 10);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2096");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 100.0d, (double) ' ');
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2097");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2098");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (-1.0f), (double) 10);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2099");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1L), 100.0d);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2100");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 'a', (double) 'a');
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2101");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2102");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 10, 100.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2103");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 100L, (double) 1.0f);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2104");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0, (double) '4');
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2105");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 1, (double) (byte) -1);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2106");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) -1, 10.0d);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2107");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 0.0d, (-1.0d));
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2108");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2109");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2110");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (-1.0d), (double) '4');
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2111");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, 100.0d);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2112");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) -1, (double) 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2113");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 100L, (double) (short) 0);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2114");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) -1, 0.0d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2115");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, 1.0d, 0.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2116");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100, (double) (short) -1);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2117");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 1.0f, (double) 10);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2118");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 1.0d, (double) 'a');
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2119");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) '#', (double) (byte) 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2120");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2121");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) '#', (double) (byte) 0);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2122");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (-1.0f), (double) (byte) -1);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2123");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1, 0.0d);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2124");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, (double) 1L);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2125");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1, (double) (byte) 1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2126");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10L, 0.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2127");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (-1L), (double) 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2128");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, 0.0d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2129");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2130");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 1L, (double) 0);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2131");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) ' ', (double) (short) -1);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2132");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) -1, (double) 'a');
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2133");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) 0, (double) 10L);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2134");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 100.0f, (-1.0d));
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2135");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (-1L), (double) (short) 10);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2136");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (-1), (-1.0d));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2137");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) 10, (double) ' ');
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2138");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) '#');
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2139");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1), (double) 0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2140");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (-1.0f), (double) 0L);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2141");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2142");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (-1.0d), (double) (-1.0f));
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2143");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2144");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 10, (double) 1L);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2145");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, 1.0d, (double) (byte) 100);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2146");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 10.0f);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2147");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2148");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) -1, (double) ' ');
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2149");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 1, (double) (short) 1);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2150");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 0.0d, (double) (-1.0f));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2151");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 'a', (double) (byte) 10);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2152");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 0.0f, (double) (-1));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2153");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2154");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 1.0d, 100.0d);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2155");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (-1.0f), 100.0d);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2156");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 0L, (double) 10.0f);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2157");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1L), (double) 1.0f);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2158");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) 10, (double) 100.0f);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2159");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) 100, (double) 0.0f);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2160");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 10, 1.0d);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2161");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 1.0f, (double) 0.0f);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2162");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) -1, (double) (-1L));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2163");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 10, (double) 100.0f);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2164");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 0.0d, (double) 100);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2165");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0.0f, (double) 10);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2166");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) '#', (double) (short) 1);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2167");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2168");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) 0, (double) (-1.0f));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2169");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 1.0f, (double) 'a');
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2170");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 0, 1.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2171");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) -1, (double) 10);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2172");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) (byte) 100);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2173");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 100, (double) 0L);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2174");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) (byte) 10);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2175");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (-1), (double) (short) -1);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2176");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2177");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0.0f, 0.0d);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2178");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 1.0d, (double) (byte) 1);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2179");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) (byte) 1, (double) 0.0f);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2180");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) ' ', (double) 10);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2181");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) 1, (double) (-1));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2182");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 1, 0.0d);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2183");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) 10, (double) (short) 100);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2184");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1L, (double) (-1L));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2185");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (-1.0d), (double) (-1.0f));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2186");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, (double) 10);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2187");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 1.0f, (double) (byte) 0);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2188");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 100.0d, (double) (short) 10);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2189");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), (double) 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2190");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (byte) 1, (double) 1);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2191");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 1, (double) (short) -1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2192");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 10, (double) (short) 10);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2193");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100.0f, (double) 1L);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2194");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2195");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1), (double) (byte) 10);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2196");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 0L, (double) 100L);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2197");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 0.0f, (double) 10);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2198");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (-1.0f), 100.0d);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2199");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) 10.0f, 0.0d);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2200");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) '4', (double) (byte) -1);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2201");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0.0f, (double) (short) -1);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2202");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (byte) 1, 0.0d);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2203");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 100, (double) (byte) 0);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2204");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 0L, (double) (byte) -1);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2205");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, (double) 10);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2206");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) 0, (double) 10);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2207");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 1, (double) '#');
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2208");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2209");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 1, (double) '4');
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2210");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 1.0d, 0.0d);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2211");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) -1, (double) (short) 100);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2212");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (short) -1, (double) '4');
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2213");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 1.0d, (double) 0L);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2214");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1), (double) (-1.0f));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2215");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) 100L, 0.0d);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2216");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2217");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 0, (double) (byte) -1);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2218");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (short) 0, (-1.0d));
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2219");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) (short) -1, (double) 0.0f);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2220");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (-1.0d), (double) 100);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2221");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1, (double) (short) 10);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2222");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 1L, 10.0d);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2223");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0.0f, 0.0d);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2224");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1, 0.0d);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2225");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) ' ', (double) (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2226");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (-1), 0.0d);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2227");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2228");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) 0, 0.0d);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2229");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 0, (double) 10);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2230");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0, (double) 100.0f);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2231");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (-1), (double) 1L);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2232");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0L, (double) (byte) 100);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2233");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 'a', 0.0d);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2234");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (byte) -1, (double) ' ');
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2235");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 100, (double) (-1.0f));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2236");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 100, (double) 10L);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2237");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) -1, (double) 'a');
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2238");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 0L, (double) (-1L));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2239");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1L, (double) (-1.0f));
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2240");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) ' ', (double) (-1L));
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2241");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2242");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, 0.0d, (double) '4');
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2243");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 1L, (double) ' ');
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2244");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 0.0d, (-1.0d));
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2245");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) '4', (double) 0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2246");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2247");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, 1.0d, (double) 100.0f);
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2248");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (byte) -1, (double) (byte) -1);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2249");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0, (double) '4');
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2250");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2251");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (-1L), (double) 100);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2252");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 1L, (double) (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2253");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (short) -1, (-1.0d));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2254");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 0.0d, 0.0d);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2255");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 0, 0.0d);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2256");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), 1.0d);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2257");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 1.0f, 0.0d);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2258");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 0.0d, (double) 100L);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2259");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) ' ', 0.0d);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2260");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 10L, 100.0d);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2261");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2262");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 1, (double) (short) 0);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2263");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '4', (double) 0.0f);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2264");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 10.0d, (double) (short) 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2265");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0, (double) (short) 1);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2266");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', 0.0d, (double) (short) 1);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2267");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2268");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, 1.0d);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2269");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (-1.0d), (double) 100);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2270");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '#', 1.0d);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2271");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 1.0f, (double) 0L);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2272");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) '#');
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2273");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 0, (double) (short) 0);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2274");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 0.0d, (double) (byte) -1);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2275");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 0, (double) 100);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2276");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (-1.0d), (double) 1);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2277");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 10.0d, (double) (-1L));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2278");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 0.0d, (double) 10L);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2279");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1L), (double) (short) 1);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2280");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 100.0d, (double) (byte) 0);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2281");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1.0f, (double) 0);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2282");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2283");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0, (double) (short) 100);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2284");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 0, (double) (short) 0);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2285");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (-1.0d), (double) 10.0f);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2286");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, 0.0d, (double) (short) -1);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2287");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 1, (double) (short) 10);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2288");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 100.0f, (double) 'a');
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2289");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) 1, (double) 10);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2290");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (byte) 10, (double) (-1.0f));
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2291");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2292");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 10L, (double) (short) 1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2293");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 0, (double) 10.0f);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2294");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, 100.0d, (double) (byte) 1);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2295");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 1, (double) 100);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2296");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 100, (double) (short) 10);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2297");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (-1.0d));
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2298");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, 10.0d, 1.0d);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2299");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (byte) 0, (double) (byte) 10);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2300");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1.0f), (double) (-1));
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2301");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) (short) 0);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2302");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (-1L), (double) 1L);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2303");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) -1, (double) 10);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2304");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 100.0d, (double) (byte) 10);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2305");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0L, (double) 0);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2306");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 'a', (double) (byte) -1);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2307");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1L), (double) (-1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2308");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (short) 0, 10.0d);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2309");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 10L, (double) (-1.0f));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2310");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 10, (double) 1.0f);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2311");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '#', (double) 10L);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2312");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0.0f, 10.0d);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2313");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 10.0d, (double) (short) 1);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2314");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 100L, (double) (short) -1);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2315");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2316");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) '#', (-1.0d));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2317");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 0, (double) 'a');
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2318");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1L), (double) (byte) 0);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2319");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 1, (double) 100L);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2320");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1L, (double) (short) 10);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2321");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (byte) 10, (double) 0L);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2322");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 0, (double) 1.0f);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2323");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (-1), (double) 1L);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2324");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 0, 100.0d);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2325");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 10.0f, 0.0d);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2326");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) -1, (double) (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2327");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (-1.0d), (double) 1);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2328");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (byte) 1, (double) (byte) 0);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2329");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (double) 1L, (double) (byte) 100);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2330");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, 0.0d, (double) (-1));
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2331");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, 0.0d, (double) (short) 10);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2332");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) -1, 0.0d);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2333");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1.0f, 0.0d);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2334");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), 0.0d);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2335");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 0.0f, 100.0d);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2336");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 1, 1.0d);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2337");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 0, (double) 0);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2338");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 1L, (double) 10L);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2339");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) '#', 0.0d);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2340");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) 0);
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2341");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 10L, (double) (-1L));
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2342");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) (byte) -1, (double) 10);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2343");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (-1.0f), (double) '#');
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2344");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) (-1), (double) '4');
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2345");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (-1.0d), (double) 10.0f);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2346");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0L, 100.0d);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2347");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 1L, (double) 1.0f);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2348");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (short) 100, (double) 1L);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2349");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 10.0d, (double) (short) 100);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2350");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) 10, (double) (short) 1);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2351");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) 10L, (double) (byte) -1);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2352");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1.0f), (double) 0.0f);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2353");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) (short) 1, (double) 100.0f);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2354");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 100.0f, 0.0d);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2355");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (short) 1, (double) (-1));
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2356");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2357");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (-1.0d), (double) 'a');
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2358");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, 0.0d, (double) (-1L));
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2359");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 10.0f, (double) (byte) 10);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2360");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 1.0d, (double) 0L);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2361");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 0, (double) 0L);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2362");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (byte) 0, (double) 10L);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2363");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (short) -1, (double) 1);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2364");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 10, (double) 10.0f);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2365");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) 0, (double) 1L);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2366");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2367");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 0.0f, (double) '4');
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2368");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) 1.0f, (double) ' ');
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2369");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) 1, 10.0d);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2370");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), 0.0d, (double) '#');
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2371");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (-1.0d), (double) 100.0f);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2372");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (short) 10, (double) 0L);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2373");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) (short) 1);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2374");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (-1), 0.0d);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2375");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 10.0d, 0.0d);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2376");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) (byte) 0, (double) 100L);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2377");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1), (double) (byte) 1);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2378");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 0, (double) 1.0f);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2379");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 10.0f, (double) (byte) 100);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2380");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) 0L, (double) 10L);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2381");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) (-1), 0.0d);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2382");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2383");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 10, (double) 100);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2384");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), 10.0d);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2385");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (double) 0.0f, (double) 1);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2386");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 1, (double) (byte) 100);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2387");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), (double) (byte) 1, (double) 10);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2388");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) 10L);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2389");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 0, (double) (short) 100);
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2390");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (-1.0f), 0.0d);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2391");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (short) -1, (double) 100L);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2392");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0.0f, (double) 10L);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2393");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', 1.0d, (double) (byte) 10);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2394");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, 10.0d, (double) 100.0f);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2395");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 1.0f, (double) (short) 0);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2396");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) 0.0f, (double) 100);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2397");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', 100.0d, (double) 10);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2398");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 1, (-1.0d), (double) (byte) 1);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2399");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) (short) 100, (double) (-1L));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2400");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1.0f, 1.0d);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2401");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 1.0d, (double) '#');
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2402");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0.0f, (double) 1, (double) '#');
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2403");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) (byte) -1, (double) (byte) 100);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2404");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1), 0.0d, 0.0d);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2405");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 0, (double) 0L);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2406");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (short) -1, (double) (byte) -1);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2407");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (byte) -1, (double) (byte) 0);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2408");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 10L, (double) (byte) -1);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2409");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (double) (short) 1, 10.0d);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2410");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, (double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2411");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (-1), (double) 1L);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2412");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) (byte) 1, (double) 1);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2413");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1.0f), (-1.0d), (double) 10.0f);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2414");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, (double) (byte) 10, (double) 'a');
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2415");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 0.0d, (double) '#');
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2416");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) '#', 0.0d);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2417");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) ' ', (double) 0L);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2418");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) (short) 100, (double) (byte) 1);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2419");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 0.0d, (double) (byte) 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2420");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (-1.0d), (double) 10);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2421");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1), (double) (short) 0);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2422");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) '4', (double) (-1));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2423");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1, (double) 10L, (double) 100.0f);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2424");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, (double) (short) 1, (double) '4');
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2425");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10L, 10.0d);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2426");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (short) 1, (double) 1.0f);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2427");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (-1.0d), (double) (short) 10);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2428");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) (byte) -1);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2429");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (byte) -1, (double) (-1.0f));
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2430");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, (double) 100.0f, (double) (-1L));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2431");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10.0f, (double) 1, (double) 'a');
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2432");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 'a', (double) 0L);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2433");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(10.0d, (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2434");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, (double) 1L, (double) '4');
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2435");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 0L, (double) (byte) 100);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2436");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2437");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', 0.0d, (double) (short) 100);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2438");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 0, (double) (short) 10);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2439");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 'a', (double) (short) 0, (double) 1);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2440");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10.0f, (double) (short) -1);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2441");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 10, (double) 1);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2442");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1L), (double) 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2443");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 10, (double) (byte) 0);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2444");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, 0.0d, (double) 1L);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2445");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2446");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (-1.0f), (double) 100L);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2447");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(0.0d, (double) 10, (double) (-1L));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2448");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 1.0d, (double) 1);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2449");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 10L, (double) (short) 1);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2450");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, 10.0d, (double) 1);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2451");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0.0f, (double) 1);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2452");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(1.0d, 0.0d, (double) (short) 1);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2453");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2454");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) (-1), (-1.0d));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2455");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (byte) 100, (double) (byte) -1);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2456");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, (double) (byte) 100, 0.0d);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2457");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, 0.0d, (double) (-1L));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2458");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) 10L, (double) (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2459");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2460");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1), (double) 0.0f);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2461");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma(100.0d, (double) (byte) 10, (double) (short) 0);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2462");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) (short) -1, (double) 100);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2463");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 10, (double) 100L);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2464");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) -1, (double) 0.0f);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2465");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((-1.0d), (double) 1.0f, (double) 100.0f);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2466");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 100, (double) 1L, (double) (byte) 10);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2467");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2468");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) '4', (double) 10L);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2469");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (byte) -1, (double) (short) -1);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2470");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) 0L, (double) 1);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2471");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 0, (double) 0.0f, 0.0d);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2472");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100L, 10.0d, (-1.0d));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2473");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2474");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100.0f, (double) (-1L), (double) 1);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2475");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 10, (double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2476");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (-1L), 100.0d);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2477");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1.0f, 0.0d, (double) 1.0f);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2478");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) (short) 1, (-1.0d));
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2479");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10L, 0.0d, (double) (short) 1);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2480");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) ' ', (double) (byte) 100, (double) 10L);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2481");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 1, (double) (short) 100, (double) 0);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2482");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (-1L), (-1.0d), (double) '#');
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2483");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) 1L, 0.0d);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2484");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 10, 0.0d, (double) 100.0f);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2485");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, (double) (short) 100, 0.0d);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2486");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) 10, (double) 100, (double) 0L);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2487");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 1L, (double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2488");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) (-1L), 100.0d);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2489");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 0, (double) 0.0f, (-1.0d));
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2490");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) 0L, (double) (byte) 0);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2491");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0, 0.0d, (double) 0.0f);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2492");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) -1, (double) 0L, 10.0d);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2493");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '4', (double) (byte) 100, (double) (short) -1);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2494");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) 10.0f, (double) '#');
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2495");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 0L, (double) (short) 0, (double) 'a');
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2496");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) '#', (double) (short) 10, (double) 10L);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2497");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) 100, 0.0d, (double) 10.0f);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2498");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, 1.0d, (double) (short) 100);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2499");
        // during test generation this statement threw an exception of type org.apache.commons.math4.exception.NotStrictlyPositiveException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (byte) -1, (double) 0, (double) (byte) 0);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest4.test2500");
        // during test generation this statement threw an exception of type java.lang.IllegalStateException in error
        org.apache.commons.math4.distribution.SensitivityMain.checkSensitivityToSigma((double) (short) 100, (double) '#', (double) (-1));
    }
}
