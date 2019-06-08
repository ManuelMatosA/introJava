//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main22 Class
 */
public class Main22 {

    /**
     * 4.36 (Sides of a Right Triangle) Write an application that reads three nonzero integers and determines
     * and prints whether they could represent the sides of a right triangle.
     * @param args
     */
    public static void main(String[] args) {
        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int a;
        int b;
        int hipotenusa;
        int result;
        int raiz;

        System.out.println("Enter the hypotenuse");
        hipotenusa = input.nextInt();

        System.out.println("Enter side A");
        a = input.nextInt();

        System.out.println("Enter side B");
        b = input.nextInt();

        result = (a * a) + (b * b);
        raiz = hipotenusa * hipotenusa;
        result = result / raiz;

        /**if () {
            System.out.println("It is a right triangle");
            else {
                System.out.println("It is not a right triangle");
         */
            }
        }


