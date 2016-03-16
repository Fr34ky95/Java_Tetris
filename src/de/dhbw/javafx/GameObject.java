package de.dhbw.javafx;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;

/**
 * Created by DEBIEROT on 02.03.2016.
 */
public class GameObject extends Rectangle{
    public static int Object_size= 20;

    private double speed;
    private boolean movesRight = true;

    public GameObject(int StartX, int StartY, double speed ) {
        super(0,0,Object_size,Object_size);
        this.speed = speed;
    }
    public void move() {
        if (movesRight) {
            setLayoutX(getLayoutX() + speed);
        }else {
            setLayoutX(getLayoutX() - speed);

        }
    }


}


