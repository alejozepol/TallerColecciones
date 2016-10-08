/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edu.AlejoZepol.Principal;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

/**
 *
 * @author alejozepol
 */
public class Ventana extends JFrame {

    protected JButton boton;
    protected String titulo;
    protected String ruta;
    protected File contenido;

    public Ventana(String titulo, String ruta, File contenido) {
        this.titulo = titulo;
        this.ruta = ruta;
        this.contenido = contenido;
    }
    
    public Ventana()  {
        super("Abrir Archivo");
        boton = new JButton("Abrir");
        add(boton, BorderLayout.NORTH);
        boton.setForeground(Color.red);
        boton.setBackground(Color.cyan);
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                JFileChooser elegir = new JFileChooser();
                int opcion = elegir.showOpenDialog(boton);
                //Si presionamos el boton ABRIR en pathArchivo obtenemos el path del archivo
                if (opcion == JFileChooser.APPROVE_OPTION) {
                    ruta = elegir.getSelectedFile().getPath(); //Obtiene path del archivo
                    titulo = elegir.getSelectedFile().getName(); //obtiene nombre del archivo
                    contenido = elegir.getSelectedFile(); // contenido del archivo
                }
            }

        }
        );
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public File getContenido(String ruta) {
        contenido = new File(ruta);
        return contenido;
    }

    public void setContenido(File contenido) {
        this.contenido = contenido;
    }

}
