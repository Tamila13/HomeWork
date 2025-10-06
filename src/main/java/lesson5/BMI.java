package main.java.lesson5;
import java.util.Scanner;
public class BMI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть скільки вам повних років: ");
        int age = scanner.nextInt();

        System.out.println("Оберіть стать:");
        System.out.println("1 - Чоловіча");
        System.out.println("2 - Жіноча");
        System.out.print("Ваш вибір: ");
        int gender = scanner.nextInt();

        System.out.print("Введіть масу тіла в кілограмах: ");
        double weight = scanner.nextDouble();

        System.out.print("Введіть зріст в метрах: ");
        double height = scanner.nextDouble();

        double bmi = weight/Math.pow(height,2);

        String category;

        System.out.println("------------------------------------");
        System.out.printf("Стать: %s%n", gender);
        System.out.printf("Маса: %.1f кг%n", weight);
        System.out.printf("Зріст: %.2f м%n", height);
        System.out.printf("Індекс маси тіла (ІМТ): %.2f%n", bmi);


        if ((gender ==1 && ((age <25 && bmi <20)
                            || (age > 24 && age <35 && bmi <21)
                            || (age > 34 && age <45 && bmi <22)
                            || (age > 44 && age <55 && bmi <23)
                            || (age > 54 && age <65 && bmi <24)
                            || (age > 64 &&  bmi <25)))
            ||(gender == 2 && ((age <25 && bmi <19)
                            || (age > 24 && age <35 && bmi <20)
                            || (age > 34 && age <45 && bmi <21)
                            || (age > 44 && age <55 && bmi <22)
                            || (age > 54 && age <65 && bmi <23)
                            || (age > 64 &&  bmi <24)))) {
            System.out.println("Оцінка: Недостатня маса тіла");;
        }
        else if ((gender ==1 && ((age <25 && bmi <25)
                || (age > 24 && age <35 && bmi <26)
                || (age > 34 && age <45 && bmi <27)
                || (age > 44 && age <55 && bmi <28)
                || (age > 54 && age <65 && bmi <29)
                || (age > 64 &&  bmi <30)))
                ||(gender == 2 && ((age <25 && bmi <24)
                || (age > 24 && age <35 && bmi <25)
                || (age > 34 && age <45 && bmi <26)
                || (age > 44 && age <55 && bmi <27)
                || (age > 54 && age <65 && bmi <28)
                || (age > 64 &&  bmi <29)))) {
            System.out.println("Оцінка: Норма");;
            }
        else if (((gender ==1 || gender == 2 ) && ((age <25 && bmi <30)
                || (age > 24 && age <35 && bmi <31)
                || (age > 34 && age <45 && bmi <32)
                || (age > 44 && age <55 && bmi <33)
                || (age > 54 && age <65 && bmi <34)
                || (age > 64 &&  bmi <35)))) {
            System.out.println("Оцінка: Надлишкова вага");;
        }
        else {
            System.out.println("Оцінка: Ожиріння");;

        }
        }

    }


