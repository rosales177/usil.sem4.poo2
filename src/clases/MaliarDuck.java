/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Interface.Flyable;
import Interface.Quackable;

/**
 *
 * @author rosales1015
 */
public class MaliarDuck extends Duck implements Flyable, Quackable {
    
    @Override
    public String Display(){
       return "MaliarDuck";
    }
    
    @Override
    public String Fly(){
        return "Fly";
    }
    
    @Override
    public String Quack(){
        return "Quack";
    }
    
    
}
