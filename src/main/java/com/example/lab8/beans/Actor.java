package com.example.lab8.beans;

public class Actor {
    private int idActor;
    private String nombre;
    private String apellido;
    private Integer anoNacimiento;
    private boolean premioOscar;

    // Constructor vacío
    public Actor() {
    }

    // Constructor con parámetros
    public Actor(int idActor, String nombre, String apellido, Integer anoNacimiento, boolean premioOscar) {
        this.setIdActor(idActor);
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setAnoNacimiento(anoNacimiento);
        this.setPremioOscar(premioOscar);
    }

    // Getters y Setters
    public int getIdActor() {
        return idActor;
    }

    public void setIdActor(int idActor) {
        this.idActor = idActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getAnoNacimiento() {
        return anoNacimiento;
    }

    public void setAnoNacimiento(Integer anoNacimiento) {
        this.anoNacimiento = anoNacimiento;
    }

    public boolean isPremioOscar() {
        return premioOscar;
    }

    public void setPremioOscar(boolean premioOscar) {
        this.premioOscar = premioOscar;
    }

    // Metodo toString para representacion del objeto
    @Override
    public String toString() {
        return "Actor{" +
                "idActor=" + getIdActor() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", anoNacimiento=" + getAnoNacimiento() +
                ", premioOscar=" + isPremioOscar() +
                '}';
    }
}
