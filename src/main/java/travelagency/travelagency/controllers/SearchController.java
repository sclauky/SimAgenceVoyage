package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;

public class SearchController {

    @FXML private ComboBox<String> destinationBox;

    @FXML
    public void initialize() {
        destinationBox.getItems().setAll(AppState.destinations);
        if (!AppState.destinations.isEmpty()) destinationBox.getSelectionModel().select(0);
    }

    @FXML
    private void search() {
        AppState.selectedDestination = destinationBox.getSelectionModel().getSelectedItem();
        SceneSwitcher.switchTo("results.fxml");
    }

    @FXML
    private void logout() {
        AppState.currentUserEmail = null;
        SceneSwitcher.switchTo("login.fxml");
    }
}

