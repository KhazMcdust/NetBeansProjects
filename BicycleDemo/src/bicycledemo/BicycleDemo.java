/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycledemo;

/**
 *
 * @author james
 */
public class BicycleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heren
        
        // Create two different bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike mBike = new MountainBike();
        
        // Invoke methods to these bicycles
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        bike2.changeCadence(39);
        bike2.speedUp(50);
        bike2.changeGear(5);
        bike2.printStates();
        bike2.applyBrakes(19);
        bike2.printStates();
        
        mBike.changeGear(3);
        mBike.printStates();
        mBike.printMountainStates();
        mBike.addAir(5);
        mBike.changeCadence(34);
        mBike.printMountainStates();
        mBike.printStates();
        
    }
    
}
