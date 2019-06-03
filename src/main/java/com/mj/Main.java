
//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main Class
 */
public class Main {

    /**
     * (Arithmetic) Write an application that asks the user to enter two integers, obtains them from the user and prints their sum, product,
     * difference and quotient (division). Use the techniques shown in Fig. 2.7.
     * @param args
     */
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in);

        //Variables
        int number1;
        int number2;
        int sum, res, mul, div, cos;

        //Input numbers
        System.out.println("Enter first number");
        number1 = input.nextInt();

        System.out.println("Enter second number");
        number2 = input.nextInt();

        //Calculate sum operation
        sum = number1 + number2;
        System.out.println("The Sum is ["+sum+"]: ");

        //Calculate res operation
        res = number1 - number2;
        System.out.println("The rest is ["+res+"]: ");

        //Calculate mul operation
        mul = number1 * number2;
        System.out.println("The mul is ["+mul+"]: ");

        //Calculate div operation
        div = number1 / number2;
        System.out.println("The div is ["+div+"]: ");

        //Calculate cos operation
        cos = number1 % number2;
        System.out.println("The cos is ["+cos+"]: ");

    }
}