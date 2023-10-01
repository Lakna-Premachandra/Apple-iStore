/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;
import java.io.*;

/**
 *
 * @author PC
 */
public class Cashier {
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


   DBCNewUser fs = new DBCNewUser("Password.txt");
    
    private String Username;
    private String Password;
    private String Role;

    public Cashier(String Username, String Password) {
        this.Username = Username;
        this.Password = Password;
    }

    public Cashier(String Username, String Password, String Role) {
        this.Username = Username;
        this.Password = Password;
        this.Role = Role;
    }
    
    public Cashier() {
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String UserName) {
        this.Username = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }
    
    public boolean addNewUser(){
    if(!fs.createANewFile())
    {
        String record = Username+"/"+Password+"/"+Role;
        return fs.writeDataToFile(record);
    }
    return false;
    }
    
     public boolean validateLogin() 
    {
        try {
            String[] words = null;
            BufferedReader Cashiers = fs.readFile();
            String Cashier;

            while ((Cashier = Cashiers.readLine()) != null) {
                words = Cashier.split("/");
                if (words[0].equals(Username) && words[1].equals(Password) && words[2].equals(Role)) {
                    this.setUsername(words[0]);
                    this.setPassword(words[1]);
                    this.setRole(words[2]);
                    return true;
                }
            }
            
        } 
        catch (Exception e) 
        {
            System.out.println("Something went wrong creating file"+e);
        }

        return false;
    }
}





//    public String viewAllCashiers() 
//     {
//        String Cashiers, allUsers = "";
//        String[] words = null;
//       
//        BufferedReader user = fs.readFile();
//        try {
//            while ((Cashiers = user.readLine()) != null) {
//                words = Cashiers.split("/");
//                
//                allUsers += words[0]+"\t"+words[2]+"\n";
//                
//            }
//        } 
//        
//        catch (Exception e) 
//        {}
//        
//        
//        return allUsers;
//    }
    

