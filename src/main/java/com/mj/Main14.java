//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main14 Class
 */
public class Main14 {
    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in);

        //Variables
        int parking, tolls, milesPerGallon, totalMiles;
        float gasoline;
        double drivingCost;

        System.out.println("Application that calculates your daily driving cost,\n" +
                "so that you can estimate how much money could be saved by car pooling,\n" +
                "which also has other advantages such as reducing carbon emissions and reducing traffic congestion.");

        System.out.println("Enter total miles driven a day");
        totalMiles = input.nextInt();
        System.out.println("Enter $ per gallon of gasoline");
        gasoline = input.nextFloat();

        System.out.println("Enter Parking fees");
        parking = input.nextInt();

        System.out.println("Enter Tolls per day");
        tolls = input.nextInt();

        System.out.println("Enter miles per gallon");
        milesPerGallon = input.nextInt();

        drivingCost = (totalMiles / milesPerGallon) * gasoline + tolls + parking;

        System.out.println("Your daily driving cost is " + drivingCost + "$");


    }
}
