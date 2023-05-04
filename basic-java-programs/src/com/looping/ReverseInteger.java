package com.looping;

import java.util.Scanner;

public class ReverseInteger {

    /**
     * Algo:
     *
     * 1234 needs to be converted to 4321
     * So, we need to keep doing the following
     *   - keep picking the rightmost digit
     *   - divide n by 10 so that the rightmost digit is removed and we reduce 'n'
     *   - result = result*10 + right_digit
     *
     *   result is a running value where we keep appending the digits as they come.
     *   for instance:
     *   iteration1 , res = 4
     *   iteration2, res*10+3, 40+3 = 43
     *   iteration3, res*10+2, 430+2 = 432
     *   iteration4, res*10+1, 432+1 = 4321
     *
     *
     * @param args input args
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the integer to be reversed ");
        int n = scanner.nextInt();

        int rev_no = 0;
        while (n > 0) {
            int right_digit = n % 10;
            rev_no = rev_no*10 + right_digit;
            n = n / 10;
        }

        System.out.printf("The reversed integer is %d", rev_no);

    }
}
