/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Principal;

import Edu.AlejoZepol.Punto1.Punto1;
import Edu.AlejoZepol.punto2.Punto2;
import Edu.AlejoZepol.punto3.Punto3;
import Edu.AlejoZepol.punto4.Punto4;
import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class TallerColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numeroPunto;

        do {
            System.out.println("Por favor seleccione el punto a ejecutar escribiendo el numero de 1 al 4");
            Scanner entradaEscaner = new Scanner(System.in);
            numeroPunto = entradaEscaner.nextInt();
            if (numeroPunto == 1) {
                Punto1.Punto1();

            } else if (numeroPunto == 2) {
                Punto2.punto2();

            } else if (numeroPunto == 3) {
                Punto3.punto3();

            } else if (numeroPunto == 4) {
                Punto4.punto4();
            } else {
                System.err.println("Intente de Nuevo");
            }
        } while (numeroPunto >= 5 || numeroPunto <= 0);
    }
}
