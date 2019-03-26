package com.aimprosoft.yaroslavGetalo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    Anagram anagram = new Anagram();
    String actualResult, expectedResult;

    @Test
    void mainPositiveTestFromStas() {
        actualResult = anagram.splitStringToWords("Yaroaslav@##$ ne Pid@@@r #$$^test%%^");
        expectedResult = "valsaoraY@##$ en rdi@@@P #$$^tset%%^ ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkOneCharacter() {
        actualResult = anagram.splitStringToWords("Q");
        expectedResult = "Q ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkLatinLettersOnly() {
        actualResult = anagram.splitStringToWords("QwErTy");
        expectedResult = "yTrEwQ ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkLatinLettersWithWhiteSpaces() {
        actualResult = anagram.splitStringToWords("qwerty asdfg zxcvb");
        expectedResult = "ytrewq gfdsa bvcxz ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkLatinLettersWithSpecialCharacters() {
        actualResult = anagram.splitStringToWords("QwErTy!@#AsDfG%^&");
        expectedResult = "GfDsAy!@#TrEwQ%^& ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkCyrillicLettersOnly() {
        actualResult = anagram.splitStringToWords("Привет!");
        expectedResult = "тевирП! ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkCyrillicLettersWithWhiteSpaces() {
        actualResult = anagram.splitStringToWords("Превед Медвед!");
        expectedResult = "деверП девдеМ! ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkCyrillicLettersWithSpecialCharacters() {
        actualResult = anagram.splitStringToWords("Превед!@@#Медвед!$$%%");
        expectedResult = "девдеМ!@@#деверП!$$%% ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkLatinAndCyrillicLetters(){
        actualResult = anagram.splitStringToWords("Привет Hello!!@@#$%$%");
        expectedResult = "тевирП olleH!!@@#$%$% ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkLatinAndCyrillicAndDigits(){
        actualResult = anagram.splitStringToWords("Привет 4565464 674964 Hello!!@@#$%$%");
        expectedResult = "тевирП 4565464 674964 olleH!!@@#$%$% ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkDigitsOnly() {
        actualResult = anagram.splitStringToWords("0123456789");
        expectedResult = "0123456789 ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkDigitsWithWhiteSpaces() {
        actualResult = anagram.splitStringToWords("012 345 678 9");
        expectedResult = "012 345 678 9 ";
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkDigitsWithSpecialCharacters() {
        actualResult = anagram.splitStringToWords("012@##345$%%678%$$%9");
        expectedResult = "012@##345$%%678%$$%9 ";
        assertEquals(expectedResult, actualResult);
    }
}