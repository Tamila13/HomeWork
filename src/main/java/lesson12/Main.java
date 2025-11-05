package main.java.lesson12;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Іванов Іван Сергійович", "Розробник", "ivanov@test.com", "+380934832263", 30);

        System.out.println("ПІБ: " + employee1.getFullName());
        System.out.println("Посада: " + employee1.getPosition());
        System.out.println("Email: " + employee1.getEmail());
        System.out.println("Телефон: " + employee1.getPhone());
        System.out.println("Вік: " + employee1.getAge());
        System.out.println("--------");
        employee1.setPosition("Старший розробник");
        System.out.println("Нова посада: " + employee1.getPosition());
        System.out.println("--------");


        Car simpleCar = new Car("Mitsubishi Outlander", "Сірий", 2014);
        Car tesla = new ElectricCar("Tesla Model S", "Біла", 2023, 53);
        Car tavron = new DieselCar("Nissan Qashqai", "Синій", 2018, true);


        simpleCar.start();
        System.out.println("--------");
        tesla.start();
        System.out.println("--------");
        tavron.start();
        System.out.println("\nСпроба завести автомобіль, що вже працює ---");
        tavron.start();
    }
}
