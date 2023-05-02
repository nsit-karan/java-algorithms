package com.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Iterate over the command line arguments
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine());
    }
}