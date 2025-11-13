package main.java.lesson15;

import java.time.DayOfWeek;

class WeekAdviser implements Adviser {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(day.getUkrainianName() + ":");
                System.out.println("Порада: складіть план завдань на день і не забувайте робити короткі перерви — це підвищить продуктивність!");
                break;
            case FRIDAY:
                System.out.println(day.getUkrainianName() + ":");
                System.out.println("Happy Friday! Підведіть підсумки тижня і завершіть робочі справи з гарним настроєм!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(day.getUkrainianName() + ":");
                System.out.println("Вихідні! Рекомендація: відвідайте парк, кінотеатр або проведіть день з друзями та родиною.");
                break;
            default:
                System.out.println("Невідомий день тижня.");
        }
    }
}
