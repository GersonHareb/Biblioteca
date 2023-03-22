package org.example.service;

import org.example.model.Cliente;

import java.util.List;

public interface ServicioClientes {

    List<Cliente> listarClientes();
    void guardarCliente(Cliente cliente);
}
