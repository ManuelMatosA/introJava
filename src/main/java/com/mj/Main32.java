//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * Main32 Class
 */
@SuppressWarnings("PMD.AvoidDuplicateLiterals")
public class Main32 {
    /**
     * 5.29 (“The Twelve Days of Christmas” Song) Write an application that uses repetition and
     * switch statements to print the song “The TwelveDays of Christmas.” One switch statement should
     * be used to print the day (“first,” “second,” and so on). A separate switch statement should be used
     * to print the remainder of each verse. Visit the website en.wikipedia.org/wiki/The_Twelve_Days_
     * of_Christmas_(song) for the lyrics of the song.
     */

    public static void main(String[] args) {

        //Variables
        int song;

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Prompt to enter the day
            System.out.println("Enter the day");
            song = input.nextInt();

            //Switch statement for the days
            switch (song) {
                case 1:
                    System.out.println("On the first day of Christmas my true love gave to me,");
                    break;
                case 2:
                    System.out.println("On the second day of Christmas my true love gave to me,");
                    break;
                case 3:
                    System.out.println("On the third day of Christmas my true love gave to me,");
                    break;
                case 4:
                    System.out.println("On the fourth day of Christmas my true love gave to me,");
                    break;
                case 5:
                    System.out.println("On the fifth day of Christmas my true love gave to me,");
                    break;
                case 6:
                    System.out.println("On the sixth day of Christmas my true love gave to me,");
                    break;
                case 7:
                    System.out.println("On the seventh day of Christmas my true love gave to me,");
                    break;
                case 8:
                    System.out.println("On the eight day of Christmas my true love gave to me,");
                    break;
                case 9:
                    System.out.println("On the ninth day of Christmas my true love gave to me,");
                    break;
                case 10:
                    System.out.println("On the tenth day of Christmas my true love gave to me,");
                    break;
                case 11:
                    System.out.println("On the eleventh day of Christmas my true love gave to me,");
                    break;
                case 12:
                    System.out.println("On the twelfth day of Christmas my true love gave to me,");
                    break;
                default :
                    System.out.println("Enter a correct day");
                    break;
            }

            //Switch for the verse
            switch (song) {
                case 1:
                    System.out.println("A partridge in a pear tree.");
                    break;
                case 2:
                    System.out.println("Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 3:
                    System.out.println("Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 4:
                    System.out.println("Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 5:
                    System.out.println("Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 6:
                    System.out.println("Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 7:
                    System.out.println("Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 8:
                    System.out.println("Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 9:
                    System.out.println("Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 10:
                    System.out.println("Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 11:
                    System.out.println("Eleven pipers piping,\n" +
                            "Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                case 12:
                    System.out.println("Twelve drummers drumming\n" +
                            "Eleven pipers piping,\n" +
                            "Ten lords a-leaping,\n" +
                            "Nine ladies dancing,\n" +
                            "Eight maids a-milking,\n" +
                            "Seven swans a-swimming,\n" +
                            "Six geese a-laying,\n" +
                            "Five gold rings,\n" +
                            "Four calling birds,\n" +
                            "Three French hens,\n" +
                            "Two turtle doves,\n" +
                            "And a partridge in a pear tree.");
                    break;
                default :
                    System.out.println("Please try again.");
                    break;
            }
        }
    }

