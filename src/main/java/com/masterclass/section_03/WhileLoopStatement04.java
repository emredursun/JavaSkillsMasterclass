package com.masterclass.section_03;

public class WhileLoopStatement04 {

    public static void main(String[] args) {
        printOutEvenNumbers(5, 20);
    }

    public static void printOutEvenNumbers(int startNumber, int endNumber) {
        if (startNumber < 0 || startNumber > endNumber) {
            System.out.println("Invalid input! Please enter a valid range.");
            return;
        }

        int evenCount = 0;
        int oddCount = 0;
        int sumEvenNumbers = 0;
        while (startNumber <= endNumber) {
            if (!isEvenNumber(startNumber)) {
                oddCount++;
            } else {
                System.out.println("Even number: " + startNumber);
                sumEvenNumbers += startNumber;
                evenCount++;
//                if (evenCount >= 5) {
//                    break;
//                }
            }
            startNumber++;
        }

        System.out.println("--------------------------------");
        System.out.println("Sum of even numbers: " + sumEvenNumbers);
        System.out.println("Total even numbers found = " + evenCount);
        System.out.println("Total odd numbers found = " + oddCount);
        System.out.println("--------------------------------");
    }

    public static boolean isEvenNumber(int number) {
        return (number > 0) && (number % 2 == 0);
    }

}
