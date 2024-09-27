//CLASE 5
package Operaciones;


public class PruebaAritmetica {
    public static void main(String[] args) {
        //Clase Aritmética: Creamos un objeto
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        aritmetica1.sumarNumeros();    
        
        //Clase Aritmética: Creamos un método, recorremos con Debbug
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
        //Paso de argumentos a un método
        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("Resultado usando argumentos = " + resultado);
    }   
}
