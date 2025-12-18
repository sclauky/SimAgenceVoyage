package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    private void login() {
        String email = emailField.getText();
        String pass = passwordField.getText();

        if (email == null || email.isBlank() || pass == null || pass.isBlank()) {
            showError("Remplis l'email et le mot de passe.");
            return;
        }

        // Si aucun compte enregistré, on accepte et on "connecte" quand même (mode démo)
        if (AppState.currentUserEmail == null || AppState.currentUserEmail.isBlank()) {
            AppState.currentUserEmail = email;
            SceneSwitcher.switchTo("search.fxml");
            return;
        }

        // Sinon on vérifie l'email
        if (!email.equalsIgnoreCase(AppState.currentUserEmail)) {
            showError("Email incorrect. Utilise celui du compte créé : " + AppState.currentUserEmail);
            return;
        }

        // Ici tu peux aussi vérifier le mdp si tu le stockes plus tard
        SceneSwitcher.switchTo("search.fxml");
    }

    @FXML
    private void goRegister() {
        SceneSwitcher.switchTo("register.fxml");
    }

    private void showError(String msg) {
        if (errorLabel != null) errorLabel.setText(msg);
    }
}
