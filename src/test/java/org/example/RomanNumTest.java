package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RomanNumTest {

    @Test
    @DisplayName("Convert 1 to Roman")
    public void testConvertOneToRoman() {
        String result = RomanNum.toRoman(1);
        Assertions.assertEquals("I", result);
    }

    @Test
    @DisplayName("Convert 3999 to Roman")
    public void testConvertMaxToRoman() {
        String result = RomanNum.toRoman(3999);
        Assertions.assertEquals("MMMCMXCIX", result);
    }

    @Test
    @DisplayName("Convert invalid number (0) to Roman")
    public void testConvertInvalidNumberToRoman() {
        String result = RomanNum.toRoman(0);
        Assertions.assertEquals("", result);
    }
}