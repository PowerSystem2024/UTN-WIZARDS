package Domain;

// Clase base que define los atributos comunes que heredarán las subclases (como Cliente y Empleado).
public class Persona {
    // Atributos protegidos, accesibles por las clases que heredan de Persona.
    protected String nombre;
    protected char genero; // 'M' o 'F' por ejemplo.
    protected int edad;
    protected String direccion;

    // Constructor vacío: permite crear un objeto de Persona sin inicializar ningún atributo.
    public Persona() {
        // Constructor vacío, no hace nada aquí pero es útil cuando se quiere crear objetos sin pasar parámetros.
    }

    // Constructor que inicializa solo el nombre.
    public Persona(String nombre) { // Constructor 2
        this.nombre = nombre; // Asigna el nombre pasado como parámetro al atributo de la clase.
    }

    // Constructor completo: inicializa todos los atributos de la clase Persona.
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;         // Asigna el nombre pasado como parámetro.
        this.genero = genero;         // Asigna el género pasado como parámetro.
        this.edad = edad;             // Asigna la edad pasada como parámetro.
        this.direccion = direccion;   // Asigna la dirección pasada como parámetro.
    }

    // Métodos 'setter' permiten modificar el valor de los atributos después de crear el objeto.

    // Modifica el nombre de la persona.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Modifica el género de la persona.
    public void setGenero(char genero) {
        this.genero = genero;
    }

    // Modifica la edad de la persona.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Modifica la dirección de la persona.
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Sobrescribe el método toString para devolver una representación en texto del objeto Persona.
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +        // Añade el nombre al String de salida.
                ", genero=" + genero +             // Añade el género al String de salida.
                ", edad=" + edad +                 // Añade la edad al String de salida.
                ", direccion='" + direccion + '\'' + // Añade la dirección al String de salida.
                '}';                               // Cierra la representación del objeto Persona.
    }
}
