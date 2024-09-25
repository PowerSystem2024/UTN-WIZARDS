package caja; //Package

public class Caja { // Case publica caja
    //Atributos (Caracteristicas)
    int ancho;
    int alto;
    int profundo;
    //Métodos yy contructores (acciones)
    public Caja() {//Constructor 1 = vacio
    }
    //Constructor con parametros
    public Caja(int ancho, int alto, int profundo) { //Constructor 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int calcularVolumen() { //Metodo para calcular
        return ancho * alto * profundo;
    }
}