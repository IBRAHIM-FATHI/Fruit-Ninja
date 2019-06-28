/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

/**
 *
 * @author osama
 */
public class watermelon{
        Pane watermelon=new Pane();

                ImageView imgv9=new ImageView(new Image("javafxapplication18/pictures/watermelon.png"));
                
    watermelon(){
                           watermelon.getChildren().add(imgv9);

Arc a=new Arc(Math.random()*400,Math.random()*100,Math.random()*500,Math.random()*500, 0,180);
    PathTransition tran=new PathTransition();
    tran.setDuration(Duration.millis(10000));
    tran.setNode(watermelon);
        tran.setCycleCount(100);

    tran.setPath(a);
    tran.play();
}
}