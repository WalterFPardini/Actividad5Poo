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
public class FullDataBagException extends Exception{
    
    private String nombre;
    
    public FullDataBagException(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String getMessage(){
        return ("La bolsa " + nombre + " está llena.");
    }
}
