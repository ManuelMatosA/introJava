package com.mj;
import java.util.Scanner;
public class Main4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
            int num1, num2, num3, sum, avg, pro;
            System.out.println("Input first integer");
            num1 = input.nextInt();
            System.out.println("Input second integer");
            num2 = input.nextInt();
            System.out.println("Input third integer");
            num3 = input.nextInt();
        sum = num1 + num2 + num3;
            System.out.println("The sum is "+ sum);
        avg = num1 * num2 * num3;
        System.out.println("The product is "+ avg);
        pro = num1 + num2 + num3/3;
        System.out.println("The average is "+ pro);
        if (num1 > num2 && num1 > num3)
            System.out.println(num1 + " is the largest");
        if (num2 > num1 && num2 > num3)
            System.out.println(num2 + " is the largest");
        if (num3 > num2 && num3 > num1)
            System.out.println(num3 + " is the largest");
        if (num1 < num2 && num1 < num3)
            System.out.println(num1 + " is the smallest");
        if (num2 < num1 && num2 < num3)
            System.out.println(num2 + " is the smallest");
        if (num3 < num2 && num3 < num1)
            System.out.println(num3 + " is the smallest");

    }
}
