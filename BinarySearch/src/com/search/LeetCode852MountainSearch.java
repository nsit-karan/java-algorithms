package com.search;

public class LeetCode852MountainSearch {

    public static int peakIndexInMountainArray(int[] arr) {

            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                int mid = start + (end - start)/2;

                /*
                 * it means, we are in the increasing part of the array
                 * and the ans will lie towards the right of mid
                 */
                if (arr[mid] < arr[mid + 1]) {
                    start = mid + 1;
                } else if (arr[mid] > arr[mid + 1]) {
                    /*
                     * it means, we are in the decreasing part of the array
                     * and the ans will lie towards the left of the array
                     *
                     * we also include mid here since that could be a potential ans
                     * since mid could be the highest no (try drawing this and
                     * you will follow why mid also needs to be included)
                     */
                    end = mid;
                }
            }

            // at the end , start == end
            return start;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9, 7, 5};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
