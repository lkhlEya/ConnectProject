/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.tests;

import User.entities.User;
import User.services.UserService;
import User.utils.MyConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Wissal
 */
public class MainClass {

    public static void main(String[] args) throws SQLException {
    
        MyConnection cnx1= MyConnection.getInstance();
        UserService us= new UserService();
        
     
        
        User u = new User("Wissal","YERMANI");
        User u1 = new User("Eya","LAKHAL");
        User u2 = new User("Ines","DKHILI");
        User u3 = new User("Haifa","JOUINI");
        User u4 = new User("Noussayer","DERBEL");
        User u5 = new User("MedAli","CHATTI");
        
        //us.addUser(u);
        //us.addUser(u1);
        // us.addUser(u2);
        // us.addUser(u3);
        // us.addUser(u4);
        // us.addUser(u5);
        
        //us.deleteUser(12);
       // us.updateUser(u2);
        for(User use :us.showUser()){
        System.out.println(use.toString()+"\n");
        
        }
        
        //System.out.println(us.showUserById(10));
        
           
        
          
                  
                   
            }
          
       
       
        
       
       }
    
    