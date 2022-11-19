package com.example.gestorpracticas;

import models.Actividad;
import models.Empresa;
import models.Profesor;

import java.util.List;

public interface AlumnoDAO {
    List<Actividad> obtenerTotalActividades();
    Boolean crearActividad(Actividad actividad);
    Boolean modificarActivdad(Actividad actividad);
    Boolean eliminarActividad(Actividad actividad);
    Integer obtenerHorasDualRealizadas();
    Integer obtenerHorasFctRealizadas();
    Integer obtenerHorasDualTotal();
    Integer obtenerHorasFctTotal();
    Profesor obtenerInformacionProfesor();
    Empresa obtenerInformacionEmpresa();
}
