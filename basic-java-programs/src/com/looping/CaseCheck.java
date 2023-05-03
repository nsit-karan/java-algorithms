package com.looping;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // get the first char of the input which is supposed to be a string
        char ch = scanner.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else {
            System.out.println("Upper case");
        }
    }
}
