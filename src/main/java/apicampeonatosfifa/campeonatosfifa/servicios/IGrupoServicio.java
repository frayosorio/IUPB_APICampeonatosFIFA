package apicampeonatosfifa.campeonatosfifa.servicios;

import java.util.List;

import apicampeonatosfifa.campeonatosfifa.modelos.TablaPosicion;

public interface IGrupoServicio {

    public List<TablaPosicion> obtenerPosiciones(int idGrupo);
}
