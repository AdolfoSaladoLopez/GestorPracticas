package com.example.gestorpracticas;

import models.Actividad;
import models.Alumno;
import models.Empresa;

import java.util.List;

public interface ProfesorDAO {
    List<Alumno> obtenerTotalAlumnosAsignados();
    Alumno obtenerAlumnoId(Integer id);
    List<Actividad> obtenerActividadesAlumno(Alumno alumno);
    Boolean crearAlumno(Alumno alumno);
    Boolean crearEmpresa(Empresa empresa);
    Boolean eliminarAlumno(Alumno alumno);
    Boolean eliminarEmpresa(Empresa empresa);
    Boolean modificarAlumno(Alumno alumno);
    Boolean modificarEmpresa(Empresa empresa);




}
