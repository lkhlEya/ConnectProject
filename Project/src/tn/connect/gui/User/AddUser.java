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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Wissal
 */
public class AddUser implements Initializable {

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
    @FXML
    private Text titleSave;
    @FXML
    private Label tFirstName;
    @FXML
    private Label tLastName;
    @FXML
    private Label tEmail;
    @FXML
    private Label tPassword;
    @FXML
    private Label tDateB;
    @FXML
    private Label tGender;
    @FXML
    private Label tClub;
    @FXML
    private TextField tfFirstName1;
    @FXML
    private PasswordField tfClub;
    @FXML
    private ImageView lgSave;

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
