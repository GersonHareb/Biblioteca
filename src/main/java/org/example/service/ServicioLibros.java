package org.example.service;

import org.example.model.Libro;

import java.util.List;

public interface ServicioLibros {
    List<Libro> listarLibros();

    Libro guardarLibro(Libro libro);
}
