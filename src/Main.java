import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter you string: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        System.out.println("Input string: " + str);
        ReverseString.reverseString(charArray);
        String revStr = new String(charArray);
        System.out.println("Output string: " + revStr);
    }
}

