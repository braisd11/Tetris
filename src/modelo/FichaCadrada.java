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
        return true;
    }
}
