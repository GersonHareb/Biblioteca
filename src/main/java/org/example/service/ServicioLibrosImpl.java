package org.example.service;

import org.example.model.Libro;
import org.example.repository.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServicioLibrosImpl implements ServicioLibros {

    @Autowired
    private LibroRepositorio libroRepo;

    @Override
    public List<Libro> listarLibros() {
        return libroRepo.findAll();
    }

    @Override
    public Libro guardarLibro(Libro libro){
        libroRepo.save(libro);
        return libro;
    }
}
