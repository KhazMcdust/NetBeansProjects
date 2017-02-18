/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package copybytes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author james
 */
public class CopyBytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileInputStream in = null;
        FileOutputStream out = null;
        
        try{
            in = new FileInputStream("xanadu.txt");                             // Create a new InputStream Object
            out = new FileOutputStream("outagain.txt");                         // Create a new OutputStream Object
            
            int c;                                                              //Create an integer for the stream to read each byte
            
            while((c = in.read()) != -1){                                       // While the stream has data, keep outputting it.
                System.out.printf("%h\n",c);
                out.write(c);
                
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyBytes.class.getName()).log(Level.SEVERE, null, ex);
            
        }finally {
            
            //Close the byte stream if they were not null, and were opened.
            if (in != null){
                in.close();
            }
            if (out != null){
                out.close();
            }

        }
    }
    
}
