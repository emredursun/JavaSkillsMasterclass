package com.masterclass.section_01;

public class GameChallenge {
    public static void main(String[] args) {


        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200);

        int highScore = calculateHighScorePosition(1500);
        displayScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(1000);
        displayScorePosition("Bob", highScore);

        highScore = calculateHighScorePosition(500);
        displayScorePosition("Percy", highScore);

        highScore = calculateHighScorePosition(100);
        displayScorePosition("Gilbert", highScore);

        highScore = calculateHighScorePosition(25);
        displayScorePosition("James", highScore);

    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}
