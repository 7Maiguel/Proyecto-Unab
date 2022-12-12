package com.bookflix.unab.bookflix.servicios;

import com.bookflix.unab.bookflix.entidades.Genero;
import com.bookflix.unab.bookflix.repositorios.RepositorioGenero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioGenero {
    @Autowired
    RepositorioGenero rpGenero;

    public List<Genero> obtenerGeneros(){
        return rpGenero.findAll();
    }

    public String guardarGenero(Genero g){
        if(g.getId() == null){
            rpGenero.save(g);
            return "Genero guardado !";
        }
        return "El genero que desea añadir ya existe";
    }

    public String eliminarGenero(String id){
        if(rpGenero.existsById(id)){
            rpGenero.deleteById(id);
            return "Genero eliminado !";
        }
        return "El genero que desea eliminar no existe";
    }
}
