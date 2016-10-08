/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author alejozepol
 */
public class Archivo {

    public Archivo() {

    }
    private String aux = "";
    private String texto = "";
    private File f;

    public String Archivo() {

        Ventana v = new Ventana();
        v.setVisible(true);
        
        try {

            String path = v.getRuta();
            f = v.getContenido(path);

            try {

                if (f != null) {
                    FileReader archivos = new FileReader(f);
                    BufferedReader lee = new BufferedReader(archivos);
                    while ((aux = lee.readLine()) != null) {
                        texto += aux + "\n";
                    }
                    lee.close();
                }

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex + ""
                        + "\nNo se ha encontrado el archivo",
                        "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
            }
            return texto;
        } catch (NullPointerException e) {

            javax.swing.JOptionPane.showMessageDialog(v, "Has seleccionado cerrar programa, saliendo...");

            System.exit(0);

        }
        return null;
    }
}
