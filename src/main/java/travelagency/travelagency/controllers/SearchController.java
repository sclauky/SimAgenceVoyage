package travelagency.travelagency.controllers;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import travelagency.travelagency.classes.Logement;
import travelagency.travelagency.classes.Vol;

public class SearchController {

    @FXML private Label welcomeLabel;
    @FXML private ComboBox<String> destinationBox;

    @FXML private ListView<Vol> volsList;
    @FXML private ListView<Logement> logementsList;

    @FXML private Label summaryLabel;
    @FXML private Label totalLabel;
    @FXML private Label errorLabel;

    @FXML
    public void initialize() {

        // Titre en haut
        String name = (AppState.userName == null || AppState.userName.isBlank()) ? "invité" : AppState.userName;
        welcomeLabel.setText("Bienvenue, " + name + " 👋");

        // Destination
        destinationBox.setItems(FXCollections.observableArrayList(AppState.destinations));
        if (!AppState.destinations.isEmpty()) {
            destinationBox.getSelectionModel().selectFirst();
            AppState.selectedDestination = destinationBox.getValue();
        }

        // Vols / logements
        volsList.setItems(FXCollections.observableArrayList(AppState.vols));
        logementsList.setItems(FXCollections.observableArrayList(AppState.logements));

        // Cellules plus lisibles
        volsList.setCellFactory(lv -> new ListCell<>() {
            @Override protected void updateItem(Vol item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) setText(null);
                else setText("Vol #" + item.getIdVol() + " • " + item.getCapacite() + " places • " + item.getPrix() + "€");
            }
        });

        logementsList.setCellFactory(lv -> new ListCell<>() {
            @Override protected void updateItem(Logement item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) setText(null);
                else setText(item.getClass().getSimpleName() + " • " + item.getCapacite() + " pers • " + item.getPrix() + "€");
            }
        });

        // Listeners de sélection
        volsList.getSelectionModel().selectedItemProperty().addListener((obs, oldV, newV) -> {
            AppState.selectedVol = newV;
            refresh();
        });

        logementsList.getSelectionModel().selectedItemProperty().addListener((obs, oldL, newL) -> {
            AppState.selectedLogement = newL;
            refresh();
        });

        destinationBox.valueProperty().addListener((obs, oldD, newD) -> {
            AppState.selectedDestination = newD;
            refresh();
        });

        refresh();
    }

    private void refresh() {
        String dest = (AppState.selectedDestination == null) ? "—" : AppState.selectedDestination;

        String volTxt = (AppState.selectedVol == null)
                ? "aucun vol"
                : ("Vol #" + AppState.selectedVol.getIdVol() + " (" + AppState.selectedVol.getPrix() + "€)");

        String logTxt = (AppState.selectedLogement == null)
                ? "aucun logement"
                : (AppState.selectedLogement.getClass().getSimpleName() + " (" + AppState.selectedLogement.getPrix() + "€)");

        summaryLabel.setText("Destination : " + dest + "\nVol : " + volTxt + "\nLogement : " + logTxt);
        totalLabel.setText("Total : " + AppState.getTotal() + "€");
        errorLabel.setText("");
    }

    @FXML
    private void reset() {
        AppState.resetSelection();
        volsList.getSelectionModel().clearSelection();
        logementsList.getSelectionModel().clearSelection();
        if (!AppState.destinations.isEmpty()) {
            destinationBox.getSelectionModel().selectFirst();
            AppState.selectedDestination = destinationBox.getValue();
        }
        refresh();
    }

    @FXML
    private void goCheckout() {
        if (AppState.selectedDestination == null) {
            errorLabel.setText("Choisis une destination.");
            return;
        }
        if (AppState.selectedVol == null) {
            errorLabel.setText("Choisis un vol.");
            return;
        }
        if (AppState.selectedLogement == null) {
            errorLabel.setText("Choisis un logement.");
            return;
        }
        SceneSwitcher.switchTo("checkout.fxml");
    }

    @FXML
    private void backToWelcome() {
        SceneSwitcher.switchTo("welcome.fxml");
    }
}
