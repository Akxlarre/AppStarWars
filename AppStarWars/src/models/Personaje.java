/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author akxlarre
 */
public class Personaje {
    private int id;
    private String nombre;
    private String planetaOrigen;
    private int edad;
    private String bando;
    private ArrayList peliculas;

    public Personaje(int id, String nombre, String planetaOrigen, int edad, String bando, ArrayList peliculas) {
        this.id = id;
        this.nombre = nombre;
        this.planetaOrigen = planetaOrigen;
        this.edad = edad;
        this.bando = bando;
        this.peliculas = peliculas;
    }

    public Personaje() {
    }
    
    

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlanetaOrigen() {
        return planetaOrigen;
    }

    public void setPlanetaOrigen(String planetaOrigen) {
        this.planetaOrigen = planetaOrigen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getBando() {
        return bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }

    public ArrayList getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList peliculas) {
        this.peliculas = peliculas;
    }
}
