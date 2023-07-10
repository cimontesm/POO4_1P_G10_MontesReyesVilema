/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 * Clase Vehiculo contiene los atributos a utilizar en el proyecto
 * 
 */
public class Vehiculo {

    private String numPlaca;
    private String duenio;
    private String marca;
    private String modelo;
    private int anio;
    private String chasis;
    private String color;
    
     /**
      * Constructor de Vehiculo
     * @param numPlaca String
     * @param duenio String
     * @param marca String
     * @param modelo String
     * @param anio int
     * @param chasis String
     * @param color String
     */

    public Vehiculo(String numPlaca, String duenio, String marca, String modelo, int anio, String chasis, String color) {
        this.numPlaca = numPlaca;
        this.duenio = duenio;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.chasis = chasis;
        this.color = color;
    }
    /**
     * Metodo getter para consultar Placa
     * @return numPlaca
     */
    public String getNumPlaca() {
        return numPlaca;
    }
    /**
     * Metodo setter para establecer la Placa
     * @param numPlaca
     */
    public void setNumPlaca(String numPlaca) {
        this.numPlaca = numPlaca;
    }
    /**
     * Metodo getter para consultar duenio
     * @return duenio
     */
    public String getDuenio() {
        return duenio;
    }
    /**
     * Metodo setter para establecer duenio
     * @param duenio String
     */
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    /**
     * Metodo getter para consultar marca
     * @return marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Metodo setter para establcer marca
     * @param marca String
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Metodo getter para consultar el modelo
     * @return modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Metodo setter para establecer modelo
     * @param modelo String
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    /**
     * Metodo getter para consultar anio
     * @return anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Metodo setter para establcer anio
     * @param anio int
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * Metodo getter chasis
     * @return chasis
     */
    public String getChasis() {
        return chasis;
    }
    /**
     * Metodo setter para establecer chasis
     * @param chasis String
     */
    public void setChasis(String chasis) {
        this.chasis = chasis;
    }
    /**
     * Metodo getter para consultar color
     * @return color
     */
    public String getColor() {
        return color;
    }
    /**
     * Metodo setter para establecer color
     * @param color String
     */
    public void setColor(String color) {
        this.color = color;
    }

}
