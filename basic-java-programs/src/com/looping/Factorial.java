package com.looping;

public class Factorial {
    public static int factorial (int n) {
        int result = 1;

        while (n >= 1) {
            result = result * n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
        System.out.println(factorial(1));
        System.out.println(factorial(4));
        System.out.println(factorial(5));

    }
}
