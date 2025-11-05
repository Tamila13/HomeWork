package main.java.lesson13;

public class Main {
    public static void main(String[] args) {
        // Створюємо масив фігур
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(4, 3);
        Square square = new Square(6);

        Shape[] shapes = {circle, triangle, square};

        // Обчислюємо та виводимо сумарну площу
        System.out.println("Результати");
        System.out.printf("Площа кола: %.2f", circle.getArea());
        System.out.println();
        System.out.printf("Площа трикутника: %.2f", triangle.getArea());
        System.out.println();
        System.out.printf("Площа квадрата: %.2f", square.getArea());
        System.out.println();
        System.out.println("-------------------");
        double totalArea = calculateTotalArea(shapes);
        System.out.printf("Сумарна площа всіх фігур: %.2f", totalArea);
    }

    // Метод для обчислення сумарної площі
    public static double calculateTotalArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getArea();
        }
        return sum;
    }
}
