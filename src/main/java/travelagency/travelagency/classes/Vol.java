package travelagency.travelagency.classes;

public class Vol {
    private int IdVol;
    private int Capacite;
    private int prix;

    public Vol(int IdVol, int Capacite, int prix) {
        this.IdVol = IdVol;
        this.Capacite = Capacite;
        this.prix = prix;
    }

    Vol v1 = new Vol(1122, 20, 830);
    Vol v2 = new Vol(3369, 5, 620);
    Vol v3 = new Vol(4471, 200,1254);
}
