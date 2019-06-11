//Namespace
package com.mj;

/**
 * Main26 Class
 */
@SuppressWarnings("DataflowAnomalyAnalysis")
public class Main26 {

    /**
     * 5.12 (Calculating the Product of Odd Integers) Write an application that calculates the product
     * of the odd integers from 1 to 15.
     */
    public static void main(String[] args) {

        //Variables
        int product = 1;

        //For loop that creates counter
        for (int counter = 1; counter <= 15; counter += 2) {
        product *= counter;
            System.out.println("Counter is " + counter);
            System.out.println("Product is " + product);
        }
    }
}
