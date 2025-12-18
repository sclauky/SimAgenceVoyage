package travelagency.travelagency;

import javafx.application.Application;
import javafx.stage.Stage;
import travelagency.travelagency.controllers.SceneSwitcher;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) {
        SceneSwitcher.setStage(stage);
        stage.setTitle("Agence de Voyage — GLORY");
        SceneSwitcher.switchTo("welcome.fxml"); // écran de départ
        stage.setMaximized(true);

    }

    public static void main(String[] args) {
        launch(args);
    }
}

