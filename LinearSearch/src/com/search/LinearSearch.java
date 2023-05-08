package com.search;

public class LinearSearch {

    /**
     * Iterate over the array and keep checking for
     * target == arr[i]
     *
     * if target found, return the index 'i'
     * if not found, return -1
     *
     * @param arr
     * @param target
     * @return index is found, -1 if not
     */
    public static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Check for presence of element in array");
        int[] arr = {1, 2, 333, 555, 666, 67, 2323, 11, 32};
        int target = 555;
        int index = linearSearch(arr, target);
        System.out.println("array found at index " + index);
    }
}