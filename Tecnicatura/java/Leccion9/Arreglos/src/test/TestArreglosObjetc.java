/*

 */
package test;

import domain.Persona;

/**

 */
public class TestArreglosObjetc {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        personas[0] = new Persona("Ariel");
        personas[1] = new Persona("Osvaldo");
        System.out.println("personas 0 = " + personas [0]);
        System.out.println("personas 1 = " + personas [1]);
    }
    
}