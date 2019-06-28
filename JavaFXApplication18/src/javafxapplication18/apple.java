/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication18;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Arc;
import javafx.util.Duration;

/**
 *
 * @author osama
 */
public class apple{
   public ImageView imgv2=new ImageView(new Image("javafxapplication18/pictures/apple.png"));
             Pane apple1 = new Pane();

     
   public apple(){
      PathTransition  tran=new PathTransition();
      apple1.getChildren().add(imgv2);
           tran.setNode(apple1);
       Timeline time = new Timeline(new KeyFrame(Duration.millis(100000),e->{
           Arc a=new Arc(200,700,500,100+Math.random()*700, 0,180);
           tran.setPath(a);
            tran.play();
            
       }));  
   time.setCycleCount(Timeline.INDEFINITE);
    time.play();
}

}
