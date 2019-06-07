//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main15 Class
 */
@SuppressWarnings("PMD.DataflowAnomalyAnalysis")
public class Main15 {

    /**
     * 4.17 (GasMileage) Drivers are concerned with the mileage their automobiles get. One driver has
     * kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
     * a Java application that will input the miles driven and gallons used (both as integers) for each trip.
     * The program should calculate and display the miles per gallon obtained for each trip and print the
     * combined miles per gallon obtained for all trips up to this point. All averaging calculations should
     * produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
     * data from the user.
     */
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int miles;
        int gallons;
        int mpg;
        int totalMiles = 0;
        int totalGallons = 0;

        //Prompt
        System.out.println("Enter set of miles travelled or type\nor type -5 to quit the program");
            miles = input.nextInt();

        System.out.println("Enter amount of gallons that the tank filled up with\nor type -5 to quit the program");
            gallons = input.nextInt();

        if (miles != -5 && gallons != -5) {
            totalMiles += miles;
            totalGallons += gallons;
        }
        else {
            System.out.println("Thank you for using the calculator.");
        }

        if (miles != 0 && gallons != 0) {
            mpg = totalMiles / totalGallons;
            System.out.println("Your cars MPG is: " + mpg);
        }
        else {
            System.out.println("No miles or gallons entered");
        }


    }
}
