import java.util.Arrays;

public class LeetCode1470 {

    /**
     * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
     * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
     *
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for (int i = 0, j = n, k = 0; j < 2*n; i++, j++) {
            result[k] = nums[i];
            result[k + 1] = nums[j];
            k = k + 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }
}
