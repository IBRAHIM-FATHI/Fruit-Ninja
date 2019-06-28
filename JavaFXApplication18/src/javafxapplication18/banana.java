/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import javafx.animation.PathTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

/**
 *
 * @author osama
 */
public class banana{
               ImageView imgv1 =new ImageView(new Image("javafxapplication18/pictures/banana.png"));
               Pane banana = new Pane();

    banana(){
        PathTransition tran;
        banana.getChildren().add(imgv1);
Arc a=new Arc(300,700,300,500, 0,360);
   tran=new PathTransition();
    tran.setDuration(Duration.millis(20000));
    tran.setNode(banana);
        tran.setCycleCount(100);

    tran.setPath(a);
    tran.play();
      
      }
   
    
    }

