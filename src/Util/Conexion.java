/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import javax.naming.NamingException;
import javax.naming.InitialContext;



/**
 *
 * @author deleo
 */
public class Conexion {
    
    private Connection conn;
    
    public Conexion(String jndi) throws NamingException, SQLException {
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup(jndi);
        conn = ds.getConnection();
    
    }
    
    public PreparedStatement prepareStatement(String query) throws SQLException{
        if (conn == null || conn.isClosed()) {
            throw new SQLException("La conexion no existe o esta cerrada");
        }
        return conn.prepareStatement(query);
    
    }
    
    public void close () throws SQLException {
        if (conn == null || conn.isClosed()) {
            throw new SQLException("La conexion no existe o esta cerrada");
        }
        conn.close();
    }
    
    public Connection getConn() {
        return conn;
    }
    
}
