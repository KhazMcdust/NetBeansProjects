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
public class MountainBike extends Bicycle{
    int airPressure = 30;
    
    void addAir(int newValue){
        airPressure = airPressure + newValue;
    }
    
    void printMountainStates(){
        System.out.println("Air Pressure:"+airPressure);
    }
    
}
