package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegisterController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;

    @FXML
    private void register() {
        String email = emailField.getText();
        String pass = passwordField.getText();

        if (email == null || email.isBlank() || pass == null || pass.isBlank()) return;

        AppState.currentUserEmail = email;
        SceneSwitcher.switchTo("search.fxml");
    }

    @FXML
    private void backToLogin() {
        SceneSwitcher.switchTo("login.fxml");
    }
}
