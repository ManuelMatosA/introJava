package com.mj;

public class Main2 {
    public static void main (String[] args){
        byte num1 = 1;
        byte num2 = 2;
        byte num3 = 3;
        byte num4 = 4;
            System.out.println("Use one System.out.println statement.");
        System.out.println(num1+ " " + num2+ " " + num3+ " " + num4);
            System.out.print("Use four System.out.print statements.\n");
        System.out.print(num1+ " ");
        System.out.print(num2+ " ");
        System.out.print(num3+ " ");
        System.out.print(num4+ "\n");
        System.out.printf("%s\n", "Use one System.out.printf statement.");
        System.out.printf("%d %d %d %d", num1,num2,num3,num4);
        }
}
