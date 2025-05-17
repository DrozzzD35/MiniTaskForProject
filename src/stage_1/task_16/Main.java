package stage_1.task_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        Day day1 = Day.SATURDAY;
        Day day2 = Day.TUESDAY;
        Day day3 = Day.SUNDAY;


        weekDay(day);
        weekDay(day1);
        weekDay(day2);
        weekDay(day3);
    }

    public static void weekDay(Day day) {
        if (day.isWeekend(day)) {
            System.out.println("Выходной");
        } else {
            System.out.println("Рабочий день");
        }
    }


}
