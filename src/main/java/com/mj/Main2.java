//Namespace
package com.mj;

/**
 * Main2 Class
 */
public class Main2 {

    /**
     * Write an application that displays the numbers 1 to 4 on the same line, with each pair of
     * adjacent numbers separated by one space. Use the following techniques:
     * a) Use one System.out.println statement.
     * b) Use four System.out.print statements.
     * c) Use one System.out.printf statement.
     * @param args
     */
    public static void main(String[] args) {

        //Variables
        byte num1 = 1;
        byte num2 = 2;
        byte num3 = 3;
        byte num4 = 4;


        //Line A operation
        System.out.println(num1 + " " + num2 + " " + num3 + " " + num4);

        //Line B operation
        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        System.out.print(num3 + " ");
        System.out.print(num4 + "\n");

        //Line C operation
        System.out.printf("%d %d %d %d", num1, num2, num3, num4);
        }
}
