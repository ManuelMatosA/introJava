package com.mj;
import java.util.Scanner;
public class Main3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int int1;
        int int2;
        System.out.println("Ingrese el primer entero");
        int1 = input.nextInt();
        System.out.println("Ingrese el segundo entero");
        int2 = input.nextInt();
if (int1 > int2)
    System.out.println(int1 + " es mas grande que " + int2);
if (int1 < int2)
    System.out.println(int2 + " es mas grande que " + int1);
if (int1 == int2)
    System.out.println("Estos numeros son iguales");
    }
}
