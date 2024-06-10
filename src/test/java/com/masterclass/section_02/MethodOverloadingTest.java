package com.masterclass.section_02;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MethodOverloadingTest {

    @Test
    void testCalculateScoreNoParams() {
        assertEquals(0, MethodOverloading.calculateScore());
    }

    @Test
    void testCalculateScoreWithScore() {
        assertEquals(10000, MethodOverloading.calculateScore(10));
        assertEquals(0, MethodOverloading.calculateScore(0));
        assertEquals(-10000, MethodOverloading.calculateScore(-10));
    }

    @Test
    void testCalculateScoreWithPlayerNameAndScore() {
        assertEquals(500000, MethodOverloading.calculateScore("Tim", 500));
        assertEquals(0, MethodOverloading.calculateScore("Alex", 0));
        assertEquals(-100000, MethodOverloading.calculateScore("Chris", -100));
    }

    @Test
    void testCalculateScoreOutput() {
        // Capture the output to validate the print statements
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        MethodOverloading.calculateScore("Emre", 100);
        assertTrue(outContent.toString().contains("Player Emre scored 100 points"));

        // Reset the standard output
        System.setOut(System.out);
    }
}
