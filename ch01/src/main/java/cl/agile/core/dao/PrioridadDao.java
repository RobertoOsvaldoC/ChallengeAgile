package cl.agile.core.dao;

import cl.agile.core.entities.Prioridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Created by Roberto on 27-11-2017.
 */
@Repository
public class PrioridadDao extends DaoUtilities{
    @Autowired
    private EntityManager manager;

    public Prioridad guardar(Prioridad prioridad){
        if(prioridad.getIdprioridad()==null){
            getEntityManager().persist(prioridad);
        }else{
            getEntityManager().merge(prioridad);
        }
        return prioridad;
    }

    public void eliminar(Prioridad prioridad){
        getEntityManager().remove(prioridad);
    }

    public Prioridad findById(Integer idPrioridad){
        Prioridad prioridad = manager.find(Prioridad.class, idPrioridad);
        if(prioridad ==null){
            throw new EntityNotFoundException("Can't find Prioridad for ID "
                    + idPrioridad);
        }
        return prioridad;
    }

    public List<Prioridad> traerTodo() {
        return getEntityManager().createNamedQuery("Prioridad.findAll", Prioridad.class).getResultList();
    }

}
