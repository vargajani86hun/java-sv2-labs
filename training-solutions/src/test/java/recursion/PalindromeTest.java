package recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome p = new Palindrome();

    @Test
    void testIsPalindrome() {
        assertTrue(p.isPalindrome("indul a görög aludni"));
        assertTrue(p.isPalindrome("aibohphobia"));
        assertTrue(p.isPalindrome("tettet"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(p.isPalindrome("almafa"));
    }
}