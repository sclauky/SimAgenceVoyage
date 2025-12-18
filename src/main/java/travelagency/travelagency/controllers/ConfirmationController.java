package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConfirmationController {

    @FXML private Label confirmationLabel;

    @FXML
    public void initialize() {
        confirmationLabel.setText(
                "✅ Réservation confirmée !\n\n" +
                        "Client : " + AppState.currentUserEmail + "\n" +
                        "Destination : " + AppState.selectedDestination + "\n" +
                        "Vol : " + AppState.selectedVol + "\n" +
                        "Logement : " + AppState.selectedLogement
        );
    }

    @FXML
    private void backHome() {
        SceneSwitcher.switchTo("search.fxml");
    }
}

