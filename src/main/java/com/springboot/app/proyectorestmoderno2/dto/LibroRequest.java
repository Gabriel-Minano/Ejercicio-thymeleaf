package com.springboot.app.proyectorestmoderno2.dto;

import jakarta.validation.constraints.*;

public record LibroRequest(
        @NotBlank
        String titulo,
        @NotBlank
        String autor,
        @NotBlank
        String genero,
        @NotNull
        Integer anioPublicacion,
        @NotNull
        @DecimalMin(value = "0.01")
        @DecimalMax(value = "9999.99")
        Double precio,
        @NotNull
        @PositiveOrZero
        Integer stock,
        @NotBlank
        String descripcion
) {
}
