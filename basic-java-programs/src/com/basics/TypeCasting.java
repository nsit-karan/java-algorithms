package com.basics;

public class TypeCasting {
    public static void main(String[] args) {

        // type casing - drops the decimal and casts to int
        // without the int typecasting, the compilation itself will fail
        int i1 = (int) 4.55f;
        System.out.println("integer value is " + i1);

        int a1 = 257;
        byte b1 = (byte)a1; // this is essentally doing 257 % 256 internally which results in 1
        System.out.println("int to byte type casting : " + b1);

        /* whenever arithmetic expressions are performed
         * on bytes, they get promoted to integers automatically
         */
        byte b2 = 100;

        /*
         * This will result in error since multiplication changes the type to int
         * and since you are storing this back to bye - wont work:
         * b2 = b2 * 4;
         */


        /*
         * Misc example covering typecasting end to end
         */
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        /*
         * the above essentially translates to
         * f*b - result will be float , byte gets downcasted to float
         * i/c - result will be int
         * d*s - result will be double
         *
         * flat + int - double - result will be double
         * ,i.e biggest type
         */
        System.out.println("result is " + d);

    }
}
