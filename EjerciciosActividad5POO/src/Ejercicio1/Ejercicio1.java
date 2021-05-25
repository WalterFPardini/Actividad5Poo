/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Joni64
 */
public class Ejercicio1 {

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para realizar la division (primero el numerador, segundo el denominador): ");
        a = in.nextInt();
        b = in.nextInt();

        //a = 8;
        //b = 0;
        try {
            System.out.println("El resultado es : " + dividir(a, b));
        } catch (ArithmeticException e) {
            System.out.println("El resultado es " + 0);
        }

    }

}
