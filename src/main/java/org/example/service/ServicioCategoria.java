package org.example.service;

import org.example.model.Categoria;

import java.util.List;

public interface ServicioCategoria {
    List<Categoria> listarCategorias();

    void guardarCategoria(Categoria categoria);

    List<Categoria> buscarCategoriasPorNombres(List<String> nombres);
}
