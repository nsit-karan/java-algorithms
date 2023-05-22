package com.looping;

public class CheckPalindrome {

    /**
     * Check if n == revertInteger(n).
     * Alternate would be to convert this to a string,
     * and keep comparsing the first and last char
     * , then the second and (last -1)th char
     * and so on and if any comparison fails, bail out
     *
     * The current logic only implements the first approach
     * @param n
     * @return
     */
    public static boolean isPalindrone(int n) {
        return n == reverseInteger(n);
    }

    public static int reverseInteger(int n) {
        int reverseNo = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            reverseNo = reverseNo * 10 + lastDigit;
            n = n / 10;
        }

        return reverseNo;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrone(1234));
        System.out.println(isPalindrone(121252121));


    }
}
