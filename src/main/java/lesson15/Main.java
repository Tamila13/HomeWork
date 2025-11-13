package main.java.lesson15;

public class Main {
    public static void main(String[] args) {
        WeekAdviser adviser = new WeekAdviser();

        // Приклади викликів
        adviser.advise(Day.MONDAY);
        adviser.advise(Day.TUESDAY);
        adviser.advise(Day.WEDNESDAY);
        adviser.advise(Day.THURSDAY);
        adviser.advise(Day.FRIDAY);
        adviser.advise(Day.SATURDAY);
        adviser.advise(Day.SUNDAY);
    }
}
