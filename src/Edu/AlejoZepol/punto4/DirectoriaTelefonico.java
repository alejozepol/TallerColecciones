/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.punto4;

import java.io.Serializable;

/**
 * @author alejozepol
 */
public class DirectoriaTelefonico implements Serializable, Comparable<DirectoriaTelefonico> {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String telefono;
    private String email;
    private String movil;

    public DirectoriaTelefonico(String nombre, String primerApellido, String segundoApellido, String telefono, String email, String movil) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.telefono = telefono;
        this.email = email;
        this.movil = movil;
    }

    public DirectoriaTelefonico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        return "Nombres:" + nombre + ", Apellidos:" + primerApellido + " " + segundoApellido + ", Telefono:" + telefono 
                + ", E-mail=" + email + ", Telefono Movil=" + movil ;
    }



    @Override
    public int compareTo(DirectoriaTelefonico dt) {
        if (dt.getPrimerApellido().compareTo(this.primerApellido) == 0) {
            if (dt.getSegundoApellido().compareTo(this.segundoApellido) == 0) {
                return (dt.getNombre().compareTo(this.nombre));
            }
            return (dt.getSegundoApellido().compareTo(this.segundoApellido));
        }
        return (dt.getSegundoApellido().compareTo(this.primerApellido));
    }

}
