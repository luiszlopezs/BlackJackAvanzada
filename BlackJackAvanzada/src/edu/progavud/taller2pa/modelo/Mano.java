/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller2pa.modelo;

import java.util.ArrayList;

/**
 *
 * @author hailen
 */
public class Mano {
    
    private int valorMano;
    private boolean isBusted; // busted: pasarse de 21
    
    private ArrayList<Carta> cartas;

    public Mano(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public Mano() {
    }
    
    
    public void agregarCarta(Carta carta) {
        cartas.add(carta); // Añade la carta al final de la lista
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public boolean isIsBusted() {
        return isBusted;
    }

    public void setIsBusted(boolean isBusted) {
        this.isBusted = isBusted;
    }

    public int getValorMano() {
        return valorMano;
    }

    public void setValorMano(int valorMano) {
        this.valorMano = valorMano;
    }
    
    
    
    
    
    
    
    

    
}
