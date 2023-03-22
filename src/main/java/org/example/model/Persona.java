package org.example.model;

import jakarta.persistence.*;
import org.example.helper.ConvertidorEstadoCuenta;
import org.example.helper.ConvertidorGenero;

import java.time.LocalDate;
@MappedSuperclass
public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(unique = true, nullable = false)
    private String rut;
    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;
    @Enumerated(EnumType.STRING)
    @Convert(converter = ConvertidorGenero.class)
    private Genero genero;
    @Column
    private String domicilio;
    @Column(nullable = false, unique = true)
    private String email;
    @Column
    private String telefono;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_cuenta", nullable = false, insertable = false, updatable = false)
    @Convert(converter = ConvertidorEstadoCuenta.class)
    private EstadoCuenta estadoCuenta;
    @Column(name="Contraseña", nullable = false)
    private String contrasenia;

    public enum Genero {
        MASCULINO, FEMENINO, OTRO, NO_INDICADO
    }

    public enum EstadoCuenta {
        ACTIVA, INACTIVA
    }

    public Persona() {
    }

    public Persona(String nombre, String apellido, String rut, LocalDate fechaRegistro, Genero genero, String domicilio, String email, String telefono, EstadoCuenta estadoCuenta, String contrasenia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaRegistro = LocalDate.now();
        this.genero = genero;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
        this.estadoCuenta = estadoCuenta;
        this.contrasenia = contrasenia;
    }

    public Persona(Long id, String nombre, String apellido, String rut, LocalDate fechaRegistro, Genero genero, String domicilio, String email, String telefono, EstadoCuenta estadoCuenta, String contrasenia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaRegistro = LocalDate.now();;
        this.genero = genero;
        this.domicilio = domicilio;
        this.email = email;
        this.telefono = telefono;
        this.estadoCuenta = estadoCuenta;
        this.contrasenia = contrasenia;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public EstadoCuenta getEstadoCuenta() {
        return estadoCuenta;
    }

    public void setEstadoCuenta(EstadoCuenta estadoCuenta) {
        this.estadoCuenta = estadoCuenta;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
