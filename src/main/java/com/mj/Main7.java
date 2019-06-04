//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main7 Class
 */

public class Main7 {

    public static void main (String[] args){

        /**
         * (Multiples) Write an application that reads two integers, determines whether the first is a
         * multiple of the second and prints the result. [Hint: Use the remainder operator.]
         */

        //Fields
        Scanner input = new Scanner(System.in);

        //Variables
        int num1, num2, result;

        //Prompt, input numbers
        System.out.println("Input first number");
        num1= input.nextInt();

        System.out.println("Input second number");
        num2 = input.nextInt();

        //Calculate remainder operator
        result = num1%num2;

        //If else statement to indicate if the integers are multiples or not
        if (result == 0)
            System.out.println("These are multiples");
        else
            System.out.println("Not multiples");
    }
}
