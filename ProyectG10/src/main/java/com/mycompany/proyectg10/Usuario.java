/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectg10;

import java.util.ArrayList;

/**
 *
 * La clase usuario contiene los atributos y metodos utilizados en el proyecto
 * 
 */
public abstract class Usuario {
    protected String numCedula, nombre, correo, contrasenia, usuario;
    protected int edad;
    protected TipoUsuario perfil;
        /**
     * Metodo constructor de la clase Usuario
     * @param numCedula String
     * @param nombre String
     * @param edad int
     * @param perfil TipoUsuario
     * @param correo String
     * @param contrasenia String
     * @param usuario String
     */
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
    /**
     * Metodo getter para consultar la cedula del Usuario
     * @return cedula del Usuario
     */
    public String getNumCedula() {
        return numCedula;
    }
    /**
     * Metodo setter para establecer la cedula del Usuario
     * @param numCedula String
     */
    public void setNumCedula(String numCedula) {
        this.numCedula = numCedula;
    }
    /**
     * Metodo getter para consultar nombre del Usuario
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo setter para establecer nombre del Usuario
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     /**
     * Metodo getter para consultar la edad del Usuario
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Metodo setter para establecer la edad del Usuario
     * @param edad int
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Metodo getter para consultar el tipo del Usuario
     * @return perfil
     */
    public TipoUsuario getPerfil() {
        return perfil;
    }
    /**
     * Metodo setter para establecer perfil del Usuario
     * @param perfil TipoUsuario
     */
    public void setPerfil(TipoUsuario perfil) {
        this.perfil = perfil;
    }
    /**
     * Metodo getter para consultar correo del Usuario
     * @return correo
     */
    public String getCorreo() {
        return correo;
    }
    /**
     * Metodo setter para establecer correo del Usuario
     * @param correo String
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    /**
     * Metodo getter para consultar constrasenia del Usuario
     * @return contrasenia 
     */
    public String getContrasenia() {
        return contrasenia;
    }
    /**
     * Metodo setter para establecer la contrasenia del Usuario
     * @param contrasenia String
     */
    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    /**
     * Metodo getter para consultar usuario del Usuario
     * @return usuario 
     */
    public String getUsuario() {
        return usuario;
    }
    /**
     * Metodo setter para establecer usuario del Usuario
     * @param usuario String
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
