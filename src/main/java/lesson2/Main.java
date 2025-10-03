package main.java.lesson2;
/*
// 1 рішення
public class Main {
    public static void main(String[] args) {
        // Дані першого замовлення
        int orderNo1 = 1;
        String client1 = "Alice";
        String product1 = "smartphone";
        double price1 = 305.99;
        String address1 = "Moon Street, 10";

        // Дані другого замовлення
        int orderNo2 = 2;
        String client2 = "Tom";
        String product2 = "laptop";
        double price2 = 570.95;
        String address2 = "Terra Street, 17";

        // Вивід у консоль
        System.out.println("Order No " + orderNo1 + " Client: " + client1 + ".");
        System.out.println("Product: " + product1 + ",");
        System.out.println("price EUR " + price1 + ".");
        System.out.println("Address: " + address1 + ".");
        System.out.println();

        System.out.println("Order No " + orderNo2 + " Client: " + client2 + ".");
        System.out.println("Product: " + product2 + ",");
        System.out.println("price EUR " + price2 + ".");
        System.out.println("Address: " + address2 + ".");
    }
}
*/

/*
// 2 варіант, з перевикорастанням змінних
public class Main {
    public static void main(String[] args) {
        // Дані першого замовлення
        int orderNo = 1;
        String client = "Alice";
        String product = "smartphone";
        double price = 305.99;
        String address = "Moon Street, 10";
 // Вивід у консоль першого замовлення
        System.out.println("Order No " + orderNo + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");
        System.out.println();

        // Дані другого замовлення
        orderNo = 2;
        client = "Tom";
        product = "laptop";
        price = 570.95;
        address = "Terra Street, 17";

        // Вивід у консоль другого замовлення
        System.out.println("Order No " + orderNo + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");
        System.out.println();
    }
}

*/

// 3 варіант з використанням функцій
class Order {
    private int orderNo;
    private String client;
    private String product;
    private double price;
    private String address;

    // Набір елементів
    public Order(int orderNo, String client, String product, double price, String address) {
        this.orderNo = orderNo;
        this.client = client;
        this.product = product;
        this.price = price;
        this.address = address;
    }

    // Метод для виведення замовлення
    public void printOrder() {
        System.out.println("Order No " + orderNo + " Client: " + client + ".");
        System.out.println("Product: " + product + ",");
        System.out.println("price EUR " + price + ".");
        System.out.println("Address: " + address + ".");
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Створюємо замовлення
        Order order1 = new Order(1, "Alice", "smartphone", 305.99, "Moon Street, 10");
        Order order2 = new Order(2, "Tom", "laptop", 570.95, "Terra Street, 17");

        // Вивід замовлення
        order1.printOrder();
        order2.printOrder();
    }
}

