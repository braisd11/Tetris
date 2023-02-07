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
public class FichaBarra extends Ficha{
    
    //constructor
    public FichaBarra(Xogo xogo1) {
        super(xogo1);
        cor();
        posicionInicial();
    }
    
    //métodos
    public void cor() {
        c0.setCorRecheo(Color.YELLOW);
        c1.setCorRecheo(Color.YELLOW);
        c2.setCorRecheo(Color.YELLOW);
        c3.setCorRecheo(Color.YELLOW);
    }
    
    public void posicionInicial() {
        c1.setX(4*xogo1.getLADOCADRADO());
        c1.setY(xogo1.getLADOCADRADO());
        c0.setX(c1.getX());
        c0.setY(c1.getY()-xogo1.getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+xogo1.getLADOCADRADO());
        c3.setX(c1.getX());
        c3.setY(c1.getY()+2*xogo1.getLADOCADRADO());
    }
    
    public boolean rotar() {
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //cambiar a posición 1
        if (c0.getX()==c1X) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X+2*xogo1.getLADOCADRADO());
            c3.setY(c1Y);
        }
        //cambiar a posición 0
        else if (c0.getY()==c1Y) {
            c0.setX(c1X);
            c0.setY(c1Y-xogo1.getLADOCADRADO());
            c2.setX(c1X);
            c2.setY(c1Y+xogo1.getLADOCADRADO());
            c3.setX(c1X);
            c3.setY(c1Y+2*xogo1.getLADOCADRADO());
        }
        return true;
    }
}
