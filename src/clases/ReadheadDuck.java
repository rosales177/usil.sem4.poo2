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
public class ReadheadDuck extends Duck  {

    public ReadheadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    
    @Override
    public void Display(){
       System.out.println("I'm ReadheadDuck");
    }
    

}
