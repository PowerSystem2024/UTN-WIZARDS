//Clase 4
package Clases;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1;
        persona1 = new Persona(); //Llamamos al constructor "istancias"
        persona1.nombre = "Ariel"; //El valor hexadecimal normalmente comienza con 0x
        persona1.apellido = "Betancud";
        persona1.obtenerInformacion();
        
        //Creamos un nuevo objeto
        Persona persona2 = new Persona();
        System.out.println("persona2 = "+ persona2);
        System.out.println("persona2 = "+ persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "osvaldo";
        persona2.apellido = "Giordanini";
        persona2.obtenerInformacion();
        
    }
}