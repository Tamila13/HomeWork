package main.java.com.lesson16;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a = scanner.nextInt();
        System.out.print("Enter operator: ");
        String operator = scanner.next();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        Calculator.calculate(a, b, operator);

    }
}
