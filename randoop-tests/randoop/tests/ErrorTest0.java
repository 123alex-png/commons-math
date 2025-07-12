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
        org.apache.commons.math3.geometry.euclidean.threed.Vector3D[] vector3DArray0 = new org.apache.commons.math3.geometry.euclidean.threed.Vector3D[] {};
        java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.threed.Vector3D> vector3DList1 = new java.util.ArrayList<org.apache.commons.math3.geometry.euclidean.threed.Vector3D>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math3.geometry.euclidean.threed.Vector3D>) vector3DList1, vector3DArray0);
        // during test generation this statement threw an exception of type org.apache.commons.math3.exception.MathInternalError in error
        org.apache.commons.math3.test.testAddOuterPointEffect((java.util.List<org.apache.commons.math3.geometry.euclidean.threed.Vector3D>) vector3DList1);
    }
}
