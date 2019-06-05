//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main4 Class
 */
public class Main4 {

    /**
     * (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
     * user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
     * shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
     * representation of the average. So, if the sum of the values is 7, the average should be 2, not
     * 2.3333….]
     * @param args
     */
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in);

        //Variables
        int num1, num2, num3, sum, avg, pro;

        //Prompt, input numbers
        System.out.println("Input first integer");
        num1 = input.nextInt();

        System.out.println("Input second integer");
        num2 = input.nextInt();

        System.out.println("Input third integer");
        num3 = input.nextInt();

        //Calculate sum operator
        sum = num1 + num2 + num3;
        System.out.println("The sum is " + sum);

        //Calculate product operator
        pro = num1 * num2 * num3;
        System.out.println("The product is " + pro);

        //Calculate average
        avg = num1 + num2 + num3 / 3;
        System.out.println("The average is " + avg);

        //If statements that calculate if an integer is the largest
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is the largest");
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is the largest");
        }
        if (num3 > num2 && num3 > num1) {
            System.out.println(num3 + " is the largest");
        }
        //If statements that calculate if an integer is the smallest
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest");
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2 + " is the smallest");
        }
        if (num3 < num2 && num3 < num1) {
            System.out.println(num3 + " is the smallest");
        }
    }
}
