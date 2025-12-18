package travelagency.travelagency.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitcher {

    private static Stage stage;

    public static void setStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchTo(String fxml) {
        try {
            // 1) On sauvegarde l'état actuel de la fenêtre
            boolean wasMax = stage.isMaximized();
            boolean wasFull = stage.isFullScreen();
            double w = stage.getWidth();
            double h = stage.getHeight();

            // 2) On charge le FXML
            Parent root = FXMLLoader.load(SceneSwitcher.class.getResource("/travelagency/travelagency/" + fxml));
            Scene scene = new Scene(root);

            // 3) On applique la nouvelle scène
            stage.setScene(scene);

            // 4) On restaure taille + état
            if (!wasMax && !wasFull) {
                stage.setWidth(w);
                stage.setHeight(h);
            }
            stage.setMaximized(wasMax);
            stage.setFullScreen(wasFull);

            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
