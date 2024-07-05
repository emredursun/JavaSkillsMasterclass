package com.masterclass.coding_exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberPalindromeTest {

    @Test
    public void testIsPalindrome_positiveNumber() {
        assertTrue(NumberPalindrome.isPalindrome(121));
    }

    @Test
    public void testIsPalindrome_negativeNumber() {
        assertTrue(NumberPalindrome.isPalindrome(-121));
    }

    @Test
    public void testIsPalindrome_zero() {
        assertTrue(NumberPalindrome.isPalindrome(0));
    }

    @Test
    public void testIsPalindrome_singleDigit() {
        assertTrue(NumberPalindrome.isPalindrome(7));
    }

    @Test
    public void testIsPalindrome_nonPalindrome() {
        assertFalse(NumberPalindrome.isPalindrome(123));
    }
}
