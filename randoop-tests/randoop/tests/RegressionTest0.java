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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray0 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {};
        java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> vector2DList1 = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1, vector2DArray0);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        java.lang.Class<?> wildcardClass4 = vector2DList1.getClass();
        org.junit.Assert.assertNotNull(vector2DArray0);
        org.junit.Assert.assertArrayEquals(vector2DArray0, new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.apache.commons.math3.test test0 = new org.apache.commons.math3.test();
        java.lang.Class<?> wildcardClass1 = test0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray0 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {};
        java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> vector2DList1 = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1, vector2DArray0);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        java.lang.Class<?> wildcardClass5 = vector2DList1.getClass();
        org.junit.Assert.assertNotNull(vector2DArray0);
        org.junit.Assert.assertArrayEquals(vector2DArray0, new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray0 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {};
        java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> vector2DList1 = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1, vector2DArray0);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        java.lang.Class<?> wildcardClass6 = vector2DList1.getClass();
        org.junit.Assert.assertNotNull(vector2DArray0);
        org.junit.Assert.assertArrayEquals(vector2DArray0, new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] vector2DArray0 = new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {};
        java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D> vector2DList1 = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1, vector2DArray0);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        org.apache.commons.math3.test.testConvexHullWithPoints((java.util.List<org.apache.commons.math3.geometry.euclidean.twod.Vector2D>) vector2DList1);
        java.lang.Class<?> wildcardClass7 = vector2DList1.getClass();
        org.junit.Assert.assertNotNull(vector2DArray0);
        org.junit.Assert.assertArrayEquals(vector2DArray0, new org.apache.commons.math3.geometry.euclidean.twod.Vector2D[] {});
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

