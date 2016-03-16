package de.dhbw.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application {

public GameObject rectangle;


    @Override
    public void start(Stage primaryStage) throws Exception {



        FXMLLoader loader = new FXMLLoader(getClass().getResource("Screen1_Spiel_Tetris.fxml"));
        loader.load();
        Parent root = loader.getRoot();
        StartController controller = loader.getController();

        controller.stage = primaryStage;


        primaryStage.setTitle("Tetris");
        Scene scene1 = new Scene(root, 200, 200);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }

}
