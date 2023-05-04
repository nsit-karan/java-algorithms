package com.switches;

import java.util.Scanner;

public class SampleSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your fruit : ");
        String fruit = scanner.next();

        switch (fruit) {
            case "mango":
                System.out.println("summer king");
                break;
            case "apple":
                System.out.println("red fruit");
                break;
            default:
                System.out.println("no match found");
        }
    }
}
