package com.example.gestorpracticas;

import models.Actividad;
import models.Empresa;
import models.Profesor;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AlumnoDAOHib implements AlumnoDAO {
    @Override
    public List<Actividad> obtenerTotalActividades(Integer id) {
        List<Actividad> actividadesRealizadas = new ArrayList<>();

        try (var s = HibernateUtil.getSessionFactory().openSession()) {
            var q = s.createQuery("From Actividad as e WHERE e.alumno = :id");
        }
        return null;
    }

    @Override
    public Boolean crearActividad(Actividad actividad) {
        try (var s = HibernateUtil.getSessionFactory().openSession()) {
            Transaction t = s.getTransaction();
            s.persist(actividad);
            t.commit();
            return true;
        }
    }

    @Override
    public Boolean modificarActividad(Actividad actividad) {
        try (var s = HibernateUtil.getSessionFactory().openSession()) {
            Transaction t = s.getTransaction();
            s.update(actividad);
            t.commit();
            return true;
        }
    }

    @Override
    public Boolean eliminarActividad(Actividad actividad) {
       try (var s = HibernateUtil.getSessionFactory().openSession()) {
           Transaction t = s.getTransaction();
           s.delete(actividad);
           t.commit();
           return true;
       }
    }
}
