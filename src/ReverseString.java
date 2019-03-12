public class ReverseString {

    public static void reverseWords(String enteredString) {

        String[] arrayWords = enteredString.split(" ");
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
        StartReversing.printResult(reverseString);
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

