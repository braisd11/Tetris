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
    protected void cor() {
        iterCadrados = cadrados.iterator();
        while (iterCadrados.hasNext()) {
            Cadrado cadrado = iterCadrados.next();
            cadrado.setCorRecheo(BLUE);
        }
    }
    
    public void posicionInicial() {
        c1.setX(4*this.getXogo1().getLADOCADRADO());
        c1.setY(0);
        c0.setX(c1.getX());
        c0.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
        c2.setX(c1.getX()+this.getXogo1().getLADOCADRADO());
        c2.setY(c1.getY());
        c3.setX(c1.getX()+this.getXogo1().getLADOCADRADO());
        c3.setY(c1.getY()-this.getXogo1().getLADOCADRADO());
    }
    
    public void posicionFichaSeguinte(){
        c1.setX(2*this.getXogo1().getLADOCADRADO());
        c1.setY(this.getXogo1().getLADOCADRADO()*2);
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
