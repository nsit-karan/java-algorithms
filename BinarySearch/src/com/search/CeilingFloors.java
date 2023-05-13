package com.search;

public class CeilingFloors {

    /**
     * Find the smallest element greater than the target element in the array
     * given as input
     *
     * @param arr
     * @param target
     * @return smallest element greater than the target
     */
    public static int findCeliingInArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] == target) {
                return target;
            }

            if (target < arr[mid]) {
                // go left
                end = mid - 1;
            } else if (target > arr[mid]) {
                // go right
                start = mid + 1;
            }
        }

        // While loop terminated, start has become greater than end
        // we are looking for the smallest integer "just" greater
        // than target. i.e, it will be start
        // in other words, towards the end, the index will be something like
        // end followed by start
        return arr[start];

    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("ceiling is " + findCeliingInArray(arr, 15));

    }
}
