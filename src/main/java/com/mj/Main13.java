//Namespace
package com.mj;

//Imports
import java.util.Scanner;

/**
 * Main13 Class
 */
public class Main13 {

    /**
     * (World Population Growth Calculator) Use the web to determine the current world population
     * and the annual world population growth rate. Write an application that inputs these values,
     * then displays the estimated world population after one, two, three, four and five years.
     * @param args
     */
    public static void main(String[] args) {
        //Fields
        Scanner input = new Scanner(System.in);

        //Variables
        double world, growth;
        double year1, year2, year3, year4, year5;

        System.out.println("Enter current world population");
        world = input.nextDouble();

        System.out.println("Enter annual world population growth rate");
        growth = input.nextDouble();
        growth /= 100;

        year1 = world + (world * growth);
        world = year1;
        System.out.println("World population after one year: " + year1);

        year2 = world + (world * growth);
        world = year2;
        System.out.println("World population after two years: " + year2);

        year3 = world + (world * growth);
        world = year3;
        System.out.println("World population after three years: " + year3);

        year4 = world + (world * growth);
        world = year4;
        System.out.println("World population after four years: " + year4);

        year5 = world + (world * growth);
        world = year5;
        System.out.println("World population after five years: " + year5);

    }
}
