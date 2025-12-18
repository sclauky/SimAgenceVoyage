package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WelcomeController {

    @FXML private TextField nameField;
    @FXML private Label errorLabel;

    @FXML
    private void continueAsGuest() {
        String name = nameField.getText() == null ? "" : nameField.getText().trim();

        if (name.isEmpty()) {
            errorLabel.setText("Entre juste un prénom 🙂");
            return;
        }

        AppState.userName = name;
        AppState.resetSelection();
        SceneSwitcher.switchTo("search.fxml");
    }
}
