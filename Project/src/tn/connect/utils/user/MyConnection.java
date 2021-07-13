/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Wissal
 */
public class MyConnection {
    private static MyConnection instance;
    
    private String urlPilote="com.mysql.jdbc.Driver";
    private String url="jdbc:mysql://localhost:3306/connect";
    private String login="root";
    private String mdp="";
    private Connection cnx;
    
    private MyConnection() {
        try {
            cnx=DriverManager.getConnection("jdbc:mysql://127.0.0.1/connect","root","");
            System.out.println("Connexion établie");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
          
    }
    public static MyConnection getInstance(){
        if (instance==null) {
            instance = new MyConnection();
        }
        return instance;
    }
    public Connection getCnx(){
        return cnx;
    }
     Statement prepareStatement(String requete) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
