package com.bookflix.unab.bookflix.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    private String id;
    private String username;
    private String correo;
    private String nombre;
    private boolean esAdmin;
}