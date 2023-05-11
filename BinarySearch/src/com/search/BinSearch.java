package com.search;

import java.util.Arrays;

public class BinSearch {

    /**
     * Binary search - keep going for half the array
     * based on whether the no will be in left or right
     * sub-array and repeat this till the element is found
     *
     * @param arr
     * @param target
     * @return
     */
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; will overshoot the value for int.
            // lets use alternate calculation which is the same
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 23, 44, 88, 999, 1222, 2323, 3333};

        // both the below statements will give 7 as the index
        System.out.println(binarySearch(arr, 2323));
        System.out.println(Arrays.binarySearch(arr, 2323));

        // negative test case
        System.out.println(binarySearch(arr, 918182));
    }
}