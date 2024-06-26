/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sound;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author a22braisdr
 */
public class Sonido {
    private Clip cancion;
    private Clip sonidoLina;
    private Clip sonidoGameOver;
    private Clip sonidoFicha;
    
    public Sonido(){
        
    }

    public Clip getCancion() {
        return cancion;
    }

    public void setCancion(Clip cancion) {
        this.cancion = cancion;
    }

    public Clip getSonidoLina() {
        return sonidoLina;
    }

    public void setSonidoLina(Clip sonidoLina) {
        this.sonidoLina = sonidoLina;
    }

    public Clip getSonidoGameOver() {
        return sonidoGameOver;
    }

    public void setSonidoGameOver(Clip sonidoGameOver) {
        this.sonidoGameOver = sonidoGameOver;
    }

    public Clip getSonidoFicha() {
        return sonidoFicha;
    }

    public void setSonidoFicha(Clip sonidoFicha) {
        this.sonidoFicha = sonidoFicha;
    }
    
    
    
    
    
    //MÉTODOS PARA OS SONS/////////////////////////////////////////
    
    /**
     * Ejecuta la música del juego
     */
    public void musicaTetris(){
        String sonidoTetris="src\\sound\\cancionTetris.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetris));
            cancion = AudioSystem.getClip();
            cancion.open(audioInputStream);
            cancion.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
     
    /**
     * Ejecuta el efecto de sonido cada vez que se hace una línea
     */
    public void sonidoFacerLina(){
        String sonidoTetrisLina="src\\sound\\lineaTetris.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetrisLina));
            sonidoLina = AudioSystem.getClip();
            sonidoLina.open(audioInputStream);
            sonidoLina.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
    
    /**
     * Ejecuta el efecto de sonido al perder
     */
    public void sonidoGameOver(){
        String sonidoTetrisLina="src\\sound\\gameOver.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetrisLina));
            sonidoGameOver = AudioSystem.getClip();
            sonidoGameOver.open(audioInputStream);
            sonidoGameOver.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
    
    
    /**
     * Ejecuta un efecto de sonido al chocar una ficha con el suelo o con otra ficha
     */
    public void sonidoChocarFicha(){
        String sonidoTetrisLina="src\\sound\\sonidoFicha.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetrisLina));
            sonidoFicha = AudioSystem.getClip();
            sonidoFicha.open(audioInputStream);
            sonidoFicha.start();
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
}
