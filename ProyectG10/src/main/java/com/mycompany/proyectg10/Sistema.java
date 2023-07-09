/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cmontes
 */
public class Sistema {
    static ArrayList<Usuario> listaUsuarios;
    static ArrayList<Multa> listaMultas;
    static ArrayList<Vehiculo> listaVehiculos;
    
    public static void main(String[] args){
        
    }
    
    public static void cargarListaUsuariosYVehiculos(){
        ArrayList<String> datos = ManejoArchivos.LeeFichero("usuarios.txt");
        for (String linea: datos){
            String[] elementos = linea.trim().split(",");
            String tipo = elementos[6];
            switch (tipo){
                case "O":
                    ArrayList<String> datosOp = ManejoArchivos.LeeFichero("operador.txt");
                    for (String lineaOp : datosOp){
                        String[] elementosOp = lineaOp.trim().split(",");
                        if (elementos[0].equals(elementosOp[0])){
                            Usuario us = new Operador(Double.parseDouble(elementosOp[1]),elementos[0],elementos[1],Integer.parseInt(elementos[2]),TipoUsuario.OPERADOR,elementos[3],elementos[5],elementos[4]);
                            listaUsuarios.add(us);
                        }
                    }
                    break;
                case "S":
                    ArrayList<String> datosCl = ManejoArchivos.LeeFichero("clientes.txt");
                    for (String lineaCl : datosCl){
                        String[] elementosCl = lineaCl.trim().split(",");
                        if (elementos[0].equals(elementosCl[0])){
                            ArrayList<String> datosVehi = ManejoArchivos.LeeFichero("Vehiculos.txt");
                            for (String lineaVehi : datosVehi){
                                String[] elementosVehi = lineaVehi.trim().split(",");
                                if (elementosCl[0].equals(elementosVehi[0])){
                                    Vehiculo vehiculo = new Vehiculo(elementosVehi[1],elementosVehi[0],elementosVehi[2],elementosVehi[3],Integer.parseInt(elementosVehi[4]),elementosVehi[5],elementosVehi[6]);
                                    listaVehiculos.add(vehiculo);
                                    Usuario us2 = new Cliente(elementos[0],elementos[1],Integer.parseInt(elementos[2]),TipoUsuario.CLIENTE,elementos[3],elementos[5],elementos[4],Integer.parseInt(elementosCl[1]),Integer.parseInt(elementosCl[2]),TipoCliente.ESTANDAR,vehiculo);
                                    listaUsuarios.add(us2);
                                }
                            }
                        }
                    }
                    break;
                case "E":
                    ArrayList<String> datosCl2 = ManejoArchivos.LeeFichero("clientes.txt");
                    for (String lineaCl2 : datosCl2){
                        String[] elementosCl2 = lineaCl2.trim().split(",");
                        if (elementos[0].equals(elementosCl2[0])){
                            ArrayList<String> datosVehi = ManejoArchivos.LeeFichero("Vehiculos.txt");
                            for (String lineaVehi : datosVehi){
                                String[] elementosVehi = lineaVehi.trim().split(",");
                                if (elementosCl2[0].equals(elementosVehi[0])){
                                    Vehiculo vehiculo = new Vehiculo(elementosVehi[1],elementosVehi[0],elementosVehi[2],elementosVehi[3],Integer.parseInt(elementosVehi[4]),elementosVehi[5],elementosVehi[6]);
                                    listaVehiculos.add(vehiculo);
                                    Usuario us2 = new Cliente(elementos[0],elementos[1],Integer.parseInt(elementos[2]),TipoUsuario.CLIENTE,elementos[3],elementos[5],elementos[4],Integer.parseInt(elementosCl2[1]),Integer.parseInt(elementosCl2[2]),TipoCliente.ESTRELLA,vehiculo);
                                    listaUsuarios.add(us2);
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }
    
    public static void cargarListaMultas(){
        ArrayList<String> datos = ManejoArchivos.LeeFichero("multas.txt");
        for (String linea : datos){
            String[] elementosMult = linea.trim().split(",");
            for (Usuario usuario : listaUsuarios){
                if (usuario.getNumCedula().equals(elementosMult[0])){
                    if (usuario instanceof Cliente){
                        Cliente cl = (Cliente)usuario;
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                        Date fechaInfraccion = null;
                        try {
                            fechaInfraccion = formato.parse(elementosMult[4]);
                        } catch (ParseException ex) {
                            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Date fechaNotificacion = null;
                        try {
                            fechaNotificacion = formato.parse(elementosMult[5]);
                        } catch (ParseException ex) {
                            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        Multa multa = new Multa(cl,elementosMult[2],Double.parseDouble(elementosMult[3]),fechaInfraccion,fechaNotificacion,Integer.parseInt(elementosMult[6]));
                        listaMultas.add(multa);
                    }
                }
            }
        }
    }
}
