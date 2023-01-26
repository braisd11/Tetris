/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author a22noellr
 */
public class FichaBarra extends Ficha{
    
    //constructor
    public FichaBarra() {
        posicionInicial();
    }
    
    //métodos
    public void posicionInicial() {
        cadrados.get(1).setX(0);
        cadrados.get(1).setY(0);
        cadrados.get(0).setX(0);
        cadrados.get(0).setY(0);
        cadrados.get(2).setX(0);
        cadrados.get(2).setY(0);
        cadrados.get(3).setX(0);
        cadrados.get(3).setY(0);
    }
    
    public boolean rotar() {
        int c1X = cadrados.get(1).getX();
        int c1Y = cadrados.get(1).getY();
        if (cadrados.get(0).getX()==cadrados.get(1).getX()) {
            cadrados.get(0).setX(c1X-xogo1.getLADOCADRADO);
            cadrados.get(0).setY(c1Y+xogo1.getLADOCADRADO);
            cadrados.get(2).setX(c1X+xogo1.getLADOCADRADO);
            cadrados.get(2).setY(c1Y-xogo1.getLADOCADRADO);
            cadrados.get(3).setX(c1X+2*xogo1.getLADOCADRADO);
            cadrados.get(3).setY(c1Y-2*xogo1.getLADOCADRADO);
        }
        if (cadrados.get(0).getY()==cadrados.get(1).getY()) {
            cadrados.get(0).setX(c1X+xogo1.getLADOCADRADO);
            cadrados.get(0).setY(c1Y-xogo1.getLADOCADRADO);
            cadrados.get(2).setX(c1X-xogo1.getLADOCADRADO);
            cadrados.get(2).setY(c1Y+xogo1.getLADOCADRADO);
            cadrados.get(3).setX(c1X-2*xogo1.getLADOCADRADO);
            cadrados.get(3).setY(c1Y+2*xogo1.getLADOCADRADO);
        }
        return true;
    }
}
