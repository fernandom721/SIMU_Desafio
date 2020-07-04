package com.uca;

import com.uca.controllers.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("views/mainscene.fxml"));
        primaryStage.setTitle("Desafio de Programación");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


        public static void main(String[] args) {
        launch(args);
    }
}
