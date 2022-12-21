package com.bookflix.unab.bookflix.controladores;

import com.bookflix.unab.bookflix.entidades.Libro;
import com.bookflix.unab.bookflix.servicios.ServicioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/libros")
public class ControladorLibro {
    @Autowired
    ServicioLibro servicioLibro;

    @GetMapping
    public List<Libro> getLibros(@RequestParam("genero") Optional<String> genero){
        return servicioLibro.obtenerLibrosOrden();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postLibro(@RequestBody Libro l){
        return servicioLibro.guardarLibro(l);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLibro(@PathVariable("id") String id){
        servicioLibro.eliminarLibro(id);
    }
}
