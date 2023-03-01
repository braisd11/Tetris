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
        c1.setX(4*xogo1.getLADOCADRADO());
        c1.setY(-xogo1.getLADOCADRADO());
        c0.setX(c1.getX());
        c0.setY(c1.getY()-xogo1.getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+xogo1.getLADOCADRADO());
        c3.setX(c1.getX()+xogo1.getLADOCADRADO());
        c3.setY(c1.getY());
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
        else if (c3.getX()==c1X && c3.getY()==c1Y+xogo1.getLADOCADRADO()) {
            c0.setX(c1X);
            c0.setY(c1Y-xogo1.getLADOCADRADO());
            c2.setX(c1X);
            c2.setY(c1Y+xogo1.getLADOCADRADO());
            c3.setX(c1X-xogo1.getLADOCADRADO());
            c3.setY(c1Y);
        }
        //cambiar a posición 3
        else if (c3.getX()==c1X-xogo1.getLADOCADRADO() && c3.getY()==c1Y) {
            c0.setX(c1X-xogo1.getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+xogo1.getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X);
            c3.setY(c1Y-xogo1.getLADOCADRADO());
        }
        //cambiar a posición 0
        else if (c3.getX()==c1X && c3.getY()==c1Y-xogo1.getLADOCADRADO()) {
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
