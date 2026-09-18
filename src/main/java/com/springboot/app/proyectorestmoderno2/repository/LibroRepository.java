package com.springboot.app.proyectorestmoderno2.repository;

import com.springboot.app.proyectorestmoderno2.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}
