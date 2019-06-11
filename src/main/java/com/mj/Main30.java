//Namespace
package com.mj;
//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main30 Class
 */

public class Main30 {
    /**
     * 5.17 (Calculating Sales) An online retailer sells five products whose retail prices are as follows:
     * Product 1, $2.98; product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87.
     * Write an application that reads a series of pairs of numbers as follows:
     * a) product number
     * b) quantity sold
     * Your program should use a switch statement to determine the retail price for each product. It
     * should calculate and display the total retail value of all products sold. Use a sentinel-controlled
     * loop to determine when the program should stop looping and display the final results.
     */

    public static void main(String[] args) {
        //Variables
        int product;
        int sales;
        double pro1 = 2.98;
        double pro2 = 4.50;
        double pro3 = 9.98;
        double pro4 = 4.49;
        double pro5 = 6.87;
        double total = 0;


        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());


        //Prompt for number of products
        System.out.println("Enter the product you wish to buy");
        product = input.nextInt();

        //Product
        System.out.println("Enter how many of this product you wish to buy");
        sales = input.nextInt();

        switch (product) {

            case 1:
                pro1 = pro1 * sales;
                total = total + pro1;
                System.out.println("Your total is " + total);
                break;

            case 2:
                pro2 = pro2 * sales;
                total = total + pro2;
                System.out.println("Your total is " + total);
                break;

            case 3:
                pro3 = pro3 * sales;
                total = total + pro3;
                System.out.println("Your total is " + total);
                break;

            case 4:
                pro4 = pro4 * sales;
                total = total + pro4;
                System.out.println("Your total is " + total);
                break;

            case 5:
                pro5 = pro5 * sales;
                total = total + pro5;
                System.out.println("Your total is " + total);
                break;

            default:
                System.out.println("You have entered an invalid product number");
                break;
    }
    }
}
