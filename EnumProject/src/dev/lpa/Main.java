package dev.lpa;

import dev.lpa.dev.lpa.DaysOfTheWeek;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        DaysOfTheWeek weekDay = DaysOfTheWeek.TUES;
        System.out.println(weekDay);

            for (int i = 0; i < 10; i++) {
                weekDay = getRandomDay();
//                System.out.printf("Name is %s, Ordinal Value = %d%n", weekDay.name(), weekDay.ordinal());
//
//                if(weekDay == DaysOfTheWeek.FRI){
//                    System.out.println("Friday found");
//                }

        switchDayOfTheWeek(weekDay);

            }

    }

    public static DaysOfTheWeek getRandomDay(){

        int randomInteger = new Random().nextInt(7);
        var allDays = DaysOfTheWeek.values();

        return allDays[randomInteger];
    }

    public static void switchDayOfTheWeek(DaysOfTheWeek weekDay){
        int weekDayInteger = weekDay.ordinal() +1;

        switch (weekDay) {
            case WED -> System.out.println("wednesday is day " + weekDayInteger);
            case SAT -> System.out.println("saturday is day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase() + "day is Day " + weekDayInteger);
        }
    }


}
