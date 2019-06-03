package com.mj;
import java.util.Scanner;
public class Main6 {
    public static void main (String[] args){
        Scanner input = new Scanner( System.in );
        int int1, int2, int3, int4, int5;
        System.out.println("Enter first integer");
        int1 = input.nextInt();
        System.out.println("Enter second integer");
        int2 = input.nextInt();
        System.out.println("Enter third integer");
        int3 = input.nextInt();
        System.out.println("Enter fourth integer");
        int4 = input.nextInt();
        System.out.println("Enter fifth integer");
        int5 = input.nextInt();
        if (int1 > int2 && int1 > int3 && int1 > int4 && int1 > int5)
            System.out.println(int1 + " is the largest");
        if (int2 > int1 && int2 > int3 && int2 > int4 && int2 > int5)
            System.out.println(int2 + " is the largest");
        if (int3 > int1 && int3 > int2 && int3 > int4 && int3 > int5)
            System.out.println(int3 + " is the largest");
        if (int4 > int1 && int4 > int2 && int4 > int3 && int4 > int5)
            System.out.println(int4 + " is the largest");
        if (int5 > int1 && int5 > int2 && int5 > int3 && int5 > int4)
            System.out.println(int5 + " is the largest");
        if (int1 < int2 && int1 < int3 && int1 < int4 && int1 < int5)
            System.out.println(int1 + " is the smallest");
        if (int2 < int1 && int2 < int3 && int2 < int4 && int2 < int5)
            System.out.println(int2 + " is the smallest");
        if (int3 < int1 && int3 < int2 && int3 < int4 && int3 < int5)
            System.out.println(int3 + " is the smallest");
        if (int4 < int1 && int4 < int2 && int4 < int3 && int4 < int5)
            System.out.println(int4 + " is the smallest");
        if (int5 < int1 && int5 < int2 && int5 < int3 && int5 < int4)
            System.out.println(int5 + " is the smallest");



    }
}
