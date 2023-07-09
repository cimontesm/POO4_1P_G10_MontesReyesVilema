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
public class Revision {
    private String codigo;
    private Cliente cliente;
    private Date fechaRevision;

    public Revision(String codigo, Cliente cliente, Date fechaRevision) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.fechaRevision = fechaRevision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public Date getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    
    public String escribirRevision(){
        return this.codigo+","+this.cliente+","+this.fechaRevision;
    }

    public double valorRevision(Multa multa){
        double base = 150;
        double valorAPagar = 0;
        if(multa.getCliente().getTipoC()==TipoCliente.ESTANDAR){
            valorAPagar = base+(multa.getPuntos()*10);
        }else{
            valorAPagar = base-(base*0.20);
        }
        return valorAPagar;
    }
    
}
