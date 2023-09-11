/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import Fly.FlyNoWay;

/**
 *
 * @author rosales1015
 */
public class ModelDuck extends Duck{
    
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
    }
    
    @Override
    public void Display(){
        System.out.println("I'm a model duck");
    }
    
}
