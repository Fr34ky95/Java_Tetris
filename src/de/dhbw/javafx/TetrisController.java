package de.dhbw.javafx;

import com.sun.glass.ui.Screen;
//import com.sun.java.util.jar.pack.Attribute;
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
    public void initialize(){
      GameObjectArray = new GameObject[300/GameObject.Object_size][500/GameObject.Object_size];

        generateLayout();
        generateObject();
        paint();
    }
    public Button ClickButton;

    public Label outputLabel;
    public Pane inputLevel;
    public Pane inputPunkte;
    public Pane inputZeilen;
    public Pane nextObject;
    public Pane Layout;
    public AnchorPane screen1;



    public GameObject [][] GameObjectArray;
    public final int game_size_X = 300/GameObject.Object_size;
    public final int game_size_Y = 500/GameObject.Object_size;

    public void generateObject (){
        int PosX = (int)(Math.random()*game_size_X);
        int PosY = 0;

        GameObject gameObject= new GameObject(PosX,PosY);
        GameObjectArray [PosX][PosY] = gameObject;
        System.out.println("Object generiert");
    }

    public void generateLayout() {
        //Layout = new Pane();
    }

    public void paint(){
        for (int i=0; i<game_size_X;i++)
        {
            for(int j=0; j<game_size_Y;j++)
            {
                if(GameObjectArray[i][j] != null)
                {
                    paintGameObject(GameObjectArray[i][j],i,j);
                    System.out.println("Object gezeichnet");
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
            System.out.println("Gameobject gezeichnet");
        }

    }

