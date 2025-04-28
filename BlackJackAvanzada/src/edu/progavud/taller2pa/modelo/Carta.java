/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller2pa.modelo;

/**
 *
 * @author hailen
 */
public class Carta {
    
    private int numero;
    private Palo palo;

    public Carta(int valor, Palo palo) {
        this.numero = valor;
        this.palo = palo;
    }

    public Carta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    

    
    
}
