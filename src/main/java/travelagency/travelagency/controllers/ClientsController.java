package travelagency.travelagency.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ClientsController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField idField;

    @FXML
    private ListView<String> clientsList;

    @FXML
    private void addClient() {
        String name = nameField.getText();
        String id = idField.getText();

        if (!name.isEmpty() && !id.isEmpty()) {
            clientsList.getItems().add(id + " - " + name);
            nameField.clear();
            idField.clear();
        }
    }

    @FXML
    private void removeSelected() {
        int index = clientsList.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            clientsList.getItems().remove(index);
        }
    }

    @FXML
    private void back() {
        System.out.println("Retour au menu");
    }
}
