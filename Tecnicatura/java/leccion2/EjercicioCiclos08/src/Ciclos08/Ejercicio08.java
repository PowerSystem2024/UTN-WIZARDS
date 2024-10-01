//CLASE 5
//Ejercicio Ciclos 08 con Scanner y JOptionPane
/*
Ejercicio 8 : Pedir un número N, y mostrar a todos los números del 1 al N.
*/
package Ciclos08;

import javax.swing.JOptionPane;


public class Ejercicio08 {
    public static void main(String[] args) {
  
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        int i = 1;
        while( i <= numero){
            JOptionPane.showMessageDialog(null, i);
            i++;
        }    
    }
}
