package com.bookflix.unab.bookflix.servicios;

import com.bookflix.unab.bookflix.repositorios.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {
    @Autowired
    RepositorioUsuario rpUsuario;
}