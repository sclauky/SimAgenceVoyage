package travelagency.travelagency.controllers;

import travelagency.travelagency.classes.*;
import java.util.List;

public class AppState {

    // Destinations disponibles
    public static List<String> destinations = List.of(
            "Londres",
            "New York",
            "Tokyo",
            "Rome",
            "Berlin",
            "Madrid"
    );

    // Vols disponibles
    public static List<Vol> vols = List.of(
            new Vol(1122, 20, 830),
            new Vol(3369, 5, 620),
            new Vol(4471, 200, 1254)
    );

    // Logements disponibles
    public static List<Logement> logements = List.of(
            new Hotel(),
            new Auberge(),
            new Airbnb()
    );

    // Sélections utilisateur
    public static String selectedDestination;
    public static Vol selectedVol;
    public static Logement selectedLogement;
    public static Client currentClient;

    // ✅ UTILISATEUR CONNECTÉ
    public static String currentUserEmail;
}
