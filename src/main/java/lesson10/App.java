package main.java.lesson10;
import java.util.Scanner;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Введення цілого числа і вивід квадрата
        System.out.print("1. Введіть ціле число: ");
        int number = sc.nextInt();
        System.out.println("  Квадрат числа " + number + " дорівнює " + square(number) + ".\n");

        // 2️⃣ Обчислення об’єму циліндра
        System.out.print("2. Введіть радіус: ");
        double radius = sc.nextDouble();
        System.out.print("   Введіть висоту: ");
        double height = sc.nextDouble();
        double volume = cylinderVolume(radius, height);
        System.out.println("  Об'єм циліндра з радіусом " + radius + " і висотою " + height +
                " дорівнює " + volume + ".\n");

        // 3️⃣ Обчислення суми елементів масиву
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("3. Масив чисел: " + Arrays.toString(arr));
        System.out.println("  Сума всіх елементів масиву дорівнює " + sumArray(arr) + ".\n");

        sc.nextLine(); // очистка буфера після nextDouble()

        // 4️⃣ Реверс рядка
        System.out.print("4. Введіть рядок: ");
        String input = sc.nextLine();
        System.out.println("  Рядок в зворотньому порядку: " + reverseString(input) + "\n");

        // 5️⃣ Обчислення a^b
        System.out.print("5. Введіть a: ");
        int a = sc.nextInt();
        System.out.print("  Введіть b: ");
        int b = sc.nextInt();
        System.out.println("  Результат " + a + "^" + b + " дорівнює " + power(a, b) + ".\n");

        sc.nextLine(); // очистка буфера після nextInt()

        // 6️⃣ Повторення тексту n разів
        System.out.print("6. Введіть ціле число n: ");
        int n = sc.nextInt();
        sc.nextLine(); // очистка буфера
        System.out.print("  Введіть текстовий рядок: ");
        String text = sc.nextLine();
        repeatText(n, text);

        sc.close();
    }

    // Метод — квадрат числа
    public static int square(int number) {
        return number * number;
    }

    // Метод — об'єм циліндра
    public static double cylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Метод — сума елементів масиву
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Метод — реверс рядка
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Метод — піднесення a до степеня b
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    // Метод — повторення тексту n разів
    public static void repeatText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println("  " + text);
        }
    }
}
