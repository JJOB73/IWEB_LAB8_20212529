package com.example.lab8.beans;

public class Pelicula {
    private int idPelicula;
    private String titulo;
    private String director;
    private int anoPublicacion;
    private Double rating;
    private Double boxOffice;
    private int idGenero;

    // Constructor vacío
    public Pelicula() {
    }

    // Constructor con parámetros
    public Pelicula(int idPelicula, String titulo, String director, int anoPublicacion, Double rating, Double boxOffice, int idGenero) {
        this.setIdPelicula(idPelicula);
        this.setTitulo(titulo);
        this.setDirector(director);
        this.setAnoPublicacion(anoPublicacion);
        this.setRating(rating);
        this.setBoxOffice(boxOffice);
        this.setIdGenero(idGenero);
    }

    // Getters y Setters
    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Double getBoxOffice() {
        return boxOffice;
    }

    public void setBoxOffice(Double boxOffice) {
        this.boxOffice = boxOffice;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    // metodo toString para representación del objeto
    @Override
    public String toString() {
        return "Pelicula{" +
                "idPelicula=" + getIdPelicula() +
                ", titulo='" + getTitulo() + '\'' +
                ", director='" + getDirector() + '\'' +
                ", anoPublicacion=" + getAnoPublicacion() +
                ", rating=" + getRating() +
                ", boxOffice=" + getBoxOffice() +
                ", idGenero=" + getIdGenero() +
                '}';
    }
}
