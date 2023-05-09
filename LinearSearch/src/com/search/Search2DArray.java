package com.search;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {22, 33, 44, 55, 66},
                {99, 898, 1122, 1212, 344, 444, 3232}
        };
        System.out.println("2d array is " + Arrays.deepToString(arr));
        int[] elementLocation = searchElement(arr, 66);
        System.out.println("element found at " + Arrays.toString(elementLocation));

        System.out.println("Max for this 2d array is " + findMax(arr));
    }

    public static int[] searchElement(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            int[] currentRow = arr[row];
            for (int col = 0; col < currentRow.length; col++) {
                if (target == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};

    }

    public static int findMax(int[][] arr) {
        int max = 0;
        for (int[] rows : arr) {
            for (int element: rows) {
                if (element > max) {
                    max = element;
                }
            }

        }
        return max;
    }
}
