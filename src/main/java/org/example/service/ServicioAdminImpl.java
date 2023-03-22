package org.example.service;

import org.example.model.Admin;
import org.example.repository.AdminRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAdminImpl implements ServicioAdmins {
    @Autowired
    private AdminRepositorio adminRepo;


    @Override
    public void guardarAdmin(Admin admin) {
        adminRepo.save(admin);
    }
}
