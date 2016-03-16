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
import javafx.scene.input.KeyCode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;


public class TetrisController  implements EventHandler<KeyEvent> {

    private Stage thisStage;

    public Label outputLabel;
    public Pane inputLevel;
    public Pane inputPunkte;
    public Pane inputZeilen;
    public Pane nextObject;
    public Pane Layout;
    private GameObject active;


    public GameObject[][] GameObjectArray;
    public final int game_size_X = 300 / GameObject.Object_size;
    public final int game_size_Y = 500 / GameObject.Object_size;

    public GameObject generateObject() {
        int PosX = (int) (Math.random() * (game_size_X));
        int PosY = 0;


        GameObject gameObject = new GameObject(PosX, PosY, 10);
        GameObjectArray[PosX][PosY] = gameObject;
        return gameObject;
    }


    public void generateLayout() {
    }

    public void paint() {
        for (int i = 0; i < game_size_X; i++) {
            for (int j = 0; j < game_size_Y; j++) {
                if (GameObjectArray[i][j] != null) {
                    paintGameObject(GameObjectArray[i][j], i, j);

                }
            }
        }
    }

    public void paintGameObject(GameObject gameObject, int PosX, int PosY) {

        if (Layout.getChildren().contains(gameObject) != true) {
            Layout.getChildren().add(gameObject);
        }
        gameObject.setStroke(Color.ORANGE);
        gameObject.setFill(Color.ORANGE);
        gameObject.setLayoutX(PosX * GameObject.Object_size );
        gameObject.setLayoutY(PosY * GameObject.Object_size);

    }


    public void init(Stage stage) {
        thisStage = stage;
        GameObjectArray = new GameObject[300 / GameObject.Object_size][500 / GameObject.Object_size];
        active = null;
        generateLayout();
        active = generateObject();
        paint();
        loop.setCycleCount(Timeline.INDEFINITE);
        loop.play();


        stage.getScene().setOnKeyPressed(this);
    }

    Timeline loop = new Timeline(new KeyFrame(Duration.millis(200), new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if(active.posY < game_size_Y-1) {
                GameObjectArray[active.posX][active.posY + 1] = GameObjectArray[active.posX][active.posY];
                GameObjectArray[active.posX][active.posY] = null;
                active.posY++;
                paint();
            }
        }
    }));

    @Override
    public void handle(KeyEvent event) {
        KeyCode code = event.getCode();

        switch (code){

            case RIGHT:
                if(active.posX<game_size_X-1) {
                    GameObjectArray[active.posX + 1][active.posY] = GameObjectArray[active.posX][active.posY];
                    GameObjectArray[active.posX][active.posY] = null;
                    active.posX++;
                    paint();
                }
                break;
            case LEFT:
                if(active.posX>0) {
                    GameObjectArray[active.posX - 1][active.posY] = GameObjectArray[active.posX][active.posY];
                    GameObjectArray[active.posX][active.posY] = null;
                    active.posX--;
                    paint();

                }
                break;
        }

    }


  /*  @Override
    public void handle(KeyEvent event) {
        KeyCode code = event.getCode();

        switch (code){
            case RIGHT:
                if (active.getLayoutX() < Layout.getWidth() - GameObject.Object_size) {
                        active.setLayoutX(active.getLayoutX() + 20);
                }
                break;
            case LEFT:
                if(active.getLayoutX()>0) {
                    active.setLayoutX(active.getLayoutX() - 20);
                }
                break;
        }

    }
    */

}
