package main.java.lesson11;

public class Person   {
    // Поля класу
    private String name;
    private int age;
    private String profession;

    // Конструктор
    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    // Метод для виведення інформації
    public void displayInfo() {
        System.out.println("Ім'я: " + name + ", Вік: " + age + ", Професія: " + profession);
    }

    // Метод для зміни професії
    public void setProfession(String newProfession) {
        this.profession = newProfession;
    }


    public static void main(String[] args) {
        // Створюємо три об’єкти класу Person
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        Person person4 = new Person("Alice", 28, "Архітектор");

        // Виводимо інформацію про всіх осіб
        System.out.println("Початкова інформація:");
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();

        System.out.println();
        person4.displayInfo();
        // Змінюємо професію однієї особи

        person4.setProfession("Дизайнер");

        // Виводимо оновлену інформацію

        System.out.println("Після зміни професії:");
        person4.displayInfo();
    }
}