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
        this.xogo1 = xogo1;
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
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //cambiar a posición 1
        if (c0.getX()==c1X) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X+2*xogo1.getLADOCADRADO());
            c3.setY(c1Y-2);
        }
        //cambiar a posición 0
        if (c0.getY()==c1Y) {
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
