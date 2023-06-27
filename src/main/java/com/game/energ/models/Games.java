package com.game.energ.models;

public class Games {
    private int id;
    private String nombre;
    private String descripcion;
    private String creador;
    private String genero;
    private int aniolanzamiento;

    public Games(){
    }

    public Games(int id, String nombre, String descripcion, String creador, String genero, int aniolanzamiento){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.aniolanzamiento = aniolanzamiento;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniolanzamiento() {
        return aniolanzamiento;
    }

    public void setAniolanzamiento(int aniolanzamiento) {
        this.aniolanzamiento = aniolanzamiento;
    }
}
