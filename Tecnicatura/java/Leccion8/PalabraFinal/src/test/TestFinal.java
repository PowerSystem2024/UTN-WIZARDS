/*
Uso de la palabra Final
Esta palabra tiene diferentes significados dependiendo donde se aplique:
Variables: Evitar cambiar el valor que almacena la varirable
Metodo: Evita que se modifique la definicion o el comprtamiento de un metodo desde subclase (hija)
Clases: Evita que se creen clases hijas
Otras caracteristicas es que normalmente, cuando trabajamos con variables se combina con el modificador de 
acceso estatico para convertir una variable en una constante, es decir que no se puede modificar su valor,
el ejemplo de esto es la clase Math en la cual todos sus atributos son de tipo static y final, es por esto que la variable pi* 
se conoce como una constante.
 */
package test;

import domain.Persona;

/**

 */
public class TestFinal {
    public static void main(String[] args) {
        final int miDni  = 37966213;
        System.out.println("miDni = " + miDni);        
//        miDni = 303515864 
//        Persona.CONSTANTE_AQUI = 9; // NO se modifica
        System.out.println("Mi atributo contante es: "+Persona.CONSTANTE_AQUI);
        
        final Persona persona1 = new Persona();
//        persona1 = new Persona(); // no se puede asignar una nueva referencia
        persona1.setNombre("Ariel Betancud");
        System.out.println("persona1 nombre: "+persona1.getNombre());
        persona1.setNombre("Liliana");
         System.out.println("persona1 nombre: "+persona1.getNombre());
    }
    
}
