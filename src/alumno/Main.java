/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alumno;

import DAO.CarreraDAO;
import datos.Carrera;
import datos.Persona;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona objeto2 = new Persona("Juan","Solana","Alba","9755604");
        Carrera objeto= new Carrera("ISEI", "Sistemas Estrategicos");
        JOptionPane.showMessageDialog(null,"Nombre: "+ objeto2.getNombre() + 
                "\nApellido: " + objeto2.getApellidoP()+"\nCarrera: "+ objeto.getClave()
                + "\nTelefono: " + objeto2.getTelefono());
        
        CarreraDAO carreraDAO=new CarreraDAO();
        Carrera carrera=new Carrera("ISEI","Sistemas");
        carreraDAO.insert(carrera);
    }
}
