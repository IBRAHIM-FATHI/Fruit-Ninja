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
public class papaya{
                    ImageView imgv6=new ImageView(new Image("javafxapplication18/pictures/papaya.png"));

                   Pane papaya = new Pane();

    papaya(){
               papaya.getChildren().add(imgv6);
Arc a=new Arc(400,700,100,500, 0,90);
    PathTransition tran=new PathTransition();
    tran.setDuration(Duration.millis(10000));
    tran.setNode(papaya);
        tran.setCycleCount(100);
    tran.setPath(a);
    tran.play();
}}
