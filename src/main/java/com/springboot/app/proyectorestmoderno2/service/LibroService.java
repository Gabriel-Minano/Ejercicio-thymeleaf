package com.springboot.app.proyectorestmoderno2.service;

import com.springboot.app.proyectorestmoderno2.dto.LibroRequest;
import com.springboot.app.proyectorestmoderno2.dto.LibroResponse;

import java.util.List;

public interface LibroService {
    List<LibroResponse> listarLibros();
    LibroResponse buscarPorId(Long id);
    LibroResponse ingresarLibro(LibroRequest request);
    LibroResponse actualizarLibro(Long id, LibroRequest request);
    void eliminarLibro(Long id);
}
