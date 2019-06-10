package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;
public class Main33 {

    /**
     * 5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
     * Assume that the first value read specifies the number of values to input from the user.
     * @param args
     */
    public static void main (String[] args) {
        Scanner input = new Scanner( System.in );

        int small = 0;
        int integer;
        int number;

        System.out.println("Enter the number of integers to be compared:");
        integer = input.nextInt();

        for (int counter = 1; counter <= integer; counter++)
        {
            System.out.println("Enter number:");
            number = input.nextInt();

            if (number < small)
                small = number;

        }
        System.out.println( "Smallest Integer is: " + small);


    }
}
