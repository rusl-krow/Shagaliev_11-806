package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SighnUpController  {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField SighnUpName;

    @FXML
    private PasswordField Sighnpassword;

    @FXML
    private Button SighnUpButton;

    @FXML
    private TextField Sighnlogin;

    @FXML
    private TextField SighnUpLastname;

    @FXML
    private TextField SighnUpLocation;

    @FXML
    private TextField SighnUpGroup;

    @FXML
    void initialize() {


        SighnUpButton.setOnAction(event -> {
            sighnUpUser();


        });
    }

    private void sighnUpUser() {
        DatabaseHendler dbhendler = new DatabaseHendler();

        String fistName = SighnUpName.getText();
        String lastName = SighnUpLastname.getText();
        String userName = Sighnlogin.getText();
        String password = Sighnpassword.getText();
        String location = SighnUpLocation.getText();
        String group = SighnUpGroup.getText();

        User user = new User(fistName, lastName,userName,password,location,group);


        dbhendler.signUpUser(user);

    }
}
