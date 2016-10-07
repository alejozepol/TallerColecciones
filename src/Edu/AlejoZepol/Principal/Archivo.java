/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Principal;

import java.io.*;

/**
 *
 * @author alejozepol
 */
public class Archivo {

    public String leerGrafico() {

        File f;
        javax.swing.JFileChooser j = new javax.swing.JFileChooser();
        j.showOpenDialog(j);

        try {
            String path = j.getSelectedFile().getAbsolutePath();
            String lectura = "";
            f = new File(path);
            try {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                while ((aux = br.readLine()) != null) {
                    lectura = lectura + aux + "n";
                }
            } catch (IOException e) {
            }
            return lectura;
        } catch (NullPointerException e) {
            javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");
            System.exit(0);
        }
        return null;

    }
}
