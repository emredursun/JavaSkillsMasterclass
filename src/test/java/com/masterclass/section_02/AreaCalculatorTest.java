package com.masterclass.section_02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {

    @Test
    void testAreaWithRadius() {
        assertEquals(Math.PI, AreaCalculator.area(1));
        assertEquals(4 * Math.PI, AreaCalculator.area(2));
        assertEquals(0, AreaCalculator.area(0));
        assertEquals(-1, AreaCalculator.area(-1));
    }

    @Test
    void testAreaWithTwoParameters() {
        assertEquals(20, AreaCalculator.area(4, 5));
        assertEquals(0, AreaCalculator.area(0, 5));
        assertEquals(0, AreaCalculator.area(4, 0));
        assertEquals(-1, AreaCalculator.area(-1, 5));
        assertEquals(-1, AreaCalculator.area(4, -5));
        assertEquals(-1, AreaCalculator.area(-4, -5));
    }

    @Test
    void testAreaWithZeroValues() {
        assertEquals(0, AreaCalculator.area(0, 0));
    }

    @Test
    void testAreaWithLargeValues() {
        assertEquals(1e12, AreaCalculator.area(1e6, 1e6));
        assertEquals(1e12 * Math.PI, AreaCalculator.area(1e6));
    }

    @Test
    void testAreaWithBoundaryValues() {
        assertEquals(-1, AreaCalculator.area(Double.NEGATIVE_INFINITY));
        assertEquals(Double.POSITIVE_INFINITY, AreaCalculator.area(Double.POSITIVE_INFINITY, 5));
        assertEquals(Double.POSITIVE_INFINITY, AreaCalculator.area(5, Double.POSITIVE_INFINITY));
        assertEquals(Double.POSITIVE_INFINITY, AreaCalculator.area(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));
    }
}
