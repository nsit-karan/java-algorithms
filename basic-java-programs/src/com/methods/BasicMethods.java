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

    /**
     * Sample fun to demonstrate variable no of args
     * args here gets translated to an array by java
     *
     * not, although args is implicitly an array, the function
     * signature is different if this was declared like int[] args.
     *
     * the way this is called will be different. in the second case,
     * you will have to pass in an array unlike the current case
     * where you can pass in free flowing strings
     *
     * @param args
     */
    void varArgsFunc(int ...args) {
        System.out.println(Arrays.toString(args));
    }

    /**
     * basic fun with args as input
     * its similar to varArgsFunc, just the caller code
     * snippet will be diff
     *
     * @param args
     */
    void FuncArray(int[] args) {
        System.out.println(Arrays.toString(args));
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

        // variable no of args call
        basicMethods.varArgsFunc(1, 2, 3, 4, 5, 6, 7, 8);

        // this won't work. it has to be an array
        //basicMethods.FuncArray(1, 2, 4); WONT WORK
        basicMethods.FuncArray(arr);
    }
}
