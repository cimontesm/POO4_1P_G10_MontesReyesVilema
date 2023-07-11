/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 * Clase que nos ayuda a leer y escribir los archivos a utilizar
 * 
 */
public class ManejoArchivos {
        /**
     * Metodo para leer archivos
     * @param nombreArchivo String
     * @return ArrayList<String>
     */
    public static ArrayList<String> LeeFichero(String nombreArchivo) {
        ArrayList<String> lineas = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        
        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo,StandardCharsets.UTF_8);
            br = new BufferedReader(fr);
            String linea;
            while ((linea = br.readLine()) != null){
//                System.out.println(linea);
                lineas.add(linea);
            }
        } catch (Exception e1){
            e1.printStackTrace();
        } finally {
            try {
                if (null != fr){
                    fr.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
        return lineas;
    }
        /**
     * Metodo para escribir los archivos
     * @param nombreArchivo String
     * @param linea String
     */
    public static void EscribirArchivo(String nombreArchivo,String linea) {
        FileWriter fichero = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        
        try {
            fichero = new FileWriter(nombreArchivo,true);
            bw = new BufferedWriter(fichero);
            bw.write(linea+"\n");
            System.out.println("ksdsdlsd");
        } catch (Exception e1){
            e1.printStackTrace();
        } finally {
            try {
                if (null != fichero){
                    bw.close();
                }
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }
}
