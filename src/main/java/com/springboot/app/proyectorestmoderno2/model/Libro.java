package com.springboot.app.proyectorestmoderno2.model;

import com.springboot.app.proyectorestmoderno2.dto.LibroRequest;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;

    @Column(name = "autor", nullable = false, length = 150)
    private String autor;

    @Column(name = "genero", nullable = false, length = 100)
    private String genero;

    @Column(name = "anio_publicacion", nullable = false)
    private Integer anioPublicacion;

    @Column(name = "precio", nullable = false)
    private Double precio;

    @Column(name = "stock", nullable = false)
    private Integer stock;

    @Column(name = "descripcion", nullable = false)
    private String descripcion;

    public Libro(LibroRequest request) {
        this.titulo = request.titulo();
        this.autor = request.autor();
        this.genero = request.genero();
        this.anioPublicacion = request.anioPublicacion();
        this.precio = request.precio();
        this.stock = request.stock();
        this.descripcion = request.descripcion();
    }
}
