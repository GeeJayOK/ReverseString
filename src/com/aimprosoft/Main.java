package com.aimprosoft;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println("Enter you string: ");
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        System.out.println("Input string:");
        System.out.println(enteredString);
        System.out.println("Output string:");
        System.out.println(reverseString.splitStringToWords(enteredString));



    }
}
