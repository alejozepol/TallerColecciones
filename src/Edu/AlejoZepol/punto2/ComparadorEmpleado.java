/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.punto2;

/**
 *
 * @author alejozepol
 */
public class ComparadorEmpleado implements Comparable<Empleado> {

    public int compareTo(Empleado e1, Empleado e2) {
        if (e1 != null && e2 != null) {

            if (e1.getFechaContrato().compareTo(e2.getFechaContrato()) > 0) {
                return 1;
            } else if (e1.getFechaContrato().compareTo(e2.getFechaContrato()) < 0) {
                return -1;
            } else {
                if (e1.getIdentificacion()> e2.getIdentificacion()) {
                    return 1;
                } else if (e1.getIdentificacion() < e2.getIdentificacion()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        } else {
            System.out.println("Error al comparar los equipos, objeto no definido.");
            return -2;
        }
    }

    @Override
    public int compareTo(Empleado o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
