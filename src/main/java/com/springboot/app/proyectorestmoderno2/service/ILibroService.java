package com.springboot.app.proyectorestmoderno2.service;

import com.springboot.app.proyectorestmoderno2.dto.LibroRequest;
import com.springboot.app.proyectorestmoderno2.dto.LibroResponse;
import com.springboot.app.proyectorestmoderno2.model.Libro;
import com.springboot.app.proyectorestmoderno2.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ILibroService implements LibroService {

    private final LibroRepository repository;

    public ILibroService(LibroRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<LibroResponse> listarLibros() {

        return repository.findAll().stream().map(libro -> convertirAResponse(libro)).toList();
    }

    @Override
    public LibroResponse buscarPorId(Long id) {
        LibroResponse libro = convertirAResponse(repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe el Libro con ID: " + id)));
        return libro;
    }

    @Override
    public LibroResponse ingresarLibro(LibroRequest l) {
        Libro nuevoLibro = new Libro(l);
        LibroResponse response = convertirAResponse(repository.save(nuevoLibro));
        return response;
    }

    @Override
    public LibroResponse actualizarLibro(Long id, LibroRequest request) {
        Libro actual = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("No existe el Libro con ID: " + id));
        
        actual.setTitulo(request.titulo());
        actual.setAutor(request.autor());
        actual.setGenero(request.genero());
        actual.setAnioPublicacion(request.anioPublicacion());
        actual.setPrecio(request.precio());
        actual.setStock(request.stock());
        actual.setDescripcion(request.descripcion());

        LibroResponse response = convertirAResponse(repository.save(actual));
        return response;
    }

    @Override
    public void eliminarLibro(Long id) {
        if(!repository.existsById(id)) throw new RuntimeException("No existe el Libro con ID: " + id);
        repository.deleteById(id);
    }

    private LibroResponse convertirAResponse(Libro libro) {
        return new LibroResponse(
                libro.getId(),
                libro.getTitulo(), libro.getAutor(),
                libro.getGenero(), libro.getAnioPublicacion(),
                libro.getPrecio(),
                libro.getStock(),
                libro.getDescripcion());
    }
}
