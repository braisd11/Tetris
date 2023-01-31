/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.Color;

/**
 *
 * @author a22noellr
 */
public class FichaCadrada extends Ficha{
    
    //constructor
    public FichaCadrada(Xogo xogo1) {
        super(xogo1);
        this.xogo1 = xogo1;
        cor();
        posicionInicial();
    }
    
    //métodos
    public void cor() {
        c0.setCorRecheo(Color.BLUE);
        c1.setCorRecheo(Color.BLUE);
        c2.setCorRecheo(Color.BLUE);
        c3.setCorRecheo(Color.BLUE);
    }
    
    public void posicionInicial() {
        c1.setX(0);
        c1.setY(0);
        c0.setX(0);
        c0.setY(0);
        c2.setX(0);
        c2.setY(0);
        c3.setX(0);
        c3.setY(0);
    }
    
    public boolean rotar() {
        return true;
    }
}
