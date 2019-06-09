//Namespace
package com.mj;

/**
 * Main27 Class
 */
public class Main27 {

    /**
     * 5.13 (Factorials) Factorials are used frequently in probability problems. The factorial of a positive
     * integer n (written n! and pronounced “n factorial”) is equal to the product of the positive integers from
     * 1 to n.Write an application that calculates the factorials of 1 through 20. Use type long. Display the
     * results in tabular format. What difficulty might prevent you from calculating the factorial of 100?
     */

    public static void main(String[] arg) {

        //Variable
        long factorial = 1;

        //For loop that multiplies the factorial and prints it on screen
        for (int counter = 1; counter <= 20; counter++) {
            factorial *= counter;
            System.out.println(factorial);

        }

    }

}
