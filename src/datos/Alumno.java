/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author Samsung
 */
public class Alumno extends Persona{
    
    Persona objeto=new Persona();
    
    private String matricula;

    public Alumno(){
        
    }
    
    public Alumno(String matricula){
        this.matricula=matricula;
        this.setMatricula(matricula);
    }
    
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula.toUpperCase();
    }
    
}
