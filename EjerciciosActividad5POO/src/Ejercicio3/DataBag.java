/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Joni64
 */
public class DataBag {
    String nombre;
    private int max;
    private ArrayList <Object> bolsa = new ArrayList <Object>();
    
    public DataBag(String nombre, int max){
        this.nombre = nombre;
        this.max = max;
    }
    
    public void setMax ( int max){
        this.max = max;
    }
    
    public int getMax(){
        return max;
    }
    public void add(Object o)throws FullDataBagException {
        if (bolsa.size() == max){
            throw new FullDataBagException (this.nombre);
        }
        bolsa.add(o);
    }
    
    public void remove()throws EmptyDataBagException{
        if(bolsa.isEmpty()){
            throw new EmptyDataBagException(this.nombre);
        }
        bolsa.remove(bolsa.size() - 1);
    }
}
