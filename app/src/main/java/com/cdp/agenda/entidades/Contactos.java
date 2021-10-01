package com.cdp.agenda.entidades;

public class Contactos {

    private int id;
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo_electornico;
    private String usuario;
    private String password;

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

    public String getApellidos() { return apellidos; }

    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electornico() {
        return correo_electornico;
    }

    public void setCorreo_electornico(String correo_electornico) {
        this.correo_electornico = correo_electornico;
    }

    public String getUsuario() { return usuario; }

    public void setUsuario(String usuario) { this.usuario = usuario; }

    public String getPassword() { return password; }

    public void setPassword(String password){ this.password = password; }
}
