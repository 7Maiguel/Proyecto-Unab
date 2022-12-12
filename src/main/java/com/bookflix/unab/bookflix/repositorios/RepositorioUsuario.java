package com.bookflix.unab.bookflix.repositorios;

import com.bookflix.unab.bookflix.entidades.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioUsuario extends MongoRepository<Usuario, String> {}
