package org.example.controller;

import org.example.model.Categoria;
import org.example.model.Libro;
import org.example.service.ServicioCategoriasImpl;
import org.example.service.ServicioLibrosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class LibroController {

    @Autowired
    private ServicioLibrosImpl servicioLibros;
    @Autowired
    private ServicioCategoriasImpl servicioCategorias;

    @GetMapping("/libros")
    public String mostrarFormularioLibros(Model model){
        model.addAttribute("libro", new Libro());
        model.addAttribute("categorias", servicioCategorias.listarCategorias());
        return "agregar_libro";
    }

    @PostMapping("/libros/agregar")
    public String agregarLibro(@ModelAttribute Libro libro, @RequestParam("categoriasSeleccionadas") String categoriasSeleccionadas) {
        libro.setFechaAdquisicion(LocalDate.now());
        List<Categoria> categorias = servicioCategorias.buscarCategoriasPorNombres(Arrays.asList(categoriasSeleccionadas.split(",\\s*")));
        libro.setCategoria(categorias);
        servicioLibros.guardarLibro(libro);
        return "redirect:/dashboard";
    }
}
