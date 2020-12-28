/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author F. Pino
 */
public class Partida {
    private final String n0,n1,n2,n3,n4,n5,n6,n7,n8;   
    private final boolean esGanador;
    private int puntaje;

    public Partida(String n0, String n1, String n2, String n3, String n4, String n5, String n6, String n7, String n8, String esGanador) {
        this.n0 = n0;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.n5 = n5;
        this.n6 = n6;
        this.n7 = n7;
        this.n8 = n8;
        this.esGanador = esGanador.equals("positive");
        this.puntaje = 0;
    }      

    public String getN0() {
        return n0;
    }

    public String getN1() {
        return n1;
    }

    public String getN2() {
        return n2;
    }

    public String getN3() {
        return n3;
    }

    public String getN4() {
        return n4;
    }

    public String getN5() {
        return n5;
    }

    public String getN6() {
        return n6;
    }

    public String getN7() {
        return n7;
    }

    public String getN8() {
        return n8;
    }    

    public boolean isEsGanador() {
        return esGanador;
    }    

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
}
