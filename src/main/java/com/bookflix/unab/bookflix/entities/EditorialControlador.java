package com.bookflix.unab.bookflix.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EditorialControlador {
    @Autowired
    EditorialServicios editServicios;

    @GetMapping
    public List <Editorial> obtenerEditoriales() {
        return editServicios.obtenerEditorial();
    }

    @PostMapping
    public String nuevaEditorial(@RequestBody Editorial editorial) {
        return editServicios.guardarEditorial(editorial);
    }

    @DeleteMapping("/id")
    public String eliminarEditorial(@PathVariable("id") String id){
        return editServicios.eliminarEditorial(id);
    }
}
