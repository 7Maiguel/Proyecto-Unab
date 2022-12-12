package com.bookflix.unab.bookflix.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("generos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Genero {
    @Id
    private String id;
    private String nombre;
}
