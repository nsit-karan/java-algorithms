public class ArrayMiscQuestions {

    public static int maxArray(int[] arr) {
        int max = 0;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    /**
     * Iterate over the array from 0 to n/2.
     * Keep swapping ith element from beginning and end
     * logic terminates when i reaches the middle of the array where
     * left and right of the middle are in place cleanly
     *
     * Note - this is in-place reversal of the array without
     * using a new array as the output
     *
     * @param arr
     */
    public static void reverseArray(int[] arr) {
        
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,555,888,555,232};
        System.out.println("Max of the array is : " + maxArray(arr));
    }
}
