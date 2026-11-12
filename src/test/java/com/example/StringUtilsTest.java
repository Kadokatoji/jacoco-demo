package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void isBlankShouldDetectNullEmptyAndSpaces() {
        assertTrue(StringUtils.isBlank(null));
        assertTrue(StringUtils.isBlank(""));
        assertTrue(StringUtils.isBlank("   "));
        assertFalse(StringUtils.isBlank("abc"));
    }

    @Test
    void reverseShouldWork() {
        assertEquals("cba", StringUtils.reverse("abc"));
        assertNull(StringUtils.reverse(null));
    }

    @Test
    void isPalindromeShouldWork() {
        assertTrue(StringUtils.isPalindrome("Never odd or even"));
        assertFalse(StringUtils.isPalindrome("hello"));
        assertFalse(StringUtils.isPalindrome(" "));
    }

    @Test
    void capitalizeShouldWork() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
        assertEquals("", StringUtils.capitalize(""));
        assertNull(StringUtils.capitalize(null));
    }
}
