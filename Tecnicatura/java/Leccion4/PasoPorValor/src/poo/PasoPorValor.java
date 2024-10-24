//CALSE 6
package poo;


public class PasoPorValor {
    public static void main(String[] args) {
        var valorX = 20;
        System.out.println("ValorX = " + valorX);
        cambioValor(valorX); //Solo le enviamos una copia
        System.out.println("Valor = " + valorX);
    }
    
    public static void cambioValor(int arg1){ //Parametro por valor
        System.out.println("arg1 = " + arg1);
        arg1 = 15;
    }
}
