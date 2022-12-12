package com.bookflix.unab.bookflix.repositorios;

import com.bookflix.unab.bookflix.entidades.ComprobanteRenta;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioComprobante extends MongoRepository<ComprobanteRenta, String> {
}
