/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Punto1;
/**
 *
 * @author alejozepol
 */
public class ListadoNumero implements Comparable<ListadoNumero> {

    private int numero;

    public ListadoNumero() {
    }

    public ListadoNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "numero=" + numero;
    }

    @Override
    public int compareTo(ListadoNumero o) {
        if (o!=null) {
        if(this.numero >o.getNumero()){
        return 1;
        }else if (this.numero < o.getNumero()){
        return -1;
        }else{
        return 0;
        }
    }else {
           System.out.println("Error al comparar los numero, objeto no definido.");
            return -2; 
            
        }}
}
