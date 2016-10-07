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
public class Empleado {

    private String nombre;
    private String apellido;
    private String fechaContratacion;
    private int numeroEmpleado;

    public Empleado(String nombre, String apellido, String fechaContratacion, int numeroEmpleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", fechaContratacion="
                + fechaContratacion + ", numeroEmpleado=" + numeroEmpleado + '}';
    }

    public int compareTo(Empleado emple) {

        if (emple.fechaContratacion.compareTo(this.fechaContratacion) == 0) {
            if (String.valueOf(this.numeroEmpleado).compareTo(String.valueOf(emple.numeroEmpleado)) == 0) {
                return (emple.apellido.compareTo(this.apellido));
            }
            return (String.valueOf(this.numeroEmpleado).compareTo(String.valueOf(emple.numeroEmpleado)));
        }
        return (emple.fechaContratacion.compareTo(this.fechaContratacion));
    }
}
