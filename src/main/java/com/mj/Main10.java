//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main10 Class
 */
public class Main10 {

    /**
     * 2.30 (Separating the Digits in an Integer) Write an application that inputs one number consisting
     * of five digits from the user, separates the number into its individual digits and prints the digits
     * separated from one another by three spaces each. For example, if the user types in the number 42339,
     * the program should print
     * Assume that the user enters the correct number of digits. What happens when you execute the
     * program and type a number with more than five digits? What happens when you execute the program
     * and type a number with fewer than five digits? [Hint: It’s possible to do this exercise with the
     * techniques you learned in this chapter. You’ll need to use both division and remainder operations
     * to “pick off ” each digit.]
     */
    public static void main (String[] args){

        //Fields
        Scanner input = new Scanner (System.in);

        //Variables
        int num;

        //Prompt, input numbers
        System.out.println("Enter a number that has exactly five digits");
        num = input.nextInt();

        //If statements
        if ( (num >= 10000) && (num <= 99999) ) {
            System.out.print(num / 10000 + " ");
            System.out.print(num / 1000 % 10 + " ");
            System.out.print(num / 100 % 10 + " ");
            System.out.print(num / 10 % 10 + " ");
            System.out.print(num % 10 );
        }

        if ( num > 99999){
            System.out.println("Enter less than five digits");
        }

        if ( num < 10000){
            System.out.println("Enter more than five digits");
        }

    }
}
