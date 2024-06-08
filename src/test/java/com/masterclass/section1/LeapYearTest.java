package com.masterclass.section1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LeapYearTest {

    @Test
    void testYearLessThanOne() {
        assertFalse(LeapYear.isLeapYear(0));
        assertFalse(LeapYear.isLeapYear(-100));
    }

    @Test
    void testYearGreaterThan9999() {
        assertFalse(LeapYear.isLeapYear(10000));
        assertFalse(LeapYear.isLeapYear(10001));
    }

    @Test
    void testTypicalLeapYear() {
        assertTrue(LeapYear.isLeapYear(2020));
        assertTrue(LeapYear.isLeapYear(2000));
    }

    @Test
    void testNonLeapYear() {
        assertFalse(LeapYear.isLeapYear(2019));
        assertFalse(LeapYear.isLeapYear(2100));
    }

    @Test
    void testEdgeCases() {
        assertFalse(LeapYear.isLeapYear(1));
        assertFalse(LeapYear.isLeapYear(9999));
        assertFalse(LeapYear.isLeapYear(100));
    }

    @Test
    void testYearsDivisibleBy4ButNotBy100() {
        assertTrue(LeapYear.isLeapYear(1996));
        assertTrue(LeapYear.isLeapYear(1604));
    }

    @Test
    void testYearsDivisibleBy100ButNotBy400() {
        assertFalse(LeapYear.isLeapYear(1700));
        assertFalse(LeapYear.isLeapYear(1800));
    }

    @Test
    void testYearsDivisibleBy400() {
        assertTrue(LeapYear.isLeapYear(1600));
        assertTrue(LeapYear.isLeapYear(2000));
    }
}

