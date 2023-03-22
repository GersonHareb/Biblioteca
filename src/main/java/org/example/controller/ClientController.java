package org.example.controller;

import org.example.model.Cliente;
import org.example.service.ServicioClientesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;


@org.springframework.stereotype.Controller
public class ClientController {
    @Autowired
    private ServicioClientesImpl servicioClientes;

    @GetMapping("/clientes")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "agregar_cliente";
    }

    @PostMapping("/clientes/agregar")
    public String agregarCliente(@ModelAttribute Cliente cliente) {
        cliente.setFechaRegistro(LocalDate.now());
        servicioClientes.guardarCliente(cliente);
        return "redirect:/dashboard";
    }

}
