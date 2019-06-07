//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main17 Class
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class Main17 {

    /**(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
    The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
    salesperson who sells $5000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
    total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
    these items are as follows:
        Item    Value
        1       239.99
        2       129.75
        3       99.95
        4       350.89
     Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
     displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.*/
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int commission, earning, sale;
        int item = 0;

        while (true) {
            System.out.println("Enter sale or -5 to quit the program");
            sale = input.nextInt();
            ++item;

            if (sale == -5) {
                System.out.println("Thank you for using our program");
            }
        }

    }
}
