/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.punto4;

import Edu.AlejoZepol.Principal.Archivo;
import Edu.AlejoZepol.Principal.Ventana;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Punto4 {

    public static void punto4() {

        Map<String, DirectoriaTelefonico> contactosMap = new LinkedHashMap();
        Archivo a = new Archivo();
        int metodo;
        System.err.println("Seleccion el metodo de ingreso:\n Para Archivo 1 \n Para Teclado 2");
        Scanner opcion = new Scanner(System.in);
        metodo = opcion.nextInt();
        Scanner entradaScaner = new Scanner(System.in);
        String entradaNombre = null;
        String entradaPrimerApellido = null;
        String entradaSegundoApellido = null;
        String entradaTelefono = null;
        String entradaEmail = null;
        String entradaMovil = null;
        String salida = "";
        if (metodo == 1) {
            Ventana v = new Ventana();
            a.Archivo();
            String entradaArchivo = a.getTexto();
            String[] arrayAgenda;
            arrayAgenda = entradaArchivo.split(",");

            for (int i = 0; i < arrayAgenda.length; i = i + 6) {
                int i1, i2, i3, i4, i5;
                i1 = i + 1;
                i2 = i1 + 1;
                i3 = i2 + 1;
                i4 = i3 + 1;
                i5 = i4 + 1;

                entradaNombre = arrayAgenda[i].toString();
                entradaPrimerApellido = arrayAgenda[i1].toString();
                entradaSegundoApellido = arrayAgenda[i2].toString();
                entradaTelefono = arrayAgenda[i3].toString();
                entradaEmail = arrayAgenda[i4].toString();
                entradaMovil = arrayAgenda[i5].toString();
                int c = 0;
                c = c + 1;
                String c1;
                c1 = String.valueOf(c);
                DirectoriaTelefonico ag = new DirectoriaTelefonico(entradaNombre, entradaPrimerApellido, entradaSegundoApellido,
                        entradaTelefono, entradaEmail, entradaMovil);
                contactosMap.put(c1, ag);

            }
        } else {
            do {
                System.out.println("Por favor Ingrese el nombre:");
                entradaNombre = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese el primer apellido:");
                entradaPrimerApellido = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese el segundo apellido:");
                entradaSegundoApellido = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese el telefno fijo:");
                entradaTelefono = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese numero movil:");
                entradaMovil = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese el e-mail:");
                entradaEmail = entradaScaner.nextLine();

                DirectoriaTelefonico ag = new DirectoriaTelefonico(entradaNombre, entradaPrimerApellido, entradaSegundoApellido, entradaTelefono, entradaEmail, entradaMovil);
                int c = 0;
                c = c + 1;
                String c1;
                c1 = String.valueOf(c);
                contactosMap.put(c1, ag);
                System.out.println("¿Desea salir? escriba s para salir");
                salida = entradaScaner.nextLine();

            } while (!salida.equals("s"));

        }
        System.out.println("Mi agenda");
        System.out.println("Cantidad de contactos " + contactosMap.size());

        Scanner read = new Scanner(System.in);
        DirectoriaTelefonico ag = new DirectoriaTelefonico();

        System.out.println("Digite el nombre a buscar");
        ag.setNombre(read.next());

        System.out.println("Digite el primer apellido");
        ag.setPrimerApellido(read.next());

        System.out.println("Digite el segundo apellido");
        ag.setSegundoApellido(read.next());
        
        for (Map.Entry<String, DirectoriaTelefonico> entrada : contactosMap.entrySet()) {
            String key = entrada.getKey();
            DirectoriaTelefonico ag1 = entrada.getValue();

            if (ag1.getNombre().equalsIgnoreCase(ag.getNombre())
                    && ag1.getPrimerApellido().equalsIgnoreCase(ag.getPrimerApellido())
                    && ag1.getSegundoApellido().equalsIgnoreCase(ag.getSegundoApellido())
            
                ) {
                System.out.println("Key: " + key + " - " + ag1);
            }

        }

    }

}
