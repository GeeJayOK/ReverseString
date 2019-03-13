package com.aimprosoft;

public class ReverseString {

    public static void reverseWords(String enteredString) {

        String[] split = enteredString.split("[\\s,!.]");
        StringBuilder out = new StringBuilder(enteredString.length());
        StringBuilder temp = new StringBuilder(enteredString.length());
        for (String s : split) {
            // reset the length and reuse the tmp StringBuilder
            temp.setLength(0);
            // append the part the the temporary StringBuilder
            temp.append(s);
            // append the reversed part to the output StringBuilder
            out.append(temp.reverse());
            // if the length of the input is longer then the output
            // we need to add the separator char from the input
            if (enteredString.length() > out.length()) {
                out.append(enteredString.charAt(out.length()));
            }
        }

        /*String[] arrayWords = enteredString.split(" ");
        String reverseString = "";
        String reverseWord = "";

        for (int counter = 0; counter < arrayWords.length; counter++) {
            String word = arrayWords[counter];

            for (int lengthWord = word.length() - 1; lengthWord >= 0; lengthWord--) {
                char[] chars = word.toCharArray();
                reverseChars(chars);
                reverseWord = new String(chars);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        Main.printResult(reverseString);*/
    }

    public static void reverseChars(char chars[]) {
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

