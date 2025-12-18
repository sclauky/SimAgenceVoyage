package travelagency.travelagency.classes;

import javax.print.attribute.standard.Destination;

public class Client {
    private String Nom;
    private int NombreClient;
    private Voyage voyage;

    public String getNom() {
        return Nom;
    }

    public int getNombreClient() {
        return NombreClient;
    }

    public void setVoyage(Voyage voyage) {
        this.voyage = voyage;
    }

    public Client(String Nom, int NombreClient) {
        this.Nom = Nom;
        this.NombreClient = NombreClient;
        this.voyage = voyage;
    }

    public void setNombreClient(int nombreClient) {
        NombreClient = nombreClient;
    }
}
