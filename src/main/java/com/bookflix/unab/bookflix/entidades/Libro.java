package com.bookflix.unab.bookflix.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document("libros")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Libro {
    @Id
    private String id;
    private String titulo;
    private String autor;
    private String editorial;
    private String cover;
    private List<String> generos;
    private Date fechaPublicacion;
}