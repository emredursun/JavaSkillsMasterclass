package com.masterclass.section_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedConverterTest {

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

    /**
     * Test testToMilesPerHour Method
     */
    @Test
    public void testToMilesPerHour_NegativeValue() {
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5));
    }

    @Test
    public void testToMilesPerHour_ZeroValue() {
        assertEquals(0, SpeedConverter.toMilesPerHour(0));
    }

    @Test
    public void testToMilesPerHour_PositiveValue() {
        assertEquals(1, SpeedConverter.toMilesPerHour(1.609));
        assertEquals(62, SpeedConverter.toMilesPerHour(100));
    }

    /**
     * Test printConversion() Method
     */
    @Test
    public void testPrintConversion_NegativeValue() {
        SpeedConverter.printConversion(-5);
        assertEquals("Invalid Value" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintConversion_ZeroValue() {
        SpeedConverter.printConversion(0);
        assertEquals("0.0 km/h = 0 mi/h" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintConversion_PositiveValue() {
        SpeedConverter.printConversion(1.609);
        assertEquals("1.609 km/h = 1 mi/h" + System.lineSeparator(), outContent.toString());

        outContent.reset();
        SpeedConverter.printConversion(100);
        assertEquals("100.0 km/h = 62 mi/h" + System.lineSeparator(), outContent.toString());
    }
}
