/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author a22braisdr
 */
public abstract class Ficha {
    //atributos
    public ArrayList<Cadrado> cadrados = new ArrayList<>();
    
    //constructor

    public Ficha() {
        crearCadrados();
    }
    
    
    //métodos
    //crea os cadrados para montar as fichas
    private void crearCadrados() {
        Cadrado c0 = new Cadrado();
        Cadrado c1 = new Cadrado();
        Cadrado c2 = new Cadrado();
        Cadrado c3 = new Cadrado();
        montarFicha(c0, c1, c2, c3);
    }
    //monta a ficha cos cadrados creados
    private void montarFicha(Cadrado c0, Cadrado c1, Cadrado c2, Cadrado c3) {
        cadrados.add(c0);
        cadrados.add(c1);
        cadrados.add(c2);
        cadrados.add(c3);
    }
    
    public boolean moverDereita() {
        boolean mover = true;
        for (int i = 0; i < cadrados.size(); i++) {
            int coordXNuevo = cadrados.get(i).getX() + LADOCADRADO;
            if (coordXNuevo>=MAXX) {
                mover = false;
            }
        }
        return mover;
    }
    
    public boolean moverEsquerda() {
        boolean mover = true;
        for (int i = 0; i < cadrados.size(); i++) {
            int coordXNuevo = cadrados.get(i).getX() - LADOCADRADO;
            if (coordXNuevo<0) {
                mover = false;
            }
        }
        return mover;
    }
    
    public boolean moverAbaixo() {
        boolean mover = true;
        for (int i = 0; i < cadrados.size(); i++) {
            int coordYNuevo = cadrados.get(i).getY() + LADOCADRADO;
            if (coordYNuevo>=MAXY) {
                mover = false;
            }
        }
        return mover;
        /*for (int i = 0; i < cadrados.size(); i++) {
            cadrados.get(i).setY(cadrados.get(i).getY() + LADOCADRADO);
        }*/
    }
    
    public abstract boolean rotar();
    public abstract void posicionInicial();
}
