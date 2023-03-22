package org.example.model;



import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToMany
    @JoinTable(name = "libro_categoria",
            joinColumns = @JoinColumn(name = "categoria_id"),
            inverseJoinColumns = @JoinColumn(name = "libro_id"))
    private Set<Libro> libros = new HashSet<>();

    public Categoria() {
    }

    public Categoria(Long id, String nombre, List<Libro> libros) {
        this.id = id;
        this.nombre = nombre;
        this.libros = new HashSet<>(libros);
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

    public List<Libro> getLibros() {
        return new ArrayList<>(libros);
    }

    public void setLibros(List<Libro> libros) {
        this.libros.clear();
        if(libros != null){
            this.libros.addAll(libros);
        }
    }
}
