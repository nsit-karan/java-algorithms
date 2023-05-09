package com.search;

public class EventDigits {
    public static void main(String[] args) {
        int arr[] = {12, 2222, 3, 4, 78787878, 9, -33, 00};
        int evenNos = findNumbers(arr);
        System.out.println("even no count is " + evenNos);
    }

    static int findNumbers(int[] nums) {
        int count = 0;

        for (int element : nums) {
            int digits = countDigits(element);
            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;

    }

    /**
     * iterate and count every digit
     * alternate approach - convert int to string and find length
     * @param n
     * @return
     */
    static int countDigits(int n) {

        // if no is negative, doesn't work since the while check fails
        if (n < 0) {
            n = n * (-1);
        }

        // 0 contains 1 digit
        if (n == 0) {
            return 1;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n = n /10;
        }
        return count;
    }
}
