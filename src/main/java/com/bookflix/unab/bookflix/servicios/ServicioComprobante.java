package com.bookflix.unab.bookflix.servicios;

import com.bookflix.unab.bookflix.entidades.ComprobanteRenta;
import com.bookflix.unab.bookflix.repositorios.RepositorioComprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioComprobante {
    @Autowired
    RepositorioComprobante rpComprobante;

    public List<ComprobanteRenta> obtenerComprobantesOrden(){
        return rpComprobante.findAll();
    }

    public ComprobanteRenta guardarComprobante(ComprobanteRenta cr){
        return rpComprobante.save(cr);
    }

    public void eliminarComprobante(String id){
        rpComprobante.deleteById(id);
    }
}
