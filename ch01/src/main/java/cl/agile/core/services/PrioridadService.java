package cl.agile.core.services;

import cl.agile.core.dao.PrioridadDao;
import cl.agile.core.entities.Prioridad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.beans.Transient;
import java.util.List;

/**
 * Created by Roberto on 27-11-2017.
 */
@Service
public class PrioridadService {
    @Autowired
    private PrioridadDao prioridadDao;

    @Transactional(readOnly = false)
    public Prioridad guardar(Prioridad prioridad){

        return prioridadDao.guardar(prioridad);
    }

    @Transactional(readOnly = false)
    public void eliminar(Prioridad prioridad){
        prioridadDao.eliminar(prioridad);
    }

    public Prioridad findById(Integer id){
        return prioridadDao.findById(id);
    }

    public List<Prioridad> traerTodos() {
        return prioridadDao.traerTodo();
    }

}
