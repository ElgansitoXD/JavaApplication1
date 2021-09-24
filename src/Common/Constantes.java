/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Common;

/**
 *
 * @author deleo
 */
public class Constantes {
    public static final String DATA_SOURCE = "Prueba2"; 
    
    // CONSTANTES PARA IMP ALUMNO
    public static final String ELIMINAR_ALUMNO = "UPDATE T_ALUMNOS SET estatus = 'Baja' WHERE id = ?";
    public static final String MODIFICAR_ALUMNO = "UPDATE T_ALUMNOS SET username = ?, nombre = ?, apellido_paterno = ?, apellido_materno = ?, estatus = ?";
    public static final String AGREGAR_ALUMNO = "insert into T_ALUMNOS (id, nombre, apellido_paterno, apellido_materno) values (?,?,?,?)" ;
    public static final String CONSULTAR_ALUMNO = "SELECT * FROM T_ALUMNOS where username=? OR id=?";
    
}
