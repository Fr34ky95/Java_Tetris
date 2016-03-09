package de.dhbw.javafx;

import com.sun.glass.ui.Screen;
import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class Main2 {

    public Button ClickButton;

    public Label outputLabel;
    public Pane inputLevel;
    public Pane inputPunkte;
    public Pane inputZeilen;
    public Pane nextObject;
    public Pane Layout;
    public AnchorPane screen1;

    double game_size_height = Layout.getHeight() / (GameObject.Object_size);
    double game_size_width = Layout.getWidth() / (GameObject.Object_size);

        public MyController myController;

    public void Buttonclicked(ActionEvent actionEvent) {

        myController = new MyController();
        Stage stage = new Stage();
        try {
            stage.setTitle("Tetris");
            Parent root2 = FXMLLoader.load(getClass().getResource("Screen2_Spiel_Snake.fxml"));
            Scene scene = new Scene(root2, 600, 600);
            stage.setScene(scene);
            stage.show();

            ((Stage) outputLabel.getScene().getWindow()).close();
            //paint();
        } catch (IOException e) {


        }
    }





    /*  public void paint(){
        for (int i=0; i<game_size_width;i++)
        {
            for(int j=0; j<game_size_height;j++)
            {
                if(myController.GameObjectArray[i][j] != null)
                {
                    paintGameObject(myController.GameObjectArray[i][j],i,j);
                }
            }
        }
    }


        public void paintGameObject(GameObject gameObject, int PosX, int PosY){
            if(Layout.getChildren().contains(gameObject) != true)
            {
                Layout.getChildren().add(gameObject);
            }
            gameObject.setStroke(Color.ORANGE);
            gameObject.setFill(Color.ORANGE);
            gameObject.setLayoutX(PosX*GameObject.Object_size);
            gameObject.setLayoutY(PosY*GameObject.Object_size);
        }

*/

    }

