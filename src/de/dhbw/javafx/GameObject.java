package de.dhbw.javafx;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

/**
 * Created by DEBIEROT on 02.03.2016.
 */
public class GameObject extends Rectangle{
    public static int Object_size= 20;

    public GameObject(int StartX, int StartY) {
        super(0,0,Object_size,Object_size);
    }
}


