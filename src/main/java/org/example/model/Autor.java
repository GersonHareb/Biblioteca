package org.example.model;

import jakarta.persistence.*;
import org.example.model.Libro;
import java.util.List;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @OneToMany(mappedBy = "autor")
    private List<Libro> libros;

    // constructores, getters y setters
}