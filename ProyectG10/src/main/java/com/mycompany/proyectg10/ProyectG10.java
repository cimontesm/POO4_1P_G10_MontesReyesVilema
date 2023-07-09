/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectg10;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author cmontes
 */
public class ProyectG10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] datosUsuario = ProyectG10.accederSistema();
    }
    
    
    public static String[] accederSistema(){
        String cedula = ""; 
        String nombres= "";
        String apellidos = "";
        String edad = "";
        String correo = "";
        String usuario= "";
        String contrasena = "";
        String perfil= "";
        Scanner sc = new Scanner(System.in);
        boolean x = true;
        ArrayList<String> archivo = ManejoArchivos.LeeFichero("usuarios.txt");
        System.out.println("+++++++++++++++++++++++++++\nBienvenido al Sistema\n+++++++++++++++++++++++++");
        while(x!=false){
            System.out.println("Usuario: ");
            usuario = sc.nextLine();
            System.out.println("Contrasena: ");
            contrasena = sc.nextLine();
            for(int i=1;i<archivo.size();i++){
                String[] linea = archivo.get(i).split(",");
                if(usuario.equals(linea[4])&&contrasena.equals(linea[5])){
                    cedula = linea[0];
                    nombres = linea[1].split(" ")[0];
                    apellidos = linea[1].split(" ")[1];
                    edad = linea[2];
                    correo = linea[3];
                    usuario = linea[4];
                    contrasena = linea[5];
                    perfil = linea[6];
                    x = false;
                    break;
                }
            }
        }
        String[] datosUsuario = {cedula,nombres,apellidos,edad,correo,usuario,contrasena,perfil};
        return datosUsuario;
    }
    
    
    
    
}
