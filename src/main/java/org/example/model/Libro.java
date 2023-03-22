package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "libro")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "autor_id", nullable = false)
    private Autor autor;

    @Column(name = "descripcion")
    private String descripcion;

    /*@ManyToOne
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;*/

    /*@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "libro_categoria",
            joinColumns = @JoinColumn(name = "libro_id"),
            inverseJoinColumns = @JoinColumn(name = "categoria_id"))
    private Set<Categoria> categoria = new HashSet<>();*/

    @ManyToMany(mappedBy = "libros")
    private List<Categoria> categoria;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "fecha_adquisicion", nullable = false)
    private LocalDate fechaAdquisicion;

    @Column(name = "proveedor", nullable = false)
    private String proveedor;

    @ManyToOne
    @JoinColumn(name = "usuario_registro_id", nullable = false)
    private Admin usuarioRegistro;

    @Column(name = "imagen")
    private String imagen;

    @Column(name = "estado", nullable = false)
    private String estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "disponibilidad", nullable = false)
    private Disponibilidad disponibilidad;

    public enum Disponibilidad {
        DISPONIBLE,
        NO_DISPONIBLE
    }

    public Libro() {
    }

    public Libro(Long id, String titulo, Autor autor, String descripcion, List<Categoria> categorias, String ISBN, LocalDate fechaAdquisicion, String proveedor, Admin usuarioRegistro, String imagen, String estado, Disponibilidad disponibilidad) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.categoria = categorias;
        this.ISBN = ISBN;
        this.fechaAdquisicion = fechaAdquisicion;
        this.proveedor = proveedor;
        this.usuarioRegistro = usuarioRegistro;
        this.imagen = imagen;
        this.estado = estado;
        this.disponibilidad = disponibilidad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Admin getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(Admin usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}



