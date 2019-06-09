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
        String nombre, cedula;

        // Solicitud de Datos del Estudiante
        System.out.println("Este programa calcula el puntaje final de una prueba aplicada");
        System.out.println();
        System.out.println("Indique el nombre de Estudiante");
        nombre = input.nextLine();
        System.out.println("Indique la cedula del Estudiante");
        cedula = input.nextLine();

        // Lectura de cantidad de respuestas en CORRECTAS y validación
        System.out.println("Introduzca la cantidad de respuestas correctas");
        do {
            rsp_corr = input.nextInt();
            if (rsp_corr < 0) {
                System.out.println("Introdujo una cantidad errónea, ingrese nuevamente");
            }

        } while (rsp_corr < 0);

        // Lectura de cantidad de respuestas en INCORRECTAS y validación
        System.out.println("Introduzca la cantidad de respuestas incorrectas");

        do{
            rsp_inc = input.nextInt();
            if (rsp_inc < 0) {
                System.out.println("Introdujo una cantidad errónea, ingrese nuevamente");
            }

        } while (rsp_inc < 0);

        // Lectura de cantidad de respuestas en BLANCO y validación
        System.out.println("Introduzca la cantidad de respuestas en blanco");

        do{
            rsp_blan = input.nextInt();
            if (rsp_blan < 0) {
                System.out.println("Introdujo una cantidad errónea, ingrese nuevamente");
            }

        } while (rsp_blan < 0);

        //Impresión de reporte
        ptj_def = (rsp_corr*4)+(rsp_inc*(-1));
        System.out.print("El estudiante " + nombre);
        System.out.println(" con Cédula de Identidad " + cedula);
        System.out.println("Tiene el siguiente récord en la prueba:");
        System.out.println("- Respuestas Correctas: " + rsp_corr);
        System.out.println("- Respuestas Incorrectas: " + rsp_inc);
        System.out.println("- Respuestas en Blanco: " + rsp_blan);
        System.out.println("- Puntaje Final: " + ptj_def);
    }

}
