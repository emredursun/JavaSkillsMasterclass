package com.masterclass.section1;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        return (long) (first * 1000) == (long) (second * 1000);
//        return Math.round(first * 1000) == Math.round(second * 1000);

    }
}
