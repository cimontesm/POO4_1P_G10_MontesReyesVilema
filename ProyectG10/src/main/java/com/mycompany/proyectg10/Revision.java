/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author danie
 */
public class Revision {
    private String fechaRevision;
    private int codigo;
    private double valorAPagar;
    private double valorEstrella;

    public Revision(String fechaRevision, int codigo, double valorAPagar, double valorEstrella) {
        this.fechaRevision = fechaRevision;
        this.codigo = codigo;
        this.valorAPagar = valorAPagar;
        this.valorEstrella = valorEstrella;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public double getValorEstrella() {
        return valorEstrella;
    }

    public void setValorEstrella(double valorEstrella) {
        this.valorEstrella = valorEstrella;
    }

  
    

    
}
