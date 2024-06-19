package com.masterclass.section_02;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayingCatTest {

    @Test
    public void testIsCatPlaying_Summer_WithinRange() {
        assertTrue(PlayingCat.isCatPlaying(true, 30));
        assertTrue(PlayingCat.isCatPlaying(true, 45));
        assertTrue(PlayingCat.isCatPlaying(true, 25));
    }

    @Test
    public void testIsCatPlaying_Summer_OutOfRange() {
        assertFalse(PlayingCat.isCatPlaying(true, 46));
        assertFalse(PlayingCat.isCatPlaying(true, 24));
    }

    @Test
    public void testIsCatPlaying_NotSummer_WithinRange() {
        assertTrue(PlayingCat.isCatPlaying(false, 30));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
        assertTrue(PlayingCat.isCatPlaying(false, 25));
    }

    @Test
    public void testIsCatPlaying_NotSummer_OutOfRange() {
        assertFalse(PlayingCat.isCatPlaying(false, 36));
        assertFalse(PlayingCat.isCatPlaying(false, 24));
    }

    @Test
    public void testIsCatPlaying_BoundaryValues() {
        assertTrue(PlayingCat.isCatPlaying(true, 25));
        assertTrue(PlayingCat.isCatPlaying(true, 45));
        assertTrue(PlayingCat.isCatPlaying(false, 25));
        assertTrue(PlayingCat.isCatPlaying(false, 35));
        assertFalse(PlayingCat.isCatPlaying(true, 46));
        assertFalse(PlayingCat.isCatPlaying(false, 36));
    }
}
