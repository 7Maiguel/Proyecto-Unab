package com.bookflix.unab.bookflix.repositorios;

import com.bookflix.unab.bookflix.entidades.Genero;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioGenero extends MongoRepository<Genero, String> {
}
