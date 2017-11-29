/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.agile.core.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Roberto
 */
@Entity
@Table(name = "prioridad")
@NamedQueries({
    @NamedQuery(name = "Prioridad.findAll", query = "SELECT p FROM Prioridad p")
    , @NamedQuery(name = "Prioridad.findByIdprioridad", query = "SELECT p FROM Prioridad p WHERE p.idprioridad = :idprioridad")
    , @NamedQuery(name = "Prioridad.findByDescripcion", query = "SELECT p FROM Prioridad p WHERE p.descripcion = :descripcion")})
public class Prioridad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprioridad")
    private Integer idprioridad;
    @Size(max = 500)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprioridad")
    @JsonIgnore
    private List<Tarea> tareaList;

    public Prioridad() {
    }

    public Prioridad(Integer idprioridad) {
        this.idprioridad = idprioridad;
    }

    public Integer getIdprioridad() {
        return idprioridad;
    }

    public void setIdprioridad(Integer idprioridad) {
        this.idprioridad = idprioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Tarea> getTareaList() {
        return tareaList;
    }

    public void setTareaList(List<Tarea> tareaList) {
        this.tareaList = tareaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprioridad != null ? idprioridad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prioridad)) {
            return false;
        }
        Prioridad other = (Prioridad) object;
        if ((this.idprioridad == null && other.idprioridad != null) || (this.idprioridad != null && !this.idprioridad.equals(other.idprioridad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cl.agile.core.entities.Prioridad[ idprioridad=" + idprioridad + " ]";
    }
    
}
