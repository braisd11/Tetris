/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xogoaforcado;

/**
 *
 * @author a22braisdr
 */

import java.util.ArrayList;
import java.util.Scanner;


public class Aforcado {
    private String palabra;
    ArrayList <Character> letras = new ArrayList<Character>();
    ArrayList <String> palabras = new ArrayList <String>();
    public int erros=0;
    
    
    

    //Getter y Setter

    public String getPalabra() {
        return palabra;
    }

    public ArrayList<Character> getLetras() {
        return letras;
    }

    public int getErros() {
        return erros;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setLetras(ArrayList<Character> letras) {
        this.letras = letras;
    }

    public void setErros(int erros) {
        this.erros = erros;
    }
    
    //Métodos
    
   
    
    public void modoDeXogo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escolle o modo de xogo (1=escolles ti a palabra 2=Escolle unha palabra aleatoria)");
        int modo=entrada.nextInt();
        if (modo==1){
            xogar();
        }
        else if (modo==2){
            xogar2();
        }
        else {
            System.out.println("Esa opción non a contemplamos, volve a probar:");
            modo=entrada.nextInt();
        }
    }
    
    
//Pide a palabra que hai que adiviñar e chama ao método crearArray().    
    private void pedirPalabra (){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce a palabra que terás que adiviñar:");
        palabra=entrada.nextLine();
    }
    
//Crea un array con cada letra da palabra do método pedirPalabra().
    private void crearArray(){
        for (int cont=0;cont<palabra.length(); cont++) {
            letras.add('_');
        }
    }
    
    
//Pide o número de aerros máximos que queremos    
    private int pedirErros(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cantos erros queres como máximo?:");
        int errosMax=entrada.nextInt();
        return errosMax;
    }
    
    
//Amosa un _ por cada letra e cada vez que adiviñamos unha letra móstrase sustituíndo a _ pola letra.
    private void amosarArray (){
        
        for (int cont=0; cont<letras.size();cont++) {            
            System.out.print(letras.get(cont));
            System.out.print(' ');
        }        
        System.out.println();
    }
    
    
//Pide unha letra por pantalla e chama a comprobar para ver se aparece no array    
    private void pedirLetra (){
        Scanner entrada = new Scanner(System.in);
        char letra;
        System.out.println("Introduce a letra que queres ver se aparece:");
        letra=entrada.nextLine().charAt(0);
        comprobar(letra);
    }
    

    
//Comproba se a letra introducida aparece no array e se aparece sustitúe a _ pola letra.    
    private void comprobar(char letra){
        boolean aparecer=false;
        for (int cont=0; cont<letras.size();cont++) { 
            if (letra==palabra.charAt(cont)) {
                letras.set(cont, letra);
                aparecer=true;
            }
        }
        if (!aparecer){
            erros++;
        }
        amosarArray();
    }
    
    
//Xoga e, se acertas, devolve o boolean ganar para que pare de executarse. Se falla, segue executándose.    
    public void xogar(){
        boolean ganar=false;
        pedirPalabra();
        crearArray();
        amosarArray();
        int maximo=pedirErros();
        while (erros<=maximo && !ganar) {
            pedirLetra();
            if (!letras.contains('_')) {
                System.out.println("Gañaches, a palabra era " + palabra);
                ganar=true;
            }
            else if (erros>maximo) {
                System.out.println("Perdiches, a palabra era " + palabra);
            }
        }
    }
    
/******************************************************************************************/ 
    
    
//Modo de xogo 2, no que fai o mesmo pero chamando a unha das palabras almacenadas no array    
    public void xogar2 (){
        boolean ganar=false;
        crearPalabras();
        chamarPalabra();
        crearArray();
        amosarArray();
        int maximo=pedirErros();
        while (erros<=maximo && !ganar) {
            pedirLetra();
            if (!letras.contains('_')) {
                System.out.println("Acertaches, a palabra era " + palabra);
                ganar=true;
            }
            else if (erros>maximo) {
                System.out.println("Perdiches, a palabra era " + palabra);
            }
        }
    }
    
//Pide unha palabra almacenada antes no array
    private void chamarPalabra (){
        palabra=palabras.get((int) Math.floor(Math.random() * (palabras.size()- 0 + 1) + 0));
    }
    
    
//Crea as palabras e as almacena no array
    private void crearPalabras (){
        palabras.add("plenilunio");
        palabras.add("puente");
        palabras.add("asfixia");
        palabras.add("portal");
        palabras.add("cilindro");
        palabras.add("barco");
        palabras.add("lancha");
        palabras.add("gamba");
        palabras.add("pulpo");
        palabras.add("sintaxis");
    }
}
