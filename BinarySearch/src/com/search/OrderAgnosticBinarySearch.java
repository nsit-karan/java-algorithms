package com.search;

import java.util.Arrays;

public class OrderAgnosticBinarySearch {

    public static int orderAgnosticSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        /*
         * determine if array is sorted in asc or desc
         * compare the first and the last element of the array
         */
        boolean isAsc = (arr[start] < arr[end]);

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-9, -4, 4, 14, 24, 34, 55, 99, 1212, 33333, 555555};
        System.out.println(orderAgnosticSearch(arr, 1212));
        System.out.println(Arrays.binarySearch(arr, 1212));

        int[] arr1 = {555555, 33333, 2222, 1000, 800, 500, 200, 100, 0, -5, -15};
        System.out.println(orderAgnosticSearch(arr1, 100));

        // Default Arrays.binarySearch doesnt seem to work on sorted array which
        // is in descending order
        //System.out.println(Arrays.binarySearch(arr1, 100));


    }
}
