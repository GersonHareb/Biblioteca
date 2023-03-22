package org.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "Usuario_Administrador")
public class Admin extends Persona{
    public Admin() {
    }
    @Column(unique = true, nullable = false)
    public String username;

    public Admin(String nombre, String apellido, String rut, LocalDate fechaRegistro, String domicilio, String email, String telefono, String contrasenia, String username) {
        super(nombre, apellido, rut, fechaRegistro, null, domicilio, email, telefono, null, contrasenia);
        this.username = username;
    }

    public Admin(Long id, String nombre, String apellido, String rut, LocalDate fechaRegistro, String domicilio, String email, String telefono, String contrasenia, String username) {
        super(id, nombre, apellido, rut, fechaRegistro, null, domicilio, email, telefono, null, contrasenia);
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
