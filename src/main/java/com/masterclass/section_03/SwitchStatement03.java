package com.masterclass.section_03;

public class SwitchStatement03 {

    public static void main(String[] args) {

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);


    }

    public static void printDayOfWeek(int numOfDay) {
        String dayOfWeek = switch (numOfDay) {
            case 0 -> { yield  "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(numOfDay + " stands for " + dayOfWeek);
    }
}
