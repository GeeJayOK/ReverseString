package com.aimprosoft;

public class ReverseString {

    private static final String SEPARATOR = " ";

    public String splitStringToWords(String enteredString) {

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

    private static void reverseChars(char word[]) {
        int rightCounter = word.length - 1, leftCounter = 0;
        while (leftCounter < rightCounter) {
            if (!Character.isAlphabetic(word[leftCounter]))
                leftCounter++;
            else if (!Character.isAlphabetic(word[rightCounter]))
                rightCounter--;
            else {
                char temp = word[leftCounter];
                word[leftCounter] = word[rightCounter];
                word[rightCounter] = temp;
                leftCounter++;
                rightCounter--;
            }
        }
    }
}


