package travelagency.travelagency;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import travelagency.travelagency.controllers.SceneSwitcher;

public class Launcher extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        SceneSwitcher.setStage(stage);

        Scene scene = new Scene(
                FXMLLoader.load(getClass().getResource(
                        "/travelagency/travelagency/login.fxml"
                ))
        );

        stage.setTitle("Agence de Voyage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
