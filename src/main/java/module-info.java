module travelagency.travelagency {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens travelagency.travelagency to javafx.fxml;
    exports travelagency.travelagency;
}