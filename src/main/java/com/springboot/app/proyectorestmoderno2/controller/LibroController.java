package com.springboot.app.proyectorestmoderno2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.springboot.app.proyectorestmoderno2.service.LibroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class LibroController {

    private final LibroService service;
    public LibroController(LibroService service){
        this.service = service;
    }

    @GetMapping
    public String mostrarLibros(Model modelo) {
        modelo.addAttribute("lista",service.listarLibros());
        return "libros";
    }

    @GetMapping("/{id}")
    public String buscarLibro(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("libro", service.buscarPorId(id));
        return "formulario_libro";
    }
    
    
}
