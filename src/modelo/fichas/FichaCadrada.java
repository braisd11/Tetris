/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.fichas;

import modelo.Xogo;
import static java.awt.Color.BLUE;

/**
 *
 * @author a22noellr
 */
public class FichaCadrada extends Ficha{
    
    //constructor
    public FichaCadrada(Xogo xogo1) {
        super(xogo1);
        cor();
    }
    
    //métodos
    //Establece a cor dos cadrados da ficha
    protected void cor() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.setCorRecheo(BLUE);
        }
    }
    
    //Establece a posición inicial da ficha
    public void posicionInicial() {
        c1.setX(4*this.getXogo1().getLADOCADRADO());
        c1.setY(0);
        posicion0();
    }
    
    //Establece a posición da ficha no panel da ficha seguinte
    public void posicionFichaSeguinte(){
        c1.setX(2*this.getXogo1().getLADOCADRADO());
        c1.setY(this.getXogo1().getLADOCADRADO()*2);
        posicion0();
    }
    
    //Establece a posición dos cadrados
    private void posicion0(){
        c0.setX(c1.getX());
        c0.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
        c2.setX(c1.getX()+this.getXogo1().getLADOCADRADO());
        c2.setY(c1.getY());
        c3.setX(c1.getX()+this.getXogo1().getLADOCADRADO());
        c3.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
    }
    
    public boolean comprobarRotar() {
        return true;
    }
    
    public boolean rotar() {
        return true;
    }
}
