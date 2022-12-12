package com.bookflix.unab.bookflix.repositorios;

import com.bookflix.unab.bookflix.entidades.Libro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends MongoRepository<Libro, String> {
}
