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
        c1.setX(4*xogo1.getLADOCADRADO());
        c1.setY(0);
        c0.setX(c1.getX());
        c0.setY(c1.getY()-xogo1.getLADOCADRADO());
        c2.setX(c1.getX()+xogo1.getLADOCADRADO());
        c2.setY(c1.getY());
        c3.setX(c1.getX()+xogo1.getLADOCADRADO());
        c3.setY(c1.getY()-xogo1.getLADOCADRADO());
    }
    
    public boolean rotar() {
        return true;
    }
}
