package cl.agile.core.services;

import cl.agile.core.dao.PrioridadDao;
import cl.agile.core.dao.TareaDao;
import cl.agile.core.entities.Prioridad;
import cl.agile.core.entities.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Roberto on 27-11-2017.
 */
@Service
public class TareaService {
    @Autowired
    private TareaDao tareaDao;

    @Transactional(readOnly = false)
    public Tarea guardar(Tarea tarea){
        return tareaDao.guardar(tarea);
    }

    @Transactional(readOnly = false)
    public void eliminar (Tarea tarea){
        tareaDao.eliminar(tarea);
    }

    public Tarea findById(Integer idTarea){
        return tareaDao.findById(idTarea);
    }

    public List<Tarea> traerTodos() {
        return tareaDao.traerTodo();
    }

}
