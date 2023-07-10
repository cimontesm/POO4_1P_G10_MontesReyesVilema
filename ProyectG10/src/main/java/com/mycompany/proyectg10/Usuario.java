/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;

/**
 *
 * @author cmontes
 */
public abstract class Usuario {
    protected String numCedula, nombre, correo, contrasenia, usuario;
    protected int edad;
    protected TipoUsuario perfil;
    
    public Usuario(String numCedula, String nombre, int edad, TipoUsuario perfil, String correo, String contrasenia, String usuario) {
        this.numCedula = numCedula;
        this.nombre = nombre;
        this.edad = edad;
        this.perfil = perfil;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
    }

    public abstract void consultarMultas(ArrayList<Multa> listaMultas);

    
    //getters y setters 
    public String getNumCedula() {
        return numCedula;
    }

    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public TipoUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(TipoUsuario perfil) {
        this.perfil = perfil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
