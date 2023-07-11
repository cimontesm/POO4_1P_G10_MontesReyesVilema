/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* La clase Sistema almacena el codigo Main del proyecto y los metodos 
* correspondientes a utilizar en el programa principal.
* 
*/
public class Sistema {
    static ArrayList<Usuario> listaUsuarios;
    static ArrayList<Multa> listaMultas;
    static ArrayList<Vehiculo> listaVehiculos;
    
    
    public static void main(String[] args){
        listaUsuarios = new ArrayList<>();
        listaMultas = new ArrayList<>();
        listaVehiculos = new ArrayList<>();
        
        cargarListaVehiculos();
        cargarListaUsuarios();
        cargarListaMultas();
        
        Usuario usuario = inciarSesion();
        
        if (usuario instanceof Cliente){
            Cliente cliente = (Cliente)usuario;
            mostrarMenuCliente(cliente);
        } else if (usuario instanceof Operador){
            Operador operador = (Operador)usuario;
            mostrarMenuOperador(operador);
        }
    }
    /**
    * Metodo para crear un arrayList con los vehiculos del archivo proporcionado
    *
    */
    public static void cargarListaVehiculos(){
        ArrayList<String> datosVehi = ManejoArchivos.LeeFichero("vehiculos.txt");
        for (String lineaVehi : datosVehi){
            String[] elementosVehi = lineaVehi.trim().split(",");
            Vehiculo vehiculo = new Vehiculo(elementosVehi[1],elementosVehi[0],elementosVehi[2],elementosVehi[3],Integer.parseInt(elementosVehi[4]),elementosVehi[5],elementosVehi[6]);
            listaVehiculos.add(vehiculo);
        }
        
    }
        /**
    * Metodo para crear un arrayList con los usuarios del archivo proporcionado
    *
    */
    public static void cargarListaUsuarios(){
        ArrayList<String> datos = ManejoArchivos.LeeFichero("usuarios.txt");
        for (String linea: datos){
            String[] elementos = linea.trim().split(",");
            String tipo = elementos[6];
            switch (tipo){
                case "O":
                    ArrayList<String> datosOp = ManejoArchivos.LeeFichero("operadores.txt");
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
                            for (Vehiculo vehiculo : listaVehiculos){
                                if (elementosCl[0].equals(vehiculo.getDuenio())){
                                    Usuario us2 = new Cliente(elementos[0],elementos[1],Integer.parseInt(elementos[2]),TipoUsuario.CLIENTE,elementos[3],elementos[5],elementos[4],elementosCl[1],Integer.parseInt(elementosCl[2]),TipoCliente.ESTANDAR,vehiculo);
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
                            for (Vehiculo vehiculo : listaVehiculos){
                                if (elementosCl2[0].equals(vehiculo.getDuenio())){
                                    Usuario us3 = new Cliente(elementos[0],elementos[1],Integer.parseInt(elementos[2]),TipoUsuario.CLIENTE,elementos[3],elementos[5],elementos[4],elementosCl2[1],Integer.parseInt(elementosCl2[2]),TipoCliente.ESTRELLA,vehiculo);
                                    listaUsuarios.add(us3);
                                }
                            }
                        }
                    }
                    break;
            }
        }
    }
    /**
    * Metodo para crear un arrayList con las multas del archivo proporcionado
    *
    */
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
    /**
    * Metodo para validar el inicio de sesión
    * @return usuarioRetorno Usuario
    */
    public static Usuario inciarSesion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++++\n   Bienvenido al Sistema\n+++++++++++++++++++++++++++");
        
        Usuario usuarioRetorno = null;
        boolean x = true;
        while(x!=false){
            System.out.print("Usuario: ");
            String usuarioI = sc.nextLine();
            System.out.print("Contraseña: ");
            String contrasenaI = sc.nextLine();
            for(Usuario usuario : listaUsuarios){
                if(usuario.getUsuario().equals(usuarioI) && usuario.getContrasenia().equals(contrasenaI)){
                    System.out.println("Ingreso exitoso.");
                    usuarioRetorno = usuario;
                    x = false;
                }
            }
            System.out.println("Datos incorrectos.");
        }
        return usuarioRetorno;
    }
    /**
    * Metodo para mostrar el menu solo a los clientes
    * @param cliente Cliente
    *
    */
    public static void mostrarMenuCliente(Cliente cliente){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Consultar Multas");
        System.out.println("2. Agendar Revisión técnica");
        System.out.println("3. Salir");
        int opcion = 0;
        while (opcion!=3){
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    cliente.consultarMultas(listaMultas);
                    break;
                case 2:
                    cliente.agendarRev(listaMultas);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
    /**
    * Metodo para mostrar menu solo al Operador
    * @param operador Operador
    *
    */
    public static void mostrarMenuOperador(Operador operador){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Registrar pagos");
        System.out.println("2. Consultar multas clientes");
        System.out.println("3. Consultar usuarios");
        System.out.println("4. Salir");
        int opcion = 0;
        while (opcion!=4){
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    operador.registrarPago(listaUsuarios, listaMultas);
                    break;
                case 2:
                    operador.consultarMultas(listaMultas);
                    break;
                case 3:
                    operador.consultarUsuarios(listaUsuarios);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
