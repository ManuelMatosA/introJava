//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main24 Class
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class Main24 {

    /**
     * (Find the Two Largest Numbers) Using an approach similar to that for Exercise 4.21, find
     * the two largest values of the 10 values entered. [Note: You may input each number only once.]
     */
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int number;
        int counter = 0;
        int largestNum = 0;
        int largest2 = 0;

        System.out.println("Will you have the BIGGEST number? Let's find out!");

        while (counter < 10) {

            System.out.println("Enter your number: ");
            number = input.nextInt();
            counter++;

            if (number > largestNum) {
                largest2 = largestNum;
                largestNum = number;
            }

            if (number < largestNum) {
                if (number > largest2) {
                    largest2 = number;
                }
            }

            System.out.println("The largest number is " + largestNum);
            System.out.println("The second largest number is " + largest2);
        }
    }
}
