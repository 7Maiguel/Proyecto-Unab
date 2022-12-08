package com.bookflix.unab.bookflix.entities;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EditorialRepositorio extends MongoRepository <Editorial, String> {
}
