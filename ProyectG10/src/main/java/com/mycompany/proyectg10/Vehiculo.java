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
//    String matricula;
//    String marca;
//    int anio;
//    String chasis;
//    String color;
    
    
    public void escribirArchivo(){
        ManejoArchivos.LeeFichero("vehiculos.txt");
        String[] split = "vehiculos.txt".strip().split(",");
        //int matricula = "vehiculos.txt".indexOf(0);
    }
    
}
