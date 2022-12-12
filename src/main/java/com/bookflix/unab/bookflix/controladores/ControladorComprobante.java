package com.bookflix.unab.bookflix.controladores;

import com.bookflix.unab.bookflix.entidades.ComprobanteRenta;
import com.bookflix.unab.bookflix.servicios.ServicioComprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comprobantes")
public class ControladorComprobante {
    @Autowired
    ServicioComprobante servicioComprobante;

    @GetMapping
    public List<ComprobanteRenta> getComprobantes(){
        return servicioComprobante.obtenerComprobantesOrden();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ComprobanteRenta postComprobante(@RequestBody ComprobanteRenta cr){
        return servicioComprobante.guardarComprobante(cr);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteComprobante(@PathVariable("id") String id){
        servicioComprobante.eliminarComprobante(id);
    }
}