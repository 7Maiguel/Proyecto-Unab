package com.bookflix.unab.bookflix.servicios;

import com.bookflix.unab.bookflix.entidades.Editorial;
import com.bookflix.unab.bookflix.repositorios.RepositorioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEditorial {
    @Autowired
    RepositorioEditorial rpEditorial;

    public List<Editorial> obtenerEditoriales(){
        return rpEditorial.findAll();
    }

    public String guardarEditorial(Editorial e){
        e.setNombre(e.getNombre().toLowerCase());

        if(e.getId() == null){
            rpEditorial.save(e);
            return "La editorial fue guardada !";
        }
        return "La editorial ya existe";
    }

    public String eliminarEditorial(String id){
        if (rpEditorial.existsById(id)){
            rpEditorial.deleteById(id);
            return "La editorial fue eliminada !";
        }
        return "La editorial no existe";
    }
}
