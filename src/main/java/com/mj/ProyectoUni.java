//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

public class ProyectoUni {

    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int rsp_corr, rsp_inc, rsp_blan, ptj_def;
        String name, id;

        // Solicitud de Datos del Estudiante
        System.out.println("This program calculates the final score of an applied test");
        System.out.println();
        System.out.println("Enter the name of the student");
        name = input.nextLine();
        System.out.println("Enter their ID");
        id = input.nextLine();

        // Lectura de cantidad de respuestas en CORRECTAS y validación
        System.out.println("Enter the amount of correct answers");
        do {
            rsp_corr = input.nextInt();
            if (rsp_corr < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rsp_corr < 0);

        // Lectura de cantidad de respuestas en INCORRECTAS y validación
        System.out.println("Enter the amount of incorrect answers");

        do{
            rsp_inc = input.nextInt();
            if (rsp_inc < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rsp_inc < 0);

        // Lectura de cantidad de respuestas en BLANCO y validación
        System.out.println("Enter the amount of blank answers");

        do{
            rsp_blan = input.nextInt();
            if (rsp_blan < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rsp_blan < 0);

        //Impresión de reporte
        ptj_def = (rsp_corr*4)+(rsp_inc*(-1));
        System.out.print("The student " + name);
        System.out.println(" with ID number " + id);
        System.out.println("Has the following record in the test:");
        System.out.println("- Correct answers: " + rsp_corr);
        System.out.println("- Incorrect answers: " + rsp_inc);
        System.out.println("- Blank answers: " + rsp_blan);
        System.out.println("- Final score: " + ptj_def);
    }

}
