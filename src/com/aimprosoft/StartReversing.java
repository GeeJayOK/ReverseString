package com.aimprosoft;

import java.util.Scanner;

public class StartReversing {

    public static void main(String[] args) {
        System.out.println("Enter you string: ");
        Scanner scanner = new Scanner(System.in);
        String enteredString = scanner.nextLine();
        System.out.println("Input string: " + enteredString);
        ReverseString.reverseWords(enteredString);
    }

    public static void printResult(String reverseString) {
        System.out.println("Output string: " + reverseString);
    }
}

