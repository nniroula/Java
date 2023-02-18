package com.BasicJava;

/*
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Developers out there");
    }
}
*/

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Developers out there");

        //  variables
        int age;
        age = 21;
        double price = 20.1;

        //     final key word for variable
        final int hour;
        hour = 10;     // Once value is assigned with final key word you can never change it

        // Data types in java
        float cost1 = 3.8f;     // YOu must have f or F to indicate float
        double cost2 = 4.8;
       // System.out.println("Cost1 is " + cost1 +", " + "cost2 is " + cost2);

        // Type conversion and casting

        // Implicit conversion - java compiler does it
        int num1 = 34;
        double num2 = num1;
       // System.out.println(num2);

        // Explicit conversion - convert from smaller data type to larger data type
        double num3 = 8.8;
        int num4 = (int) num3;  // You will loose decimal portion(fractional portion)
        // System.out.println(num4);

        double num5 = 2.98;
        float num6 = (float) num5;
        // System.out.println(num6);

        int num7 = (int) num6;  // You will loose every thing after decimal
        // System.out.println(num7);

        // Operations in java
        int num8 = 9;
        int num9 = 9;
        int num10 = num8/num9; // will be int value
        double num11 = num8/(double) num9; // will be converted to double
        System.out.println(num11);

    }
}
