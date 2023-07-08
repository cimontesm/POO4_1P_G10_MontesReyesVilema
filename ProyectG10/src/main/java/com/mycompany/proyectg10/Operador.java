/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cmontes
 */
public abstract class Operador extends Usuario{
    private double sueldo;

    public Operador(double sueldo, String numCedula, String nombre, String apellidos, int edad, TipoUsuario perfil, String correo, String contrasenia) {
        super(numCedula, nombre, apellidos, edad, perfil, correo, contrasenia);
        this.sueldo = sueldo;
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
        int tipoP=sc.nextInt();
        if(tipoP==1){
            System.out.println("");
            
        }else{
            System.out.println();
        }
            
            
        
        System.out.println("Valor a pagar: ");//+el valor a pagar que sale de multas

        
        System.out.println("Que modo de pago va a usar?");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");
        System.out.println("Elija una opcion:  ");
        int modoPago = sc.nextInt();
        
        if(modoPago==2){
            //valorAPagar=valorAPagar*0.1;
            System.out.println();
        }else{
            System.out.println();
            
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
    public void consultarMultas(ArrayList<Multa> listaMultas){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Imgrese el mes a consultar: ");
    }
    
    public void consultarUsuarios(ArrayList<Usuario> listaUsuarios){
        
        
    }

}
