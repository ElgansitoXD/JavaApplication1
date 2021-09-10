/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import bean.Alumno;

/**
 *
 * @author deleo
 */
public interface IAlumno {
    public Alumno  consultarAlumno();
    public Alumno  agregarAlumno();
    public Alumno  modificarAlumno();
    public Alumno  eliminarAlumno();
    
}
