import java.util.Arrays;

public class BasicArrays {

    public static void basicArray() {
        int[] numbers = new int[10];
        numbers[0] = 1;
        numbers[1] = 2;

        /*
         * This will print
         * [1,2,0,0,0,0,0,0,0,0]
         *
         * if we dont initialize all the indexes, it will
         * take the default for the datatype, i.e, int
         * in this case. so, defaulted to 0
         */
        System.out.println(Arrays.toString(numbers));

        // another way to initialize array
        int[] newNos = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(newNos));

        /*
         * String is non-primitive so the default value is null
         * in the below case, strings array will be full of nulls
         * expected o/p : [null, null, null, null]
         */
        String[] strings = new String[4];
        System.out.println(Arrays.toString(strings));

        printArrayNew(newNos);
    }

    public static void printArrayOld(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void printArrayNew(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        basicArray();
    }
}