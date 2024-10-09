/*

 */
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 =  new Persona ("Osvaldo", 57.000, false);
        System.out.println("persona1 su nombre es: " + persona1.getNombre());
        //Modificar a traves de los metodos
        persona1.setNombre("Juan Ignacio");
        //persona1.nombre = "Juan Ignacio"; // Ya no se puede utilizar
        System.out.println("persona1 su nombre modificado: " + persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo:" + persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: " + persona1.isEliminado());
        //Tarea: Crear otro objeto de tipo persona, asignar valores de manera inicial 
        //y imprimir, luego modificar su valores y volver  a imprimir
    }
}
