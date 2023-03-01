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
public class FichaZ extends Ficha{
    
    //constructor
    public FichaZ(Xogo xogo1) {
        super(xogo1);
        cor();
        posicionInicial();
    }
    
    //métodos
    public void cor() {
        c0.setCorRecheo(Color.CYAN);
        c1.setCorRecheo(Color.CYAN);
        c2.setCorRecheo(Color.CYAN);
        c3.setCorRecheo(Color.CYAN);
    }
    
    public void posicionInicial() {
        c1.setX(4*xogo1.getLADOCADRADO());
        c1.setY(-xogo1.getLADOCADRADO());
        c0.setX(c1.getX()-xogo1.getLADOCADRADO());
        c0.setY(c1.getY());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+xogo1.getLADOCADRADO());
        c3.setX(c1.getX()+xogo1.getLADOCADRADO());
        c3.setY(c1.getY()+xogo1.getLADOCADRADO());
    }
    
    public boolean rotar() {
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //cambiar a posición 1
        if (c0.getX()==c1X-xogo1.getLADOCADRADO() && c0.getY()==c1Y) {
            c0.setX(c1X);
            c0.setY(c1Y+xogo1.getLADOCADRADO());
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X+xogo1.getLADOCADRADO());
            c3.setY(c1Y-xogo1.getLADOCADRADO());
        }
        //cambiar a posición 0
        else if (c0.getX()==c1X && c0.getY()==c1Y+xogo1.getLADOCADRADO()) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X);
            c2.setY(c1Y+xogo1.getLADOCADRADO());
            c3.setX(c1X+xogo1.getLADOCADRADO());
            c3.setY(c1Y+xogo1.getLADOCADRADO());
        }
        return true;
    }
}
