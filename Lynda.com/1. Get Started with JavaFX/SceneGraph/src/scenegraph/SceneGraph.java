/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scenegraph;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author jreyr
 */
public class SceneGraph extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        
        StackPane root = new StackPane();
        //add a leaf node
        Circle circle = new Circle(200, 200, 100);
        circle.setFill(Color.CORAL);
        root.getChildren().add(circle);
        root.setBackground
        (
                new Background
                (
                    new BackgroundFill
                    (Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)
                )
        );
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Scene Graph Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
