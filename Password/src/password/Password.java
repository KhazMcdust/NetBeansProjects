/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author james
 */
public class Password {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Console c = System.console();
        
        if (c == null){
            System.err.println("No Console");
            System.exit(1);
        }
        
        String login = c.readLine("Enter your login name: ");
        
        char [] oldPassword = c.readPassword("Enter your old password: ");
        
        if (verify(login, oldPassword)){
            boolean noMatch;
            do{
                char [] newPassword1 = c.readPassword("Enter your new password: ");
                char [] newPassword2 = c.readPassword("Enter your new password again: ");
                
                noMatch = ! Arrays.equals(newPassword1, newPassword2);
                
                if (noMatch){
                    c.format("Passwords do not match try again!");
                    
                }else
                {
                    change(login, newPassword1);
                    c.format("Password for %s changed.%n", login);
                }
            }while (noMatch);
        }
    Arrays.fill(oldPassword, ' ');
    }

    private static boolean verify(String login, char[] oldPassword) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    private static void change(String login, char[] newPassword1) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
    
}
