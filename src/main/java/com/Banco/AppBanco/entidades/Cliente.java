package com.Banco.AppBanco.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private long documento;
    @Column(name="Nom", nullable = false,length = 30)
    private String nombre;
    @Column(name = "Apellido", nullable = false, length = 30)
    private String apellido;
    @Column(name = "Email", nullable = false,unique = true,length = 30)
    private String correo;
    @Column(name="Celular",length = 10)
    private long celular;

    public Cliente(long documento, String nombre, String apellido, String correo, long celular) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.celular = celular;
    }

    public Cliente() {

    }

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }
}
