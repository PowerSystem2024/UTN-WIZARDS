//Clase 4
package Operaciones;

public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //El construcotr es un metodo especial
    public Aritmetica(){ //Constructor 1 Vacio
        System.out.println("Se esta ejecutando contructor numero uno");
    }
    
    //Estamos viendo lo que se llama sobrecarga de constructores
    public Aritmetica(int a, int b){ // Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando este constructor numero dos");
    }
            
    //Metodo
    public void sumarNumeros(){
        int resutaldo = a + b;
        System.out.println("resultado = " + resutaldo);
    }
    
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b;
    }

    int sumarConArgumentos(int a, int b) {
        this.a = a;
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
}
