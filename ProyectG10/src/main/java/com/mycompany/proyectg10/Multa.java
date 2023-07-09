/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.Date;

/**
 *
 * @author danie
 */
public class Multa {
    private Cliente cliente;
    private String infraccion;
    private double valorAPagar;
    private Date fechaInfraccion;
    private Date fechaNotificacion;
    private int puntos;

    public Multa(Cliente cliente, String infraccion, double valorAPagar, Date fechaInfraccion, Date fechaNotificacion, int puntos) {
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

    public Date getFechaInfraccion() {
        return fechaInfraccion;
    }

    public void setFechaInfraccion(Date fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
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
