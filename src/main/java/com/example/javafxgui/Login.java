package com.example.javafxgui;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login extends Application{
    public void start(Stage window) {
        FlowPane panel = new FlowPane();
        panel.setHgap(10);
        Label label = new Label("User name:");
        TextField username = new TextField();
        username.setPrefColumnCount(25);
        panel.getChildren().add(label);
        panel.getChildren().add(username);
        Scene scene = new Scene(panel, 300, 60);
        window.setScene(scene);
        window.setTitle("Login");
        window.show();
    }

    public static void main(String[] args)  {
        launch(args);
    }
}