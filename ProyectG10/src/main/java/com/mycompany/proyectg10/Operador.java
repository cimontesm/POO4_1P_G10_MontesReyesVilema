/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cmontes
 */
public class Operador extends Usuario {
    private double sueldo;

    public Operador(double sueldo, String numCedula, String nombre, int edad, TipoUsuario perfil, String correo, String contrasenia, String usuario) {
        super(numCedula, nombre, edad, perfil, correo, contrasenia, usuario);
        this.sueldo = sueldo;
    }

    
    
    
    public void registrarPago(ArrayList<RegistroPago> listaPagos){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------------");
        System.out.println("REGISTRAR PAGOS");
        System.out.println("----------------");
        
        System.out.println("Que desea pagar?");
        System.out.println("1. Multa");
        System.out.println("2. Revisión técnica");
        System.out.println();
        System.out.println("Elija una opcion: ");
        int tipoP=sc.nextInt();
        for(RegistroPago pago: listaPagos){
           if(tipoP==1){
            System.out.println("Valor a pagar: "+pago.getValorPagar() );
            System.out.println();
            System.out.println("Que modo de pago va a usar?");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta de crédito");
            System.out.println();
            System.out.println("Elija una opcion:  ");
            int modoPago = sc.nextInt();
        
            if(modoPago==2){
                pago.getValorFinal()=pago*1.1;
                System.out.println(pago);
            }else{
                System.out.println(pago);
            }
            
        }else{
            System.out.println("Valor a pagar: "+ pago.ValorRevision() );
            System.out.println();
            System.out.println("Que modo de pago va a usar?");
            System.out.println("1. Efectivo");
            System.out.println("2. Tarjeta de crédito");
            System.out.println();
            System.out.println("Elija una opcion:  ");
            int modoPago = sc.nextInt();
        
            if(modoPago==2){
                pago=pago*1.1;
                System.out.println(pago.getValorRevision);
            }else{
                System.out.println(pago);
            }
           } 
        }
        
      
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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
        
        

    
    @Override
    public void consultarMultas(ArrayList<Multa> listaMultas){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mes a consultar: ");
        String mes= sc.nextLine();
        System.out.println("Conductores Multados");
        for(Multa multa: listaMultas){
            if(mes.equals(mes)){
                System.out.println("-------------------------------------------------------------------");
                System.out.println("CÉDULA | MATRÍCULA | INFRACCIÓN | VALOR A PAGAR | FECHA DE INFRACCIÓN | FECHA DE NOTIFICACIÓN | PUNTOS");
                multa.toString();
            }
        }        
    }
    
    public void consultarUsuarios(ArrayList<Usuario> listaUsuarios){
        for(Usuario usuario: listaUsuarios){
            Cliente op = (Cliente)usuario;
            if(op.getTipoC().equals("ESTANDAR") ){
                System.out.println(op.getNombre()+" | "+op.getTipoC().ESTANDAR+" | "+op.getNumCedula());
                
            }else if(op.getTipoC().equals("ESTRELLA")){
                System.out.println(op.getNombre()+" | "+op.getTipoC().ESTRELLA+" | "+op.getNumCedula());
            }else{
                System.out.println(op.getNombre()+" | "+" | "+sueldo);
            }
        }
         
        
    }
    
     

}
