/*
Ejercicio 12: Pedir un Numero y calcualr su factorial
Hacerlo con las dos clases, Scanner y JOptionPane
 */

// import java.util.Scanner;
package ciclos12;

import javax.swing.JOptionPane;


public class Ciclos12 {
    public static void main(String [ ] args){
            //Scanner entrada = new Scanner(Sysyem.in);
            long factorial = 1;
            //System.out.println("Digite un numero: ");
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número:  "));
            for(int i=1; i<=numero;i++){
                       factorial *=i;
        }
            //System.out.println("\n El factorial del numero ingresa es: "+factorial);
            JOptionPane.showMessageDialog(null, "El factirial del numero ingresado es : " +factorial);
    }
}
