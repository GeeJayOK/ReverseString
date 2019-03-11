import java.util.Scanner;


public class ReverseString {

    private static void reverseString(char chars[]) {
        int rightPointer = chars.length - 1, leftPointer = 0;

        while (leftPointer < rightPointer) {

            if (!Character.isAlphabetic(chars[leftPointer]))
                leftPointer++;
            else if (!Character.isAlphabetic(chars[rightPointer]))
                rightPointer--;
            //else if (!Character.isSpaceChar(chars[leftPointer]));
            //leftPointer++;

            else {
                char tmp = chars[leftPointer];
                chars[leftPointer] = chars[rightPointer];
                chars[rightPointer] = tmp;
                leftPointer++;
                rightPointer--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter you string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        System.out.println("Input string: " + str);
        reverseString(charArray);
        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
    }
}

