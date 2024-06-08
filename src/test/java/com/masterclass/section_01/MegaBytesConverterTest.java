package com.masterclass.section_01;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MegaBytesConverterTest {

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
    public void testPrintMegaBytesAndKiloBytes_NegativeValue() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1);
        assertEquals("Invalid Value" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintMegaBytesAndKiloBytes_ZeroValue() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(0);
        assertEquals("0 KB = 0 MB and 0 KB" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintMegaBytesAndKiloBytes_ExactMB() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2048);
        assertEquals("2048 KB = 2 MB and 0 KB" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintMegaBytesAndKiloBytes_LessThanMB() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(500);
        assertEquals("500 KB = 0 MB and 500 KB" + System.lineSeparator(), outContent.toString());
    }

    @Test
    public void testPrintMegaBytesAndKiloBytes_MoreThanMB() {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        assertEquals("2500 KB = 2 MB and 452 KB" + System.lineSeparator(), outContent.toString());
    }
}
