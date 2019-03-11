public class ReverseString {

    public static void reverseString(char chars[]) {
        int rightPointer = chars.length - 1, leftPointer = 0;
        while (leftPointer < rightPointer) {
            if (!Character.isAlphabetic(chars[leftPointer]) ^ (!Character.isSpaceChar(chars[leftPointer])))
                leftPointer++;
            else if (!Character.isAlphabetic(chars[rightPointer]) ^ (!Character.isSpaceChar(chars[rightPointer])))
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

