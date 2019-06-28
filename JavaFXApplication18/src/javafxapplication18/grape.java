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
public class grape {
                        ImageView imgv10=new ImageView(new Image("javafxapplication18/pictures/grape.png"));
                                Pane grape = new Pane();

    grape(){
                grape.getChildren().add(imgv10);
 Arc a=new Arc(350,350,350,350, 0, 180);
    PathTransition tran=new PathTransition();
    tran.setDuration(Duration.millis(20000));
    tran.setNode(grape);
    tran.setPath(a);
        tran.setCycleCount(100);

    tran.play();
    }
}