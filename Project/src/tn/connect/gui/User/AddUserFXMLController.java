/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.gui;

import User.entities.User;
import User.services.UserService;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Wissal
 */
public class AddUserFXMLController implements Initializable {

    @FXML
    private TextField tfFirstName;
    @FXML
    private TextField tfLastName;
    @FXML
    private TextField tfEmail;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Button btnSave;
    
    private  UserService us;
    @FXML
    private DatePicker tfdate;
    @FXML
    private RadioButton rbw;
    @FXML
    private RadioButton rbM;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        us = new UserService();
    }    

    @FXML
    private void AddUser(ActionEvent event) {
        
        String FirstName= tfFirstName.getText();
        String LastName= tfLastName.getText();
        String Email= tfEmail.getText();
        String Password= tfPassword.getText();
        
        
        try {
            us.addUser(new User( FirstName, LastName));
            System.out.println("INSERT Done");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
