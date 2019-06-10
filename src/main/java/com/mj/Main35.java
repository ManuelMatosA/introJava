//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main35 Class
 */
public class Main35 {
    public static void main(String[] args)
    {
        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        byte response;
        int counter1 = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        int finalAnswer = 0;

        System.out.println("Welcome to this true or false climate change quiz. Enter 1 for true or 2 for false.");
        System.out.println();
        System.out.println("True or False: Wasting less food is a way to reduce greenhouse gas emissions.");
        response = input.nextByte();

        switch (response) {

            case 1:
                System.out.println("Correct!");
                counter1++;
                break;

            case 2:
                System.out.println("WRONG ANSWER.");
                break;

        }
        System.out.println("True or False: Global warming is caused only by natural factors.");

        response = input.nextByte();

        switch (response) {

            case 1:
                System.out.println("Correct!");
                counter2++;
                break;

            case 2:
                System.out.println("WRONG ANSWER.");
                break;

        }

        System.out.println("True or False:\nEleven percent of all global greenhouse gas emissions caused by humans are caused by deforestation.");
        response = input.nextByte();

        switch (response) {

            case 1:
                System.out.println("Correct!");
                counter3++;
                break;

            case 2:
                System.out.println("WRONG ANSWER.");
                break;

        }
        System.out.println("True or False: Tropical forests are incredibly effective at storing carbon,\nproviding at least 30% of action needed to prevent the worst climate change scenarios.\nYet nature-based solutions only receive only 2% of all climate funding.");

        response = input.nextByte();

        switch (response) {

            case 1:
                System.out.println("Correct!");
                counter4++;
                break;

            case 2:
                System.out.println("WRONG ANSWER.");
                break;

        }

        System.out.println("True or False:\nConserving ecosystems is often more cost-effective than human-made interventions. ");

        response = input.nextByte();

        switch (response) {

            case 1:
                System.out.println("Correct!");
                counter5++;
                break;

            case 2:
                System.out.println("WRONG ANSWER.");
                break;

        }

        finalAnswer = finalAnswer + counter1 + counter2 + counter3 + counter4 + counter5;

        switch (finalAnswer) {

            case 0:
                System.out.println("Are you kidding me?\n" +
                        "I hope you're one of the first to die when earth kills us all");
                break;

            case 1:
                System.out.println("Get educated, you waste of a human being.");
                break;

            case 2:
                System.out.println("2 out of 5... I guess you've been watching a lot of Fox News.\n" +
                        "You stupid redneck");
                break;

            case 3:
                System.out.println("You know some stuff!\n" +
                        "But still not enough to save us...");
                break;

            case 4:
                System.out.println("Good... but not great.");
                break;

            case 5:
                System.out.println("Congratulations! You answered everything correctly! People like you are the only ones that matter!");
                break;
        }

    }
}
