/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Clase operador nos permite registrar los pagos, consultar las multas y los
 * usuarios.
 */
public class Operador extends Usuario {

    private double sueldo;

    /**
     * Metodo constructor de la clase Operador
     *
     * @param sueldo double
     * @param numCedula String
     * @param nombre String
     * @param edad int
     * @param perfil TipoUsuario
     * @param correo String
     * @param contrasenia String
     * @param usuario String
     */
    public Operador(double sueldo, String numCedula, String nombre, int edad, TipoUsuario perfil, String correo, String contrasenia, String usuario) {
        super(numCedula, nombre, edad, perfil, correo, contrasenia, usuario);
        this.sueldo = sueldo;
    }

    /**
     * Metodo para registrar el pago ya sea multa o revision
     *
     * @param listaUsuarios ArrayList<Usuario>
     * @param listaMultas ArrayList<Multa>
     *
     */
    public void registrarPago(ArrayList<Usuario> listaUsuarios, ArrayList<Multa> listaMultas) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Multa> multasCliente = new ArrayList<>();

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                            REGISTRAR PAGOS                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println("¿Qué desea pagar?");
        System.out.println("1. Multa");
        System.out.println("2. Revisión técnica");
        System.out.println();
        System.out.print("Elija una opcion: ");
        int tipoP = sc.nextInt();
        sc.nextLine();
        double valorAPagarMult = 0;
        double valorAPagarRev = 0;
        System.out.print("Ingrese el número de cédula del cliente: ");
        String cedulaCl = sc.nextLine();
        Cliente cliente;
        for (Usuario usuario : listaUsuarios) {
            if (cedulaCl.equals(usuario.numCedula)) {
                for (Multa multa : listaMultas) {
                    if (cedulaCl.equals(multa.getCliente().getNumCedula())) {
                        multasCliente.add(multa);
                    }
                }
                cliente = (Cliente)usuario;
            }
        }
        for (Multa mult : multasCliente) {
            valorAPagarMult += RegistroPago.valorRevision(mult);
        }
        valorAPagarRev += RegistroPago.valorMulta(multasCliente);
        
        switch (tipoP) {
            case 1:
                System.out.println("Valor a pagar: " + valorAPagarMult);
                System.out.println();
        
                System.out.println("Que modo de pago va a usar?");
                System.out.println("1. Efectivo");
                System.out.println("2. Tarjeta de crédito");
                System.out.println();

                System.out.println("Elija una opcion: ");
                int modoPago1 = sc.nextInt();
                sc.nextLine();
        
                switch (modoPago1){
                    case 1:
                        System.out.println("Valor a pagar: " + valorAPagarMult);
                                
                        System.out.println();
        
                        System.out.println("¿Desea proceder con el pago?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        System.out.println();
        
                        System.out.println("Elija una opcion: ");
                        int op = sc.nextInt();
                        sc.nextLine();
             // Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String razonPago
                        switch (op){
                            case 1:
                                System.out.println("Se ha realizado el pago. Ahora puede proceder a la revisión.");
                                Random rd = new Random();
                                int codigo = rd.nextInt(9000)+1000;
                                RegistroPago pago = new RegistroPago(cliente,codigo,valorAPagarMult,TipoPago.EFECTIVO,valorAPagarMult,"MULTA");
                                ManejoArchivos.EscribirArchivo("pagos.txt", pago.escribirPago());
                                break;
                            case 2:
                                System.out.println("El pago ha sido cancelado.");
                        }
                        break;
                        
                    case 2:
                        double pagoF = 1.1 * valorAPagarMult;
                        System.out.println("Valor a pagar: " + pagoF);
                                
                        System.out.println();
        
                        System.out.println("¿Desea proceder con el pago?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        System.out.println();
        
                        System.out.println("Elija una opcion: ");
                        int op2 = sc.nextInt();
                        sc.nextLine();
             // Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String razonPago
                        switch (op2){
                            case 1:
                                System.out.println("Se ha realizado el pago. Ahora puede proceder a la revisión.");
                                Random rd = new Random();
                                int codigo = rd.nextInt(9000)+1000;
                                RegistroPago pago = new RegistroPago(usuario.,codigo,valorAPagarMult,TipoPago.TARJETA,valorAPagarMult,"MULTA");
                                ManejoArchivos.EscribirArchivo("pagos.txt", pago.escribirPago());
                                break;
                            case 2:
                                System.out.println("El pago ha sido cancelado.");
                        }
                        break;
                        
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                break;
                
            case 2:
                System.out.println("Valor a pagar: " + valorAPagarRev);
                System.out.println();
        
                System.out.println("Que modo de pago va a usar?");
                System.out.println("1. Efectivo");
                System.out.println("2. Tarjeta de crédito");
                System.out.println();

                System.out.println("Elija una opcion: ");
                int modoPago2 = sc.nextInt();
                sc.nextLine();
        
                switch (modoPago2){
                    case 1:
                        System.out.println("Valor a pagar: " + valorAPagarRev);
                                
                        System.out.println();
        
                        System.out.println("¿Desea proceder con el pago?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        System.out.println();
        
                        System.out.println("Elija una opcion: ");
                        int op = sc.nextInt();
                        sc.nextLine();
             // Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String razonPago
                        switch (op){
                            case 1:
                                System.out.println("Se ha realizado el pago. Ahora puede proceder a la revisión.");
                                Random rd = new Random();
                                int codigo = rd.nextInt(9000)+1000;
                                RegistroPago pago = new RegistroPago(cliente,codigo,valorAPagarRev,TipoPago.EFECTIVO,valorAPagarRev,"REVISIÓN");
                                ManejoArchivos.EscribirArchivo("pagos.txt", pago.escribirPago());
                                break;
                            case 2:
                                System.out.println("El pago ha sido cancelado.");
                        }
                        break;
                        
                    case 2:
                        double pagoF = 1.1 * valorAPagarRev;
                        System.out.println("Valor a pagar: " + pagoF);
                                
                        System.out.println();
        
                        System.out.println("¿Desea proceder con el pago?");
                        System.out.println("1. Sí");
                        System.out.println("2. No");
                        System.out.println();
        
                        System.out.println("Elija una opcion: ");
                        int op2 = sc.nextInt();
                        sc.nextLine();
             // Cliente cliente, int codPago, double valorPagar, TipoPago modoPago, double valorFinal, String razonPago
                        switch (op2){
                            case 1:
                                System.out.println("Se ha realizado el pago. Ahora puede proceder a la revisión.");
                                Random rd = new Random();
                                int codigo = rd.nextInt(9000)+1000;
                                RegistroPago pago = new RegistroPago(cliente,codigo,valorAPagarRev,TipoPago.TARJETA,valorAPagarRev,"REVISIÓN");
                                ManejoArchivos.EscribirArchivo("pagos.txt", pago.escribirPago());
                                break;
                            case 2:
                                System.out.println("El pago ha sido cancelado.");
                        }
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
    }

    /**
     * Metodo getter para consultar el sueldo del Operador
     *
     * @return sueldo del Operador
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Metodo getter para consultar el sueldo del Operador
     *
     * @return sueldo del Operador
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Método sobrescrito
     */
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

    /**
     * Método para poder consultar los usuarios
     *
     * @param listaUsuarios ArrayList<Usuario>
     */
    public void consultarUsuarios(ArrayList<Usuario> listaUsuarios) {
        for (Usuario usuario : listaUsuarios) {
            if (usuario instanceof Cliente){
                Cliente cl = (Cliente) usuario;
                if (cl.getTipoC().equals(TipoCliente.ESTANDAR)) {
                    System.out.println(cl.getNombre() + " | " + "CLIENTE " + cl.getTipoC() + " | " + cl.getNumCedula());
                } else if (cl.getTipoC().equals(TipoCliente.ESTRELLA)) {
                    System.out.println(cl.getNombre() + " | " + "CLIENTE " + cl.getTipoC() + " | " + cl.getNumCedula());
                }
            } else if (usuario instanceof Operador){
                Operador op = (Operador) usuario;
                System.out.println(op.getNombre() + " | " + "OPERADOR" + " | " + sueldo);
            }
        }

    }

}
