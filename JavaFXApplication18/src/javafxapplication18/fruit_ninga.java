package javafxapplication18;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
public class fruit_ninga extends Application implements NewInterface1,NewInterface2{
        @Override
        
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        FlowPane root1 = new FlowPane();
        root1.setHgap(10);
        Pane root2 = new Pane();
        text t=new text();
    //////////////////////////////////////////////////////////////   
        a8.imgv9.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+10));
    StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img9 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img9);
        pn.setTranslateX(a8.watermelon.getTranslateX());
        pn.setTranslateY(a8.watermelon.getTranslateY());
root2.getChildren().add(pn);
            a8.watermelon.setVisible(true);

});
        //////////////////////////////////////////////////////////////
 a9.imgv10.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+10));
    StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img10 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img10);
        pn.setTranslateX(a9.grape.getTranslateX());
        pn.setTranslateY(a9.grape.getTranslateY());
root2.getChildren().add(pn);
            a9.grape.setVisible(true);
});
 //////////////////////////////////////////////////////////////
 a5.imgv3.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+20));
StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img3 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img3);
        pn.setTranslateX(a5.orange.getTranslateX());
        pn.setTranslateY(a5.orange.getTranslateY());
root2.getChildren().add(pn);
            a5.orange.setVisible(true);
});
 //////////////////////////////////////////////////////
  
 //////////////////////////////////////////////////////////////
          a2.imgv1.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+10));
StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img1 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img1);
        pn.setTranslateX(a2.banana.getTranslateX());
        pn.setTranslateY(a2.banana.getTranslateY());
root2.getChildren().add(pn);
            a2.banana.setVisible(true);
});
//////////////////////////////////////////////////////////////
 a7.imgv8.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+30));
    StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img8 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img8);
        pn.setTranslateX(a7.strawberry.getTranslateX());
        pn.setTranslateY(a7.strawberry.getTranslateY());
root2.getChildren().add(pn);
            a7.strawberry.setVisible(true);
});
//////////////////////////////////////////////////////////////
a6.imgv6.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+40));
     StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img6 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img6);
        pn.setTranslateX(a6.papaya.getTranslateX());
        pn.setTranslateY(a6.papaya.getTranslateY());
root2.getChildren().add(pn);
            a6.papaya.setVisible(true);
}); 
//////////////////////////////////////////////////////////////
a4.imgv7.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+50));
    StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img7 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img7);
        pn.setTranslateX(a4.pineapple.getTranslateX());
        pn.setTranslateY(a4.pineapple.getTranslateY());
root2.getChildren().add(pn);
            a4.pineapple.setVisible(true);
});
//////////////////////////////////////////////////////////////
a3.imgv4.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+60));
    StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img4 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img4);
        pn.setTranslateX(a3.ic_launcher.getTranslateX());
        pn.setTranslateY(a3.ic_launcher.getTranslateY());
root2.getChildren().add(pn);
            a3.ic_launcher.setVisible(true);
});
//////////////////////////////////////////////////////////////
a1.imgv2.setOnMousePressed((MouseEvent event) -> {
    t.txt1.setText(String.format("%8f", Double.parseDouble(t.txt1.getText())+70));
            StackPane pn=new StackPane();
            FadeTransition fad=new FadeTransition(Duration.millis(1500),img2 );
fad.setFromValue(1);
fad.setToValue(0);
fad.play();
        pn.getChildren().add(img2);
        pn.setTranslateX(a1.apple1.getTranslateX());
        pn.setTranslateY(a1.apple1.getTranslateY());
root2.getChildren().add(pn);
            a1.apple1.setVisible(true);
           img2.setDisable(true);
});
////////////////////////////////////////////////////////////////
Label lbl1=new Label("0");
Label lbl3=new Label("timer:3 minuit");
Label lbl4=new Label("minuit");
Label lbl5=new Label("second");

Label lbl2=new Label("0");
Timeline time1 = new Timeline(new KeyFrame(Duration.seconds(1),e->{
lbl2.setText(String.format("%8f", Double.parseDouble(lbl2.getText())+1));
}));
time1.setCycleCount(300);
time1.play();
Timeline time2 = new Timeline(new KeyFrame(Duration.minutes(1),e->{
lbl1.setText(String.format("%8f", Double.parseDouble(lbl1.getText())+1));
}));
time2.setCycleCount(300);

time2.play();
///////////////////////////////////////////////////////////////
   ImageView nn=new ImageView(new Image("javafxapplication18/pictures/knief.bmp"));
      root2.setOnMousePressed((MouseEvent e)->{
      nn.setTranslateX(e.getSceneX()-120);
      nn.setTranslateY(e.getSceneY()-120);
      });
        root1.getChildren().addAll(t.txt1,lbl3,lbl4,lbl1,lbl5,lbl2);
        root2.getChildren().addAll(nn,a1.apple1,a9.grape,a2.banana,a3.ic_launcher,a4.pineapple,a5.orange,a6.papaya,a7.strawberry,a8.watermelon);
        root.getChildren().addAll(root1,root2);
      
        
        
    Pane panetext = new Pane();
        Text text =new Text();
        text.setLayoutX(400);
        text.setLayoutY(400);
           
            
        text.setStyle(STYLESHEET_MODENA);
        StackPane stack =new StackPane();
        stack.getChildren().addAll(root);
        Scene scene = new Scene(stack, 1000, 600);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("NASA TEAM");
        primaryStage.setScene(scene);
        primaryStage.show();
        text.setFont(Font.font(STYLESHEET_CASPIAN, 60));
            Timeline timer = new Timeline(new KeyFrame(Duration.minutes(3)));
            timer.setOnFinished(e->{
                if(Double.parseDouble(t.txt1.getText())>=100){
                    text.setText("WINNER");}
                else{
                     text.setText("GAME OVER");}

             stack.getChildren().remove(root);
             panetext.getChildren().add(text);
             stack.getChildren().add(panetext);
             
    });
            timer.play();
                    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    }

