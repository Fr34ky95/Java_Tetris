package de.dhbw.javafx;



/**
 * Created by DEBIEROT on 03.03.2016.
 */
public class MyController {
    public GameObject [][] GameObjectArray;
    public Main2 main2;
    public void MyController ()
    {
        main2 = new Main2();
        GameObjectArray = new GameObject[(int)main2.game_size_width][(int)main2.game_size_height];

        generateObject();

    }



    public void generateObject (){
        int PosX = ((int)Math.random())/GameObject.Object_size;
        int PosY=500/GameObject.Object_size;

        GameObject gameObject= new GameObject(PosX,PosY);
        GameObjectArray [PosX][PosY] = gameObject;


    }

}
