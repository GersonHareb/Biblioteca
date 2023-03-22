package org.example.repository;

import org.example.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long> {
    List<Categoria> findByNombreIn(List<String> nombre);
}
