//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main29 Class
 */
public class Main29 {
    /**
     * 5.16 (Bar Chart Printing Program) One interesting application of computers is to display
     * graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
     * number that’s read, your program should display the same number of adjacent asterisks. For example,
     * if your program reads the number 7, it should display *******. Display the bars of asterisks after
     * you read all five numbers.
     */
    public static void main (String[] args) {

        //Variables
        int number;
        int counter = 0;

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        System.out.println("Input the number yoy want to convert into a bar chart");
        number = input.nextInt();
        do {
            System.out.print("*");
            counter++;
        } while(number > counter);

    }
}
