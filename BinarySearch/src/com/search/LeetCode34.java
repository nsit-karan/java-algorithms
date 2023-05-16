package com.search;

import java.util.Arrays;

public class LeetCode34 {

    /**
     * Find the start and the end index for of a given
     * integer target
     *
     * Eg:
     * Input: nums = [5,7,7,8,8,10], target = 8
     * Output: [3,4]
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);

        ans[0] = startIndex;
        ans[1] = endIndex;

        return ans;
    }

    public static int search(int[] nums, int target, boolean findStartIndex) {

        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;

                /*
                 * if the ask is to find leftmost match
                 * then keep going in the left sub-array
                 */
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));
    }
}
