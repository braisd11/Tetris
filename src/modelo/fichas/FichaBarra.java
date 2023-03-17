/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.fichas;

import modelo.Xogo;
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
        c1.setY(-this.getXogo1().getLADOCADRADO()*2);
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
    
    
    
    //MÉTODOS QUE COMPROBAN SE PODE ROTAR////////////////////////////////////////////////////////////////////////
    
    //comproba se pode rotar chamando a ePosicionValida
    public boolean comprobarRotar() {
        boolean rotar=true;
        if (c0.getX()==c1.getX()) {
            rotar=comprobarCambiarPosicion1();
        }
        else if (c0.getY()==c1.getY()) {
            rotar=comprobarCambiarPosicion0();
        }
        return rotar;
    }
    
    
    private boolean comprobarCambiarPosicion1(){
        boolean rotar=true;
        //comprobar futura posición de c0
        if(!this.getXogo1().ePosicionValida(c1.getX()-this.getXogo1().getLADOCADRADO(), c1.getY())){
            rotar=false;
        }
        //comprobar futura posición de c2
        else if(!this.getXogo1().ePosicionValida(c1.getX()+this.getXogo1().getLADOCADRADO(), c1.getY())){
            rotar=false;
        }
        //comprobar futura posición de c3
        else if(!this.getXogo1().ePosicionValida(c1.getX()+2*this.getXogo1().getLADOCADRADO(), c1.getY())){
            rotar=false;
        }
        return rotar;
    }
    
    
    private boolean comprobarCambiarPosicion0(){
        boolean rotar=true;
        //comprobar futura posición de c0
        if(!this.getXogo1().ePosicionValida(c1.getX(), c1.getY()-this.getXogo1().getLADOCADRADO())){
            rotar=false;
        }
        //comprobar futura posición de c2
        else if(!this.getXogo1().ePosicionValida(c1.getX(), c1.getY()+this.getXogo1().getLADOCADRADO())){
            rotar=false;
        }
        //comprobar futura posición de c3
        else if(!this.getXogo1().ePosicionValida(c1.getX(), c1.getY()+2*this.getXogo1().getLADOCADRADO())){
            rotar=false;
        }
        return rotar;
    }
    
    //FIN MÉTODOS QUE COMPROBAN SE PODE ROTAR////////////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS QUE ROTAN//////////////////////////////////////////////////////////////////////////////////////////////
    
    public boolean rotar() {
        if (c0.getX()==c1.getX()) {
            cambiarPosicion1();
        }
        else if (c0.getY()==c1.getY()) {
            cambiarPosicion0();
        }
        return true;
    }
    
    
    private void cambiarPosicion1() {
        c0.setX(c1.getX()-this.getXogo1().getLADOCADRADO());
        c0.setY(c1.getY());
        c2.setX(c1.getX()+this.getXogo1().getLADOCADRADO());
        c2.setY(c1.getY());
        c3.setX(c1.getX()+2*this.getXogo1().getLADOCADRADO());
        c3.setY(c1.getY());
    }
    
    
    private void cambiarPosicion0() {
        c0.setX(c1.getX());
        c0.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
        c2.setX(c1.getX());
        c2.setY(c1.getY()+this.getXogo1().getLADOCADRADO());
        c3.setX(c1.getX());
        c3.setY(c1.getY()+2*this.getXogo1().getLADOCADRADO());
    }
    
    //FIN MÉTODOS QUE ROTAN//////////////////////////////////////////////////////////////////////////////////////////////
}
