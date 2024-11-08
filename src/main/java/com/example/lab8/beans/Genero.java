package com.example.lab8.beans;

public class Genero {
    private int idGenero;
    private String nombre;

    // Constructor vacío
    public Genero() {
    }

    // Constructor con parámetros
    public Genero(int idGenero, String nombre) {
        this.setIdGenero(idGenero);
        this.setNombre(nombre);
    }

    // Getters y Setters
    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método toString para representación del objeto
    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + getIdGenero() +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}
