//CLASE 11
/*
Ejercicio 3: Leer 5 números por teclado, almacenarlos en 
un arreglo y a continuación realizar la media de los
números positivos, la media de los negativos y contar el
número de ceros.
*/
package arreglos_ejercicio_3;

import java.util.Scanner;


public class Arreglos_Ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero[] = new float[5];
        float negativos = 0, positivos =0, mediaNegativos, mediaPositivos;
        int conteo0 = 0, conteo_negativos = 0, conteo_positivos = 0;
        
        System.out.println("Guardamos los elementos del arreglo: ");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite un numero: ");
            numero[i] = entrada.nextFloat();
            if(numero[i]>0){
                positivos += numero[i];
                conteo_positivos++;
            }
            else if(numero[i] < 0){
                negativos += numero[i];
                conteo_negativos++;
            }
            else{
                conteo0++;
            }
            
        }
        
        if (conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros positivos");
        }
        else{
            mediaPositivos = positivos/conteo_positivos;
            System.out.println("\nLa media de los números positivos es: "+mediaPositivos);
        }
        
        if (conteo_negativos == 0){
            System.out.println("\nNo se puede sacar la media de los núemros negativos");
        }
        else{
            mediaNegativos = negativos/conteo_negativos;
            System.out.println("La media de los números negativos es: "+mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo0);
        //Ingresar: 2, -5, 6, -2, 0
    }
}
