package travelagency.travelagency.classes;

public abstract class Logement {
    protected int capacite;
    protected int prix;

    protected Logement(int capacite, int prix) {
        this.capacite = capacite;
        this.prix = prix;
    }

    public int getCapacite() {
        return capacite;
    }

    public int getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + capacite + " pers - " + prix + "€";
    }
}
