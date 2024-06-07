package com.masterclass.section1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BarkingDogTest {

    @Test
    public void testShouldWakeUp_BarkingBefore8AM() {
        assertTrue(BarkingDog.shouldWakeUp(true, 7));
    }

    @Test
    public void testShouldWakeUp_BarkingAt8AM() {
        assertFalse(BarkingDog.shouldWakeUp(true, 8));
    }

    @Test
    public void testShouldWakeUp_BarkingBetween8AMAnd10PM() {
        assertFalse(BarkingDog.shouldWakeUp(true, 15));
    }

    @Test
    public void testShouldWakeUp_BarkingAt10PM() {
        assertFalse(BarkingDog.shouldWakeUp(true, 22));
    }

    @Test
    public void testShouldWakeUp_BarkingAfter10PM() {
        assertTrue(BarkingDog.shouldWakeUp(true, 23));
    }

    @Test
    public void testShouldWakeUp_NotBarking() {
        assertFalse(BarkingDog.shouldWakeUp(false, 7));
        assertFalse(BarkingDog.shouldWakeUp(false, 15));
        assertFalse(BarkingDog.shouldWakeUp(false, 23));
    }

    @Test
    public void testShouldWakeUp_InvalidHourNegative() {
        assertFalse(BarkingDog.shouldWakeUp(true, -1));
    }

    @Test
    public void testShouldWakeUp_InvalidHourTooHigh() {
        assertFalse(BarkingDog.shouldWakeUp(true, 24));
    }
}
