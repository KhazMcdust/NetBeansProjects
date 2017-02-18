/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastream;

import java.io.IOException;
import java.io.EOFException;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 *
 * @author james
 */
public class DataStream {

    /**
     * @param args the command line arguments
     */
    
        static final String DATAFILE = "invoicedata";
        static final double[] PRICES = {19.99,21.99,34.99,56.99};
        static final int[] UNITS = {15,10,54,12};
        static final String[] DESCS = {"J","t","v","q"};
    
        public static void main(String[] args) throws IOException{
        // TODO code application logic here
        DataOutputStream out;// = null;
        out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(DATAFILE)));
        
        for (int i = 0; i < UNITS.length; i++){
            out.writeDouble(PRICES[i]);
            out.writeInt(UNITS[i]);
            out.writeUTF(DESCS[i]);
            
        }
        // Have to close the output stream after writing otherwise it does not save.
        out.close();
        
        DataInputStream in;// = null;
        in = new DataInputStream(new BufferedInputStream(new FileInputStream(DATAFILE)));
//        
        double price;
        int unit;
        String desc;
        double total = 0.0;
        
        try{
            while(true){
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                
                System.out.format("You ordered %d units of %s at %f\n", unit, desc, price);
                total += unit * price;
//                
            }
        }catch (EOFException e){
//                    
                    }
        }
        
    
}    

