package com.bookflix.unab.bookflix.controladores;

import com.bookflix.unab.bookflix.entidades.Editorial;
import com.bookflix.unab.bookflix.servicios.ServicioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("editoriales")
public class ControladorEditorial {
    @Autowired
    ServicioEditorial servicioEditorial;

    @GetMapping
    public List<Editorial> getEditoriales(){
        return servicioEditorial.obtenerEditoriales();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String postEditorial(@RequestBody Editorial e){
        return servicioEditorial.guardarEditorial(e);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteEditorial(@PathVariable("id") String id){
        return servicioEditorial.eliminarEditorial(id);
    }
}
