
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class DBCUser {
    
    private static final String FILEPATH ="C:\\Apple Store\\User.txt";
    
    FileWriter file = null;
    BufferedWriter files = null;
    
    public void adduser (NewUser user) throws IOException 
    {
        try{
        PrintWriter out = null;
        String userData =user.getUserID()+","+user.getFullName()+","+user.getAge()+","
                +user.getAddress()+","+user.getEmail()+","+user.getUserType();
       
        out = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH,true)));
        out.println(userData);
        
        out.close();
            JOptionPane.showMessageDialog(null, "User added successfully");
        
        } catch (IOException ex){
        Logger.getLogger(DBCUser.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public NewUser finduser(String userID) throws IOException
    {   NewUser user = null;
        FileInputStream fileinputstream = null;
        try {
           
            FileInputStream fileInputStream = new FileInputStream(FILEPATH);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            String readLine;
            
            while((readLine = bufferedReader.readLine())!=null){
            String[]  detailsuser = readLine.split(",");
              if(userID.equals(detailsuser[0]))
            {
                user = new NewUser();
                user.setUserID(detailsuser[0]);
                user.setFullName(detailsuser[1]);
                user.setAge(Integer.parseInt(detailsuser[2]));
                user.setAddress(detailsuser[3]);
                user.setEmail(detailsuser[4]);
                user.setUserType(detailsuser[5]);
            }
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBCUser.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return user;
    }
}
   

