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
        //ManejoArchivos.EscribirArchivo("pagos.txt", "registrarPago");
        
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
        }else{
            //Revision.getValorAPagar();
        }
        
        System.out.println("Valor a pagar: ");

        
        System.out.println("Que modo de pago va a usar?");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");
        System.out.println("Elija una opcion:  ");
        int modoPago = sc.nextInt();
        
        if(modoPago==2){
            //valorAPagar=valorAPagar*0.9;
        }

        System.out.println("Desea proceder con el pago? ");
        System.out.println("1. Si ");
        System.out.println("2. No ");
        System.out.println("Elija una opcion: ");
        int proceder= sc.nextInt();
        if(proceder==1){
            System.out.println("----------\n Se ha realizado el pago. Ahora puede proceder a la revision\n ------------\n ");
        }
        
        

    }
    
    
    
    @Override
    public void consultarMultas(){
        
    }
    
//    public registrarUsuarios(){
//    }
}
