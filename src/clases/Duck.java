/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Fly.FlyBehavior;
import Quack.QuackBehavior;

/**
 *
 * @author rosales1015
 */
public abstract class Duck {
   
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public Duck(){}
    
    public abstract void Display();
    
    public void performFly(){
        flyBehavior.Fly();
    }
    
    public void performQuack(){
        quackBehavior.Quack();
    }
          
    public String Swim(){
        return "Display";
    } 
}
