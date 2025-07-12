package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (-1L), 0.70710678d, (double) '#', 1.0E-12d, (-100.0d), 0.001d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math4.test test0 = new org.apache.commons.math4.test();
        java.lang.Class<?> wildcardClass1 = test0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.25d, 0.3333333d, (double) 0, 0.0d, 10000.0d, 0.3333333d, 0.9d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.0d, 2.0d, (double) 100.0f, 5.0d, 0.01d, 1.0E-4d, 0.1d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.70710678d, 10.0d, (double) ' ', (-0.0d), (double) 0, (double) (-1.0f), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((-10.0d), (-1.0d), 512.0d, 10000.0d, (double) (byte) 1, 5.0d, 1.0E-8d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1024.0d, (double) (short) 10, (double) (byte) 0, (double) 1.0f, 1.0E10d, 0.01d, (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.9d, 0.0d, 0.9d, (double) (byte) 10, (double) (short) 10, 1.0E-10d, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 100, 100.0d, (double) 0, (double) (byte) 0, (-100.0d), 10.0d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.0d, (double) 100.0f, 1.0E-15d, 1024.0d, 256.0d, (double) (-1), 0.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-8d, 42.0d, 1.0E8d, (double) 10.0f, (double) 100.0f, 42.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 100, 0.25d, 100.0d, 1000000.0d, (double) 100.0f, (double) 0.0f, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 100, (double) 0L, 1.0E10d, 1.0d, 1.0E10d, (double) (byte) -1, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 0.0f, 1000000.0d, 0.25d, (double) (short) 10, (double) '4', 1.0E8d, (double) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 1, 1.0E-12d, 0.1d, (double) (byte) 0, (double) (byte) 1, (double) (short) 0, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) -1, (double) 100.0f, (double) '4', 0.25d, 100.0d, 0.0d, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 0, 256.0d, (double) 1, (double) '#', 0.5d, 1.0E-12d, 2.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 1, (double) 0.0f, (double) (-1.0f), 1.0E-15d, (double) 'a', (double) (byte) 10, (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.1d, (double) 10, 0.0d, (double) 1L, 1.0d, (double) 100L, 0.9d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-4d, (double) (byte) 0, 100.0d, (double) 10.0f, (-1.0E10d), (double) (-1L), (double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.70710678d, (double) 100, 1024.0d, 1000000.0d, (double) 100.0f, 1.0E-8d, 256.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-8d, (-0.0d), 1.0E-6d, (double) 10L, 0.9d, 0.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.25d, (-1.0d), 0.1d, (double) (byte) -1, (-10.0d), 0.1d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 1L, (-100.0d), (double) (byte) 10, 10.0d, (-1.0E10d), (double) (short) 0, 42.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10, 256.0d, 0.0d, (double) ' ', (double) 100.0f, 1.0E-15d, 1.0E-15d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-12d, 0.3333333d, (double) 0L, (double) 10L, (double) (short) 0, 2.0d, (double) (-1L));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 100, (double) (-1), (double) 0.0f, 0.0d, (-1.0d), 10.0d, (double) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 100, (double) (-1.0f), (double) 1, (double) '4', 0.01d, (double) 1L, (double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 'a', (double) (short) 100, 1.0d, 0.5d, (double) 1.0f, (double) 1L, 1.0E-10d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(512.0d, 1.0E-10d, (double) (short) 100, (double) (-1), (double) 1.0f, 1.0E-10d, (double) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 1, 0.001d, 0.70710678d, 0.3333333d, (double) (short) -1, (double) 10.0f, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((-0.0d), (double) 10L, (double) 'a', (double) (byte) -1, 256.0d, 0.001d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(100.0d, (-1.0d), 0.5d, 1.0E-15d, 1.0E-8d, (double) (byte) -1, (double) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (-1), 0.0d, 1.0E-4d, (double) 100L, (-1.0d), (double) (-1.0f), (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(256.0d, 5.0d, 0.25d, 1000000.0d, 1.0E-8d, (double) 10, 0.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(5.0d, (double) 0.0f, (double) (byte) 1, 1.0E10d, (-1.0d), (-1.0E10d), (-10.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-10d, (double) (byte) 0, 1000000.0d, (double) 10.0f, (double) 10.0f, (double) (short) -1, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.0d, 0.0d, (-0.0d), 1.0E-12d, 100.0d, (double) (short) 1, 256.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 10, (double) (byte) 100, (-0.0d), (double) 10, (double) 100L, 10000.0d, 42.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (-1L), (double) 0L, 0.0d, 256.0d, 0.0d, (double) (byte) -1, (double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10.0f, 1.0E-10d, (double) (byte) -1, 1.0E-12d, (-1.0d), 0.1d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 1, (double) 100, 0.3333333d, 1.0E8d, (double) 100, 1.0E-4d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(42.0d, (double) (short) 10, 10.0d, 0.3333333d, 1.0E8d, (double) (byte) 1, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.0d, (double) ' ', 1.0E-12d, (double) (-1), 10000.0d, (double) (short) 0, (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 0L, 1000000.0d, (double) 0, (double) 100L, (double) (-1), 512.0d, 1.0E-15d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) '#', 1000000.0d, 1.0E-15d, (double) 100, (double) 1.0f, 0.0d, 10.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(2.0d, 0.0d, (-1.0d), (double) 1, (double) (-1L), (double) (-1L), 1000000.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E8d, 1.0E8d, 256.0d, 0.0d, (double) '#', 0.0d, 0.01d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 0, (double) (short) 0, (double) 0L, 1.0E-6d, (double) (short) 10, 10.0d, (double) 'a');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10, (double) (-1), (double) '#', (double) 'a', (double) 100L, (double) (short) 100, (-0.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 10, 0.5d, (double) 10, (double) 100L, (double) 0.0f, (double) (byte) 10, 1.0E8d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(512.0d, 100.0d, (-0.0d), 42.0d, (double) 1, (double) (byte) 100, 42.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10, (double) (short) 0, (double) 1.0f, 1.0E-6d, 0.25d, 10000.0d, (double) 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1000000.0d, (double) (-1L), 10.0d, (double) (-1L), 10000.0d, (double) 100L, 1.0E8d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.01d, (double) ' ', (-1.0E10d), (double) 1.0f, (-10.0d), 0.9d, 1000000.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(10000.0d, 1.0E-12d, 0.9d, 1.0E-15d, 0.0d, 0.1d, (double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 0, 5.0d, (double) 0, 1.0E-12d, (double) 'a', 1.0E-8d, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((-10.0d), (double) (short) 0, (double) (byte) -1, 512.0d, 0.001d, 10000.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (-1), (double) (short) -1, (double) (byte) 1, (double) 1.0f, 1.0d, 1.0E-4d, (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.5d, (-10.0d), 1.0E-4d, (double) 0.0f, 0.70710678d, (double) 0.0f, (-100.0d));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0E-8d, (double) (byte) 0, 1.0E10d, (double) (byte) 10, (double) (short) 10, 1024.0d, 42.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(10.0d, (double) (-1), 5.0d, (double) 100.0f, (double) 100L, 10.0d, 1.0E-10d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(100.0d, (double) (-1.0f), (-1.0d), 0.9d, (double) 1.0f, 0.0d, (double) 100L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 1.0f, (double) 100, (double) (short) 100, (double) '#', (double) (-1L), (double) (short) 10, 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10L, 0.3333333d, 0.1d, (double) '4', 0.0d, (double) (byte) 1, 1.0E-4d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 10, (-1.0d), (double) (short) -1, (double) (-1.0f), 42.0d, 1.0E-8d, (double) 100.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(512.0d, (double) (byte) -1, 100.0d, 1.0E8d, 10.0d, 0.0d, (double) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) '4', (double) 100, 1024.0d, 1.0E-10d, (double) (-1.0f), 0.25d, 42.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 0, 0.001d, (double) 10.0f, 0.0d, 0.9d, 1.0d, 0.25d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(5.0d, (double) (short) 0, 1.0E-15d, 0.9d, (-1.0E10d), 0.3333333d, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) -1, 0.9d, 1.0E10d, (double) 1.0f, 1.0E-4d, (double) (-1), (double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(1.0d, (double) (short) 1, (double) (byte) 1, (double) 1.0f, (double) 1L, (double) 100, (double) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 0, (double) (byte) 100, (-100.0d), (double) 100.0f, 1.0E-4d, (double) (short) 1, 512.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(0.1d, (-10.0d), 1.0E-6d, 0.001d, (double) 1L, 10.0d, (double) 0L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 1.0f, (double) (byte) 0, 1.0d, 0.0d, (double) (short) 1, (double) 0L, 1024.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (byte) 1, 0.70710678d, 1.0E-8d, (double) (-1), (-10.0d), 0.3333333d, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (-1L), (double) 0L, (double) 100, 100.0d, (double) (byte) -1, (-10.0d), 1.0E-12d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 100, 0.5d, 0.001d, 1.0E10d, 1024.0d, (double) (-1L), 1.0E-12d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) '#', 1.0E-6d, (double) 1, (double) (short) -1, (double) 'a', (double) 100.0f, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 0, (-10.0d), (double) 10L, 0.5d, (-1.0d), (double) 0, 1.0E-8d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 'a', 0.1d, 1.0E-10d, (double) '4', 0.01d, 1000000.0d, (double) 1L);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) 10L, 1.0E-4d, (-10.0d), (-1.0d), 1.0E-6d, (-1.0d), 10000.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(256.0d, (double) (byte) 0, 256.0d, (double) 0L, 0.0d, (-10.0d), (double) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval(100.0d, (double) '#', 0.01d, 1.0E10d, 0.70710678d, 0.25d, (double) '4');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) -1, 42.0d, 10.0d, 0.5d, (-1.0d), (double) ' ', 1.0E-6d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        boolean boolean7 = org.apache.commons.math4.test.testBracketWithRootInInterval((double) (short) 10, 0.001d, 1.0E-4d, (double) 100.0f, (double) '4', (double) 10, 0.25d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

