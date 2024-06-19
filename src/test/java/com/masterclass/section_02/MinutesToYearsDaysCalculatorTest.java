package com.masterclass.section_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinutesToYearsDaysCalculatorTest {

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
    public void testPrintYearsAndDays_withNegativeMinutes() {
        // Arrange
        long minutes = -1;

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("Invalid Value" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withZeroMinutes() {
        // Arrange
        long minutes = 0;

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("0 min = 0 y and 0 d" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withMinutesLessThanOneDay() {
        // Arrange
        long minutes = 1440; // 1 day

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("1440 min = 0 y and 1 d" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withMinutesLessThanOneYear() {
        // Arrange
        long minutes = 525600; // 1 year

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("525600 min = 1 y and 0 d" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withMinutesMoreThanOneYear() {
        // Arrange
        long minutes = 527040; // 1 year and 1 day

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("527040 min = 1 y and 1 d" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withMultipleYearsAndDays() {
        // Arrange
        long minutes = 1051200; // 2 years

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("1051200 min = 2 y and 0 d" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintYearsAndDays_withComplexMinutes() {
        // Arrange
        long minutes = 561600; // 1 year and 30 days

        // Act
        MinutesToYearsDaysCalculator.printYearsAndDays(minutes);

        // Assert
        assertEquals("561600 min = 1 y and 25 d" + System.lineSeparator(), outContent.toString());
    }
}
