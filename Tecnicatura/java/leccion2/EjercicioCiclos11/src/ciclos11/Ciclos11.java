//CLASE 7
//Ejercicio 11: Diseñe un programa que muestre el procucto
//de los 10 primeros números impares
//Hacer con JOptionPane
package ciclos11;

import javax.swing.JOptionPane;


public class Ciclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i<=20; i+=2) { //El aumentos apunta a solo ir por los impares
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los números impares es: " + producto);
    }
}
