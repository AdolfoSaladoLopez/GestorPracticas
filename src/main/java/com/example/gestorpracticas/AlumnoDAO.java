package com.example.gestorpracticas;

import models.Actividad;
import models.Alumno;
import models.Empresa;
import models.Profesor;

import java.util.List;

public interface AlumnoDAO {
    List<Actividad> obtenerTotalActividades(Integer id);
    Boolean crearActividad(Actividad actividad);
    Boolean modificarActividad(Actividad actividad);
    Boolean eliminarActividad(Actividad actividad);

}
