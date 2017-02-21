/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scansum;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author james
 */
public class ScanSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Scanner s = null;
        double sum = 0;
        
        try{
            s = new Scanner(new BufferedReader(new FileReader("usnumbers.txt")));
            s.useLocale(Locale.US);
            
            while(s.hasNext()){
                if(s.hasNextDouble()){
                    double currentValue = s.nextDouble();
                    System.out.printf("%f\n",currentValue);
                    sum += currentValue;
                    
                }
                else
                {
                    s.next();
                }
            }
        }finally{
            s.close();    
            
            
        }
        
        System.out.println(sum);
    }
    
}
