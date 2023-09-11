/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Interface.Quackable;

/**
 *
 * @author rosales1015
 */
public class RubberDuck extends Duck implements Quackable{
    
    @Override
    public String Display(){
       return "RubberDuck";
    }
    
    @Override
    public String Quack(){
        return "Quack";
    }
    
    
}
