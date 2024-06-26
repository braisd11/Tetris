/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.fichas;


import java.util.ArrayList;
import java.util.Iterator;
import modelo.Xogo;

/**
 *
 * @author a22braisdr
 */
public abstract class Ficha {
    //atributos
    private Xogo xogo1;
    private ArrayList<Cadrado> cadrados = new ArrayList<>();
    private Iterator<Cadrado> iterCadrados;
    protected Cadrado c0;
    protected Cadrado c1;
    protected Cadrado c2;
    protected Cadrado c3;
    
    //constructor
    /**
     * Crea un obxeto da clase Ficha
     * @param xogo1 - Obxeto Xogo ao que pertence
     */
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
        getCadrados().add(c0);
        getCadrados().add(c1);
        getCadrados().add(c2);
        getCadrados().add(c3);
    }
    
    //Move os cadrados da ficha cara a dereita
    /**
     * Move a ficha cara a dereita
     * @return true
     */
    public boolean moverDereita() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.setX(cadrado.getX() + xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    //Move os cadrados da ficha cara a esquerda
    /**
     * Move a ficha cara a esquerda
     * @return true
     */
    public boolean moverEsquerda() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.setX(cadrado.getX() - xogo1.getLADOCADRADO());
        }
        return true;
    }
    
    //move os cadrados da ficha cara abaixo
    /**
     * Move a ficha cara abaixo
     * @return true
     */
    public boolean moverAbaixo() {
        setIterCadrados(getCadrados().iterator());
        while (getIterCadrados().hasNext()) {
            Cadrado cadrado = getIterCadrados().next();
            cadrado.setY(cadrado.getY() + xogo1.getLADOCADRADO());
        }
        return true;
    }
    /**
     * comproba se a ficha pode rotar segundo a posicion na que esté
     * @return true se pode rotar, false se non pode rotar
     */
    public abstract boolean comprobarRotar();
    /**
     * Rota a ficha segundo a posicion na que esté
     * @return true
     */
    public abstract boolean rotar();
    /**
     * Establece a posición inicial da ficha
     */
    public abstract void posicionInicial();
    /**
     * Establece a posicion da ficha que vai a aparecer a continuación
     */
    public abstract void posicionFichaSeguinte();
    /**
     * Establece a cor da ficha
     */
    protected abstract void cor();
}
