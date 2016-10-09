/*
 *Mediante esta clase se creara e objeto empleado con los datos especificados en el punto 2
 */
package Edu.AlejoZepol.punto2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        Date date = d.parse("31-03-2016");
        System.out.println(DateFormat.getDateInstance().format(date));

        return "Empleado: " + "identificacion:" + identificacion
                + " nombreEmpleado:" + nombreEmpleado
                + " apellidoEmpleado:" + apellidoEmpleado
                + " fechaContrato:" + fechaContrato;
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
