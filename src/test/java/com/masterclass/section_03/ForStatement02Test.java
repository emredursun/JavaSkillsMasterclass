package com.masterclass.section_03;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.*;

public class ForStatement02Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Test
    public void testIsPrime() {
        // Test edge cases
        assertFalse(ForStatement02.isPrime(-1));
        assertFalse(ForStatement02.isPrime(0));
        assertFalse(ForStatement02.isPrime(1));
        assertTrue(ForStatement02.isPrime(2));

        // Test prime numbers
        assertTrue(ForStatement02.isPrime(3));
        assertTrue(ForStatement02.isPrime(5));
        assertTrue(ForStatement02.isPrime(7));
        assertTrue(ForStatement02.isPrime(11));

        // Test non-prime numbers
        assertFalse(ForStatement02.isPrime(4));
        assertFalse(ForStatement02.isPrime(6));
        assertFalse(ForStatement02.isPrime(8));
        assertFalse(ForStatement02.isPrime(9));
        assertFalse(ForStatement02.isPrime(10));
    }

    @Test
    public void testMain() {
        ForStatement02.main(new String[]{});

        // Verify the output
        String expectedOutput = "number 11 is a prime number\n" +
                "number 13 is a prime number\n" +
                "number 17 is a prime number\n";
        assertEquals(expectedOutput, systemOutRule.getLogWithNormalizedLineSeparator());
    }
}
