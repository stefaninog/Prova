/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capture_resize_scene;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
/**asdfasdfas asdfasd asdfasd
 *
 * @author czek
 */
public class Capture_Resize_Scene extends Application {

    @Override
    public void start(Stage primaryStage) {
        Node circ = new Circle(40, 40, 30);
        Parent root = new Group(circ);
        Scene scene = new Scene(root, 400, 300);
        scene.widthProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableVal, Number oldWidth, Number newWidth) {
                System.out.println("Width: " + newWidth);
            }
        });
        scene.heightProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue<? extends Number> observableVal, Number oldHeight, Number newHeight) {
                System.out.println("Height: " + newHeight);
            }
        });
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
