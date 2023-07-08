/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cmontes
 */
public abstract class Cliente extends Usuario {
    private int tarjetaCredito;
    private int puntosLicencia;
    private TipoCliente tipoC;
    
    public Cliente(String numCedula, String nombre, String apellidos, int edad, TipoUsuario perfil, String correo, String contrasenia, int tarjetaCredito, int puntosLicencia, TipoCliente tipoC){
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
    
    public double calcularTotal(ArrayList<Multa> listaMultas){
        ArrayList<Double> valoresMultas = new ArrayList<>();
        double total = 0;
        for (Multa m : listaMultas){
            valoresMultas.add(m.getValorAPagar());
        }
        for (int i=0;i<valoresMultas.size();i++){
            total += valoresMultas.get(i);
        }
        return total;
    }
    
    @Override
    public void consultarMultas(ArrayList<Multa> listaMultas){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su cédula o número de placa: ");
        String dato = sc.nextLine();
        
    }
    
    public void agendarRev(String numPlaca){
        
    }
}
