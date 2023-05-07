import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void inputArray() {

        System.out.println("Input the array elements 3x2");
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[3][2];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static void main(String[] args) {
        /*
         * specifying rows is mandatory, columns isn't
         */
        int[][] arr1 = new int[3][];

        // declare and initialize together
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        /*
         * all the sub-arrays are of diff dimensions
         */
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9, 10, 11}
        };
        System.out.println(Arrays.deepToString(arr3));

        // Fill in array from terminal
        inputArray();
    }
}
