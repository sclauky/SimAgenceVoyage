package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ConfirmationController {

    @FXML private Label summaryLabel;
    @FXML private Label totalLabel;

    @FXML
    public void initialize() {

        // ✅ si on arrive ici sans sélection, on renvoie vers Search
        if (AppState.selectedDestination == null || AppState.selectedVol == null || AppState.selectedLogement == null) {
            SceneSwitcher.switchTo("search.fxml");
            return;
        }

        String summary =
                "Merci " + AppState.userName + " ✅\n\n" +
                        "Destination : " + AppState.selectedDestination + "\n" +
                        "Vol : #" + AppState.selectedVol.getIdVol() + " (" + AppState.selectedVol.getPrix() + "€)\n" +
                        "Logement : " + AppState.selectedLogement.getClass().getSimpleName() + " (" + AppState.selectedLogement.getPrix() + "€)";

        summaryLabel.setText(summary);
        totalLabel.setText("Total : " + AppState.getTotal() + "€");
    }

    @FXML
    private void newBooking() {
        AppState.resetSelection();
        SceneSwitcher.switchTo("search.fxml");
    }

    @FXML
    private void home() {
        AppState.resetSelection();
        SceneSwitcher.switchTo("welcome.fxml");
    }
}
