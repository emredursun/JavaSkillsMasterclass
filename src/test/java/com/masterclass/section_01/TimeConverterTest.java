package com.masterclass.section_01;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TimeConverterTest {

    @Test
    void testGetDurationStringSecondsOnly() {
        assertEquals("1h 5m 45s", TimeConverter.getDurationString(3945));
        assertEquals("0h 0m 30s", TimeConverter.getDurationString(30));
        assertEquals("0h 1m 0s", TimeConverter.getDurationString(60));
        assertEquals("Invalid value", TimeConverter.getDurationString(-1));
    }

    @Test
    void testGetDurationStringMinutesAndSeconds() {
        assertEquals("2h 5m 30s", TimeConverter.getDurationString(125, 30));
        assertEquals("0h 45m 30s", TimeConverter.getDurationString(45, 30));
        assertEquals("0h 0m 0s", TimeConverter.getDurationString(0, 0));
        assertEquals("Invalid value", TimeConverter.getDurationString(-5, 30));
        assertEquals("Invalid value", TimeConverter.getDurationString(45, 70));
        assertEquals("Invalid value", TimeConverter.getDurationString(45, -1));
    }

    @Test
    void testEdgeCases() {
        assertEquals("1h 0m 0s", TimeConverter.getDurationString(3600));
        assertEquals("0h 1m 59s", TimeConverter.getDurationString(119));
        assertEquals("0h 0m 59s", TimeConverter.getDurationString(0, 59));
        assertEquals("0h 1m 0s", TimeConverter.getDurationString(1, 0));
    }
}
