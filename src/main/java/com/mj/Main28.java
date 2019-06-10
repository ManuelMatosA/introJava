//Namespace
package com.mj;

/**
 * Main28 Class
 */

public class Main28 {
    /**
     * 5.15 (Triangle Printing Program) Write an application that displays the following patterns separately,
     * one below the other. Use for loops to generate the patterns. All asterisks (*) should be printed
     * by a single statement of the form System.out.print( '*' ); which causes the asterisks to print
     * side by side. A statement of the form System.out.println(); can be used to move to the next line.
     * A statement of the form System.out.print( ' ' ); can be used to display a space for the last two
     * patterns. There should be no other output statements in the program. [Hint: The last two patterns
     * require that each line begin with an appropriate number of blank spaces.]
     * (a) (b) (c) (d)
     * * ********** ********** * (Sale diferente en el libro)
     * ** ********* ********* **
     * *** ******** ******** ***
     * **** ******* ******* ****
     * ***** ****** ****** *****
     * ****** ***** ***** ******
     * ******* **** **** *******
     * ******** *** *** ********
     * ********* ** ** *********
     * ********** * * **********
     */

    public static void main(String[] args) {

        for (int space = 0; space < 10; space++) {
            for (int asterisc = 0; asterisc < space + 1; asterisc++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int space = 10; space > 0; space--) {
            for (int asterisc = 0; asterisc < space - 1; asterisc++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }

        System.out.println();

        for (int space = 0; space < 10; space++) {
            for (int asterisc = 0; asterisc < space + 1; asterisc++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        System.out.println();

        for (int space = 0; space < 0; space++) {
            for (int asterisc = 1; asterisc < space + 1; asterisc++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
