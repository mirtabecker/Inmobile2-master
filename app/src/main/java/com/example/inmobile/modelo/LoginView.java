package com.example.inmobile.modelo;

public class LoginView {
    private String Usuario;
    private String Clave;

    public LoginView() {

    }

    public LoginView(String Usuario, String Clave) {
        this.Usuario = Usuario;
        this.Clave = Clave;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String clave) {
        this.Clave = clave;
    }
}
