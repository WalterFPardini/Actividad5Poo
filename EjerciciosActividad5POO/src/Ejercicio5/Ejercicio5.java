/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Joni64
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo c = new Circulo();

        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Ingresar el radio del circulo: ");
            c.setRadio(in.nextDouble());

            System.out.println("El area del circulo es " + c.area() + "\n" + "La longitud del circulo es " + c.longitud());
        } catch (InputMismatchException e) {
            System.out.println("El radio ingresado no es del tipo double. Intente nuevamente (Utilizar la coma en lugar del punto para los double).");
            
        }
    }

}
