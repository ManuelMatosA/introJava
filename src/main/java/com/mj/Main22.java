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
        int finalResult;

        //Prompt the user to enter the hypotenuse
        System.out.println("Enter the hypotenuse");
        hipotenusa = input.nextInt();

        //Prompt the user to enter side A
        System.out.println("Enter side A");
        a = input.nextInt();

        //Prompt the user to enter side B
        System.out.println("Enter side B");
        b = input.nextInt();

        //Calculate the result
        result = (a * a) + (b * b);
        raiz = hipotenusa * hipotenusa;
        finalResult = result / raiz;

        //Ignore
        System.out.println(finalResult);

        /**if () {
         * //Me tienes que explicar que puedo poner de condicional para poder terminarlo
            System.out.println("It is a right triangle");
            else {
                System.out.println("It is not a right triangle");
         */
            }
        }


