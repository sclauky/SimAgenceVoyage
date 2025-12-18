package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import travelagency.travelagency.classes.Logement;

public class CheckoutController {

    @FXML private Label recapLabel;
    @FXML private ComboBox<Logement> logementBox;

    @FXML
    public void initialize() {
        recapLabel.setText(
                "Destination : " + AppState.selectedDestination + "\n" +
                        "Vol : " + (AppState.selectedVol == null ? "Aucun" : AppState.selectedVol.toString())
        );

        logementBox.getItems().setAll(AppState.logements);
        if (!AppState.logements.isEmpty()) logementBox.getSelectionModel().select(0);
    }

    @FXML
    private void pay() {
        AppState.selectedLogement = logementBox.getSelectionModel().getSelectedItem();
        SceneSwitcher.switchTo("confirmation.fxml");
    }

    @FXML
    private void back() {
        SceneSwitcher.switchTo("results.fxml");
    }
}
