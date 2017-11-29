package cl.agile.core.controller;

import cl.agile.core.entities.Prioridad;
import cl.agile.core.services.PrioridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Roberto on 27-11-2017.
 */
@Controller
@RequestMapping(value="/prioridad")
public class PrioridadController {

    @Autowired
    private PrioridadService prioridadService;

    @RequestMapping(value = "/guardar")
    public ResponseEntity<String[]> guardar(@RequestParam(value = "descripcion") String descripcion){

        Prioridad prioridad = new Prioridad();
        prioridad.setDescripcion(descripcion);
        prioridadService.guardar(prioridad);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/update")
    public ResponseEntity<String[]> guardar(@RequestParam("idprioridad") Integer idprioridad,
                                            @RequestParam(value = "descripcion") String descripcion){

        Prioridad prioridad = prioridadService.findById(idprioridad);
        prioridad.setDescripcion(descripcion);
        prioridadService.guardar(prioridad);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/eliminar")
    public ResponseEntity<Integer[]> eliminar(@RequestParam(value = "idprioridad") Integer idprioridad){

        Prioridad prioridad = prioridadService.findById(idprioridad);
        prioridadService.eliminar(prioridad);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value ="/traerTodo")
    @ResponseBody
    public List<Prioridad> traerTodo() {
        return prioridadService.traerTodos();
    }
}
