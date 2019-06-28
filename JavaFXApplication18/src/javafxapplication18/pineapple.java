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
public class pineapple{
                   Pane  pineapple= new Pane();

                ImageView imgv7=new ImageView(new Image("javafxapplication18/pictures/pineapple.png"));
    pineapple(){
       
               pineapple.getChildren().add(imgv7);
Arc a=new Arc(Math.random()*600,Math.random()*700,Math.random()*900,Math.random()*500, 0,180);
    PathTransition tran=new PathTransition();
    tran.setDuration(Duration.millis(20000));
    tran.setNode(pineapple);
        tran.setCycleCount(100);

    tran.setPath(a);
    tran.play();
}}
