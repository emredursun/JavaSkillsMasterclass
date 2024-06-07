package com.masterclass.section1;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SpeedConverterTest {

    @Test
    public void testToMilesPerHour_Negative() {
        assertEquals(-1, SpeedConverter.toMilesPerHour(-5.0));
    }

    @Test
    public void testToMilesPerHour_Zero() {
        assertEquals(0, SpeedConverter.toMilesPerHour(0.0));
    }

    @Test
    public void testToMilesPerHour_Positive() {
        assertEquals(1, SpeedConverter.toMilesPerHour(1.609));
        assertEquals(62, SpeedConverter.toMilesPerHour(100.0));
    }

    @Test
    public void testPrintConversion_Negative() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SpeedConverter.printConversion(-5.0);
        assertEquals("Invalid Value\n", outContent.toString());
        System.setOut(null); // Reset the standard output
    }

    @Test
    public void testPrintConversion_Zero() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SpeedConverter.printConversion(0.0);
        assertEquals("0.0 km/h = 0 mi/h\n", outContent.toString());
        System.setOut(null); // Reset the standard output
    }

    @Test
    public void testPrintConversion_Positive() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        SpeedConverter.printConversion(1.609);
        assertEquals("1.609 km/h = 1 mi/h\n", outContent.toString());

        outContent.reset();
        SpeedConverter.printConversion(100.0);
        assertEquals("100.0 km/h = 62 mi/h\n", outContent.toString());
        System.setOut(null); // Reset the standard output
    }
}
