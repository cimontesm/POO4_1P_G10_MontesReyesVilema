    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.Date;

/**
 *
 * Clase revision nos permite escribir el objeto revision en un archivo.
 */
public class Revision {
    private int codigo;
    private String cedula;
    private String placa;
    private Date fechaRevision;
     /**
      * Constructor de Revision
     * @param codigo int
     * @param cedula String
     * @param placa String
     * @param fechaRevision Date
     */

    public Revision(int codigo, String cedula, String placa, Date fechaRevision) {
        this.codigo = codigo;
        this.cedula = cedula;
        this.placa = placa;
        this.fechaRevision = fechaRevision;
    }
    /**
     * Metodo getter para consultar codigo
     * @return codigo
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     * Metodo setter para establecer codigo
     * @param codigo int
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    /**
     * Metodo getter para consultar cedula
     * @return cedula
     */
    public String getCedula() {
        return cedula;
    }
    /**
     * Metodo setter para establecer cedula
     * @param cedula String
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /**
     * Metodo getter para consultar Placa
     * @return placa
     */
    public String getPlaca() {
        return placa;
    }
    /**
     * Metodo setter para establecer Placa
     * @param placa String
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    /**
     * Metodo getter para consultar fechaRevision
     * @return fechaRevision
     */
    public Date getFechaRevision() {
        return fechaRevision;
    }
    /**
     * Metodo setter para establecer fechaRevision
     * @param fechaRevision Date
     */
    public void setFechaRevision(Date fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

  
      /**
     * Metodo que nos permite escribir Revision
     * @return String
     */
    public String escribirRevision(){
        return this.codigo+","+this.cedula+","+this.placa+","+this.fechaRevision;
    }
    /**
     * Metodo para obtener valorRevision según el tipo de cliente
     * @param multa Multa
     * @return valorAPagar devuelve el valor final según el tipo
     */
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
