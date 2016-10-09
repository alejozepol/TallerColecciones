/**
 * Defina una lista List<E> con la clase Empleado antes definida (con nombre,
 * apellidos, fecha de contratación y número de empleado). Use la función sort
 * de la clase Collections, para ordenar la lista. Use la antigüedad como
 * criterio a seguir (es “mayor” si es más antiguo) y si entraron en el mismo
 * día, utilice el número de empleado para desempatar. Nota: Esta ordenación se
 * reflejará en un método de la clase Empleado, compareTo(Object o), que permite
 * comparar el objeto en curso (this) con el objeto recibido, que devuelve -1 si
 * es menor que el recibido, 0 si son iguales y 1 si es mayor que el recibo.
 */
package Edu.AlejoZepol.punto2;

import Edu.AlejoZepol.Principal.Archivo;
import Edu.AlejoZepol.Principal.Ventana;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alejozepol
 */
public class Punto2 {

    public static void punto2() {

        List<Empleado> empleados = new ArrayList<>();
        Archivo a = new Archivo();
        int metodo, i1, i2, i3;
        System.err.println("Seleccion el metodo de ingreso:\n Para Archivo 1 \n Para Teclado 2");
        Scanner opcion = new Scanner(System.in);
        metodo = opcion.nextInt();
        Scanner entradaScaner = new Scanner(System.in);
        Scanner entradaScaner2 = new Scanner(System.in);
        String salida;
        int entradaIdentificacion;
        String entradaNombreEmpleado;
        String entradaApellidoEmpleado;
        Date entradaFechaContratoDate;

        if (metodo == 1) {
            Ventana v = new Ventana();
            a.Archivo();
            String entradaArchivo = a.getTexto();
            String[] arrayEmpleados;
            arrayEmpleados = entradaArchivo.split(",");
            /**
             * Mediante el siguiente for realiza la asiganacion a la lista
             *
             * @numeros tiene un condicion de in if para identificar que si esta
             * la palbra fin no asigne el valor a @numeros ya que el tipo de
             * dato de este arreglo es int
             *
             */
            for (int i = 0; i < arrayEmpleados.length; ++i) {
                i1 = i + 1;
                i2 = i1 + 1;
                i3 = i2 + 1;

                System.out.println("*i " + arrayEmpleados[i].toString());
                System.out.println("*i1 " + arrayEmpleados[i1].toString());
                System.out.println("*i2 " + arrayEmpleados[i2].toString());
                System.out.println("*i3 " + arrayEmpleados[i3].toString());

                entradaIdentificacion = Integer.parseInt(arrayEmpleados[i].toString());
                entradaNombreEmpleado = arrayEmpleados[i1].toString();
                entradaApellidoEmpleado = arrayEmpleados[i2].toString();
                String fecha = arrayEmpleados[i3];
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                entradaFechaContratoDate = null;
                String date = fecha;
                try {
                    entradaFechaContratoDate = df.parse(date);
                } catch (Exception e) {
                    System.out.println("Formato Invalido");
                }

                Empleado emp = new Empleado(entradaIdentificacion, entradaNombreEmpleado, entradaApellidoEmpleado, entradaFechaContratoDate);
                empleados.add(emp);
            }

            System.out.println("Fin");

        } else {
            int i = 0;

            do {
                System.out.println("Por favor Ingrese la identificacion del empleado:");
                entradaIdentificacion = entradaScaner.nextInt();

                System.out.println("Por favor Ingrese el nombre del empleado:");
                entradaNombreEmpleado = entradaScaner.nextLine();

                System.out.println("Por favor Ingrese el apellido del empleado:");
                entradaApellidoEmpleado = entradaScaner2.nextLine();

                System.out.println("Introduzca la fecha del contrato del empleado con formato yyyy/mm/dd:");
                String fecha = entradaScaner.nextLine();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                entradaFechaContratoDate = null;
                String date = fecha;
                try {
                    entradaFechaContratoDate = df.parse(date);
                } catch (Exception e) {
                    System.out.println("Formato Invalido");
                }

                if (!df.format(entradaFechaContratoDate).equalsIgnoreCase(date)) {
                    System.out.println("dato invalido");
                } else {
                    System.out.println("fecha invalida");
                }

                Empleado e = new Empleado(entradaIdentificacion, entradaNombreEmpleado, entradaApellidoEmpleado, entradaFechaContratoDate);
                empleados.add(e);
                System.out.println("¿Desea salir? escriba s para salir");
                salida = entradaScaner.nextLine();

            } while (!salida.equals("s"));
        }
        for (int j = 0; j < empleados.size(); j++) {
            Empleado resultado = empleados.get(j);
            System.out.println(resultado.toString());
        }
        

        empleados.stream().forEach((temp)
                -> {
            System.out.println(temp);
        }
        );

    }

}
