/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Emiliano
 */
public class Ventana extends Frame implements MouseListener{
    private String titulo;
    private Button boton1;
    private FlowLayout layout;
    private Label etiqueta;
    private TextField cuadroTexto;

    public Ventana() throws HeadlessException {
    }

    public Ventana(String titulo) throws HeadlessException {
        super(titulo);
        this.setSize(350, 220);
        layout = new FlowLayout(FlowLayout.LEFT);
        this.setLayout(layout);
        boton1 = new Button("Presioname");
        cuadroTexto= new TextField(15);
        etiqueta = new Label("Texto inicial");
        this.add(cuadroTexto);
        
        this.add(boton1);
        this.add(etiqueta);
        this.boton1.addMouseListener(this);
        this.setVisible(true);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Ventana{" + "titulo=" + titulo + '}';
    }

    @Override
    public void mouseClicked(MouseEvent e) {
       
        etiqueta.setText("Hola "+cuadroTexto.getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
