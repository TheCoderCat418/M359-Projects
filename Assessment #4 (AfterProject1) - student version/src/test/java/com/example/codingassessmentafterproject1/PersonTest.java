package com.example.codingassessmentafterproject1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testPersonInitialization() {
        // Test Person initialization and getters
        Person person = new Person("Alice", "winter");
        assertEquals("Alice", person.getName());
        assertEquals("winter", person.getFavoriteSeason());
        assertNull(person.getCoat());  // Initially, coat is null
    }

    @Test
    void testSetCoat() {
        // Test setting the coat
        Person person = new Person("Alice", "winter");
        person.setCoat(true);
        assertTrue(person.getCoat());

        person.setCoat(false);
        assertFalse(person.getCoat());
    }

}