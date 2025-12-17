module travelagency.travelagency {
    requires javafx.controls;
    requires javafx.fxml;


    opens travelagency.travelagency to javafx.fxml;
    exports travelagency.travelagency;
}