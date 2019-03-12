public class ReverseString {

    public static String reverseWords(String enteredString) {

        String[] arrayOfWords = enteredString.split(" ");
        String reverseString = "";
        String reverseWord = "";

        for (int numberOfWordInString = 0; numberOfWordInString < arrayOfWords.length; numberOfWordInString++) {
            String word = arrayOfWords[numberOfWordInString];

            for (int lengthOfWord = word.length() - 1; lengthOfWord >= 0; lengthOfWord--) {
                char[] charArrayOfWord = word.toCharArray();
                reverseChars(charArrayOfWord);
                reverseWord = new String(charArrayOfWord);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        return reverseString;
    }

    public static void reverseChars(char chars[]) {
        int rightPointer = chars.length - 1, leftPointer = 0;
        while (leftPointer < rightPointer) {
            if (!Character.isAlphabetic(chars[leftPointer]))
                leftPointer++;
            else if (!Character.isAlphabetic(chars[rightPointer]))
                rightPointer--;
            else {
                char tmp = chars[leftPointer];
                chars[leftPointer] = chars[rightPointer];
                chars[rightPointer] = tmp;
                leftPointer++;
                rightPointer--;
            }
        }
    }
}

