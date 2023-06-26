/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author cmontes
 */
public class Cliente extends Usuario {
    private int tarjetaCredito;
    private int puntosLicencia;
    private TipoCliente tipoC;
    
    public Cliente(int numCedula, String nombre, String apellidos, int edad, TipoUsuario perfil, String correo, String contrasenia, int tarjetaCredito, int puntosLicencia, TipoCliente tipoC){
        super(numCedula,nombre,apellidos,edad,perfil,correo,contrasenia);
        this.tarjetaCredito = tarjetaCredito;
        this.puntosLicencia = puntosLicencia;
        this.tipoC = tipoC;
    }
    
    public int getTarjetaCredito() {
        return tarjetaCredito;
    }
    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    public int getPuntosLicencia() {
        return puntosLicencia;
    }
    public void setPuntosLicencia(int puntosLicencia) {
        this.puntosLicencia = puntosLicencia;
    }
    public TipoCliente getTipoC() {
        return tipoC;
    }
    public void setTipoC(TipoCliente tipoC) {
        this.tipoC = tipoC;
    }
    
    
    
}
