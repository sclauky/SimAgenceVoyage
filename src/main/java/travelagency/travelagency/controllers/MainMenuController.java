package travelagency.travelagency.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

    private void switchTo(String fxml, ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/travelagency/travelagency/" + fxml));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void openVoyages(ActionEvent event) {
        switchTo("voyages.fxml", event);
    }

    @FXML
    private void openClients(ActionEvent event) {
        switchTo("clients.fxml", event);
    }

    @FXML
    private void quit() {
        System.exit(0);
    }
}
