package com.masterclass.coding_exercises;

public class SharedDigit {

    public static boolean hasSharedDigit(int first, int second) {

        boolean firstValid = first > 9 && first < 100;
        boolean secondValid = second > 9 && second < 100;

        if (!firstValid || !secondValid) {
            return false;
        }

        int firstLeftDigit = first / 10;
        int firstRightDigit = first % 10;
        int secondLeftDigit = second / 10;
        int secondRightDigit = second % 10;

        boolean firstShared = firstLeftDigit == secondLeftDigit || firstLeftDigit == secondRightDigit;
        boolean secondShared = firstRightDigit == secondLeftDigit || firstRightDigit == secondRightDigit;

        return firstShared || secondShared;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // should return true
        System.out.println(hasSharedDigit(9, 99));  // should return false
        System.out.println(hasSharedDigit(15, 55)); // should return true
        System.out.println(hasSharedDigit(15, 62));  // should return false
    }
}

