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


public class TetrisController {
    public void init(){}
    public Button ClickButton;

    public Label outputLabel;
    public Pane inputLevel;
    public Pane inputPunkte;
    public Pane inputZeilen;
    public Pane nextObject;
    public Pane Layout;
    public AnchorPane screen1;

    double game_size_height ;
    double game_size_width;



    public void generateObject (){
        int PosX = ((int)Math.random())/GameObject.Object_size;
        int PosY=500/GameObject.Object_size;

        GameObject gameObject= new GameObject(PosX,PosY);
        GameObjectArray [PosX][PosY] = gameObject;


    }


    public GameObject [][] GameObjectArray;



    //GameObjectArray = new GameObject[][]

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

