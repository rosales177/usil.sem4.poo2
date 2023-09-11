/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Fly.FlyWithWings;
import Quack.Quack;

/**
 *
 * @author rosales1015
 */
public class RubberDuck extends Duck {
    
    public RubberDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void Display(){
       System.out.println("I'm Rubber Duck");
    }
    
    
    
    
}
