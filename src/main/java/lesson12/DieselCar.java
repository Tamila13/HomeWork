package main.java.lesson12;

public class DieselCar extends Car{
    private boolean hasTurbo; // Власне поле

    public DieselCar(String model, String color, int year, boolean hasTurbo) {
        super(model, color, year);
        this.hasTurbo = hasTurbo;
    }

    private void preheatGlowPlugs() {
        System.out.println("2. Додатковий крок: Прогрів свічок розжарення...");
    }

    @Override
    protected void startCommand() {
        preheatGlowPlugs();
        System.out.println("3. Перевірка дизельних систем...");
    }

    @Override
    protected void startFuelSystem() {
        System.out.println("4. Подача дизельного палива під високим тиском...");
    }
}
