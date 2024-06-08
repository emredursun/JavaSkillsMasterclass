package com.masterclass.section_01;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameChallengeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testCalculateScore_GameOverTrue() {
        GameChallenge.calculateScore(true, 800, 5, 100);
        assertEquals("Your final score was 2300" + System.lineSeparator(), outContent.toString());

        outContent.reset();

        GameChallenge.calculateScore(true, 10000, 8, 200);
        assertEquals("Your final score was 12600" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testCalculateScore_GameOverFalse() {
        GameChallenge.calculateScore(false, 800, 5, 100);
        assertEquals("", outContent.toString());
    }

    @Test
    public void testDisplayScorePosition() {
        GameChallenge.displayScorePosition("Tim", 1);
        assertEquals("Tim managed to get into position 1 on the high score list." + System.lineSeparator(), outContent.toString());

        outContent.reset();

        GameChallenge.displayScorePosition("Bob", 2);
        assertEquals("Bob managed to get into position 2 on the high score list." + System.lineSeparator(), outContent.toString());

        outContent.reset();

        GameChallenge.displayScorePosition("Percy", 3);
        assertEquals("Percy managed to get into position 3 on the high score list." + System.lineSeparator(), outContent.toString());

        outContent.reset();

        GameChallenge.displayScorePosition("Gilbert", 4);
        assertEquals("Gilbert managed to get into position 4 on the high score list." + System.lineSeparator(), outContent.toString());

        outContent.reset();

        GameChallenge.displayScorePosition("James", 4);
        assertEquals("James managed to get into position 4 on the high score list." + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testCalculateHighScorePosition() {
        assertEquals(1, GameChallenge.calculateHighScorePosition(1500));
        assertEquals(1, GameChallenge.calculateHighScorePosition(1000));
        assertEquals(2, GameChallenge.calculateHighScorePosition(500));
        assertEquals(3, GameChallenge.calculateHighScorePosition(100));
        assertEquals(4, GameChallenge.calculateHighScorePosition(25));
    }
}
