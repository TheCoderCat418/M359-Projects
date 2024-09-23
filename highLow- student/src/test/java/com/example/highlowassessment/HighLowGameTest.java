package com.example.highlowassessment;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class HighLowGameTest {

    private HighLowGame game;

    @BeforeEach
    public void setUp() {
        game = new HighLowGame();
    }

    @Test
    public void testComputerGuessWithIncreasedAttempts() {
        int numToGuess = 5;

        // Increase the number of attempts to improve accuracy (e.g., 100 attempts)
        assertTrue(game.computerGuess(numToGuess, 100), "Computer should guess the correct number with 100 attempts");
    }

    @Test
    public void testComputerGuessWithLimitedAttempts() {
        int numToGuess = 5;

        // Testing with only 1 attempt, likely to fail
        assertFalse(game.computerGuess(numToGuess, 1), "Computer should fail with only 1 attempt. If this is your only failed case, you might have just had bad luck. Please run again");
    }

    @Test
    public void testComputerGuessLowestNumber() {
        int numToGuess = 1;
        assertTrue(game.computerGuess(numToGuess, 50), "Computer should guess the number 1 with 50 attempts");
    }

    @Test
    public void testComputerGuessHighestNumber() {
        int numToGuess = 10;
        assertTrue(game.computerGuess(numToGuess, 50), "Computer should guess the number 10 with 50 attempts");
    }

    @Test
    public void testComputerGuessWithZeroAttempts() {
        int numToGuess = 5;
        assertFalse(game.computerGuess(numToGuess, 0), "Computer should fail with 0 attempts");
    }
}

