/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.services;

import User.entities.User;
import User.utils.MyConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Wissal
 */
public class UserService {
    
    private Connection cnx;
    
    public UserService (){
        cnx=MyConnection.getInstance().getCnx();
    }
    
    public void addUser(User u) throws SQLException{
        
        String sql = "INSERT INTO user(name_user, lastName_user) VALUES (?,?);";
        PreparedStatement pre= cnx.prepareStatement(sql);
        
        pre.setString(1,u.getName_user());
        pre.setString(2,u.getlastName_user());
        pre.executeUpdate();
        
    }
    
    
    public void updateUser(User u)throws SQLException{
         String sql = "UPDATE INTO user(name_user, lastName_user) VALUES (?,?);";
        PreparedStatement pre= cnx.prepareStatement(sql);
        
        pre.setString(1,u.getName_user());
        pre.setString(2,u.getlastName_user());
        pre.executeUpdate(sql);
        System.out.println("UPDATE Done");
        
    
    }
    
    
    public boolean deleteUser (int id_user)throws SQLException{
         String sql="DELETE  FROM user WHERE id_user =  "+id_user;
         Statement ste= cnx.createStatement();
         ste.executeUpdate(sql);
         System.out.println("DELETE Done ");
        return true;
    }
    
    
    public List <User> showUser() throws SQLException{
        
       List <User> user= new ArrayList<>();
       
        String sql="SELECT * FROM user" ;
               
        Statement ste= cnx.createStatement();
        
        ResultSet rs= ste.executeQuery(sql);
        
        while (rs.next()){
            User u = new User();
            u.setId_user(rs.getInt("id_user"));
            u.setName_user(rs.getString(2));
            u.setlastName_user(rs.getString("lastName_user"));
            user.add(u);
        }
          return user;  
       }
        
    // public user showUser() throws SQLException{
      //  User user ;
     //   String sql="SELECT * FROM user WHERE id_user= " +id_user";
       // Statement ste= cnx.createStatement();
       // ResultSet rs= ste.executeQuery(sql);
       // while (rs.next()){
            //user  = new User();
        //    user.setId_user(rs.getInt("id_user"));
         //   user.setName_user(rs.getString(2));
          //  user.setlastName_user(rs.getString("lastName_user"));

    
            
            
          
       
        //return user;
        
    

}
     
