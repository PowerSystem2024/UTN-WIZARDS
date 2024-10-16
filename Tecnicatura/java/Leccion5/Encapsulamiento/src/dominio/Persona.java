//CLASE 7
package dominio;


public class Persona {
    //Atributos
    private String nombre;
    private double sueldo;
    private boolean elimminado;
    
    //Constructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.elimminado = eliminado;
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

    public boolean isElimminado() {
        return elimminado;
    }

    public void setElimminado(boolean elimminado) {
        this.elimminado = elimminado;
    }
    
    // CLASE 8
    
    public String toString(){ //Convierte en una cadena cada atributo
        return "Persona [ nombre: "+this.nombre+
                ", sueldo: "+this.sueldo+
                ", eliminado: "+this.elimminado+" ]";
    }
    
}
