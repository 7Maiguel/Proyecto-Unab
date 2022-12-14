package com.bookflix.unab.bookflix.servicios;

import com.bookflix.unab.bookflix.entidades.Libro;
import com.bookflix.unab.bookflix.repositorios.RepositorioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@Service
public class ServicioLibro {
    @Autowired
    RepositorioLibro rpLibro;

    public List<Libro> obtenerLibrosOrden(){
        return rpLibro.findAll(Sort.by("fechaPublicacion").descending());
    }

    public String guardarLibro(Libro l){
        if(l.getId() == null){
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
            Date fechaCreacionRegistro = new Date(dtf.format(LocalDateTime.now()));
            l.setFechaPublicacion(fechaCreacionRegistro);
            rpLibro.save(l);
            return "Libro guardado !";
        }
        return "El libro que desea guardar ya existe";
    }

    public String eliminarLibro(String id){
        if(rpLibro.existsById(id)){
            rpLibro.deleteById(id);
            return "Libro eliminado !";
        }
        return "El libro que desea eliminar no existe";
    }
}
