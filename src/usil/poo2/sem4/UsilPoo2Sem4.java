/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usil.poo2.sem4;

import Fly.FlyRocketPowered;
import clases.Duck;
import clases.MaliarDuck;
import clases.ModelDuck;

/**
 *
 * @author rosales1015
 */
public class UsilPoo2Sem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck maliard = new MaliarDuck();
        maliard.performQuack();
        maliard.performFly();
        
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
        
        
    }
    
}
