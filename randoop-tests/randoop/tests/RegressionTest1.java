package randoop.tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
            System.out.format("%n%s%n", "RegressionTest1.test501");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) '#');
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) (byte) 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) 100);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) (short) 100);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) 100);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) (short) 100);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) 100);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) 1);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) (short) 1);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) (byte) 1);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) '4');
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1.0f, (double) ' ');
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, (double) (byte) 100);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, (double) 100);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, (double) '4');
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, 10.0d);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 100L);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) 100);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) 1L);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) (short) 10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) 10);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) (short) 1);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, 1.0d);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) 'a');
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) ' ');
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) (byte) 100);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 1, 1.0d);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100L, (double) 100);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(0.0d, (double) '#');
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) '#');
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, 1.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 10.0f);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, (double) 1.0f);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, 10.0d);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) '4');
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 1, (double) 1.0f);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) 1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) 'a');
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) ' ');
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, 1.0d);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) 10.0f);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 10);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) 100L);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), 10.0d);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(1.0d, (double) 1.0f);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) (short) 1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, (double) 10.0f);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) 10.0f);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) (byte) 10);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, (double) 100L);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) (byte) 10);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) 1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) (byte) 10);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) 100L);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) (short) 10);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, 1.0d);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', 10.0d);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '#', 1.0d);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) 10L);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) (short) 10);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100L, (double) 1.0f);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) '#');
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) ' ');
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) (short) 1);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) 10L);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) 'a');
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) (byte) 10);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) 10L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) 10.0f);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 10L);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', (double) (byte) 1);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) (short) 10);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) (byte) 10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) (byte) 10);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) '4');
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) (byte) 100);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) (byte) 1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) 100L);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 100);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 1, (double) (short) 10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) (short) 100);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '#', (double) 1L);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 0, (double) (short) 1);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10, (double) 1L);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) 1L);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '#', (double) (short) 10);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, (double) (short) 1);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) 'a');
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', 1.0d);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) (short) 100);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) 1);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) (byte) 100);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, 1.0d);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) '4');
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) (byte) 100);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, 100.0d);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) (byte) 1);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 0, (double) 'a');
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(1.0d, (double) 10);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) 10.0f);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) 10L);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) (short) 100);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) '#');
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) 100L);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 100.0f);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) 100);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, (double) (byte) 10);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, (double) (short) 100);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) 100L);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) (short) 10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) (short) 10);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) (short) 1);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) (byte) 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) 100L);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) ' ');
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) (short) 10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) 100);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, (double) 1.0f);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10.0f, (double) 100.0f);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), 100.0d);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) (short) 1);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) 10);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(1.0d, (double) (short) 1);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) (short) 1);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) (byte) 10);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) (short) 100);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) 10);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) (short) 100);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) 10L);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) (byte) 1);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1.0f, (double) (byte) 100);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) (byte) 10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) (byte) 100);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) '#');
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), 10.0d);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) (byte) 10);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) 100);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, (double) (short) 100);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) 10L);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) 10.0f);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 10L);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '#', (double) 10L);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) (short) 10);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, 10.0d);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) (byte) 1);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) '4');
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) (byte) 10);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) 100L);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, (double) 'a');
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100L, 100.0d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 1L);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10, (double) 1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) '4');
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, (double) (short) 1);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) 100L);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) '4');
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', 1.0d);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 100.0f);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 0, 100.0d);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) (short) 100);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) (short) 100);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) 1.0f);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0.0f, (double) (short) 10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) 'a');
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) (short) 10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) 100);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) 1L);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) 'a');
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 10.0f);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) (byte) 1);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, 100.0d);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), 1.0d);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) '#');
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, 10.0d);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) 10);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) 1.0f);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) ' ');
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) (byte) 100);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) 10);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100L, (double) 1);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, 10.0d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', (double) (short) 1);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) 100L);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) -1, (double) (byte) 100);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) (byte) 100);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1.0f, (double) '4');
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, 10.0d);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) 10.0f);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 1, (double) '#');
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(1.0d, (double) (byte) 100);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 'a');
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) (short) 1);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((-1.0d), (double) 1.0f);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', (double) (byte) 10);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) (byte) 10);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 0, (double) 100);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) 100L);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1), (double) '4');
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) (short) 100);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) 100.0f);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) 10);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, 100.0d);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) (short) 10);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) (byte) 10);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1, (double) 100L);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) 100.0f);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 1, (double) 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 10, (double) 1L);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) 100);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10, (double) 10.0f);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, (double) 10);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10, (double) 10);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) (byte) 1);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) 1.0f);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 'a', (double) (byte) 100);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) 1.0f);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) 'a');
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0L, (double) '#');
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1.0f, (double) (byte) 10);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 100, (double) (byte) 10);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) 1L);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) '4', (double) 1);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100.0f, (double) ' ');
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1L, (double) '#');
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) 1);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1L), (double) (short) 1);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, (double) 1L);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100L, (double) (byte) 100);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) (byte) 100);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(100.0d, 10.0d);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, (double) 10.0f);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 100, (double) ' ');
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) 'a');
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) ' ', (double) 100L);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (short) 0, (double) 1L);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) 10, (double) 1L);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (-1.0f), (double) '4');
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) (byte) -1, (double) (byte) 100);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 0, (double) ' ');
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 1.0f, (double) (short) 100);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, (double) 10.0f);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 10L, 10.0d);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape((double) 100, 1.0d);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        org.apache.commons.math3.test.testVarianceIncreasesWithShape(10.0d, (double) 100.0f);
    }
}

