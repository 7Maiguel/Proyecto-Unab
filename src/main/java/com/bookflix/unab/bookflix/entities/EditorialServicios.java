package com.bookflix.unab.bookflix.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class EditorialServicios {
    @Autowired
    EditorialRepositorio editRepo;

    public List<Editorial> obtenerEditorial() {
        List<Editorial> listaEditorial = editRepo.findAll();
        listaEditorial.sort(Comparator.comparing(Editorial::getName));
        return listaEditorial;
    }

    public String guardarEditorial(Editorial editorial) {
        editorial.setName(editorial.getName().toLowerCase());

        if(editorial.getId() == null || editRepo.existsById(editorial.getId())) {
            editRepo.save(editorial);
            return "Save";
        }

        else {
            editRepo.save(editorial);
            return "No se guardo";
        }
    }

    public String eliminarEditorial (String id) {
        if (editRepo.existsById(id)) {
            Optional<Editorial> editorial = editRepo.findById(id);
            editRepo.deleteById(id);

            return "Eliminar";
        } else {
            return "No se elimino";
        }
    }

}
