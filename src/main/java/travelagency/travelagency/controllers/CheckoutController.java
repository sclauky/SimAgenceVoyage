package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CheckoutController {

    @FXML private Label recapLabel;
    @FXML private Label totalLabel;
    @FXML private Label errorLabel;

    @FXML
    public void initialize() {
        if (AppState.selectedVol == null || AppState.selectedLogement == null || AppState.selectedDestination == null) {
            SceneSwitcher.switchTo("search.fxml");
            return;
        }

        String recap =
                "Nom : " + AppState.userName + "\n" +
                        "Destination : " + AppState.selectedDestination + "\n" +
                        "Vol : #" + AppState.selectedVol.getIdVol() +
                        " • " + AppState.selectedVol.getCapacite() + " places" +
                        " • " + AppState.selectedVol.getPrix() + "€\n" +
                        "Logement : " + AppState.selectedLogement.getClass().getSimpleName() +
                        " • " + AppState.selectedLogement.getCapacite() + " pers" +
                        " • " + AppState.selectedLogement.getPrix() + "€";

        recapLabel.setText(recap);
        totalLabel.setText(AppState.getTotal() + "€");
        errorLabel.setText("");
    }

    @FXML
    private void back() {
        SceneSwitcher.switchTo("search.fxml");
    }

    @FXML
    private void cancel() {
        // Annuler = revenir à la recherche sans confirmer
        SceneSwitcher.switchTo("search.fxml");
    }

    @FXML
    private void confirm() {
        // sécurité
        if (AppState.selectedVol == null || AppState.selectedLogement == null || AppState.selectedDestination == null) {
            errorLabel.setText("Sélection incomplète. Retour à la recherche.");
            SceneSwitcher.switchTo("search.fxml");
            return;
        }
        SceneSwitcher.switchTo("confirmation.fxml");
    }
}
