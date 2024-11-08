package com.example.lab8.beans;

public class Protagonistas {
    private int idPelicula;
    private int idActor;

    // Constructor vacío
    public Protagonistas() {
    }

    // Constructor con parámetros
    public Protagonistas(int idPelicula, int idActor) {
        this.setIdPelicula(idPelicula);
        this.setIdActor(idActor);
    }

    // Getters y Setters
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    // Método toString para representación del objeto
    @Override
    public String toString() {
        return "Protagonistas{" +
                "idPelicula=" + getIdPelicula() +
                ", idActor=" + getIdActor() +
                '}';
    }
}

