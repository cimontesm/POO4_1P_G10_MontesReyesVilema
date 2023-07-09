/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author cmontes
 */
public class Vehiculo {

    private String numPlaca;
    private String duenio;
    private String marca;
    private String modelo;
    private int anio;
    private String chasis;
    private String color;

    public Vehiculo(String numPlaca, String duenio, String marca, String modelo, int anio, String chasis, String color) {
        this.numPlaca = numPlaca;
        this.duenio = duenio;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.color = color;
    }

    public String getNumPlaca() {
        return numPlaca;
    }

    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
