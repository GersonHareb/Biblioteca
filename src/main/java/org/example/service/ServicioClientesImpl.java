package org.example.service;


import org.example.model.Cliente;
import org.example.repository.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioClientesImpl implements ServicioClientes{

    @Autowired
    private ClienteRepositorio repoCliente;


    @Override
    public List<Cliente> listarClientes() {
        return repoCliente.findAll();
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        repoCliente.save(cliente);
    }
}
