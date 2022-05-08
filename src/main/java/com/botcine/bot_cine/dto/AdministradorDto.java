package com.botcine.bot_cine.dto;

public class AdministradorDto {
    Integer ca;
    String nombre;
    String apellido;
    String usuario;
    String password;
    String bot_chat_id;

    public AdministradorDto(Integer ca, String nombre, String apellido, String usuario, String password, String bot_chat_id) {
        this.ca = ca;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.password = password;
        this.bot_chat_id = bot_chat_id;
    }


    public Integer getCa() {
        return ca;
    }

    public void setCa(Integer ca) {
        this.ca = ca;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBot_chat_id() {
        return bot_chat_id;
    }

    public void setBot_chat_id(String bot_chat_id) {
        this.bot_chat_id = bot_chat_id;
    }

    @Override
    public String toString() {
        return
                "Nombre: " + nombre + '\n' +
                        "Apellido: " + apellido + '\n' +
                        "Usuario: " + usuario + '\n' +
                        "Password: " + password + '\n';
    }
}
