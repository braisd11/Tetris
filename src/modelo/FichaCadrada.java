/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author a22noellr
 */
public class FichaCadrada extends Ficha{
    
    //constructor
    public FichaCadrada() {
        posicionInicial();
    }
    
    //métodos
    public void posicionInicial() {
        c1.setX(0);
        c1.setY(0);
        c0.setX(0);
        c0.setY(0);
        c2.setX(0);
        c2.setY(0);
        c3.setX(0);
        c3.setY(0);
    }
    
    public boolean rotar() {
        return true;
    }
}
