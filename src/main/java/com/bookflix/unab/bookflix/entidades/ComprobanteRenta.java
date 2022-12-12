package com.bookflix.unab.bookflix.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("comprobantes")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ComprobanteRenta {
    @Id
    private String id;
    private String username;
    private String tituloLibro;
    private Date fechaRenta;
    private Date fechaEntrega;
}
