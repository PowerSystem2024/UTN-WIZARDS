//Clase 4
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Metodo
    public void sumarNumeros(){
        int resutaldo = a + b;
        System.out.println("resultado = " + resutaldo);
    }
    
    //CLASE 5
    //Clase Aritmética: Creamos un método, recorremos con Debbug
    public int sumarConRetorno(){
        //int resutlado = a+ b;
        return a + b; //podemos poner una exprecion
    }
    
    //Paso de argumentos a un método
    public int sumarConArgumentos(int arg1, int arg2){ //Firma del metodo
        /*
        a = arg1; //Atributo = variable
        b = arg2;
        //return a + b;
        //Un método llamando a otro método
        return sumarConRetorno();
        */
        
        //Operador this
        this.a = arg1; //El argumento "a" se asigna al atributo this.a
        this.b = arg2;
        return this.sumarConRetorno();
    }
    
    //CLASE 6
    //El constructor es un método especial, 1(construye un objeto), 2(reserva un espacio de memoria), 3(inicializa atrbutos de la clase)
    public Aritmetica (){ //Constructor 1
        System.out.println("Se esta ejecuntando este constructor número uno");
    }
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica (int a, int b){ //Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecuntando este constructor número dos");
    }
    
    
}
