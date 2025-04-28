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
public class Mazo {
    
    
    private ArrayList<Carta> cartas;
    
    
    
        // Método para sacar una carta del mazo
    public Carta sacarCarta() {
        if (cartas.isEmpty()) {
            throw new IllegalStateException("El mazo está vacío");
        }
        return cartas.remove(0); // Devuelve y elimina la primera carta de la lista (lo que simula sacar una carta)
    }

    public Mazo(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> carta) {
        this.cartas = carta;
    }
    

    
    
    
    
}
