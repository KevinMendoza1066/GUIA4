package com.example.ejercicio2;

public class Frutas {
    private String Nombre;
    private String Descripcion;
    public Frutas(String nombre, String descripcion) {
        Nombre=nombre;
        Descripcion=descripcion;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getDescripcion() {
        return Descripcion;
    }
}
