package com.example.inmobile.modelo;

import java.io.Serializable;
import java.util.Objects;

public class Inmueble implements Serializable {

    private int idInmueble;
    private String direccion;
    private String superficie;
    private String tipo;
    private int ambientes;
    private double precio;
    private Propietario duenio;
    //private Propietario propietario;
    //En falso significa que el innmueble no está disponible por alguna falla en el mismo.
   // private boolean disponible=true;
    private int estado;
    private String imagen;
    private int propietarioId;

    public Inmueble(int idInmueble, String direccion, String superficie, String tipo, int ambientes, double precio, Propietario duenio, int estado, String imagen, int propietarioId) {
        this.idInmueble = idInmueble;
        this.direccion = direccion;
        this.superficie = superficie;
        this.tipo = tipo;
        this.ambientes = ambientes;
        this.precio = precio;
        this.duenio = duenio;
        this.estado = estado;
        this.imagen = imagen;
        this.propietarioId = propietarioId;

    }
    public Inmueble() {

    }
    public int getIdInmueble() {
        return idInmueble;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Propietario getDuenio() {
        return duenio;
    }

    public void setDuenio(Propietario propietario) {
        this.duenio = duenio;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int disponible) {
        this.estado = disponible;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPropietarioId() {
        return propietarioId;
    }

    public void setPropietarioId(int propietarioId) {
        this.propietarioId = propietarioId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inmueble inmueble = (Inmueble) o;
        return idInmueble == inmueble.idInmueble;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInmueble);
    }
}
