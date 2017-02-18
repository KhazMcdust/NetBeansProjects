/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanxan;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author james
 */
public class ScanXan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Scanner s = null;
        
        try{
            s = new Scanner(new BufferedReader(new FileReader("xanadu.txt")));

            // specify how the scanner sees the delimiter used in the file for instance a comma with whitespace
            s.useDelimiter(", ");               
            while (s.hasNext()){
                System.out.println(s.next());
                
            }
        }
            finally{
                    if (s != null){
                    s.close();
                    }
                }
        }
    
}
