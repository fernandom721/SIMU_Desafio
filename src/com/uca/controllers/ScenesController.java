package com.uca.controllers;

import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.Node;
import javafx.util.Duration;

public class ScenesController implements Initializable {
    /*
    public void closeWindow() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/uca/views/mainscene.fxml"));

            Parent root = loader.load();


            Scene scene = new Scene(root);
            Stage stage = new Stage();

            stage.setScene(scene);
            stage.show();

        }catch (IOException e){
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE,null,e);
        }
    }*/


    @FXML public Button btn_next_modelo;
    @FXML public Button btn_next_dominio;
    @FXML public Button btn_next_cond;
    @FXML public Button btn_next_malla;
    @FXML public Button btn_next_tabla;
    @FXML public Button btn_next_mef1;
    @FXML public Button btn_next_mef2;
    @FXML public Button btn_next_mef3;
    @FXML public Button btn_next_mef4;
    @FXML public Button btn_next_mef5;
    @FXML public Button btn_next_mef5p2;
    @FXML public Button btn_next_mef6;
    @FXML public Button btn_next_mef6p2;
    @FXML public Button btn_next_mef6p3;
    @FXML public Button btn_next_comp1;
    @FXML public Button btn_next_comp2;
    @FXML public Button btn_next_comp3;
    @FXML public Button btn_next_comp4;
    @FXML public Button btn_next_comp5;
    @FXML public Button btn_next_comp6;
    @FXML public Button btn_next_ensm;
    @FXML public Button btn_next_ensm2;
    @FXML public Button btn_next_mef8;
    @FXML public Button btn_next_mef8p2;
    @FXML public Button btn_next_end;


    @FXML
    private void NextScene (javafx.event.ActionEvent event, String nview, Button button) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/com/uca/views/"+ nview + ".fxml"));
            Scene scene = new Scene(root);
            Stage window = (Stage) button.getScene().getWindow();
            window.setScene(scene);
            window.setTitle(nview);
            window.show();

            root.translateXProperty().set(scene.getWidth());
            Timeline timeline = new Timeline();
            KeyValue kv = new KeyValue(root.translateXProperty(),0, Interpolator.EASE_IN);
            KeyFrame kf = new KeyFrame(Duration.seconds(0.5),kv);
            timeline.getKeyFrames().add(kf);
            timeline.play();



        }catch (IOException e){
            Logger.getLogger(ScenesController.class.getName()).log(Level.SEVERE,null,e);
        }
    }

    @FXML
    private void ScenetoModelo(javafx.event.ActionEvent event){
        NextScene(event, "Modelo",btn_next_modelo);
    }

    //del modelo al dominio
    @FXML
    private void ScenetoDominio(javafx.event.ActionEvent event){
        NextScene(event, "Dominio",btn_next_dominio);
    }

    //del dominio a las condiciones de contorno
    @FXML
    private void ScenetoCond(javafx.event.ActionEvent event){ NextScene(event, "CondicionesdeContorno",btn_next_cond); }

    //De las condiciones a la malla
    @FXML
    private void ScenetoMalla(javafx.event.ActionEvent event){
        NextScene(event, "Malla",btn_next_malla);
    }

    //De la malla a la tabla
    @FXML
    private void ScenetoTabla(javafx.event.ActionEvent event){
        NextScene(event, "Tabla",btn_next_tabla);
    }

    // De la tabla al MEF 1
    @FXML
    private void ScenetoMEF1(javafx.event.ActionEvent event){
        NextScene(event, "MEF1",btn_next_mef1);
    }

    // De la MEF 1 al MEF 2
    @FXML
    private void ScenetoMEF2(javafx.event.ActionEvent event){
        NextScene(event, "MEF2",btn_next_mef2);
    }

    // De la MEF 2 al MEF 3
    @FXML
    private void ScenetoMEF3(javafx.event.ActionEvent event){
        NextScene(event, "MEF3",btn_next_mef3);
    }

    //Del MEF 3 al MEF 4
    @FXML
    private void ScenetoMEF4(javafx.event.ActionEvent event){
        NextScene(event, "MEF4",btn_next_mef4);
    }

    //Del MEF 4 al MEF 5
    @FXML
    private void ScenetoMEF5(javafx.event.ActionEvent event){
        NextScene(event, "MEF5",btn_next_mef5);
    }

    //Del MEF 5p1 al MEF 5p2
    @FXML
    private void ScenetoMEF5p2(javafx.event.ActionEvent event){
        NextScene(event, "MEF5_part2",btn_next_mef5p2);
    }

    //Del MEF 5p2 al MEF 6
    @FXML
    private void ScenetoMEF6(javafx.event.ActionEvent event){
        NextScene(event, "MEF6",btn_next_mef6);
    }

    //Del MEF 6 al MEF 6p2
    @FXML
    private void ScenetoMEF6p2(javafx.event.ActionEvent event){
        NextScene(event, "MEF6_parte2",btn_next_mef6p2);
    }

    //Del MEF 6p2 al MEF 6p3
    @FXML
    private void ScenetoMEF6p3(javafx.event.ActionEvent event){
        NextScene(event, "MEF6_parte3",btn_next_mef6p3);
    }

    //Del MEF 6p3 al Componentes 1
    @FXML
    private void ScenetoComp1(javafx.event.ActionEvent event){
        NextScene(event, "Componentes1",btn_next_comp1);
    }

    //Del Componentes 1 al Componentes 2
    @FXML
    private void ScenetoComp2(javafx.event.ActionEvent event){
        NextScene(event, "Componentes2",btn_next_comp2);
    }

    //Del Componentes 2 al Componentes 3
    @FXML
    private void ScenetoComp3(javafx.event.ActionEvent event){
        NextScene(event, "Componentes3",btn_next_comp3);
    }

    //Del Componentes 3 al Componentes 4
    @FXML
    private void ScenetoComp4(javafx.event.ActionEvent event){
        NextScene(event, "Componentes4",btn_next_comp4);
    }

    //Del Componentes 4 al Componentes 5
    @FXML
    private void ScenetoComp5(javafx.event.ActionEvent event){
        NextScene(event, "Componentes5",btn_next_comp5);
    }

    //Del Componentes 5 al Componentes 6
    @FXML
    private void ScenetoComp6(javafx.event.ActionEvent event){
        NextScene(event, "Componentes6",btn_next_comp6);
    }

    //Del Componentes 6 al  Ensamblaje
    @FXML
    private void ScenetoEnsamblaje(javafx.event.ActionEvent event){
        NextScene(event, "Ensamblaje",btn_next_ensm);
    }

    //Del Ensamblaje al Enamblaje 2
    @FXML
    private void ScenetoEnsamblaje2(javafx.event.ActionEvent event){
        NextScene(event, "MEF8",btn_next_ensm2);
    }

    //Del Ensamblaje2 al MEF 8
    @FXML
    private void ScenetoMEF8(javafx.event.ActionEvent event){
        NextScene(event, "MEF8",btn_next_mef8);
    }

    //Del MEF 8 a la MEF 8 p2
    @FXML
    private void ScenetoMEF8p2(javafx.event.ActionEvent event){
        NextScene(event, "MEF8_parte2",btn_next_mef8p2);
    }

    //Del MEF 8p2 a la despedida
    @FXML
    private void ScenetoEND(javafx.event.ActionEvent event){
        NextScene(event, "Despedida",btn_next_end);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
