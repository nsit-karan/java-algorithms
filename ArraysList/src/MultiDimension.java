import java.util.Arrays;

public class MultiDimension {
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
    }
}
