/*
 *Mediante esta clase se creara e objeto empleado con los datos especificados en el punto 2
 */
package Edu.AlejoZepol.punto2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alejozepol
 *
 */
public class Empleado {

    /**
     * @identificacion numero de identificacón empleado
     * @nombreEmpleado nombre del empleado
     * @apellidoEmpleado Apellido del empleado
     * @fechaContrato representa la fecha de inicio del empleado
     *
     */
    protected int identificacion;
    protected String nombreEmpleado;
    protected String apellidoEmpleado;
    protected Date fechaContrato;

    public Empleado(int identificacion, String nombreEmpleado, String apellidoEmpleado, Date fechaContrato) {
        this.identificacion = identificacion;
        this.nombreEmpleado = nombreEmpleado;
        this.apellidoEmpleado = apellidoEmpleado;
        this.fechaContrato = fechaContrato;
    }

    public Empleado() {
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getApellidoEmpleado() {
        return apellidoEmpleado;
    }

    public void setApellidoEmpleado(String apellidoEmpleado) {
        this.apellidoEmpleado = apellidoEmpleado;
    }

    public Date getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(Date fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    @Override
    public String toString() {
        SimpleDateFormat d = new SimpleDateFormat("dd-MM-yy");
        Date date = null;
        date = fechaContrato;
        return "Empleado: " + "identificacion:" + identificacion
                + " nombreEmpleado:" + nombreEmpleado
                + " apellidoEmpleado:" + apellidoEmpleado
                + " fechaContrato:" + DateFormat.getDateInstance().format(date);
    }

    public int compareTo(Empleado emp) {

        if (emp.fechaContrato.compareTo(this.fechaContrato) == 0) {
            if (String.valueOf(this.identificacion).compareTo(String.valueOf(emp.identificacion)) == 0) {
                return (emp.getApellidoEmpleado().compareTo(this.apellidoEmpleado));
            }
            return (String.valueOf(this.identificacion).compareTo(String.valueOf(emp.getIdentificacion())));
        }
        return (emp.getFechaContrato().compareTo(this.fechaContrato));
    }
}
