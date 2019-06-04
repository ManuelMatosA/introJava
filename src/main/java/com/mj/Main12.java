//Namespace
package com.mj;

//Imports
import java.util.Scanner;

    /**
     * Main12 Class
     */
    public class Main12 {
        /**
         * 2.32 (Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
         * and prints the number of negative numbers input, the number of positive numbers input and
         * the number of zeros input.
         */
        public static void main(String[] args) {

            //Variables
            int num1, num2, num3, num4, num5;
            int pos = 0;
            int neg = 0;
            int cero = 0;

            //Fields
            Scanner input = new Scanner(System.in);

            //Prompt, input numbers
            System.out.println("Enter first integer: ");
            num1 = input.nextInt();

            System.out.println("Enter second integer: ");
            num2 = input.nextInt();

            System.out.println("Enter third integer: ");
            num3 = input.nextInt();

            System.out.println("Enter fourth integer: ");
            num4 = input.nextInt();

            System.out.println("Enter fifth integer: ");
            num5 = input.nextInt();

            //If statements that keep track of how many positives are there
            if (num1 > 0) {
                pos = pos + 1;
            }
            if (num2 > 0) {
                pos = pos + 1;
            }
            if (num3 > 0) {
                pos = pos + 1;
            }

            if (num4 > 0) {
                pos = pos + 1;
            }

            if (num5 > 0) {
                pos = pos + 1;
            }

            //If statements that keep track of how many negatives are there
            if (num1 < 0) {
                neg = neg + 1;


                if (num2 < 0)
                    neg = neg + 1;

                if (num3 < 0)
                    neg = neg + 1;

                if (num4 < 0)
                    neg = neg + 1;

                if (num5 < 0)
                    neg = neg + 1;

                // If statements that keep track of how many zeros are there
                if (num1 == 0)
                    cero = cero + 1;

                if (num2 == 0)
                    cero = cero + 1;

                if (num3 == 0)
                    cero = cero + 1;

                if (num4 == 0)
                    cero = cero + 1;

                if (num5 == 0)
                    cero = cero + 1;

                //Print the results
                System.out.println("Total positive numbers: " + pos);
                System.out.println("Total negative numbers: " + neg);
                System.out.println("Total zero numbers: " + cero);
            }
        }
    }

