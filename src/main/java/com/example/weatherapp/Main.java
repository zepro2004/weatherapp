package com.example.weatherapp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Weather Forecasting App - Setup Successful");
        Scene scene = new Scene(label, 400, 200);
        primaryStage.setTitle("Weather Forecast");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}