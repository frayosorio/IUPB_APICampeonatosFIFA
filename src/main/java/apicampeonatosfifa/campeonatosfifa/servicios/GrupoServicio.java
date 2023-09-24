package apicampeonatosfifa.campeonatosfifa.servicios;

import java.util.List;
//import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.campeonatosfifa.modelos.TablaPosicion;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;

@Service
public class GrupoServicio implements IGrupoServicio {

    @PersistenceContext
    public EntityManager em;

    @Override
    public List<TablaPosicion> obtenerPosiciones(int idGrupo) {
        List<TablaPosicion> tablaPosiciones = em.createStoredProcedureQuery("fTablaPosicionesGrupo", TablaPosicion.class)
                .registerStoredProcedureParameter("idGrupoTabla", int.class, ParameterMode.IN)
                .setParameter("idGrupoTabla", idGrupo)
                .getResultList();

        return tablaPosiciones;
    }
    
}
