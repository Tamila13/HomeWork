package main.java.lesson9;


import java.util.Random;

public class App {
        public static void main(String[] args) {

            /*
            int[][] matrix = {
                    {23, 45, 12, 37},
                    {50, 11, 42, 20},
                    {33, 27, 19, 48},
                    {8,  39,  6,  4}
            };
            */

             int[][] matrix = new int[4][4];

           Random rand = new Random();



            // 1. Заповнення матриці випадковими числами від 1 до 50
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = rand.nextInt(50) + 1;
                }
            }

            // 2. Виведення матриці
            System.out.println("Матриця 4x4:");
            for (int[] row : matrix) {
                for (int val : row) {
                    System.out.printf("%4d", val);
                }
                System.out.println();
            }

            // 3. Суми парних (0,2) та непарних (1,3) рядків
            int sumEvenRows = 0, sumOddRows = 0;
            for (int i = 0; i < 4; i++) {
                int rowSum = 0;
                for (int j = 0; j < 4; j++) {
                    rowSum += matrix[i][j];
                }
                if (i % 2 == 0) sumEvenRows += rowSum;
                else sumOddRows += rowSum;
            }

            // 4. Добутки елементів у парних (0,2) та непарних (1,3) стовпцях
            long productEvenCols = 1, productOddCols = 1;
            for (int j = 0; j < 4; j++) {
                long colProduct = 1;
                for (int i = 0; i < 4; i++) {
                    colProduct *= matrix[i][j];
                }
                if (j % 2 == 0) productEvenCols *= colProduct;
                else productOddCols *= colProduct;
            }

            // 5. Виведення результатів
            System.out.println("\nСума елементів у парних рядках (0,2): " + sumEvenRows);
            System.out.println("Сума елементів у непарних рядках (1,3): " + sumOddRows);
            System.out.println("Добуток елементів у парних стовпцях (0,2): " + productEvenCols);
            System.out.println("Добуток елементів у непарних стовпцях (1,3): " + productOddCols);

            // 6. Перевірка, чи є матриця магічним квадратом
            boolean isMagic = true;
            int magicSum = 0;

            // сума першого рядка — еталон
            for (int j = 0; j < 4; j++) {
                magicSum += matrix[0][j];
            }

            // перевірка рядків
            for (int i = 1; i < 4; i++) {
                int rowSum = 0;
                for (int j = 0; j < 4; j++) {
                    rowSum += matrix[i][j];
                }
                if (rowSum != magicSum) {
                    isMagic = false;
                    break;
                }
            }

            // перевірка стовпців
            if (isMagic) {
                for (int j = 0; j < 4; j++) {
                    int colSum = 0;
                    for (int i = 0; i < 4; i++) {
                        colSum += matrix[i][j];
                    }
                    if (colSum != magicSum) {
                        isMagic = false;
                        break;
                    }
                }
            }

            // перевірка діагоналей
            if (isMagic) {
                int diag1 = 0, diag2 = 0;
                for (int i = 0; i < 4; i++) {
                    diag1 += matrix[i][i];
                    diag2 += matrix[i][3 - i];
                }
                if (diag1 != magicSum || diag2 != magicSum) {
                    isMagic = false;
                }
            }

            // 7. Результат перевірки
            System.out.println(isMagic ? "Матриця є магічним квадратом." : "Матриця не є магічним квадратом.");
        }
    }

