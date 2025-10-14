package main.java.lesson7;
import java.util.Scanner;


public class App {

/*
    Елементи масиву: [34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8]
    Сума від'ємних чисел: -138
    Кількість парних чисел: 11
    Кількість непарних чисел: 9
    Найменший елемент: -50 (з індексом 12)
    Найбільший елемент: 99 (з індексом 14)
    Середнє арифметичне чисел після першого від'ємного числа: 20.39*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть довжину масиву: ");
        int length = scanner.nextInt();
        int[] arrayInt = new int[length];

        String temp = "Введіть %d масиву: ";

        for (int i = 0; i < length; i++) {
            System.out.printf(temp, i+1);
            arrayInt[i] = scanner.nextInt();
        }
        System.out.println("Введений масив:");

        for (int num : arrayInt) {
            System.out.print(num + " ");
        }
        System.out.println("\n--------------------------");


        //     int[] arrayInt = new int[]{34, -10, 56, -22, 78, 5, 7, -15, 42, -30, 91, 0, -50, 18, 99, -3, 25, 11, 63, -8};
        //     int length = arrayInt.length;

        int sumNegative = 0;
        int countEven = 0;
        int countOdd = 0;
        int min = arrayInt[0];
        int minIndex = 0;
        int max = arrayInt[0];
        int maxIndex = 0;

        int firstNegativeIndex = -1;
        int sumAfterNegative = 0;
        int countAfterNegative  = 0;



        String temp1 = "Сума від'ємних чисел: %d%n";
        String temp2 = "Кількість парних чисел: %d%n";
        String temp3 =  "Кількість непарних чисел: %d%n";
        String temp4 =  "Найменший елемент: %d (з індексом %d)%n";
        String temp5 =  "Найбільший елемент: %d (з індексом %d)%n";
        String temp6 =  "Середнє арифметичне чисел після першого від'ємного числа: %.2f";



        double av = 0.00;



        for (int i = 0; i < length ; i++) {
            int num = arrayInt[i];
// сума негативних
            if (num < 0) {
                sumNegative +=num;
            }
// пошук та підрахунок парних та не парних
            if (num % 2 == 0){
                countEven ++;
            } else {
                    countOdd ++;
                }
// пошук мах
            if (num > max){
                max = num;
                maxIndex = i;
            }
// пошук міт
            if (num < min){
                min = num;
                minIndex = i;
            }

        }
        System.out.printf(temp1, sumNegative);
        System.out.printf(temp2, countEven);
        System.out.printf(temp3, countOdd);
        System.out.printf(temp4, min,  minIndex);
        System.out.printf(temp5 , max , maxIndex);

        // пошук першого від'ємного числа
        for (int i = 0; i < length; i++) {
            if (arrayInt[i] < 0) {
                firstNegativeIndex = i;
                break;
            }
        }

        if (firstNegativeIndex == -1 || firstNegativeIndex == length - 1){
            System.out.println("Немає від'ємних чисел або від'ємне число в кінці масиву");
        } else {
            for (int i = firstNegativeIndex + 1; i <length ; i++) {
                sumAfterNegative += arrayInt[i];
                countAfterNegative ++;
            }
            av = (double) sumAfterNegative / countAfterNegative;
            System.out.printf(temp6,  av);
        }


    }

}
