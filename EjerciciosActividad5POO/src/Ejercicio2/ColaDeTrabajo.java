/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.ArrayList;

/**
 *
 * @author Joni64
 */
public class ColaDeTrabajo {
    String nombre;
    boolean lista;
    ArrayList <Trabajo> colaTrabajos = new ArrayList <Trabajo>();
    
    public ColaDeTrabajo (String nombre, boolean lista){
        this.nombre = nombre;
        this.lista = lista;
    }
    
    public void sacar() throws SinTrabajoEnColaException,NoListaException{
    
        if (!lista){
         throw new NoListaException(this.nombre,colaTrabajos.size());
        }
        if (colaTrabajos.isEmpty()){
         throw new SinTrabajoEnColaException(this.nombre);
        }
        colaTrabajos.remove(colaTrabajos.size()-1); 
    }
    
    public void agregar(Trabajo t){
    
        colaTrabajos.add(t);
        
    }
    
    public void setLista(boolean l){
        this.lista = l;
    }
    
}
