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
    public Alumno consultarAlumno(String username, int id);
    public Alumno agregarAlumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno);
    public Alumno modificarAlumno(String username, String nombre, String apellidoPaterno, String apellidoMaterno, String estatus);
    public Alumno eliminarAlumno(int id, String estatus);
    
}
