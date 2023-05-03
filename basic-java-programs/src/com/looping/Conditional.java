package com.looping;

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {

        /*
            take 3 nos as input and find the max
            approach is to treat the 3 nos as part of an array
            and iterate over them with a running max which will
            hold the max seen till now

            the same approach will work for 10 nos as well
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 3 nos please:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Max is : " + max);

        // Alternate way to solve the above
        System.out.println(Math.max(c, Math.max(a, b)));
    }
}
