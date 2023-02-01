/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author a22braisdr
 */
public class Cadrado {
    //atributos
    public int x;
    public int y;
    public Color corRecheo;
    public JLabel lblCadrado;
    
    //constructor

    public Cadrado() {
        lblCadrado = new javax.swing.JLabel();
    }
    
    //getter y setter
    public int getX() {    
        return x;
    }
    public void setX(int x) {
        this.x = x;
        lblCadrado.setLocation(x, y);
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
        lblCadrado.setLocation(x, y);
    }
    public Color getCorRecheo() {
        return corRecheo;
    }
    public void setCorRecheo(Color corRecheo) {
        this.corRecheo = corRecheo;
        lblCadrado.setBackground(corRecheo);
        lblCadrado.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        lblCadrado.setOpaque(true);
    }
    public JLabel getLblCadrado() {
        return lblCadrado;
    }
    public void setLblCadrado(JLabel lblCadrado) {    
        this.lblCadrado = lblCadrado;
    }

    //métodos
    public String getCoordenadas() {
        return (x + y + "");
    }
}
