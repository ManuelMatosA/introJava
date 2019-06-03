package com.mj;
import java.util.Scanner;
public class Main9{

    public static void main(String[] args){
        System.out.println("This will calculate the area, diameter and circumference of a circle");
        Scanner input = new Scanner(System.in);
        double radius, diameter;
        double circumference, area;
        System.out.println("Please enter the radius: ");
        radius =  input.nextDouble();
        diameter = 2*radius;
        circumference = 2*Math.PI*radius;
        area = Math.PI*radius*radius;
        System.out.println("The diameter is " + diameter);
        System.out.println("The circumference is " + circumference);
        System.out.println("The area is " + area);
    }
}