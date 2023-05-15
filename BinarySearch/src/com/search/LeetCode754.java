package com.search;

public class LeetCode754 {

    /**
     * You are given an array of characters letters that is sorted in
     * non-decreasing order, and a character target. There are at least
     * two different characters in letters.
     *
     * Return the smallest character in letters that is lexicographically
     * greater than target. If such a character does not exist, return the
     * first character in letters.
     *
     * Approach :
     * - leverage the binary search logic for finding ceiling of a no
     * - caveats being that if no is not found, return the first element
     *
     * alternate - same approach as above. just to handle wrap-around,
     *             the final index will be start % arr.length.
     *             This ensures that if there is no element greater than
     *             target, it will wrap around and the final index will be
     *             0 - the first element
     * @param letters
     * @param target
     * @return
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if (target >= letters[letters.length -1]) {
            return letters[0];
        }

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target > letters[mid]) {
                start = mid + 1;
            } else if (target == letters[mid]) {
                start = mid + 1;
            }

        }
        return letters[start];
    }
    public static void main(String[] args) {
        char[] characters = {'c','f','j'};
        System.out.println(nextGreatestLetter(characters, 'g'));
    }
}
