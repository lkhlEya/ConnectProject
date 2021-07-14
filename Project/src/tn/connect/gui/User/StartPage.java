/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Wissal
 */
public class StartPage implements Initializable {

    @FXML
    private Button btnLogIn;
    @FXML
    private Button btnRN;
    @FXML
    private Text tfText1;
    @FXML
    private Text tfText11;
    @FXML
    private ImageView tfLogo;
    @FXML
    private ImageView background;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void AddUser(ActionEvent event) {
    }
    
}
