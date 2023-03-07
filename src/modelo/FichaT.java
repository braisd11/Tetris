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
    
    public void posicionFichaSeguinte() {
        c1.setX(2*xogo1.getLADOCADRADO());
        c1.setY(xogo1.getLADOCADRADO()*2);
        c0.setX(c1.getX());
        c0.setY(c1.getY()-xogo1.getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+xogo1.getLADOCADRADO());
        c3.setX(c1.getX()+xogo1.getLADOCADRADO());
        c3.setY(c1.getY());
    }
    
    public boolean comprobarRotar() {
        boolean rotar=true;
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //comprobar cambiar a posición 1
        if (c3.getX()==c1X+xogo1.getLADOCADRADO() && c3.getY()==c1Y) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X-xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X, c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
        }
        //comprobar cambiar a posición 2
        else if (c3.getX()==c1X && c3.getY()==c1Y+xogo1.getLADOCADRADO()) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X, c1Y-xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X, c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X-xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
        }
        //comprobar cambiar a posición 3
        else if (c3.getX()==c1X-xogo1.getLADOCADRADO() && c3.getY()==c1Y) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X-xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X, c1Y-xogo1.getLADOCADRADO())){
                rotar=false;
            }
        }
        //comprobar cambiar a posición 0
        else if (c3.getX()==c1X && c3.getY()==c1Y-xogo1.getLADOCADRADO()) {
            //comprobar futura posición de c0
            if(!xogo1.ePosicionValida(c1X, c1Y-xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!xogo1.ePosicionValida(c1X, c1Y+xogo1.getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!xogo1.ePosicionValida(c1X+xogo1.getLADOCADRADO(), c1Y)){
                rotar=false;
            }
        }
        return rotar;
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
