/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author Joni64
 */
public class SinTrabajoEnColaException extends Exception{
    private String nombre;
    
    public SinTrabajoEnColaException (String nom){
        nombre = nom;
    }
    
    @Override
    public String getMessage(){
        return "La cola " + nombre + " no tiene trabajos para procesar.";
    }
}
