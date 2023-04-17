//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
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import modelo.fichas.FichaLEspejo;
import modelo.fichas.Cadrado;
import modelo.fichas.FichaZEspejo;
import modelo.fichas.FichaBarra;
import modelo.fichas.FichaT;
import modelo.fichas.Ficha;
import modelo.fichas.FichaZ;
import modelo.fichas.FichaCadrada;
import modelo.fichas.FichaL;
import iu.VentanaPrincipal;
import static java.awt.Color.BLACK;
import static java.awt.Color.PINK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 *
 * @author a22braisdr
 */
public class Xogo {
    
    //ATRIBUTOS
    private final int LADOCADRADO=45;
    private final int MAXX=450;
    private final int MAXY=900;
    private boolean pausa=false;
    private int numeroLinas;
    private VentanaPrincipal ventanaPrincipal;
    private Ficha fichaActual;
    private Ficha fichaSeguinte;
    private ArrayList <Cadrado> cadradosChan=new ArrayList<>();
    private ArrayList <Cadrado> cadradosABorrar=new ArrayList<>();
    private ArrayList <Cadrado> visualizacionChan=new ArrayList<>();
    private Iterator<Cadrado> iterChan;
    private Iterator<Cadrado> iterVisualizacion;
    
    //CONSTRUCTOR
    public Xogo(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal=ventanaPrincipal;
    }
    
    //GETTER E SETTER
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
    
    
    
    //MÉTODOS///////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    //Empeza o xogo
    public void empezarXogo(){
        fichaSeguinte=xerarNovaFicha();
        establecerFichaActual();
    }
    
    //MÉTODOS QUE DEBUXAN A FICHA ACTUAL E SEGUINTE///////////////////////////////////////////////////////////////
    
    //Chama a pintarCadrado
    public void debuxarFichaActual(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            ventanaPrincipal.pintarCadrado(cadradoFicha.getLblCadrado());
        }
    }
    
    //Chama a pintarCadradoSeguinte
    public void debuxarFichaSeguinte(){
        ventanaPrincipal.borrarFichaSeguinte();
        fichaSeguinte.setIterCadrados(fichaSeguinte.getCadrados().iterator());
        while (fichaSeguinte.getIterCadrados().hasNext()) {
            Cadrado cadradoFichaseguinte = fichaSeguinte.getIterCadrados().next();
            ventanaPrincipal.pintarCadradoSeguinte(cadradoFichaseguinte.getLblCadrado());
        }
    }
    
    // FIN DE MÉTODOS QUE DEBUXAN A FICHA ACTUAL E SEGUINTE///////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS DA VISUALIZACIÓN NO CHAN///////////////////////////////////////////////////////////////////////
    
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
    private void crearVisualizacion(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            Cadrado cadradoVisualizado = new Cadrado(LADOCADRADO);
            cadradoVisualizado.setCorRecheo(BLACK);
            cadradoVisualizado.setX(cadradoFicha.getX());
            cadradoVisualizado.setY(cadradoFicha.getY());
            visualizacionChan.add(cadradoVisualizado);
        }
        visualizacionBaja();
    }
    
    
    //Comproba onde chocaría a ficha abaixo e sitúase a visualización nesa posición
    private void visualizacionBaja() {
        while (!visualizacionChocaCoChan()){
            iterVisualizacion = visualizacionChan.iterator();
            while (iterVisualizacion.hasNext()) {
                Cadrado cadradoVisualizado = iterVisualizacion.next();
                cadradoVisualizado.setY(cadradoVisualizado.getY()+LADOCADRADO);
            }
        }
    }
    
    
    //Comproba que a visualización choca co chan
    private boolean visualizacionChocaCoChan() {
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
    private void borrarVisualizacion(){
        iterVisualizacion = visualizacionChan.iterator();
        while (iterVisualizacion.hasNext()) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            ventanaPrincipal.borrarCadrado(cadradoVisualizado.getLblCadrado());
        }
        visualizacionChan.clear();
    }
    
    
    //Se un cadrado da visualización superpónse á propia Ficha, este cadradoVisualizado deixará de ser visible 
    public void fichaDelanteVisualizacion(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
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
    
    //FIN MÉTODOS DA VISUALIZACIÓN///////////////////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS DE MOVER A FICHA//////////////////////////////////////////////////////////////////////////////
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverDereita() na clase Ficha.
    public void moverFichaDereita(){
        boolean mover=true;
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext() && mover) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            mover=ePosicionValida(cadradoFicha.getX() + LADOCADRADO, cadradoFicha.getY());
        }
        if (mover) {
            borrarVisualizacion();
            fichaActual.moverDereita();
            visualizarNoChan();
            debuxarFichaActual();
            fichaDelanteVisualizacion();
        }
    }
    
    
    //Chama a ePosicionValida() e comproba. Se pode moverse chama a moverEsquerda() na clase Ficha.
    public void moverFichaEsquerda(){
        boolean mover=true;
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext() && mover) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            mover=ePosicionValida(cadradoFicha.getX() - LADOCADRADO, cadradoFicha.getY());
        }
        if (mover) {
            borrarVisualizacion();
            fichaActual.moverEsquerda();
            visualizarNoChan();
            debuxarFichaActual();
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
            debuxarFichaActual();
            fichaDelanteVisualizacion();
            ventanaPrincipal.getTimer().restart();
        }
    }
    
    //Chama a comprobarRotar() e comproba. Se pode rotar chama a rotar() na clase Ficha.
    public void rotarFicha(){
        if (fichaActual.comprobarRotar()) {
            borrarVisualizacion();
            fichaActual.rotar();
            visualizarNoChan();
            debuxarFichaActual();
            fichaDelanteVisualizacion();
        }
    }
    
    //Baixa a ficha de golpe ata chocar co chan
    public void soltarFicha(){
        while (!chocaFichaCoChan()){
            fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
            while (fichaActual.getIterCadrados().hasNext()) {
                Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
                cadradoFicha.setY(cadradoFicha.getY()+LADOCADRADO);
            }
        }
        borrarVisualizacion();
        engadirFichaAoChan();
    }
    
    //FIN MÉTODOS DE MOVER A FICHA/////////////////////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODO DE COMPROBAR POSICIÓN VÁLIDA PARA A FICHA/////////////////////////////////////////////////////////

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
    
    //FIN MÉTODO DE COMPROBAR POSICIÓN VÁLIDA PARA A FICHA////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS DE COMPROBAR CHOCAR CO CHAN/////////////////////////////////////////////////////////////////////
    
    //Comproba que a ficha choque co chan.
    public boolean chocaFichaCoChan() {
        boolean chocar=false;
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
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
    
    
    //Comproba se a ficha que está en movemento choca con outra ficha que xa esté no chan.
    private boolean chocaFichaConCadradosChan(Cadrado cadradoFicha) {
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
    
    //FIN MÉTODOS DE COMPROBAR CHOCAR CO CHAN/////////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS ENGADIR FICHA AO CHAN E COMPROBAR PERDER////////////////////////////////////////////////////////
    
    /*Engade a ficha ao array de cadradosChan, e chama a borrarVisualizacion(), borrarLinasCompletas(),
    sumarPuntosFicha() e chama a comprobarPerder().*/
    //Se se perde chama a mostrarFinDoXogo().
    //Se non se perde chama a establecerFichaActual().
    public void engadirFichaAoChan(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext()){
            cadradosChan.add(fichaActual.getIterCadrados().next());
        }
        borrarVisualizacion();
        borrarLinasCompletas();
        ventanaPrincipal.sumarPuntosFicha();
        if(comprobarPerder()){
            ventanaPrincipal.mostrarFinDoXogo();
        }
        else {
            establecerFichaActual();
        }
    }
    
    /*Chamado dende engadirFichaAoChan() e recorre con un iterator e 
    se ao xerarse a nova ficha, esta choca con outra inmediatamente, perdese.*/
    private boolean comprobarPerder(){
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
    
    //FIN MÉTODOS ENGADIR FICHA AO CHAN E COMPROBAR PERDER////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS XERAR NOVA FICHA E ESTABLECER FICHA ACTUAL//////////////////////////////////////////////////////
    
    //Xera unha nova ficha aleatoria.
    public Ficha xerarNovaFicha(){
        HashMap<Integer,Ficha> map=new HashMap<>();
        map.put(1, new FichaT(this));
        map.put(2, new FichaCadrada(this));
        map.put(3, new FichaL(this));
        map.put(4, new FichaBarra(this));
        map.put(5, new FichaLEspejo(this));
        map.put(6, new FichaZ(this));
        map.put(7, new FichaZEspejo(this));
        int figura=(int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
        return map.get(figura);
    }
    
    /*Asignaselle a fichaAcual á ficha de fichaSeguinte, xérase unha nova fichaSeguinte 
    e debúxanse as fichas e a visualización da actual, tamén comproba se choca co chan*/
    private void establecerFichaActual(){
        fichaActual=fichaSeguinte;
        fichaActual.posicionInicial();
        fichaSeguinte=xerarNovaFicha();
        fichaSeguinte.posicionFichaSeguinte();
        debuxarFichaSeguinte();
        visualizarNoChan();
        debuxarFichaActual();
    }
    
    //FIN MÉTODOS XERAR NOVA FICHA E ESTABLECER FICHA ACTUAL///////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS BORRAR LIÑAS COMPLETAS///////////////////////////////////////////////////////////////////////////
    
    //Comproba cada vez que se engade unha ficha ao chan se hai algunha liña completa.
    /*No caso de ter algunha liña completa, chama a borrarLinas(). 
    Tamén chama a sumarPuntosLina(), a sumarLina() e comprobarLinas().*/
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
    }
    
    //FIN MÉTODOS BORRAR LIÑAS COMPLETAS///////////////////////////////////////////////////////////////////////
    
    
    
    
    //MÉTODOS QUE ELIMINAN OS ELEMENTOS DO PANEL DE XOGO AO REINICIAR O XOGO///////////////////////////////////
    
    //Borra todas as fichas ao reiniciar a partida.
    public void eliminarTodo(){
        borrarChan();
        borrarFichaActual();
        borrarVisualizacion();
    }
    
    
    //Borra todos os cadrados do chan cando reiniciamos o xogo.
    private void borrarChan(){
        iterChan=cadradosChan.iterator();
        while (iterChan.hasNext()){
            Cadrado cadradoChan = iterChan.next();
            ventanaPrincipal.borrarCadrado(cadradoChan.getLblCadrado());
        }
        cadradosChan.clear();
    }
    
    
    //Elimina a fichaActual cando reiniciamos o xogo.
    private void borrarFichaActual(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            ventanaPrincipal.borrarCadrado(cadradoFicha.getLblCadrado());
        }
    }
    
    //FIN MÉTODOS QUE ELIMINAN OS ELEMENTOS DO PANEL DE XOGO AO REINICIAR O XOGO//////////////////////////////////
    
    
    
    
    //MÉTODOS QUE ENGADEN UN CADRADO E SUBEN O CHAN PARA AUMENTAR A DIFICULTADE//////////////////////////////////
    
    //Este método chámase dende VentanaPirncipal e sube todo o chan para aumentar a dificultade
    public void subirChan(){
        if (chocaFichaCoChan()) { 
            engadirFichaAoChan();
        }
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
        cadradoDificultade.setCorRecheo(PINK);
        ventanaPrincipal.pintarCadrado(cadradoDificultade.getLblCadrado());
        cadradosChan.add(cadradoDificultade);
        borrarVisualizacion();
        visualizarNoChan();
    }
    
    //FIN MÉTODOS QUE ENGADEN UN CADRADO E SUBEN O CHAN PARA AUMENTAR A DIFICULTADE///////////////////////////////
}
