//Namespace
package com.mj;

/**
 * Main21 Class
 */
public class Main20 {

    /**
     * 4.34 (What’s Wrong with This Code?) What is wrong with the following statement? Provide the
     * correct statement to add one to the sum of x and y.
     * System.out.println( ++(x + y) );
     */
    public static void main(String[] args) {

        int x = 2;
        int y = 4;
        int result;

        //System.out.println(++(x + y));
        result = x + y;

        System.out.println(++result);

    }

}
