package travelagency.travelagency.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitcher {

    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchTo(String fxml) {
        try {
            Scene scene = new Scene(
                    FXMLLoader.load(
                            SceneSwitcher.class.getResource(
                                    "/travelagency/travelagency/" + fxml
                            )
                    )
            );
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
