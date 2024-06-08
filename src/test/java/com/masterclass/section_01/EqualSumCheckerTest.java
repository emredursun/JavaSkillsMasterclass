package com.masterclass.section_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EqualSumCheckerTest {

    @Test
    void testEqualSum() {
        assertTrue(EqualSumChecker.hasEqualSum(1, 1, 2));
        assertTrue(EqualSumChecker.hasEqualSum(-1, -1, -2));
        assertTrue(EqualSumChecker.hasEqualSum(0, 0, 0));
        assertTrue(EqualSumChecker.hasEqualSum(2, -1, 1));
        assertTrue(EqualSumChecker.hasEqualSum(Integer.MAX_VALUE, -1, Integer.MAX_VALUE - 1));
    }

    @Test
    void testNotEqualSum() {
        assertFalse(EqualSumChecker.hasEqualSum(1, 1, 3));
        assertFalse(EqualSumChecker.hasEqualSum(-1, -1, -3));
        assertFalse(EqualSumChecker.hasEqualSum(2, -1, 0));
        assertFalse(EqualSumChecker.hasEqualSum(Integer.MAX_VALUE, 1, Integer.MAX_VALUE + 2));
    }

    @Test
    void testEdgeCases() {
        assertTrue(EqualSumChecker.hasEqualSum(Integer.MIN_VALUE, Integer.MAX_VALUE, -1));
        assertFalse(EqualSumChecker.hasEqualSum(Integer.MIN_VALUE, Integer.MAX_VALUE, 0));
        assertTrue(EqualSumChecker.hasEqualSum(Integer.MIN_VALUE, 0, Integer.MIN_VALUE));
        assertTrue(EqualSumChecker.hasEqualSum(Integer.MIN_VALUE, 1, Integer.MIN_VALUE + 1));
    }
}

