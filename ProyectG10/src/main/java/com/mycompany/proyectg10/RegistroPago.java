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
    private String fechaPago;
    private String razonPago;

    public RegistroPago(Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String fechaPago, String razonPago) {
        this.cliente = cliente;
        this.codPago = codPago;
        this.valorPagar = valorPagar;
        this.modoPago = modoPago;
        this.valorFinal = valorFinal;
        this.fechaPago = fechaPago;
        this.razonPago = razonPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodPago() {
        return codPago;
    }

    public void setCodPago(int codPago) {
        this.codPago = codPago;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public TipoPago getModoPago() {
        return modoPago;
    }

    public void setModoPago(TipoPago modoPago) {
        this.modoPago = modoPago;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getRazonPago() {
        return razonPago;
    }

    public void setRazonPago(String razonPago) {
        this.razonPago = razonPago;
    }

    public double valorRevision(Multa multa) {
        double base = 150;
        double valorAPagar = 0;
        if (multa.getCliente().getTipoC().equals(TipoCliente.ESTANDAR)) {
            valorAPagar = base + (multa.getPuntos() * 10);
        } else {
            valorAPagar = base - (base * 0.20);
        }
        return valorAPagar;
    }

    public double valorMulta(ArrayList<Multa> listaMultas) {
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

}
