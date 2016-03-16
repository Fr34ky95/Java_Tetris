package de.dhbw.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by DEBIEROT on 09.03.2016.
 */

public class StartController {

    public Label outputLabel;
    public Button ClickButton;
    public AnchorPane screen1;




    public void Buttonclicked(ActionEvent actionEvent) {



        Stage stage = new Stage();
        try {
            stage.setTitle("Tetris");
            Parent root2 = FXMLLoader.load(getClass().getResource("Screen2_Spiel_Tetris.fxml"));
            Scene scene = new Scene(root2, 600, 600);
            stage.setScene(scene);
            stage.show();
            ((Stage) outputLabel.getScene().getWindow()).close();



        } catch (IOException e) {


        }
    }
}