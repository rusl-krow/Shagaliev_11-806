package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.sun.deploy.util.SyncAccess;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.animations.Shake;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField loginField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button authSighnInButton;

    @FXML
    private Button loginSighnUpButton;

    @FXML
    void initialize() {

        authSighnInButton.setOnAction(event -> {
            String loginText = loginField.getText().trim(); //считываем текст без пробелов в конце
            String loginPassword = passwordField.getText().trim();

            if(!loginText.equals("") && !loginPassword.equals(""))
            {
                try {
                    loginUser(loginText, loginPassword);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            else
                System.out.println("error");
        });

        loginSighnUpButton.setOnAction(event -> {
           openNewScene("/sample/sightUp.fxml");
        });

    }

    private void loginUser(String loginText, String loginPassword) throws SQLException {
    DatabaseHendler dbHandler = new DatabaseHendler();
    User user = new User();
    user.setUserName(loginText);
    user.setPassword(loginPassword);
    dbHandler.getUser(user);
        ResultSet result = dbHandler.getUser(user);

        int counter = 0;
        try {
        while (result.next()) //Позволяет пройти по вмсем пользователям в базе данных
        {
            counter++;
        }}
        catch (SQLException e){
            e.printStackTrace();
        }

        if(counter>=1)
        {
          openNewScene("/sample/app.fxml");
        }
        else
        {
            Shake userLoginAnim = new Shake (loginField);
            Shake userPasswordAnim = new Shake(passwordField);
            userLoginAnim.playAnim();
            userPasswordAnim.playAnim();
        }
    }
    public void openNewScene(String window)
    {
        loginSighnUpButton.getScene().getWindow().hide(); // Закрываем первое окно

        FXMLLoader loader = new FXMLLoader();

        loader.setLocation(getClass().getResource(window));

        try {
            loader.load();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.showAndWait();
    }
}
