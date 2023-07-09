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
public class Cliente extends Usuario {
    private int tarjetaCredito;
    private int puntosLicencia;
    private TipoCliente tipoC;
    private Vehiculo vehiculo;
    
    public Cliente(String numCedula, String nombre, String apellidos, int edad, TipoUsuario perfil, String correo, String contrasenia, int tarjetaCredito, int puntosLicencia, TipoCliente tipoC, Vehiculo vehiculo){
        super(numCedula,nombre,apellidos,edad,perfil,correo,contrasenia);
        this.tarjetaCredito = tarjetaCredito;
        this.puntosLicencia = puntosLicencia;
        this.tipoC = tipoC;
        this.vehiculo = vehiculo;
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
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
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
        for (Multa multa : listaMultas){
            if (dato.equals(multa.getCliente().getNumCedula()) || dato.equals(multa.getCliente().getVehiculo().getNumPlaca())){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("CÉDULA | MATRÍCULA | INFRACCIÓN | VALOR A PAGAR | FECHA DE INFRACCIÓN | FECHA DE NOTIFICACIÓN | PUNTOS");
                multa.toString();
            }
        }
    }
    
    public void agendarRev(String numPlaca){
        
    }
}
