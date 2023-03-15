/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import static java.awt.Color.YELLOW;

/**
 *
 * @author a22noellr
 */
public class FichaBarra extends Ficha{
    
    //constructor
    public FichaBarra(Xogo xogo1) {
        super(xogo1);
        cor();
    }
    
    //métodos
    protected void cor() {
        c0.setCorRecheo(YELLOW);
        c1.setCorRecheo(YELLOW);
        c2.setCorRecheo(YELLOW);
        c3.setCorRecheo(YELLOW);
    }
    
    public void posicionInicial() {
        c1.setX(4*this.getXogo1().getLADOCADRADO());
        c1.setY(-this.getXogo1().getLADOCADRADO()*3);
        c0.setX(c1.getX());
        c0.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+this.getXogo1().getLADOCADRADO());
        c3.setX(c1.getX());
        c3.setY(c1.getY()+2*this.getXogo1().getLADOCADRADO());
    }
    
    public void posicionFichaSeguinte() {
        c1.setX(2*this.getXogo1().getLADOCADRADO());
        c1.setY(this.getXogo1().getLADOCADRADO()*2);
        c0.setX(c1.getX());
        c0.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+this.getXogo1().getLADOCADRADO());
        c3.setX(c1.getX());
        c3.setY(c1.getY()+2*this.getXogo1().getLADOCADRADO());
    }
    
    //comproba se pode rotar chamando a ePosicionValida
    public boolean comprobarRotar() {
        boolean rotar=true;
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //comprobar cambiar a posición 1
        if (c0.getX()==c1X) {
            //comprobar futura posición de c0
            if(!this.getXogo1().ePosicionValida(c1X-this.getXogo1().getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!this.getXogo1().ePosicionValida(c1X+this.getXogo1().getLADOCADRADO(), c1Y)){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!this.getXogo1().ePosicionValida(c1X+2*this.getXogo1().getLADOCADRADO(), c1Y)){
                rotar=false;
            }
        }
        //comprobar cambiar a posición 0
        else if (c0.getY()==c1Y) {
            //comprobar futura posición de c0
            if(!this.getXogo1().ePosicionValida(c1X, c1Y-this.getXogo1().getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c2
            else if(!this.getXogo1().ePosicionValida(c1X, c1Y+this.getXogo1().getLADOCADRADO())){
                rotar=false;
            }
            //comprobar futura posición de c3
            else if(!this.getXogo1().ePosicionValida(c1X, c1Y+2*this.getXogo1().getLADOCADRADO())){
                rotar=false;
            }
        }
        return rotar;
    }
    
    public boolean rotar() {
        int c1X = c1.getX();
        int c1Y = c1.getY();
        //cambiar a posición 1
        if (c0.getX()==c1X) {
            c0.setX(c1X-this.getXogo1().getLADOCADRADO());
            c0.setY(c1Y);
            c2.setX(c1X+this.getXogo1().getLADOCADRADO());
            c2.setY(c1Y);
            c3.setX(c1X+2*this.getXogo1().getLADOCADRADO());
            c3.setY(c1Y);
        }
        //cambiar a posición 0
        else if (c0.getY()==c1Y) {
            c0.setX(c1X);
            c0.setY(c1Y-this.getXogo1().getLADOCADRADO());
            c2.setX(c1X);
            c2.setY(c1Y+this.getXogo1().getLADOCADRADO());
            c3.setX(c1X);
            c3.setY(c1Y+2*this.getXogo1().getLADOCADRADO());
        }
        return true;
    }
}
