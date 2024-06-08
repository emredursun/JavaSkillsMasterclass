package com.masterclass.section1;

public class TeenNumberChecker {
    private static final int TEEN_START = 13;
    private static final int TEEN_END = 19;

    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int number) {
        return number >= TEEN_START && number <= TEEN_END;
    }
}

