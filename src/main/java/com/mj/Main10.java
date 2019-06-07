//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main10 Class
 */
@SuppressWarnings("PMD.AvoidLiteralsInIfCondition")
public class Main10 {

    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int num;

        //Prompt, input numbers
        System.out.println("Enter a number that has exactly five digits");
        num = input.nextInt();

        //If statements
        if ((num >= 10000) && (num <= 99999)) {
            System.out.print(num / 10000 + " ");
            System.out.print(num / 1000 % 10 + " ");
            System.out.print(num / 100 % 10 + " ");
            System.out.print(num / 10 % 10 + " ");
            System.out.print(num % 10);
        }

        if (num > 99999) {
            System.out.println("Enter less than five digits");
        }

        if (num < 10000) {
            System.out.println("Enter more than five digits");
        }

    }
}
