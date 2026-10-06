package com.mycompany.lab07;


import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
    Pane root = new Pane();
    final double X_M = 0, Y_M = 0;
    final double X_N = 800, Y_N = 0;
    final double X_P = 800, Y_P = 600;
    final double X_Q = 0, Y_Q = 600;

    
    Rectangle rect = new Rectangle(750, 525);
    rect.setTranslateX(25);
    rect.setTranslateY(40);
    rect.setStroke(Color.BLACK);
    rect.setFill(Color.TRANSPARENT);
    
    Circle circle = new Circle(rect.getX(), rect.getY(), 20);
    circle.setFill(Color.BLUE);
    
    PathTransition pt = new PathTransition(new Duration(10000), rect, circle);
    pt.setCycleCount(Animation.INDEFINITE);
    pt.setRate(-1);
    pt.play();
    
    root.getChildren().addAll(rect, circle);
    var scene = new Scene(root, 800, 600);
    stage.setScene(scene);
    stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}