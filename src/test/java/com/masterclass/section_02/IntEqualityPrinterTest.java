package com.masterclass.section_02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntEqualityPrinterTest {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    private static final String ALL_EQUAL_MESSAGE = "All numbers are equal";
    private static final String NEITHER_ALL_EQUAL_MESSAGE = "Neither all are equal or different";
    private static final String ALL_DIFF_MESSAGE = "All numbers are different";
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
    public void testPrintEqual_withNegativeNumbers() {
        // Arrange
        int a = -1, b = 1, c = 1;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(INVALID_VALUE_MESSAGE + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintEqual_withAllEqualNumbers() {
        // Arrange
        int a = 1, b = 1, c = 1;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(ALL_EQUAL_MESSAGE + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintEqual_withTwoEqualNumbers() {
        // Arrange
        int a = 1, b = 1, c = 2;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(NEITHER_ALL_EQUAL_MESSAGE + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintEqual_withAllDifferentNumbers() {
        // Arrange
        int a = 1, b = 2, c = 3;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(ALL_DIFF_MESSAGE + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintEqual_withAnotherTwoEqualNumbers() {
        // Arrange
        int a = 1, b = 2, c = 2;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(NEITHER_ALL_EQUAL_MESSAGE + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintEqual_withYetAnotherTwoEqualNumbers() {
        // Arrange
        int a = 2, b = 1, c = 2;

        // Act
        IntEqualityPrinter.printEqual(a, b, c);

        // Assert
        assertEquals(NEITHER_ALL_EQUAL_MESSAGE + System.lineSeparator(), outContent.toString());
    }
}

