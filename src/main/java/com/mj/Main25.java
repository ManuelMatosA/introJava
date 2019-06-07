//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main25 Class
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")

public class Main25 {

    /**
     * 4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of
     * three employees. The company pays straight time for the first 40 hours worked by each employee
     * and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
     * number of hours worked last week and their hourly rates. Your program should input this information
     * for each employee, then determine and display the employee’s gross pay. Use class Scanner to
     * input the data.
     */
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        float hours = 0;
        float rate;
        float salary;
        float excess;
        float newPay;

        System.out.println("Welcome! Calculate weekly salaries for your employees");

        while (hours != -5) {

            System.out.println("Input the numbers of hours worked, enter -5 to quit");
            hours = input.nextFloat();

            System.out.println("Input the hourly rate");
            rate = input.nextFloat();

            salary = rate * hours;

            if (salary < 40) {
                System.out.println("Your salary is " + salary);
            } else if (hours > 40) {
                excess = hours - 40;
                newPay = ( 40 * rate ) + ( excess * rate );
                System.out.println("Your salary is " + newPay);
            }

        }
    }
}