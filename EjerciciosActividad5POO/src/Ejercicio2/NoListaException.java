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
public class NoListaException extends Exception {
    
    private String nombre;
    private long cantidadTrabajos;
    
    public NoListaException(String nom, long s){
        nombre = nom;
        cantidadTrabajos = s;
    }
    
    @Override
    public String getMessage(){
        return "La cola de Trabajo : " + nombre + " no esta disponible. Cantidad de trabajos a procesar : " + cantidadTrabajos;
    }
    
}
