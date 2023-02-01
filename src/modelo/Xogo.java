//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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import iu.VentanaPrincipal;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author a22braisdr
 */
public class Xogo extends JPanel {

    private int LADOCADRADO=50;
    private final int MAXX=450;
    private final int MAXY=800;
    private boolean pausa=false;
    private int numeroLinas=16;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
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
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverDereita() na clase Ficha.
    public void moverFichaDereita(){
        
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverEsquerda() na clase Ficha.
    public void moverFichaEsquerda(){
        
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverAbaixo() na clase Ficha.
    public void moverFichaAbaixo(){
        
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a rotar() na clase Ficha.
    public void rotarFicha(){
        
    }
    

    //Comproba que a ficha non sobrepase os límites laterais e se chega ao chan ou choca con outra ficha.
    public void ePosicionValida(int x, int y){
        if (x>MAXX || x<0){
            
        }
        else if (y>MAXY){
            chocaFichaCoChan();
        }
    }
    
    
    //Comproba que a ficha choque co chan e no caso de chocar, engádea ao chan e chama a xerarNovaFicha().
    public void chocaFichaCoChan (){
        
    }
    
    
    public void xerarNovaFicha(){
        int figura=(int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
        if (figura==1){
            FichaT fichaActual=new FichaT(this);
        }
        if (figura==2){
            FichaCadrada fichaActual=new FichaCadrada(this);
        }
        if (figura==3){
            FichaL fichaActual=new FichaL(this);
        }
        if (figura==4){
            FichaBarra fichaActual=new FichaBarra(this);
        }
    }
}
