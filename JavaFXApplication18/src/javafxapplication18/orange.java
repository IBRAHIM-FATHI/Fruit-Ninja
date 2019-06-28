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
public class orange{
                   Pane orange = new Pane();

        ImageView imgv3=new ImageView(new Image("javafxapplication18/pictures/orange.png"));
    orange(){
               orange.getChildren().add(imgv3);
Arc a=new Arc(Math.random()*400,Math.random()*700,Math.random()*600,Math.random()*500, 0,360);            
    PathTransition tran=new PathTransition();
    tran.setDuration(Duration.millis(20000));
    tran.setNode(orange);
    tran.setPath(a);
        tran.setCycleCount(100);

    tran.play();
}}
