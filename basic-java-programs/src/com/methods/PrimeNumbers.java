package com.methods;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n));
    }

    /**
     * to check if a no is prime or not, start from 2
     * and keep checking for n%c. if 0, then non-prime
     *     else, increment c and keep moving on
     *
     * the iterations are capped at c*c <= n to optimize
     * the no of times the loop runs
     *
     * @param n
     * @return
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int c = 2;
        while (c*c <= n) {
            if (n % c == 0) {
                System.out.printf("\n %d is divisible by %d unfortunately \n", n, c);
                return false;
            }
            c++;
        }

        // if no divisor found, no is prime
        return true;
    }
}
