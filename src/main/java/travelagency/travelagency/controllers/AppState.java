package travelagency.travelagency.controllers;

import travelagency.travelagency.classes.*;
import java.util.List;

public class AppState {

    public static String userName;

    public static List<String> destinations = List.of(
            "Londres", "New York", "Tokyo", "Rome", "Berlin", "Madrid"
    );

    public static List<Vol> vols = List.of(
            new Vol(1122, 20, 830),
            new Vol(3369, 5, 620),
            new Vol(4471, 200, 1254)
    );

    public static List<Logement> logements = List.of(
            new Hotel(),
            new Auberge(),
            new Airbnb(),
            new Gite()
    );

    public static String selectedDestination;
    public static Vol selectedVol;
    public static Logement selectedLogement;

    public static void resetSelection() {
        selectedDestination = null;
        selectedVol = null;
        selectedLogement = null;
    }

    public static int getTotal() {
        int total = 0;
        if (selectedVol != null) total += selectedVol.getPrix();
        if (selectedLogement != null) total += selectedLogement.getPrix();
        return total;
    }
}
