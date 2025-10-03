public class Main {
    public static void main(String[] args) {
        // Дані для товару 1
        String product1 = "smartphone";
        int days1 = 5;
        double totalSales1 = 12153.41;
        double dailySales1 = totalSales1 / days1;

        // Дані для товару 2
        String product2 = "laptop";
        int days2 = 7;
        double totalSales2 = 10486.85;
        double dailySales2 = totalSales2 / days2;

        // Вивід результатів у консоль
        System.out.printf("Product No 1: %s,%n", product1);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days1, totalSales1);
        System.out.printf("sales by day is EUR %.2f.%n", dailySales1);

        System.out.printf("Product No 2: %s,%n", product2);
        System.out.printf("total sales for %d days is EUR %.2f,%n", days2, totalSales2);
        System.out.printf("sales by day is EUR %.2f.%n", dailySales2);
    }
}