package com.masterclass.coding_exercises;

public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative input
        }

        int lastDigit = number % 10; // Get the last digit
        int firstDigit = number;

        while (firstDigit >= 10) {
            firstDigit /= 10; // Remove the last digit until only the first digit remains
        }

        return firstDigit + lastDigit; // Return the sum of the first and last digits
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252)); // Output: 4
        System.out.println(sumFirstAndLastDigit(257)); // Output: 9
        System.out.println(sumFirstAndLastDigit(0));   // Output: 0
        System.out.println(sumFirstAndLastDigit(5));   // Output: 10
        System.out.println(sumFirstAndLastDigit(-10)); // Output: -1
    }
}

