package com.mj;

public class Main31 {
    /**
     * 5.18 (Modified Compound-Interest Program) Modify the application in Fig. 5.6 to use only integers
     * to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
     * of pennies. Then break the result into its dollars and cents portions by using the division and remainder
     * operations, respectively. Insert a period between the dollars and the cents portions.]
     *
     * @param args
     */

    public static void main(String[] args) {

        double principal = 1000.0; // initial amount before interest
        double rate = 0.05; // interest rate

        // display headers
        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years
        for (int year = 1; year <= 10; ++year) {
            // calculate new amount on deposit for specified year
            double amount = principal * Math.pow(1.0 + rate, year);

            // display the year and the amount
            System.out.printf("%4d%,20.2f%n", year, amount);
        }
    }
}
