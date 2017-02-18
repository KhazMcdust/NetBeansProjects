/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author james
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] anArray;      // declares an array of integers
        int startingValue = 100;
        anArray = new int[10];  //allocates memory for 10 integers
        
        
        for (int i = 0; i < 10; i++){
            anArray[i] = startingValue;
            startingValue = startingValue + 100;
        }
        
        for (int i = 0; i < 10; i++){
            System.out.println("Element at index "+i+":"+anArray[i]);
        }
    }
    
}
