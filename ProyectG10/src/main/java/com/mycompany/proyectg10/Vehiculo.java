/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author cmontes
 */
public class Vehiculo {
//    String numPlaca;
//    int cedula;
//    String marca;
//    int anio;
//    String chasis;
//    String color;
    
    
    public void escribirArchivo(){
        ManejoArchivos.LeeFichero("vehiculos.txt");
        String[] columnas = "vehiculos.txt".split(",");
        int cedula = "vehiculos.txt".indexOf(0);//en el archivo la primera columna eran cedulas no matriculas
        
    }
    
    
    
}
