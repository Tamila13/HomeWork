package main.java.lesson5;
import java.util.Scanner;
public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть суму доходу: ");
        double income = scanner.nextDouble();

        double taxRate;
        double taxAmount;

        if (income <= 10000){
            taxRate = 2.5;
        } else if (income <= 25000) {
            taxRate = 4.3;
        } else {
            taxRate = 6.7;
        }

        taxAmount = income*taxRate/100;

        System.out.printf("Сума доходу: %.2f грн%n", income);
        System.out.printf("Ставка податку: %.1f%%%n", taxRate);
        System.out.printf("Сума податку: %.2f грн%n", taxAmount);

    }

}
