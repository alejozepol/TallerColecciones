/*
 *Definauna lista List<E> con la clase que representa una entrada de una agenda,
 *con el nombre, primer apellido, segundo apellido, teléfono, e-mail y móvil. 
 *Use la función sort() para ordenarla. Use como criterio de ordenación los 
 *apellidos y luego el nombre
 */
package Edu.AlejoZepol.punto3;

import Edu.AlejoZepol.Principal.Archivo;
import Edu.AlejoZepol.Principal.Ventana;
import Edu.AlejoZepol.punto2.Empleado;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author alejozepol
 */
public class Punto3 {

    public static void punto3() {

        List<Agenda> agendas = new ArrayList<>();
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

                Agenda ag = new Agenda(entradaNombre, entradaPrimerApellido, entradaSegundoApellido,
                        entradaTelefono, entradaEmail, entradaMovil);

                agendas.add(ag);
            }
        }else {
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

                Agenda ag = new Agenda(entradaNombre, entradaPrimerApellido, entradaSegundoApellido, entradaTelefono, entradaEmail, entradaMovil);
                agendas.add(ag);
                System.out.println("¿Desea salir? escriba s para salir");
                salida = entradaScaner.nextLine();

            } while (!salida.equals("s"));

        }
            Collections.sort(agendas);

            for (Agenda agenda : agendas) {
                System.out.println(agenda);
            }

        }

    }
