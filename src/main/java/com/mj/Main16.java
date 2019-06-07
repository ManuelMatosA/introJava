//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main16 Class
 */
public class Main16 {

    /**4.18 (Credit Limit Calculator) Develop a Java application that determines whether any of several
    department-store customers has exceeded the credit limit on a charge account. For each customer,
    the following facts are available:
    a) account number
    b) balance at the beginning of the month
    c) total of all items charged by the customer this month
    d) total of all credits applied to the customer’s account this month
    e) allowed credit limit.
    The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
    customer’s credit limit. For those customers whose credit limit is exceeded, the program should display
    the message "Credit limit exceeded".*/
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int accountNumber;
        int balanceBeginning;
        int items;
        int credits;
        int allowedCredit;

        System.out.println("Enter account number");
        accountNumber = input.nextInt();

        System.out.println("Enter balance at the beginning of the month");
        balanceBeginning = input.nextInt();

        System.out.println("Enter total of all items charged by you this month");
        items = input.nextInt();

        System.out.println("Enter total of all credits applied to your account this month\n");
        credits = input.nextInt();

        System.out.println("Enter allowed credit limit");
        allowedCredit = input.nextInt();

        int balance = balanceBeginning + items - credits;

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance at the beginning of the month: " + balance);
        System.out.println("Total number of all items charged this month: " + items);
        System.out.println("Total number of Credits Applied this month: " + credits);
        System.out.println("Your new Balance is " + balance);

        if (balance < allowedCredit) {
            System.out.println("You have exceeded your credit limit.");
        }
    }
}
