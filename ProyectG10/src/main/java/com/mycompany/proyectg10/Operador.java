/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

/**
 *
 * @author cmontes
 */
public abstract class Operador extends Usuario{
//    double sueldo;
    
    public void escribirArchivo(){
        ManejoArchivos.LeeFichero("operadores.txt");
        String[] columnas = "operadores.txt".split(",");
        double sueldo;
    }
}
