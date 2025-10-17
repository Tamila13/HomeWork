package main.java.lesson8;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//       int[] array = new int[]{45, 32, 78, 12, 88, 2, 65, 34, 98, 7, 55, 23, 67, 41, 91};
//       int length = array.length;

        // Створення та заповнення масиву випадковими числами від 1 до 100
              int[] array = new int[15];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1;
        }


        System.out.println("Початковий масив:");
        System.out.println(Arrays.toString(array));

        // Сортування методом вставки (Insertion Sort)
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // зсуваємо елементи, які більші за key, вправо
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            // вставляємо key у правильне місце
            array[j + 1] = key;
        }


        System.out.println("Відсортований масив:");
        System.out.println(Arrays.toString(array));


        System.out.print("Введіть число для пошуку: ");
        int target = scanner.nextInt();

        // Бінарний пошук циклом
        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (array[mid] == target) {
                index = mid;
                break;
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }


        if (index != -1) {
            System.out.println("Індекс числа " + target + " у відсортованому масиві: " + index);
        } else {
            System.out.println("Число " + target + " не знайдено у масиві.");
        }
    }
}

