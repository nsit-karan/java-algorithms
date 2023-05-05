package com.methods;

import java.util.Arrays;

public class BasicMethods {

    public int sumNos(int a, int b) {
        return a + b;
    }

    public void displayString(String s) {
        System.out.printf("Hello world : %s \n", s);
    }

    public void changeArgument(int[] nums) {
        nums[0] = 99;
    }
    public static void main(String[] args) {
        BasicMethods basicMethods = new BasicMethods();
        System.out.printf("Sum is %d\n", basicMethods.sumNos(10, 30));
        basicMethods.displayString("Ron");

        /*
         * changing value pointed by the function argument
         * changeArgument.nums is pointing to the array that arr is pointing to
         *
         * if we change nums[0], its the same array that arr was pointing to.
         * the change will reflect in the array, whether we refer to the array by
         * arr or by num - its the same array in heap
         */
        int[] arr = {1, 3, 5, 20, 30};
        basicMethods.changeArgument(arr);
        System.out.println("Changed value is " + Arrays.toString(arr));
    }
}
