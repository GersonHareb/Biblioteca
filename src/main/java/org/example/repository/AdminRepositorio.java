package org.example.repository;

import org.example.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepositorio extends JpaRepository<Admin, Long> {
}
