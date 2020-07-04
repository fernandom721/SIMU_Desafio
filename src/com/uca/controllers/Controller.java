package com.uca.controllers;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;

public class Controller implements Initializable {

    @FXML
    private Button btn_start;


    @FXML
    private void StartMenu (javafx.event.ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/uca/views/Modelo.fxml"));

            Parent root = loader.load();

            ScenesController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

            //stage.setOnCloseRequest(e -> controlador.closeWindow());

            Stage myStage = (Stage) this.btn_start.getScene().getWindow();
            myStage.close();

        }catch (IOException e){
            Logger.getLogger(ScenesController.class.getName()).log(Level.SEVERE,null,e);
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
