/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao.impl;
import Dao.IAlumno;
import bean.Alumno;
import static Common.Constantes.CONSULTAR_ALUMNO;
import static Common.Constantes.AGREGAR_ALUMNO;
import static Common.Constantes.MODIFICAR_ALUMNO;
import static Common.Constantes.ELIMINAR_ALUMNO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author deleo
 */
public class AlumnoImpl implements IAlumno {
    private final Connection conexion;
    
    public AlumnoImpl (Connection conn){
        this.conexion=conn;  
    }
    
    
    
    @Override
    public Alumno consultarAlumno(String username, int id){
        PreparedStatement consulta = null;
        ResultSet resultado = null;
        Alumno alumnoconsul=null;
        try{
            consulta = conexion.prepareStatement(CONSULTAR_ALUMNO);
            consulta.setString(1, username);
            consulta.setInt(2, id);
            resultado = consulta.executeQuery();
            while(resultado.next()){
                alumnoconsul.getApellidoMaterno();
            }
              
        }catch(Exception e ){
        }
      
    return null;
}
    @Override
    public Alumno  agregarAlumno(int id, String nombre, String apellidoPaterno, String apellidoMaterno){
        
        
    return null;
}
    
    @Override
    public Alumno  modificarAlumno(String username, String nombre, String apellidoPaterno, String apellidoMaterno, String estatus){
        
        return null;
    }
    @Override
    
    public Alumno  eliminarAlumno(int id, String estatus){
        
        return null;
    }
}
