package cl.agile.core.controller;

import cl.agile.core.dao.PrioridadDao;
import cl.agile.core.entities.Prioridad;
import cl.agile.core.entities.Tarea;
import cl.agile.core.services.PrioridadService;
import cl.agile.core.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Roberto on 28-11-2017.
 */
@Controller
@RequestMapping(value="/tarea")
public class TareaController {
    @Autowired
    private PrioridadService prioridadService;
    @Autowired
    private TareaService tareaService;

    @RequestMapping(value = "/guardar")
    public ResponseEntity<String[]> guardar(@RequestParam("nombretarea") String nombretarea,
                                            @RequestParam("descripcion") String descripcion,
                                            @RequestParam("idprioridad") Integer idprioridad ){
        Tarea tarea = new Tarea();
        tarea.setNombre(nombretarea);
        tarea.setDescripcion(descripcion);
        tarea.setIdprioridad(prioridadService.findById(idprioridad));
        tareaService.guardar(tarea);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update")
    public ResponseEntity<String[]> guardar(@RequestParam("idtarea") Integer idtarea,
                                            @RequestParam("nombretarea") String nombretarea,
                                            @RequestParam("descripcion") String descripcion,
                                            @RequestParam("idprioridad") Integer idprioridad ){

        Tarea tarea = tareaService.findById(idtarea);
        tarea.setNombre(nombretarea);
        tarea.setDescripcion(descripcion);
        tarea.setIdprioridad(prioridadService.findById(idprioridad));
        tareaService.guardar(tarea);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/eliminar")
    public ResponseEntity<Integer[]> eliminar(@RequestParam(value = "idtarea") Integer idtarea){
        Tarea tarea= tareaService.findById(idtarea);
        tareaService.eliminar(tarea);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value ="/traerTodo")
    @ResponseBody
    public List<Tarea> traerTodo() {
        return tareaService.traerTodos();
    }

}
