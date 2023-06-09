import java.util.Arrays;

public class SplitPositiveNegativeIntegers {

    public static int[] SplitArray(int[] b) {

        int h = 0;
        int j = b.length - 1;

        while (h != j + 1) {
            if (b[h] <= 0) {
                h = h + 1;
            } else {
                int temp = b[h];
                b[h] = b[j];
                b[j] = temp;
                j = j - 1;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -1, -2, -4, 12, 22, 34, -4, -2};
        System.out.println("Original Array was : " + Arrays.toString(a));
        System.out.println("Split array is : " + Arrays.toString(SplitArray(a)));
    }
}
