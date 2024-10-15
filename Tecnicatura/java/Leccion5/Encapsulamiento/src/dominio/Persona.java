/*

 */
package dominio;

/**

 */
public class Persona {
    //Atributos
    private String nombre; //String nombre no hace falta que pongamos private
    private double sueldo;
    private boolean eliminado;
    
    //Costructor 
    public Persona(String nombre, double _sueldo, boolean eliminado){
        this.nombre =  nombre;
        this.sueldo = _sueldo;
        this.eliminado = eliminado;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }
    
    
}
