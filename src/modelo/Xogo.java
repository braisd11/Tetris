//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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import iu.VentanaPrincipal;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author a22braisdr
 */
public class Xogo {

    private final int LADOCADRADO=45;
    private final int MAXX=450;
    private final int MAXY=900;
    private boolean pausa=false;
    private int numeroLinas;
    private VentanaPrincipal ventanaPrincipal;
    private Ficha fichaActual;
    private Ficha fichaSeguinte;
    ArrayList <Cadrado> cadradosChan=new ArrayList<>();
    ArrayList <Cadrado> cadradosABorrar=new ArrayList<>();
    ArrayList <Cadrado> visualizacionChan=new ArrayList<>();
    Iterator<Cadrado> iterChan;
    Iterator<Cadrado> iterVisualizacion;

    public Xogo(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal=ventanaPrincipal;
        fichaActual=xerarNovaFicha();
        fichaActual.posicionInicial();
        fichaSeguinte=xerarNovaFicha();
        fichaSeguinte.posicionFichaSeguinte();
        debuxarFichaSeguinte();
        visualizarNoChan();
        debuxarCadrados();
    }

    public int getLADOCADRADO() {
        return LADOCADRADO;
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
    
    //Chama a pintarCadradoSeguinte
    public void debuxarFichaSeguinte(){
        ventanaPrincipal.borrarFichaSeguinte();
        fichaSeguinte.iterCadrados = fichaSeguinte.getCadrados().iterator();
        while (fichaSeguinte.getIterCadrados().hasNext()) {
            Cadrado cadradoFichaseguinte = fichaSeguinte.getIterCadrados().next();
            ventanaPrincipal.pintarCadradoSeguinte(cadradoFichaseguinte.getLblCadrado());
        }
    }
    
    //Chama a crearVisualizacion() e mostra a visualización de onde vai a caer a ficha
    public void visualizarNoChan(){
        crearVisualizacion();
        iterVisualizacion = visualizacionChan.iterator();
        while (iterVisualizacion.hasNext()) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            ventanaPrincipal.pintarCadrado(cadradoVisualizado.getLblCadrado());
        }
    }
    
    
    //Crea a visualización da ficha actual
    public void crearVisualizacion(){
        Cadrado c0 = new Cadrado(LADOCADRADO);
        c0.setCorRecheo(Color.LIGHT_GRAY);
        c0.setX(fichaActual.c0.getX());
        c0.setY(fichaActual.c0.getY());
        visualizacionChan.add(c0);
        Cadrado c1 = new Cadrado(LADOCADRADO);
        c1.setCorRecheo(Color.LIGHT_GRAY);
        c1.setX(fichaActual.c1.getX());
        c1.setY(fichaActual.c1.getY());
        visualizacionChan.add(c1);
        Cadrado c2 = new Cadrado(LADOCADRADO);
        c2.setCorRecheo(Color.LIGHT_GRAY);
        c2.setX(fichaActual.c2.getX());
        c2.setY(fichaActual.c2.getY());
        visualizacionChan.add(c2);
        Cadrado c3 = new Cadrado(LADOCADRADO);
        c3.setCorRecheo(Color.LIGHT_GRAY);
        c3.setX(fichaActual.c3.getX());
        c3.setY(fichaActual.c3.getY());
        visualizacionChan.add(c3);
        visualizacionBaja();
    }
    
    
    //Comrpoba onde chocaría a ficha abaixo e sitúase a visualización nesa posición
    public void visualizacionBaja() {
        while (!visualizacionChocaCoChan()){
            iterVisualizacion = visualizacionChan.iterator();
            while (iterVisualizacion.hasNext()) {
                Cadrado cadradoVisualizado = iterVisualizacion.next();
                cadradoVisualizado.setY(cadradoVisualizado.getY()+LADOCADRADO);
            }
        }
    }
    
    
    //Comproba que a visualización choca co chan
    public boolean visualizacionChocaCoChan() {
        boolean chocar=false;
        iterVisualizacion= visualizacionChan.iterator();
        while (iterVisualizacion.hasNext() && !chocar) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            if (cadradoVisualizado.getY()==MAXY-LADOCADRADO) {
                chocar=true;
            }
            else {
                chocar=chocaFichaConCadradosChan(cadradoVisualizado);
            }
        }
        return chocar;
    }
    
    
    //Elimina a visualización
    public void borrarVisualizacion(){
        iterVisualizacion = visualizacionChan.iterator();
        while (iterVisualizacion.hasNext()) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            ventanaPrincipal.borrarCadrado(cadradoVisualizado.getLblCadrado());
        }
        visualizacionChan.clear();
    }
  
    
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverDereita() na clase Ficha.
    public void moverFichaDereita(){
        boolean mover=true;
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext() && mover) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            mover=ePosicionValida(cadradoFicha.getX() + LADOCADRADO, cadradoFicha.getY());
        }
        if (mover) {
            borrarVisualizacion();
            fichaActual.moverDereita();
            visualizarNoChan();
            debuxarCadrados();
            fichaDelanteVisualizacion();
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
            borrarVisualizacion();
            fichaActual.moverEsquerda();
            visualizarNoChan();
            debuxarCadrados();
            fichaDelanteVisualizacion();
        }
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverAbaixo() na clase Ficha.
    public void moverFichaAbaixo() {
        if (chocaFichaCoChan()) { 
            engadirFichaAoChan();
        }
        else{
            fichaActual.moverAbaixo();
            debuxarCadrados();
            fichaDelanteVisualizacion();
        }
    }
    
    public void fichaDelanteVisualizacion(){
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            iterVisualizacion = visualizacionChan.iterator();
            while (iterVisualizacion.hasNext()) {
                Cadrado cadradoVisualizado = iterVisualizacion.next();
                if (cadradoFicha.getLblCadrado().getY()==cadradoVisualizado.getLblCadrado().getY() && cadradoFicha.getLblCadrado().getX()==cadradoVisualizado.getLblCadrado().getX()){
                    cadradoVisualizado.getLblCadrado().setVisible(false);
                }
            }
        }
    }
    
    //Chama a comprobarRotar() e comproba. Se pode rotar chama a rotar() na clase Ficha.
    public void rotarFicha(){
        if (fichaActual.comprobarRotar()) {
            borrarVisualizacion();
            fichaActual.rotar();
            visualizarNoChan();
            debuxarCadrados();
            fichaDelanteVisualizacion();
        }
    }
    
    //Baixa a ficha de golpe ata chocar co chan
    public void soltarFicha(){
        while (!chocaFichaCoChan()){
            fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
            while (fichaActual.getIterCadrados().hasNext()) {
                Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
                cadradoFicha.setY(cadradoFicha.getY()+LADOCADRADO);
            }
        }
        borrarVisualizacion();
        engadirFichaAoChan();
    }
    

    //Comproba que a ficha non sobrepase os límites laterais e se chega ao chan ou choca con outra ficha.
    public boolean ePosicionValida(int x, int y){
        boolean posicionValida=true;
        if (x>=MAXX || x<0){
            posicionValida=false;
        }
        else if (y>=MAXY){
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
    
    
    //Engade a ficha ao array de cadradosChan e chama a comprobar perder.
    //Se se perde chama a mostrarFinDoXogo().
    //Se non se perde A fichaSeguinte transformase na actual e xerase unha nova fichaSeguinte.
    public void engadirFichaAoChan(){
        fichaActual.iterCadrados=fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext()){
            cadradosChan.add(fichaActual.iterCadrados.next());
        }
        borrarVisualizacion();
        borrarLinasCompletas();
        ventanaPrincipal.sumarPuntosFicha();
        if(comprobarPerder()){
            ventanaPrincipal.mostrarFinDoXogo();
        }
        else {
            fichaActual=fichaSeguinte;
            fichaActual.posicionInicial();
            fichaSeguinte=xerarNovaFicha();
            fichaSeguinte.posicionFichaSeguinte();
            debuxarFichaSeguinte();
            visualizarNoChan();
            debuxarCadrados();
            if (chocaFichaCoChan()) {
                engadirFichaAoChan();
            }
        }
    }
    
    //Chamado dende engadirFichaAoChan() e recorre con un iterator e se ao xerarse a nova ficha choca con outra inmediatamente perdese.
    public boolean comprobarPerder(){
        boolean perder=false;
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext() && !perder){
            Cadrado cadradoChan = iterChan.next();
            if (cadradoChan.getY()<LADOCADRADO){
                perder=true;
            }
        }
        return perder;
    }
    
    
    //Xera unha nova ficha aleatoria.
    public Ficha xerarNovaFicha(){
        Ficha ficha=null;
        int figura=(int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
        if (figura==1){
            ficha=new FichaT(this);
        }
        if (figura==2){
            ficha=new FichaCadrada(this);
        }
        if (figura==3){
            ficha=new FichaL(this);
        }
        if (figura==4){
            ficha=new FichaBarra(this);
        }
        if (figura==5){
            ficha=new FichaLEspejo(this);
        }
        if (figura==6){
            ficha=new FichaZ(this);
        }
        if (figura==7){
            ficha=new FichaZEspejo(this);
        }
        return ficha;
    }
    
    
    
    
    
    //Comproba cada vez que se engade unha ficha ao chan se hai algunha liña completa.
    //No caso de ter algunha liña completa, chama a borrarLinas().
    public void borrarLinasCompletas(){
        int altitud=0;
        while (altitud<MAXY) {
            int sumCadradosFila=0;
            iterChan=cadradosChan.iterator();
            while (iterChan.hasNext()){
                Cadrado cadradoChan = iterChan.next();
                if (cadradoChan.getY()==altitud){
                    sumCadradosFila++;
                }
                if (sumCadradosFila==(MAXX/LADOCADRADO)){
                    borrarLina(altitud);
                    ventanaPrincipal.sumarPuntosLina();
                    ventanaPrincipal.sumarLina();
                    ventanaPrincipal.comprobarLinas();
                }
            }
            altitud+=LADOCADRADO;
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
    
    
    //Borra todas as fichas ao reiniciar a partida.
    public void eliminarTodo(){
        borrarChan();
        borrarFichaActual();
        borrarVisualizacion();
    }
    
    
    //Borra todos os cadrados do chan cando reiniciamos o xogo.
    public void borrarChan(){
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext()){
            Cadrado cadradoChan = iterChan.next();
            ventanaPrincipal.borrarCadrado(cadradoChan.getLblCadrado());
        }
        cadradosChan.clear();
    }
    
    
    //Elimina a fichaActual cando reiniciamos o xogo.
    public void borrarFichaActual(){
        fichaActual.iterCadrados = fichaActual.getCadrados().iterator();
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            ventanaPrincipal.borrarCadrado(cadradoFicha.getLblCadrado());
        }
    }
    
    //Este método chámase dende VentanaPirncipal e sube todo o chan para aumentar a dificultade
    public void subirChan(){
        iterChan=cadradosChan.iterator();
        while(iterChan.hasNext()){
            Cadrado cadradoChan=iterChan.next();
            cadradoChan.setY(cadradoChan.getY()-LADOCADRADO);
        }
    }
    
    
    //Método que engade un cadrado abaixo de todo para aumentar a dificultade
    public void engadirCadradoDificultade(){
        Cadrado cadradoDificultade=new Cadrado(LADOCADRADO);
        int azar= (int) Math.floor(Math.random() * ((MAXX/LADOCADRADO-1) - 0 + 1) + 0);
        cadradoDificultade.setY(MAXY-LADOCADRADO);
        cadradoDificultade.setX(azar*LADOCADRADO);
        cadradoDificultade.setCorRecheo(Color.PINK);
        ventanaPrincipal.pintarCadrado(cadradoDificultade.getLblCadrado());
        cadradosChan.add(cadradoDificultade);
        borrarVisualizacion();
        visualizarNoChan();
    }
}
