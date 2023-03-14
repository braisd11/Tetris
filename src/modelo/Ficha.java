/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author a22braisdr
 */
public abstract class Ficha {
    //atributos
    protected Xogo xogo1;
    protected ArrayList<Cadrado> cadrados = new ArrayList<>();
    protected Iterator<Cadrado> iterCadrados;
    protected Cadrado c0;
    protected Cadrado c1;
    protected Cadrado c2;
    protected Cadrado c3;
    
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
    public Iterator<Cadrado> getIterCadrados() {
        return iterCadrados;
    }
    public void setIterCadrados(Iterator<Cadrado> iter) {
        this.iterCadrados = iter;
    }
    
    
    //Métodos
    //Crea os cadrados para montar as fichas
    private void crearCadrados() {
        c0 = new Cadrado(xogo1.getLADOCADRADO());
        c1 = new Cadrado(xogo1.getLADOCADRADO());
        c2 = new Cadrado(xogo1.getLADOCADRADO());
        c3 = new Cadrado(xogo1.getLADOCADRADO());
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
        iterCadrados = cadrados.iterator();
        while (iterCadrados.hasNext()) {
            Cadrado cadrado = iterCadrados.next();
            cadrado.setX(cadrado.getX() + xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    public boolean moverEsquerda() {
        iterCadrados = cadrados.iterator();
        while (iterCadrados.hasNext()) {
            Cadrado cadrado = iterCadrados.next();
            cadrado.setX(cadrado.getX() - xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    public boolean moverAbaixo() {
        iterCadrados = cadrados.iterator();
        while (iterCadrados.hasNext()) {
            Cadrado cadrado = iterCadrados.next();
            cadrado.setY(cadrado.getY() + xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    public abstract boolean comprobarRotar();
    public abstract boolean rotar();
    public abstract void posicionInicial();
    public abstract void posicionFichaSeguinte();
    public abstract void cor();
}
