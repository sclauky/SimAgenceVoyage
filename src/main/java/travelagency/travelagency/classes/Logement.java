package travelagency.travelagency.classes;

public class Logement {
    private int capacite;
    private int prix;

    public Logement(int capacite, int prix) {
    }

    // Les classes filles
    public class Hotel extends Logement {
        public Hotel() {
            super(2, 90);
        }
    }

    public class Auberge extends Logement {
        public Auberge() {
            super(4, 80);
        }
    }

    public class RBNB extends Logement {
        public RBNB(){
            super(6, 130);
        }
    }
;
    public class Jît extends Logement {
        public Jît(int capacite, int prix) {
            super(10, 310);
        }
    }

}
