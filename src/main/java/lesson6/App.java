package main.java.lesson6;

public class App {
    static int sum;

    public static void main(String[] args) {
        String template = ("%d) Num is %d, sum is %d %n");

        for (int i=1; i <= 6; i++){

            sum+=i;
            System.out.printf(template, i, i, sum);

        }
        System.out.println("---------------------------");
        System.out.println("Sum of numbers is " + sum);
    }
}
