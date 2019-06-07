package com.mj;

import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name");

        String name= sc.nextLine();

        System.out.println(name);

        System.out.println("enter age ");

        int age= sc.nextInt();

        System.out.println(age);

        System.out.println("enter id ");

        String id= sc.nextLine();

        System.out.println(id);
    }
}
