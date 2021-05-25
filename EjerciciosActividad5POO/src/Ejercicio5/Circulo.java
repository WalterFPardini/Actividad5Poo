/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author Joni64
 */
public class Circulo {
    private static final double PI = 3.14;
    private double radio;
    
    public Circulo(){
        
    }
    
    public void setRadio (double radio){
        this.radio = radio;
    }
    
    public double getRadio (){
        return radio;
    }
    
    public double getPi(){
        return PI;
    }
    
    public double area(){
       return PI*radio*radio;
    }
    
    public double longitud(){
        return 2*PI*radio;
    }
}
