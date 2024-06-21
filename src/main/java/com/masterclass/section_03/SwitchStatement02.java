package com.masterclass.section_03;

public class SwitchStatement02 {

    private static final String str = "Value was ";

    public static void main(String[] args) {

        int switchValue = 7;
        System.out.println(str + getValue(switchValue));

    }

    public static int getValue(int value) {
        return switch (value) {
            case 1 -> 1;
            case 2 -> 2;
            case 3 -> 3;
            case 4 -> 4;
            case 5 -> 5;
            default -> 0;
        };
    }

}
