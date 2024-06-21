package com.masterclass.section_03;

public class SwitchStatement03 {

    public static void main(String[] args) {

        int numOfDay = 0;
        printDayOfWeek(numOfDay);
        numOfDay = 7;
        printDayOfWeek(numOfDay);

    }

    public static void printDayOfWeek(int numOfDay) {
        switch (numOfDay) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day of week");
        }
    }
}
