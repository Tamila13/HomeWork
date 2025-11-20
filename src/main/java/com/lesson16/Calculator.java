package main.java.com.lesson16;

public class Calculator {

    private static double result;

    public static double getResult() {
        return result;
    }

    public static void calculate(int a, int b, String operator) {
        result = 0;
        switch (operator) {
            case  "+":
                result = a + b;
                break;
            case  "-":
                result = a - b;
                break;
            case  "*":
                result = a * b;
                break;
            case  "/":
                if (b != 0) {
                    result = ( (double) a / b);
                }
                else {
                    throw new ArithmeticException("Can't divide by zero");
                }
                break;
            default:
                throw new IllegalArgumentException("Unexpected value: " + operator);
        }
        if (result % 1 == 0) {
            System.out.println(a + " " + operator + " " + b + " = " + (long) result);
        } else {
            System.out.println(a + " " + operator + " " + b + " = " + result);
        }

    }
}