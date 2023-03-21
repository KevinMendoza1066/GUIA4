package com.example.ejercicio4;

public class Personas {

    private String nombre;
    private int edad;
    private String direccion;

    Personas(String Nombre, int Edad,String Direccion){
        nombre = Nombre;
        edad = Edad;
        direccion = Direccion;
    }

    public String GetNombre() {return nombre;}
    public String GetEdad() {return String.valueOf(edad);}
    public String GetDireccion() {return direccion;}
}
