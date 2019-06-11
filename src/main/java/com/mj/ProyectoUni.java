//Namespace
package com.mj;

//Imports
import java.util.Scanner;
import java.nio.charset.Charset;

/**
 * ProyectoUni Class
 */

public class ProyectoUni {

    /**
     * 1. Inicio
     * 2. // Declaración de Variables
     * INT rsp_corr, rsp_inc, rsp_blan, ptj_def
     * String nombre, cedula
     * 3. // Inicialización de Variables
     * ptj_def=0;
     * 4. Mostrar (“Este programa calcula el puntaje final de una prueba
     * aplicada”)
     * // Solicitud de Datos del Estudiante
     * 5. Mostrar (“Indique el nombre de Estudiante”)
     * 6. Leer Nombre
     * 7. Mostrar (“Indique la Cedula del Estudiante”)
     * 8. Leer Cedula
     * // Lectura de cantidad de respuestas en CORRECTAS y validación
     * 9. Mostrar (“Introduzca la cantidad de respuestas correctas”)
     * 10. Hacer
     * 10.1 Leer rsp_corr
     * 10.2 Si (rsp_corr<0)
     * 10.2.1 Mostrar (“Introdujo una cantidad errónea, ingrese nuevamente”)
     * 10.2.2 Fin Si
     * 10.3 Mientras(rsp_corr<0)
     * 10.4 Fin Hacer-Mientras
     * // Lectura de cantidad de respuestas en INCORRECTAS y validación
     * 11. Mostrar (“Introduzca la cantidad de respuestas incorrectas”)
     * 12. Hacer
     * 12.1 Leer rsp_inc
     * 12.2 Si (rsp_inc<0)
     * 12.2.1 Mostrar (“Introdujo una cantidad errónea, ingrese nuevamente”)
     * 12.2.2 Fin Si
     * 12.3 Mientras(rsp_cinc<0)
     * 12.4 Fin Hacer-Mientras
     * // Lectura de cantidad de respuestas en BLANCO y validación
     * 13. Mostrar (“Introduzca la cantidad de respuestas en blanco”)
     * 14. Hacer
     * 14.1 Leer rsp_blan
     * 14.2 Si (rsp_blan<0)
     * 14.2.1 Mostrar (“Introdujo una cantidad errónea, ingrese nuevamente”)
     * 14.2.2 Fin Si
     * 14.3 Mientras(rsp_blan<0)
     * 14.4 Fin Hacer-Mientras
     * //Impresión de reporte
     * 15. ptj_def = [(rsp_corr*4)+(rsp_inc*(-1))]
     * 16. Mostrar (“El estudiante ”, nombre)
     * 17. Mostrar (“y Cédula de Identidad ”, cedula)
     * 18. Mostrar (“Tiene el siguiente récord en la prueba:”)
     * 19. Mostrar (“- Respuestas Correctas: ”, rsp_corr)
     * 20. Mostrar (“- Respuestas Incorrectas:”, rsp_inc)
     * 21. Mostrar (“- Respuestas en Blanco:”, rsp_blan)
     * 22. Mostrar (“- Puntaje Final:”, ptj_def)
     * 23. FIN
     */

    public static void main(String[] args) {

        //Fields
        Scanner input = new Scanner(System.in, Charset.defaultCharset());

        //Variables
        int rspCorr, rspInc, rspBlan, ptjDef;
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
            rspCorr = input.nextInt();
            if (rspCorr < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rspCorr < 0);

        // Lectura de cantidad de respuestas en INCORRECTAS y validación
        System.out.println("Enter the amount of incorrect answers");

        do {
            rspInc = input.nextInt();
            if (rspInc < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rspInc < 0);

        // Lectura de cantidad de respuestas en BLANCO y validación
        System.out.println("Enter the amount of blank answers");

        do {
            rspBlan = input.nextInt();
            if (rspBlan < 0) {
                System.out.println("You have entered an aberrant amount, input again");
            }

        } while (rspBlan < 0);

        //Impresión de reporte
        ptjDef = (rspCorr * 4) + (rspInc * (-1));
        System.out.print("The student " + name);
        System.out.println(" with ID number " + id);
        System.out.println("Has the following record in the test:");
        System.out.println("- Correct answers: " + rspCorr);
        System.out.println("- Incorrect answers: " + rspInc);
        System.out.println("- Blank answers: " + rspBlan);
        System.out.println("- Final score: " + ptjDef);
    }

}
