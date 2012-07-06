/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import datos.Bean;
import datos.Carrera;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samsung
 */
public class CarreraDAO implements OperacionesDAO {

    @Override
    public ArrayList select() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int insert(Bean bean) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Carrera carrera=(Carrera) bean;
        Connection conexion = DAOFactory.getConexion();
        PreparedStatement ps=null;
        try {
            ps=conexion.prepareStatement(SQL.insertarCarrera);
            ps.setString(1,carrera.getClave());
            ps.setString(2,carrera.getNombre());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CarreraDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean update(Bean bean) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Bean find(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
