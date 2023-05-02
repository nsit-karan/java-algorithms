package com.basics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give me your roll no : ");
        int rollno = scanner.nextInt();
        System.out.println("the roll no is " + rollno);


        // representing bigger integers - replace , with _
        int millions = 200_000_000;
        System.out.println(millions);

        // read one word from the line
        String name = scanner.next();
        System.out.println(name);

        // read float
        float marks = scanner.nextFloat();
        System.out.println("marks are " + marks);
    }
}
