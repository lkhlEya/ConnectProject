/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.entities;

import static com.sun.media.jfxmediaimpl.MediaUtils.error;

/**
 *
 * @author Wissal
 */
public class User {
    private int id_user;
    private String name_user;
    private String lastName_user;
    private String Club_user;
    private String login_user;
    private String password_user;
    
    public User () {
    }
  

    public User(int id_user, String name_user, String lastName_user, String Club_user, String login_user, String password_user) {
        this.id_user = id_user;
        this.name_user = name_user;
        this.lastName_user = lastName_user;
        this.Club_user = Club_user;
        this.login_user = login_user;
        this.password_user = password_user;
        
    }
    
    public User( String name_user, String lastName_user) {
      
        this.name_user = name_user;
        this.lastName_user = lastName_user;
    }
    
    
    public User( int id_user, String name_user, String lastName_user) {
        this.id_user = id_user;
        this.name_user = name_user;
        this.lastName_user = lastName_user;
    }

    

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getName_user() {
        return name_user;
    }

    public void setName_user(String name_user) {
        this.name_user = name_user;
    }

    public String getlastName_user() {
        return lastName_user;
    }

    public void setlastName_user(String lastName_user) {
        this.lastName_user = lastName_user;
    }

    public String getClub_user() {
        return Club_user;
    }

    public void setClub_user(String Club_user) {
        this.Club_user = Club_user;
    }

    public String getLogin_user() {
        return login_user;
    }

    public void setLogin_user(String login_user) {
        this.login_user = login_user;
    }

    public String getPassword_user() {
        return password_user;
    }

    public void setPassword_user(String password_user) {
        this.password_user = password_user;
    }
    
    @Override
    public String toString() {
        return "User{" + "id_user=" + id_user + ", name_user=" + name_user + ", lastName_user=" + lastName_user + ", Club_user=" + Club_user + ", login_user=" + login_user + ", password_user=" + password_user + '}';
    }
    }
    

