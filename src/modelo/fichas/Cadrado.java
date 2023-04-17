/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.fichas;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author a22braisdr
 */
public class Cadrado {
    //atributos
    /**
     * Coordenada x de este Cadrado
     */
    public int x;
    /**
     * Coordenada y de este Cadrado
     */
    public int y;
    public Color corRecheo;
    public JLabel lblCadrado;
    
    
    /**
     * Declara el ancho y el alto de Cadrado y crea la Label
     * @param LADOCADRADO Tamaño de los lados de Cadrado
     */
    public Cadrado(int LADOCADRADO) {
        lblCadrado = new javax.swing.JLabel();
        lblCadrado.setSize(LADOCADRADO, LADOCADRADO);
    }
    
    //getter y setter
    public int getX() {    
        return x;
    }
    
    /**
     * Modificar la posición en el eje x del Cadrado
     * @param x Coordenada eje x de Cadrado
     */
    public void setX(int x) {
        this.x = x;
        lblCadrado.setLocation(x, y);
    }
    public int getY() {
        return y;
    }
    
    /**
     * Modificar la posición en el eje y del Cadrado
     * @param y Coordenada eje y de Cadrado
     */
    public void setY(int y) {
        this.y = y;
        lblCadrado.setLocation(x, y);
    }
    public Color getCorRecheo() {
        return corRecheo;
    }
    

    /**
     * Colorea cada Cadrado con un color, un borde y le añade opacidad a la Label
     * @param corRecheo Cor que ten o Cadrado
     */
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
    /**
     * 
     * @return Devuelve las coordenadas en este momento del cuadrado
     */
    public String getCoordenadas() {
        return (x + y + "");
    }
}
