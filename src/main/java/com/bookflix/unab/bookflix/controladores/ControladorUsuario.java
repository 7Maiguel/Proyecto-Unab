package com.bookflix.unab.bookflix.controladores;

import com.bookflix.unab.bookflix.entidades.Usuario;
import com.bookflix.unab.bookflix.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {
    @Autowired
    RepositorioUsuario repositorioUsuario;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return repositorioUsuario.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario postUsuario(@RequestBody Usuario u){
        return repositorioUsuario.save(u);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUsuario(@PathVariable("id") String id){
        repositorioUsuario.deleteById(id);
    }
}