package com.search;

import java.util.Arrays;

/**
 * Assume that the input is an infinite sorted array. Find the location
 * for a given target input
 *
 * by infinite, it implies that we dont know the start/end of the array
 * and can't use the length function
 */
public class InfiniteBinarySearch {

    /**
     * Binsearch within start and end indices
     * @param arr
     * @param target
     * @return
     */
    public static int binSearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
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

    public static int rangeFinder(int[] arr, int target) {
        /*
         * Start with a box of size 2
         */
        int start = 0;
        int end = 1;

        // keep doubling and checking to find the right range
        // where the taget can lie
        while (target > arr[end]) {

            /*
             * double the box in which we are looking for the target
             * newEnd = prevEnd + size-of-box*2;
             *
             * here, boxSize = (end - start + 1)
             * eg : start = 0, end = 1. size here is 2 elements , i.e 2
             *
             * in general - length of array = (endIndex - startIndex + 1)
             */
            int newStart = end + 1;
            end = end + (end - start + 1)*2;
            start = newStart;
        }

        return binSearch(arr, target, start, end);
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 10, 20, 40, 55, 66, 77, 88, 99, 120, 140, 165, 185, 220};

        /*
         * Do not try to find elements at the edge of the array
         * since there is no deterministic way to find the edge of the array
         *
         * for instance if i try to find 185, the end will overshoot the array
         * and will give arrayIndexOutOfbounds.
         *
         * So, try for something where the end in raneFinder remains within the array
         *
         * Since this is an infinite array, this case won't arrive where we end up
         * finding element at the edge of the array.
         *
         * if this also has to be handled, we need a marker value which signals i reached
         * the end so that we bail out. otherwise, we keep going
         *
         * note - practially speaking, you cant have a sorted infinite array and expect
         * to do binsearch on it . this is diff from a infinte stream of nos
         *
         * if the above is incorrect - ping me or fix the description and will follow along
         */
        System.out.println(rangeFinder(arr, 120));
        System.out.println(Arrays.binarySearch(arr, 120));
    }
}
