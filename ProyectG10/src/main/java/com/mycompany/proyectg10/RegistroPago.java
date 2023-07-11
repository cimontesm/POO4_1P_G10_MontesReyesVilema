/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;

/**
 *
 * @author cmontes
 */
public class RegistroPago {

    private Cliente cliente;
    private int codPago;
    private double valorPagar;
    private TipoPago modoPago;
    private double valorFinal;
    private String razonPago;
     /**
      * Constructor de RegistroPago
     * @param cliente Cliente
     * @param codPago int
     * @param valorPagar double
     * @param modoPago TipoPago
     * @param valorFinal double
     * @param razonPago String
     */

    public RegistroPago(Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String razonPago) {
        this.cliente = cliente;
        this.codPago = codPago;
        this.valorPagar = valorPagar;
        this.modoPago = modoPago;
        this.valorFinal = valorFinal;
        this.razonPago = razonPago;
    }
    /**
     * Metodo getter para consultar cliente
     * @return cliente
     */
    public Cliente getCliente() {
        return cliente;
    }
    /**
     * Metodo setter para establecer cliente
     * @param cliente Cliente
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    /**
     * Metodo getter para consultar codPago
     * @return codPago
     */
    public int getCodPago() {
        return codPago;
    }
    /**
     * Metodo setter para establecer codPago
     * @param codPago int 
     */
    public void setCodPago(int codPago) {
        this.codPago = codPago;
    }
    /**
     * Metodo getter para consultar valorAPagar
     * @return valorAPagar
     */
    public double getValorPagar() {
        return valorPagar;
    }
    /**
     * Metodo setter para establecer valorPagar 
     * @param valorPagar double
     */
    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }
    /**
     * Metodo getter para consultar modoPago
     * @return modoPago
     */
    public TipoPago getModoPago() {
        return modoPago;
    }
    /**
     * Metodo setter para establecer modoPago
     * @param modoPago TipoPago
     */
    public void setModoPago(TipoPago modoPago) {
        this.modoPago = modoPago;
    }
    /**
     * Metodo getter para consultar valorFinal
     * @return valorFinal
     */
    public double getValorFinal() {
        return valorFinal;
    }
    /**
     * Metodo setter para establecer valorFinal
     * @param valorFinal double
     */
    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    /**
     * Metodo getter para consultar razonPago
     * @return razonPago
     */
    public String getRazonPago() {
        return razonPago;
    }
    /**
     * Metodo setter para establecer razonPago
     * @param razonPago String
     */
    public void setRazonPago(String razonPago) {
        this.razonPago = razonPago;
    }
    /**
     * Metodo para verificar el valor de la revision
     * @param multa Multa
     * @return valorAPagar double
     */
    public static double valorRevision(Multa multa) {
        double base = 150;
        double valorAPagar = 0;
        if (multa.getCliente().getTipoC().equals(TipoCliente.ESTANDAR)) {
            valorAPagar = base + (multa.getPuntos() * 10);
        } else {
            valorAPagar = base - (base * 0.20);
        }
        return valorAPagar;
    }
    
    /**
     * Metodo para verificar valorMulta
     * @param listaMultas ArrayList<Multa>
     * @return double con el total a pagar
     */
    
    public static double valorMulta(ArrayList<Multa> listaMultas) {
        ArrayList<Double> valoresMultas = new ArrayList<>();
        double total = 0;
        for (Multa m : listaMultas) {
            valoresMultas.add(m.getValorAPagar());
        }
        for (int i = 0; i < valoresMultas.size(); i++) {
            total += valoresMultas.get(i);
        }
        return total;

    }
    /**
     * Metodo para escribir la Multa
     * @return String
     */
    public String escribirPago() {
        return this.codPago + "," + this.cliente.getNumCedula() + "," + this.valorPagar + " , "+ this.getRazonPago();
    }

}
