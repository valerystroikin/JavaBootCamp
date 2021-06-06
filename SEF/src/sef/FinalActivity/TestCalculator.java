package sef.FinalActivity;

import junit.framework.TestCase;

import static java.lang.Math.abs;

public class TestCalculator extends TestCase {
    private Calculator theCalc;
    protected void setUp() throws Exception {
        super.setUp();
        theCalc = new Calculator();
    }
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testAdd(){
        int num1 = 4;
        int num2 = 2;
        assertEquals(num1+num2, theCalc.add(4,2));

        num1 = -4;
        num2 = -2;
        assertEquals(num1+num2, theCalc.add(-4,-2));

        num1 = -4;
        num2 = 2;
        assertEquals(num1+num2, theCalc.add(-4,2));

    }
    public void testMultiply(){
        int num1 = 4;
        int num2 = 2;
        int[] array = new int[]{4, 2};
        assertEquals(num1*num2, theCalc.multiply(array));

        num1 = 4;
        num2 = 2;
        int num3 = 2;
        int[] array2 = new int[]{4, 2,2};
        assertEquals(num1*num2*num3, theCalc.multiply(array2));
    }
    public void testDivide(){
        int num1 = 4;
        int num2 = 2;
        assertEquals(num1/num2, theCalc.divide(4,2));
    }
    public void testSubtract(){
        int num1 = 5;
        int num2 = 2;
        assertEquals(num1-num2, theCalc.subtract(5,2));
        num1 = -5;
        num2 = -2;
        assertEquals(abs(num1-num2), theCalc.subtract(-2,-5));
    }
    public void testCalcType(){
        String calcType = "Basic";
        theCalc.setCalculatorType("Basic");
        assertEquals(calcType,theCalc.getCalculatorType());
    }
    public void testThrowException(){

        try {
            theCalc.divide(6,0);

            new Calculator();
        }
        catch (Exception e) {
            fail();
        }

        catch (Error e) {
            fail();
        }
    }
}
