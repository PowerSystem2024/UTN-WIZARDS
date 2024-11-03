/*
Ejercicios 2: Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el orden inverso al introducidos.
 */
package arreglos_ejercicios_2;

import java.util.Scanner;

public class Arreglos_Ejercicios_2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los elementos del arreglo");
        for(int i = 0 ; i < 5; i++){
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for(int i=4; i>=0; i--){
            System.out.print(" "+numeros[i]);
        }
        System.out.println("\n");
    }
    
}
