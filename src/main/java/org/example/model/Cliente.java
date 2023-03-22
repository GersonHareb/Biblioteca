package org.example.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
@Entity
@Table(name = "Cliente")
public class Cliente extends Persona{
    public Cliente(){
        super();
    }

    public Cliente(String nombre, String apellido, String rut, LocalDate fechaRegistro, Genero genero, String domicilio, String email, String telefono, EstadoCuenta estadoCuenta, String contrasenia) {
        super(nombre, apellido, rut, fechaRegistro, genero, domicilio, email, telefono, estadoCuenta, contrasenia);
    }

    public Cliente(Long id, String nombre, String apellido, String rut, LocalDate fechaRegistro, Genero genero, String domicilio, String email, String telefono, EstadoCuenta estadoCuenta, String contrasenia) {
        super(id, nombre, apellido, rut, fechaRegistro, genero, domicilio, email, telefono, estadoCuenta, contrasenia);
    }
}
