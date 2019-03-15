package com.aimprosoft;

public class ReverseString {

    public String splitStringToWords(String enteredString) {
        final String SEPARATOR = " ";
        String reversedWord;
        String reversedString;

        String[] split = enteredString.split(SEPARATOR);
        StringBuilder out = new StringBuilder(enteredString.length());
        StringBuilder temp = new StringBuilder(enteredString.length());
        for (String s : split) {
            temp.append(s);
            char[] chars = s.toCharArray();
            reverseChars(chars);
            reversedWord = new String(chars);
            out.append(reversedWord + SEPARATOR);
        }
        reversedString = out.toString();
        return reversedString;
    }

    private static void reverseChars(char chars[]) {
        int rightCounter = chars.length - 1, leftCounter = 0;
        while (leftCounter < rightCounter) {
            if (!Character.isAlphabetic(chars[leftCounter]))
                leftCounter++;
            else if (!Character.isAlphabetic(chars[rightCounter]))
                rightCounter--;
            else {
                char temp = chars[leftCounter];
                chars[leftCounter] = chars[rightCounter];
                chars[rightCounter] = temp;
                leftCounter++;
                rightCounter--;
            }
        }
    }
}

