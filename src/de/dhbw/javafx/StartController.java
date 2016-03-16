package de.dhbw.javafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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

    public Stage stage;


    public void Buttonclicked(ActionEvent actionEvent) {


        Stage stage = new Stage();
        try {
            stage.setTitle("Tetris");
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Screen2_Spiel_Tetris.fxml"));
            loader.load();
            Parent root2 = loader.getRoot();
            Scene scene = new Scene(root2, 600, 600);
            stage.setScene(scene);


            TetrisController controller = loader.getController();
            controller.init(stage);
            stage.show();

            this.stage.close();


        } catch (IOException e) {
            e.printStackTrace();

        }
    }


}