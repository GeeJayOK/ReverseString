import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter you string: ");
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        System.out.println("Input string: " + enteredString);


        ReverseString.reverseWords(enteredString);
        char[] charArray = enteredString.toCharArray();
        String revStr = new String(charArray);
        //System.out.println("Output string: " + ReverseString.reverseChars(charArray);
    }
}

