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
public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    
    void changeCadence(int newValue){
        cadence = newValue;
    }
    
    void changeGear(int newValue){
        gear = newValue;
    }
    
    void speedUp(int increment){
        speed = speed + increment;    
    }
    
    void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    void printStates(){
        System.out.println("Cadence:"+cadence+" Speed:"+speed+" Gear:"+gear);
    }
}
