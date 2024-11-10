//CLASE USUARIO
//Atributos de la clase (Caracteristicas)
//Métodos de la clase (Acciones)
package domain;


public class Usuario { //Clase Usuario (PascalCase)
    //Atributos del usuario (Caracteristicas)
    private String nombre;
    private String contraseña;
    private int nivelUsuario;
    private String dni;
    
    //Constructor (métodos de la clase)
    public Usuario(String nombre, String contraseña, int nivelUsuario, String dni) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.nivelUsuario = nivelUsuario;
        this.dni = dni;
    }
    
    //GETTERS Y SETTERS
    
    //Nombre del Usuario
    //Obtiene informacion del atributo
    public String getNombre() {
        return this.nombre;
    }
    //Modifica el valor del atributo 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Contraseña del Usuario
    //Obtiene informacion del atributo
    public String getContraseña() {
        return this.contraseña;
    }
    //Modifica el valor del atributo
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    //Nivel del usuario
    //Obtiene informacion del atributo
    public int getNivelUsuario() {
        return this.nivelUsuario;
    }
    //Modifica el valor del atributo
    public void setNivelUsuario(int nivelUsuario) {
        this.nivelUsuario = nivelUsuario;
    }

    //dni del Usuario
    //Obtiene informacion del atributo
    public String getDni() {
        return this.dni;
    }
    //Modifica el valor del atributo
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    //toString
    //Para poder ver y accerder todo lo que es la informacion de los atributos, el modificador de 
    //acceso de ser de tipo public, tipo String
    @Override
    public String toString() { //Convierte en una cadena cada atributo
        return "Usuario \n"+
                "nombre: " + this.nombre+"\n"+
                "contraseña: " + this.contraseña+"\n"+
                "nivel usuario: " + this.nivelUsuario+"\n"+
                "DNI : " + this.dni;
    }
    
    
}
