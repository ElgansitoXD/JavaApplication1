/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.impl;
import Dao.IAlumno;
import bean.Alumno;
/**
 *
 * @author deleo
 */
public class AlumnoImpl implements IAlumno {
    @Override
    public Alumno consultarAlumno(String username, int id){
        String consultarAlumno = "SELECT * FROM T_ALUMNOS where username=? AND id=?";
    return null;
}
    @Override
    public Alumno  agregarAlumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno){
        String agregarAlumno = "insert into T_ALUMNOS (ID, NOMBRE, APELLIDO_PATERNO, APELLIDO_MATERNO) values (?,?,?,?)" ;
        
    return null;
}
    
    @Override
    public Alumno  modificarAlumno(int id){
        String modificarAlumno = ;
        return null;
    }
    @Override
    public Alumno  eliminarAlumno(){
        return null;
    }
}
