package com.masterclass.section_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeenNumberCheckerTest {

    @Test
    void testHasTeenWithAllTeens() {
        assertTrue(TeenNumberChecker.hasTeen(13, 14, 15));
    }

    @Test
    void testHasTeenWithOneTeen() {
        assertTrue(TeenNumberChecker.hasTeen(12, 14, 20));
        assertTrue(TeenNumberChecker.hasTeen(21, 18, 22));
        assertTrue(TeenNumberChecker.hasTeen(25, 29, 13));
    }

    @Test
    void testHasTeenWithNoTeens() {
        assertFalse(TeenNumberChecker.hasTeen(12, 22, 30));
        assertFalse(TeenNumberChecker.hasTeen(1, 2, 3));
    }

    @Test
    void testIsTeenWithinRange() {
        assertTrue(TeenNumberChecker.isTeen(13));
        assertTrue(TeenNumberChecker.isTeen(19));
        assertTrue(TeenNumberChecker.isTeen(15));
    }

    @Test
    void testIsTeenOutsideRange() {
        assertFalse(TeenNumberChecker.isTeen(12));
        assertFalse(TeenNumberChecker.isTeen(20));
        assertFalse(TeenNumberChecker.isTeen(22));
    }

    @Test
    void testBoundaryConditions() {
        assertTrue(TeenNumberChecker.isTeen(13)); // Lower boundary
        assertTrue(TeenNumberChecker.isTeen(19)); // Upper boundary
        assertFalse(TeenNumberChecker.isTeen(12)); // Just below the lower boundary
        assertFalse(TeenNumberChecker.isTeen(20)); // Just above the upper boundary
    }
}

