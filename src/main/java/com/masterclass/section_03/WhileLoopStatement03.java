package com.masterclass.section_03;

public class WhileLoopStatement03 {

    public static void main(String[] args) {
        printOutEvenNumbers(5, 20);
    }

    public static void printOutEvenNumbers(int startNumber, int endNumber) {
        if (startNumber < 0 || startNumber > endNumber) {
            System.out.println("Invalid input! Please enter a valid range.");
            return;
        }

        int sumEvenNumbers = 0;
        for (int i = startNumber; i <= endNumber; i++) {
            if (isEvenNumber(i)) {
                System.out.print(i + "_");
                sumEvenNumbers += i;
            }
        }
        System.out.println("\n--------------------------------");
        System.out.println("Sum of even numbers: " + sumEvenNumbers);
    }

    public static boolean isEvenNumber(int number) {
        return (number > 0) && (number % 2 == 0);
    }

}
