package travelagency.travelagency.classes;

public class Vol {

    private int idVol;
    private int capacite;
    private int prix;

    public Vol(int idVol, int capacite, int prix) {
        this.idVol = idVol;
        this.capacite = capacite;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Vol #" + idVol + " • " + capacite + " places • " + prix + " €";
    }
}

