/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.Scanner;

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
    
    public void registrarPago(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("REGISTRAR PAGOS");
        System.out.println("----------------");
        
        System.out.println("Que desea pagar?");
        System.out.println("1. Multa");
        System.out.println("2. Revisión técnica");
        System.out.println("Elija una opcion: ");
        int tipoP = sc.nextInt();
        
        if(tipoP == 1){
            consultarMultas();
        }
        
        System.out.println("Valor a pagar: ");

        
        System.out.println("Que modo de pago va a usar?");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");
        System.out.println("Elija una opcion:  ");
        int modoPago = sc.nextInt();

        
        System.out.print("Ingrese el monto a pagar: ");
        double monto = sc.nextDouble();
        

    }
    
    @Override
    public void consultarMultas(){
        
    }
    
//    public registrarUsuarios(){
//    }
}
