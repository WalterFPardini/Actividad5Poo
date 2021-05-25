/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author Joni64
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object p = new Object(); //creo el objeto p
        Object o = new Object();// creo el objeto o
        DataBag bolsa1 = new DataBag("1", 1); //creo una bolsa llamada "1" con la capacidad de un maximo de 1 elemento.
        try {
            bolsa1.remove(); //trato de remover un elemento
        } catch (EmptyDataBagException e) {
            System.out.println("Excepcion: " + e.getMessage());// si no se puede, tirara la excepcion que esta vacia
        }
        try {
            bolsa1.add(p);// trato de añadir el objeto p
            System.out.println("Se añadio el objeto con exito");
            bolsa1.add(o); // trato de añadir el objeto o
            System.out.println("Se añadio el objeto con exito");
        } catch (FullDataBagException ex) {
            System.out.println("Excepcion: " + ex.getMessage());
        }// si no se puede tirara la excepcion que esta llena
        try {
            bolsa1.remove();// trato de remover un objeto
            System.out.println("Se removio el objeto con exito");
            bolsa1.remove();// trato de remover un objeto
            System.out.println("Se removio el objeto con exito");
        } catch (EmptyDataBagException e) {
            System.out.println("Excepcion: " + e.getMessage());
        }// si no se puede tirara la excepcion de que esta vacia
    }
}
