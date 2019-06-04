//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main3 Class
 */
public class Main3 {

    /**
    (Comparing Integers) Write an application that asks the user to enter two integers, obtains
    them from the user and displays the larger number followed by the words "is larger". If the numbers
    are equal, print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
     */
    public static void main (String[] args){

        //Fields
        Scanner input = new Scanner (System.in);

        //Variables
        int int1;
        int int2;

        //Prompt, input numbers
        System.out.println("Enter first integer");
        int1 = input.nextInt();

        System.out.println("Enter second integer");
        int2 = input.nextInt();

        //If statements that calculate if an integer is larger than another
        if (int1 > int2)
            System.out.println(int1 + " is larger than " + int2);

        if (int1 < int2)
            System.out.println(int2 + " is larger than " + int1);

        //If statements that calculate if an integer is equal
        if (int1 == int2)
            System.out.println("These numbers are equal");
    }
}
