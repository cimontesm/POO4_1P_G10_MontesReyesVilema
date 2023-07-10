/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import static com.mycompany.proyectg10.Sistema.listaMultas;
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
    
    public void registrarPago(ArrayList<Usuario> listaUsuarios, ArrayList<Multa> listaMultas) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Multa> multasCliente = new ArrayList<>();
        
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                            REGISTRAR PAGOS                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        
        double valorAPagarMult = 0;
        double valorAPagarRev = 0;
        System.out.print("Ingrese el número de cédula del cliente: ");
        String cedulaCl = sc.nextLine();
        for (Usuario usuario : listaUsuarios){
            if (cedulaCl.equals(usuario.numCedula)){
                for (Multa multa : listaMultas){
                    if (cedulaCl.equals(multa.getCliente().getNumCedula())){
                        multasCliente.add(multa);
                    }
                }
                for (Multa mult : multasCliente){
                    valorAPagarMult += RegistroPago.valorRevision(mult);
                }
                valorAPagarRev += RegistroPago.valorMulta(multasCliente);
            }
        }
        System.out.println("Que desea pagar?");
        System.out.println("1. Multa");
        System.out.println("2. Revisión técnica");
        System.out.println();
        System.out.println("Elija una opcion: ");
        int tipoP = sc.nextInt();
        sc.nextLine();
        switch (tipoP){
            case 1:
                System.out.println("Valor a pagar: "+valorAPagarMult);
                System.out.println();
                System.out.println("Que modo de pago va a usar?");
                System.out.println("1. Efectivo");
                System.out.println("2. Tarjeta de crédito");
                System.out.println();
                System.out.println("Elija una opcion:  ");
                int modoPago = sc.nextInt();
                sc.nextLine();
                switch (modoPago){
                    case 1:
                        System.out.println("Valor a pagar: "+valorAPagarMult);
                        break;
                    case 2:
                        double pagoF = 1.1 * valorAPagarMult;
                        System.out.println("Valor a pagar: "+pagoF);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                break;
            case 2:
                System.out.println("Valor a pagar: "+valorAPagarRev);
                System.out.println();
                System.out.println("Que modo de pago va a usar?");
                System.out.println("1. Efectivo");
                System.out.println("2. Tarjeta de crédito");
                System.out.println();
                System.out.println("Elija una opcion:  ");
                int modoPago2 = sc.nextInt();
                sc.nextLine();
                switch (modoPago2){
                    case 1:
                        System.out.println("Valor a pagar: "+valorAPagarRev);
                        break;
                    case 2:
                        double pagoF = 1.1 * valorAPagarRev;
                        System.out.println("Valor a pagar: "+pagoF);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        System.out.println("Desea proceder con el pago?");
        System.out.println("1. Si");
        System.out.println("2. No");
        System.out.println();
        System.out.println("Elija una opcion:  ");
        int op = sc.nextInt();
        sc.nextLine();
        switch (op){
            case 1:
                System.out.println("Se ha realizado el pago. Ahora puede proceder a la revisión.");
                break;
            case 2:
                System.out.println("Se ha cancelado el registro.");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
    
    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public void consultarMultas(ArrayList<Multa> listaMultas) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el mes a consultar: ");
        String mes = sc.nextLine();
        System.out.println("Conductores Multados");
        for (Multa multa : listaMultas) {
            if (mes.equals(mes)) {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("CÉDULA | MATRÍCULA | INFRACCIÓN | VALOR A PAGAR | FECHA DE INFRACCIÓN | FECHA DE NOTIFICACIÓN | PUNTOS");
                multa.toString();
            }
        }
    }
    
    public void consultarUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            Cliente op = (Cliente) usuario;
            if (op.getTipoC().equals("ESTANDAR")) {
                System.out.println(op.getNombre() + " | " + op.getTipoC().ESTANDAR + " | " + op.getNumCedula());
                
            } else if (op.getTipoC().equals("ESTRELLA")) {
                System.out.println(op.getNombre() + " | " + op.getTipoC().ESTRELLA + " | " + op.getNumCedula());
            } else {
                System.out.println(op.getNombre() + " | " + " | " + sueldo);
            }
        }
        
    }
    
}
