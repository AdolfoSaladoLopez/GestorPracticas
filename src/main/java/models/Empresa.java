package models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
public class Empresa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String correo;
    private String responsable;
    private String observaciones;

    @OneToMany(mappedBy = "alumno", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Alumno> alumnos;

    public Empresa() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", responsable='" + responsable + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }
}
