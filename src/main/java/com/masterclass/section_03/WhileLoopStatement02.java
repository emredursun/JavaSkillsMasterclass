package com.masterclass.section_03;

public class WhileLoopStatement02 {
    public static void main(String[] args) {

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print(number + "_");
        }

    }
}
