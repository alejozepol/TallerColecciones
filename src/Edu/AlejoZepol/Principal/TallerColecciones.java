/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Principal;

import Edu.AlejoZepol.Punto1.Punto1;
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
                System.err.println("2");

            } else if (numeroPunto == 3) {
                System.err.println("3");

            } else if (numeroPunto == 4) {
                System.err.println("4");
            } else {
                System.err.println("Intente de Nuevo");
            }
        } while (numeroPunto >= 5 || numeroPunto <=0);
    }
}
