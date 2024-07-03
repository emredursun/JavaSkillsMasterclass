package com.masterclass.section_03;

public class WhileLoopStatement01 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        int z = 1;
        while (true) {
            if (z > 5){
                break;
            }
            System.out.println(z);
            z++;
        }

        int k = 1;
        boolean isReady = false;
        do {
            if (k > 5){
                break;
            }
            System.out.println(k);
            k++;
            isReady = (j > 0);
        }while (isReady);
    }
}
