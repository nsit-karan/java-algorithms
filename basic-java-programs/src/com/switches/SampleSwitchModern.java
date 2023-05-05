package com.switches;

import java.util.Scanner;

public class SampleSwitchModern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your fruit : ");
        String fruit = scanner.next();

        switch (fruit) {
            case "mango" -> System.out.println("summer king");
            case "apple" -> System.out.println("red fruit");
            case "grape" -> System.out.println("small fruit");
            default      -> System.out.println("No match found");
        }


        // another eg where we dont need break for every condition
        System.out.println("Enter day of the week please : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Its a weekday");
            case 6,7           -> System.out.println("its a weekend");
        }
    }
}
