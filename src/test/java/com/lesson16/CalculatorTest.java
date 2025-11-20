package test.java.com.lesson16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import main.java.com.lesson16.Calculator;
import org.junit.jupiter.api.Test;


public class CalculatorTest {

    @Test
    public void checkSum() {
        Calculator.calculate(3,3,"+");
        assertEquals(6, Calculator.getResult(), "3 + 3 = " + Calculator.getResult());
    }

    @Test
    public void checkSubtraction() {
        Calculator.calculate(5,3,"-");
        assertEquals(2, Calculator.getResult(), "5 - 3 = " + Calculator.getResult());
    }

    @Test
    public void checkMultiplication() {
        Calculator.calculate(6,3,"*");
        assertEquals(18, Calculator.getResult(), "6 * 3 = " + Calculator.getResult());
    }

    @Test
    public void checkDivision() {
        Calculator.calculate(6,3,"/");
        assertEquals(2, Calculator.getResult(), "6 / 3 = " + Calculator.getResult());
    }

}