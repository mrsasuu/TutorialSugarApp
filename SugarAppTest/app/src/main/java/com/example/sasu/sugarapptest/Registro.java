package com.example.sasu.sugarapptest;

import com.orm.SugarRecord;

/**
 * Created by Sasu on 11/06/2017.
 */

public class Registro extends SugarRecord {
    private String ide, nombre, telefono,contrase;

    public Registro() {
    }

    public Registro(String id, String nombre, String telefono, String contrase) {
        this.ide = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contrase = contrase;
    }

    public String getContrase() {
        return contrase;
    }

    public void setContrase(String contrase) {
        this.contrase = contrase;
    }

    public void setIde(String id) {
        this.ide = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getIde() {
        return ide;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}
