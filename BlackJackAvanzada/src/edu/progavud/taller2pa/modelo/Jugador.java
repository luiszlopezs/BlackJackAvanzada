/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.progavud.taller2pa.modelo;

import java.util.List;

/**
 *
 * @author hailen
 */
public class Jugador extends Persona {
    
    private String direccion;
    private int valorFichas;
    private int valorApuesta;
    private boolean isPlantado;
    private boolean isAsegurado;

    public Jugador(String direccion, int valorFichas, int valorApuesta, boolean isPlantado, boolean isAsegurado, String nombre, String apellido, int cedula, List<Mano> mano) {
        super(nombre, apellido, cedula, mano);
        this.direccion = direccion;
        this.valorFichas = valorFichas;
        this.valorApuesta = valorApuesta;
        this.isPlantado = isPlantado;
        this.isAsegurado = isAsegurado;
    }

    
    

    public Jugador(String direccion, int valorFichas, int valorApuesta) {
        this.direccion = direccion;
        this.valorFichas = valorFichas;
        this.valorApuesta = valorApuesta;
    }
    
    

    public Jugador() {
    }
    
    public void realizarApuesta(int valorFichas) {
        this.valorApuesta = valorFichas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getFichas() {
        return valorFichas;
    }

    public void setFichas(int valorFichas) {
        this.valorFichas = valorFichas;
    }

    public int getValorApuesta() {
        return valorApuesta;
    }

    public void setValorApuesta(int valorApuesta) {
        this.valorApuesta = valorApuesta;
    }

    public boolean isIsPlantado() {
        return isPlantado;
    }

    public void setIsPlantado(boolean isPlantado) {
        this.isPlantado = isPlantado;
    }

    public boolean isIsAsegurado() {
        return isAsegurado;
    }

    public void setIsAsegurado(boolean isAsegurado) {
        this.isAsegurado = isAsegurado;
    }
    

    
    
    
}
