/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

/**
 *
 * @author -ERIC-
 */
public class Usuario {


    public Usuario(int id, String nombreUsuario, String contracena){
        this.id=id;
        this.nombreUsuario=nombreUsuario;
        this.contracena=contracena;
    }

    private int id;
    private String nombreUsuario;
    private String contracena;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContracena() {
        return contracena;
    }

    public void setContracena(String contracena) {
        this.contracena = contracena;
    }
}