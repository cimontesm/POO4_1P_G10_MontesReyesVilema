/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author danie
 */
public class Multa {
    private Cliente cliente;
    private String infraccion;
    private double valorAPagar;
    private String fechaInfraccion;
    private String fechaNotificacion;
    private int puntos;

    public Multa(Cliente cliente, String infraccion, double valorAPagar, String fechaInfraccion, String fechaNotificacion, int puntos) {
        this.cliente = cliente;
        this.infraccion = infraccion;
        this.valorAPagar = valorAPagar;
        this.fechaInfraccion = fechaInfraccion;
        this.fechaNotificacion = fechaNotificacion;
        this.puntos = puntos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }

    public double getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

    public String getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(String fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    public String getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(String fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }
    
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return cliente.getNumCedula()+" | "+cliente.getVehiculo().getNumPlaca()+" | "+infraccion+" | "+valorAPagar+" | "+fechaInfraccion+" | "+fechaNotificacion+" | "+puntos;
    }
    
}
