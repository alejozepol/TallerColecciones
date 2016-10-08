/**
 * *  Esta clase representa la logica del negocio para el desarrollo del Punto 1:
 * Use la interfaz List<E> para guardar una lista de números. Los números se
 * ingresarán a través de teclado hasta que se ingrese el numero 1 y los números
 * ingresados se transformarán en \n" enteros con el método parseInt() o
 * valueOf() de la clase Integer, para luego añadirlos al final de la lista con
 * el método add().\n" Imprima el número de elementos leídos.\n" Luego eleve
 * todos al cuadrado (use get() y set()).\n" Recorra la lista y suprima los
 * números mayores de 100 (use iterator).\n" Ahora ordénelos (use sort() de la
 * clase Collections)." Una1 vez hecho esto, saque (use remove()) de la lista
 * los números, respetando su nuevo orden e imprímalos. \n"); *
 */
package Edu.AlejoZepol.Punto1;

import Edu.AlejoZepol.Principal.Archivo;
import Edu.AlejoZepol.Principal.Ventana;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author alejozepol
 */
public class Punto1 {

    public static void Punto1() {
        List<ListadoNumero> numeros = new ArrayList<>();
        Archivo a = new Archivo();
        int metodo;
        System.err.println("Seleccion el metodo de ingreso:\n Para Archivo 1 \n Para Teclado 2");
        Scanner opcion = new Scanner(System.in);
        metodo = opcion.nextInt();

//        
        if (metodo == 1) {
            Ventana v = new Ventana();
            a.Archivo();
            
                System.err.println(a.getTexto());
//            while (!entrada.equals("fin")) {
//                entrada = entradaScaner.next();
//                if (!entrada.equals("fin")) {
//                    int numero;
//                    numero = Integer.parseInt(entrada);
//                    numeros.add(new ListadoNumero(numero));
//
//                }
            } else {

                System.out.println("Por favor Ingrese el numero a almacenar");
                opcion = new Scanner(System.in);
                String entrada = "";
                Scanner entradaScaner = new Scanner(System.in);
                /**
                 * Con este while se evalua la entrada al ciclo para la
                 * asigmacion de numeros al arreglo
                 *
                 * @param entrada es la varariable que recibe el objeto scaner
                 * por el teeclado
                 * @param numero es la veriable que recibe el scrip cnverito en
                 * int para agregarlo al arreglo
                 *
                 */
                while (!entrada.equals("fin")) {
                    entrada = entradaScaner.next();
                    if (!entrada.equals("fin")) {
                        int numero;
                        numero = Integer.parseInt(entrada);
                        numeros.add(new ListadoNumero(numero));

                    }
                }
            }
            System.out.println("***FIN Ingreso Numero***-");

            /**
             * Mediante el siguiente for se evalua el ArrayList con su longitud
             * para imprimir los numeros almacenados en este
             *
             */
            for (int j = 0; j < numeros.size(); j++) {
                ListadoNumero resultado = numeros.get(j);
                System.out.println(resultado.getNumero());
            }
            System.out.println("-Fin Impresion de Numeros---");

            /**
             * Mediante el siguiente for se evalua el ArrayList con su longitud
             * para elevar los numeros al cuadrado y asi modificados
             * almacenarlos en este
             */
            for (int i = 0; i < numeros.size(); i++) {
                ListadoNumero resultado = numeros.get(i);
                int d = (int) (Math.pow(resultado.getNumero(), 2));
                ListadoNumero convertir = new ListadoNumero(d);
                numeros.set(i, convertir);

            }

            /**
             * Mediante el siguiente for se evalua el ArrayList con su longitud
             * para para imprimir los numero elevados al cuadrado
             */
            for (int k = 0; k < numeros.size(); k++) {
                ListadoNumero nuevo = numeros.get(k);
                System.out.println(nuevo.getNumero());
            }
            System.out.println("Fin Impresion Conversion");

            /**
             * Mediante el siguiente for se evalua el ArrayList con su longitud
             * para para eliminar los numeros convertidos que sean mayores a 100
             */
            for (int k = 0; k < numeros.size(); k++) {
                ListadoNumero eliminar = numeros.get(k);
                if (eliminar.getNumero() > 100) {
                    numeros.remove(k);
                    System.out.println(eliminar);
                }

            }

            /**
             * Mediante el siguiente Itirator se evalua el ArrayList para para
             * imprimir los numero elevados al cuadrado
             */
            Iterator<ListadoNumero> iteLista = numeros.iterator();
            while (iteLista.hasNext()) {
                ListadoNumero elemento = iteLista.next();
                System.out.println(elemento);

            }
            System.out.println("***Fin Itinerador***");

            /**
             * Mediante el metodo @sort y llamando el metodo toCompareto de la
             * clase LsitadoNumeros se evaua cada dato del ArrayList para poder
             * ordenar e imprimirla lista ordenada
             */
            Collections.sort(numeros);

            System.out.println("***Fin sort***");
            numeros.stream().forEach((temp) -> {
                System.out.println(temp);
            });

        }
    }
