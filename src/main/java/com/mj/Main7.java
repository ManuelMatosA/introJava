package com.mj;
import java.util.Scanner;
public class Main7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num1, num2, resultado;
        System.out.println("Ingrese el numero primero");
        num1= input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        resultado =num1%num2;
        if (resultado == 0)
            System.out.println("Son multiplos");
        else
            System.out.println("No son multiplos");
    }
}
