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
public class FichaT extends Ficha{
    
    //constructor
    public FichaT(Xogo xogo1) {
        super(xogo1);
        this.xogo1 = xogo1;
        cor();
        posicionInicial();
    }
    
    //métodos
    public void cor() {
        c0.setCorRecheo(Color.RED);
        c1.setCorRecheo(Color.RED);
        c2.setCorRecheo(Color.RED);
        c3.setCorRecheo(Color.RED);
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
        if (c3.getX()==c1X+xogo1.getLADOCADRADO() && c3.getY()==c1Y) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X);
            c3.setY(c1Y+xogo1.getLADOCADRADO());
        }
        //cambiar a posición 2
        if (c3.getX()==c1X && c3.getY()==c1Y+xogo1.getLADOCADRADO()) {
            c0.setX(c1X);
            c0.setY(c1Y-xogo1.getLADOCADRADO());
            c2.setX(c1X);
            c2.setY(c1Y+xogo1.getLADOCADRADO());
            c3.setX(c1X-xogo1.getLADOCADRADO());
            c3.setY(c1Y);
        }
        //cambiar a posición 3
        if (c3.getX()==c1X-xogo1.getLADOCADRADO() && c3.getY()==c1Y) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X);
            c3.setY(c1Y-xogo1.getLADOCADRADO());
        }
        //cambiar a posición 0
        if (c3.getX()==c1X && c3.getY()==c1Y-xogo1.getLADOCADRADO()) {
            c0.setX(c1X);
            c0.setY(c1Y-xogo1.getLADOCADRADO());
            c2.setX(c1X);
            c2.setY(c1Y+xogo1.getLADOCADRADO());
            c3.setX(c1X+xogo1.getLADOCADRADO());
            c3.setY(c1Y);
        }
        return true;
    }
}
