package com.BasicJava;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello Developers, Nabin here:- ");

        /* STEP 1 */

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
        // System.out.println(num11);

        // User Input, import java.util.Scanner;
        // get an integer, float, string, double as input, and display them.
        // Check if they are not the right data types(eg, if integer input is not int)
        Scanner input = new Scanner(System.in);

        /*
        // ask user to input an integer
        System.out.print("Enter an integer: ");
        // store it in a variable
        int number1 = input.nextInt();
        // Display it back to a user
        System.out.println("You entered " + number1);
        */

        /*
        // get some string input
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your beautiful name is " + name);
        */

        /*
        // double input
        System.out.print("Enter a decimal number with fractional part: ");
        double decimalPointNumber = input.nextDouble();
        System.out.println("You entered " + decimalPointNumber);
        */

        /*
        // floating point number
        System.out.print("Enter a floating point number: ");
        float number3 = input.nextFloat();
        System.out.println("You entered " + number3);
        */

        /*
        // next() method,
        // switch case statement
        System.out.print("enter your name: ");
        String firstName = input.nextLine();
       // System.out.print("You entered " + name2);

        // Switch case, firstName is the variable that holds user input, nabin & prabha are the values of firstName
        switch(firstName){
            case "nabin":
                System.out.printf("You entered %s ", "nabin");
                break;
            case "prabha":
                System.out.printf("You entered %s ", "prabha");
                break;
            default:
                System.out.printf("You entered %s but is not found", firstName);
                break;
        }
        */
        /*
        // Arrays in java, if array is empty, it puts default values
        int [] numbers = new int[5];
        // Initialize the array
        int []numbers2 = {1, 2, 4, 6, 8};
        numbers[0] = 1;
        //System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers2));

        for(int i = 0; i < numbers2.length; i++){
           // System.out.println(numbers[i]);
            System.out.println(numbers2[i]);
        }

        // enhanced for loop
        for (int j : numbers2) {
            // System.out.println(numbers[i]);
            System.out.println(j);
        }
        */

        /*
        // Multi-Dimensional array, use Arrays.deepToString(yourArr) method, not Arrays.toString()

        // example 1
        int nums[][] = new int[2][3]; // 2 rows 3 columns
        // add numbers to it
        nums[0][0] = 1;
        System.out.println(Arrays.deepToString(nums)); // OR

        // nested for loop to print the elements, formatting of where print system go is key here
        for(int i = 0; i< nums.length; i++){  // array length
            for(int j = 0; j< nums[i].length; j++){  // row length
                System.out.print(nums[i][j] + "\t");
            }
            System.out.println();
        }

        // example 2, arrays inside array do not have to be of same length
        int [][] twoDArray = {
                        {1, 2},
                        {3, 4, 5}
                    };
        for(int row = 0; row < twoDArray.length; row++){
            for(int col = 0; col < twoDArray[row].length; col++){
                System.out.print(twoDArray[row][col] + "\t");  // print()
            }
            System.out.println(); // this is for cleaner formatting
        }

        System.out.println("****************************");

        // enhanced for loop approach for the above nested loop
        for (int[] array : twoDArray) {  // array in 2D array
            for (int row : array) {  // row in array
                System.out.print(row + "\t");  // print() for cleaner formatting of 2D array

            // Comment everything except first for loop, and run this command,
            // it prints 2 different arrays
                // System.out.println(Arrays.toString(array));
           }
            System.out.println(); // this is for cleaner formatting of 2D array
        }
        */
        
    } // end of main method
} // end of class
