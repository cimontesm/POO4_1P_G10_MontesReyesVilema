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
    private String codigo;
    private String cedula;
    private String placa;
    private String fechaRevision;

    public Revision(String codigo, String cedula, String placa, String fechaRevision) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.placa = placa;
        this.fechaRevision = fechaRevision;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

  
  
    public String escribirRevision(){
        return this.codigo+","+this.cedula+","+this.placa+","+this.fechaRevision;
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
