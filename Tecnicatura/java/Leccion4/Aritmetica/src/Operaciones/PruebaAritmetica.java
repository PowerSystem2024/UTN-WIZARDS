//CLASE 5
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //Variable locales
        int b = 7; //MEmoria Stack
        miMetodo(); //Llamamos el metodo nuevo
        //Clase Aritmética: Creamos un objeto
        Aritmetica aritmetica1 = new Aritmetica(); //Llamando al constructor, lo que hace reserva espacio de memoria 
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();    
        //PAra almacenar un objeto o los atributos se utiliza la memoria heap
        //Clase Aritmética: Creamos un método, recorremos con Debbug
        int resultado = aritmetica1.sumarConRetorno(); //Para almacenar un objeto o los atributos se utiliza la menoria heap
        System.out.println("resultado = " + resultado);
        
        //Paso de argumentos a un método
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
        
        // CLASE 6
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        // Creamos otro objeto con el constructor 2
        Aritmetica aritmetica2 = new Aritmetica(5, 8); //Nuevo objeto que trabaja co nel constructor 2
        System.out.println("aritmentica2 = " + aritmetica2.a);
        System.out.println("aritmentica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca utilizar esto, no se debe ahcer
        //System.gc(); método para limpiar residuos, es pesado, no utilizar
        Persona persona = new Persona("Ariel", "Bentacud");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona nombre: " + persona.apellido);
    }   
    
    //Creamos un nuevo metodo
    public static void miMetodo(){
        //int a = 10; //Una variable esta limiatada
        System.out.println("Aqui hay otro método");
    }
}

//CALSE 7
// Creamos una nueva clase
class Persona{
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido) { //Constructor
        super(); //Llamada al constructor de la clase Padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: " +this);
    }
}

class Imprimir{
    public Imprimir(){
        super(); //el constructor de la clase padre, para reservar memoria
    }
    
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: " + persona);
        System.out.println("Imprimir del objeto actual (this): " + this);
    }
}