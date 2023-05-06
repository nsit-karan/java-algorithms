package com.methods;

import java.util.Scanner;

public class ArmstrongNo {

    /**
     * No is an armstrong no if (sum of cubes of all digits == the no itself)
     * algo:
     *    extract the rightmost digit . cube and add to the sum
     *    divide the no by 10 so that n keeps reducing
     *
     * finally - check for result == n
     * @param n
     * @return boolean
     */
    public static boolean isArmstrongNo(int n) {

        // Since n keeps on reducing by a factor of 10
        int originalN = n;
        int digitCubes = 0;
        while (n > 0) {
            int rightDigit = n % 10;
            digitCubes = digitCubes + (int) Math.pow(rightDigit, 3);
            n = n / 10;

        }

        System.out.printf("\nsum of cubes of all digits is %d\n", digitCubes);
        return originalN == digitCubes;
    }

    public static void main(String[] args) {
        System.out.printf("Input the integer to check for : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("%d is armstrong : %b", n, isArmstrongNo(n));
    }
}
