package Domain;

// La clase Empleado extiende de Persona, lo que significa que hereda las propiedades y métodos de Persona.
public class Empleado extends Persona {
    // Atributo único de cada empleado, un identificador que se incrementa automáticamente.
    private int idEmpleado;

    // Atributo que guarda el sueldo del empleado.
    private double sueldo;

    // Atributo estático que lleva la cuenta de cuántos empleados han sido creados, y sirve para asignar los IDs.
    private static int contadorEmpleados;

    // Constructor de la clase Empleado. Recibe el nombre y el sueldo como parámetros.
    public Empleado(String nombre, double sueldo) {
        // Llama al constructor de la clase base (Persona) para inicializar el nombre.
        super(nombre);

        // Asigna un nuevo ID al empleado incrementando el contador estático.
        this.idEmpleado = ++Empleado.contadorEmpleados;

        // Establece el sueldo del empleado.
        this.sueldo = sueldo;
    }

    // Devuelve el ID del empleado.
    public int getIdEmpleado() {
        return idEmpleado;
    }

    // Devuelve el sueldo del empleado.
    public double getSueldo() {
        return sueldo;
    }

    // Permite cambiar el sueldo del empleado.
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Sobrescribe el método toString para proporcionar una representación en texto del objeto Empleado.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(idEmpleado); // Añade el ID del empleado al String.
        sb.append(", sueldo=").append(sueldo); // Añade el sueldo del empleado al String.
        sb.append(", ").append(super.toString()); // Llama al método toString de la clase Persona para añadir los atributos heredados.
        sb.append('}');
        return sb.toString(); // Devuelve la cadena de texto completa que representa al objeto Empleado.
    }
}
