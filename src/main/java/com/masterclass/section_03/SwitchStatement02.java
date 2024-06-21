package com.masterclass.section_03;

public class SwitchStatement02 {

    private static final String str = "th month is ";

    public static void main(String[] args) {

        int switchValue = 7;
        System.out.println(switchValue + str + getMonthName(switchValue));

    }

    public static String getMonthName(int value) {
        return switch (value) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number entered!";
        };
    }

}
