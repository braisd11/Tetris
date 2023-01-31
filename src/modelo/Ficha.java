/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JPanel;

/**
 *
 * @author a22braisdr
 */
public abstract class Ficha {
    //atributos
    public Xogo xogo1;

    
    public ArrayList<Cadrado> cadrados = new ArrayList<>();
    Iterator<Cadrado> iter;
    public Cadrado c0 = cadrados.get(0);
    public Cadrado c1 = cadrados.get(1);
    public Cadrado c2 = cadrados.get(2);
    public Cadrado c3 = cadrados.get(3);
    
    //constructor
    public Ficha(Xogo xogo1) {
        this.xogo1 = xogo1;
        crearCadrados();
    }
    
    //getter y setter
    public ArrayList<Cadrado> getCadrados() {
        return cadrados;
    }
    public void setCadrados(ArrayList<Cadrado> cadrados) {
        this.cadrados = cadrados;
    }
    public Xogo getXogo1() {
        return xogo1;
    }
    public void setXogo1(Xogo xogo1) {
        this.xogo1 = xogo1;
    }
    public Iterator<Cadrado> getIter() {
        return iter;
    }
    public void setIter(Iterator<Cadrado> iter) {
        this.iter = iter;
    }
    
    
    //Métodos
    //Crea os cadrados para montar as fichas
    private void crearCadrados() {
        Cadrado c0 = new Cadrado();
        Cadrado c1 = new Cadrado();
        Cadrado c2 = new Cadrado();
        Cadrado c3 = new Cadrado();
        montarFicha(c0, c1, c2, c3);
    }
    
    //Monta a ficha cos cadrados creados
    private void montarFicha(Cadrado c0, Cadrado c1, Cadrado c2, Cadrado c3) {
        cadrados.add(c0);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);
    }
    
    public boolean moverDereita() {
        iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cadrado = iter.next();
            cadrado.setX(cadrado.getX() + xogo1.getLADOCADRADO());
        }
        return true;
        /*
        while (iter.hasNext()) {
            Cadrado cadrado = fichaActual.getIter.next();
            cadrado.setX(cadrado.getX() + xogo1.getLADOCADRADO);
            ePosicionValida(cadrado.getX() + LADOCADRADO, cadrado.getY());
        }
        */
    }
    
    public boolean moverEsquerda() {
        iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cadrado = iter.next();
            cadrado.setX(cadrado.getX() - xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    public boolean moverAbaixo() {
        iter = cadrados.iterator();
        while (iter.hasNext()) {
            Cadrado cadrado = iter.next();
            cadrado.setY(cadrado.getY() + xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    public abstract boolean rotar();
    public abstract void posicionInicial();
    public abstract void cor();
}
