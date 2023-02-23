//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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import iu.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author a22braisdr
 */
public class Xogo {

    private int LADOCADRADO=50;
    private final int MAXX=450;
    private final int MAXY=900;
    private boolean pausa=false;
    private int numeroLinas=18;
    public VentanaPrincipal ventanaPrincipal;
    public Ficha fichaActual;
    ArrayList <Cadrado> cadradosChan=new ArrayList<>();
    ArrayList <Cadrado> cadradosABorrar=new ArrayList<>();
    ArrayList <Cadrado> visualizacionChan=new ArrayList<>();
    Iterator<Cadrado> iterChan;
    Iterator<Cadrado> iterVisualizacion;

    public Xogo(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal=ventanaPrincipal;
        xerarNovaFicha();
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
    //Chama a pintarCadrado
    public void debuxarCadrados(){
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            ventanaPrincipal.pintarCadrado(cadradoFicha.getLblCadrado());
        }
    }
    /*
    public void visualizarNoChan(){
        crearVisualizacion();
        iterVisualizacion = visualizacionChan.iterator();
        while (iterVisualizacion.hasNext()) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            ventanaPrincipal.pintarCadrado(cadradoVisualizado.getLblCadrado());
        }
    }
    
    public void crearVisualizacion(){
        Cadrado c0 = new Cadrado();
        visualizacionChan.add(c0);
        Cadrado c1 = new Cadrado();
        visualizacionChan.add(c1);
        Cadrado c2 = new Cadrado();
        visualizacionChan.add(c2);
        Cadrado c3 = new Cadrado();
        visualizacionChan.add(c3);
    }
    */
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverDereita() na clase Ficha.
    public void moverFichaDereita(){
        boolean mover=true;
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext() && mover) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            mover=ePosicionValida(cadradoFicha.getX() + LADOCADRADO, cadradoFicha.getY());
        }
        if (mover) {
            fichaActual.moverDereita();
            debuxarCadrados();
        }
        if (chocaFichaCoChan()) {
            engadirFichaAoChan();
        }
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverEsquerda() na clase Ficha.
    public void moverFichaEsquerda(){
        boolean mover=true;
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext() && mover) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            mover=ePosicionValida(cadradoFicha.getX() - LADOCADRADO, cadradoFicha.getY());
        }
        if (mover) {
            fichaActual.moverEsquerda();
            debuxarCadrados();
        }
        if (chocaFichaCoChan()) {
            engadirFichaAoChan();
        }
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverAbaixo() na clase Ficha.
    public void moverFichaAbaixo(){
        fichaActual.moverAbaixo();
        debuxarCadrados();
        if (chocaFichaCoChan()) { 
            engadirFichaAoChan();
        }
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a rotar() na clase Ficha.
    public void rotarFicha(){
        fichaActual.rotar();
        boolean rotar=true;
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext() && rotar) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            rotar=ePosicionValida(cadradoFicha.getX(), cadradoFicha.getY());
        }
        if (rotar) {
            debuxarCadrados();
        }
        else {
            fichaActual.rotar();
            fichaActual.rotar();
            fichaActual.rotar();
        }
        if (chocaFichaCoChan()) {
            engadirFichaAoChan();
        }
    }
    
    public void soltarFicha(){
        while (!chocaFichaCoChan()){
            fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
            while (fichaActual.getIterCadrados().hasNext()) {
                Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
                cadradoFicha.setY(cadradoFicha.getY()+LADOCADRADO);
            }
        }
        engadirFichaAoChan();
    }
    

    //Comproba que a ficha non sobrepase os límites laterais e se chega ao chan ou choca con outra ficha.
    public boolean ePosicionValida(int x, int y){
        boolean posicionValida=true;
        if (x>=MAXX || x<0){
            posicionValida=false;
        }
        else {
            iterChan=cadradosChan.iterator();
            while (iterChan.hasNext() && posicionValida) {
                Cadrado cadradoChan = iterChan.next();
                if (x==cadradoChan.getX() && y==cadradoChan.getY()){
                    posicionValida=false;
                }
            }
        }
        return posicionValida;
    }
    
    
    //Comproba que a ficha choque co chan e no caso de chocar, engádea ao chan e chama a xerarNovaFicha().
    public boolean chocaFichaCoChan() {
        boolean chocar=false;
        fichaActual.iterCadrados= fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext() && !chocar) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            if (cadradoFicha.getY()==MAXY-LADOCADRADO) {
                chocar=true;
            }
            else {
                chocar=chocaFichaConCadradosChan(cadradoFicha);
            }
        }
        return chocar;
    }
    
    
    //Comproba se a ficha que está en movemento choca con outra ficha que xa esté no chan
    public boolean chocaFichaConCadradosChan(Cadrado cadradoFicha) {
        boolean chocar=false;
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext() && !chocar) {
            Cadrado cadradoChan = iterChan.next();
            if (cadradoFicha.getY()==cadradoChan.getY()-LADOCADRADO && cadradoFicha.getX()==cadradoChan.getX()){
                chocar=true;
            }
        }
        return chocar;
    }
    
    
    //Engade a ficha ao array de cadradosChan
    public void engadirFichaAoChan(){
        fichaActual.iterCadrados=fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext()){
            cadradosChan.add(fichaActual.iterCadrados.next());
        }
        borrarLinasCompletas();
        ventanaPrincipal.sumarPuntosFicha();
        if(comprobarPerder()){
            ventanaPrincipal.mostrarFinDoXogo();
        }
        else {
            xerarNovaFicha();
        }
    }
    
    
    //Chamado dende engadirFichaAoChan() e recorre con un iterator e se ao xerarse a nova ficha choca con outra inmediatamente perdese.
    public boolean comprobarPerder(){
        boolean perder=false;
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext() && !perder){
            Cadrado cadradoChan = iterChan.next();
            if (cadradoChan.getY()<=49){
                perder=true;
            }
        }
        return perder;
    }
    
    
    //Xera unha nova ficha aleatoria e debuxaa. 
    //Cada vez que unha ficha choca co chan xera automáticamente outra.
    public void xerarNovaFicha(){
        int figura=(int) Math.floor(Math.random() * (4 - 1 + 1) + 1);
        if (figura==1){
            fichaActual=new FichaT(this);
        }
        if (figura==2){
            fichaActual=new FichaCadrada(this);
        }
        if (figura==3){
            fichaActual=new FichaL(this);
        }
        if (figura==4){
            fichaActual=new FichaBarra(this);
        }
        debuxarCadrados();
        if (chocaFichaCoChan()) {
            engadirFichaAoChan();
        }
    }
    
    
    //Comproba cada vez que se engade unha ficha ao chan se hai algunha liña completa.
    //No caso de haber algunha liña completa, chama a borrarLinas().
    public void borrarLinasCompletas(){
        int altitud=0;
        while (altitud<numeroLinas*LADOCADRADO) {
            int sumCadradosFila=0;
            iterChan=cadradosChan.iterator();
            while (iterChan.hasNext()){
                Cadrado cadradoChan = iterChan.next();
                if (cadradoChan.getY()==altitud){
                    sumCadradosFila++;
                }
                if (sumCadradosFila==9){
                    borrarLina(altitud);
                    ventanaPrincipal.sumarPuntosLina();
                    ventanaPrincipal.sumarLina();
                    ventanaPrincipal.comprobarLinas();
                }
            }
            altitud+=50;
        }
        cadradosChan.removeAll(cadradosABorrar);
    }
    
    
    //Borra as liñas que están completas.
    public void borrarLina(int altitud){
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext()){
            Cadrado cadradoChan = iterChan.next();
            if (cadradoChan.getY()==altitud){
                ventanaPrincipal.borrarCadrado(cadradoChan.getLblCadrado());
                cadradosABorrar.add(cadradoChan);
            }
            else if (cadradoChan.getY()<altitud){
                cadradoChan.setY(cadradoChan.getY()+LADOCADRADO);
            }
        }
        Iterator<Cadrado> iterBorrar=cadradosABorrar.iterator();
        while (iterBorrar.hasNext()){
            Cadrado cadradoABorrar=iterBorrar.next();
            ventanaPrincipal.borrarCadrado(cadradoABorrar.getLblCadrado());
        }
    }
    
    
    //Borra todas as fichas ao reiniciar a partida
    public void eliminarTodo(){
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext()){
            Cadrado cadradoChan = iterChan.next();
            ventanaPrincipal.borrarCadrado(cadradoChan.getLblCadrado());
            cadradosABorrar.add(cadradoChan);
        }
        Iterator<Cadrado> iterBorrar=cadradosABorrar.iterator();
        while (iterBorrar.hasNext()){
            Cadrado cadradoABorrar=iterBorrar.next();
            ventanaPrincipal.borrarCadrado(cadradoABorrar.getLblCadrado());
        }
    }
}
