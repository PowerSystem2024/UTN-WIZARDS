package Test;

import Domain.Cliente; // Importa la clase Cliente desde el paquete Domain.
import Domain.Empleado; // Importa la clase Empleado desde el paquete Domain.
import java.util.Date; // Importa la clase Date para manejar fechas.

public class TestHerencia {
    // Método principal, punto de entrada de la aplicación.
    public static void main(String[] args) {
        // Crea un nuevo objeto Empleado con el nombre "Wanda" y un sueldo de 700000.
        Empleado empleado1 = new Empleado("Irupé", 700000);

        // Imprime la representación en texto del objeto empleado1 utilizando el método toString.
        System.out.println("empleado1: " + empleado1);

        // Crea una nueva instancia de Date que representa la fecha y hora actuales.
        Date fecha1 = new Date();

        // Crea un nuevo objeto Cliente con la fecha actual, estatus VIP (true), nombre "Wanda",
        // género femenino ('F'), edad 25, y dirección "Calle falsa 123".
        Cliente cliente1 = new Cliente(fecha1, true, "Irupé", 'F', 25, "Calle cualquiera 12");

        // Imprime la representación en texto del objeto cliente1 utilizando el método toString.
        System.out.println("cliente1: " + cliente1);
    }
}
