/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sound;

import static java.awt.image.ImageObserver.ABORT;
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
    private Clip sonido;
    private Clip sonidoFichaChan;
    private Clip sonidoGameOver;
    
    public Sonido(){
        musicaTetris();
        sonidoChocarFicha();
        sonidoGameOver();
    }

    public Clip getSonido() {
        return sonido;
    }

    public void setSonido(Clip sonido) {
        this.sonido = sonido;
    }

    public Clip getSonidoFichaChan() {
        return sonidoFichaChan;
    }

    public void setSonidoFichaChan(Clip sonidoFichaChan) {
        this.sonidoFichaChan = sonidoFichaChan;
    }

    public Clip getSonidoGameOver() {
        return sonidoGameOver;
    }

    public void setSonidoGameOver(Clip sonidoGameOver) {
        this.sonidoGameOver = sonidoGameOver;
    }
    
    
    
    
    
    //MÉTODOS PARA OS SONS/////////////////////////////////////////
    
    //Reproduce a música do tetris
    public void musicaTetris(){
        String sonidoTetris="src\\sound\\sonidoTetris.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetris));
            sonido = AudioSystem.getClip();
            sonido.open(audioInputStream);
            sonido.loop(ABORT);
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
     
    //Reproduce o son de cando facemos unha liña
    public void sonidoChocarFicha(){
        String sonidoTetrisLina="src\\sound\\chocarFicha.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetrisLina));
            sonidoFichaChan = AudioSystem.getClip();
            sonidoFichaChan.open(audioInputStream);
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
    
    //Reproduce o son de cando facemos unha liña
    public void sonidoGameOver(){
        String sonidoTetrisLina="src\\sound\\gameOver.wav";
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(sonidoTetrisLina));
            sonidoGameOver = AudioSystem.getClip();
            sonidoGameOver.open(audioInputStream);
        } catch(UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.out.println("Error al reproducir el sonido.");
        }
    }
}
