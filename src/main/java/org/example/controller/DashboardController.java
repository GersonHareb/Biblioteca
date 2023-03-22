package org.example.controller;

import org.example.model.Cliente;
import org.example.model.Libro;
import org.example.service.ServicioClientesImpl;
import org.example.service.ServicioLibrosImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {
    @Autowired
    private ServicioLibrosImpl servicioLibros;

    @GetMapping("/dashboard")
    public String dashboard(Model modelo) {
        List<Libro> libros = servicioLibros.listarLibros();
        modelo.addAttribute("libros", libros);
        return "dashboard";
    }
}