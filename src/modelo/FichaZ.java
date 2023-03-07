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
    
     public void posicionFichaSeguinte() {
        c1.setX(2*xogo1.getLADOCADRADO());
        c1.setY(xogo1.getLADOCADRADO());
        c0.setX(c1.getX()-xogo1.getLADOCADRADO());
        c0.setY(c1.getY());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+xogo1.getLADOCADRADO());
        c3.setX(c1.getX()+xogo1.getLADOCADRADO());
        c3.setY(c1.getY()+xogo1.getLADOCADRADO());
    }
     
    public boolean comprobarRotar() {
        boolean rotar=true;
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //comprobar cambiar a posición 1
        if (c0.getX()==c1X-xogo1.getLADOCADRADO() && c0.getY()==c1Y) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X, c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y-xogo1.getLADOCADRADO())){
                rotar=false;
            }
        }
        //comprobar cambiar a posición 0
        else if (c0.getX()==c1X && c0.getY()==c1Y+xogo1.getLADOCADRADO()) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X-xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X, c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
        }
        return rotar;
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
