//Clase 4
package Ciclos06;

import java.util.Scanner;

/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar 
la suma de todos los números introducidos.
*/

public class Ciclos06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero , suma = 0;
        do{
            System.out.println("Digite un número: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma+= numero;
        }while(numero != 0);
        System.out.println("La suma de todos los número ingresado es: "+suma);
    }
}
