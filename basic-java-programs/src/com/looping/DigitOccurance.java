package com.looping;

import java.util.Scanner;

public class DigitOccurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Key in the number : ");
        int n = scanner.nextInt();

        System.out.print("Key in the digit for finding occurance count : ");
        int x = scanner.nextInt();

        int count = 0;
        while (n > 0) {
            int current_digit = n % 10;
            if (current_digit == x) {
                count++;
            }

            n = n / 10;
        }

        System.out.printf("\n Total occurance count is %d", count);
    }
}
