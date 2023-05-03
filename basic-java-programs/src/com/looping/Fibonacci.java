package com.looping;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int prev = 0;
        int curr = 1;
        int count = 2;

        if (n <= 1) {
            System.out.printf("%dth fibonnaci is %d", n, n);
            return;
        }

        /*
         * pre, cur
         * at every iteration :
         *    - pre will hold current
         *    - cur will be sum of pre and current
         *
         * to achive the above - use a temp
         */
        while (count <= n) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
            count++;
        }

        System.out.printf("%dth fibonacci no is %d", n, curr);
    }
}
