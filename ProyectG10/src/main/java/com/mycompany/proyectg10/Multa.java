/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.Date;

/**
 * Clase Multa contiene su constructor y el metodo toString sobrescrito
 * 
 */
public class Multa {
    private Cliente cliente;
    private String infraccion;
    private double valorAPagar;
    private Date fechaInfraccion;
    private Date fechaNotificacion;
    private int puntos;
    /**
     * Metodo constructor de la clase Multa
     * @param cliente Cliente
     * @param infraccion String
     * @param valorAPagar double
     * @param fechaInfraccion Date
     * @param fechaNotificacion Date
     * @param puntos int
     */
    public Multa(Cliente cliente, String infraccion, double valorAPagar, Date fechaInfraccion, Date fechaNotificacion, int puntos) {
        this.cliente = cliente;
        this.infraccion = infraccion;
        this.valorAPagar = valorAPagar;
        this.fechaInfraccion = fechaInfraccion;
        this.fechaNotificacion = fechaNotificacion;
        this.puntos = puntos;
    }
    /**
     * Metodo getter para consultar cliente
     * @return cliente 
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo setter para establecer Cliente
     * @param cliente Cliente 
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo getter para consultar infraccion
     * @return infraccion
     */
    public String getInfraccion() {
        return infraccion;
    }
    /**
     * Metodo setter para establecer infraccion
     * @param infraccion String 
     */
    public void setInfraccion(String infraccion) {
        this.infraccion = infraccion;
    }
    /**
     * Metodo getter para consultar valorAPagar
     * @return valorAPagar
     */
    public double getValorAPagar() {
        return valorAPagar;
    }
    /**
     * Metodo setter para establecer valorAPagar
     * @param valorAPagar double
     */
    public void setValorAPagar(double valorAPagar) {
        this.valorAPagar = valorAPagar;
    }
    /**
     * Metodo getter para consultar una fechaInfraccion
     * @return fechaInfraccion
     */
    public Date getFechaInfraccion() {
        return fechaInfraccion;
    }
    /**
     * Metodo setter para establecer fechaInfraccion
     * @param fechaInfraccion Date
     */
    public void setFechaInfraccion(Date fechaInfraccion) {
        this.fechaInfraccion = fechaInfraccion;
    }
    /**
     * Metodo getter para consultar fechaNotificacion
     * @return fechaNotificacion
     */
    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }
    /**
     * Metodo setter para establecer fechaNotificacion
     * @param fechaNotificacion Date
     */
    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }
        /**
     * Metodo getter para consultar puntos
     * @return puntos
     */
    public int getPuntos() {
        return puntos;
    }
    /**
     * Metodo setter para consultar puntos
     * @param puntos int
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    /**
     * Metodo toString sobrescrito
     * @return String
     */
    @Override
    public String toString() {
        return cliente.getNumCedula()+" | "+cliente.getVehiculo().getNumPlaca()+" | "+infraccion+" | "+valorAPagar+" | "+fechaInfraccion+" | "+fechaNotificacion+" | "+puntos;
    }
    
}
