package apicampeonatosfifa.campeonatosfifa.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.campeonatosfifa.modelos.TablaPosicion;
import apicampeonatosfifa.campeonatosfifa.servicios.GrupoServicio;

@RestController
@RequestMapping("/grupos")
public class GrupoControlador {

    @Autowired
    private GrupoServicio servicio;

    @RequestMapping(value = "/{idGrupo}/posiciones", method = RequestMethod.GET)
    public List<TablaPosicion> obtenerPosiciones(@PathVariable int idGrupo) {
        return servicio.obtenerPosiciones(idGrupo);
    }

}
