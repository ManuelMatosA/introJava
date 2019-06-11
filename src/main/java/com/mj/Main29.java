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
    public static void main(String[] args) {

        //Variables
        int number;
        int number2;
        int number3;
        int number4;
        int number5;

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Prompt
        System.out.println("Input the first number you want to convert into a bar chart");
        number = input.nextInt();
        System.out.println("Input the second number you want to convert into a bar chart");
        number2 = input.nextInt();
        System.out.println("Input the third number you want to convert into a bar chart");
        number3 = input.nextInt();
        System.out.println("Input the fourth number you want to convert into a bar chart");
        number4 = input.nextInt();
        System.out.println("Input the fifth number you want to convert into a bar chart");
        number5 = input.nextInt();

        //
        for (int counter = 0; number > counter; counter++) {
            System.out.print("*\n");
            System.out.print("*\n");
            System.out.print("*\n");
            System.out.print("*\n");
            System.out.print("*\n");
        }
        for (int counter1 = 0; number2 > counter1; counter1++) {
            System.out.print("*\n"); }

        for (int counter3 = 0; number3 > counter3; counter3++) {
            System.out.println("*"); }

        for (int counter1 = 0; number4 > counter1; counter1++) {
            System.out.println("*"); }

        for (int counter4 = 0; number5 > counter4; counter4++) {
            System.out.println("*"); }
        }



    }

