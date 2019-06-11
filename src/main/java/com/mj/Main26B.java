//Namespace
package com.mj;

/**
 * Main26 Class
 */

public class Main26B {
    public static void main(String[] args) {

        //Variables
        int product = 1;

        //For loop that creates counter
        for (int counter = 1; counter <= 15; counter++) {
            if (counter % 2 != 0) {
                product *= counter;
                System.out.println("Counter is " + counter);
                System.out.println("Product is " + product);
            }
            else if (counter % 2 == 0){
                continue;
            }

        }

    }
}
