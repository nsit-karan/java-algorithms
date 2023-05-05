package com.methods;

public class BasicMethods {

    public int sumNos(int a, int b) {
        return a + b;
    }

    public void displayString(String s) {
        System.out.printf("Hello world : %s \n", s);
    }

    public static void main(String[] args) {
        BasicMethods basicMethods = new BasicMethods();
        System.out.printf("Sum is %d\n", basicMethods.sumNos(10, 30));
        basicMethods.displayString("Ron");
    }
}
