package com.example.codingassessmentafterproject1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void testNeedCoatWinter() {
        // Test needCoat method for Winter
        Temperature temperature = new Temperature();
        assertTrue(temperature.needCoat(30, "winter"));
        assertFalse(temperature.needCoat(50, "winter"));
    }

    @Test
    void testNeedCoatFall() {
        // Test needCoat method for Fall
        Temperature temperature = new Temperature();
        assertTrue(temperature.needCoat(35, "fall"));
        assertFalse(temperature.needCoat(45, "fall"));
    }

    @Test
    void testNeedCoatSpring() {
        // Test needCoat method for Spring
        Temperature temperature = new Temperature();
        assertTrue(temperature.needCoat(50, "spring"));
        assertFalse(temperature.needCoat(60, "spring"));
    }

    @Test
    void testNeedCoatSummer() {
        // Test needCoat method for Summer
        Temperature temperature = new Temperature();
        assertTrue(temperature.needCoat(50, "summer"));
        assertFalse(temperature.needCoat(60, "summer"));
    }

}