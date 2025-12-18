package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import travelagency.travelagency.classes.Vol;

public class ResultsController {

    @FXML
    private ListView<Vol> volsList;

    @FXML
    public void initialize() {
        volsList.getItems().setAll(AppState.vols);
    }

    @FXML
    private void selectVol() {
        AppState.selectedVol = volsList.getSelectionModel().getSelectedItem();
        if (AppState.selectedVol == null) return;

        SceneSwitcher.switchTo("checkout.fxml");
    }

    @FXML
    private void back() {
        SceneSwitcher.switchTo("search.fxml");
    }

}


