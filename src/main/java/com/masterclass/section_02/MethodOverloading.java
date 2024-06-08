package com.masterclass.section_02;

public class MethodOverloading {

    public static void main(String[] args) {


        System.out.println("New score is " + calculateScore());
        System.out.println("New score is " + calculateScore(10));
        System.out.println("New score is " + calculateScore("Tim", 500));

        calculateScore();
        calculateScore(75);
        calculateScore("Emre", 100);
    }

    public static int calculateScore() {
        return calculateScore(0);
//        System.out.println("No player name, np player score.");
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

}
