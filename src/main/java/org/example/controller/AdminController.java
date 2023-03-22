package org.example.controller;

import org.example.model.Admin;
import org.example.service.ServicioAdminImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;


@org.springframework.stereotype.Controller
public class AdminController {
    @Autowired
    private ServicioAdminImpl servicioAdmin;

    @GetMapping("/admins")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("admin", new Admin());
        return "agregar_admin";
    }

    @PostMapping("/admins/agregar")
    public String agregarAdmin(@ModelAttribute Admin admin) {
        admin.setFechaRegistro(LocalDate.now());
        servicioAdmin.guardarAdmin(admin);
        return "redirect:/dashboard";
    }

}
