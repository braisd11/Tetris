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
public class Xogo {
    private int LADOCADRADO=50;
    private final int MAXX=450;
    private final int MAXY=800;
    private boolean pausa=false;
    private int numeroLinas=16;
    ArrayList <Cadrado> cadradosChan=new ArrayList<>();

    public Xogo() {
        
    }

    public int getLADOCADRADO() {
        return LADOCADRADO;
    }

    public void setLADOCADRADO(int LADOCADRADO) {
        this.LADOCADRADO = LADOCADRADO;
    }

    public boolean isPausa() {
        return pausa;
    }

    public void setPausa(boolean pausa) {
        this.pausa = pausa;
    }

    public int getNumeroLinas() {
        return numeroLinas;
    }

    public void setNumeroLinas(int numeroLinas) {
        this.numeroLinas = numeroLinas;
    }

    public ArrayList<Cadrado> getCadradosChan() {
        return cadradosChan;
    }

    public void setCadradosChan(ArrayList<Cadrado> cadradosChan) {
        this.cadradosChan = cadradosChan;
    }
    
    //MÉTODOS
    
    public void moverFichaDereita(){
        
    }
    
    public void moverFichaEsquerda(){
        
    }
    
    public void moverFichaAbaixo(){
        
    }
    
    public void rotarFicha(){
        
    }
    
}
