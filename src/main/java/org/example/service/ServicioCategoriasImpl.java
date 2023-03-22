package org.example.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.model.Categoria;
import org.example.repository.CategoriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioCategoriasImpl implements ServicioCategoria{
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Categoria> listarCategorias() {
        return categoriaRepositorio.findAll();
    }

    @Override
    public void guardarCategoria(Categoria categoria) {
        categoriaRepositorio.save(categoria);
    }

    @Override
    public List<Categoria> buscarCategoriasPorNombres(List<String> nombres) {
        return categoriaRepositorio.findByNombreIn(nombres);
    }
}
