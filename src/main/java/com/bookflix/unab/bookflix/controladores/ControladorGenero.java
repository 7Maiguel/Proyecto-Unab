package com.bookflix.unab.bookflix.controladores;

import com.bookflix.unab.bookflix.entidades.Genero;
import com.bookflix.unab.bookflix.servicios.ServicioGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("generos")
public class ControladorGenero {
    @Autowired
    ServicioGenero servicioGenero;

    @GetMapping
    public List<Genero> getGeneros(){
        return servicioGenero.obtenerGeneros();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postGenero(@RequestBody Genero g){
        return servicioGenero.guardarGenero(g);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteGenero(@PathVariable("id") String id){
        return servicioGenero.eliminarGenero(id);
    }
}
