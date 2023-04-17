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
    
    /**
     * 
     * @param ventanaPrincipal Ventana de IU
     */
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
    
    /**
     * Llama a xerarNovaFicha() y establecerFichaActual()
     */
    public void empezarXogo(){
        fichaSeguinte=xerarNovaFicha();
        establecerFichaActual();
    }
    
    //MÉTODOS QUE DEBUXAN A FICHA ACTUAL E SEGUINTE///////////////////////////////////////////////////////////////
    
    /**
     * Dibuja la fichaActual en el JPanel
     */
    public void debuxarFichaActual(){
        fichaActual.setIterCadrados(fichaActual.getCadrados().iterator());
        while (fichaActual.getIterCadrados().hasNext()) {
            Cadrado cadradoFicha = fichaActual.getIterCadrados().next();
            ventanaPrincipal.pintarCadrado(cadradoFicha.getLblCadrado());
        }
    }
    
    /**
     * Dibuja la Ficha siguiente en la IU
     */
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
    
    /**
     * Visualiza la Ficha en el sitio donde caería
     */
    public void visualizarNoChan(){
        crearVisualizacion();
        iterVisualizacion = visualizacionChan.iterator();
        while (iterVisualizacion.hasNext()) {
            Cadrado cadradoVisualizado = iterVisualizacion.next();
            ventanaPrincipal.pintarCadrado(cadradoVisualizado.getLblCadrado());
        }
    }
    
    
    
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
    
    
    
    private void fichaDelanteVisualizacion(){
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
    
    /**
     * Compueba si se puede mover a la derecha
     */
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
    
    /**
     * Compueba si se puede mover a la izquierda
     */
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
    
    
    /**
     * Compueba si se puede mover a abajo
     */
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
    
    /**
     * Compueba si puede rotar la ficha
     */
    public void rotarFicha(){
        if (fichaActual.comprobarRotar()) {
            borrarVisualizacion();
            fichaActual.rotar();
            visualizarNoChan();
            debuxarFichaActual();
            fichaDelanteVisualizacion();
        }
    }
    
    /**
     * Baja la ficha hasta chocar con otra ficha o con el suelo
     */
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

    /**
     * Comprueba si la posición teórica siguiente es válida
     * @param x coordenada x que tendría en la siguiente posición
     * @param y coordenada y que tendría en la siguiente posición
     * @return si la posición es válida o no
     */
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
    
    /**
     * Comprueba si la ficha choca con el suelo o con otra ficha
     * @return si choca o no
     */
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
    
    /**
     * Añade la ficha al array de fichas en el suelo
     */
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
    
    /**
     * Genera un número aleatorio y busca en el Hashmap la ficha asociada a ese número para generarla
     * @return Retorna la Ficha asociada al número del Hashmap 
     */
    public Ficha xerarNovaFicha(){
        Ficha ficha=null;
        HashMap<Integer,Ficha> map=new HashMap<>();
        map.put(1, ficha=new FichaT(this));
        map.put(2, ficha=new FichaCadrada(this));
        map.put(3, ficha=new FichaL(this));
        map.put(4, ficha=new FichaBarra(this));
        map.put(5, ficha=new FichaLEspejo(this));
        map.put(6, ficha=new FichaZ(this));
        map.put(7, ficha=new FichaZEspejo(this));
        int figura=(int) Math.floor(Math.random() * (7 - 1 + 1) + 1);
        return map.get(figura);
    }
    
    /**
     * Coge la fichaSeguinte y la establece como la fichaActual.
     */
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
    
    /**
     * Comprueba si hay que borrar alguna línea
     */
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
    
    
    /**
     * Borra las lineas que estén completas
     * @param altitud altura a la que está la línea a borrar
     */
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
    
    /**
     * Reinicia el juego
     */
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
    
    /**
     * Sube una línea para aumentar la dificultad
     */
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
    
    
    /**
     * Añade un cuadrado a la última línea
     */
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
