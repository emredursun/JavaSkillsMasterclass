package com.masterclass.section_01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecimalComparatorTest {

    @Test
    void testEqualByThreeDecimalPlaces() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.175));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.1757));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.175));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(0.0, 0.0));
    }

    @Test
    void testNotEqualByThreeDecimalPlaces() {
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.174));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.176));
        assertFalse(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, -3.175));
    }

    @Test
    void testEdgeCases() {
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.1750));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(3.000, 3.0000));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(123456.789, 123456.7891));
        assertTrue(DecimalComparator.areEqualByThreeDecimalPlaces(123456.789, 123456.7892));
    }
}

