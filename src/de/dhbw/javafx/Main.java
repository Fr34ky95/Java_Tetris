package de.dhbw.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

//        public Main2 main2;


    @Override
    public void start(Stage primaryStage) throws Exception {

        //main2 = new Main2();


        Parent root = FXMLLoader.load(getClass().getResource("Screen1_Spiel_Snake.fxml"));
        primaryStage.setTitle("Tetris");
        Scene scene1 = new Scene(root, 200, 200);
        primaryStage.setScene(scene1);
        primaryStage.show();

    }



    public static void main(String[] args) {
        launch(args);
    }
}
