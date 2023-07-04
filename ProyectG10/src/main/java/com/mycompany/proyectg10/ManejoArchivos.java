/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/**
 *
 * @author cmontes
 */
public class ManejoArchivos {
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
                System.out.println(linea);
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
}
