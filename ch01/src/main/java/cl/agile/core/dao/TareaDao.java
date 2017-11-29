package cl.agile.core.dao;

import cl.agile.core.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Created by Roberto on 27-11-2017.
 */
@Repository
public class TareaDao extends DaoUtilities {
    @Autowired
    private EntityManager manager;


    public Tarea guardar(Tarea tarea){
        if(tarea.getIdtarea()==null){
            getEntityManager().persist(tarea);
        }else{
            getEntityManager().merge(tarea);
        }
        return tarea;
    }

    public void eliminar(Tarea tarea){
        getEntityManager().remove(tarea);
    }

    public Tarea findById(Integer idTarea){
        Tarea tarea = manager.find(Tarea.class, idTarea);
        if(tarea ==null){
            throw new EntityNotFoundException("Can't find Prioridad for ID "
                    + idTarea);
        }
        return tarea;
    }

    public List<Tarea> traerTodo() {
        return getEntityManager().createNamedQuery("Tarea.findAll", Tarea.class).getResultList();
    }

}
