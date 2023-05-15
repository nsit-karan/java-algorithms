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

        /*
         * Edge case - if target is greater than all elements in the array
         * no ceiling exists. return -1
         */
        if (target > arr[arr.length - 1]) {
            return -1;
        }

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

    /**
     * Similar approach as above. Find the largest number in the array
     * which is "just" smaller than the target
     *
     * @param arr
     * @param target
     * @return
     */
    public static int findFloorInArray(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        /*
         * if target is smaller than all the numbers in the array
         * , then return -1
         * note - we directly check for arr[0] since its the smallest no
         * in the array
         */
        if (target < arr[0]) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target == arr[mid]) {
                return target;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }

        return arr[end];
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println("ceiling is " + findCeliingInArray(arr, 15));
        System.out.println("ceiling is " + findFloorInArray(arr, 15));
    }
}
