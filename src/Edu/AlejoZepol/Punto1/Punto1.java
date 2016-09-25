/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Punto1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Punto1 {

    public static void Punto1() {
        List<ListadoNumero> numeros = new ArrayList<>();
        boolean terminar = false;
        int pregunta;

//        System.err.println("Explicacion del Punto 1: \n"
//                + "Use la interfaz List<E> para guardar una lista de números. \n"
//                + "Los números se ingresarán a través de teclado hasta que se ingrese el numero 1 y los números ingresados se transformarán en \n"
//                + "enteros con el método parseInt() o valueOf() de la clase Integer, para luego añadirlos al final de la lista con el método add().\n"
//                + "Imprima el número de elementos leídos.\n"
//                + "Luego eleve todos al cuadrado (use get() y set()).\n"
//                + "Recorra la lista y suprima los números mayores de 100 (use iterator).\n"
//                + "Ahora ordénelos (use sort() de la clase Collections)."
//                + "Una1 vez hecho esto, saque (use remove()) de la lista los números, respetando su nuevo orden e imprímalos.  \n");
        System.out.println("Por favor Ingrese el numero a almacenar");
        Scanner entradaScaner = new Scanner(System.in);
        String entrada = "";

        while (!entrada.equals("fin")) {
            entrada = entradaScaner.next();
            int numero;
            numero = Integer.parseInt(entrada);
            numeros.add(new ListadoNumero(numero));
        }

        System.out.println("***FIN Ingreso Numero***-");
        for (int j = 0; j < numeros.size(); j++) {
            ListadoNumero resultado = numeros.get(j);
            System.out.println(resultado.getNumero());

        }
        System.out.println("-Fin Impresion de Numeros---");
        for (int i = 0; i < numeros.size(); i++) {
            ListadoNumero resultado = numeros.get(i);
            int d = (int) (Math.pow(resultado.getNumero(), 2));
            ListadoNumero convertir = new ListadoNumero(d);
            numeros.set(i, convertir);

        }
        for (int k = 0; k < numeros.size(); k++) {
            ListadoNumero nuevo = numeros.get(k);
            System.out.println(nuevo.getNumero());
        }

        System.out.println("Fin Impresion Conversion");

        for (int k = 0; k < numeros.size(); k++) {
            ListadoNumero eliminar = numeros.get(k);
            if (eliminar.getNumero() > 100) {
//                numeros.remove(k);
//                System.out.println(eliminar);
//                 System.out.println("-if------------------------------");
            }

        }

        Iterator<ListadoNumero> iteLista = numeros.iterator();
        while (iteLista.hasNext()) {
            ListadoNumero elemento = iteLista.next();
            System.out.println(elemento);

        }
        System.out.println("***Fin Itinerador***");

        Collections.sort(numeros);

        System.out.println("***Fin sort***");
        numeros.stream().forEach((temp) -> {
            System.out.println(temp);
        });
    }

}
