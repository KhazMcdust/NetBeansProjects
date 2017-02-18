/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copycharacters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author james
 */
public class CopyCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        //First iteration is reading by character
        //Second iteration is reading by line
        //Third iteration is reading using buffered streams
        
        //FileReader inputStream = null;
        BufferedReader inputStream = null;
        //FileWriter outputStream = null;
        //PrintWriter outputStream = null;
        BufferedWriter outputStream = null;
        
        try{
            //inputStream = new FileReader("xanadu.txt");
            inputStream = new BufferedReader(new FileReader("xanadu.txt"));
            
            //outputStream = new FileWriter("output.txt");
            //outputStream = new PrintWriter(new FileWriter("output.txt"));
            outputStream = new BufferedWriter(new FileWriter("output.txt"));
            
            //int c;
            String l;
            
//            while ((c = inputStream.read()) != -1){
//                outputStream.write(c);
//                // System.out.printf("%h\n",c);
//                
//            }
              while ((l = inputStream.readLine()) != null){
                //outputStream.println(l);
                outputStream.write(l);
                outputStream.flush();
                // System.out.printf("%h\n",c);
                
            }
        }finally{
            if (inputStream != null){
                inputStream.close();
                
            }if (outputStream != null){
                outputStream.close();
            }
        }
    }
    
}
