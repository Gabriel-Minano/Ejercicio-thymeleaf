package com.springboot.app.proyectorestmoderno2.dto;

public record LibroResponse(
        Long id,
        String titulo,
        String autor,
        String genero,
        Integer anioPublicacion,
        Double precio,
        Integer stock,
        String descripcion
) {
}
