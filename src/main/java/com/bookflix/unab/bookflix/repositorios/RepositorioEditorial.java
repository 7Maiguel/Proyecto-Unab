package com.bookflix.unab.bookflix.repositorios;

import com.bookflix.unab.bookflix.entidades.Editorial;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEditorial extends MongoRepository<Editorial, String> {
}
