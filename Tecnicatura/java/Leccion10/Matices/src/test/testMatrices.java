/*

 */
package test;

import domain.Persona;


public class testMatrices {
    public static void main(String[] args){
        int edades [] [] = new int[3] [2];
        System.out.println("edades = " + edades);
        edades [0] [0] = 5; //Lenado manual
        edades [0] [1] = 7; // Es una diferente columna
        edades [1] [0] = 8;
        edades [1] [1] = 4;
        edades [2] [0] = 2; // Terminamos la tarea
        edades [2] [1] = 9;
        
        System.out.println("edades 0-0 = " + edades [0] [0]);
        System.out.println("edades 0-1 = " + edades [0] [1]);
        System.out.println("edades 1-0 = " + edades [1] [0]);
        System.out.println("edades 1-1 = " + edades [1] [1]);
        System.out.println("edades 2-0 = " + edades [2] [0]);
        System.out.println("edades 2-1 = " + edades [2] [1]);
        System.out.println("Recorremos la matriz atraves de ciclo for");
        for (int fila = 0; fila < edades.length; fila++) {
            for (int col = 0; col < edades [fila] .length; col++) {
                System.out.println("edades" +fila+" - "+col+": "+edades[fila][col]);
            }            
        }
        //Sintaxis clasica
        //String frutas[ ][ ] = new String[3] [2];
        //Sintaxi simplificada
        
        String frutas[] [] = {{"Limon", "Pomero"},{"Ciruela", "Kiwi"}, {"Banana", "Manzana"}};
        
        for (int i = 0; i < edades.length; i++){
            for(int j = 0; j < edades[i].length; j++){
                System.out.println("edades "+i+"-"+j+": "+edades[i] [j]);
            }
        }
        //Creamos una matriz de objetos
        Persona personas[] [] = new Persona[2] [3];
        //Siginamos valorre a la matriz
        personas[0] [0] = new Persona("Ariel");
        personas[0] [1] = new Persona("osvaldo");
        personas[0] [0] = new Persona("Ariel");
        
        
    }
    public static void imprimir(object)
}
