//CLASE 5
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        var a = 10; //Variable locales
        int b = 7; //MEmoria Stack
        miMetodo(); //Llamamos el metodo nuevo
        //Clase Aritmética: Creamos un objeto
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();    
        
        //Clase Aritmética: Creamos un método, recorremos con Debbug
        int resultado = aritmetica1.sumarConRetorno(); //Para almacenar un objeto o los atributos se utiliza la menoria heap
        System.out.println("resultado = " + resultado);
        
        //Paso de argumentos a un método
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
        
        // CLASE 6
        System.out.println("aritmetica1 a: "+aritmetica1.a);
        System.out.println("aritmetica1 b: "+aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8); //Nuevo objeto que trabaja co nel constructor 2
        System.out.println("aritmentica2 = " + aritmetica2.a);
        System.out.println("aritmentica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca utilizar esto, no se debe ahcer
        //System.gc(); método para limpiar residuos, es pesado, no utilizar
    }   
    
    public static void miMetodo(){
        //int a = 10; //Una variable esta limiatada
        System.out.println("Aqui hay otro método");
    }
}
