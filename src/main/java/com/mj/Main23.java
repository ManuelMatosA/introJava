//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main23 Class
 */
public class Main23 {

    /**4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
     and prints whether they could represent the sides of a right triangle.*/

    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int a;
        int b;
        int c;

        //Prompt, entering the sides of the triangle
        System.out.println("Enter the first side: ");
        a = input.nextInt();

        System.out.println("Enter the second side: ");
        b = input.nextInt();

        System.out.println("Enter the third side: ");
        c = input.nextInt();

        //If else statements that determine the type of triangle
        if (a == b && a == c && b == c) {
            System.out.println("This is an equilateral triangle");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("This is an isosceles triangle.");
        }
        else if (a != b && a != c && b != c) {
            System.out.println("This is a scalene triangle");
        }
    }

}
