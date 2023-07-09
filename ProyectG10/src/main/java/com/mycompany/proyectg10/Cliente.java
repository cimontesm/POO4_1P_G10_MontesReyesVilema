/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;

/**
 *
 * @author cmontes
 */
public class Cliente extends Usuario {
    private int tarjetaCredito;
    private int puntosLicencia;
    private TipoCliente tipoC;
    private Vehiculo vehiculo;
    
    public Cliente(String numCedula, String nombre, int edad, TipoUsuario perfil, String correo, String contrasenia, String usuario, int tarjetaCredito, int puntosLicencia, TipoCliente tipoC, Vehiculo vehiculo){
        super(numCedula,nombre,edad,perfil,correo,contrasenia, usuario);
        this.tarjetaCredito = tarjetaCredito;
        this.puntosLicencia = puntosLicencia;
        this.tipoC = tipoC;
        this.vehiculo = vehiculo;
    }
    public int getTarjetaCredito() {
        return tarjetaCredito;
    }
    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
    public int getPuntosLicencia() {
        return puntosLicencia;
    }
    public void setPuntosLicencia(int puntosLicencia) {
        this.puntosLicencia = puntosLicencia;
    }
    public TipoCliente getTipoC() {
        return tipoC;
    }
    public void setTipoC(TipoCliente tipoC) {
        this.tipoC = tipoC;
    }
    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    @Override
    public void consultarMultas(ArrayList<Multa> listaMultas){
        ArrayList<Double> valoresMultas = new ArrayList<>();
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su cédula o número de placa: ");
        String dato = sc.nextLine();
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                          DETALLE DE MULTAS                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("CÉDULA | MATRÍCULA | INFRACCIÓN | VALOR A PAGAR | FECHA DE INFRACCIÓN | FECHA DE NOTIFICACIÓN | PUNTOS");
        for (Multa multa : listaMultas){
            if (dato.equals(multa.getCliente().getNumCedula()) || dato.equals(multa.getCliente().getVehiculo().getNumPlaca())){
                multa.toString();
            }
        }
        for (Multa m : listaMultas){
            valoresMultas.add(m.getValorAPagar());
        }
        for (int i=0;i<valoresMultas.size();i++){
            total += valoresMultas.get(i);
        }
        System.out.println("TOTAL A PAGAR: "+total);
        System.out.println("PARA PAGAR PUEDE ACERCARSE A LA AGENCIA MÁS CERCANA.");
        sc.close();
    }
    
    public void agendarRev(ArrayList<Multa> listaMultas){
        ArrayList<Multa> multasCliente = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("                                           AGENDAR REVISIÓN                                           ");
        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.print("Ingrese placa: ");
        String placaCliente = sc.nextLine();
        for (Multa multa : listaMultas){
            if (placaCliente.equals(multa.getCliente().getVehiculo().getNumPlaca())){
                multasCliente.add(multa);
            }
        }
        if (multasCliente.isEmpty()){
            System.out.println("No tiene multas.");
            System.out.println("                          Horarios disponibles                          ");
            ArrayList<String> datos = ManejoArchivos.LeeFichero("horariosdisponibles.txt");
            System.out.print("Elija el horario para la revisión: ");
            int num = sc.nextInt();
            sc.nextLine();
            for (String linea: datos){
                String[] elementos = linea.trim().split(" ");
                int posArchivo = Integer.parseInt(elementos[0].replace(".",""));
                SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                Date fechaRevision = null;
                try {
                    fechaRevision = formato.parse(elementos[1]);
                } catch (ParseException ex) {
                    Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (num == posArchivo){
                    System.out.println(getNombre()+", se ha agendado su cita para el "+fechaRevision+" a las "+elementos[2]);
                    Random rd = new Random();
                    int codigo = rd.nextInt(9000)+1000;
                    Revision rev = new Revision(codigo,getNumCedula(),vehiculo.getNumPlaca(),fechaRevision);
                    ManejoArchivos.EscribirArchivo("AgendaRevisiones.txt", rev.escribirRevision());
                    int totalAPagar = 0;
                    for (Multa mult : listaMultas){
                        totalAPagar += rev.valorRevision(mult);
                    }
                    System.out.println("Valor a pagar: "+totalAPagar);
                    System.out.println("Puede pagar su cita hasta 24 horas antes de la cita.");
                    System.out.println("De lo contrario la cita se cancelará.");
                }
            }
        } else {
            System.out.println("Usted tiene multas, no puede agendar cita para revisión.");
        }
        sc.close();
    }
}
