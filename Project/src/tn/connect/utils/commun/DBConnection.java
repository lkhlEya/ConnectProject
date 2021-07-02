package tn.connect.utils.commun;

import java.sql.DriverManager;
import java.sql.Connection;

import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thinkpad
 */
public class DBConnection {

    public static DBConnection instance;

    private String URL = "jdbc:mysql://127.0.0.1:3306/connect";
    private String LOGIN = "root";
    private String PASSWORD = "";
    private Connection cnx;

    private DBConnection() {
        try {
            cnx = DriverManager.getConnection(URL, LOGIN, PASSWORD);
            System.out.println("Connection Established");
        } catch (SQLException ex) {
            System.err.println(ex);
        }

    }

    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    }

    public Connection getCnx() {
        return cnx;
    }
}
