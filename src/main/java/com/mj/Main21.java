//Namespace
package com.mj;

/**
 * Main21 Class
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class Main21 {
    /**4.33 (Multiples of 2 with an Infinite Loop) Write an application that keeps displaying in the
     command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
     should not terminate (i.e., it should create an infinite loop). What happens when you run this program?*/

    public static void main(String[] args) {

        //Variables
        int n = 2;

        while (true) {
            System.out.println(n * 2);
            n = n + 2;
        }
    }

}
